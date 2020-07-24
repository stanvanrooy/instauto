package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.CAM */
public final class CAM extends C27291Hg implements C27371Ho, AnonymousClass1E8, AnonymousClass1RK, AnonymousClass1RM, AnonymousClass1RN, View.OnKeyListener {
    public static final AnonymousClass1EA A0N = AnonymousClass1EA.A00(3.0d, 5.0d);
    public long A00;
    public long A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public CAO A05;
    public AnonymousClass1RS A06;
    public boolean A07 = true;
    public boolean A08;
    public Drawable A09;
    public TouchInterceptorFrameLayout A0A;
    public final int A0B;
    public final View.OnTouchListener A0C = new CAP(this);
    public final C256319p A0D = new CAN(this);
    public final AnonymousClass1EG A0E;
    public final CAW A0F;
    public final AnonymousClass1NJ A0G;
    public final C36841ih A0H;
    public final AnonymousClass0C1 A0I;
    public final int[] A0J;
    public final int[] A0K;
    public final String A0L;
    public final boolean A0M;

    public final boolean Ago() {
        return true;
    }

    public final void Azh() {
        this.A06 = null;
        this.A04 = null;
        this.A09 = null;
        this.A0A = null;
        this.A02 = null;
        this.A03 = null;
    }

    public final void BE0() {
        this.A08 = false;
        if (this.A0G.AiO()) {
            AnonymousClass1RS r2 = this.A06;
            if (r2.A0C() == C36341ht.PLAYING) {
                r2.A0E();
            }
        }
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.A0x(this.A0D);
            this.A04.setOnTouchListener((View.OnTouchListener) null);
        }
        if (!this.A07) {
            this.A07 = true;
            long currentTimeMillis = System.currentTimeMillis();
            this.A01 += currentTimeMillis - this.A00;
            this.A00 = currentTimeMillis;
        }
    }

    public final void BFF(AnonymousClass1NJ r1, int i) {
    }

    public final void BJx() {
        this.A08 = true;
        A02();
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.A0w(this.A0D);
            this.A04.setOnTouchListener(this.A0C);
        }
        A00(this);
    }

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOH(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public static void A00(CAM cam) {
        boolean z;
        if (cam.A07) {
            RecyclerView recyclerView = cam.A04;
            if (recyclerView == null || !recyclerView.isLaidOut()) {
                z = cam.A08;
            } else {
                int i = 0;
                AnonymousClass1ZK A0O = cam.A04.A0O(0);
                if (A0O != null) {
                    i = A0O.itemView.getTop();
                }
                z = false;
                if (i > 0) {
                    z = true;
                }
            }
            if (z) {
                cam.A00 = System.currentTimeMillis();
                cam.A07 = false;
            }
        }
    }

    public static boolean A01(CAM cam) {
        RecyclerView recyclerView = cam.A04;
        if (recyclerView == null || !recyclerView.isLaidOut()) {
            return cam.A08;
        }
        int i = 0;
        AnonymousClass1ZK A0O = cam.A04.A0O(0);
        if (A0O != null) {
            i = A0O.itemView.getTop();
        }
        if (((float) i) > ((float) cam.A0B) * 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r2 == p000X.C36341ht.PAUSED) goto L_0x0017;
     */
    public final void A02() {
        boolean z;
        if (this.A0G.AiO()) {
            AnonymousClass1RS r3 = this.A06;
            C36341ht A0C2 = r3.A0C();
            if (A0C2 != C36341ht.IDLE) {
                z = false;
            }
            z = true;
            if (!this.A08 || !z || (!C36351hu.A00(r3.A0H).A01())) {
                CAO cao = this.A05;
                C36341ht A0C3 = this.A06.A0C();
                if (A0C3 == C36341ht.IDLE || A0C3 == C36341ht.PAUSED) {
                    cao.A03.A01.A01().setVisibility(0);
                }
            } else if (A01(this)) {
                AnonymousClass1RS r2 = this.A06;
                if (r2.A0C() == C36341ht.PAUSED) {
                    r2.A0F();
                } else {
                    r2.A0J(this.A0G, this.A05, 0, -1, this.A0H.A02(), true, this);
                }
            }
        }
    }

    public final void A03(CAO cao) {
        AnonymousClass1NJ r2 = this.A0G;
        if (r2.AiO()) {
            this.A06.A0I(r2, 0, -1, this.A0H.A02(), cao, this.A0H.A10, this);
            this.A06.A0H(this.A0G);
        }
    }

    public final C32141af Aa7(int i, AnonymousClass1NJ r3) {
        return this.A06.Aa7(i, r3);
    }

    public final void BPF(AnonymousClass1NJ r2, int i, int i2, int i3) {
        this.A0H.A07(i);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!this.A0G.AiO() || !this.A06.onKey(view, i, keyEvent)) {
            return false;
        }
        return true;
    }

    public CAM(AnonymousClass1NJ r6, AnonymousClass1HD r7, String str, boolean z, AnonymousClass0C1 r10, int i, int[] iArr, int[] iArr2, int i2, String str2) {
        String A0E2;
        this.A0I = r10;
        if (TextUtils.isEmpty(str)) {
            A0E2 = "canvas";
        } else {
            A0E2 = AnonymousClass000.A0E("canvas_", str);
        }
        this.A0L = A0E2;
        this.A0M = z;
        Context context = r7.getContext();
        this.A0F = new CAW();
        r6 = r6.A1X() ? r6.A0O() : r6;
        this.A0G = r6;
        C36841ih r0 = new C36841ih(r6);
        this.A0H = r0;
        r0.A07(i2);
        this.A0J = iArr;
        this.A0K = iArr2;
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(A0N);
        A002.A06 = true;
        this.A0E = A002;
        AnonymousClass1RR r2 = new AnonymousClass1RR(context, this, r10, str2);
        r2.A01 = true;
        r2.A02 = true;
        r2.A03 = true;
        if (((Boolean) C05680Ln.APS.A01(this.A0I)).booleanValue()) {
            r2.A06 = true;
        }
        AnonymousClass1RS A003 = r2.A00();
        this.A06 = A003;
        A003.A0K.add(this);
        this.A0B = i;
    }

    public final Integer AaD(AnonymousClass1NJ r2) {
        if (!r2.AiO() || r2.equals(this.A06.A0B())) {
            return Constants.ONE;
        }
        return Constants.ZERO;
    }

    public final boolean Ahq() {
        return this.A0M;
    }

    public final void Ayk(View view) {
        this.A0A = (TouchInterceptorFrameLayout) view.findViewById(C0003R.C0005id.layout_container_main);
        this.A02 = view.findViewById(C0003R.C0005id.canvas_container);
        this.A03 = ((ViewStub) view.findViewById(C0003R.C0005id.fixed_header_stub)).inflate();
        this.A0A.setBackgroundColor(-1);
        this.A09 = this.A0A.getBackground();
    }

    public final void BOK(AnonymousClass1EG r16) {
        float A002 = (float) r16.A00();
        double d = (double) A002;
        int i = this.A0J[1];
        this.A03.setTranslationY(((float) C27181Gu.A01(d, 0.0d, 1.0d, 0.0d, (double) (-i))) + ((float) i));
        this.A03.setTranslationX((float) C27181Gu.A01(d, 0.0d, 1.0d, (double) this.A0J[0], 0.0d));
        if (this.A0K != null) {
            this.A03.setScaleX(A002);
            this.A03.setScaleY(A002);
        }
        this.A09.setAlpha(Math.round(A002 * 255.0f));
    }

    public final void BVf(View view, Bundle bundle) {
        super.BVf(view, bundle);
        if (bundle == null) {
            this.A03.getViewTreeObserver().addOnPreDrawListener(new AG3(this));
        }
    }

    public final String getModuleName() {
        return this.A0L;
    }
}
