package com.facebook.stash.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

public interface Stash {
    Set AFl();

    InputStream BYw(String str);

    byte[] BZ6(String str);

    OutputStream BuN(String str);

    void BuP(String str, byte[] bArr);

    int getItemCount();

    long getSizeBytes();

    boolean hasKey(String str);

    boolean remove(String str);

    boolean remove(String str, int i);

    boolean removeAll();
}
