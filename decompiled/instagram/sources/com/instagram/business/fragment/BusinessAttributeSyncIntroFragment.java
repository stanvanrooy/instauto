package com.instagram.business.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.facepile.IgFacepile;
import java.util.Arrays;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1LT;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.AnonymousClass67W;
import p000X.AnonymousClass67b;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C1424767h;
import p000X.C27341Hl;
import p000X.C31791Zy;
import p000X.C55072a1;

public class BusinessAttributeSyncIntroFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass63X {
    public AnonymousClass67b A00;
    public AnonymousClass0C1 A01;
    public BusinessNavBar mBusinessNavBar;
    public AnonymousClass63U mBusinessNavBarHelper;

    public final void AC1() {
    }

    public final void ACw() {
    }

    public final void BLe() {
    }

    public final String getModuleName() {
        return "business_attribute_splash_fragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void BFZ() {
        AnonymousClass67b r0 = this.A00;
        if (r0 != null) {
            r0.AoZ();
            this.A00.AnY((String) null);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BmB(C0003R.C0004drawable.instagram_x_outline_24, new C1424767h(this));
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onAttach(Context context) {
        AnonymousClass67b r1;
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof AnonymousClass67b) {
            r1 = (AnonymousClass67b) activity;
        } else {
            r1 = null;
        }
        AnonymousClass0a4.A06(r1);
        this.A00 = r1;
    }

    public final boolean onBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(568576409);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0J1.A06(this.mArguments);
        AnonymousClass0Z0.A09(1651683553, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(-324760599);
        View inflate = layoutInflater.inflate(C0003R.layout.business_attribute_sync_intro, viewGroup, false);
        ((TextView) inflate.findViewById(C0003R.C0005id.title)).setText(C0003R.string.attribute_sync_intro_title);
        ((TextView) inflate.findViewById(C0003R.C0005id.subtitle)).setText(C0003R.string.attribute_sync_intro_subtitle);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        this.mBusinessNavBarHelper = new AnonymousClass63U(this, businessNavBar, C0003R.string.get_started, -1);
        this.mBusinessNavBar.A01();
        this.mBusinessNavBar.setFooterTerms(getString(C0003R.string.attribute_sync_landing_terms));
        registerLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass0C1 r2 = this.A01;
        Context context = inflate.getContext();
        int round = Math.round(inflate.getResources().getDimension(C0003R.dimen.facepile_large_diameter_secondary));
        ImageUrl ASv = r2.A06.ASv();
        Resources resources = context.getResources();
        Drawable A022 = AnonymousClass67W.A02(context, ASv, resources.getDimensionPixelSize(C0003R.dimen.facepile_large_diameter_primary), resources.getDimensionPixelSize(C0003R.dimen.facepile_large_outer_stroke_width), C019000b.A00(context, C0003R.color.facepile_large_outer_stroke_color));
        Drawable A002 = AnonymousClass67W.A00(context, AnonymousClass1LT.A00(C019000b.A03(context, C0003R.C0004drawable.facebook_facepile_icon)));
        LinearGradient A023 = C31791Zy.A02(context, round, round);
        Drawable mutate = C55072a1.A02(C019000b.A03(context, C0003R.C0004drawable.instagram_app_instagram_outline_24)).mutate();
        C55072a1.A06(mutate, -1);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setBounds(new Rect(0, 0, round, round));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{AnonymousClass1LT.A08(context, A023, shapeDrawable), mutate});
        int round2 = Math.round(((float) (round - mutate.getIntrinsicWidth())) / 2.0f);
        layerDrawable.setLayerInset(1, round2, round2, round2, round2);
        ((IgFacepile) inflate.findViewById(C0003R.C0005id.social_context_facepile)).setImageDrawables(Arrays.asList(new Drawable[]{AnonymousClass67W.A00(context, AnonymousClass1LT.A00(layerDrawable)), A022, A002}));
        AnonymousClass0Z0.A09(651356188, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0Z0.A02(1789281484);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        this.mBusinessNavBarHelper = null;
        this.mBusinessNavBar = null;
        AnonymousClass0Z0.A09(1802361108, A02);
    }
}
