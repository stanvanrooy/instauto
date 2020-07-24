package p000X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.CAL */
public final class CAL extends C27341Hl implements AnonymousClass1HK {
    public CWQ A00;
    public C23974AeZ A01;
    public CAM A02;
    public C249616t A03;
    public AnonymousClass0C1 A04;
    public SpinnerImageView A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public Reel A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;

    public final void A00() {
        if (!this.A0K || this.A07) {
            A01();
            return;
        }
        CWQ cwq = this.A00;
        CWQ.A01(cwq, cwq.A00.getTranslationY(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void A01() {
        ViewGroup viewGroup;
        this.A00.A04();
        C23974AeZ aeZ = this.A01;
        if (!(aeZ == null || (viewGroup = aeZ.A01) == null || viewGroup.getChildCount() == 0)) {
            long now = aeZ.A04.now() - aeZ.A00;
            boolean z = true;
            for (Map.Entry entry : aeZ.A05.entrySet()) {
                if (((C23968AeT) entry.getValue()).A00 == Constants.ZERO) {
                    entry.getValue();
                    z = false;
                }
            }
            C23975Aea aea = new C23975Aea(aeZ);
            if (now > 12000 || z) {
                aea.run();
            } else {
                AnonymousClass0ZA.A09(aeZ.A03, aea, 12000 - now, 1556200661);
            }
        }
        C22760yx.A00(this.A04).A00.ADC(C35051fj.A04, (long) this.A06.hashCode());
        if (this.A07) {
            getActivity().finish();
            return;
        }
        if (getActivity().getParent() instanceof C26301Cs) {
            ((C26301Cs) getActivity().getParent()).Bl6(0);
        }
        this.mFragmentManager.A0W();
    }

    public final void A02(boolean z) {
        this.A05.setLoadingStatus(C168617Hz.LOADING);
        AnonymousClass2CP r2 = new AnonymousClass2CP(this.A06, this.A0C);
        r2.A02 = this;
        r2.A04 = z;
        r2.A00 = C06220Of.A0B(getContext()).heightPixels;
        r2.A01 = C06220Of.A0B(getContext()).widthPixels;
        r2.A03 = this.A04;
        new AnonymousClass2CQ(r2).A00();
    }

    public final boolean onBackPressed() {
        C22760yx.A00(this.A04).A00.A5H(C35051fj.A04, (long) this.A06.hashCode(), C193418Ps.$const$string(84));
        A00();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String A0E2;
        int i;
        int A022 = AnonymousClass0Z0.A02(-2044215473);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        Bundle bundle3 = this.mArguments;
        this.A04 = AnonymousClass0J1.A06(bundle3);
        this.A06 = bundle3.getString(AnonymousClass0C5.$const$string(149));
        String $const$string = C193418Ps.$const$string(37);
        this.A0F = bundle3.getString($const$string);
        this.A0N = bundle3.getBoolean($const$string);
        this.A0H = bundle3.getString(AnonymousClass0C5.$const$string(173));
        this.A0D = bundle3.getString(C193418Ps.$const$string(36));
        this.A0G = bundle3.getString(C193418Ps.$const$string(39));
        this.A09 = bundle3.getInt(AnonymousClass0C5.$const$string(174));
        this.A0I = bundle3.getString(C193418Ps.$const$string(41));
        this.A0A = bundle3.getInt(C193418Ps.$const$string(40));
        this.A0J = bundle3.getStringArrayList(C193418Ps.$const$string(38));
        this.A0B = C17020pY.A00().A0Q(this.A04).A0G(this.A0G);
        this.A0K = bundle3.getBoolean(AnonymousClass0C5.$const$string(148));
        boolean z = false;
        this.A0M = bundle3.getBoolean("CanvasFragment.ARGUMENTS_CANVAS_FORCE_REFRESH", false);
        this.A07 = bundle3.getBoolean(AnonymousClass40t.$const$string(63), false);
        if (TextUtils.isEmpty(this.A0F)) {
            A0E2 = "canvas";
        } else {
            A0E2 = AnonymousClass000.A0E("canvas_", this.A0F);
        }
        this.A0E = A0E2;
        if (bundle != null) {
            this.A0L = bundle2.getBoolean("CanvasFragment.IS_FIRST_LOAD");
        }
        String string = bundle3.getString(C193418Ps.$const$string(32));
        if (string != null) {
            try {
                AnonymousClass2CR.A04.A01(this.A06, (CYD) new AnonymousClass25W(AnonymousClass2CT.class, true).A01(string), this.A04);
            } catch (Exception unused) {
            }
        }
        C37121j9 r15 = null;
        if (this.A0B != null) {
            r15 = C17020pY.A00().A0C(this.A04, this.A0H, this.A0I, this.A0B, this.A09, this.A0A);
        } else if (this.A0D != null) {
            AnonymousClass0C1 r6 = this.A04;
            r15 = new C37111j8(r6, AnonymousClass1PZ.A00(r6).A02(this.A0D));
        }
        AnonymousClass1NJ A023 = AnonymousClass1PZ.A00(this.A04).A02(this.A0D);
        if (A023 == null || !A023.A1X()) {
            i = 0;
        } else {
            i = (int) (((float) C06220Of.A09(getContext())) / A023.A0O().A05());
        }
        int i2 = bundle3.getInt(C193418Ps.$const$string(33));
        int[] intArray = bundle3.getIntArray(C193418Ps.$const$string(35));
        int[] intArray2 = bundle3.getIntArray(C193418Ps.$const$string(34));
        if (intArray != null) {
            z = true;
        }
        this.A08 = z;
        if (z) {
            CAM cam = new CAM(A023, this, this.A0F, this.A0N, this.A04, i, intArray, intArray2, i2, this.A0I);
            this.A02 = cam;
            registerLifecycleListener(cam);
        }
        String str = this.A0F;
        boolean z2 = this.A0N;
        Context context = getContext();
        AnonymousClass0C1 r5 = this.A04;
        AnonymousClass35Q r14 = new AnonymousClass35Q(context, this, r5);
        List list = this.A0J;
        List list2 = list;
        CWQ cwq = new CWQ(this, str, z2, this, r14, r15, list2, r5, this.A08, this.A02, i);
        this.A00 = cwq;
        registerLifecycleListener(cwq);
        if (A023 != null) {
            this.A0C = C30671Ut.A02(this.A04, A023);
        }
        if (((Boolean) C05680Ln.A7w.A01(this.A04)).booleanValue()) {
            this.A01 = new C23974AeZ(this.A04, this.A0J);
        }
        AnonymousClass0Z0.A09(-2104414796, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("CanvasFragment.IS_FIRST_LOAD", this.A0L);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d2, code lost:
        if (r14.A0L == false) goto L_0x00d4;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        boolean z;
        super.onViewCreated(view, bundle);
        if (this.A08) {
            CAM cam = this.A02;
            CAO cao = new CAO(cam.A03);
            cam.A05 = cao;
            cam.A03.setTag(cao);
            CAW caw = cam.A0F;
            CAO cao2 = cam.A05;
            AnonymousClass1NJ r12 = cam.A0G;
            C36841ih r13 = cam.A0H;
            Integer AaD = cam.AaD(r12);
            C32141af Aa7 = cam.Aa7(0, cam.A0G);
            AnonymousClass0C1 r6 = cam.A0I;
            cao2.A04 = r13;
            r13.A0H(cao2.A02.A00());
            cao2.A01.setAspectRatio(r12.A05());
            IgProgressImageView igProgressImageView = cao2.A05;
            igProgressImageView.setImageRenderer(CAW.A01);
            igProgressImageView.setProgressiveImageConfig(new C38631la());
            igProgressImageView.setEnableProgressBar(true);
            cao2.A05.A05(C0003R.C0005id.listener_id_for_media_view_binder, new CAU(caw, cam));
            C38641lb.A00(r6, r12, cao2.A05, cam, (Context) null);
            if (caw.A00 == null) {
                caw.A00 = new AnonymousClass1VM();
            }
            caw.A00.A01(cao2.A06, cao2.A05, Aa7, r12, r13);
            C38781lp.A00(cao2.A02, r12, r13);
            C39111mN.A00(cao2.A03, r6, new CAV(caw, cam, cao2), false, AaD);
            cao2.A01.setOnClickListener(new CAQ(caw, cam, cao2));
            j = 200;
        } else {
            j = 0;
        }
        if (this.A0K) {
            CWQ cwq = this.A00;
            cwq.A02.A07.add(cwq);
            cwq.A00.setVisibility(0);
            cwq.A00.setTranslationY((float) cwq.A0L);
        }
        if (!this.A0K || !this.A0L) {
            CWQ cwq2 = this.A00;
            cwq2.A00.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            cwq2.A00.setVisibility(0);
        } else {
            AnonymousClass0ZA.A09(new Handler(), new CAR(this), j, -508335190);
        }
        if (this.A0M) {
            z = true;
        }
        z = false;
        A02(z);
    }

    public final String getModuleName() {
        return this.A0E;
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(949854318);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_canvas, viewGroup, false);
        this.A05 = (SpinnerImageView) inflate.findViewById(C0003R.C0005id.empty_state_view_loading_spinner);
        Reel reel = this.A0B;
        if (reel != null) {
            this.A03 = reel.A0C(this.A04, this.A09).A08;
        } else if (this.A0D != null) {
            this.A03 = AnonymousClass1PZ.A00(this.A04).A02(this.A0D);
        } else {
            this.A03 = new CAX();
        }
        this.A05.setOnClickListener(new CAS(this));
        if (this.A08) {
            inflate.findViewById(C0003R.C0005id.canvas_container).setBackgroundColor(0);
            ((ViewStub) inflate.findViewById(C0003R.C0005id.canvas_back_button_stub)).inflate().setOnClickListener(new CAT(this));
        }
        AnonymousClass0Z0.A09(-246971156, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1955960843);
        super.onDestroy();
        this.A00.A04();
        if (this.A08) {
            this.A02.Azh();
        }
        AnonymousClass0Z0.A09(-1429063235, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-937050999);
        super.onResume();
        AnonymousClass1X4.A04(getRootActivity().getWindow(), getRootActivity().getWindow().getDecorView(), false);
        if (getActivity().getParent() instanceof C26301Cs) {
            ((C26301Cs) getActivity().getParent()).Bl6(8);
        }
        if (this.A0L) {
            C22760yx.A00(this.A04).A00.A5H(C35051fj.A04, (long) this.A06.hashCode(), "cold_start");
            this.A0L = false;
        }
        AnonymousClass0Z0.A09(1168601583, A022);
    }
}
