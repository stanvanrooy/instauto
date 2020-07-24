package p000X;

import android.os.Bundle;
import android.os.Looper;

/* renamed from: X.1Mo  reason: invalid class name and case insensitive filesystem */
public final class C28651Mo extends AnonymousClass1HQ implements C28671Mq {
    public C137125t6 A00;
    public AnonymousClass1N5 A01;
    public AnonymousClass1N3 A02;
    public final int A03;
    public final Bundle A04;
    public final AnonymousClass1N3 A05;

    public final void A03() {
        AnonymousClass1L9.A02(2);
        AnonymousClass1N3 r1 = this.A05;
        r1.A06 = true;
        r1.A05 = false;
        r1.A02 = false;
        r1.A03();
    }

    public final void A04() {
        AnonymousClass1L9.A02(2);
        AnonymousClass1N3 r1 = this.A05;
        r1.A06 = false;
        r1.A04();
    }

    public final AnonymousClass1N3 A0B(boolean z) {
        AnonymousClass1L9.A02(3);
        this.A05.A07();
        this.A05.A02 = true;
        AnonymousClass1N5 r2 = this.A01;
        if (r2 != null) {
            A07(r2);
            if (z && r2.A00) {
                AnonymousClass1L9.A02(2);
            }
        }
        AnonymousClass1N3 r1 = this.A05;
        C28671Mq r0 = r1.A01;
        if (r0 == null) {
            throw new IllegalStateException("No listener register");
        } else if (r0 == this) {
            r1.A01 = null;
            if ((r2 == null || r2.A00) && !z) {
                return r1;
            }
            r1.A02();
            r1.A05 = true;
            r1.A06 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A04 = false;
            return this.A02;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public final void B9T(AnonymousClass1N3 r3, Object obj) {
        AnonymousClass1L9.A02(2);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            A0A(obj);
            return;
        }
        AnonymousClass1L9.A02(4);
        A09(obj);
    }

    public final void A0C() {
        C137125t6 r1 = this.A00;
        AnonymousClass1N5 r0 = this.A01;
        if (r1 != null && r0 != null) {
            super.A07(r0);
            A05(r1, r0);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.A03);
        sb.append(" : ");
        AnonymousClass1N3 r1 = this.A05;
        sb.append(r1.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(r1)));
        sb.append("}}");
        return sb.toString();
    }

    public C28651Mo(int i, Bundle bundle, AnonymousClass1N3 r5, AnonymousClass1N3 r6) {
        this.A03 = i;
        this.A04 = bundle;
        this.A05 = r5;
        this.A02 = r6;
        if (r5.A01 == null) {
            r5.A01 = this;
            r5.A00 = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public final void A07(AnonymousClass1N6 r2) {
        super.A07(r2);
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0A(Object obj) {
        super.A0A(obj);
        AnonymousClass1N3 r1 = this.A02;
        if (r1 != null) {
            r1.A02();
            r1.A05 = true;
            r1.A06 = false;
            r1.A02 = false;
            r1.A03 = false;
            r1.A04 = false;
            this.A02 = null;
        }
    }
}
