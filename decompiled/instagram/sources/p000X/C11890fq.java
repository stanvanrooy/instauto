package p000X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashSet;

/* renamed from: X.0fq  reason: invalid class name and case insensitive filesystem */
public final class C11890fq extends C08680Yc {
    public static C06590Pq A06;
    public C251117i A00;
    public C251317k A01;
    public C251517m A02;
    public boolean A03 = false;
    public C08540Xm A04;
    public final C11910fs A05 = new C11900fr(this);

    public final void A08() {
        C06590Pq r1 = A06;
        if (r1 != null && this.A03 && ((Boolean) C05680Ln.A3N.A00(r1)).booleanValue()) {
            C251117i r12 = this.A00;
            synchronized (r12) {
                r12.A02 = true;
            }
            C251117i.A00(r12);
            C252117x.A02().BZj(this.A05);
        }
    }

    public final void A09() {
        C251117i r1 = this.A00;
        synchronized (r1) {
            r1.A02 = false;
        }
        C251117i.A00(r1);
        C252117x.A02().A05(this.A05);
    }

    public C11890fq(C08540Xm r2) {
        this.A04 = r2;
    }

    public final void A07() {
        int A032 = AnonymousClass0Z0.A03(-444798778);
        A06 = this.A04.A00;
        if (!this.A03) {
            HandlerThread handlerThread = new HandlerThread("MemoryTimeline");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            HashSet hashSet = new HashSet();
            hashSet.add(new C250317a("asl_session_id", new C250417b()));
            hashSet.add(new C250317a("asl_endpoint", new C250517c()));
            hashSet.add(new C250317a(TraceFieldType.IsForeground, new C250617d()));
            C250717e r3 = new C250717e(this);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(new C250817f());
            hashSet2.add(new C251017h());
            C251117i r2 = new C251117i(r3, handler, hashSet2, hashSet);
            this.A00 = r2;
            C251317k r1 = new C251317k(AnonymousClass00B.A01);
            this.A01 = r1;
            this.A02 = new C251517m();
            r2.A01(r1);
            this.A00.A01(this.A02);
            AnonymousClass0Q7.A03().A0B(new C251717o(this));
            this.A03 = true;
            A08();
        } else {
            A09();
            C251117i r32 = this.A00;
            C251317k r22 = this.A01;
            synchronized (r32.A0A) {
                try {
                    r32.A0A.remove(r22);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                }
            }
            C251117i.A00(r32);
            C251117i r33 = this.A00;
            C251517m r23 = this.A02;
            synchronized (r33.A0A) {
                try {
                    r33.A0A.remove(r23);
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            C251117i.A00(r33);
            C251317k r12 = new C251317k(AnonymousClass00B.A01);
            this.A01 = r12;
            this.A02 = new C251517m();
            this.A00.A01(r12);
            this.A00.A01(this.A02);
            A08();
        }
        AnonymousClass0Z0.A0A(-215297568, A032);
        return;
        throw th;
    }
}
