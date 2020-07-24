package com.instagram.video.live.p038ui.streaming;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.android.internal.util.Predicate;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000X.A08;
import p000X.A51;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass5FT;
import p000X.AnonymousClass79M;
import p000X.BVF;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C110864py;
import p000X.C129605gd;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C193418Ps;
import p000X.C206828uC;
import p000X.C23467ANo;
import p000X.C27341Hl;
import p000X.C27638CLg;
import p000X.C27641CLj;
import p000X.C27642CLk;
import p000X.C27645CLn;
import p000X.C27650CLs;
import p000X.C28351Lj;
import p000X.C51312Ke;
import p000X.C62452nj;
import p000X.C67692xg;
import p000X.C67712xi;
import p000X.C67782xp;

/* renamed from: com.instagram.video.live.ui.streaming.IgLiveWithInviteFragment */
public class IgLiveWithInviteFragment extends C27341Hl implements AnonymousClass1HK, C67692xg, C51312Ke, C129605gd, C110864py {
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public Drawable A00;
    public C67712xi A01;
    public AnonymousClass0C1 A02;
    public AnonymousClass79M A03;
    public Integer A04;
    public String A05;
    public List A06 = new ArrayList();
    public List A07 = new ArrayList();
    public boolean A08;
    public boolean A09 = true;
    public C23467ANo A0A;
    public C27638CLg A0B;
    public final Handler A0C = new Handler();
    public final Runnable A0D = new C27650CLs(this);
    public final Runnable A0E = new C27645CLn(this);
    public TextView mActionButton;
    public ViewGroup mBottomControlsContainer;
    public ListView mListView;
    public View mMainView;
    public View mNullStateView;
    public View mSpinner;
    public TypeaheadHeader mTypeaheadHeader;

    public static C27638CLg A00(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        IgLiveWithInviteFragment igLiveWithInviteFragment2 = igLiveWithInviteFragment;
        if (igLiveWithInviteFragment.A0B == null) {
            igLiveWithInviteFragment2.A0B = new C27638CLg(igLiveWithInviteFragment.getContext(), igLiveWithInviteFragment2, igLiveWithInviteFragment.A02, igLiveWithInviteFragment.A05, igLiveWithInviteFragment.A0A, igLiveWithInviteFragment.A08);
        }
        return igLiveWithInviteFragment2.A0B;
    }

    public final void AtV() {
    }

    public final String getModuleName() {
        return "live_with_invite";
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0H = timeUnit.toMillis(2);
        A0G = timeUnit.toMillis(2);
        A0F = timeUnit.toMillis(10);
    }

    public static void A01(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        String str = igLiveWithInviteFragment.A05;
        C15890nh r3 = new C15890nh(igLiveWithInviteFragment.A02);
        r3.A09 = Constants.A0N;
        r3.A0E("live/%s/get_join_requests/", str);
        r3.A06(C62452nj.class, true);
        C17850qu A032 = r3.A03();
        A032.A00 = new C27642CLk(igLiveWithInviteFragment);
        igLiveWithInviteFragment.schedule(A032);
    }

    public final boolean AhU() {
        ListView listView = this.mListView;
        if (listView == null || listView.getChildCount() == 0 || !this.mListView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final void AtY(int i, int i2) {
        this.mBottomControlsContainer.setTranslationY((float) ((-i) - i2));
    }

    public final void BLX() {
        C67712xi r1 = this.A01;
        if (r1.AfR()) {
            r1.Bjv(r1.ATP());
        }
    }

    public final boolean onBackPressed() {
        View view = this.mMainView;
        if (view == null) {
            return false;
        }
        C06220Of.A0E(view);
        return false;
    }

    public final void registerTextViewLogging(TextView textView) {
        AnonymousClass0WN.A01(this.A02).Ba2(textView);
    }

    public static void A02(IgLiveWithInviteFragment igLiveWithInviteFragment) {
        A00(igLiveWithInviteFragment).A03(TextUtils.isEmpty(igLiveWithInviteFragment.A01.ATP()));
    }

    public static void A03(IgLiveWithInviteFragment igLiveWithInviteFragment, Integer num) {
        int i;
        int i2;
        Drawable drawable;
        switch (num.intValue()) {
            case 0:
                i = C0003R.string.cancel;
                i2 = C0003R.color.igds_primary_text;
                Context context = igLiveWithInviteFragment.getContext();
                drawable = C019000b.A03(context, AnonymousClass1BA.A03(context, C0003R.attr.elevatedBackgroundDrawable));
                break;
            case 1:
                i = C0003R.string.add;
                i2 = C0003R.color.white;
                if (igLiveWithInviteFragment.A00 == null) {
                    igLiveWithInviteFragment.A00 = C019000b.A03(igLiveWithInviteFragment.getContext(), C0003R.C0004drawable.iglive_send_button);
                }
                drawable = igLiveWithInviteFragment.A00;
                break;
            default:
                throw new IllegalArgumentException(AnonymousClass40t.$const$string(16));
        }
        igLiveWithInviteFragment.mActionButton.setText(i);
        igLiveWithInviteFragment.mActionButton.setTextColor(C019000b.A00(igLiveWithInviteFragment.getContext(), i2));
        igLiveWithInviteFragment.mActionButton.setBackground(drawable);
        igLiveWithInviteFragment.A04 = num;
    }

    public final void BGZ(C67712xi r7) {
        String string;
        Context context;
        int i;
        String ATP = r7.ATP();
        if (TextUtils.isEmpty(ATP)) {
            A00(this).A06 = false;
            C27638CLg A002 = A00(this);
            List list = this.A07;
            A002.A0G.clear();
            A002.A0G.addAll(list);
            C27638CLg.A02(A002);
            C27638CLg A003 = A00(this);
            List list2 = this.A06;
            A003.A0H.clear();
            A003.A0H.addAll(list2);
            C27638CLg.A02(A003);
            A00(this);
        } else {
            boolean AgL = r7.AgL();
            boolean AfR = r7.AfR();
            if ((AgL || AfR) && ((List) r7.AUa()).isEmpty()) {
                if (AfR) {
                    string = getResources().getString(C0003R.string.search_for_x, new Object[]{ATP});
                    context = getContext();
                    i = C0003R.color.blue_5;
                } else {
                    string = getContext().getString(C0003R.string.searching);
                    context = getContext();
                    i = C0003R.color.grey_5;
                }
                int A004 = C019000b.A00(context, i);
                C27638CLg A005 = A00(this);
                if (A005.A07 != null) {
                    A005.A06 = true;
                    A005.A09.A00 = AgL;
                    A005.A08.A00(string, A004);
                }
            } else {
                A00(this).A06 = false;
            }
            C27638CLg A006 = A00(this);
            List list3 = (List) r7.AUa();
            A006.A0G.retainAll(list3);
            A006.A0H.retainAll(list3);
        }
        A02(this);
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1450022171);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0J1.A06(this.mArguments);
        this.A05 = this.mArguments.getString(C193418Ps.$const$string(51));
        this.A08 = this.mArguments.getBoolean(C193418Ps.$const$string(52));
        this.A03 = ((A08) this.A02.AVA(A08.class, new A51())).A00;
        AnonymousClass0Z0.A09(1947922352, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypeaheadHeader typeaheadHeader;
        int A022 = AnonymousClass0Z0.A02(-1809235867);
        View inflate = layoutInflater.inflate(C0003R.layout.fragment_live_with_invite, viewGroup, false);
        this.mMainView = inflate;
        this.mListView = (ListView) inflate.findViewById(16908298);
        this.mBottomControlsContainer = (ViewGroup) this.mMainView.findViewById(C0003R.C0005id.live_with_invite_bottom_control_container);
        this.mActionButton = (TextView) this.mMainView.findViewById(C0003R.C0005id.live_with_invite_action_button);
        this.mNullStateView = this.mMainView.findViewById(C0003R.C0005id.live_with_no_viewers);
        this.mSpinner = this.mMainView.findViewById(C0003R.C0005id.live_with_invite_spinner);
        TypeaheadHeader typeaheadHeader2 = (TypeaheadHeader) this.mMainView.findViewById(C0003R.C0005id.typeahead_header);
        this.mTypeaheadHeader = typeaheadHeader2;
        typeaheadHeader2.setDelegate(this);
        typeaheadHeader2.A03(getString(C0003R.string.search));
        this.mListView.setAdapter(A00(this));
        A03(this, Constants.ZERO);
        this.mActionButton.setOnClickListener(new BVF(this));
        C17850qu A012 = AnonymousClass5FT.A01(this.A02, this.A05);
        A012.A00 = new C27641CLj(this);
        schedule(A012);
        A01(this);
        C67712xi A002 = C67782xp.A00(this.A02, new C28351Lj(getContext(), AnonymousClass1L8.A00(this)), AnonymousClass0C5.$const$string(8), new C206828uC(this), (List) null, this, true, (Predicate) null);
        this.A01 = A002;
        A002.BiZ(this);
        if (this.A08 && (typeaheadHeader = this.mTypeaheadHeader) != null) {
            typeaheadHeader.setVisibility(8);
        }
        View view = this.mMainView;
        AnonymousClass0Z0.A09(-892026507, A022);
        return view;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-684839579);
        super.onDestroy();
        this.A03 = null;
        AnonymousClass0Z0.A09(213027060, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1566084188);
        super.onDestroyView();
        AnonymousClass0ZA.A07(this.A0C, (Object) null);
        AnonymousClass0Z0.A09(2146786497, A022);
    }

    public final void searchTextChanged(String str) {
        String A012 = C06360Ot.A01(str);
        if (TextUtils.isEmpty(A012)) {
            A00(this).A06 = false;
        }
        this.A01.Bjv(A012);
    }

    public IgLiveWithInviteFragment() {
    }

    public IgLiveWithInviteFragment(C23467ANo aNo) {
        this.A0A = aNo;
    }
}
