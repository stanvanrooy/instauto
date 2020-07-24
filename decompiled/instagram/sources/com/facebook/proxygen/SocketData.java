package com.facebook.proxygen;

public class SocketData {
    public int mBytes;
    public int mPort;
    public long mStreamID;
    public long mTime;

    public int getBytes() {
        return this.mBytes;
    }

    public int getPort() {
        return this.mPort;
    }

    public long getStreamID() {
        return this.mStreamID;
    }

    public long getTime() {
        return this.mTime;
    }

    public SocketData(long j, int i, int i2, long j2) {
        this.mTime = j;
        this.mPort = i;
        this.mBytes = i2;
        this.mStreamID = j2;
    }
}
