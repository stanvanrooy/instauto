package com.facebook.common.dextricks;

import android.content.Context;
import com.facebook.common.dextricks.SuperpackInputDexIterator;
import com.facebook.superpack.ditto.DittoPatch;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p000X.AnonymousClass000;
import p000X.AnonymousClass076;
import p000X.AnonymousClass0YV;

public class DexIteratorFactory {
    public static final String SECONDARY_XZS_FILENAME = "secondary.dex.jar.xzs";
    public static final String XZS_EXTENSION = ".dex.jar.xzs";
    public final ResProvider mResProvider;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    public InputDexIterator openDexIterator(String str, DexManifest dexManifest, AnonymousClass076 r12, Context context) {
        InputStream inputStream;
        String str2;
        DexManifest dexManifest2 = dexManifest;
        AnonymousClass076 r8 = r12;
        if (dexManifest.superpackFiles > 0) {
            return openSuperpackDexIterator(dexManifest, r12, context);
        }
        if (str != null) {
            try {
                if (!DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
                    str2 = str.concat(XZS_EXTENSION);
                    inputStream = this.mResProvider.open(str2);
                    if (inputStream == null) {
                        try {
                            Mlog.safeFmt("using solid xz dex store at %s", str2);
                            synchronized (AnonymousClass0YV.class) {
                            }
                            return new SolidXzInputDexIterator(dexManifest2, (DittoPatch) null, this.mResProvider, inputStream, r8);
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                C0015Fs.safeClose((Closeable) inputStream);
                            }
                            throw th;
                        }
                    } else {
                        Mlog.safeFmt("using discrete file inputs for store, no file at %s", str2);
                        synchronized (AnonymousClass0YV.class) {
                        }
                        return new DiscreteFileInputDexIterator(dexManifest, (DittoPatch) null, this.mResProvider);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                if (inputStream != null) {
                }
                throw th;
            }
        }
        str2 = SECONDARY_XZS_FILENAME;
        try {
            inputStream = this.mResProvider.open(str2);
        } catch (FileNotFoundException unused) {
            inputStream = null;
        }
        if (inputStream == null) {
        }
    }

    private SuperpackInputDexIterator openSuperpackDexIterator(DexManifest dexManifest, AnonymousClass076 r8, Context context) {
        SuperpackInputDexIterator.Builder builder = new SuperpackInputDexIterator.Builder(dexManifest);
        builder.setTracer(r8);
        String archiveExtension = SuperpackInputDexIterator.getArchiveExtension(builder);
        for (int i = 0; i < dexManifest.superpackFiles; i++) {
            builder.addRawArchive(this.mResProvider.open(AnonymousClass000.A06("store-", i, archiveExtension)));
        }
        for (int i2 = 0; i2 < dexManifest.dexes.length; i2++) {
            builder.assignDexToArchive(i2, i2 % dexManifest.superpackFiles);
        }
        synchronized (AnonymousClass0YV.class) {
        }
        return builder.build();
    }

    public DexIteratorFactory(ResProvider resProvider) {
        this.mResProvider = resProvider;
    }
}
