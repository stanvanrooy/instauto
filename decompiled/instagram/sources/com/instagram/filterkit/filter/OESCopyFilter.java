package com.instagram.filterkit.filter;

import android.content.Context;
import android.opengl.GLES20;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass85B;
import p000X.C18550s2;
import p000X.C89123tg;
import p000X.C89133th;
import p000X.C89393u9;
import p000X.C89433uD;

public class OESCopyFilter extends VideoFilter {
    public float[] A00;
    public int A01;
    public final C89123tg A02 = new C89123tg();

    public final void A0D() {
        this.A01 = GLES20.glGetUniformLocation(this.A03, "transformMatrix");
    }

    public final void Bbg(C89433uD r15, C89133th r16, AnonymousClass85B r17) {
        AnonymousClass85B r2 = r17;
        GLES20.glBindFramebuffer(36160, r2.AMH());
        GLES20.glCheckFramebufferStatus(36160);
        GLES20.glClearColor(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        GLES20.glClear(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        GLES20.glUseProgram(A0C());
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, r16.getTextureId());
        GLES20.glEnableVertexAttribArray(this.A0W);
        GLES20.glVertexAttribPointer(this.A0W, 2, 5126, false, 8, this.A0D.A01);
        GLES20.glEnableVertexAttribArray(this.A0Y);
        GLES20.glVertexAttribPointer(this.A0Y, 2, 5126, false, 8, this.A0D.A02);
        int i = this.A0X;
        if (i != -1) {
            GLES20.glEnableVertexAttribArray(i);
            GLES20.glVertexAttribPointer(this.A0X, 2, 5126, false, 8, this.A0D.A02);
        }
        GLES20.glUniformMatrix4fv(this.A01, 1, false, this.A00, 0);
        C89123tg r0 = this.A02;
        r2.AaV(r0);
        GLES20.glViewport(r0.A02, r0.A03, r0.A01, r0.A00);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.A0W);
        GLES20.glDisableVertexAttribArray(this.A0Y);
        int i2 = this.A0X;
        if (i2 != -1) {
            GLES20.glDisableVertexAttribArray(i2);
        }
    }

    public OESCopyFilter(AnonymousClass0C1 r3) {
        super((Context) null, r3, C18550s2.A00().A04(-2), (C89393u9) null);
    }
}
