package com.instagram.filterkit.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.math.Matrix4;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U4;
import p000X.AnonymousClass8UE;
import p000X.C89133th;
import p000X.C89433uD;

public class IdentityFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(50);
    public float A00 = 1.0f;
    public AnonymousClass8UE A01;
    public AnonymousClass8UE A02;
    public AnonymousClass8U4 A03;
    public AnonymousClass8U4 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final float[] A09 = new float[3];
    public final Matrix4 A0A = new Matrix4();
    public final Matrix4 A0B = new Matrix4();

    public final void A0H(Matrix4 matrix4) {
        if (matrix4 != null) {
            this.A08 = true;
            this.A0B.A07(matrix4);
        } else {
            this.A08 = false;
            this.A0B.A01();
        }
        invalidate();
    }

    public final void A0E(AnonymousClass8U1 r3, C89433uD r4, C89133th r5, AnonymousClass85B r6) {
        r3.A03("image", r5.getTextureId());
        AnonymousClass8UE r1 = this.A02;
        if (r1 != null) {
            r1.A02(this.A08);
        }
        AnonymousClass8U4 r12 = this.A04;
        if (r12 != null && this.A08) {
            r12.A02(this.A0B.A00);
        }
        AnonymousClass8UE r13 = this.A01;
        if (r13 != null) {
            r13.A02(this.A07);
        }
        AnonymousClass8U4 r14 = this.A03;
        if (r14 != null && this.A07) {
            r14.A02(this.A0A.A00);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeFloat(this.A00);
    }

    public IdentityFilter(AnonymousClass0C1 r2) {
        super(r2);
    }

    public IdentityFilter(Parcel parcel) {
        super(parcel);
        Class<Matrix4> cls = Matrix4.class;
        this.A0B.A07((Matrix4) parcel.readParcelable(cls.getClassLoader()));
        boolean z = false;
        this.A08 = parcel.readInt() == 1;
        this.A0A.A07((Matrix4) parcel.readParcelable(cls.getClassLoader()));
        this.A07 = parcel.readInt() == 1;
        this.A05 = parcel.readInt() == 1;
        this.A06 = parcel.readInt() == 1 ? true : z;
        this.A00 = parcel.readFloat();
    }
}
