package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0qA  reason: invalid class name and case insensitive filesystem */
public final class C17390qA implements C06570Po {
    public static AnonymousClass0IT A0L;
    public static AnonymousClass0IT A0M;
    public static final IntentFilter A0N = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public static final List A0O = new ArrayList();
    public static final List A0P = new ArrayList();
    public static final List A0Q = new ArrayList();
    public boolean A00;
    public final BroadcastReceiver A01 = new C59622hs(this);
    public final Context A02;
    public final Handler A03;
    public final MessageQueue.IdleHandler A04 = new C59632ht(this);
    public final C54682Ym A05;
    public final C59552hl A06;
    public final AnonymousClass0C1 A07;
    public final List A08;
    public final AnonymousClass0IT A09;
    public final AnonymousClass0IT A0A;
    public final AnonymousClass0IT A0B;
    public final AnonymousClass0IT A0C;
    public final C06180Ob A0D;
    public final Runnable A0E = new C59612hr(this);
    public final Runnable A0F = new C59602hq(this);
    public final List A0G;
    public final AtomicInteger A0H = new AtomicInteger();
    public final AnonymousClass0IT A0I;
    public final AnonymousClass0IT A0J;
    public volatile boolean A0K;

    private synchronized void A0A(C17090pf r4, AnonymousClass3LS r5, boolean z) {
        AnonymousClass3LT r2 = new AnonymousClass3LT(r4, z, (AnonymousClass3LS) null, r5);
        if (((Boolean) this.A0A.get()).booleanValue()) {
            this.A03.obtainMessage(1, r2).sendToTarget();
        } else {
            A0B(this, r2, true);
        }
    }

    public final synchronized void A0C(AnonymousClass3JM r5, boolean z) {
        List<C17090pf> list;
        C17090pf r0;
        boolean z2 = false;
        String str = r5.A01;
        if (str != null) {
            if (z) {
                synchronized (this.A06) {
                    try {
                        r0 = this.A06.A02(r5.A01);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } else {
                r0 = this.A06.A02(str);
            }
            if (r0 != null) {
                A09(r0);
                z2 = true;
            }
        } else {
            if (z) {
                synchronized (this.A06) {
                    try {
                        list = this.A06.A04(r5.A02);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } else {
                list = this.A06.A04(r5.A02);
            }
            for (C17090pf A092 : list) {
                A09(A092);
                z2 = true;
            }
        }
        C929440b r02 = r5.A00;
        if (r02 != null) {
            r02.Axe(z2);
        }
    }

    public final synchronized void A0D(C929540c r6, boolean z) {
        C17090pf r4;
        boolean z2;
        if (z) {
            synchronized (this.A06) {
                r4 = this.A06.A02(r6.A01);
            }
        } else {
            r4 = this.A06.A02(r6.A01);
        }
        if (r4 != null) {
            AnonymousClass3LS r3 = new AnonymousClass3LS(AnonymousClass3LR.A00(r4));
            AnonymousClass3LR A002 = AnonymousClass3LR.A00(r4);
            A002.A02 = "queued";
            z2 = A0B(this, new AnonymousClass3LT(r4, false, r3, new AnonymousClass3LS(A002)), z);
        } else {
            z2 = false;
        }
        r6.A00.Axe(z2);
    }

    public final synchronized void A0E(C17090pf r3) {
        A0A(r3, new AnonymousClass3LS(AnonymousClass3LR.A00(r3)), false);
    }

    public final synchronized void A0F(C17090pf r12) {
        boolean z;
        AnonymousClass3LS r4 = new AnonymousClass3LS(AnonymousClass3LR.A00(r12));
        String A012 = r12.A01();
        long currentTimeMillis = System.currentTimeMillis() - r12.A01;
        String str = r4.A02;
        boolean z2 = true;
        if (!this.A05.A00.containsKey(A012)) {
            z = true;
        } else {
            if (currentTimeMillis < this.A05.A00(A012).A00(str)) {
                z2 = false;
            }
            z = z2;
        }
        if (z2) {
            AnonymousClass0C1 r1 = this.A07;
            String str2 = r12.A03;
            C91233xD r3 = new C91233xD(AnonymousClass0QT.A00(r1, (AnonymousClass0RN) null).A02("direct_mutation_drop"));
            r3.A07("total_duration", Long.valueOf(currentTimeMillis));
            r3.A08("lifecycle_state", str);
            r3.A08("mutation_id", str2);
            r3.A08("mutation_type", A012);
            r3.A01();
        }
        if (z) {
            for (C19340tK B1d : this.A08) {
                B1d.B1d(r12);
            }
        } else {
            A0A(r12, r4, true);
        }
    }

    public final synchronized void A0I(String str, C929440b r5) {
        C929540c r2 = new C929540c(str, r5);
        if (((Boolean) this.A0A.get()).booleanValue()) {
            this.A03.obtainMessage(3, r2).sendToTarget();
        } else {
            A0D(r2, true);
        }
    }

    public static synchronized C17390qA A00(AnonymousClass0C1 r25) {
        C17390qA r5;
        Looper A032;
        Class<C17390qA> cls = C17390qA.class;
        synchronized (cls) {
            AnonymousClass0C1 r7 = r25;
            r5 = (C17390qA) r7.AV9(cls);
            if (r5 == null) {
                Context context = StoredPreferences.A00;
                C54682Ym r10 = new C54682Ym(r7, A0Q);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C59452hb(r10));
                for (C05110Id AF7 : A0O) {
                    arrayList.add(AF7.AF7(r7));
                }
                ArrayList arrayList2 = new ArrayList();
                for (C05110Id AF72 : A0P) {
                    arrayList2.add(AF72.AF7(r7));
                }
                if (((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.DIRECT_INBOX_CACHE, "use_independent_thread_for_mutation", false, (AnonymousClass04H) null)).booleanValue()) {
                    HandlerThread handlerThread = new HandlerThread("direct-mutation-manager");
                    handlerThread.start();
                    A032 = handlerThread.getLooper();
                } else {
                    A032 = C66082ut.A01(r7).A03();
                    if (A032 == null) {
                        AnonymousClass0QD.A03("DirectMutationManager_null_looper", AnonymousClass000.A0S("Looper was null: UserSession.hasEnded=", r7.Abj()), 1);
                        HandlerThread handlerThread2 = new HandlerThread("direct-mutation-manager-fallback");
                        handlerThread2.start();
                        A032 = handlerThread2.getLooper();
                    }
                }
                C06180Ob r8 = C06190Oc.A00;
                C59552hl r11 = new C59552hl(new C59572hn(), r8, C19290tE.A00(r7), r10);
                C59582ho r12 = new C59582ho(r7);
                AnonymousClass0IT r15 = A0L;
                AnonymousClass0IT r16 = A0M;
                C59592hp r3 = new C59592hp(context);
                AnonymousClass0L7 r19 = AnonymousClass0L7.DIRECT_INBOX_CACHE;
                r5 = new C17390qA(context, r7, r8, A032, r10, r11, r12, arrayList2, arrayList, r15, r16, r3, AnonymousClass0L5.A00(new C05000Hl("fix_dispatch_from_disk", r19, (Object) null, (String[]) null, (AnonymousClass04H) null), r7), AnonymousClass0L5.A00(new C05000Hl("dispatch_to_handler", r19, (Object) null, (String[]) null, (AnonymousClass04H) null), r7));
                r7.BYi(cls, r5);
                r5.init();
            }
        }
        return r5;
    }

    public static synchronized void A01(C17220ps r4) {
        synchronized (C17390qA.class) {
            C17400qB.A00.A03(r4.A02, r4.A00);
            A0Q.add(r4);
        }
    }

    public static void A02(C17390qA r14) {
        C17090pf r4;
        C17090pf r8;
        while (r14.A0K) {
            r14.A0K = false;
            ((C65882uZ) r14.A0C.get()).Aow();
            while (true) {
                synchronized (r14.A06) {
                    try {
                        C59552hl r7 = r14.A06;
                        r4 = null;
                        for (LinkedHashMap values : r7.A00.values()) {
                            Iterator it = values.values().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    r8 = (C17090pf) it.next();
                                    String str = r8.A04;
                                    char c = 65535;
                                    switch (str.hashCode()) {
                                        case -1090974990:
                                            if (str.equals("executing")) {
                                                c = 1;
                                                break;
                                            }
                                            break;
                                        case -948696717:
                                            if (str.equals("queued")) {
                                                c = 0;
                                                break;
                                            }
                                            break;
                                        case 1501196714:
                                            if (str.equals("upload_failed_permanent")) {
                                                c = 3;
                                                break;
                                            }
                                            break;
                                        case 1563991648:
                                            if (str.equals("uploaded")) {
                                                c = 4;
                                                break;
                                            }
                                            break;
                                        case 1885454214:
                                            if (str.equals("upload_failed_transient")) {
                                                c = 2;
                                                break;
                                            }
                                            break;
                                    }
                                    if (c == 0) {
                                        if (SystemClock.uptimeMillis() >= r7.getCurrentEligibleTimeMillis(r8)) {
                                        }
                                    } else if (c != 1) {
                                        if (!(c == 2 || c == 3 || c == 4)) {
                                            AnonymousClass0QD.A04("DirectMutationStore_getNextPendingMutationFromQueue", AnonymousClass000.A0E("Unsupported lifecycle state: ", str), 1);
                                        }
                                    }
                                }
                            }
                            r8 = null;
                            if (r4 == null || (r8 != null && r8.A01 < r4.A01)) {
                                r4 = r8;
                            }
                        }
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                    }
                }
                if (r4 != null) {
                    if (((Boolean) r14.A0A.get()).booleanValue()) {
                        r14.A06.A05(r4, "executing");
                        r14.A0H.incrementAndGet();
                    } else {
                        synchronized (r14.A06) {
                            try {
                                r14.A06.A05(r4, "executing");
                                r14.A0H.incrementAndGet();
                            } catch (Throwable th2) {
                                while (true) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    C06270Ok A002 = C06270Ok.A00();
                    ((C19490tZ) r14.A05.A01(r4.A01()).A04.get()).BfK(r4, A002, new AnonymousClass3JZ(r14, r4));
                    for (C19340tK r2 : r14.A08) {
                        boolean z = false;
                        if (r4.A00 > 0) {
                            z = true;
                        }
                        r2.BCM(r4, z, A002);
                    }
                } else if (r14.A0H.get() == 0) {
                    if (((Boolean) r14.A0A.get()).booleanValue()) {
                        A03(r14);
                    } else {
                        C12670hC.A04(r14.A0E);
                    }
                }
            }
        }
        return;
        throw th;
    }

    public static void A03(C17390qA r3) {
        for (C240813f A012 : r3.A0G) {
            C240813f.A01(A012, new C241013h(new C240913g("stop")));
        }
    }

    public static void A04(C17390qA r1, long j) {
        r1.A0H.decrementAndGet();
        A05(r1, j, "onMutationSent");
    }

    public static void A05(C17390qA r5, long j, String str) {
        if (!((Boolean) r5.A09.get()).booleanValue() || ((Boolean) r5.A0B.get()).booleanValue()) {
            r5.A0K = true;
            Long valueOf = Long.valueOf(j);
            for (C240813f A012 : r5.A0G) {
                C240913g r1 = new C240913g("schedule");
                r1.A04 = valueOf;
                r1.A08 = str;
                C240813f.A01(A012, new C241013h(r1));
            }
            Handler handler = r5.A03;
            AnonymousClass0ZA.A06(handler, handler.obtainMessage(5), j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        if ("upload_failed_permanent".equals(r2) != false) goto L_0x00a8;
     */
    public static void A06(C17390qA r15, C73283Jg r16, boolean z) {
        boolean z2;
        AnonymousClass3LS r12;
        long j;
        boolean z3;
        String str;
        boolean z4;
        C73283Jg r0 = r16;
        C17090pf r8 = r0.A01;
        AnonymousClass4R2 r10 = r0.A02;
        C06270Ok r9 = r0.A00;
        String A012 = r8.A01();
        int i = r8.A00;
        long currentTimeMillis = System.currentTimeMillis() - r8.A01;
        AnonymousClass3LS r11 = new AnonymousClass3LS(AnonymousClass3LR.A00(r8));
        long A002 = r15.A05.A00(A012).A00(r11.A02);
        long intValue = (long) ((Integer) r15.A05.A01(A012).A03.get()).intValue();
        if (!((Boolean) r15.A0J.get()).booleanValue() || currentTimeMillis >= A002 || !r10.A05 || (intValue != -1 && ((long) i) >= intValue)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            AnonymousClass3LR A003 = AnonymousClass3LR.A00(r8);
            A003.A02 = "queued";
            r12 = new AnonymousClass3LS(A003);
            if (z) {
                synchronized (r15.A06) {
                    try {
                        z3 = r15.A06.A05(r8, r12.A02);
                        j = r15.A06.A01(r8);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } else {
                z3 = r15.A06.A05(r8, r12.A02);
                j = r15.A06.A01(r8);
            }
        } else {
            if (r10.A06) {
                str = "upload_failed_transient";
            } else {
                str = "upload_failed_permanent";
            }
            AnonymousClass3LR A004 = AnonymousClass3LR.A00(r8);
            if (!"upload_failed_transient".equals(str)) {
                z4 = false;
            }
            z4 = true;
            AnonymousClass0a4.A0B(z4, AnonymousClass000.A0E("Invalid failure LifecycleState: ", str));
            A004.A02 = str;
            A004.A01 = r10;
            r12 = new AnonymousClass3LS(A004);
            if (z) {
                synchronized (r15.A06) {
                    try {
                        z3 = r15.A06.A05(r8, str);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } else {
                z3 = r15.A06.A05(r8, str);
            }
            j = 0;
        }
        if (z3) {
            Integer valueOf = Integer.valueOf(i);
            for (C19340tK BCN : r15.A08) {
                BCN.BCN(r8, z2, r10, r9);
            }
            C73743Ld.A00(r15.A05, r8, r11, r12);
            if (!z2 && ((long) i) >= intValue) {
                AnonymousClass0C1 r5 = r15.A07;
                AnonymousClass0P4 A005 = AnonymousClass0P4.A00("direct_mutation_send_retry_failure", (AnonymousClass0RN) null);
                AnonymousClass3LX.A09(A005, r10);
                A005.A0G("send_type", "mutation");
                A005.A0G("mutation_type", A012);
                A005.A0E(TraceFieldType.RetryCount, valueOf);
                AnonymousClass0WN.A01(r5).BcG(A005);
            }
            if (((Boolean) r15.A0A.get()).booleanValue()) {
                A04(r15, j);
            } else {
                C12670hC.A04(new C943946g(r15, j));
            }
        }
    }

    public static void A07(C17390qA r6, C73283Jg r7, boolean z) {
        boolean z2;
        C17090pf r3 = r7.A01;
        C06270Ok r5 = r7.A00;
        AnonymousClass3LS r4 = new AnonymousClass3LS(AnonymousClass3LR.A00(r3));
        if (z) {
            synchronized (r6.A06) {
                try {
                    C59552hl r0 = r6.A06;
                    z2 = r0.A02.containsKey(r3.A03);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } else {
            C59552hl r02 = r6.A06;
            z2 = r02.A02.containsKey(r3.A03);
        }
        if (z2) {
            if (z) {
                synchronized (r6.A06) {
                    try {
                        r6.A06.A05(r3, "uploaded");
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } else {
                r6.A06.A05(r3, "uploaded");
            }
            for (C19340tK BCR : r6.A08) {
                BCR.BCR(r3, r5);
            }
            C73743Ld.A00(r6.A05, r3, r4, new AnonymousClass3LS(AnonymousClass3LR.A00(r3)));
            if (((Boolean) r6.A0A.get()).booleanValue()) {
                A04(r6, 0);
            } else {
                C12670hC.A04(new AnonymousClass3LF(r6));
            }
        }
    }

    public static void A08(C17390qA r5, String str, boolean z) {
        C17090pf r4;
        if (z) {
            synchronized (r5.A06) {
                r4 = r5.A06.A02(str);
            }
        } else {
            r4 = r5.A06.A02(str);
        }
        if (r4 != null) {
            AnonymousClass3LS r3 = new AnonymousClass3LS(AnonymousClass3LR.A00(r4));
            if (!r3.A02.equals("uploaded")) {
                C17090pf.A00(r4, "uploaded");
                for (C19340tK Axy : r5.A08) {
                    Axy.Axy(r4);
                }
                C73743Ld.A00(r5.A05, r4, r3, new AnonymousClass3LS(AnonymousClass3LR.A00(r4)));
                if (((Boolean) r5.A0A.get()).booleanValue()) {
                    A04(r5, 0);
                } else {
                    C12670hC.A04(new C943846f(r5));
                }
            }
        }
    }

    private void A09(C17090pf r4) {
        C19560tg r0;
        for (C19340tK Auc : this.A08) {
            Auc.Auc(r4);
        }
        C54682Ym r2 = this.A05;
        AnonymousClass3LS r1 = new AnonymousClass3LS(AnonymousClass3LR.A00(r4));
        C92803zk r02 = r2.A01(r4.A01()).A06;
        if (r02 != null) {
            r0 = (C19560tg) r02.get();
        } else {
            r0 = null;
        }
        if (r0 != null) {
            r0.BCP(r4, r1);
        }
    }

    public static boolean A0B(C17390qA r9, AnonymousClass3LT r10, boolean z) {
        String str;
        C19560tg r0;
        C17090pf r4 = r10.A02;
        boolean z2 = r10.A03;
        AnonymousClass3LS r7 = r10.A01;
        AnonymousClass3LS r5 = r10.A00;
        boolean z3 = true;
        boolean z4 = false;
        if (r7 != null) {
            z4 = true;
        }
        boolean AiL = ((C19490tZ) r9.A05.A01(r4.A01()).A04.get()).AiL(r4);
        if (AiL) {
            if (z2 && ((Boolean) r9.A0I.get()).booleanValue()) {
                z3 = false;
            }
            if (z) {
                synchronized (r9.A06) {
                    str = r9.A06.A03(r4, r5, z3);
                }
            } else {
                str = r9.A06.A03(r4, r5, z3);
            }
        } else {
            str = null;
        }
        if (!z4) {
            for (C19340tK B0J : r9.A08) {
                B0J.B0J(r4, AiL, str);
            }
            if (AiL) {
                C92803zk r02 = r9.A05.A01(r4.A01()).A06;
                if (r02 != null) {
                    r0 = (C19560tg) r02.get();
                } else {
                    r0 = null;
                }
                if (r0 != null) {
                    r0.BCL(r4, r5);
                }
            }
        } else {
            for (C19340tK BK4 : r9.A08) {
                BK4.BK4(r4, AiL, str);
            }
            if (AiL) {
                C73743Ld.A00(r9.A05, r4, r7, r5);
            }
        }
        if (AiL && !z2) {
            if (((Boolean) r9.A0A.get()).booleanValue()) {
                A05(r9, 0, "dispatch");
            } else {
                C12670hC.A04(r9.A0F);
                return AiL;
            }
        }
        return AiL;
    }

    public final void A0G(String str) {
        for (C240813f A012 : this.A0G) {
            C240913g r1 = new C240913g("cancel");
            r1.A08 = str;
            C240813f.A01(A012, new C241013h(r1));
        }
        this.A0K = false;
        AnonymousClass0ZA.A02(this.A03, 5);
    }

    public final void A0H(String str) {
        if (((Boolean) this.A0A.get()).booleanValue()) {
            this.A03.obtainMessage(2, str).sendToTarget();
        } else {
            A08(this, str, true);
        }
    }

    public void init() {
        C12670hC.A04(new C59652hv(this));
        if (((Boolean) this.A0A.get()).booleanValue()) {
            this.A03.obtainMessage(10).sendToTarget();
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (((Boolean) this.A0A.get()).booleanValue()) {
            for (C240813f A012 : this.A0G) {
                C240913g r1 = new C240913g("cancel");
                r1.A08 = "onUserSessionWillEnd";
                C240813f.A01(A012, new C241013h(r1));
            }
            AnonymousClass0ZA.A07(this.A03, (Object) null);
        }
        C12670hC.A04(new C136325rn(this));
    }

    public C17390qA(Context context, AnonymousClass0C1 r4, C06180Ob r5, Looper looper, C54682Ym r7, C59552hl r8, AnonymousClass0IT r9, List list, List list2, AnonymousClass0IT r12, AnonymousClass0IT r13, AnonymousClass0IT r14, AnonymousClass0IT r15, AnonymousClass0IT r16) {
        this.A02 = context;
        this.A07 = r4;
        this.A0D = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A0C = r9;
        this.A0G = list;
        this.A08 = list2;
        this.A09 = r12;
        this.A0J = r13;
        this.A0B = r14;
        this.A0I = r15;
        this.A0A = r16;
        this.A03 = new Handler(looper, new C59642hu(this));
    }
}
