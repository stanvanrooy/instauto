package com.facebook.proxygen;

public interface ReadBuffer {
    void close();

    int read(byte[] bArr, int i, int i2);

    int size();
}
