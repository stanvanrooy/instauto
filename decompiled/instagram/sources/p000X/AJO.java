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
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.AJO */
public final class AJO extends C27341Hl implements C60962kt {
    public float A00 = 0.4f;
    public AnonymousClass0C1 A01;
    public AJF A02;
    public String A03;
    public RecyclerView A04;
    public ImageUrl A05;
    public String A06;
    public String A07;
    public String A08;

    public final boolean A55() {
        return false;
    }

    public final int AIh() {
        return -1;
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
        return "live_fundraiser_donor_list";
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.A04;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final int AGx(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final View AXo() {
        return this.mView;
    }

    public final float AdY() {
        return this.A00;
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-287583471);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A01 = AnonymousClass0J1.A06(bundle2);
        this.A05 = (ImageUrl) bundle2.getParcelable("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_CHARITY_PROFILE_URL");
        this.A07 = bundle2.getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_CHARITY_NAME");
        this.A06 = bundle2.getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_CHARITY_AMOUNT_RAISED");
        this.A08 = bundle2.getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_CHARITY_NUM_DONORS");
        this.A03 = bundle2.getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_BROADCAST_ID");
        this.A02 = new AJF(this);
        AnonymousClass0C1 r0 = this.A01;
        String str = this.A03;
        C15890nh r3 = new C15890nh(r0);
        r3.A09 = Constants.A0N;
        r3.A0E("live/%s/charity_donations/", str);
        r3.A06(AJN.class, true);
        C17850qu A032 = r3.A03();
        A032.A00 = new AJP(this);
        schedule(A032);
        AnonymousClass0Z0.A09(487464847, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-2066232390);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_iglive_fundraiser_donor_list, viewGroup, false);
        AnonymousClass0Z0.A09(2015743420, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.donor_list_recycler_view);
        this.A04 = recyclerView;
        recyclerView.setLayoutManager(new FastScrollingLinearLayoutManager(getContext(), 1));
        this.A04.setAdapter(this.A02);
        ((CircularImageView) view.findViewById(C0003R.C0005id.charity_profile_picture)).setUrl(this.A05, getModuleName());
        ((TextView) view.findViewById(C0003R.C0005id.charity_name)).setText(this.A07);
        ((TextView) view.findViewById(C0003R.C0005id.number_of_supporters)).setText(this.A06);
        ((TextView) view.findViewById(C0003R.C0005id.total_donation_amount)).setText(this.A08);
    }
}
