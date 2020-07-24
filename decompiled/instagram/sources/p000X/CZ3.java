package p000X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.p009ui.mediaactions.LikeActionView;
import com.instagram.p009ui.mediaactions.MediaActionsView;
import com.instagram.p009ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CZ3 */
public final class CZ3 extends C27291Hg implements C30541Ug, AnonymousClass1HK, AnonymousClass0RC, View.OnTouchListener, C52012Nb, AnonymousClass1RK, C52022Nc {
    public int A00;
    public int A01;
    public View A02;
    public AnonymousClass1EK A03;
    public C30551Uh A04;
    public AnonymousClass1NJ A05;
    public CZ5 A06;
    public CZA A07;
    public C60512k1 A08;
    public Boolean A09;
    public Integer A0A;
    public boolean A0B;
    public String A0C;
    public final Context A0D;
    public final AnonymousClass1HD A0E;
    public final AnonymousClass1EG A0F;
    public final C52042Ne A0G = new CZE(this);
    public final C52062Ng A0H;
    public final CZH A0I;
    public final C27371Ho A0J;
    public final C30391Tq A0K = new CZB(this);
    public final AnonymousClass1RS A0L;
    public final AnonymousClass0C1 A0M;
    public final AnonymousClass1I6 A0N;
    public final boolean A0O;
    public final Handler A0P;
    public final AnonymousClass1AM A0Q;
    public final AnonymousClass2LX A0R = new CZ8(this);
    public final CZO A0S = new CZO(this);
    public final CZN A0T = new CZN(this);
    public final C151106dA A0U;
    public final CZ7 A0V;
    public final AnonymousClass1PM A0W;
    public final Map A0X;

    public static void A04(CZ3 cz3, Integer num) {
        Context context = cz3.A0D;
        AnonymousClass1NJ r2 = cz3.A05;
        Integer num2 = num;
        AnonymousClass2F3.A00(context, r2, cz3.A01, cz3.A00, cz3.A07.A08.A0D.getCurrentScans(), num2, Constants.A0C, cz3, cz3.A0E.getActivity(), cz3.A0M, cz3.A0N, cz3.APu(r2).A0m, (AnonymousClass2F2) null);
    }

    public final void BFF(AnonymousClass1NJ r1, int i) {
    }

    public CZ3(Context context, AnonymousClass0C1 r21, AnonymousClass1HD r22, AnonymousClass1AM r23, AnonymousClass1PM r24, C27371Ho r25, AnonymousClass1I6 r26) {
        String str;
        Context context2 = context;
        this.A0D = context2;
        AnonymousClass0C1 r8 = r21;
        this.A0M = r8;
        AnonymousClass1HD r15 = r22;
        this.A0E = r15;
        AnonymousClass1AM r9 = r23;
        this.A0Q = r9;
        this.A0W = r24;
        C27371Ho r4 = r25;
        this.A0J = r4;
        AnonymousClass1I6 r6 = r26;
        this.A0N = r6;
        this.A0A = Constants.ZERO;
        this.A0P = new Handler();
        this.A0X = new HashMap();
        this.A0V = new CZ7(context2, this.A0S);
        this.A0H = new C52062Ng(r8, r9, this, new AnonymousClass1S0(this, new C29931Rv(r8, r6), r8, false), this, this.A0J, this.A0N);
        C151106dA r13 = new C151106dA(r8, r15, r9, this, r6);
        this.A0U = r13;
        this.A0I = new CZH(context2, r8, r6, r13);
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06 = true;
        A002.A00 = 0.019999999552965164d;
        A002.A06(AnonymousClass1EA.A00(8.0d, 12.0d));
        A002.A07(this.A0R);
        this.A0F = A002;
        this.A0O = ((Boolean) AnonymousClass0L6.A02(this.A0M, AnonymousClass0L7.NEW_VIDEO_LOADING_INDICATOR_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
        if (r26 != null) {
            str = r6.AVo();
        } else {
            str = null;
        }
        AnonymousClass1RR r1 = new AnonymousClass1RR(context2, r4, r8, str);
        r1.A00 = true;
        r1.A01 = true;
        r1.A02 = true;
        if (this.A0O) {
            r1.A06 = true;
        }
        AnonymousClass1RS A003 = r1.A00();
        this.A0L = A003;
        A003.A06 = true;
        A003.A0K.add(this);
    }

    public static void A01(CZ3 cz3) {
        String APo;
        cz3.A0F.A03(0.0d);
        AnonymousClass1EG r3 = cz3.A0F;
        if (r3.A00() == 0.0d) {
            A03(cz3, r3);
        }
        if (A00(cz3.A05, cz3.A00).AiO()) {
            cz3.A0L.A0M("end_peek", true, false);
        }
        CZ5 cz5 = cz3.A06;
        if (cz5.A0A != null) {
            cz5.A0F.A06.getViewTreeObserver().removeOnGlobalLayoutListener(cz5.A0A);
            cz5.A0A = null;
            AnonymousClass1NJ r2 = cz5.A0F.A07.A09;
            StringBuilder sb = new StringBuilder("mInitViewCalledCount: ");
            sb.append(cz5.A09);
            sb.append(" mHorizontalMargin: ");
            sb.append(cz5.A01);
            sb.append(" mDefaultSpacing: ");
            sb.append(cz5.A00);
            sb.append(" mInitialActionListHeight: ");
            sb.append(cz5.A02);
            sb.append(" mInitialActionListOffset: ");
            sb.append(cz5.A03);
            sb.append(" mMaxTranslateY: ");
            sb.append(cz5.A06);
            sb.append(" mInitialMediaMargin: ");
            sb.append(cz5.A04);
            sb.append(" mMaxY: ");
            sb.append(cz5.A07);
            sb.append(" mMinMediaScale: ");
            sb.append(cz5.A08);
            sb.append(" mMaxMediaScale: ");
            sb.append(cz5.A05);
            sb.append(" mHolder.touchContainer.getHeight(): ");
            sb.append(cz5.A0F.A06.getHeight());
            sb.append(" mHolder.mediaContainer.getHeight(): ");
            sb.append(cz5.A0F.A09.getHeight());
            sb.append(" mediaId: ");
            if (r2 == null) {
                APo = "IS NULL";
            } else {
                APo = r2.APo();
            }
            sb.append(APo);
            AnonymousClass0QD.A01("GridQuickPreviewDragHelper#tearDown", sb.toString());
        }
        cz3.A0H.A00(cz3.A05, cz3.A00);
        cz3.A0A = Constants.A0C;
    }

    public static void A02(CZ3 cz3) {
        Integer num;
        cz3.A03.getContext();
        CZN czn = cz3.A0T;
        if (C26611Ee.A00(cz3.A0M).A0K(cz3.A05)) {
            num = Constants.ONE;
        } else {
            num = Constants.ZERO;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (num == Constants.ONE) {
            z = true;
        }
        int i = C0003R.string.like;
        if (z) {
            i = C0003R.string.unlike;
        }
        CZD czd = new CZD(czn);
        CZK czk = new CZK();
        czk.A00 = i;
        czk.A02 = false;
        czk.A01 = czd;
        arrayList.add(czk);
        CZC czc = new CZC(czn);
        CZK czk2 = new CZK();
        czk2.A00 = C0003R.string.share;
        czk2.A02 = false;
        czk2.A01 = czc;
        arrayList.add(czk2);
        CZ9 cz9 = new CZ9(czn);
        CZK czk3 = new CZK();
        czk3.A00 = C0003R.string.not_interested;
        czk3.A02 = true;
        czk3.A01 = cz9;
        arrayList.add(czk3);
        CZF czf = new CZF(czn);
        CZK czk4 = new CZK();
        czk4.A00 = C0003R.string.report;
        czk4.A02 = true;
        czk4.A01 = czf;
        arrayList.add(czk4);
        for (int i2 = 0; i2 < cz3.A07.A0A.length; i2++) {
            if (i2 < arrayList.size()) {
                BY9 by9 = cz3.A07.A0A[i2];
                CZK czk5 = (CZK) arrayList.get(i2);
                by9.setOnClickListener(czk5.A01);
                IgTextView igTextView = by9.A00;
                Context context = by9.getContext();
                boolean z2 = czk5.A02;
                int i3 = C0003R.color.igds_primary_text;
                if (z2) {
                    i3 = C0003R.color.igds_error_or_destructive;
                }
                igTextView.setTextColor(C019000b.A00(context, i3));
                by9.A00.setText(czk5.A00);
            } else {
                cz3.A07.A0A[i2].setVisibility(8);
            }
        }
    }

    public static void A05(CZ3 cz3, boolean z) {
        AnonymousClass1PM r1;
        C36791ic.A00(cz3.A0M).A01(cz3.A05, true);
        AnonymousClass1HD r12 = cz3.A0E;
        if (r12 instanceof C30561Ui) {
            ((C30561Ui) r12).BAg(cz3.A05, z);
            return;
        }
        if (r12 instanceof AnonymousClass2NN) {
            ListAdapter listAdapter = ((AnonymousClass2NN) r12).mAdapter;
            if (listAdapter instanceof AnonymousClass1PM) {
                r1 = (AnonymousClass1PM) listAdapter;
            } else {
                return;
            }
        } else {
            r1 = cz3.A0W;
        }
        r1.AqE(cz3.A05);
    }

    public final C36841ih APu(AnonymousClass1NJ r4) {
        C36841ih r2 = (C36841ih) this.A0X.get(r4.APo());
        if (r2 != null) {
            return r2;
        }
        C36841ih r22 = new C36841ih(r4);
        this.A0X.put(r4.APo(), r22);
        return r22;
    }

    public final boolean Ago() {
        return this.A0J.Ago();
    }

    public final boolean Ahq() {
        return this.A0J.Ahq();
    }

    public final void AyU() {
        this.A0H.A00.AyU();
    }

    public final void Ayk(View view) {
        CZH czh = this.A0I;
        Context context = this.A0D;
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.grid_quick_preview, (ViewGroup) null, false);
        CZA cza = new CZA();
        cza.A06 = (TouchInterceptorFrameLayout) inflate;
        cza.A04 = (LinearLayout) inflate.findViewById(C0003R.C0005id.peek_container);
        cza.A09 = (RoundedCornerConstraintLayout) inflate.findViewById(C0003R.C0005id.media_container);
        cza.A02 = inflate.findViewById(C0003R.C0005id.action_list_drag_bar);
        cza.A05 = (IgTextView) inflate.findViewById(C0003R.C0005id.swipe_up_prompt);
        View findViewById = inflate.findViewById(C0003R.C0005id.media_header);
        findViewById.setBackgroundColor(C019000b.A00(findViewById.getContext(), C0003R.color.igds_primary_background));
        cza.A07 = AnonymousClass1VJ.A01(findViewById);
        C32221an r6 = new C32221an((ViewStub) inflate.findViewById(C0003R.C0005id.audio_icon_view_stub));
        C32151ag r10 = new C32151ag((MediaFrameLayout) inflate.findViewById(C0003R.C0005id.media_group), (IgProgressImageView) inflate.findViewById(C0003R.C0005id.row_feed_photo_imageview), (LikeActionView) inflate.findViewById(C0003R.C0005id.like_heart), (MediaActionsView) inflate.findViewById(C0003R.C0005id.row_feed_media_actions), (C32171ai) null, (C32181aj) null, (C32191ak) null, r6, new C32231ao((ViewStub) inflate.findViewById(C0003R.C0005id.media_subtitle_view_stub)), new C32241ap((ViewStub) inflate.findViewById(C0003R.C0005id.media_gating_view_stub)), (C32251aq) null, (C32261ar) null, (C32271as) null, (C32281at) null, (C32291au) null, (C32301av) null, (C32321ax) null, (C32331ay) null);
        cza.A08 = r10;
        r10.A07.setTag(cza);
        IgProgressImageView igProgressImageView = cza.A08.A0D;
        igProgressImageView.setImageRenderer(czh.A01);
        igProgressImageView.A02.setText(C0003R.string.unclickable_error_message);
        cza.A08.A0D.setProgressiveImageConfig(new C38631la());
        cza.A03 = (LinearLayout) inflate.findViewById(C0003R.C0005id.action_list);
        cza.A0A = new BY9[4];
        while (true) {
            BY9[] by9Arr = cza.A0A;
            if (i < by9Arr.length) {
                by9Arr[i] = new BY9(context);
                cza.A03.addView(cza.A0A[i]);
                i++;
            } else {
                inflate.setTag(cza);
                this.A02 = inflate;
                CZA cza2 = (CZA) inflate.getTag();
                this.A07 = cza2;
                this.A0U.A00 = cza2;
                CZ5 cz5 = new CZ5(this.A0D, cza2, new CZP(this), ((Boolean) AnonymousClass0L6.A02(this.A0M, AnonymousClass0L7.EXPLORE_PEEK_REDESIGN, "show_swipe_up_prompt", true, (AnonymousClass04H) null)).booleanValue());
                this.A06 = cz5;
                C60512k1 r1 = new C60512k1(this.A0D, cz5);
                this.A08 = r1;
                C60532k3.A00(r1, this.A07.A06);
                this.A02.setVisibility(8);
                this.A0H.A00.Ayk(view);
                return;
            }
        }
    }

    public final void Azd() {
        this.A0H.A00.Azd();
    }

    public final void Azh() {
        AnonymousClass1EK r0 = this.A03;
        if (r0 != null) {
            r0.A60().removeView(this.A02);
            this.A03 = null;
        }
        this.A0U.A00 = null;
        this.A02 = null;
        this.A07 = null;
        this.A05 = null;
        this.A0H.A00.Azh();
    }

    public final void BE0() {
        this.A0A = Constants.ZERO;
        C52062Ng r3 = this.A0H;
        AnonymousClass1NJ r2 = this.A05;
        int i = this.A00;
        if (r2 != null) {
            r3.A00.A01(r2, i);
            r3.A00.A00(r2, i);
        }
        r3.A00.BE0();
        AnonymousClass1NJ r1 = this.A05;
        if (r1 != null && A00(r1, this.A00).AiO()) {
            this.A0L.A0M("fragment_paused", false, false);
        }
        this.A02.setVisibility(8);
        CZ7 cz7 = this.A0V;
        AnonymousClass0ZA.A07(cz7.A03, (Object) null);
        cz7.A01 = false;
        this.A0F.A03(0.0d);
        this.A0F.A05(0.0d, true);
        AnonymousClass1EK r0 = this.A03;
        if (r0 != null) {
            r0.Adn((View.OnTouchListener) null);
        }
    }

    public final void BJx() {
        if (C34001dq.A00(this.A0M).A02 && C34001dq.A00(this.A0M).A01) {
            AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(this.A0M).A02(C34001dq.A00(this.A0M).A00);
            this.A05 = A022;
            if (A022 != null) {
                A05(this, true);
                AnonymousClass5F9.A01(this.A0D, C0003R.string.report_thanks_toast_msg, 1);
                AnonymousClass6N8.A02(this.A0E.getActivity(), this.A0J, this.A05.APo(), Constants.A12, this.A0M);
            }
            C34001dq.A00(this.A0M).A01();
        }
        this.A0H.A00.BJx();
    }

    public final C06270Ok BYN() {
        C27371Ho r1 = this.A0J;
        if (r1 instanceof C30541Ug) {
            return ((C30541Ug) r1).BYN();
        }
        return C06270Ok.A00();
    }

    public final C06270Ok BYO(AnonymousClass1NJ r3) {
        C27371Ho r1 = this.A0J;
        if (r1 instanceof C30541Ug) {
            return ((C30541Ug) r1).BYO(r3);
        }
        return C06270Ok.A00();
    }

    public final Map BYU() {
        AnonymousClass1HD r1 = this.A0E;
        if (r1 instanceof AnonymousClass0RC) {
            return ((AnonymousClass0RC) r1).BYU();
        }
        return null;
    }

    public final String getModuleName() {
        if (this.A0C == null) {
            this.A0C = AnonymousClass000.A0E("peek_media_", this.A0J.getModuleName());
        }
        return this.A0C;
    }

    public final boolean onBackPressed() {
        switch (this.A0A.intValue()) {
            case 0:
            case 1:
                return false;
            case 3:
                A01(this);
                return true;
            default:
                return true;
        }
    }

    public static AnonymousClass1NJ A00(AnonymousClass1NJ r1, int i) {
        if (r1.A1W()) {
            return r1.A0P(i);
        }
        if (r1.A1X()) {
            return r1.A0O();
        }
        return r1;
    }

    public static void A03(CZ3 cz3, AnonymousClass1EG r6) {
        Integer num;
        if (r6.A00() != 1.0d && cz3.A0A != (num = Constants.ZERO)) {
            cz3.A0A = num;
            cz3.A02.setVisibility(8);
            C30551Uh r0 = cz3.A04;
            if (r0 != null) {
                r0.BE5();
            }
            C13880jN.A00.A01();
        }
    }

    public final void BPF(AnonymousClass1NJ r2, int i, int i2, int i3) {
        APu(r2).A07(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    public final boolean BS6(View view, MotionEvent motionEvent, AnonymousClass1NM r6, int i) {
        int i2;
        if (motionEvent.getActionMasked() == 0) {
            AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(this.A0M).A02(r6.APo());
            this.A05 = A022;
            if (A022 != null) {
                boolean A1W = A022.A1W();
                i2 = 0;
            }
            i2 = -1;
            this.A00 = i2;
            this.A01 = i;
        }
        if (!this.A0B || motionEvent.getActionMasked() != 3) {
            this.A0V.A00(motionEvent);
            return false;
        }
        this.A0B = false;
        return false;
    }

    public final void BVf(View view, Bundle bundle) {
        AnonymousClass1EK A002 = C55872bY.A00(view);
        this.A03 = A002;
        if (A002 != null) {
            this.A03.A60().addView(this.A02, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public final void Bh8(C30551Uh r1) {
        this.A04 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass1EK r1;
        if ((motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) && (r1 = this.A03) != null) {
            r1.Adn((View.OnTouchListener) null);
        }
        this.A0V.A00(motionEvent);
        if (this.A0A == Constants.ZERO) {
            return false;
        }
        return true;
    }
}
