package com.instagram.filterkit.filter;

import android.content.Context;
import android.graphics.Bitmap;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass85B;
import p000X.C18550s2;
import p000X.C89133th;
import p000X.C89213tq;
import p000X.C89393u9;
import p000X.C89433uD;

public class GradientBackgroundVideoFilter extends VideoFilter {
    public final void A0F(C89133th r14, AnonymousClass85B r15, C89433uD r16) {
        float[] fArr = this.A0L;
        float[] fArr2 = this.A0K;
        Bitmap bitmap = this.A05;
        if (!((fArr == null || fArr2 == null) && bitmap == null)) {
            C89393u9 r8 = this.A08;
            if (r8 instanceof C89213tq) {
                C89213tq r82 = (C89213tq) r8;
                if (!(fArr == null || fArr2 == null)) {
                    float f = fArr2[0];
                    float f2 = fArr2[1];
                    float f3 = fArr2[2];
                    float[] fArr3 = r82.A08;
                    fArr3[0] = f;
                    fArr3[1] = f2;
                    fArr3[2] = f3;
                    fArr3[3] = 1.0f;
                    float f4 = fArr[0];
                    float f5 = fArr[1];
                    float f6 = fArr[2];
                    float[] fArr4 = r82.A06;
                    fArr4[0] = f4;
                    fArr4[1] = f5;
                    fArr4[2] = f6;
                    fArr4[3] = 1.0f;
                }
                if (bitmap != null) {
                    r82.A00 = bitmap;
                }
            }
        }
        super.A0F(r14, r15, r16);
    }

    public final void Bbg(C89433uD r9, C89133th r10, AnonymousClass85B r11) {
        A0G(r10, r11, false, false, true, this.A0D, r9);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GradientBackgroundVideoFilter(Context context, AnonymousClass0C1 r4, boolean z, boolean z2, boolean z3) {
        super(context, r4, C18550s2.A00().A04(z3 ? 754 : 753), new C89213tq());
        this.A0F = z;
        AnonymousClass0a4.A0C(this.A03 == 0, "useSamplerExternalOES must be set prior to calling getProgram");
        this.A0J = z2;
    }
}
