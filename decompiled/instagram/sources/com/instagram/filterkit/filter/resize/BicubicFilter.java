package com.instagram.filterkit.filter.resize;

import android.opengl.GLES10;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;
import p000X.Constants;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass85G;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U5;
import p000X.C1887884o;
import p000X.C1892986r;
import p000X.C89103tc;
import p000X.C89123tg;
import p000X.C89133th;
import p000X.C89433uD;
import p000X.C89453uF;
import p000X.C89463uG;

public class BicubicFilter extends BaseFilter {
    public static final C89463uG A06 = C89453uF.A00();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(333);
    public int A00 = Integer.MAX_VALUE;
    public C1887884o A01;
    public AnonymousClass8U1 A02;
    public AnonymousClass8U5 A03;
    public final C89123tg A04 = new C89123tg();
    public final boolean A05;

    public final void A8Y(C89433uD r2) {
        AnonymousClass8U1 r0 = this.A02;
        if (r0 != null) {
            GLES20.glDeleteProgram(r0.A00);
            this.A02 = null;
        }
    }

    public final void Bbg(C89433uD r8, C89133th r9, AnonymousClass85B r10) {
        String str;
        GLES20.glFlush();
        if (this.A05) {
            str = "BicubicLinearSpace";
        } else {
            str = "Bicubic";
        }
        if (!r8.A04.contains(this)) {
            int A002 = ShaderBridge.A00(str);
            if (A002 != 0) {
                AnonymousClass8U1 r1 = new AnonymousClass8U1(A002);
                this.A02 = r1;
                this.A01 = new C1887884o(r1);
                this.A03 = (AnonymousClass8U5) this.A02.A00("inputImageSize");
                r8.A04(this);
            }
            throw new AnonymousClass85G();
        }
        this.A03.A02((float) r9.getWidth(), (float) r9.getHeight());
        this.A02.A06("position", A06.A01);
        this.A02.A06("transformedTextureCoordinate", A06.A02);
        this.A02.A06("staticTextureCoordinate", A06.A02);
        AnonymousClass8U1 r3 = this.A02;
        int textureId = r9.getTextureId();
        Integer num = Constants.ONE;
        r3.A04("image", textureId, num, num);
        GLES10.glBindTexture(3553, r9.getTextureId());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindFramebuffer(36160, r10.AMH());
        boolean A042 = C1892986r.A04("glBindFramebuffer");
        boolean z = true;
        AnonymousClass0DB.A0D("BicubicFilter", String.format("%s to size  %dx%d", new Object[]{"BicubicFilter", Integer.valueOf(r10.getWidth()), Integer.valueOf(r10.getHeight())}));
        C89123tg r2 = this.A04;
        r10.AaV(r2);
        if (!A042 && !this.A01.A00(r2, this.A00)) {
            z = false;
        }
        AoY();
        r8.A05(r9, (C89103tc) null);
        if (!z) {
            this.A00 = false;
            return;
        }
        r8.A05(r10, (C89103tc) null);
        r8.A03(this);
        throw new AnonymousClass85G();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final void Bio(int i) {
        this.A00 = i;
    }

    public BicubicFilter(Parcel parcel) {
        this.A05 = parcel.readInt() != 1 ? false : true;
    }

    public BicubicFilter(boolean z) {
        this.A05 = z;
    }
}
