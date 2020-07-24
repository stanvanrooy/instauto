package p000X;

import android.graphics.Point;

/* renamed from: X.15g  reason: invalid class name and case insensitive filesystem */
public final class C245915g implements AnonymousClass15d {
    public static final C17120pi A02 = new C246015h();
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C245915g r5 = (C245915g) obj;
            return this.A00 == r5.A00 && this.A01 == r5.A01;
        }
        return false;
    }

    public final String getTypeName() {
        return "PointAttachment";
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return new Point(this.A00, this.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }
}
