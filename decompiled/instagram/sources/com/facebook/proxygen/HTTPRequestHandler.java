package com.facebook.proxygen;

import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.HttpUriRequest;

public class HTTPRequestHandler {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final int MAX_BUFFER_COUNT = 20;
    public static final int SMALL_REQUESTS_BODY_BUFFER_SIZE = 4096;
    public ArrayList mBodyBuffersPool = new ArrayList(20);
    public JniHandler mDelegate;
    public HandlerInterface mHandlerInterface = new HandlerInterface();
    public boolean mIsCanceled;

    public class HandlerInterface implements RequestDefragmentingOutputStream.HandlerInterface {
        public boolean sendBody(byte[] bArr, int i, int i2) {
            return HTTPRequestHandler.sendBody(HTTPRequestHandler.this, bArr, i, i2);
        }

        public boolean sendEOM() {
            return HTTPRequestHandler.sendEOM(HTTPRequestHandler.this);
        }

        public boolean sendHeaders(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
            return HTTPRequestHandler.this.sendHeaders((HttpUriRequest) httpEntityEnclosingRequest);
        }

        public boolean sendRequestWithBodyAndEom(HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, int i2) {
            return HTTPRequestHandler.this.sendHeadersWithBodyAndEom((HttpUriRequest) httpEntityEnclosingRequest, bArr, i, i2);
        }

        public HandlerInterface() {
        }
    }

    public class AndroidBufferedOutputStream extends BufferedOutputStream {
        public boolean mClosed;

        private void checkNotClosed() {
            if (this.mClosed) {
                throw new IOException("stream already closed");
            }
        }

        public void close() {
            if (!this.mClosed) {
                try {
                    super.close();
                } finally {
                    this.mClosed = true;
                }
            }
        }

        public void flush() {
            checkNotClosed();
            super.flush();
        }

        public AndroidBufferedOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        public void write(int i) {
            checkNotClosed();
            super.write(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            checkNotClosed();
            super.write(bArr, i, i2);
        }
    }

    public class CloseSuppressingOutputStream extends FilterOutputStream {
        public void close() {
        }

        public void reallyClose() {
            this.out.close();
        }

        public CloseSuppressingOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        public void write(int i) {
            this.out.write(i);
        }

        public void write(byte[] bArr) {
            this.out.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.out.write(bArr, i, i2);
        }
    }

    private synchronized byte[] acquireBodyBuffer() {
        byte[] bArr;
        if (this.mBodyBuffersPool.isEmpty()) {
            bArr = new byte[4096];
        } else {
            ArrayList arrayList = this.mBodyBuffersPool;
            bArr = (byte[]) arrayList.remove(arrayList.size() - 1);
        }
        return bArr;
    }

    private synchronized void releaseBodyBuffer(byte[] bArr) {
        if (this.mBodyBuffersPool.size() != 20) {
            this.mBodyBuffersPool.add(bArr);
        }
    }

    public static boolean sendBody(HTTPRequestHandler hTTPRequestHandler, byte[] bArr, int i, int i2) {
        JniHandler jniHandler = hTTPRequestHandler.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendBody(bArr, i, i2);
        }
        return hTTPRequestHandler.mIsCanceled;
    }

    public static boolean sendEOM(HTTPRequestHandler hTTPRequestHandler) {
        JniHandler jniHandler = hTTPRequestHandler.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendEOM();
        }
        return hTTPRequestHandler.mIsCanceled;
    }

    public void cancel() {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            jniHandler.cancel();
            this.mIsCanceled = true;
            this.mDelegate = null;
        }
    }

    public void changePriority(int i) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            jniHandler.changePriority(i);
        }
    }

    public void executeWithDefragmentation(HttpUriRequest httpUriRequest) {
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpUriRequest;
            if (httpEntityEnclosingRequest.getEntity() != null) {
                HttpEntity entity = httpEntityEnclosingRequest.getEntity();
                byte[] acquireBodyBuffer = acquireBodyBuffer();
                try {
                    RequestDefragmentingOutputStream requestDefragmentingOutputStream = new RequestDefragmentingOutputStream(this.mHandlerInterface, httpEntityEnclosingRequest, acquireBodyBuffer);
                    entity.writeTo(requestDefragmentingOutputStream);
                    requestDefragmentingOutputStream.writeEomIfNecessary();
                    return;
                } finally {
                    releaseBodyBuffer(acquireBodyBuffer);
                }
            }
        }
        sendHeadersWithBodyAndEom(httpUriRequest, EMPTY_BYTE_ARRAY, 0, 0);
    }

    public boolean sendHeaders(HttpUriRequest httpUriRequest) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendHeaders(httpUriRequest);
        }
        return this.mIsCanceled;
    }

    public boolean sendHeadersWithBodyAndEom(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2) {
        JniHandler jniHandler = this.mDelegate;
        if (jniHandler != null) {
            return jniHandler.sendRequestWithBodyAndEom(httpUriRequest, bArr, i, i2);
        }
        return this.mIsCanceled;
    }

    public void sendRequestBody(HttpUriRequest httpUriRequest) {
        if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
            try {
                processEntityRequest((HttpEntityEnclosingRequest) httpUriRequest);
            } catch (LigerNetworkException unused) {
            } catch (IOException e) {
                cancel();
                throw e;
            }
        }
    }

    private void processEntityRequest(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity != null) {
            CloseSuppressingOutputStream closeSuppressingOutputStream = new CloseSuppressingOutputStream(new AndroidBufferedOutputStream(new LigerBodyOutputStream()));
            try {
                entity.writeTo(closeSuppressingOutputStream);
                closeSuppressingOutputStream.flush();
            } finally {
                closeSuppressingOutputStream.reallyClose();
            }
        }
    }

    public void setDelegate(JniHandler jniHandler) {
        this.mDelegate = jniHandler;
    }

    public class LigerNetworkException extends IOException {
        public LigerNetworkException() {
        }
    }

    public class LigerBodyOutputStream extends OutputStream {
        public LigerBodyOutputStream() {
        }

        public void write(int i) {
            if (!HTTPRequestHandler.sendBody(HTTPRequestHandler.this, new byte[]{(byte) i}, 0, 1)) {
                throw new LigerNetworkException();
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            if (!HTTPRequestHandler.sendBody(HTTPRequestHandler.this, bArr, i, i2)) {
                throw new LigerNetworkException();
            }
        }
    }
}
