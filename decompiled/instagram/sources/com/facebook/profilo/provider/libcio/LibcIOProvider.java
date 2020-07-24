package com.facebook.profilo.provider.libcio;

import com.facebook.profilo.core.ProvidersRegistry;
import p000X.AnonymousClass0GW;
import p000X.AnonymousClass0Z0;

public final class LibcIOProvider extends AnonymousClass0GW {
    public static final int PROVIDER_LIBC_IO = ProvidersRegistry.A00.A02("libc_io");

    public native void nativeCleanup();

    public native void nativeInitialize();

    public native boolean nativeIsTracingEnabled();

    public LibcIOProvider() {
        super("profilo_libcio");
    }

    public int getSupportedProviders() {
        return PROVIDER_LIBC_IO;
    }

    public void disable() {
        int A03 = AnonymousClass0Z0.A03(-50977711);
        nativeCleanup();
        AnonymousClass0Z0.A0A(-1560096535, A03);
    }

    public void enable() {
        int A03 = AnonymousClass0Z0.A03(1483191554);
        nativeInitialize();
        AnonymousClass0Z0.A0A(25905291, A03);
    }

    public int getTracingProviders() {
        if (nativeIsTracingEnabled()) {
            return PROVIDER_LIBC_IO;
        }
        return 0;
    }
}
