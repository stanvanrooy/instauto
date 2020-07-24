package com.facebook.audiofiltercore.interfaces;

public interface AudioInput {
    void close();

    int read(short[] sArr, int i);
}
