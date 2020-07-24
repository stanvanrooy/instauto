package p000X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.D6I */
public final class D6I {
    public final int A00;
    public final C29791DAa A01;
    public final CopyOnWriteArrayList A02;
    public final long A03;

    public final void A02() {
        boolean z = false;
        if (this.A01 != null) {
            z = true;
        }
        D6U.A03(z);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new D7P(this, d8l.A01));
        }
    }

    public final void A03() {
        boolean z = false;
        if (this.A01 != null) {
            z = true;
        }
        D6U.A03(z);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new D7Q(this, d8l.A01));
        }
    }

    public final void A04() {
        boolean z = false;
        if (this.A01 != null) {
            z = true;
        }
        D6U.A03(z);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new D7R(this, d8l.A01));
        }
    }

    public final void A05(int i, Format format, int i2, Object obj, long j) {
        int i3 = i;
        A0B(new D6X(1, i3, format, i2, obj, A00(this, j), -9223372036854775807L));
    }

    public final void A06(Uri uri, String str) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new C29745D7r(this, d8l.A01, uri, str));
        }
    }

    public final void A07(D4J d4j, D6X d6x) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new C29723D6k(this, d8l.A01, d4j, d6x));
        }
    }

    public final void A08(D4J d4j, D6X d6x) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new C29721D6i(this, d8l.A01, d4j, d6x));
        }
    }

    public final void A09(D4J d4j, D6X d6x, IOException iOException, boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new D6W(this, d8l.A01, d4j, d6x, iOException, z));
        }
    }

    public final void A0A(D4J d4j, D6X d6x, Object obj) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new C29722D6j(this, d8l.A01, d4j, d6x, obj));
        }
    }

    public final void A0B(D6X d6x) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new C29725D6n(this, d8l.A01, d6x));
        }
    }

    public final void A0C(D6X d6x) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            A01(d8l.A00, new D6m(this, d8l.A01, d6x));
        }
    }

    public final void A0D(D1M d1m, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
        int i4 = i;
        A08(new D4J(d1m), new D6X(i4, i2, format, i3, obj, A00(this, j), A00(this, j2)));
    }

    public final void A0E(D1M d1m, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        int i4 = i3;
        int i5 = i2;
        Format format2 = format;
        int i6 = i;
        A09(new D4J(d1m), new D6X(i6, i5, format2, i4, obj, A00(this, j), A00(this, j2)), iOException, z);
    }

    public final void A0F(D1M d1m, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, Object obj2) {
        int i4 = i;
        int i5 = i2;
        Format format2 = format;
        int i6 = i3;
        A0A(new D4J(d1m), new D6X(i4, i5, format2, i6, obj, A00(this, j), A00(this, j2)), obj2);
    }

    public D6I(CopyOnWriteArrayList copyOnWriteArrayList, int i, C29791DAa dAa, long j) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = dAa;
        this.A03 = j;
    }

    public static long A00(D6I d6i, long j) {
        long A012 = C29686D4x.A01(j);
        if (A012 != -9223372036854775807L) {
            return d6i.A03 + A012;
        }
        return -9223372036854775807L;
    }

    public static void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            AnonymousClass0ZA.A0E(handler, runnable, -450897316);
        }
    }
}
