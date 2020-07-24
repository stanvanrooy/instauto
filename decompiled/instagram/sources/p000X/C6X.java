package p000X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.C6X */
public final class C6X extends C27341Hl implements C33431cu {
    public View.OnClickListener A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public C6Y A03;
    public CHP A04;
    public CHQ A05;
    public C29131Os A06;
    public C29471Qa A07;
    public IgTextView A08;
    public C51522Kz A09;
    public AnonymousClass1OC A0A;
    public AnonymousClass0C1 A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public LinearLayoutManager A0G;
    public AnonymousClass54G A0H;
    public CHV A0I;

    public final boolean Ae1() {
        return true;
    }

    public final void configureActionBar(AnonymousClass1EX r5) {
        boolean z = true;
        r5.Bo0(true);
        r5.BlI(C0003R.string.close_friends_v2_action_bar_title);
        if (getActivity() instanceof ModalActivity) {
            boolean z2 = true;
            if (this.A0H.ordinal() != 4) {
                z2 = false;
            }
            if (!z2) {
                r5.Bg9(C0003R.C0004drawable.instagram_x_outline_24);
            }
        }
        r5.Bo7(true, new C27267C6a(this));
        if (this.A0C) {
            r5.BlI(C0003R.string.close_friends_v2_full_screen_nux_header_title_text);
        } else {
            r5.BlI(C0003R.string.close_friends_v2_action_bar_title);
        }
        if (this.A0D || this.A0C) {
            z = false;
        }
        if (z) {
            C27268C6b c6b = new C27268C6b(this);
            C33831dZ r1 = new C33831dZ();
            r1.A02 = C0003R.C0004drawable.plus_24;
            r1.A01 = C0003R.string.close_friends_v2_add_button_description;
            r1.A05 = c6b;
            r5.A4J(r1.A00());
        }
    }

    public final String getModuleName() {
        return "favorites_home";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(C6X c6x) {
        C6Y c6y = c6x.A03;
        c6y.A03 = c6x.A0I.A04.size();
        c6y.A01 = c6x.A0I.A02.size();
        int size = c6x.A0I.A03.size();
        c6y.A0E.A0E("audience_added_search_count", Integer.valueOf(size));
        c6y.A00 = size;
    }

    public static void A01(C6X c6x) {
        C51522Kz r2 = c6x.A09;
        if (r2 != null) {
            C11130eT.A01.BXT(new C33451cw(r2));
        }
    }

    public static void A02(C6X c6x) {
        if (c6x.A0B.A06.A0Y()) {
            c6x.A08.setAlpha(1.0f);
            c6x.A08.setEnabled(true);
            c6x.A08.setOnClickListener(c6x.A00);
            return;
        }
        c6x.A08.setEnabled(false);
        c6x.A08.setAlpha(0.3f);
        c6x.A08.setOnClickListener((View.OnClickListener) null);
    }

    public final C06590Pq getSession() {
        return this.A0B;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1961539989);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A0B = A062;
        boolean z = true;
        this.A0D = !A062.A06.A0Y();
        this.A0I = new CHV();
        this.A00 = new C6Z(this);
        C6Y c6y = new C6Y(A062, new C27269C6c(this));
        this.A03 = c6y;
        c6y.A0C = true;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || !bundle3.getBoolean("CloseFriendsV2HomeFragment_extra_is_in_bottom_sheet")) {
            z = false;
        }
        this.A0E = z;
        if (bundle3 != null && bundle3.containsKey("entry_point")) {
            AnonymousClass54G r1 = (AnonymousClass54G) this.mArguments.getSerializable("entry_point");
            this.A0H = r1;
            this.A03.A06 = r1;
        }
        C17640qZ r6 = C17640qZ.A00;
        AnonymousClass0C1 r9 = this.A0B;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.CLOSE_FRIENDS;
        AnonymousClass1NW A032 = r6.A03();
        A032.A03 = new C6R(this);
        A032.A05 = new C6T(this);
        AnonymousClass1OC A092 = r6.A09(this, this, r9, quickPromotionSlot, A032.A00());
        this.A0A = A092;
        C29131Os A002 = C17640qZ.A00.A00(getContext(), this.A0B, A092);
        this.A06 = A002;
        this.A07 = new C29471Qa(ImmutableList.A03(A002));
        AnonymousClass0Z0.A09(1852881037, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        int i;
        int i2;
        int A022 = AnonymousClass0Z0.A02(1655514054);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_v2_close_friends_home, viewGroup, false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.A0G = linearLayoutManager;
        this.A04 = new CHP(getActivity(), inflate, linearLayoutManager, this.A0B, AnonymousClass1L8.A00(this), new C27271C6e(this), this.A0I, this.A03);
        if (this.A0E) {
            viewGroup2 = ((C11870fo) getActivity()).AVK();
        } else {
            viewGroup2 = (ViewGroup) inflate;
        }
        this.A05 = new CHQ(getActivity(), inflate, viewGroup2, this.A0B, AnonymousClass1L8.A00(this), this.A0I, new C27270C6d(this));
        registerLifecycleListener(this.A04);
        registerLifecycleListener(this.A05);
        registerLifecycleListener(this.A0A);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0C = bundle2.getBoolean("CloseFriendsV2HomeFragment_extra_did_show_full_screen_nux");
        }
        if (this.A0E) {
            C06220Of.A0Q(inflate.findViewById(C0003R.C0005id.main_container), 0);
            inflate.findViewById(C0003R.C0005id.header).setVisibility(8);
        } else {
            this.A02 = (LinearLayout) AnonymousClass1E1.A07(inflate, C0003R.C0005id.header);
            IgTextView igTextView = (IgTextView) inflate.findViewById(C0003R.C0005id.close_friends_home_subtitle_text);
            Context context = inflate.getContext();
            if (!this.A0D || this.A0C) {
                i = C0003R.string.close_friends_v2_header_subtitle_text;
                i2 = C0003R.string.close_friends_v2_header_subtitle_action_text;
            } else {
                ((IgImageView) ((ViewStub) inflate.findViewById(C0003R.C0005id.close_friends_home_nux_icon_stub)).inflate()).setImageDrawable(C75933Tu.A00(context, C0003R.C0004drawable.close_friends_star_60));
                ((IgTextView) ((ViewStub) inflate.findViewById(C0003R.C0005id.close_friends_home_nux_title_text_stub)).inflate()).setText(C0003R.string.close_friends_v2_nux_header_title_text);
                i = C0003R.string.close_friends_v2_nux_header_subtitle_text;
                i2 = C0003R.string.close_friends_v2_nux_header_subtitle_action_text;
            }
            StringBuilder sb = new StringBuilder();
            String string = getString(i2);
            String string2 = getString(i);
            sb.append(string2);
            sb.append(" ");
            sb.append(string);
            SpannableString spannableString = new SpannableString(AnonymousClass000.A0J(string2, " ", string));
            Context context2 = getContext();
            AnonymousClass0a4.A06(context2);
            AnonymousClass0a4.A06(context2);
            AnonymousClass4UW r5 = new AnonymousClass4UW(C019000b.A00(context2, AnonymousClass1BA.A03(context2, C0003R.attr.textColorBoldLink)));
            int lastIndexOf = sb.lastIndexOf(string);
            spannableString.setSpan(r5, lastIndexOf, C06360Ot.A00(string) + lastIndexOf, 33);
            igTextView.setText(spannableString);
            igTextView.setContentDescription(spannableString);
            igTextView.setMovementMethod(LinkMovementMethod.getInstance());
            igTextView.setHighlightColor(0);
            igTextView.setOnClickListener(new AnonymousClass48Q(this));
        }
        this.A01 = (FrameLayout) AnonymousClass1E1.A07(inflate, C0003R.C0005id.qp_container);
        if (this.A0D || this.A0C) {
            this.A08 = (IgTextView) ((ViewStub) inflate.findViewById(C0003R.C0005id.done_button_view_stub)).inflate().findViewById(C0003R.C0005id.full_width_done_button);
            int dimensionPixelSize = getResources().getDimensionPixelSize(AnonymousClass1BA.A03(getContext(), C0003R.attr.actionBarHeight));
            C06220Of.A0L(inflate.findViewById(C0003R.C0005id.recycler_view), dimensionPixelSize);
            C06220Of.A0L(inflate.findViewById(C0003R.C0005id.refreshable_container), dimensionPixelSize);
            A02(this);
        }
        AnonymousClass0Z0.A09(-1233804451, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1113346156);
        super.onDestroyView();
        unregisterLifecycleListener(this.A0A);
        AnonymousClass0Z0.A09(1249442941, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1199456620);
        super.onResume();
        this.A04.A03(true);
        this.A0A.BL4();
        AnonymousClass0Z0.A09(1650685009, A022);
    }
}
