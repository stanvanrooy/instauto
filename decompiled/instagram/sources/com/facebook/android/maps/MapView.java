package com.facebook.android.maps;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass17U;
import p000X.AnonymousClass19B;
import p000X.AnonymousClass2KP;
import p000X.BVk;
import p000X.BW3;
import p000X.BW4;
import p000X.C229629yN;
import p000X.C25655BTo;
import p000X.C25656BTp;
import p000X.C25657BTq;
import p000X.C25694BVp;
import p000X.C25695BVq;
import p000X.C25698BVt;
import p000X.C25699BVu;
import p000X.C28549Cip;
import p000X.C28708ClO;
import p000X.C28709ClP;
import p000X.C28710ClQ;
import p000X.C28716ClW;
import p000X.C28720Cla;
import p000X.C28721Clc;
import p000X.C28723Cle;
import p000X.C28726Clh;
import p000X.C28727Cli;
import p000X.C28728Clj;
import p000X.C28743Cly;
import p000X.C28749Cm5;
import p000X.C28753Cm9;
import p000X.C28755CmB;
import p000X.C28756CmC;
import p000X.C28767CmN;
import p000X.C28768CmO;
import p000X.C28769CmP;
import p000X.C28770CmQ;
import p000X.C28771CmR;
import p000X.C28778CmY;
import p000X.C28779CmZ;
import p000X.C28785Cmg;
import p000X.C28789Cmk;
import p000X.C28790Cml;
import p000X.C28792Cmn;
import p000X.C28794Cmp;
import p000X.C28796Cmr;
import p000X.C52362Om;

public class MapView extends FrameLayout implements C28755CmB, C28769CmP, C25699BVu, BW3 {
    public static final double A0r = Math.log(2.0d);
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public double A04 = 0.5d;
    public double A05 = 0.5d;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public C28721Clc A0H;
    public C28720Cla A0I;
    public C28789Cmk A0J;
    public C28796Cmr A0K;
    public C28794Cmp A0L = C28794Cmp.A00;
    public Queue A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public float A0R;
    public float A0S;
    public float A0T;
    public long A0U = SystemClock.uptimeMillis();
    public Context A0V;
    public C28726Clh A0W;
    public C28768CmO A0X;
    public C28743Cly A0Y;
    public C28727Cli A0Z;
    public EnumSet A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f = false;
    public boolean A0g;
    public boolean A0h;
    public final Matrix A0i = new Matrix();
    public final Matrix A0j = new Matrix();
    public final BroadcastReceiver A0k = new C25657BTq(this);
    public final ComponentCallbacks A0l = new C28749Cm5(this);
    public final Paint A0m = new Paint(2);
    public final RectF A0n = new RectF();
    public final BVk A0o = new BVk(this);
    public final float[] A0p = new float[2];
    public final float[] A0q = new float[4];

    private void A01() {
        if (!this.A0b) {
            this.A0V.registerComponentCallbacks(this.A0l);
            this.A0V.registerReceiver(this.A0k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.A0b = true;
        }
    }

    private void A02() {
        if (this.A0b) {
            this.A0V.unregisterComponentCallbacks(this.A0l);
            try {
                this.A0V.unregisterReceiver(this.A0k);
            } catch (IllegalArgumentException unused) {
            }
            this.A0b = false;
        }
        this.A0H.A06();
        for (AnonymousClass17U r1 : AnonymousClass17U.A0a) {
            if (r1.A06) {
                synchronized (r1) {
                    AnonymousClass17U.A01(r1);
                }
            } else {
                AnonymousClass17U.A01(r1);
            }
        }
    }

    public static void A0A(MapView mapView) {
        MapView mapView2 = mapView;
        mapView2.A0P = false;
        C28728Clj clj = mapView2.A0H.A0J;
        MapView mapView3 = clj.A00.A07;
        float f = (float) 0;
        LatLng A032 = clj.A03(f, (float) (mapView3.A0B - 0));
        LatLng A033 = clj.A03((float) (mapView3.A0C - 0), (float) (mapView3.A0B - 0));
        LatLng A034 = clj.A03(f, f);
        LatLng A035 = clj.A03((float) (mapView3.A0C - 0), f);
        LatLng latLng = A032;
        double d = latLng.A00;
        double d2 = d;
        double d3 = d;
        double d4 = latLng.A01;
        double d5 = d4;
        double A002 = LatLngBounds.A00(d4, d4);
        int compare = Double.compare(A002, A002);
        double d6 = A034.A00;
        if (d6 > d) {
            d3 = d6;
        } else if (d6 < d) {
            d2 = d6;
        }
        double d7 = A034.A01;
        double A003 = LatLngBounds.A00(d7, d4);
        double A004 = LatLngBounds.A00(d4, d7);
        if (Double.compare(A003, A002) > 0 || Double.compare(A004, A002) > 0) {
            if (A003 <= A004) {
                d4 = d7;
            } else {
                d5 = d7;
            }
        }
        double d8 = A033.A00;
        if (d8 > d3) {
            d3 = d8;
        } else if (d8 < d2) {
            d2 = d8;
        }
        double A005 = LatLngBounds.A00(d4, d5);
        double d9 = A033.A01;
        double A006 = LatLngBounds.A00(d9, d5);
        double A007 = LatLngBounds.A00(d4, d9);
        if (Double.compare(A006, A005) > 0 || Double.compare(A007, A005) > 0) {
            if (A006 <= A007) {
                d4 = d9;
            } else {
                d5 = d9;
            }
        }
        double d10 = A035.A00;
        if (d10 > d3) {
            d3 = d10;
        } else if (d10 < d2) {
            d2 = d10;
        }
        double A008 = LatLngBounds.A00(d4, d5);
        double d11 = A035.A01;
        double A009 = LatLngBounds.A00(d11, d5);
        double A0010 = LatLngBounds.A00(d4, d11);
        if (Double.compare(A009, A008) > 0 || Double.compare(A0010, A008) > 0) {
            if (A009 <= A0010) {
                d4 = d11;
            } else {
                d5 = d11;
            }
        }
        C229629yN r3 = new C229629yN(A032, A033, A034, A035, new LatLngBounds(new LatLng(d2, d5), new LatLng(d3, d4)));
        BVk bVk = mapView.A0o;
        LatLng latLng2 = r3.A02;
        double d12 = latLng2.A00;
        double d13 = latLng2.A01;
        LatLng latLng3 = r3.A01;
        double d14 = latLng3.A00;
        double d15 = latLng3.A01;
        String str = AnonymousClass19B.A0A.A02;
        int i = mapView.A0D;
        bVk.A02 = d12;
        bVk.A03 = d13;
        bVk.A00 = d14;
        bVk.A01 = d15;
        bVk.A07 = str;
        bVk.A04 = i;
        if (!bVk.A08) {
            bVk.A08 = true;
            long nanoTime = System.nanoTime() - bVk.A05;
            long j = bVk.A09;
            if (nanoTime < j) {
                AnonymousClass0ZA.A09(bVk.A0A, new C25698BVt(bVk), TimeUnit.NANOSECONDS.toMillis(j - nanoTime), -963238953);
            } else {
                BVk.A01(bVk);
            }
        }
    }

    public final void A0D() {
        C28721Clc clc = new C28721Clc(this, this.A0I);
        this.A0H = clc;
        CameraPosition cameraPosition = this.A0I.A03;
        if (cameraPosition == null) {
            float f = clc.A01;
            A07((int) f, (f % 1.0f) + 1.0f);
        } else {
            float min = Math.min(Math.max(cameraPosition.A02, clc.A01), clc.A00);
            A07((int) min, (min % 1.0f) + 1.0f);
            LatLng latLng = cameraPosition.A03;
            if (latLng != null) {
                this.A04 = (double) C28728Clj.A02(latLng.A01);
                this.A05 = (double) C28728Clj.A01(latLng.A00);
            }
            this.A09 = cameraPosition.A00;
        }
        this.A0X = clc.A0K;
        Matrix matrix = this.A0i;
        float f2 = this.A0A;
        matrix.setScale(f2, f2);
        this.A0i.postRotate(this.A09);
        this.A0i.invert(this.A0j);
        A09((Bundle) null);
    }

    public final void B0h(float f, float f2) {
        C28726Clh clh;
        this.A0c = false;
        this.A0g = false;
        this.A0T = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        List list = this.A0H.A0N;
        int size = list.size() - 1;
        C28726Clh clh2 = null;
        int i = 0;
        while (true) {
            if (size < 0) {
                clh = clh2;
                break;
            }
            clh = (C28726Clh) list.get(size);
            if (clh.A02) {
                int A032 = clh.A03(f, f2);
                if (A032 == 2) {
                    break;
                } else if (A032 > i) {
                    clh2 = clh;
                    i = A032;
                }
            }
            size--;
        }
        this.A0W = clh;
    }

    public static final double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + ((double) i);
    }

    private void A03() {
        this.A0H.A0L.A0J(true);
        this.A0P = true;
        this.A0H.A06();
        C28743Cly cly = this.A0Y;
        cly.A0E.removeCallbacks(cly);
        cly.A0A = false;
        cly.A05 = false;
        cly.A06 = true;
        cly.A0F.forceFinished(true);
        cly.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        cly.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    private void A04() {
        this.A0H.A0L.A0J(true);
        C28743Cly cly = this.A0Y;
        cly.A0E.removeCallbacks(cly);
        cly.A06 = false;
        cly.A05 = true;
        cly.A0E.postOnAnimation(cly);
    }

    private void A05() {
        RectF rectF = this.A0n;
        rectF.left = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rectF.right = (float) this.A0C;
        rectF.top = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rectF.bottom = (float) this.A0B;
        this.A0j.mapRect(rectF);
        float[] fArr = this.A0q;
        float f = this.A06;
        fArr[0] = -f;
        float f2 = -this.A07;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f2;
        this.A0j.mapVectors(fArr);
        float[] fArr2 = this.A0q;
        float max = Math.max(Math.abs(fArr2[0]), Math.abs(fArr2[2]));
        float max2 = Math.max(Math.abs(fArr2[1]), Math.abs(fArr2[3]));
        float f3 = (float) this.A0F;
        this.A00 = (double) (max / f3);
        this.A01 = (double) (max2 / f3);
    }

    private void A06(float f, float f2, float f3, float f4) {
        float[] fArr = this.A0p;
        fArr[0] = this.A06 - f;
        fArr[1] = this.A07 - f2;
        this.A0j.mapVectors(fArr);
        float[] fArr2 = this.A0p;
        float f5 = fArr2[0];
        long j = this.A0F;
        float f6 = (float) j;
        this.A04 = A00((double) (f3 + (f5 / f6)));
        this.A05 = A0C((double) (f4 + (fArr2[1] / f6)), j);
    }

    private void A07(int i, float f) {
        this.A0D = i;
        this.A0A = f;
        int i2 = 1 << i;
        this.A03 = i2;
        this.A0F = (long) (i2 * this.A0H.A0G);
    }

    private void A09(Bundle bundle) {
        if (bundle != null && bundle.containsKey("zoom")) {
            C28721Clc clc = this.A0H;
            A07((int) Math.min(Math.max((float) bundle.getInt("zoom"), clc.A01), clc.A00), bundle.getFloat("scale"));
            long j = (long) 0;
            this.A04 = bundle.getDouble("xVisibleCenter") - ((double) (j / (this.A0F << 1)));
            this.A05 = bundle.getDouble("yVisibleCenter") - ((double) (j / (this.A0F << 1)));
            this.A09 = bundle.getFloat("rotation");
            Matrix matrix = this.A0i;
            float f = this.A0A;
            matrix.setScale(f, f);
            this.A0i.postRotate(this.A09);
            this.A0i.invert(this.A0j);
            this.A0Q = false;
        }
    }

    private boolean A0B(float f, float f2, float f3) {
        float f4 = this.A0A * f;
        int i = this.A0D;
        while (f4 > 2.0f) {
            f4 /= 2.0f;
            i++;
        }
        while (f4 < 1.0f) {
            f4 *= 2.0f;
            i--;
        }
        return A0H((((float) i) + f4) - 1.0f, f2, f3);
    }

    public final double A0C(double d, long j) {
        double d2 = this.A01 * (((double) this.A0F) / ((double) j));
        double d3 = 1.0d - d2;
        if (d < d2) {
            return d2;
        }
        if (d > d3) {
            return d3;
        }
        return d;
    }

    public final void A0E(float f, float f2) {
        double d = this.A04;
        long j = this.A0F;
        float f3 = (float) j;
        this.A04 = A00(d - ((double) (f / f3)));
        this.A05 = A0C(this.A05 - ((double) (f2 / f3)), j);
    }

    public final void A0F(float f, float f2, float f3) {
        if (this.A0d) {
            this.A0H.A0J.A05(f2, f3, this.A0p);
            float[] fArr = this.A0p;
            float f4 = fArr[0];
            float f5 = fArr[1];
            this.A0i.postRotate(f - this.A09, f2, f3);
            this.A0i.invert(this.A0j);
            this.A09 = f % 360.0f;
            A05();
            A06(f2, f3, f4, f5);
        }
    }

    public final void A0G(C28790Cml cml) {
        Queue queue;
        if (!this.A0e || ((queue = this.A0M) != null && !queue.isEmpty())) {
            if (this.A0M == null) {
                this.A0M = new LinkedList();
            }
            this.A0M.add(cml);
            return;
        }
        cml.BAS(this.A0H);
    }

    public final boolean A0I(float f, float f2, float f3) {
        this.A0H.A0J.A05(f2, f3, this.A0p);
        float[] fArr = this.A0p;
        float f4 = fArr[0];
        float f5 = fArr[1];
        C28721Clc clc = this.A0H;
        float min = Math.min(Math.max(f, clc.A01), clc.A00);
        float f6 = (min % 1.0f) + 1.0f;
        int i = this.A0D;
        float f7 = f6 / this.A0A;
        this.A02 = f7;
        A07((int) min, f6);
        this.A0i.postScale(f7, f7, f2, f3);
        this.A0i.invert(this.A0j);
        A05();
        A06(f2, f3, f4, f5);
        if (this.A0D != i) {
            return true;
        }
        return false;
    }

    public final boolean Ara(float f) {
        A0F(this.A09 + f, this.A0R, this.A0S);
        return true;
    }

    public final boolean Arb(float f) {
        return A0B(f, this.A0R, this.A0S);
    }

    public final void Ask() {
        this.A0H.A03();
        A0A(this);
    }

    public final void BKM(float f, float f2, float f3) {
        if (!this.A0X.A01) {
            return;
        }
        if (this.A0g) {
            A03();
            this.A0R = f2;
            this.A0S = f3;
            A0F(this.A09 + f, f2, f3);
            if (this.A0h) {
                C28743Cly cly = this.A0Y;
                cly.A00 = f;
                cly.A02 = 0;
            }
            invalidate();
            return;
        }
        float f4 = this.A0T + f;
        this.A0T = f4;
        if (Math.abs(f4) > 8.0f) {
            this.A0g = true;
        }
    }

    public final void BKP() {
        if (this.A0X.A01 && this.A0g) {
            this.A0P = false;
            this.A0Y.A07 = true;
            A04();
        }
    }

    public final void BKt(float f, float f2, float f3) {
        if (this.A0X.A03) {
            A03();
            this.A0R = f2;
            this.A0S = f3;
            if (A0B(f, f2, f3) && this.A0h) {
                C28743Cly cly = this.A0Y;
                cly.A01 = f - 1.0f;
                cly.A03 = 0;
            }
            invalidate();
        }
    }

    public final void BL1() {
        if (this.A0X.A03) {
            this.A0P = false;
            this.A0Y.A08 = true;
            A04();
        }
    }

    public final void BLC(float f, float f2, float f3, float f4) {
        if (this.A0X.A02) {
            requestDisallowInterceptTouchEvent(true);
            A03();
            A0E(f3, f4);
            invalidate();
            C28721Clc clc = this.A0H;
            if ((clc.A05 != null || !clc.A0M.isEmpty()) && (Math.abs(f3) > 1.0f || Math.abs(f4) > 1.0f)) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis - this.A0U >= 200) {
                    this.A0H.A03();
                    this.A0U = uptimeMillis;
                }
            }
            this.A0c = true;
        }
    }

    public final void BLJ(float f, float f2) {
        if (this.A0X.A02) {
            this.A0P = false;
            C28743Cly cly = this.A0Y;
            cly.A0F.fling(this.A0C, this.A0B, (int) f, (int) f2, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE, Process.WAIT_RESULT_TIMEOUT, Integer.MAX_VALUE);
            cly.A09 = true;
            A04();
        }
    }

    public float getZoom() {
        return (((float) this.A0D) + this.A0A) - 1.0f;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A09(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        if (this.A0Q) {
            return super.onSaveInstanceState();
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        if (!this.A0Q) {
            long j = (long) 0;
            bundle.putDouble("xVisibleCenter", this.A04 + ((double) (j / (this.A0F << 1))));
            bundle.putDouble("yVisibleCenter", this.A05 + ((double) (j / (this.A0F << 1))));
            bundle.putInt("zoom", this.A0D);
            bundle.putFloat("scale", this.A0A);
            bundle.putFloat("rotation", this.A09);
            this.A0Q = true;
        }
        bundle.putParcelable("parentBundle", onSaveInstanceState);
        return bundle;
    }

    public void setCurrentAttribution(EnumSet enumSet) {
        if (!enumSet.equals(this.A0a)) {
            this.A0a = enumSet;
            C28789Cmk cmk = this.A0J;
            if (cmk != null) {
                cmk.AsS(enumSet);
            }
        }
    }

    public final void setMapEventHandler(C28794Cmp cmp) {
        if (cmp == null) {
            cmp = C28794Cmp.A00;
        }
        this.A0L = cmp;
    }

    private void A08(Context context, C28720Cla cla) {
        this.A0E = System.nanoTime();
        setWillNotDraw(false);
        this.A0V = context;
        this.A0I = cla;
        C28727Cli cli = new C28727Cli(context, this);
        this.A0Z = cli;
        cli.A0K = this.A0j;
        cli.A09 = 0.87f;
        cli.A07 = 0.85f;
        this.A0d = this.A0V.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0h = true;
        C28743Cly cly = new C28743Cly(this, this);
        this.A0Y = cly;
        cly.A04 = this.A0j;
        AnonymousClass19B.A07.add(new WeakReference(this));
        AnonymousClass19B.A00();
    }

    public final boolean A0H(float f, float f2, float f3) {
        if (A0I(f, f2, f3)) {
            this.A0H.A03();
        }
        if (this.A02 != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean Arc(float f, float f2) {
        A0E(f, f2);
        return true;
    }

    public final void Axs() {
        invalidate();
    }

    public final void B0W(float f, float f2) {
        A0A(this);
        C28726Clh clh = this.A0W;
        if ((clh == null || !clh.A07(f, f2)) && this.A0X.A03) {
            Point point = new Point((int) f, (int) f2);
            C28721Clc clc = this.A0H;
            C28549Cip cip = new C28549Cip();
            cip.A02 = 1.0f;
            cip.A03 = (float) point.x;
            cip.A04 = (float) point.y;
            clc.A07(cip, 200, new C28778CmY(this));
        }
    }

    public final void BA3(float f, float f2) {
        A0A(this);
    }

    public final void BBy(float f, float f2) {
        A0A(this);
        if (this.A0X.A03) {
            C28721Clc clc = this.A0H;
            C28549Cip cip = new C28549Cip();
            cip.A02 = -1.0f;
            clc.A07(cip, 200, new C28779CmZ(this));
        }
    }

    public final void BQz(float f, float f2) {
        A0A(this);
        C28726Clh clh = this.A0W;
        if (clh == null || !clh.A08(f, f2)) {
            C28721Clc clc = this.A0H;
            C28726Clh clh2 = clc.A06;
            if (!(clh2 == null || clh2 == null)) {
                clh2.A04();
            }
            clc.A06 = null;
            C28785Cmg cmg = clc.A0D;
            if (cmg != null) {
                clc.A0J.A03(f, f2);
                C28716ClW clW = cmg.A00;
                C28792Cmn cmn = clW.A02;
                C28771CmR cmR = clW.A01;
                AnonymousClass2KP r3 = cmn.A00;
                C28709ClP clP = new C28709ClP(r3.A0J, r3.A0D.A04.A0A);
                r3.A04 = clP;
                clP.A05.add(cmR.A00);
                clP.A04.addAll(C28708ClO.A02(cmR.A01));
                C28710ClQ clQ = new C28710ClQ();
                new Bundle().putString("IgSessionManager.SESSION_TOKEN_KEY", cmn.A00.A0J.getToken());
                AnonymousClass2KP r0 = cmn.A00;
                C52362Om r2 = new C52362Om((FragmentActivity) r0.getContext(), r0.A0J);
                r2.A02 = clQ;
                r2.A07(cmn.A00, 0);
                r2.A02();
                return;
            }
            return;
        }
        C28721Clc clc2 = this.A0H;
        C28726Clh clh3 = this.A0W;
        C28726Clh clh4 = clc2.A06;
        if (!(clh4 == null || clh4 == clh3)) {
            clh4.A04();
        }
        clc2.A06 = clh3;
    }

    public final void BTQ(float f, float f2) {
        A0A(this);
        if (this.A0c && !this.A0Y.A05) {
            this.A0H.A03();
        }
    }

    public EnumSet getCurrentAttribution() {
        return this.A0a;
    }

    public final C28721Clc getMap() {
        return this.A0H;
    }

    public C28789Cmk getOnAttributionChangeListener() {
        return this.A0J;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(985644278);
        super.onAttachedToWindow();
        if (this.A0H != null) {
            A01();
            this.A0G = System.nanoTime();
            if (!this.A0O) {
                this.A0H.A0L.A02.A05();
                this.A0O = true;
            }
            AnonymousClass0Z0.A0D(-761523511, A062);
            return;
        }
        RuntimeException runtimeException = new RuntimeException("MapView.onCreate() must be called!");
        AnonymousClass0Z0.A0D(-512979122, A062);
        throw runtimeException;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0H.A04();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(1407247971);
        super.onDetachedFromWindow();
        this.A0H.A04();
        C25694BVp.A01(new C28767CmN());
        A02();
        AnonymousClass0Z0.A0D(-1826184611, A062);
    }

    public final void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(-987675);
        this.A0N = true;
        int size = this.A0H.A0N.size();
        for (int i = 0; i < size; i++) {
            C28726Clh clh = (C28726Clh) this.A0H.A0N.get(i);
            if (clh.A02) {
                clh.A0C(canvas);
                if (clh instanceof C28753Cm9) {
                    boolean z = this.A0N;
                    boolean z2 = false;
                    if (((C28753Cm9) clh).A03 == 0) {
                        z2 = true;
                    }
                    this.A0N = z & z2;
                }
            }
        }
        if (this.A0N) {
            C28721Clc clc = this.A0H;
            if (this.A0O) {
                C28723Cle cle = clc.A0L;
                String str = this.A0I.A04;
                AnonymousClass17U.A0H.A05(new BW4(cle.A02, str));
                this.A0O = false;
            }
        }
        long nanoTime2 = System.nanoTime();
        String str2 = this.A0I.A04;
        AnonymousClass17U.A0F.A02(nanoTime2 - nanoTime);
        if (this.A0E > 0) {
            AnonymousClass17U.A0G.A05(new C25655BTo(this, nanoTime2, str2));
            this.A0E = 0;
        }
        if (this.A0G > 0) {
            AnonymousClass17U.A0I.A05(new C25656BTp(this, nanoTime2, str2));
            this.A0G = 0;
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long nanoTime = System.nanoTime();
        super.onLayout(z, i, i2, i3, i4);
        this.A0C = getWidth();
        int height = getHeight();
        this.A0B = height;
        int i5 = this.A0C;
        this.A06 = ((float) i5) / 2.0f;
        this.A07 = ((float) height) / 2.0f;
        C28721Clc clc = this.A0H;
        this.A08 = (float) Math.ceil(Math.log((double) ((int) Math.ceil((((double) Math.max(height, i5)) * 1.0d) / ((double) clc.A0G)))) / A0r);
        float max = Math.max(clc.A01, clc.A07.A08);
        clc.A01 = max;
        boolean z2 = false;
        if ((((float) this.A0D) + this.A0A) - 1.0f < max) {
            A07((int) max, (max % 1.0f) + 1.0f);
            z2 = true;
        }
        A05();
        if (!this.A0e) {
            C28721Clc clc2 = this.A0H;
            A0H((((float) this.A0D) + this.A0A) - 1.0f, clc2.A00(), clc2.A01());
            double d = this.A04;
            double d2 = this.A05;
            this.A04 = A00(d);
            this.A05 = A0C(d2, this.A0F);
            float f = this.A09;
            C28721Clc clc3 = this.A0H;
            A0F(f, clc3.A00(), clc3.A01());
            this.A0e = true;
            z2 = true;
        }
        if (z2) {
            this.A0H.A03();
        }
        int size = this.A0H.A0N.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((C28726Clh) this.A0H.A0N.get(i6)).A0B();
        }
        if (this.A0M != null) {
            C25694BVp.A02(new C28756CmC(this));
        }
        AnonymousClass17U.A0L.A02(System.nanoTime() - nanoTime);
        if (!this.A0f) {
            this.A0f = true;
            A0G(new C28770CmQ(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        if (java.lang.Math.abs(r3.A0D - r3.A0B) <= r5) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        if (r3.A0O == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0102, code lost:
        if (r15 != com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e0, code lost:
        if (java.lang.Math.abs(r6 - r3.A01) <= r1) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (java.lang.Math.abs(r6 - r3.A0B) <= r13) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115 A[Catch:{ all -> 0x032e }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011c A[Catch:{ all -> 0x032e }] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int A052 = AnonymousClass0Z0.A05(-995886380);
        long nanoTime = System.nanoTime();
        try {
            C28727Cli cli = this.A0Z;
            MotionEvent motionEvent2 = motionEvent;
            int actionMasked = motionEvent.getActionMasked();
            int pointerCount = motionEvent.getPointerCount();
            long eventTime = motionEvent.getEventTime();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (cli.A0S) {
                if (actionMasked == 2 && pointerCount <= 1) {
                    float abs = Math.abs(x - cli.A0A);
                    float f = (float) cli.A0T;
                    if (abs <= f) {
                    }
                }
                cli.A0S = false;
                AnonymousClass0ZA.A07(C25694BVp.A01, "longPressTimeout");
            }
            if (actionMasked == 2) {
                float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                for (int i = 0; i < pointerCount; i++) {
                    f2 += motionEvent2.getX(i);
                    f3 += motionEvent2.getY(i);
                }
                float f4 = (float) pointerCount;
                float f5 = f2 / f4;
                float f6 = f3 / f4;
                float f7 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    f7 += (float) Math.hypot((double) (motionEvent2.getX(i2) - f5), (double) (motionEvent2.getY(i2) - f6));
                }
                float f8 = f7 / f4;
                cli.A0C = f5;
                cli.A0D = f6;
                Matrix matrix = cli.A0K;
                if (matrix != null) {
                    float[] fArr = cli.A0X;
                    fArr[0] = f5;
                    fArr[1] = f6;
                    matrix.mapPoints(fArr);
                    float[] fArr2 = cli.A0X;
                    f5 = fArr2[0];
                    f6 = fArr2[1];
                }
                float f9 = 1.0f;
                if (pointerCount != cli.A0G) {
                    cli.A02 = f8;
                    cli.A06 = 1.0f;
                    if (pointerCount > 1) {
                        cli.A05 = (float) Math.toDegrees(Math.atan2((double) (y - motionEvent2.getY(1)), (double) (x - motionEvent2.getX(1))));
                    }
                    VelocityTracker velocityTracker2 = cli.A0L;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else {
                    float f10 = f5 - cli.A03;
                    float f11 = f6 - cli.A04;
                    boolean z = cli.A0P;
                    if (!z) {
                        float abs2 = Math.abs(cli.A0C - cli.A0A);
                        float f12 = (float) cli.A0T;
                        if (abs2 <= f12) {
                        }
                        C28755CmB cmB = cli.A0M;
                        float f13 = cli.A0C;
                        float f14 = cli.A0D;
                        float f15 = cli.A09;
                        cmB.BLC(f13, f14, f10 * f15, f15 * f11);
                        velocityTracker = cli.A0L;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent2);
                        }
                        cli.A0P = true;
                        if (pointerCount > 1) {
                            float f16 = cli.A02;
                            if (f16 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                f9 = f8 / f16;
                            }
                            cli.A0M.BKt(1.0f * (f9 / cli.A06), cli.A0C, cli.A0D);
                            cli.A06 = f9;
                            cli.A0O = true;
                            if (cli.A0R) {
                                float degrees = (float) Math.toDegrees(Math.atan2((double) (y - motionEvent2.getY(1)), (double) (x - motionEvent2.getX(1))));
                                if (cli.A0G != pointerCount) {
                                    cli.A05 = degrees;
                                }
                                float f17 = degrees - cli.A05;
                                if (f17 > 180.0f) {
                                    f17 -= 360.0f;
                                } else if (f17 < -180.0f) {
                                    f17 += 360.0f;
                                }
                                cli.A05 = degrees;
                                if (-30.0f < f17 && f17 < 30.0f) {
                                    cli.A0M.BKM(cli.A07 * f17, cli.A0C, cli.A0D);
                                    cli.A0N = true;
                                }
                                if (((double) Math.abs(f17)) > 0.5d) {
                                    cli.A0J = 0;
                                }
                            }
                            if (Math.abs(f8 - cli.A02) > ((float) cli.A0T)) {
                                cli.A0J = 0;
                            }
                        }
                    }
                    if (z) {
                        if (!cli.A0R) {
                        }
                        if (f10 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        }
                        C28755CmB cmB2 = cli.A0M;
                        float f132 = cli.A0C;
                        float f142 = cli.A0D;
                        float f152 = cli.A09;
                        cmB2.BLC(f132, f142, f10 * f152, f152 * f11);
                        velocityTracker = cli.A0L;
                        if (velocityTracker != null) {
                        }
                        cli.A0P = true;
                    }
                    if (pointerCount > 1) {
                    }
                }
                cli.A03 = f5;
                cli.A04 = f6;
                cli.A0G = pointerCount;
            } else if (actionMasked == 0) {
                cli.A0P = false;
                cli.A0O = false;
                cli.A0N = false;
                if (cli.A0Q && eventTime - cli.A0H <= ((long) cli.A0F)) {
                    float abs3 = Math.abs(x - cli.A00);
                    float f18 = (float) cli.A0E;
                    if (abs3 <= f18) {
                    }
                }
                cli.A0Q = false;
                cli.A00 = x;
                cli.A01 = y;
                cli.A0H = eventTime;
                cli.A0A = x;
                cli.A0B = y;
                cli.A0S = true;
                C25695BVq bVq = cli.A0V;
                C25695BVq bVq2 = bVq;
                Object obj = "longPressTimeout";
                AnonymousClass0ZA.A0A(C25694BVp.A01, bVq2, obj, SystemClock.uptimeMillis() + cli.A0U, -1833826995);
                VelocityTracker velocityTracker3 = cli.A0L;
                if (velocityTracker3 == null) {
                    cli.A0L = VelocityTracker.obtain();
                } else {
                    velocityTracker3.clear();
                }
                cli.A0L.addMovement(motionEvent2);
                cli.A0M.B0h(x, y);
            } else if (actionMasked == 1) {
                cli.A0G = 0;
                if (eventTime - cli.A0J < ((long) ViewConfiguration.getTapTimeout())) {
                    cli.A0M.BBy(cli.A03, cli.A04);
                } else {
                    if (cli.A0Q && eventTime - cli.A0H < ((long) cli.A0F)) {
                        float abs4 = Math.abs(x - cli.A00);
                        float f19 = (float) cli.A0E;
                        if (abs4 < f19 && Math.abs(y - cli.A01) < f19) {
                            AnonymousClass0ZA.A07(C25694BVp.A01, "clickTimeout");
                            cli.A0M.B0W(cli.A00, cli.A01);
                        }
                    }
                    if (cli.A0P || cli.A0S) {
                        if (eventTime - cli.A0I < ((long) ViewConfiguration.getDoubleTapTimeout())) {
                            if (cli.A0N) {
                                cli.A0M.BKP();
                            }
                            if (cli.A0O) {
                                cli.A0M.BL1();
                            }
                        }
                        if (cli.A0P) {
                            cli.A0L.addMovement(motionEvent2);
                            cli.A0L.computeCurrentVelocity(1000);
                            float xVelocity = cli.A0L.getXVelocity();
                            float yVelocity = cli.A0L.getYVelocity();
                            if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= cli.A08) {
                                C28755CmB cmB3 = cli.A0M;
                                float f20 = cli.A09;
                                cmB3.BLJ(xVelocity * f20, f20 * yVelocity);
                            }
                        }
                    } else {
                        C25695BVq bVq3 = cli.A0W;
                        AnonymousClass0ZA.A0A(C25694BVp.A01, bVq3, "clickTimeout", SystemClock.uptimeMillis() + ((long) cli.A0F), -1833826995);
                    }
                }
                cli.A0Q = !cli.A0Q;
                cli.A0M.BTQ(cli.A0A, cli.A0B);
            } else if (actionMasked == 5) {
                cli.A0J = eventTime;
            } else if (actionMasked == 6) {
                if (pointerCount == 2) {
                    cli.A0I = eventTime;
                    if (!cli.A0R) {
                        cli.A0O = false;
                        cli.A0N = false;
                    }
                }
            } else if (actionMasked == 3) {
                cli.A0G = 0;
                VelocityTracker velocityTracker4 = cli.A0L;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    cli.A0L = null;
                }
            }
            return true;
        } finally {
            AnonymousClass17U.A0Y.A02(System.nanoTime() - nanoTime);
            AnonymousClass0Z0.A0C(-1976329213, A052);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = AnonymousClass0Z0.A06(1534762860);
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            A01();
        } else {
            A02();
        }
        AnonymousClass0Z0.A0D(1664356537, A062);
    }

    public void setOnAttributionChangeListener(C28789Cmk cmk) {
        this.A0J = cmk;
    }

    public void setOnFirstTileLoadedCallback(C28796Cmr cmr) {
        this.A0K = cmr;
    }

    public MapView(Context context) {
        super(context);
        A08(context, new C28720Cla());
    }

    public MapView(Context context, C28720Cla cla) {
        super(context);
        A08(context, cla);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A08(context, C28720Cla.A00(attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08(context, C28720Cla.A00(attributeSet));
    }
}
