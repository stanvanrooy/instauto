package com.instagram.creation.photo.edit.filter;

import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;
import java.nio.ByteBuffer;
import p000X.Constants;
import p000X.AnonymousClass83K;
import p000X.AnonymousClass856;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass85L;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U6;
import p000X.C1892986r;
import p000X.C88963tH;
import p000X.C89103tc;
import p000X.C89123tg;
import p000X.C89133th;
import p000X.C89433uD;
import p000X.C89453uF;
import p000X.C89463uG;

public class BlurredLumAdjustFilter extends BaseFilter {
    public static final float[] A0E;
    public static final float[] A0F;
    public static final C89463uG A0G = C89453uF.A00();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(304);
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass8U6 A03;
    public AnonymousClass8U6 A04;
    public AnonymousClass8U6 A05;
    public AnonymousClass8U6 A06;
    public C89133th A07;
    public boolean A08;
    public AnonymousClass8U1 A09;
    public C89123tg A0A = new C89123tg();
    public final GaussianBlurFilter A0B = new GaussianBlurFilter();
    public final GaussianBlurFilter A0C;
    public final C88963tH A0D = new C88963tH();

    static {
        float[] fArr = {BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.0612549f, 0.185368f, 0.16381f, 0.365771f, 0.320955f, 0.527539f, 0.496851f, 0.659237f, 0.709977f, 0.79987f, 1.0f, 1.0f};
        A0F = fArr;
        float[] fArr2 = new float[14];
        A0E = fArr2;
        for (int i = 0; i < 7; i++) {
            int i2 = i << 1;
            int i3 = i2 + 1;
            fArr2[i2] = fArr[i3];
            fArr2[i3] = fArr[i2];
        }
    }

    public final void A0C(int i) {
        this.A00 = i;
        super.invalidate();
    }

    public final void A0D(int i) {
        this.A01 = i;
        super.invalidate();
    }

    public final void A0E(int i) {
        this.A02 = i;
        super.invalidate();
    }

    public final void A8Y(C89433uD r6) {
        this.A0B.A8Y(r6);
        this.A0C.A8Y(r6);
        super.A8Y(r6);
        AnonymousClass8U1 r0 = this.A09;
        if (r0 != null) {
            GLES20.glDeleteProgram(r0.A00);
            this.A09 = null;
        }
        C89133th r02 = this.A07;
        if (r02 != null) {
            GLES20.glDeleteTextures(1, new int[]{r02.getTextureId()}, 0);
            this.A07 = null;
        }
        this.A0D.A8Y(r6);
    }

    public final void Bbg(C89433uD r13, C89133th r14, AnonymousClass85B r15) {
        C89133th r0;
        if (!r13.A04.contains(this)) {
            int A002 = ShaderBridge.A00("BlurredLumAdjust");
            if (A002 != 0) {
                AnonymousClass8U1 r1 = new AnonymousClass8U1(A002);
                this.A09 = r1;
                this.A03 = (AnonymousClass8U6) r1.A00("highlights");
                this.A04 = (AnonymousClass8U6) this.A09.A00("shadows");
                this.A05 = (AnonymousClass8U6) this.A09.A00("sharpen");
                this.A06 = (AnonymousClass8U6) this.A09.A00("TOOL_ON_EPSILON");
                r13.A04(this);
            } else {
                throw new IllegalStateException("Could not compile Basic Adjust program.");
            }
        }
        AnonymousClass8U1 r2 = this.A09;
        this.A03.A02(((float) this.A00) / 100.0f);
        this.A04.A02(((float) this.A01) / 100.0f);
        this.A05.A02(((float) this.A02) / 100.0f);
        this.A06.A02(0.009f);
        r2.A03("image", r14.getTextureId());
        boolean z = r14 instanceof AnonymousClass83K;
        if (z) {
            AnonymousClass83K r5 = (AnonymousClass83K) r14;
            if (this != null && ((C89103tc) r13.A03.get(r5)) == null) {
                r13.A07.remove(r5);
                r13.A03.put(r5, this);
            }
        }
        AnonymousClass83K A012 = this.A0D.A01(this.A0C, r15.AU9(), r15.AU6(), r13);
        if (A012 == null) {
            A012 = this.A0D.A00(this.A0C, r15.AU9(), r15.AU6(), r13);
            this.A0C.Bbg(r13, r14, A012);
        }
        r2.A04("sharpenBlur", A012.getTextureId(), Constants.ZERO, Constants.ONE);
        if (((float) Math.abs(this.A01)) > 0.009f || ((float) Math.abs(this.A00)) > 0.009f) {
            AnonymousClass83K A013 = this.A0D.A01(this.A0B, r15.AU9(), r15.AU6(), r13);
            if (A013 == null) {
                A013 = this.A0D.A00(this.A0B, r15.AU9(), r15.AU6(), r13);
                GaussianBlurFilter gaussianBlurFilter = this.A0B;
                gaussianBlurFilter.A00 = (((float) r15.AU9()) * 1.2f) / 640.0f;
                gaussianBlurFilter.invalidate();
                this.A0B.Bbg(r13, r14, A013);
            }
            r2.A04("shadowsBlur", A013.getTextureId(), Constants.ZERO, Constants.ONE);
            if (this.A07 == null) {
                ByteBuffer allocate = ByteBuffer.allocate(512);
                new AnonymousClass856(A0F).A00(allocate, 0);
                new AnonymousClass856(A0E).A00(allocate, 256);
                int A003 = C1892986r.A00();
                GLES20.glTexImage2D(3553, 0, 6409, 256, 2, 0, 6409, 5121, allocate);
                if (!C1892986r.A04("loadTexture")) {
                    r0 = AnonymousClass85L.A00(A003, 256, 2);
                } else {
                    r0 = null;
                }
                this.A07 = r0;
            }
            r2.A03("splines", this.A07.getTextureId());
        }
        if (z) {
            AnonymousClass83K r12 = (AnonymousClass83K) r14;
            if (this != null && this == r13.A03.get(r12)) {
                r13.A07.add(r12);
                r13.A03.remove(r12);
            }
        }
        C1892986r.A04("BlurredLumAdjustFilter.render:setFilterParams");
        this.A09.A06("position", A0G.A01);
        this.A09.A06("transformedTextureCoordinate", A0G.A02);
        this.A09.A06("staticTextureCoordinate", A0G.A02);
        C1892986r.A04("BlurredLumAdjustFilter.render:setCoordinates");
        GLES20.glBindFramebuffer(36160, r15.AMH());
        C1892986r.A04("BlurredLumAdjustFilter.render:glBindFramebuffer");
        C89123tg r02 = this.A0A;
        r15.AaV(r02);
        GLES20.glViewport(r02.A02, r02.A03, r02.A01, r02.A00);
        C1892986r.A04("BlurredLumAdjustFilter.render:glViewport");
        this.A09.A02();
        C1892986r.A04("BlurredLumAdjustFilter.render:prepareToRender");
        GLES20.glDrawArrays(5, 0, 4);
        C1892986r.A04("BlurredLumAdjustFilter.render:glDrawArrays");
        AoY();
        if (!this.A08) {
            this.A0D.A02(this.A0C, r13);
            this.A0D.A02(this.A0B, r13);
        }
        r13.A05(r14, (C89103tc) null);
    }

    public final boolean Ag0() {
        if (super.Ag0() || this.A0C.Ag0() || this.A0B.Ag0()) {
            return true;
        }
        return false;
    }

    public final void AoY() {
        super.AoY();
        this.A0C.AoY();
        this.A0B.AoY();
    }

    public final void invalidate() {
        super.invalidate();
        this.A0C.invalidate();
        this.A0B.invalidate();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }

    public BlurredLumAdjustFilter() {
        GaussianBlurFilter gaussianBlurFilter = new GaussianBlurFilter();
        this.A0C = gaussianBlurFilter;
        gaussianBlurFilter.A00 = 0.8f;
        gaussianBlurFilter.invalidate();
    }

    public BlurredLumAdjustFilter(Parcel parcel) {
        super(parcel);
        GaussianBlurFilter gaussianBlurFilter = new GaussianBlurFilter();
        this.A0C = gaussianBlurFilter;
        gaussianBlurFilter.A00 = 0.8f;
        gaussianBlurFilter.invalidate();
        this.A08 = parcel.readInt() != 1 ? false : true;
        this.A00 = parcel.readInt();
        super.invalidate();
        this.A01 = parcel.readInt();
        super.invalidate();
        this.A02 = parcel.readInt();
        super.invalidate();
    }
}
