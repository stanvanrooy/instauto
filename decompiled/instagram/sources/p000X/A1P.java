package p000X;

import com.facebook.react.bridge.ReadableType;

/* renamed from: X.A1P */
public final class A1P implements A1k {
    public Object A00;

    public final void BZP() {
    }

    public final A1e A5o() {
        return (A1e) this.A00;
    }

    public final boolean A5p() {
        return ((Boolean) this.A00).booleanValue();
    }

    public final double A5q() {
        return ((Double) this.A00).doubleValue();
    }

    public final int A5t() {
        return ((Double) this.A00).intValue();
    }

    public final C23043A0y A5u() {
        return (C23043A0y) this.A00;
    }

    public final String A5y() {
        return (String) this.A00;
    }

    public final boolean Agh() {
        if (this.A00 == null) {
            return true;
        }
        return false;
    }

    public A1P(Object obj) {
        this.A00 = obj;
    }

    public final ReadableType AZ8() {
        if (Agh()) {
            return ReadableType.Null;
        }
        Object obj = this.A00;
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof C23043A0y) {
            return ReadableType.Map;
        }
        if (obj instanceof A1e) {
            return ReadableType.Array;
        }
        AnonymousClass0CH.A06("ReactNative", AnonymousClass000.A0E("Unmapped object type ", obj.getClass().getName()));
        return ReadableType.Null;
    }
}
