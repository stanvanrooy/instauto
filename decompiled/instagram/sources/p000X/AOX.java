package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingLinearLayoutManager;

/* renamed from: X.AOX */
public final class AOX extends C27341Hl implements C60962kt {
    public static final C184037tg A07 = new C184037tg();
    public float A00 = 1.0f;
    public AOY A01;
    public AJZ A02;
    public String A03;
    public boolean A04;
    public RecyclerView A05;
    public final C18750sM A06 = C18730sK.A00(new AP8(this));

    public final boolean A55() {
        return false;
    }

    public final int AIh() {
        return -2;
    }

    public final int AYd() {
        return 0;
    }

    public final boolean AeS() {
        return true;
    }

    public final float Aol() {
        return 1.0f;
    }

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final void B8h() {
    }

    public final void B8j(int i) {
    }

    public final boolean BmS() {
        return true;
    }

    public final String getModuleName() {
        return "UserPaySupporterListBottomSheetFragment";
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.A05;
        if (recyclerView == null) {
            C13150hy.A03("recyclerView");
        }
        return !recyclerView.canScrollVertically(-1);
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A06.getValue();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C13150hy.A02(view, "view");
        super.onViewCreated(view, bundle);
        C13300iJ r1 = ((AnonymousClass0C1) this.A06.getValue()).A06;
        C13150hy.A01(r1, "userSession.user");
        ((CircularImageView) view.findViewById(C0003R.C0005id.broadcaster_profile_picture)).setUrl(r1.ASv(), getModuleName());
        View findViewById = view.findViewById(C0003R.C0005id.title);
        C13150hy.A01(findViewById, "findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText(getString(C0003R.string.live_user_pay_badges));
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            View findViewById2 = view.findViewById(C0003R.C0005id.estimated_earnings);
            C13150hy.A01(findViewById2, "findViewById<TextView>(R.id.estimated_earnings)");
            Context context = view.getContext();
            C13150hy.A01(context, "context");
            String string = bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_BADGES_ESTIMATED_EARNINGS", "$0");
            C13150hy.A01(string, "it.getString(\n          …FAULT_ESTIMATED_EARNINGS)");
            C13150hy.A02(context, "context");
            C13150hy.A02(string, "formattedAmount");
            ((TextView) findViewById2).setText(AnonymousClass000.A03(string, ' ', context.getString(C0003R.string.live_user_pay_estimated_earnings)));
            View findViewById3 = view.findViewById(C0003R.C0005id.badges);
            C13150hy.A01(findViewById3, "findViewById<TextView>(R.id.badges)");
            C13150hy.A01(context, "context");
            String string2 = bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_BADGES", "0");
            C13150hy.A01(string2, "it.getString(FRAGMENT_AR…DGES, DEFAULT_NUM_BADGES)");
            ((TextView) findViewById3).setText(C23489AOl.A00(context, string2));
        }
        View findViewById4 = view.findViewById(C0003R.C0005id.supporter_list_recycler_view);
        RecyclerView recyclerView = (RecyclerView) findViewById4;
        C13150hy.A01(recyclerView, "it");
        recyclerView.setLayoutManager(new FastScrollingLinearLayoutManager(view.getContext(), 1));
        recyclerView.A0w(new C61622m6(new C23500AOw(view, this), C29621Qp.LIST, recyclerView.A0L));
        AJZ ajz = this.A02;
        if (ajz == null) {
            C13150hy.A03("adapter");
        }
        recyclerView.setAdapter(ajz);
        C13150hy.A01(findViewById4, "findViewById<RecyclerVie…ter = adapter\n          }");
        this.A05 = recyclerView;
    }

    public final int AGx(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C13150hy.A01(viewConfiguration, "ViewConfiguration.get(context)");
        return viewConfiguration.getScaledTouchSlop();
    }

    public final View AXo() {
        return this.mView;
    }

    public final float AdY() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0Z0.A02(-973380144);
        super.onCreate(bundle);
        C23527APx aPx = new C23527APx((AnonymousClass0C1) this.A06.getValue());
        C13150hy.A02(aPx, "userPayApi");
        C224969mN r1 = new C224969mN(aPx);
        C13150hy.A02(r1, "userPayRepository");
        this.A01 = new AOY(r1);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_ID");
        } else {
            str = null;
        }
        if (str == null) {
            C13150hy.A00();
        }
        AOY aoy = this.A01;
        if (aoy == null) {
            C13150hy.A03("interactor");
        }
        C13150hy.A01(str, "this");
        aoy.A00(str, true);
        C13150hy.A01(str, "arguments?.getString(FRA…ist(this, true)\n        }");
        this.A03 = str;
        AOY aoy2 = this.A01;
        if (aoy2 == null) {
            C13150hy.A03("interactor");
        }
        aoy2.A00.A05(this, new C23480AOc(this));
        this.A02 = new AJZ();
        AnonymousClass0Z0.A09(1766412958, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1438316491);
        C13150hy.A02(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(C0003R.layout.iglive_user_pay_supporter_list_bottom_sheet, viewGroup, false);
        AnonymousClass0Z0.A09(-2041749289, A022);
        return inflate;
    }
}
