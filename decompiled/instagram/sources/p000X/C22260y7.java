package p000X;

import android.content.Context;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0y7  reason: invalid class name and case insensitive filesystem */
public final class C22260y7 extends C22270y8 {
    public C08860Za A00;
    public C08930Zh A01;
    public final Context A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    public final synchronized void A03() {
        int size;
        if (!this.A03.get()) {
            this.A03.set(true);
            this.A00 = new C08860Za(this.A02.getApplicationInfo().dataDir);
            Context context = this.A02;
            this.A01 = new C08930Zh(context, C22440yQ.A00(context), this.A00);
            C030405d.A00(this.A02, AnonymousClass0QD.A00());
            try {
                C08930Zh r3 = this.A01;
                synchronized (r3) {
                    synchronized (r3) {
                        if (!r3.A00) {
                            HashSet<String> hashSet = new HashSet<>();
                            C14610lD A002 = r3.A02.A00("AppModules::Uninstall");
                            C14610lD.A01(A002);
                            synchronized (A002.A02) {
                                size = A002.A04.size();
                            }
                            if (size > 0) {
                                C08960Zk.A00(r3.A01);
                                for (int i = 0; i < 13; i++) {
                                    String A022 = AnonymousClass0ZV.A02(i);
                                    if (A002.A07(A022)) {
                                        hashSet.add(A022);
                                    }
                                }
                            }
                            Set A003 = C08990Zn.A00(r3.A01);
                            hashSet.removeAll(A003);
                            C08930Zh.A00(r3, hashSet, A003);
                            if (!hashSet.isEmpty()) {
                                C22450yR A05 = r3.A02.A00("AppModules::Uninstall").A05();
                                for (String A07 : hashSet) {
                                    A05.A07(A07);
                                }
                                A05.A05();
                            }
                        }
                        r3.A00 = true;
                    }
                }
            } catch (IOException e) {
                throw new IllegalStateException("Failed to initialize", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2 == p000X.Constants.ZERO) goto L_0x0014;
     */
    public final synchronized boolean A05(C22470yU r4) {
        boolean z;
        boolean z2;
        Integer A012 = C08900Ze.A00().A01(r4.A01);
        if (A012 != Constants.A0N) {
            z = false;
        }
        z = true;
        if (z) {
            z2 = false;
        } else {
            C08930Zh r2 = this.A01;
            C08930Zh.A00(r2, Collections.singleton(r4.A01), C08990Zn.A00(r2.A01));
            z2 = true;
        }
        return z2;
    }

    public final boolean A06(C22470yU r4) {
        return C08900Ze.A00().A01(r4.A01) == Constants.A0C;
    }

    public static boolean A00(AnonymousClass0C1 r6, AnonymousClass8GN r7) {
        C194238Tf r5;
        if (!C12670hC.A08()) {
            C194248Tg r2 = (C194248Tg) r6.AVA(C194248Tg.class, new C194328To());
            synchronized (r2) {
                r5 = (C194238Tf) r2.A00.get(Integer.valueOf(r7.A00));
            }
            boolean z = false;
            if (r5 != null) {
                z = true;
            }
            AnonymousClass0a4.A0C(z, "ID not found in task list");
            try {
                r5.A01.A06(r7.A01);
            } catch (InterruptedException e) {
                AnonymousClass0DB.A0B(C22260y7.class, e, "Interrupted while waiting for download", new Object[0]);
            } catch (Throwable th) {
                r5.A00();
                throw th;
            }
            r5.A00();
            if (r5.A01.A07()) {
                return r5.A01(true);
            }
            AnonymousClass00B.A01.markerPoint(r5.A06, r5.A07.A00, "time_out");
            return false;
        }
        throw new IllegalStateException("Waiting on ui thread will cause an ANR");
    }

    public final C238512d A02(AnonymousClass0C1 r4) {
        return (C238512d) r4.AVA(C238412c.class, new C238612e(this.A02, r4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r2.A02 == null) goto L_0x0080;
     */
    public final void A04(AnonymousClass0C1 r11, AnonymousClass8GN r12) {
        C194238Tf r3;
        boolean z;
        List list = r12.A05;
        int size = list.size();
        String[] strArr = new String[size];
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            strArr[i] = ((C22470yU) list.get(i)).A01;
        }
        C238812h r8 = (C238812h) r11.AVA(C238812h.class, new C239012k(this.A02, r11));
        synchronized (this) {
            C194248Tg r2 = (C194248Tg) r11.AVA(C194248Tg.class, new C194328To());
            Context context = this.A02;
            synchronized (r2) {
                r3 = new C194238Tf(r12, context);
                r2.A00.put(Integer.valueOf(r12.A00), r3);
            }
            boolean z2 = false;
            if (r8.A00.A00(((C22470yU) r12.A05.get(0)).A01) == Constants.ONE) {
                z2 = true;
            }
            AnonymousClass00B.A01.markerAnnotate(r3.A06, r3.A07.A00, "built_in", z2);
        }
        AnonymousClass8GN r22 = r3.A07;
        if (AnonymousClass8Gi.A00(r22) == Constants.ZERO) {
            z = true;
        }
        z = false;
        if (z) {
            C194288Tk r5 = new C194288Tk(r3);
            C194238Tf.A09 = r5;
            AnonymousClass0ZA.A09(C194238Tf.A0A, r5, 200, 1067246075);
        }
        C2094790j Apm = r8.Apm(AnonymousClass8Gi.A00(r12));
        for (int i2 = 0; i2 < size; i2++) {
            Apm.A02(strArr[i2]);
        }
        C2094390f A032 = Apm.A03();
        if (r3.A01 == null) {
            r3.A01 = A032;
            A032.A03(new AnonymousClass0OR(C05700Lp.A00(), 141, 3, false, false), new C194308Tm(this, r3));
            if (r12.A03 != null) {
                C05700Lp.A00().ADc(new C194258Th(this, r11, r12));
                return;
            }
            return;
        }
        throw new IllegalStateException("Don't call loadModule multiple times with the same request object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r4.markerEnd(15335444, r5, 3);
        p000X.AnonymousClass0QD.A01("Downloadable Module", p000X.AnonymousClass000.A0E(r2, "%s module loading failed"));
        r0 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final boolean A08(C22470yU r8, boolean z) {
        C239812t A002 = C239812t.A00(this.A02);
        int andIncrement = A002.A03.getAndIncrement();
        AnonymousClass00B r4 = AnonymousClass00B.A01;
        r4.markerStart(15335444, andIncrement);
        r4.markerAnnotate(15335444, andIncrement, "module_name", r8.A01);
        r4.markerAnnotate(15335444, andIncrement, "built_in", z);
        r4.markerAnnotate(15335444, andIncrement, "google", A002.A04);
        String str = r8.A01;
        C09030Zt r1 = A002.A02;
        synchronized (r1) {
            r1.A02(str, true);
        }
        r4.markerEnd(15335444, andIncrement, 2);
        boolean z2 = true;
        if (!z2 || !A07(r8)) {
            return false;
        }
        return true;
    }

    public final boolean A09(AnonymousClass0C1 r3, AnonymousClass8GN r4) {
        boolean z = false;
        if (r4.A03 == null) {
            z = true;
        }
        AnonymousClass0a4.A0C(z, "Don't use this function with a callback");
        return A00(r3, r4);
    }

    public C22260y7(Context context) {
        this.A02 = context.getApplicationContext();
    }

    public final boolean A07(C22470yU r3) {
        return C08900Ze.A00().A05(r3.A01);
    }
}
