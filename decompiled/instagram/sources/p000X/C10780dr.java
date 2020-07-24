package p000X;

import com.facebook.quicklog.PerformanceLoggingEvent;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0dr  reason: invalid class name and case insensitive filesystem */
public abstract class C10780dr implements AnonymousClass0I6 {
    public int A00 = 9000;
    public Set A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public final ReadWriteLock A04 = new ReentrantReadWriteLock(true);
    public final List A05 = new ArrayList();

    public abstract void A00(Runnable runnable);

    public final void Btn(PerformanceLoggingEvent performanceLoggingEvent) {
        Lock lock;
        this.A04.readLock().lock();
        try {
            boolean z = this.A02;
            this.A04.readLock().unlock();
            if (!z) {
                this.A04.writeLock().lock();
                try {
                    if (!this.A02) {
                        boolean equals = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(AnonymousClass070.A02("facebook.PerfSocketEnabled"));
                        this.A03 = equals;
                        if (equals) {
                            int parseInt = Integer.parseInt(AnonymousClass070.A02("facebook.PerfSocketNumEvents"));
                            this.A01 = new HashSet();
                            for (int i = 0; i < parseInt; i++) {
                                this.A01.add(AnonymousClass070.A02(AnonymousClass000.A05("facebook.PerfSocketEvent", i)));
                            }
                            this.A00 = Integer.parseInt(AnonymousClass070.A02("facebook.PerfSocketPort"));
                        }
                        this.A02 = true;
                    }
                    this.A04.writeLock().unlock();
                } catch (Throwable th) {
                    th = th;
                    lock = this.A04.writeLock();
                    lock.unlock();
                    throw th;
                }
            }
            if (this.A03) {
                AnonymousClass0ID r1 = performanceLoggingEvent.A02;
                int i2 = r1.A04;
                String A002 = AnonymousClass0KW.A00(i2);
                String A003 = AnonymousClass0IU.A00(performanceLoggingEvent.A04);
                long j = r1.A0G;
                int A012 = r1.A01();
                AnonymousClass0I4 r12 = performanceLoggingEvent.A00;
                HashMap hashMap = new HashMap();
                if (r12 != null) {
                    r12.A01(new C10770dq(this, hashMap));
                }
                hashMap.putAll(Collections.emptyMap());
                AnonymousClass0SK r4 = new AnonymousClass0SK(i2, A002, A003, j, A012, hashMap, new ArrayList(performanceLoggingEvent.A02.A03()), new ArrayList(performanceLoggingEvent.A02.A0R));
                AnonymousClass0ID r13 = performanceLoggingEvent.A02;
                C05070Hx r0 = r13.A0H;
                C05070Hx r2 = r0;
                if (r0 != null) {
                    r2.A00(new C10750do(this, performanceLoggingEvent, AnonymousClass0KW.A00(r13.A04)));
                }
                AnonymousClass0SJ r3 = null;
                synchronized (this.A05) {
                    this.A05.add(r4);
                    this.A04.readLock().lock();
                    try {
                        Set set = this.A01;
                        if (set != null && (set.contains("*") || this.A01.contains(r4.A04))) {
                            r3 = new AnonymousClass0SJ(this);
                        }
                    } finally {
                        this.A04.readLock().unlock();
                    }
                }
                if (r3 != null) {
                    A00(r3);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            lock = this.A04.readLock();
            lock.unlock();
            throw th;
        }
    }
}
