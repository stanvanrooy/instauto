package com.facebook.common.dextricks;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.Closeable;
import java.io.IOException;

public final class SocketLock implements Closeable {
    public final LocalSocketAddress mAddr;
    public LocalSocket mSocket;

    public void release() {
        C0015Fs.safeClose(this.mSocket);
        this.mSocket = null;
    }

    public boolean tryAcquire() {
        LocalSocket localSocket = new LocalSocket();
        try {
            localSocket.bind(this.mAddr);
            this.mSocket = localSocket;
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null || (!message.contains(": EADDRINUSE (") && !message.contains(": errno 98 ("))) {
                throw new RuntimeException(e);
            }
            C0015Fs.safeClose(localSocket);
            return false;
        } catch (Throwable th) {
            C0015Fs.safeClose(localSocket);
            throw th;
        }
    }

    public SocketLock(String str) {
        this.mAddr = new LocalSocketAddress(str);
    }

    public void close() {
        release();
    }
}
