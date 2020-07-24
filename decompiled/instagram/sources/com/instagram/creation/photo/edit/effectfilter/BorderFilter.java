package com.instagram.creation.photo.edit.effectfilter;

import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import com.instagram.util.creation.ShaderBridge;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U5;
import p000X.C89133th;
import p000X.C89433uD;

public class BorderFilter extends BaseSimpleFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(302);
    public AnonymousClass8U5 A00;
    public final float A01;
    public final String A02;

    public final void A0F(AnonymousClass85B r1) {
    }

    public final boolean A0G() {
        return true;
    }

    public final boolean Ags() {
        return true;
    }

    public final AnonymousClass8U1 A0C(C89433uD r4) {
        int A002 = ShaderBridge.A00("Border");
        if (A002 == 0) {
            return null;
        }
        AnonymousClass8U1 r2 = new AnonymousClass8U1(A002);
        this.A00 = (AnonymousClass8U5) r2.A00("stretchFactor");
        r2.A03("image", r4.A00(this, this.A02).getTextureId());
        return r2;
    }

    public final void A0D(AnonymousClass8U1 r2, C89433uD r3, C89133th r4, AnonymousClass85B r5) {
        GLES20.glDisable(3042);
    }

    public final void A0E(AnonymousClass8U1 r5, C89433uD r6, C89133th r7, AnonymousClass85B r8) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        float AU9 = ((float) r8.AU9()) / ((float) r8.AU6());
        float f = this.A01;
        if (AU9 == f) {
            this.A00.A02(1.0f, 1.0f);
        } else if (AU9 > f) {
            this.A00.A02(AU9 / f, 1.0f);
        } else {
            this.A00.A02(1.0f, f / AU9);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeFloat(this.A01);
    }

    public BorderFilter(AnonymousClass0C1 r1, String str, float f) {
        super(r1);
        this.A02 = str;
        this.A01 = f;
    }

    public BorderFilter(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readString();
        this.A01 = parcel.readFloat();
    }
}
