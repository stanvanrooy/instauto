package com.facebook.cameracore.ardelivery.compression.tarbrotli;

import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass3Fi;

public class TarBrotliDecompressor implements AnonymousClass3Fi {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native int unarchiveFile(String str, String str2);

    static {
        AnonymousClass0Y1.A08("tar-brotli-archive-native");
    }

    public boolean decompress(String str, String str2) {
        try {
            int unarchiveFile = unarchiveFile(str, str2);
            if (unarchiveFile == 0) {
                return true;
            }
            AnonymousClass0DB.A0L("TarBrotliDecompressor", "Failed to decompress tar brotli, result code=%d", Integer.valueOf(unarchiveFile));
            return false;
        } catch (EffectsFrameworkException | RuntimeException e) {
            AnonymousClass0DB.A0R("TarBrotliDecompressor", e, "%s", e.getMessage());
            return false;
        }
    }
}
