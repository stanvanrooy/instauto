package com.facebook.proxygen.utils;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntityEnclosingRequest;

public class RequestDefragmentingOutputStream extends OutputStream {
    public static final int STREAMING_BUFFER_SIZE = 8096;
    public final byte[] mBuffer;
    public boolean mClosed;
    public OutputStream mFallbackOutputStream;
    public final HandlerInterface mHandlerInterface;
    public int mPosition;
    public final HttpEntityEnclosingRequest mRequest;
    public final int mStreamingBufferSize;

    public interface HandlerInterface {
        boolean sendBody(byte[] bArr, int i, int i2);

        boolean sendEOM();

        boolean sendHeaders(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

        boolean sendRequestWithBodyAndEom(HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i, int i2);
    }

    public synchronized void writeEomIfNecessary() {
        IOException iOException;
        checkStreamIsNotClosed();
        this.mClosed = true;
        OutputStream outputStream = this.mFallbackOutputStream;
        if (outputStream != null) {
            outputStream.flush();
            if (!this.mHandlerInterface.sendEOM()) {
                iOException = new IOException();
            }
        } else if (!this.mHandlerInterface.sendRequestWithBodyAndEom(this.mRequest, this.mBuffer, 0, this.mPosition)) {
            iOException = new IOException();
        }
        throw iOException;
    }

    private boolean canBufferMoreBytes(int i) {
        if (i <= this.mBuffer.length - this.mPosition) {
            return true;
        }
        return false;
    }

    private void checkStreamIsNotClosed() {
        if (this.mClosed) {
            throw new IOException("writeEomIfNecessary was already called on the stream");
        }
    }

    private void fallbackToStreaming(byte[] bArr, int i, int i2) {
        if (this.mHandlerInterface.sendHeaders(this.mRequest)) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FallbackOutputStream(), this.mStreamingBufferSize);
            this.mFallbackOutputStream = bufferedOutputStream;
            bufferedOutputStream.write(this.mBuffer, 0, this.mPosition);
            this.mFallbackOutputStream.write(bArr, i, i2);
            return;
        }
        throw new IOException();
    }

    public RequestDefragmentingOutputStream(HandlerInterface handlerInterface, HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr) {
        this(handlerInterface, httpEntityEnclosingRequest, bArr, STREAMING_BUFFER_SIZE);
    }

    public RequestDefragmentingOutputStream(HandlerInterface handlerInterface, HttpEntityEnclosingRequest httpEntityEnclosingRequest, byte[] bArr, int i) {
        this.mHandlerInterface = handlerInterface;
        this.mRequest = httpEntityEnclosingRequest;
        this.mBuffer = bArr;
        this.mStreamingBufferSize = i;
    }

    public synchronized void write(int i) {
        checkStreamIsNotClosed();
        OutputStream outputStream = this.mFallbackOutputStream;
        if (outputStream != null) {
            outputStream.write(i);
        } else if (!canBufferMoreBytes(1)) {
            fallbackToStreaming(new byte[]{(byte) i}, 0, 1);
        } else {
            byte[] bArr = this.mBuffer;
            int i2 = this.mPosition;
            bArr[i2] = (byte) i;
            this.mPosition = i2 + 1;
        }
    }

    public synchronized void write(byte[] bArr) {
        checkStreamIsNotClosed();
        write(bArr, 0, bArr.length);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        checkStreamIsNotClosed();
        OutputStream outputStream = this.mFallbackOutputStream;
        if (outputStream != null) {
            outputStream.write(bArr, i, i2);
        } else if (!canBufferMoreBytes(i2)) {
            fallbackToStreaming(bArr, i, i2);
        } else {
            System.arraycopy(bArr, i, this.mBuffer, this.mPosition, i2);
            this.mPosition += i2;
        }
    }

    public class FallbackOutputStream extends OutputStream {
        public FallbackOutputStream() {
        }

        public void write(int i) {
            if (!RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(new byte[]{(byte) i}, 0, 1)) {
                throw new IOException();
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            if (!RequestDefragmentingOutputStream.this.mHandlerInterface.sendBody(bArr, i, i2)) {
                throw new IOException();
            }
        }
    }
}
