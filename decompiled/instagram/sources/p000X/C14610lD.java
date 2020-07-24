package p000X;

import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0lD  reason: invalid class name and case insensitive filesystem */
public final class C14610lD {
    public static final Object A0A = new Object();
    public static final Handler A0B = new Handler(Looper.getMainLooper());
    public Throwable A00;
    public final C14620lE A01;
    public final Object A02 = new Object();
    public final Thread A03;
    public final Map A04;
    public final CountDownLatch A05;
    public final Executor A06;
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final Map A08;
    public volatile boolean A09 = false;

    public static synchronized void A02(C14610lD r6, Set set) {
        synchronized (r6) {
            Throwable th = new Throwable("commit stack");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map map = (Map) r6.A08.get((String) it.next());
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        AnonymousClass0ZA.A0E((Handler) entry.getValue(), new AnonymousClass90V(r6, th, (AnonymousClass90W) entry.getKey()), -1502616101);
                    }
                }
            }
            r6.A00 = null;
        }
    }

    public final boolean A07(String str) {
        boolean z = false;
        A01(this);
        synchronized (this.A02) {
            try {
                Boolean bool = (Boolean) this.A04.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (ClassCastException e) {
                throw A00(this, e, str);
            }
        }
        return z;
    }

    public static RuntimeException A00(C14610lD r5, Exception exc, String str) {
        return new RuntimeException(AnonymousClass000.A0O("LightSharedPreferences threw an exception for Key: ", str, "; ", "Raw file: ", r5.A01.A00()), exc);
    }

    public static void A01(C14610lD r2) {
        int priority;
        if (!r2.A09) {
            AnonymousClass0ZL.A01("LightSharedPreferences.waitIfNotLoaded", 1141194875);
            while (!r2.A09) {
                synchronized (r2) {
                    if (r2.A03.getState() != Thread.State.TERMINATED && (priority = Thread.currentThread().getPriority()) > r2.A03.getPriority()) {
                        r2.A03.setPriority(priority);
                    }
                }
                try {
                    r2.A05.await();
                    break;
                } catch (InterruptedException unused) {
                }
            }
            AnonymousClass0ZL.A00(319702124);
        }
    }

    public C14610lD(File file, Executor executor) {
        this.A01 = new C14620lE(file);
        this.A04 = new HashMap();
        this.A08 = new HashMap();
        if (executor != null) {
            this.A06 = executor;
            this.A05 = new CountDownLatch(1);
            Thread thread = new Thread(new C14630lF(this), AnonymousClass000.A0E("LSP-", file.getName()));
            this.A03 = thread;
            thread.start();
            return;
        }
        throw null;
    }

    public final int A03(String str, int i) {
        A01(this);
        synchronized (this.A02) {
            try {
                Integer num = (Integer) this.A04.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (ClassCastException e) {
                throw A00(this, e, str);
            }
        }
        return i;
    }

    public final long A04(String str, long j) {
        A01(this);
        synchronized (this.A02) {
            try {
                Long l = (Long) this.A04.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (ClassCastException e) {
                throw A00(this, e, str);
            }
        }
        return j;
    }

    public final C22450yR A05() {
        A01(this);
        return new C22450yR(this);
    }

    public final boolean A06(String str) {
        boolean containsKey;
        A01(this);
        synchronized (this.A02) {
            containsKey = this.A04.containsKey(str);
        }
        return containsKey;
    }
}
