package p000X;

import com.facebook.react.bridge.ReadableType;

/* renamed from: X.A1f */
public final class A1f implements A1k {
    public static final AnonymousClass1Q7 A02 = new AnonymousClass1Q7(10);
    public int A00 = -1;
    public A1e A01;

    public final void BZP() {
        this.A01 = null;
        this.A00 = -1;
        A02.BaL(this);
    }

    public final A1e A5o() {
        A1e a1e = this.A01;
        if (a1e != null) {
            return a1e.getArray(this.A00);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final boolean A5p() {
        A1e a1e = this.A01;
        if (a1e != null) {
            return a1e.getBoolean(this.A00);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final double A5q() {
        A1e a1e = this.A01;
        if (a1e != null) {
            return a1e.getDouble(this.A00);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final int A5t() {
        A1e a1e = this.A01;
        if (a1e != null) {
            return a1e.getInt(this.A00);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final C23043A0y A5u() {
        A1e a1e = this.A01;
        if (a1e != null) {
            return a1e.getMap(this.A00);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final String A5y() {
        A1e a1e = this.A01;
        if (a1e != null) {
            return a1e.getString(this.A00);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final ReadableType AZ8() {
        A1e a1e = this.A01;
        if (a1e != null) {
            return a1e.getType(this.A00);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final boolean Agh() {
        A1e a1e = this.A01;
        if (a1e != null) {
            return a1e.isNull(this.A00);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }
}
