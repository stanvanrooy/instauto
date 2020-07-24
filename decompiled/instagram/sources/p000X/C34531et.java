package p000X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.1et  reason: invalid class name and case insensitive filesystem */
public final class C34531et implements C34441ek {
    public Drawable A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public ImageView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public C39941no A0I;
    public C64982sM A0J;
    public C158276pM A0K;
    public AnonymousClass3GL A0L;
    public final int A0M = this.A0R.getDimensionPixelSize(C0003R.dimen.facepile_item_size);
    public final int A0N = this.A0R.getDimensionPixelSize(C0003R.dimen.labeled_items_bottom_margin);
    public final int A0O = this.A0R.getDimensionPixelOffset(C0003R.dimen.labeled_items_bottom_margin_in_group_reel);
    public final int A0P = this.A0R.getDimensionPixelSize(C0003R.dimen.labeled_items_horizontal_padding);
    public final int A0Q;
    public final Resources A0R;
    public final Drawable A0S;
    public final View A0T;
    public final View A0U;
    public final View A0V;
    public final View A0W;
    public final View A0X;
    public final View A0Y;
    public final View A0Z;
    public final View A0a;
    public final View A0b;
    public final View A0c;
    public final View A0d;
    public final ViewStub A0e;
    public final ViewStub A0f;
    public final ViewStub A0g;
    public final ViewStub A0h;
    public final ViewStub A0i;
    public final ViewStub A0j;
    public final ViewStub A0k;
    public final LinearLayout A0l;
    public final TextView A0m;
    public final TextView A0n;
    public final TextView A0o;
    public final TextView A0p;
    public final TextView A0q;
    public final C32281at A0r;
    public final ColorFilterAlphaImageView A0s;
    public final ColorFilterAlphaImageView A0t;
    public final C26571Ea A0u;
    public final C26571Ea A0v;
    public final C34601f0 A0w;
    public final C34591ez A0x;
    public final C34551ev A0y;
    public final C34621f2 A0z;
    public final AnonymousClass0C1 A10;
    public final boolean A11;

    public final AnonymousClass3GL AHU() {
        AnonymousClass3GL r1;
        if (this.A0L == null) {
            if (this.A11) {
                r1 = new AnonymousClass9GJ(this.A0x);
            } else {
                r1 = new C698633y(this.A0y);
            }
            this.A0L = r1;
        }
        AnonymousClass3GL r12 = this.A0L;
        r12.Bk3(this.A0J);
        return r12;
    }

    public C34531et(LinearLayout linearLayout, AnonymousClass0C1 r5) {
        this.A10 = r5;
        this.A0l = linearLayout;
        this.A0R = linearLayout.getResources();
        Drawable mutate = C019000b.A03(linearLayout.getContext(), C0003R.C0004drawable.viewers_icon).mutate();
        this.A0S = mutate;
        mutate.setColorFilter(C26771Ff.A00(C019000b.A00(this.A0l.getContext(), C0003R.color.white)));
        this.A0R.getDimensionPixelSize(C0003R.dimen.labeled_items_max_width);
        this.A0Q = this.A0R.getDimensionPixelSize(C0003R.dimen.toolbar_long_text_edge_padding);
        this.A0c = linearLayout.findViewById(C0003R.C0005id.viewer_reel_item_toolbar_container);
        this.A0d = AnonymousClass1E1.A07(linearLayout, C0003R.C0005id.toolbar_buttons_container);
        this.A0a = linearLayout.findViewById(C0003R.C0005id.self_reel_item_toolbar_container);
        this.A0X = linearLayout.findViewById(C0003R.C0005id.toolbar_menu_button);
        this.A0Z = linearLayout.findViewById(C0003R.C0005id.self_toolbar_menu_button);
        this.A0p = (TextView) linearLayout.findViewById(C0003R.C0005id.self_toolbar_menu_button_label);
        this.A0Y = linearLayout.findViewById(C0003R.C0005id.toolbar_reshare_button);
        this.A0b = linearLayout.findViewById(C0003R.C0005id.toolbar_spinner);
        this.A0T = linearLayout.findViewById(C0003R.C0005id.message_composer_camera_button_container);
        this.A0h = (ViewStub) linearLayout.findViewById(C0003R.C0005id.message_composer_large_add_to_group_story_button_stub);
        this.A0s = (ColorFilterAlphaImageView) linearLayout.findViewById(C0003R.C0005id.message_composer_button_camera);
        this.A0n = (TextView) linearLayout.findViewById(C0003R.C0005id.viewer_ar_effect_try_it_text);
        this.A0m = (TextView) linearLayout.findViewById(C0003R.C0005id.viewer_ar_effect_see_details_text);
        this.A0t = (ColorFilterAlphaImageView) linearLayout.findViewById(C0003R.C0005id.toolbar_save_button);
        this.A0i = (ViewStub) linearLayout.findViewById(C0003R.C0005id.toolbar_link_button_stub);
        this.A0j = (ViewStub) linearLayout.findViewById(C0003R.C0005id.toolbar_share_to_link_button_stub);
        this.A0g = (ViewStub) linearLayout.findViewById(C0003R.C0005id.toolbar_highlights_button_stub);
        this.A0v = new C26571Ea((ViewStub) linearLayout.findViewById(C0003R.C0005id.toolbar_facebook_share_button_stub));
        this.A0k = (ViewStub) linearLayout.findViewById(C0003R.C0005id.viewers_facepile_button_stub);
        this.A0f = (ViewStub) linearLayout.findViewById(C0003R.C0005id.toolbar_archive_share_button_stub);
        this.A0e = (ViewStub) linearLayout.findViewById(C0003R.C0005id.toolbar_add_to_group_story_button_stub);
        this.A0y = new C34551ev(linearLayout.findViewById(C0003R.C0005id.cta_container), r5);
        this.A0x = new C34591ez(linearLayout.findViewById(C0003R.C0005id.cta_button_container), r5);
        TextView textView = (TextView) linearLayout.findViewById(C0003R.C0005id.toolbar_text);
        this.A0q = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.A0U = linearLayout.findViewById(C0003R.C0005id.message_composer_container);
        this.A0o = (TextView) linearLayout.findViewById(C0003R.C0005id.composer_text);
        this.A0W = linearLayout.findViewById(C0003R.C0005id.toolbar_composer_quick_reaction_button);
        this.A0V = linearLayout.findViewById(C0003R.C0005id.toolbar_composer_menu_button);
        this.A0u = new C26571Ea((ViewStub) linearLayout.findViewById(C0003R.C0005id.toolbar_create_clips_button_stub));
        this.A0w = new C34601f0(new C26571Ea((ViewStub) linearLayout.findViewById(C0003R.C0005id.reel_item_action_button_stub)));
        this.A0z = new C34621f2((ViewStub) linearLayout.findViewById(C0003R.C0005id.reel_swipe_up_instructions_stub));
        this.A0r = new C32281at((ViewStub) linearLayout.findViewById(C0003R.C0005id.reel_branded_content_violation_banner));
        this.A11 = C34581ey.A0D(r5);
    }
}
