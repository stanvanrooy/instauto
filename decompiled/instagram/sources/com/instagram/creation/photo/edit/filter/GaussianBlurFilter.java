package com.instagram.creation.photo.edit.filter;

import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.util.creation.ShaderBridge;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass83K;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass85G;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U2;
import p000X.AnonymousClass8U6;
import p000X.AnonymousClass8UD;
import p000X.AnonymousClass8UE;
import p000X.C1887884o;
import p000X.C1892986r;
import p000X.C89103tc;
import p000X.C89123tg;
import p000X.C89133th;
import p000X.C89433uD;
import p000X.C89453uF;
import p000X.C89463uG;

public class GaussianBlurFilter extends BaseFilter {
    public static final C89463uG A0A = C89453uF.A00();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(305);
    public float A00;
    public int A01 = Integer.MAX_VALUE;
    public C1887884o A02;
    public AnonymousClass8U1 A03;
    public AnonymousClass8UE A04;
    public AnonymousClass8U6 A05;
    public AnonymousClass8U2 A06;
    public AnonymousClass8UD A07;
    public AnonymousClass8UD A08;
    public C89123tg A09 = new C89123tg();

    public final int describeContents() {
        return 0;
    }

    public final void Bbg(C89433uD r9, C89133th r10, AnonymousClass85B r11) {
        if (!r9.A04.contains(this)) {
            int A002 = ShaderBridge.A00("GaussianBlur");
            if (A002 == 0) {
                A002 = ShaderBridge.A00("GaussianBlurFixed");
            }
            if (A002 != 0) {
                AnonymousClass8U1 r1 = new AnonymousClass8U1(A002);
                this.A03 = r1;
                this.A05 = (AnonymousClass8U6) r1.A00("kernelSize");
                this.A06 = (AnonymousClass8U2) this.A03.A00("initialGaussian");
                this.A04 = (AnonymousClass8UE) this.A03.A00("blurAlongX");
                this.A08 = (AnonymousClass8UD) this.A03.A00(IgReactMediaPickerNativeModule.WIDTH);
                this.A07 = (AnonymousClass8UD) this.A03.A00(IgReactMediaPickerNativeModule.HEIGHT);
                this.A02 = new C1887884o(this.A03);
                r9.A04(this);
            } else {
                throw new AnonymousClass85G();
            }
        }
        float f = this.A00;
        double exp = Math.exp(-0.5d / ((double) (f * f)));
        this.A06.A02((float) ((1.0d / Math.sqrt(6.283185307179586d)) * ((double) f)), (float) exp, (float) (exp * exp));
        this.A05.A02(this.A00 * 3.0f);
        this.A08.A02(r10.getWidth());
        this.A07.A02(r10.getHeight());
        this.A03.A06("position", A0A.A01);
        this.A03.A06("transformedTextureCoordinate", A0A.A02);
        this.A03.A06("staticTextureCoordinate", A0A.A02);
        C1892986r.A04("GaussianBlurFilter.blurX:setCoordinates");
        this.A03.A04("image", r10.getTextureId(), Constants.ZERO, Constants.ONE);
        this.A04.A02(true);
        AnonymousClass83K A012 = r9.A01(r11.AU9(), r11.AU6());
        GLES20.glBindFramebuffer(36160, A012.AMH());
        C1892986r.A04("GaussianBlurFilter.blurX:glBindFramebuffer");
        C89123tg r2 = this.A09;
        A012.AaV(r2);
        this.A02.A00(r2, this.A01);
        this.A03.A04("image", A012.getTextureId(), Constants.ZERO, Constants.ONE);
        this.A04.A02(false);
        GLES20.glBindFramebuffer(36160, r11.AMH());
        C1892986r.A04("GaussianBlurFilter.blur:glBindFramebuffer");
        C89123tg r22 = this.A09;
        r11.AaV(r22);
        this.A02.A00(r22, this.A01);
        AoY();
        r9.A05(A012, (C89103tc) null);
        r9.A05(r10, (C89103tc) null);
        this.A00 = false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
    }

    public final void A8Y(C89433uD r2) {
        super.A8Y(r2);
        AnonymousClass8U1 r0 = this.A03;
        if (r0 != null) {
            GLES20.glDeleteProgram(r0.A00);
            this.A03 = null;
        }
    }

    public final String toString() {
        return AnonymousClass000.A0J(super.toString(), " Sigma: ", Float.toString(this.A00));
    }

    public final void Bio(int i) {
        this.A01 = i;
    }

    public GaussianBlurFilter() {
    }

    public GaussianBlurFilter(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readFloat();
        invalidate();
    }
}
