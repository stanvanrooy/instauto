package com.instagram.filterkit.filter;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.FloatBuffer;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass85B;
import p000X.C89133th;
import p000X.C89393u9;
import p000X.C89403uA;
import p000X.C89433uD;
import p000X.C89453uF;

public class MaskingTextureFilter extends VideoFilter {
    public int A00;
    public final FloatBuffer A01;
    public final FloatBuffer A02;

    public MaskingTextureFilter(Context context, AnonymousClass0C1 r4, C89403uA r5) {
        super(context, r4, r5, (C89393u9) null);
        float[][] fArr = C89453uF.A00;
        this.A02 = C89453uF.A01(fArr[0]);
        this.A01 = C89453uF.A01(fArr[4]);
    }

    public final void A0D() {
        super.A0D();
        this.A00 = GLES20.glGetAttribLocation(this.A03, "maskingTextureCoordinate");
    }

    public final void A0E(C89133th r2, AnonymousClass85B r3) {
        super.A0E(r2, r3);
        GLES20.glDisableVertexAttribArray(this.A00);
    }

    public final void A0F(C89133th r8, AnonymousClass85B r9, C89433uD r10) {
        FloatBuffer floatBuffer;
        super.A0F(r8, r9, r10);
        GLES20.glEnableVertexAttribArray(this.A00);
        int i = this.A00;
        if (this.A0F) {
            floatBuffer = this.A01;
        } else {
            floatBuffer = this.A02;
        }
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, floatBuffer);
    }
}
