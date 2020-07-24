package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.List;
import java.util.Map;

/* renamed from: X.CWQ */
public final class CWQ extends C27291Hg implements C27371Ho, C27914CWc, View.OnKeyListener {
    public static final AnonymousClass1EA A0a = AnonymousClass1EA.A01(40.0d, 10.0d);
    public View A00;
    public RecyclerView A01;
    public CWY A02;
    public C27915CWd A03;
    public C27933CWv A04;
    public CWR A05;
    public C27917CWf A06;
    public C27921CWj A07;
    public C27929CWr A08;
    public TouchInterceptorFrameLayout A09;
    public C249616t A0A;
    public AnonymousClass0C1 A0B;
    public Integer A0C = Constants.ZERO;
    public String A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public View A0H;
    public C150406c2 A0I;
    public C226659pC A0J;
    public CAM A0K;
    public final int A0L;
    public final Context A0M;
    public final CAL A0N;
    public final CAL A0O;
    public final AnonymousClass35Q A0P;
    public final C27925CWn A0Q;
    public final C37121j9 A0R;
    public final C476824z A0S;
    public final boolean A0T;
    public final int A0U;
    public final AnonymousClass1HU A0V = new AnonymousClass1HU();
    public final AnonymousClass2X8 A0W;
    public final C102614bo A0X;
    public final String A0Y;
    public final boolean A0Z;

    public final boolean Ago() {
        return true;
    }

    public final void B19(CWY cwy, float f, float f2) {
        CAL cal;
        if ((f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || ((float) (this.A0L >> 1)) < f) && (cal = this.A0O) != null) {
            if (this.A0N.A07) {
                cal.A01();
            } else {
                A01(this, f, f2);
            }
            C22760yx.A00(this.A0B).A00.A5H(C35051fj.A04, (long) this.A0D.hashCode(), "swipe_down_dismiss");
            return;
        }
        A02(this, f, f2);
    }

    public static void A00(CWQ cwq) {
        if (cwq.A0F && cwq.A0G && cwq.A0C == Constants.ZERO) {
            AnonymousClass0ZA.A0B(cwq.A08.A06, 0);
            cwq.A0J.onScrolled(cwq.A01, 0, 0);
        }
    }

    public static void A01(CWQ cwq, float f, float f2) {
        cwq.A0C = Constants.A0C;
        C476524w A0S2 = C476624x.A07(cwq.A09).A0T(true).A0S(A0a);
        A0S2.A09 = cwq.A0S;
        A0S2.A0A = cwq.A0W;
        A0S2.A0B = cwq.A0X;
        float f3 = (float) cwq.A0L;
        A0S2.A0K(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f3);
        A0S2.A03 = f / f3;
        A0S2.A0P(f2 / f3).A0O();
    }

    public static void A02(CWQ cwq, float f, float f2) {
        cwq.A0C = Constants.ONE;
        C476524w A0S2 = C476624x.A07(cwq.A00).A0T(true).A0S(A0a);
        A0S2.A09 = cwq.A0S;
        A0S2.A0A = cwq.A0W;
        A0S2.A0B = cwq.A0X;
        float f3 = (float) cwq.A0L;
        A0S2.A0K(f3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0S2.A03 = (f3 - f) / f3;
        A0S2.A0P(f2 / f3).A0O();
    }

    public final View A03() {
        if (this.A0H == null) {
            View inflate = LayoutInflater.from(this.A03.A00).inflate(C0003R.layout.canvas_main_layout, (ViewGroup) null, false);
            inflate.setTag(new CXD((ViewGroup) inflate.findViewById(C0003R.C0005id.root), (RecyclerView) inflate.findViewById(C0003R.C0005id.listview), inflate.findViewById(C0003R.C0005id.footer_container), inflate.findViewById(C0003R.C0005id.header_container)));
            this.A0H = inflate;
            this.A01 = (RecyclerView) inflate.findViewById(C0003R.C0005id.listview);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
            gridLayoutManager.A23(new C27912CWa(this));
            this.A01.setLayoutManager(gridLayoutManager);
            this.A01.setAdapter(this.A0Q);
            RecyclerView recyclerView = this.A01;
            recyclerView.setHasFixedSize(true);
            recyclerView.requestFocus();
            this.A01.setOnKeyListener(this);
            this.A08 = new C27929CWr(this.A0M, this.A0Q, this.A01, this.A0B, getModuleName());
            this.A0I = new C150406c2(this.A0M, this.A01);
            this.A0V.A0C(this.A08);
            this.A0V.A0C(this.A0I);
            this.A0Q.A01 = this.A08;
            CWR cwr = new CWR(this, this.A0T, this.A0B);
            this.A05 = cwr;
            this.A0V.A0C(cwr);
            CWZ cwz = new CWZ(this.A0Q);
            RecyclerView recyclerView2 = this.A01;
            C226659pC r5 = new C226659pC(recyclerView2, cwz, new CWS(cwz, this.A05, recyclerView2));
            this.A0J = r5;
            this.A01.A0w(r5);
            C06220Of.A0Q(this.A01, this.A0U);
        }
        return this.A0H;
    }

    public final void A04() {
        if (this.A0F) {
            this.A00.setVisibility(8);
            if (this.A0H.getParent() != null) {
                ((ViewGroup) this.A0H.getParent()).removeView(this.A0H);
            }
            this.A08.BE0();
            this.A0F = false;
            for (AnonymousClass1GK r3 : this.A0P.A03.values()) {
                DLog.m40d(DLogTag.CANVAS, AnonymousClass000.A0E("Cancel ", AnonymousClass35Q.A00(r3.A04.A01)), new Object[0]);
                r3.A03();
            }
            long j = 0;
            if (this.A0T) {
                this.A0K.BE0();
                j = this.A0K.A01;
            }
            CWR cwr = this.A05;
            C249616t r12 = this.A0A;
            C27917CWf cWf = this.A06;
            boolean z = this.A08.A03.A07;
            CWR.A00(cwr);
            Map map = cwr.A07;
            C27371Ho r1 = cwr.A03;
            long j2 = cwr.A01;
            int i = cwr.A00;
            Map map2 = cwr.A06;
            boolean z2 = cwr.A08;
            AnonymousClass0C1 r7 = cwr.A04;
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (z2) {
                f = 1.0f;
            }
            for (Float floatValue : map.values()) {
                f += floatValue.floatValue();
            }
            C37141jB A022 = C36901in.A02("canvas_exit", r1, r12, cWf);
            A022.A1t = j2;
            A022.A0G = f / ((float) i);
            A022.A5O = map2;
            A022.A1n = j;
            A022.A2A = Boolean.valueOf(z);
            C36901in.A03(AnonymousClass0WN.A01(r7), A022.A03(), Constants.ONE);
            C22760yx.A00(this.A0B).A00.A5H(C35051fj.A04, (long) this.A0D.hashCode(), "unbound");
        }
    }

    public final void AyU() {
        if (this.A0F) {
            this.A0V.A00();
        }
    }

    public final void Azd() {
        if (this.A0F) {
            this.A0V.A01();
        }
    }

    public final void Azh() {
        if (this.A0F) {
            this.A02.A03 = true;
            this.A0V.A02();
        }
    }

    public final void B12(CWY cwy, float f) {
        this.A00.setTranslationY(f);
        this.A0W.BGF(C476624x.A07(this.A00), f / ((float) this.A0L));
    }

    public final boolean B1I(CWY cwy, float f, int i) {
        if (!this.A0F || i != 2 || ((LinearLayoutManager) this.A01.A0L).A1g() != 0 || this.A01.getChildAt(0).getTop() - this.A01.getPaddingTop() != 0 || C476624x.A07(this.A00).A0U()) {
            return false;
        }
        this.A0C = Constants.A0C;
        C476624x.A07(this.A00).A0K(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A0L);
        return true;
    }

    public final void BE0() {
        if (this.A0F) {
            if (this.A0C != Constants.ZERO) {
                C476624x.A07(this.A00).A0N();
            }
            this.A0V.A03();
        }
    }

    public final void BJx() {
        if (this.A0F) {
            this.A0V.A04();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!this.A0F || !this.A08.onKey(view, i, keyEvent)) {
            return false;
        }
        return true;
    }

    public CWQ(CAL cal, String str, boolean z, CAL cal2, AnonymousClass35Q r9, C37121j9 r10, List list, AnonymousClass0C1 r12, boolean z2, CAM cam, int i) {
        String A0E2;
        this.A0N = cal;
        this.A0O = cal2;
        this.A0E = list;
        this.A0B = r12;
        if (TextUtils.isEmpty(str)) {
            A0E2 = "canvas";
        } else {
            A0E2 = AnonymousClass000.A0E("canvas_", str);
        }
        this.A0Y = A0E2;
        this.A0Z = z;
        this.A07 = new C27921CWj();
        Context context = this.A0N.getContext();
        this.A0M = context;
        this.A0R = r10;
        this.A02 = new CWY(context);
        C27925CWn cWn = new C27925CWn(new CXE(), this, this.A0M);
        this.A0Q = cWn;
        Context context2 = this.A0M;
        this.A03 = new C27915CWd(context2, cWn, this.A07, this);
        this.A0P = r9;
        this.A0T = z2;
        this.A0K = cam;
        this.A0U = i;
        this.A0S = new CWU(this);
        this.A0W = new CWV(this);
        this.A0X = new CWT(this);
        this.A0L = C06220Of.A08(context2);
        this.A0B = AnonymousClass0J1.A06(this.A0N.mArguments);
    }

    public final boolean Ahq() {
        return this.A0Z;
    }

    public final void Ayk(View view) {
        this.A09 = (TouchInterceptorFrameLayout) view.findViewById(C0003R.C0005id.layout_container_main);
        this.A00 = view.findViewById(C0003R.C0005id.canvas_container);
        CWY cwy = this.A02;
        this.A09.A00(new CWW(cwy), new CWX(cwy));
        if (this.A0F) {
            this.A0V.A0A(this.A0H);
        }
    }

    public final String getModuleName() {
        return this.A0Y;
    }
}
