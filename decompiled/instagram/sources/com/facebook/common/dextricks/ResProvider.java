package com.facebook.common.dextricks;

import java.io.Closeable;
import java.io.InputStream;

public abstract class ResProvider implements Closeable {
    public void close() {
    }

    public void markRootRelative() {
    }

    public abstract InputStream open(String str);
}
