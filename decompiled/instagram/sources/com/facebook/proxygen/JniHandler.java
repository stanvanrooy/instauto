package com.facebook.proxygen;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpUriRequest;

public class JniHandler extends NativeHandleImpl implements HTTPTransportCallback, HTTPResponseHandler {
    public HTTPRequestHandler mRequestHandler;
    public HTTPResponseHandler mResponseHandler;
    public HTTPTransportCallback mTransportCallback;

    private native void cancelNative();

    private native void changePriorityNative(int i);

    private native void closeNative();

    private native boolean sendBodyNative(byte[] bArr, int i, int i2);

    private native boolean sendEOMNative();

    private native boolean sendHeadersNative(HttpUriRequest httpUriRequest);

    private native boolean sendRequestWithBodyAndEOMNative(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2);

    private native void setEnabledCallbackFlagNative(int i);

    public void bodyBytesGenerated(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.bodyBytesGenerated(j);
        }
    }

    public void bodyBytesReceived(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.bodyBytesReceived(j);
        }
    }

    public void cancel() {
        this.mRequestHandler.mDelegate = null;
        cancelNative();
    }

    public void firstByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.firstByteFlushed();
        }
    }

    public void firstHeaderByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.firstHeaderByteFlushed();
        }
    }

    public int getEnabledCallbackFlag() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            return hTTPTransportCallback.getEnabledCallbackFlag();
        }
        return 0;
    }

    public void headerBytesGenerated(long j, long j2) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.headerBytesGenerated(j, j2);
        }
    }

    public void headerBytesReceived(long j, long j2) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.headerBytesReceived(j, j2);
        }
    }

    public void lastByteAcked(long j) {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.lastByteAcked(j);
        }
    }

    public void lastByteFlushed() {
        HTTPTransportCallback hTTPTransportCallback = this.mTransportCallback;
        if (hTTPTransportCallback != null) {
            hTTPTransportCallback.lastByteFlushed();
        }
    }

    public void onBody() {
        this.mResponseHandler.onBody();
    }

    public void onEOM() {
        this.mResponseHandler.onEOM();
        this.mRequestHandler.mDelegate = null;
    }

    public void onError(HTTPRequestError hTTPRequestError) {
        this.mResponseHandler.onError(hTTPRequestError);
        this.mRequestHandler.mDelegate = null;
    }

    public void onResponse(int i, String str, Header[] headerArr) {
        this.mResponseHandler.onResponse(i, str, headerArr);
    }

    public void finalize() {
        try {
            closeNative();
        } finally {
            super.finalize();
        }
    }

    public boolean sendBody(byte[] bArr, int i, int i2) {
        return sendBodyNative(bArr, i, i2);
    }

    public boolean sendEOM() {
        return sendEOMNative();
    }

    public boolean sendHeaders(HttpUriRequest httpUriRequest) {
        return sendHeadersNative(httpUriRequest);
    }

    public boolean sendRequestWithBodyAndEom(HttpUriRequest httpUriRequest, byte[] bArr, int i, int i2) {
        return sendRequestWithBodyAndEOMNative(httpUriRequest, bArr, i, i2);
    }

    public void changePriority(int i) {
        changePriorityNative(i);
    }

    public JniHandler(HTTPRequestHandler hTTPRequestHandler, HTTPResponseHandler hTTPResponseHandler) {
        this(hTTPRequestHandler, hTTPResponseHandler, (HTTPTransportCallback) null);
    }

    public JniHandler(HTTPRequestHandler hTTPRequestHandler, HTTPResponseHandler hTTPResponseHandler, HTTPTransportCallback hTTPTransportCallback) {
        if (hTTPRequestHandler == null || hTTPResponseHandler == null) {
            throw null;
        }
        this.mRequestHandler = hTTPRequestHandler;
        this.mResponseHandler = hTTPResponseHandler;
        this.mTransportCallback = hTTPTransportCallback;
        hTTPRequestHandler.mDelegate = this;
    }
}
