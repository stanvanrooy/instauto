package com.facebook.profilo.provider.mappings;

import com.facebook.profilo.core.ProvidersRegistry;
import p000X.AnonymousClass0GW;
import p000X.AnonymousClass0Z0;

public final class MemoryMappingsProvider extends AnonymousClass0GW {
    public static final int PROVIDER_MAPPINGS = ProvidersRegistry.A00.A02("memory_mappings");

    public static native void nativeLogMappings();

    public MemoryMappingsProvider() {
        super("profilo_mappings");
    }

    public int getSupportedProviders() {
        return PROVIDER_MAPPINGS;
    }

    public int getTracingProviders() {
        return PROVIDER_MAPPINGS;
    }

    public void disable() {
        int A03 = AnonymousClass0Z0.A03(-885041157);
        nativeLogMappings();
        AnonymousClass0Z0.A0A(2064528385, A03);
    }

    public void enable() {
        AnonymousClass0Z0.A0A(-704850538, AnonymousClass0Z0.A03(-1170798414));
    }
}
