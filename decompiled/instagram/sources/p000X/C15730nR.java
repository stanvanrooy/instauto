package p000X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0nR  reason: invalid class name and case insensitive filesystem */
public final class C15730nR implements AnonymousClass0R7 {
    public static C15730nR A05;
    public int A00 = 1;
    public boolean A01 = false;
    public final Handler A02;
    public final AnonymousClass00B A03;
    public final Map A04 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (p000X.AnonymousClass1CU.A00() != false) goto L_0x0013;
     */
    public void startLoggingImageLoadingSync(String str, String str2, boolean z, long j) {
        boolean z2;
        String str3;
        long j2;
        boolean z3;
        String str4;
        String str5 = str;
        int hashCode = str.hashCode();
        synchronized (this.A04) {
            if (!this.A01) {
                z2 = false;
            }
            z2 = true;
            str3 = str2;
            j2 = j;
            z3 = z;
            if (z2) {
                Map map = this.A04;
                Integer valueOf = Integer.valueOf(hashCode);
                if (!map.containsKey(valueOf)) {
                    boolean z4 = true;
                    if (!AnonymousClass1CU.A00() && (!this.A01 || new Random().nextInt(this.A00) >= 1)) {
                        z4 = false;
                    }
                    this.A04.put(valueOf, Boolean.valueOf(z4));
                    if (z4) {
                        this.A03.markerStart(23396353, hashCode, j2);
                        this.A03.markerAnnotate(23396353, hashCode, "URL", str);
                        this.A03.markerAnnotate(23396353, hashCode, "MODULE", str2);
                        AnonymousClass00B r2 = this.A03;
                        if (z) {
                            str4 = "on-screen";
                        } else {
                            str4 = "off-screen";
                        }
                        r2.markerAnnotate(23396353, hashCode, "IMAGE_PRIORITY", str4);
                    }
                }
            }
        }
        AnonymousClass17R A002 = AnonymousClass17R.A00();
        AnonymousClass1GO r3 = new AnonymousClass1GO(A002, hashCode, str5, "IMAGE", z3, str3, j2);
        if (C05630Li.A03(AnonymousClass1GQ.A00())) {
            C05700Lp.A00().ADc(r3);
        } else {
            AnonymousClass0ZA.A0E(A002.A02, r3, -5758729);
        }
    }

    public static synchronized C15730nR A00() {
        C15730nR r0;
        synchronized (C15730nR.class) {
            if (A05 == null) {
                A05 = new C15730nR();
            }
            r0 = A05;
        }
        return r0;
    }

    public static boolean A02(C15730nR r2, int i) {
        Map map = r2.A04;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !((Boolean) r2.A04.get(valueOf)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final void A03(boolean z, int i) {
        synchronized (this.A04) {
            this.A01 = z;
            this.A00 = i;
            for (Integer intValue : this.A04.keySet()) {
                this.A03.markerDrop(23396353, intValue.intValue());
            }
            this.A04.clear();
            AnonymousClass0ZA.A07(this.A02, (Object) null);
        }
    }

    public final void Alc(String str, int i, int i2, int i3) {
        AnonymousClass0ZA.A0E(this.A02, new C36541iD(this, str, i, i2, i3), -64828603);
    }

    public final void Ald(String str, int i) {
        AnonymousClass0ZA.A0E(this.A02, new C35521gV(this, str, i), 1186593758);
    }

    public final void Ale(String str) {
        A01(str, "DID_FINISH_DECODING");
    }

    public final void Alf(String str) {
        A01(str, "DID_ENTER_DISK_CACHE");
    }

    public final void Alg(String str) {
        A01(str, "DID_ENTER_DISK_QUEUE");
    }

    public final void Alh(String str) {
        A01(str, "DID_ENTER_IMAGE_NETWORK_QUEUE");
    }

    public final void Ali(String str) {
        A01(str, "DID_ENTER_MEMORY_CACHE");
    }

    public final void Alj(String str) {
        A01(str, "DID_ENTER_NETWORK_QUEUE");
    }

    public final void Alk(String str) {
        A01(str, "DID_EXIT_DISK_CACHE");
    }

    public final void All(String str) {
        A01(str, "DID_EXIT_DISK_QUEUE");
        AnonymousClass0ZA.A0E(this.A02, new C35421gL(this, str, this.A03.currentMonotonicTimestamp()), 562637046);
    }

    public final void Alm(String str) {
        A01(str, "DID_EXIT_IMAGE_NETWORK_QUEUE");
    }

    public final void Aln(String str) {
        A01(str, "DID_EXIT_MEMORY_CACHE");
    }

    public final void Alo(String str) {
        A01(str, "DID_EXIT_NETWORK_QUEUE");
    }

    public final void Alp(String str) {
        A01(str, "DID_FINISH_MERGING");
    }

    public final void Alq(String str) {
        A01(str, "DID_FINISH_TRANSFERRING");
    }

    public final void Alr(String str, String str2, String str3) {
        String str4 = str;
        AnonymousClass0ZA.A0E(this.A02, new C36551iE(this, str4, str2, str3, this.A03.currentMonotonicTimestamp()), -2108035859);
    }

    public final void Als(String str, double d, String str2) {
        String str3 = str;
        AnonymousClass0ZA.A0E(this.A02, new C37501jl(this, str3, d, str2, this.A03.currentMonotonicTimestamp()), -2080455046);
    }

    public final void Alt(String str) {
        A01(str, "DID_START_MERGING");
    }

    public final void Alu(String str) {
        A01(str, "DID_START_RECEIVE_IMAGE_DATA");
    }

    public final void Alv(String str) {
        A01(str, "DID_START_DECODING");
    }

    public final void Bpq(String str, String str2, boolean z) {
        String str3 = str;
        AnonymousClass0ZA.A0E(this.A02, new AnonymousClass1GL(this, str3, str2, z, this.A03.currentMonotonicTimestamp()), -944139388);
    }

    public Map getActiveMarkers() {
        return this.A04;
    }

    public C15730nR() {
        AnonymousClass00B r0 = AnonymousClass00B.A01;
        this.A03 = r0;
        r0.A0M(23396353, 1);
        this.A02 = new Handler(C15740nS.A00());
    }

    private void A01(String str, String str2) {
        AnonymousClass0ZA.A0E(this.A02, new C26981Ga(this, str.hashCode(), str2, this.A03.currentMonotonicTimestamp()), 1813473336);
    }

    public static int getQPLId(String str) {
        return str.hashCode();
    }

    public final void AmH(String str) {
        AnonymousClass0ZA.A0E(this.A02, new AnonymousClass7L4(this, str.hashCode()), -1381556988);
    }
}
