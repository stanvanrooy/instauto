package p000X;

import com.facebook.react.bridge.ReadableType;

/* renamed from: X.A1Q */
public final class A1Q implements A1k {
    public static final ThreadLocal A02 = new A1U();
    public C23043A0y A00;
    public String A01;

    public final void BZP() {
        this.A00 = null;
        this.A01 = null;
        ((AnonymousClass1Q7) A02.get()).BaL(this);
    }

    public final A1e A5o() {
        String str;
        C23043A0y a0y = this.A00;
        if (a0y != null && (str = this.A01) != null) {
            return a0y.getArray(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final boolean A5p() {
        String str;
        C23043A0y a0y = this.A00;
        if (a0y != null && (str = this.A01) != null) {
            return a0y.getBoolean(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final double A5q() {
        String str;
        C23043A0y a0y = this.A00;
        if (a0y != null && (str = this.A01) != null) {
            return a0y.getDouble(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final int A5t() {
        String str;
        C23043A0y a0y = this.A00;
        if (a0y != null && (str = this.A01) != null) {
            return a0y.getInt(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final C23043A0y A5u() {
        String str;
        C23043A0y a0y = this.A00;
        if (a0y != null && (str = this.A01) != null) {
            return a0y.getMap(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final String A5y() {
        String str;
        C23043A0y a0y = this.A00;
        if (a0y != null && (str = this.A01) != null) {
            return a0y.getString(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final ReadableType AZ8() {
        String str;
        C23043A0y a0y = this.A00;
        if (a0y != null && (str = this.A01) != null) {
            return a0y.getType(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public final boolean Agh() {
        String str;
        C23043A0y a0y = this.A00;
        if (a0y != null && (str = this.A01) != null) {
            return a0y.isNull(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }
}
