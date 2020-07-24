package com.facebook.profilo.mmapbuf;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.jni.HybridData;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0HG;
import p000X.AnonymousClass0Y1;

public class MmapBufferManager {
    public AtomicBoolean mAllocated = new AtomicBoolean(false);
    public final long mConfigId;
    public final Context mContext;
    public AtomicBoolean mEnabled = new AtomicBoolean(false);
    public final AnonymousClass0HG mFileHelper;
    public final HybridData mHybridData;
    public volatile String mMmapFileName;

    public static native HybridData initHybrid();

    private native boolean nativeAllocateBuffer(int i, String str, int i2, long j);

    public native void nativeDeallocateBuffer();

    public native void nativeUpdateFilePath(String str);

    public native void nativeUpdateHeader(int i, long j, long j2);

    public native void nativeUpdateId(String str);

    static {
        AnonymousClass0Y1.A08("profilo_mmapbuf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r7 == '.') goto L_0x0047;
     */
    public boolean allocateBuffer(int i) {
        int i2;
        PackageManager packageManager;
        boolean z;
        Object obj;
        if (this.mAllocated.compareAndSet(false, true)) {
            String uuid = UUID.randomUUID().toString();
            int length = uuid.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = uuid.charAt(i3);
                if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == '_'))) {
                    z = false;
                }
                z = true;
                if (z) {
                    obj = Character.valueOf(charAt);
                } else {
                    obj = "_";
                }
                sb.append(obj);
            }
            String A0E = AnonymousClass000.A0E(sb.toString(), ".buff");
            AnonymousClass0HG r1 = this.mFileHelper;
            String str = null;
            if (r1.A00.exists() || r1.A00.mkdirs()) {
                try {
                    str = AnonymousClass000.A0J(r1.A00.getCanonicalPath(), File.separator, A0E);
                } catch (IOException unused) {
                }
            }
            if (str != null) {
                this.mMmapFileName = A0E;
                Context context = this.mContext;
                if (context == null || (packageManager = context.getPackageManager()) == null) {
                    i2 = 0;
                } else {
                    try {
                        i2 = packageManager.getPackageInfo(this.mContext.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException | RuntimeException unused2) {
                        i2 = 0;
                    }
                }
                boolean nativeAllocateBuffer = nativeAllocateBuffer(i, str, i2, this.mConfigId);
                this.mEnabled.set(nativeAllocateBuffer);
                return nativeAllocateBuffer;
            }
        }
        return false;
    }

    public MmapBufferManager(long j, File file, Context context) {
        this.mConfigId = j;
        this.mContext = context;
        this.mFileHelper = new AnonymousClass0HG(file);
        this.mHybridData = initHybrid();
    }
}
