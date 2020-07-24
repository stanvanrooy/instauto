package p000X;

import android.opengl.GLES20;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.DNZ */
public final class DNZ implements DOF {
    public static final byte[] A09 = {1, -1, 1, 1, -1, -1, 0, 1, 1, 1, 1, 0, -1, 1, 0, 0};
    public static final byte[] A0A = {1, 1, 1, 1, -1, 1, 0, 1, 1, -1, 1, 0, -1, -1, 0, 0};
    public float A00 = 1.0f;
    public int A01 = 16777215;
    public C192588Li A02;
    public DO8 A03 = DO8.A08;
    public final AnonymousClass83K A04;
    public final DNo A05;
    public final AnonymousClass8U1 A06;
    public final AnonymousClass8U3 A07;
    public final DNo A08;

    public final void BY8() {
    }

    public static void A00() {
        C1892986r.A03("before donetargeting");
        GLES20.glBindFramebuffer(36160, 0);
        C1892986r.A03("after donetargeting");
    }

    public static void A01(DNZ dnz) {
        C1892986r.A03("before target drawbacking for drawing");
        GLES20.glBindFramebuffer(36160, dnz.A04.AMH());
        C1892986r.A03("target drawbacking for drawing");
    }

    public static void A02(DNZ dnz, int i, DNo dNo) {
        dnz.A03.A00();
        dnz.A07.A03(dnz.A01, dnz.A00);
        dnz.A06.A03("uTexture", i);
        dnz.A06.A02();
        GLES20.glBindBuffer(34962, 0);
        dNo.A00();
        GLES20.glDrawArrays(5, 0, 4);
        dNo.A01();
    }

    public final void ACb() {
        A02(this, this.A04.getTextureId(), this.A08);
    }

    public final void ACg() {
        throw new UnsupportedOperationException();
    }

    public DNZ(C192588Li r3, int i, int i2) {
        this.A02 = r3;
        this.A04 = r3.A01.A03.A01(i, i2);
        C30031DNj dNj = (C30031DNj) r3.A00(C30031DNj.class);
        this.A06 = dNj.A00;
        this.A07 = dNj.A01;
        this.A08 = dNj.A03;
        this.A05 = dNj.A02;
    }

    public final void A03() {
        A01(this);
        GLES20.glClearColor(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        GLES20.glClear(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        A00();
    }

    public final void A04(DOF dof) {
        dof.BY8();
        A01(this);
        dof.ACb();
        A00();
    }
}
