package com.instagram.creation.photo.edit.filter;

import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;
import p000X.Constants;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U2;
import p000X.AnonymousClass8U5;
import p000X.AnonymousClass8U6;
import p000X.C1892986r;
import p000X.C89103tc;
import p000X.C89123tg;
import p000X.C89133th;
import p000X.C89433uD;
import p000X.C89453uF;
import p000X.C89463uG;

public class BasicAdjustFilter extends BaseFilter {
    public static final C89463uG A0O = C89453uF.A00();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(303);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 50;
    public int A07;
    public int A08 = 50;
    public int A09;
    public AnonymousClass8U6 A0A;
    public AnonymousClass8U6 A0B;
    public AnonymousClass8U6 A0C;
    public AnonymousClass8U6 A0D;
    public AnonymousClass8U6 A0E;
    public AnonymousClass8U6 A0F;
    public AnonymousClass8U6 A0G;
    public AnonymousClass8U6 A0H;
    public AnonymousClass8U6 A0I;
    public AnonymousClass8U5 A0J;
    public AnonymousClass8U2 A0K;
    public AnonymousClass8U2 A0L;
    public AnonymousClass8U1 A0M;
    public C89123tg A0N = new C89123tg();

    public final boolean A0C() {
        if (this.A00 == 0 && this.A01 == 0 && this.A03 == 0 && this.A04 == 0 && this.A09 == 0 && this.A02 == 0 && this.A07 <= 0 && this.A05 <= 0) {
            return false;
        }
        return true;
    }

    public final void Bbg(C89433uD r7, C89133th r8, AnonymousClass85B r9) {
        if (!r7.A04.contains(this)) {
            int A002 = ShaderBridge.A00("BasicAdjust");
            if (A002 != 0) {
                AnonymousClass8U1 r1 = new AnonymousClass8U1(A002);
                this.A0M = r1;
                this.A0A = (AnonymousClass8U6) r1.A00("brightness");
                this.A0B = (AnonymousClass8U6) this.A0M.A00("contrast");
                this.A0D = (AnonymousClass8U6) this.A0M.A00("saturation");
                this.A0E = (AnonymousClass8U6) this.A0M.A00(AnonymousClass0C5.$const$string(296));
                this.A0I = (AnonymousClass8U6) this.A0M.A00("vignette");
                this.A0C = (AnonymousClass8U6) this.A0M.A00("fade");
                this.A0G = (AnonymousClass8U6) this.A0M.A00("tintShadowsIntensity");
                this.A0F = (AnonymousClass8U6) this.A0M.A00("tintHighlightsIntensity");
                this.A0L = (AnonymousClass8U2) this.A0M.A00("tintShadowsColor");
                this.A0K = (AnonymousClass8U2) this.A0M.A00("tintHighlightsColor");
                this.A0H = (AnonymousClass8U6) this.A0M.A00("TOOL_ON_EPSILON");
                this.A0J = (AnonymousClass8U5) this.A0M.A00("stretchFactor");
                r7.A04(this);
            } else {
                throw new IllegalStateException("Could not compile Basic Adjust program.");
            }
        }
        AnonymousClass8U1 r4 = this.A0M;
        this.A0A.A02(((float) this.A00) / 100.0f);
        this.A0B.A02(((float) this.A01) / 100.0f);
        this.A0D.A02(((float) this.A03) / 100.0f);
        this.A0E.A02(((float) this.A04) / 100.0f);
        this.A0I.A02(((float) this.A09) / 100.0f);
        this.A0C.A02(((float) this.A02) / 100.0f);
        this.A0G.A02(((float) this.A08) / 100.0f);
        this.A0F.A02(((float) this.A06) / 100.0f);
        this.A0H.A02(0.009f);
        int i = this.A07;
        AnonymousClass8U2 r5 = this.A0L;
        switch (Constants.ZERO(9)[Math.min(i, Constants.ZERO(9).length - 1)].intValue()) {
            case 0:
                r5.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
            case 1:
                r5.A02(1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
            case 2:
                r5.A02(1.0f, 0.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
            case 3:
                r5.A02(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
            case 4:
                r5.A02(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                break;
            case 5:
                r5.A02(0.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                break;
            case 6:
                r5.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                break;
            case 7:
                r5.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 1.0f);
                break;
            case 8:
                r5.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
        }
        int i2 = this.A05;
        AnonymousClass8U2 r52 = this.A0K;
        switch (Constants.ZERO(9)[Math.min(i2, Constants.ZERO(9).length - 1)].intValue()) {
            case 0:
                r52.A02(1.0f, 1.0f, 1.0f);
                break;
            case 1:
                r52.A02(1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
            case 2:
                r52.A02(1.0f, 0.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
            case 3:
                r52.A02(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
            case 4:
                r52.A02(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                break;
            case 5:
                r52.A02(0.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                break;
            case 6:
                r52.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
                break;
            case 7:
                r52.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 1.0f);
                break;
            case 8:
                r52.A02(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                break;
        }
        r4.A03("image", r8.getTextureId());
        int AU9 = r9.AU9();
        int AU6 = r9.AU6();
        if (AU9 == AU6) {
            this.A0J.A02(1.0f, 1.0f);
        } else if (AU9 > AU6) {
            this.A0J.A02(((float) AU9) / ((float) AU6), 1.0f);
        } else {
            this.A0J.A02(1.0f, ((float) AU6) / ((float) AU9));
        }
        C1892986r.A04("BasicAdjustFilter.render:setFilterParams");
        this.A0M.A06("position", A0O.A01);
        this.A0M.A06("transformedTextureCoordinate", A0O.A02);
        this.A0M.A06("staticTextureCoordinate", A0O.A02);
        C1892986r.A04("BasicAdjustFilter.render:setCoordinates");
        GLES20.glBindFramebuffer(36160, r9.AMH());
        C1892986r.A04("BasicAdjustFilter.render:glBindFramebuffer");
        C89123tg r0 = this.A0N;
        r9.AaV(r0);
        GLES20.glViewport(r0.A02, r0.A03, r0.A01, r0.A00);
        C1892986r.A04("BasicAdjustFilter.render:glViewport");
        this.A0M.A02();
        C1892986r.A04("BasicAdjustFilter.render:prepareToRender");
        GLES20.glDrawArrays(5, 0, 4);
        C1892986r.A04("BasicAdjustFilter.render:glDrawArrays");
        AoY();
        r7.A05(r8, (C89103tc) null);
    }

    public final void A8Y(C89433uD r2) {
        super.A8Y(r2);
        AnonymousClass8U1 r0 = this.A0M;
        if (r0 != null) {
            GLES20.glDeleteProgram(r0.A00);
            this.A0M = null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A05);
    }

    public BasicAdjustFilter() {
    }

    public BasicAdjustFilter(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        invalidate();
        this.A01 = parcel.readInt();
        invalidate();
        this.A03 = parcel.readInt();
        invalidate();
        this.A04 = parcel.readInt();
        invalidate();
        this.A09 = parcel.readInt();
        invalidate();
        this.A02 = parcel.readInt();
        invalidate();
        this.A08 = parcel.readInt();
        invalidate();
        this.A06 = parcel.readInt();
        invalidate();
        this.A07 = parcel.readInt();
        invalidate();
        this.A05 = parcel.readInt();
        invalidate();
    }
}
