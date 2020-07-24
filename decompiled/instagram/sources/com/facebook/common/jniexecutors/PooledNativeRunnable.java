package com.facebook.common.jniexecutors;

import android.util.Log;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0CS;
import p000X.AnonymousClass0CT;
import p000X.AnonymousClass0KP;
import p000X.AnonymousClass141;
import p000X.C04140Cp;

public class PooledNativeRunnable extends NativeRunnable {
    public static final AnonymousClass0CS sPool;

    public PooledNativeRunnable() {
        super((HybridData) null);
    }

    static {
        Class<PooledNativeRunnable> cls = PooledNativeRunnable.class;
        AnonymousClass0CT r1 = new AnonymousClass0CT(cls, AwakeTimeSinceBootClock.INSTANCE);
        AnonymousClass0KP r9 = new AnonymousClass141(cls);
        r1.A04 = r9;
        C04140Cp r10 = r1.A05;
        if (r10 != null) {
            if (r9 == null) {
                r9 = new AnonymousClass0KP(r1.A06);
            }
            sPool = new AnonymousClass0CS(r1.A06, r1.A02, r1.A01, r1.A00, r1.A03, r9, r10);
            return;
        }
        throw new IllegalArgumentException("Must add a clock to the object pool builder");
    }

    public static PooledNativeRunnable allocate(HybridData hybridData) {
        Object A00;
        AnonymousClass0CS r4 = sPool;
        synchronized (r4) {
            int i = r4.A00;
            if (i > 0) {
                int i2 = i - 1;
                r4.A00 = i2;
                Object[] objArr = r4.A02;
                A00 = objArr[i2];
                objArr[i2] = null;
            } else {
                A00 = r4.A07.A00();
            }
            r4.A07.A01(A00);
        }
        PooledNativeRunnable pooledNativeRunnable = (PooledNativeRunnable) A00;
        pooledNativeRunnable.mHybridData = hybridData;
        return pooledNativeRunnable;
    }

    public void run() {
        try {
            super.run();
        } catch (Exception e) {
            Log.e("PooledNativeRunnable", "run crashed", e);
        }
        AnonymousClass0CS r4 = sPool;
        synchronized (r4) {
            synchronized (r4) {
                long now = r4.A08.now();
                if (r4.A00 < (r4.A03 << 1)) {
                    r4.A01 = now;
                }
                if (now - r4.A01 > r4.A06) {
                    synchronized (r4) {
                        int length = r4.A02.length;
                        int max = Math.max(length - r4.A03, r4.A05);
                        if (max != length) {
                            AnonymousClass0CS.A00(r4, max);
                        }
                    }
                }
            }
            r4.A07.A02(this);
            int i = r4.A00;
            int i2 = r4.A04;
            if (i < i2) {
                int i3 = i + 1;
                int length2 = r4.A02.length;
                if (i3 > length2) {
                    AnonymousClass0CS.A00(r4, Math.min(i2, length2 + r4.A03));
                }
                Object[] objArr = r4.A02;
                int i4 = r4.A00;
                r4.A00 = i4 + 1;
                objArr[i4] = this;
            }
        }
    }
}
