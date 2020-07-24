package com.google.p052vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;
import p000X.B7o;
import p000X.C25211B7q;
import p000X.C25212B7r;

/* renamed from: com.google.vr.dynamite.client.DynamiteClient */
public final class DynamiteClient {

    /* renamed from: a */
    public static final ArrayMap f173a = new ArrayMap();

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            C25212B7r b7r = new C25212B7r(str, str2);
            C25211B7q remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(b7r);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.A01(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.A00(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    String valueOf = String.valueOf(b7r);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 72);
                    sb.append("Failed to load native library ");
                    sb.append(valueOf);
                    sb.append(" from remote package: no loader available.");
                    Log.e("DynamiteClient", sb.toString());
                } else {
                    int checkVersion = newNativeLibraryLoader.checkVersion(str3);
                    return checkVersion;
                }
            } catch (B7o | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String valueOf2 = String.valueOf(b7r);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 54);
                sb2.append("Failed to load native library ");
                sb2.append(valueOf2);
                sb2.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb2.toString(), e);
            }
        }
        return -1;
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            ClassLoader classLoader = remoteContext.getClassLoader();
            return classLoader;
        }
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context A00;
        synchronized (DynamiteClient.class) {
            C25212B7r b7r = new C25212B7r(str, str2);
            try {
                A00 = getRemoteLibraryLoaderFromInfo(b7r).A00(context);
            } catch (B7o e) {
                String valueOf = String.valueOf(b7r);
                StringBuilder sb = new StringBuilder(valueOf.length() + 52);
                sb.append("Failed to get remote Context");
                sb.append(valueOf);
                sb.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb.toString(), e);
                return null;
            }
        }
        return A00;
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, (String) null);
            if (remoteContext != null) {
                try {
                    DexClassLoader dexClassLoader = new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
                    return dexClassLoader;
                } catch (RuntimeException e) {
                    Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
                    return null;
                }
            }
        }
    }

    public static synchronized C25211B7q getRemoteLibraryLoaderFromInfo(C25212B7r b7r) {
        C25211B7q b7q;
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = f173a;
            b7q = (C25211B7q) arrayMap.get(b7r);
            if (b7q == null) {
                b7q = new C25211B7q(b7r);
                arrayMap.put(b7r, b7q);
            }
        }
        return b7q;
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            C25212B7r b7r = new C25212B7r(str, str2);
            C25211B7q remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(b7r);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.A01(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.A00(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    String valueOf = String.valueOf(b7r);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 72);
                    sb.append("Failed to load native library ");
                    sb.append(valueOf);
                    sb.append(" from remote package: no loader available.");
                    Log.e("DynamiteClient", sb.toString());
                } else {
                    long initializeAndLoadNativeLibrary = newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
                    return initializeAndLoadNativeLibrary;
                }
            } catch (B7o | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String valueOf2 = String.valueOf(b7r);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 54);
                sb2.append("Failed to load native library ");
                sb2.append(valueOf2);
                sb2.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb2.toString(), e);
            }
        }
        return 0;
    }
}
