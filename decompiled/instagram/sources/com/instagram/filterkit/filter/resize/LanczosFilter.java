package com.instagram.filterkit.filter.resize;

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
import p000X.AnonymousClass8U6;
import p000X.AnonymousClass8UD;
import p000X.C05760Lv;
import p000X.C1887884o;
import p000X.C1888784z;
import p000X.C1892986r;
import p000X.C89103tc;
import p000X.C89123tg;
import p000X.C89133th;
import p000X.C89433uD;
import p000X.C89453uF;
import p000X.C89463uG;

public class LanczosFilter extends BaseFilter {
    public static final C89463uG A0F = C89453uF.A00();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(335);
    public int A00 = Integer.MAX_VALUE;
    public C1887884o A01;
    public C1887884o A02;
    public AnonymousClass8U1 A03;
    public AnonymousClass8U1 A04;
    public AnonymousClass8U6 A05;
    public AnonymousClass8U6 A06;
    public AnonymousClass8U6 A07;
    public AnonymousClass8U6 A08;
    public AnonymousClass8U6 A09;
    public AnonymousClass8U6 A0A;
    public AnonymousClass8UD A0B;
    public AnonymousClass8UD A0C;
    public C89123tg A0D = new C89123tg();
    public final boolean A0E;

    public final int describeContents() {
        return 0;
    }

    public final void A8Y(C89433uD r3) {
        AnonymousClass8U1 r0 = this.A03;
        if (r0 != null) {
            GLES20.glDeleteProgram(r0.A00);
            this.A03 = null;
        }
        AnonymousClass8U1 r02 = this.A04;
        if (r02 != null) {
            GLES20.glDeleteProgram(r02.A00);
            this.A04 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0188, code lost:
        if (r5.A01.A00(r10, r5.A00) != false) goto L_0x018a;
     */
    public final void Bbg(C89433uD r19, C89133th r20, AnonymousClass85B r21) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        GLES20.glFlush();
        C89433uD r6 = r19;
        if (!r6.A04.contains(this)) {
            if (this.A0E) {
                str = "LanczosLinearSpaceX";
            } else {
                str = "LanczosX";
            }
            int A002 = ShaderBridge.A00(str);
            if (A002 == 0) {
                C05760Lv.A01.A00.edit().putBoolean("needs_lanczos_fallback", true).apply();
                if (this.A0E) {
                    str4 = "LanczosLinearSpaceXFixed";
                } else {
                    str4 = "LanczosXFixed";
                }
                A002 = ShaderBridge.A00(str4);
            }
            if (A002 != 0) {
                if (this.A0E) {
                    str2 = "LanczosLinearSpaceY";
                } else {
                    str2 = "LanczosY";
                }
                int A003 = ShaderBridge.A00(str2);
                if (A003 == 0) {
                    C05760Lv.A01.A00.edit().putBoolean("needs_lanczos_fallback", true).apply();
                    if (this.A0E) {
                        str3 = "LanczosLinearSpaceYFixed";
                    } else {
                        str3 = "LanczosYFixed";
                    }
                    A003 = ShaderBridge.A00(str3);
                }
                if (A003 != 0) {
                    this.A03 = new AnonymousClass8U1(A002);
                    this.A04 = new AnonymousClass8U1(A003);
                    this.A0C = (AnonymousClass8UD) this.A03.A00("srcWidth");
                    this.A0B = (AnonymousClass8UD) this.A04.A00("srcHeight");
                    this.A09 = (AnonymousClass8U6) this.A03.A00("scale");
                    this.A05 = (AnonymousClass8U6) this.A03.A00("lanczosFactor");
                    this.A07 = (AnonymousClass8U6) this.A03.A00("srcLanczosFactor");
                    this.A0A = (AnonymousClass8U6) this.A04.A00("scale");
                    this.A06 = (AnonymousClass8U6) this.A04.A00("lanczosFactor");
                    this.A08 = (AnonymousClass8U6) this.A04.A00("srcLanczosFactor");
                    this.A01 = new C1887884o(this.A03);
                    this.A02 = new C1887884o(this.A04);
                    r6.A04(this);
                }
            }
            throw new AnonymousClass85G();
        }
        C89133th r8 = r20;
        int height = r8.getHeight();
        int width = r8.getWidth();
        AnonymousClass85B r7 = r21;
        int AU6 = r7.AU6();
        int AU9 = r7.AU9();
        this.A0C.A02(width);
        float f = ((float) width) / ((float) AU9);
        this.A09.A02(f);
        this.A05.A02(2.0f);
        this.A07.A02(f * 2.0f);
        this.A03.A06("position", A0F.A01);
        this.A03.A06("transformedTextureCoordinate", A0F.A02);
        this.A03.A06("staticTextureCoordinate", A0F.A02);
        this.A03.A04("image", r8.getTextureId(), Constants.ZERO, Constants.ONE);
        C1888784z r4 = new C1888784z(AU9, height);
        GLES20.glBindFramebuffer(36160, r4.AMH());
        boolean A042 = C1892986r.A04("glBindFramebuffer");
        AnonymousClass0DB.A0D("LanczosFilter", String.format("First pass: %dx%d", new Object[]{Integer.valueOf(r4.getWidth()), Integer.valueOf(r4.getHeight())}));
        C89123tg r10 = this.A0D;
        r4.AaV(r10);
        if (!A042) {
            z = false;
        }
        z = true;
        if (!z) {
            this.A0B.A02(height);
            float f2 = ((float) height) / ((float) AU6);
            this.A0A.A02(f2);
            this.A06.A02(2.0f);
            this.A08.A02(f2 * 2.0f);
            this.A04.A06("position", A0F.A01);
            this.A04.A06("transformedTextureCoordinate", A0F.A02);
            this.A04.A06("staticTextureCoordinate", A0F.A02);
            this.A04.A04("image", r4.getTextureId(), Constants.ZERO, Constants.ONE);
            GLES20.glBindTexture(3553, r4.getTextureId());
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9728);
            GLES20.glBindFramebuffer(36160, r7.AMH());
            boolean z2 = true;
            AnonymousClass0DB.A0D("LanczosFilter", String.format("Second pass %dx%d", new Object[]{Integer.valueOf(r7.getWidth()), Integer.valueOf(r7.getHeight())}));
            boolean A043 = C1892986r.A04("glBindFramebuffer");
            C89123tg r2 = this.A0D;
            r7.AaV(r2);
            if (!A043 && !this.A02.A00(r2, this.A00)) {
                z2 = false;
            }
            AoY();
            r4.cleanup();
            r6.A05(r8, (C89103tc) null);
            if (!z2) {
                this.A00 = false;
                return;
            } else {
                r6.A05(r7, (C89103tc) null);
                r6.A03(this);
            }
        } else {
            GLES20.glBindTexture(3553, r8.getTextureId());
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            r4.cleanup();
            r6.A03(this);
        }
        throw new AnonymousClass85G();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A0E ? 1 : 0);
    }

    public final void Bio(int i) {
        this.A00 = i;
    }

    public LanczosFilter(Parcel parcel) {
        this.A0E = parcel.readInt() != 1 ? false : true;
    }

    public LanczosFilter(boolean z) {
        this.A0E = z;
    }
}
