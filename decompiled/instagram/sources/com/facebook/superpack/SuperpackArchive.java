package com.facebook.superpack;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000X.AnonymousClass0Y1;

public class SuperpackArchive implements Iterator, Closeable {
    public long mPtr;

    public static native void appendNative(long j, long j2);

    public static native void closeNative(long j);

    public static native long createNative();

    public static native boolean isEmptyNative(long j);

    public static native long nextNative(long j);

    public static native long readNative(InputStream inputStream, String str);

    public static native void writeNative(long j, OutputStream outputStream);

    public synchronized void close() {
        long j = this.mPtr;
        if (j != 0) {
            closeNative(j);
            this.mPtr = 0;
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean hasNext() {
        boolean isEmptyNative;
        synchronized (this) {
            long j = this.mPtr;
            if (j != 0) {
                isEmptyNative = isEmptyNative(j);
            } else {
                throw new IllegalStateException();
            }
        }
        return !isEmptyNative;
    }

    public void finalize() {
        long j = this.mPtr;
        if (j != 0) {
            closeNative(j);
            this.mPtr = 0;
            throw new IllegalStateException();
        }
    }

    static {
        AnonymousClass0Y1.A08("superpack-jni");
    }

    public SuperpackArchive(long j) {
        if (j != 0) {
            this.mPtr = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public synchronized SuperpackFile next() {
        long nextNative;
        long j = this.mPtr;
        if (j != 0) {
            nextNative = nextNative(j);
            if (nextNative != 0) {
            } else {
                throw new NoSuchElementException();
            }
        } else {
            throw new IllegalStateException();
        }
        return new SuperpackFile(nextNative);
    }
}
