package p000X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Lp  reason: invalid class name and case insensitive filesystem */
public final class C05700Lp implements AnonymousClass0OT, AnonymousClass0OS {
    public static boolean A0C = false;
    public static final ThreadFactory A0D = new AnonymousClass0OH();
    public static volatile AnonymousClass0OT A0E = null;
    public static final int MAXIMUM_POOL_SIZE = 128;
    public Executor A00 = new AnonymousClass0OJ(this, TimeUnit.SECONDS, new SynchronousQueue(), A0D);
    public final Object A01 = new Object();
    public final LinkedList A02 = new LinkedList();
    public final List A03 = new ArrayList();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final Random A08 = new Random();
    public final Map A09 = new HashMap();
    public final Map A0A = new HashMap();
    public final Map A0B = new HashMap();

    public final synchronized void ADc(AnonymousClass0O9 r3) {
        synchronized (this.A01) {
            this.A02.add(r3);
        }
        A01(this);
    }

    public final void BOm() {
    }

    public static AnonymousClass0OT A00() {
        if (A0E == null) {
            synchronized (C05700Lp.class) {
                if (A0E == null) {
                    A0E = new C05700Lp();
                }
            }
        }
        return A0E;
    }

    public static void A01(C05700Lp r12) {
        int i;
        int i2;
        synchronized (r12.A01) {
            Iterator it = r12.A02.iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                it.remove();
                String replace = runnable.toString().split("@")[0].replace("RunnableWrapper for ", "");
                if (!r12.A06.containsKey(replace) || ((Integer) r12.A06.get(replace)).intValue() < 5 || replace.startsWith("HttpEngine")) {
                    if (r12.A06.containsKey(replace)) {
                        i = ((Integer) r12.A06.get(replace)).intValue();
                    } else {
                        i = 0;
                    }
                    r12.A06.put(replace, Integer.valueOf(i + 1));
                    try {
                        if (A0C) {
                            AnonymousClass0Z9.A03(r12.A00, AnonymousClass19U.A00(runnable), 1133895296);
                        } else {
                            AnonymousClass0Z9.A03(r12.A00, runnable, 1867791712);
                        }
                    } catch (RejectedExecutionException e) {
                        StringBuilder sb = new StringBuilder();
                        synchronized (r12.A01) {
                            HashMap hashMap = new HashMap();
                            String str = null;
                            for (Runnable obj : r12.A03) {
                                String obj2 = obj.toString();
                                if (hashMap.containsKey(obj2)) {
                                    i2 = ((Integer) hashMap.get(obj2)).intValue() + 1;
                                } else {
                                    i2 = 1;
                                }
                                hashMap.put(obj2, Integer.valueOf(i2));
                                if (str == null || ((Integer) hashMap.get(obj2)).intValue() > ((Integer) hashMap.get(str)).intValue()) {
                                    str = obj2;
                                }
                                sb.append(obj2);
                                sb.append(10);
                            }
                            sb.append(AnonymousClass000.A0E("mostRepeatTask: ", str));
                            sb.append(10);
                            throw new RejectedExecutionException(e.getMessage() + "\nRunning tasks:\n" + sb);
                        }
                    }
                } else {
                    arrayList.add(runnable);
                }
            }
            if (!arrayList.isEmpty()) {
                r12.A02.addAll(arrayList);
            }
        }
    }

    public static synchronized void clearInstance() {
        synchronized (C05700Lp.class) {
            A0E = null;
            if (A00() instanceof C05700Lp) {
                C05700Lp r1 = (C05700Lp) A00();
                r1.A03.clear();
                r1.A07.clear();
                r1.A0B.clear();
                r1.A05.clear();
                r1.A04.clear();
                r1.A09.clear();
                r1.A02.clear();
                r1.A06.clear();
                r1.A0A.clear();
            }
        }
    }

    public final void ADb(AnonymousClass0OC r2) {
        ADc(r2.A00);
    }

    public static void setInstance(AnonymousClass0OT r0) {
        A0E = r0;
    }
}
