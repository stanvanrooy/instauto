package p000X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;
import com.instagram.p009ui.widget.spinner.RefreshSpinner;
import java.util.List;

/* renamed from: X.CCQ */
public final class CCQ extends C27341Hl implements AnonymousClass1HM, C27522CGm {
    public TextView A00;
    public CD8 A01;
    public C27434CDc A02;
    public CCU A03;
    public CD3 A04;
    public AnonymousClass0C1 A05;
    public RefreshSpinner A06;

    public final String getModuleName() {
        return "promote_connect_page";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(CCQ ccq, boolean z) {
        TextView textView = ccq.A00;
        int i = 8;
        int i2 = 0;
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        ccq.A00.setEnabled(!z);
        RefreshSpinner refreshSpinner = ccq.A06;
        if (z) {
            i = 0;
        }
        refreshSpinner.setVisibility(i);
    }

    public final void Aqn() {
        CCZ.A07(this.A04, C27398CBr.CONNECT_FACEBOOK_PAGE, "connect_button");
        String str = this.A04.A0e;
        if (str != null && !TextUtils.isEmpty(str)) {
            AnonymousClass0C1 r6 = this.A05;
            CD3 cd3 = this.A04;
            String str2 = cd3.A0R;
            String str3 = cd3.A0e;
            FragmentActivity activity = getActivity();
            AnonymousClass0a4.A06(activity);
            CC2 cc2 = new CC2(this);
            C15890nh r2 = new C15890nh(r6);
            r2.A09 = Constants.ONE;
            r2.A0C = "business/account/switch_business_page/";
            r2.A09("fb_auth_token", str2);
            r2.A09("page_id", str3);
            r2.A06(AVA.class, false);
            C17850qu A032 = r2.A03();
            A032.A00 = cc2;
            new C28351Lj(activity, AnonymousClass1L8.A00(activity)).schedule(A032);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.promote_connect_page_title);
        r2.Bg9(C0003R.C0004drawable.instagram_x_outline_24);
    }

    public final C06590Pq getSession() {
        return this.A05;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-355210448);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_connect_page_main_view, viewGroup, false);
        AnonymousClass0Z0.A09(914001109, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A04 = AT6;
        AnonymousClass0C1 r1 = AT6.A0Q;
        this.A05 = r1;
        this.A01 = new CD8(r1, activity, this);
        FragmentActivity activity2 = getActivity();
        AnonymousClass0a4.A06(activity2);
        ((BaseFragmentActivity) activity2).A0U();
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.connect_page_subtitle_text);
        textView.setText(C0003R.string.promote_connect_page_subtitle_text);
        String string2 = getString(C0003R.string.promote_connect_page_link_text);
        String string3 = getString(C0003R.string.promote_connect_page_subtitle_text);
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        AnonymousClass4XV.A01(textView, string2, string3, new C27415CCj(this, C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.textColorRegularLink))));
        C27434CDc cDc = new C27434CDc(view, C27398CBr.CONNECT_FACEBOOK_PAGE);
        this.A02 = cDc;
        cDc.A00();
        C27433CDb.A00(this.A02, this, C0003R.string.promote_connect_page_connect_button_text);
        this.A02.A02(true);
        this.A00 = (TextView) view.findViewById(C0003R.C0005id.skip_button);
        this.A06 = (RefreshSpinner) view.findViewById(C0003R.C0005id.skip_button_loading_spinner);
        this.A00.setOnClickListener(new CC1(this));
        CD3 cd3 = this.A04;
        FragmentActivity activity3 = getActivity();
        AnonymousClass0a4.A06(activity3);
        CCU ccu = new CCU(view, cd3, activity3);
        this.A03 = ccu;
        ccu.A03.removeAllViews();
        List<CCV> list = ccu.A02.A0g;
        if (list != null) {
            for (CCV ccv : list) {
                if (ccu.A00 == null) {
                    ccu.A00 = ccv.A02;
                }
                IgRadioGroup igRadioGroup = ccu.A03;
                CCK cck = new CCK(ccu.A01, false);
                cck.setTag(ccv.A02);
                cck.setPrimaryText(ccv.A03);
                int parseInt = Integer.parseInt(ccv.A01);
                String str = ccv.A00;
                if (parseInt < 1000) {
                    string = ccu.A01.getResources().getQuantityString(C0003R.plurals.connect_page_num_like, parseInt, new Object[]{Integer.valueOf(parseInt)});
                } else {
                    string = ccu.A01.getString(C0003R.string.promote_connect_page_truncated_num_like_text, new Object[]{Integer.valueOf(parseInt / 1000)});
                }
                cck.setSecondaryText(AnonymousClass000.A0J(str, " ", string));
                cck.A01(true);
                cck.setImageView(ccv.A04, "promote_connect_page");
                IgImageView igImageView = (IgImageView) cck.findViewById(C0003R.C0005id.promote_row_image);
                if (igImageView != null) {
                    igImageView.setVisibility(0);
                }
                igRadioGroup.addView(cck);
            }
        }
        IgRadioGroup igRadioGroup2 = ccu.A03;
        igRadioGroup2.A02 = new CCT(ccu);
        if (igRadioGroup2.A00 == -1) {
            igRadioGroup2.A01(igRadioGroup2.findViewWithTag(ccu.A00).getId());
            ccu.A02.A0e = ccu.A00;
            ccu.A00 = null;
        }
        super.onViewCreated(view, bundle);
    }
}
