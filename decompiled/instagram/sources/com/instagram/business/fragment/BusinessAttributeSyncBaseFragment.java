package com.instagram.business.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.model.BusinessAttribute;
import com.instagram.business.p015ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.StepperHeader;
import com.instagram.p009ui.menu.CheckRadioButton;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass63U;
import p000X.AnonymousClass63X;
import p000X.AnonymousClass67b;
import p000X.C019000b;
import p000X.C120245Dw;
import p000X.C1424267a;
import p000X.C26771Ff;
import p000X.C27341Hl;

public abstract class BusinessAttributeSyncBaseFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass63X {
    public RadioGroup A00;
    public BusinessAttribute A01;
    public BusinessAttribute A02;
    public BusinessAttribute A03;
    public String A04;
    public String A05;
    public List A06;
    public AnonymousClass67b A07;
    public BusinessNavBar mBusinessNavBar;
    public AnonymousClass63U mBusinessNavBarHelper;
    public StepperHeader mStepperHeader;

    public final void A02(String str) {
        for (int i = 0; i < this.A06.size(); i++) {
            C120245Dw r6 = (C120245Dw) this.A06.get(i);
            int i2 = i + 1;
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2, 16.0f);
            CheckRadioButton checkRadioButton = (CheckRadioButton) LayoutInflater.from(getContext()).inflate(C0003R.layout.row_check_radio_button_item, (ViewGroup) null);
            boolean equals = "instagram".equals(r6.A02);
            int i3 = C0003R.C0004drawable.instagram_facebook_circle_outline_24;
            if (equals) {
                i3 = C0003R.C0004drawable.instagram_app_instagram_outline_24;
            }
            Drawable A032 = C019000b.A03(getContext(), i3);
            A032.setColorFilter(C26771Ff.A00(C019000b.A00(getContext(), C0003R.color.igds_primary_icon)));
            checkRadioButton.setButtonDrawable(A032);
            checkRadioButton.setLayoutParams(layoutParams);
            checkRadioButton.setId(i2);
            String str2 = r6.A03;
            if (TextUtils.isEmpty(str2)) {
                checkRadioButton.setText(str);
                checkRadioButton.setEnabled(false);
            } else {
                checkRadioButton.setText(str2);
                if (this.A04.equals(r6.A02)) {
                    checkRadioButton.setChecked(true);
                }
            }
            this.A00.addView(checkRadioButton);
            if (i != this.A06.size() - 1) {
                LayoutInflater.from(getContext()).inflate(C0003R.layout.row_divider, this.A00);
            }
        }
    }

    public final void AC1() {
    }

    public final void ACw() {
    }

    public final void BLe() {
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void A01() {
        Bundle bundle = this.mArguments;
        AnonymousClass0a4.A06(bundle);
        this.A01 = (BusinessAttribute) bundle.get("fb_attributes");
        this.A02 = (BusinessAttribute) bundle.get("ig_attributes");
        BusinessAttribute businessAttribute = (BusinessAttribute) bundle.get("sync_attributes");
        this.A03 = businessAttribute;
        AnonymousClass0a4.A06(this.A01);
        AnonymousClass0a4.A06(this.A02);
        AnonymousClass0a4.A06(businessAttribute);
    }

    public final void A03(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        arrayList.add(new C120245Dw("instagram", str2));
        this.A06.add(new C120245Dw("facebook", str));
    }

    public void BFZ() {
        AnonymousClass67b r0 = this.A07;
        if (r0 != null) {
            r0.AoZ();
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass67b r0 = this.A07;
        if (r0 == null) {
            return false;
        }
        r0.Be6();
        this.A07.AnY("tap_back");
        return true;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BmK(C0003R.string.attribute_sync_action_bar_title);
        r3.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new C1424267a(this));
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
        this.A07 = r1;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(520151692);
        View inflate = layoutInflater.inflate(C0003R.layout.base_contact_review_layout, viewGroup, false);
        ((TextView) inflate.findViewById(C0003R.C0005id.title)).setText(C0003R.string.attribute_sync_review_info);
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.findViewById(C0003R.C0005id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        AnonymousClass63U r2 = new AnonymousClass63U(this, businessNavBar, C0003R.string.next, -1);
        this.mBusinessNavBarHelper = r2;
        registerLifecycleListener(r2);
        AnonymousClass0Z0.A09(461372335, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1846455959);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        this.mBusinessNavBar = null;
        this.mBusinessNavBarHelper = null;
        this.A00 = null;
        this.mStepperHeader = null;
        AnonymousClass0Z0.A09(-90797797, A022);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(C0003R.C0005id.contact_preference_group);
        this.A00 = radioGroup;
        radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        this.A00.removeAllViews();
        if (this.A07 != null) {
            StepperHeader stepperHeader = (StepperHeader) view.findViewById(C0003R.C0005id.stepper_header);
            this.mStepperHeader = stepperHeader;
            stepperHeader.setVisibility(0);
            this.mStepperHeader.A03(this.A07.ABJ(), this.A07.BrZ());
        }
    }
}
