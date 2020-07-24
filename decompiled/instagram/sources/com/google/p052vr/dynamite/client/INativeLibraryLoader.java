package com.google.p052vr.dynamite.client;

import android.os.IInterface;

/* renamed from: com.google.vr.dynamite.client.INativeLibraryLoader */
public interface INativeLibraryLoader extends IInterface {
    int checkVersion(String str);

    long initializeAndLoadNativeLibrary(String str);
}
