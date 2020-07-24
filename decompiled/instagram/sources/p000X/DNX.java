package p000X;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.uimanager.BaseViewManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.DNX */
public abstract class DNX implements Runnable, GLSurfaceView.Renderer {
    public long A00;
    public DOG A01;
    public C30030DNi A02;
    public C30037DNr A03;
    public boolean A04;
    public int A05;
    public List A06;
    public final C192588Li A07;
    public final List A08 = Collections.synchronizedList(new ArrayList());
    public final BlockingQueue A09 = new LinkedBlockingQueue();
    public final Point A0A = new Point(0, 0);
    public final DOI A0B;
    public final Set A0C = new HashSet();
    public final float[] A0D = new float[16];
    public final Handler A0E;

    public C28550Ciq A01() {
        DNY dny = (DNY) this;
        if (dny.A08.isEmpty()) {
            return null;
        }
        return new C28550Ciq(new ArrayList(dny.A08));
    }

    public void A02() {
        DNY dny = (DNY) this;
        dny.A08.clear();
        DNZ dnz = dny.A02;
        if (dnz != null) {
            dnz.A03();
        }
        DNZ dnz2 = dny.A04;
        if (dnz2 != null) {
            dnz2.A03();
        }
        dny.A00 = -1;
    }

    public void A03() {
        DNY dny = (DNY) this;
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClearColor(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        GLES20.glClear(DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        dny.A02.ACb();
        C30037DNr dNr = dny.A03;
        if (dNr != null) {
            dNr.ACb();
        }
    }

    public void A04() {
        ((DNY) this).A06 = true;
    }

    public void A05() {
        DNY dny = (DNY) this;
        C30037DNr dNr = dny.A03;
        if (dNr != null) {
            dNr.BY8();
            if (dny.A05) {
                dny.A05 = false;
                dny.A02.A04(dny.A03);
                dny.A03 = null;
                int size = (dny.A08.size() - 1) - 10;
                if (size >= 0 && dny.A00 != size) {
                    dny.A00 = size;
                    C30037DNr dNr2 = (C30037DNr) dny.A08.get(size);
                    dNr2.BXn();
                    dny.A04.A04(dNr2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if ((r6.A08.size() - 1) <= r6.A00) goto L_0x0036;
     */
    public void A06() {
        boolean z;
        DNY dny = (DNY) this;
        if (!dny.A08.isEmpty()) {
            List list = dny.A08;
            list.remove(list.size() - 1);
        }
        dny.A02.A03();
        DNZ dnz = dny.A03;
        if (dnz != null) {
            dny.A02.A04(dnz);
        }
        int i = 0;
        if (dny.A00 != -1) {
            z = true;
        }
        z = false;
        if (z) {
            i = dny.A00 + 1;
            dny.A02.A04(dny.A04);
        } else {
            dny.A00 = -1;
            dny.A04.A03();
        }
        int size = (dny.A08.size() - 1) - 10;
        while (i < dny.A08.size()) {
            C30037DNr dNr = (C30037DNr) dny.A08.get(i);
            dNr.BXn();
            dny.A02.A04(dNr);
            if (!z && i <= size) {
                boolean z2 = false;
                if (dny.A08.size() > 10) {
                    z2 = true;
                }
                if (z2) {
                    dNr.BXn();
                    dny.A04.A04(dNr);
                    dny.A00 = i;
                }
            }
            i++;
        }
    }

    public void A07(Bitmap bitmap) {
        if (this instanceof DNY) {
            DNY dny = (DNY) this;
            dny.A01 = bitmap;
            DNZ dnz = dny.A02;
            if (dnz != null) {
                DNZ dnz2 = dny.A03;
                AnonymousClass83K r0 = dnz.A04;
                DNZ A002 = DNY.A00(dny, dnz2, r0.getWidth(), r0.getHeight());
                dny.A03 = A002;
                Bitmap bitmap2 = dny.A01;
                DNZ.A01(A002);
                AnonymousClass8EG r1 = new AnonymousClass8EG(bitmap2);
                r1.A01(A002.A02);
                DNZ.A02(A002, r1.A00, A002.A05);
                DNZ.A00();
                dny.A02.A04(dny.A03);
            }
        }
    }

    public void A08(C28550Ciq ciq) {
        DNY dny = (DNY) this;
        if (ciq != null) {
            dny.A08.addAll(ciq.A00);
            int size = (dny.A08.size() - 1) - 10;
            for (int i = 0; i < dny.A08.size(); i++) {
                C30037DNr dNr = (C30037DNr) dny.A08.get(i);
                dNr.BXn();
                dny.A02.A04(dNr);
                if (i <= size) {
                    boolean z = false;
                    if (dny.A08.size() > 10) {
                        z = true;
                    }
                    if (z) {
                        dNr.BXn();
                        dny.A04.A04(dNr);
                        dny.A00 = i;
                    }
                }
            }
        }
    }

    public synchronized void A0B(DMK dmk) {
        C30030DNi dNi = this.A02;
        if (dNi != null && dNi.isValid()) {
            this.A02.BgC(this.A0A);
            this.A02.Bim(this.A0D);
            this.A0C.add(this.A02);
            C30037DNr AAf = this.A02.AAf();
            this.A03 = AAf;
            if (AAf != null) {
                this.A08.add(AAf);
                this.A03.BqC(dmk);
                this.A00 = dmk.A00;
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        AnonymousClass8U3 r1;
        GLES20.glClearColor(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A0B.BQG(this.A07);
        AnonymousClass8U1 A012 = AnonymousClass8NO.A01(this.A07, C0003R.raw.vertex_position, C0003R.raw.fragment);
        C30023DNb.A02 = A012;
        AnonymousClass8U8 A002 = A012.A00("uColor");
        if (A002 instanceof AnonymousClass8U3) {
            r1 = (AnonymousClass8U3) A002;
        } else {
            r1 = null;
        }
        C30023DNb.A03 = r1;
        DNo dNo = new DNo(C30023DNb.A02, 8);
        C30023DNb.A05 = dNo;
        dNo.A03("aPosition", 2, 5126, false, 0);
        ByteBuffer order = ByteBuffer.allocateDirect(C30023DNb.A06.length << 2).order(ByteOrder.nativeOrder());
        order.asFloatBuffer().put(C30023DNb.A06);
        order.rewind();
        C30023DNb.A04 = new C30042DNw(order);
        GLES20.glEnable(3042);
        GLES20.glDisable(2929);
    }

    public void A0A(DMK dmk) {
        C30037DNr dNr = this.A03;
        if (dNr != null) {
            dmk.A00 = Math.max(dmk.A00, this.A00 + 1);
            dNr.ADG(dmk);
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.A0A.set(i, i2);
        gl10.glViewport(0, 0, i, i2);
        Matrix.orthoM(this.A0D, 0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i, (float) i2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -1.0f, 1.0f);
        for (C30030DNi dNi : this.A0C) {
            dNi.Bim(this.A0D);
            dNi.BgC(this.A0A);
        }
    }

    public final void run() {
        C192588Li r1 = this.A07;
        while (!r1.A02.isEmpty()) {
            ((Runnable) r1.A02.remove()).run();
        }
        while (!this.A04 && !this.A09.isEmpty()) {
            MotionEvent motionEvent = (MotionEvent) this.A09.poll();
            A09(motionEvent);
            motionEvent.recycle();
        }
    }

    public DNX(C192588Li r3, DOI doi) {
        this.A07 = r3;
        this.A0B = doi;
        this.A0E = new Handler(Looper.getMainLooper());
        this.A06 = new ArrayList();
    }

    public void A09(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (!(actionMasked == 3 || actionMasked == 6)) {
                        return;
                    }
                } else if (this.A05 == motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8)) {
                    int historySize = motionEvent.getHistorySize();
                    for (int i = 0; i < historySize; i++) {
                        DMK dmk = new DMK(motionEvent, i);
                        C30037DNr dNr = this.A03;
                        if (dNr != null && dmk.A00 > this.A00) {
                            dNr.A9j(dmk);
                            this.A00 = dmk.A00;
                        }
                        this.A06.add(new PointF(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i)));
                    }
                    DMK dmk2 = new DMK(motionEvent);
                    C30037DNr dNr2 = this.A03;
                    if (dNr2 != null && dmk2.A00 > this.A00) {
                        dNr2.A9j(dmk2);
                        this.A00 = dmk2.A00;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            if (this.A05 == motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8)) {
                C30037DNr dNr3 = this.A03;
                if (dNr3 != null) {
                    dNr3.ABL(motionEvent, this.A06);
                }
                A0A(new DMK(motionEvent));
                this.A06.clear();
            }
            if (motionEvent.getPointerCount() == 1) {
                AnonymousClass0ZA.A0E(this.A0E, new DOB(this), -1107456503);
                return;
            }
            return;
        }
        this.A05 = motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8);
        A0B(new DMK(motionEvent));
        AnonymousClass0ZA.A0E(this.A0E, new DOC(this), 1369396005);
    }

    public final void onDrawFrame(GL10 gl10) {
        A05();
        A03();
    }
}
