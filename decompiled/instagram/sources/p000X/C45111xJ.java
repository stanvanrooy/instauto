package p000X;

import android.os.SystemClock;
import com.facebook.common.classmarkers.ClassMarkerLoader;
import java.util.HashMap;
import java.util.concurrent.Executors;

/* renamed from: X.1xJ  reason: invalid class name and case insensitive filesystem */
public final class C45111xJ extends C12380ge {
    public static final C45301xd A06 = new C45301xd(Executors.newSingleThreadExecutor(), new C30773Djm());
    public long A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final C45231xV A04;
    public final C45291xc A05;

    public final int AGu() {
        return 7;
    }

    public C45111xJ(C45291xc r2, C45231xV r3) {
        super(5000);
        this.A05 = r2;
        this.A04 = r3;
    }

    public final C45121xK A02(int i, int i2) {
        String str;
        if (this.A02 == null || (str = this.A01) == null) {
            return null;
        }
        C45121xK r5 = new C45121xK();
        r5.A02.put("classpreload_list", str);
        r5.A02.put("classpreload_status", this.A02);
        r5.A01.put("classpreload_duration", Long.valueOf(this.A00));
        this.A02 = null;
        this.A00 = 0;
        this.A01 = null;
        return r5;
    }

    public final void A03() {
        C45231xV r2 = this.A04;
        synchronized (r2) {
            HashMap hashMap = new HashMap();
            hashMap.put("optimization_type", "ClassPreload");
            hashMap.put("classpreload_list", r2.A05);
            hashMap.put("classpreload_status", r2.A04);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("classpreload_time", Long.valueOf(r2.A01));
            C45241xW.A01(AnonymousClass0KW.A00(r2.A00), 1, SystemClock.elapsedRealtime() - r2.A02, 0, r2.A03, hashMap2, hashMap);
        }
    }

    public final boolean A04() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.A05 == null) {
            return false;
        }
        C45301xd r5 = A06;
        if (r5.A00.isEnabled()) {
            z = false;
        } else {
            z = r5.A03;
        }
        if (!z || this.A03) {
            return false;
        }
        this.A03 = true;
        C45231xV r2 = this.A04;
        synchronized (r2) {
            r2.A02 = SystemClock.elapsedRealtime();
        }
        C45291xc r3 = this.A05;
        if (r5.A00.isEnabled()) {
            z2 = false;
        } else {
            z2 = r5.A03;
        }
        if (z2 && r3 != null) {
            synchronized (r5.A01) {
                z3 = false;
                if (!r5.A01.add(r3.getClass())) {
                    z3 = true;
                }
            }
            ClassMarkerLoader.loadIsClassPreloadRunMarker();
            if (!z3) {
                AnonymousClass0Z9.A03(r5.A02, new C45311xe(r5, r3, this), 1047894639);
                return true;
            }
        }
        return true;
    }

    public final void A05(String str, long j, String str2) {
        C45231xV r1 = this.A04;
        synchronized (r1) {
            r1.A04 = str;
            r1.A01 = j;
            r1.A05 = str2;
        }
        this.A01 = str2;
        this.A00 = j;
        this.A02 = str;
    }
}
