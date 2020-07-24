package com.instagram.profile.p021ui.fadeinfollowbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.profile.intf.UserDetailEntryInfo;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass39U;
import p000X.AnonymousClass3AW;
import p000X.AnonymousClass6NT;
import p000X.C019000b;
import p000X.C13300iJ;
import p000X.C13390iS;
import p000X.C467220p;

/* renamed from: com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton */
public class FadeInFollowButton extends ViewSwitcher {
    public static final AlphaAnimation A0D;
    public static final AlphaAnimation A0E;
    public TextView A00;
    public AnonymousClass1NJ A01;
    public UserDetailEntryInfo A02;
    public AnonymousClass39U A03;
    public AnonymousClass0C1 A04;
    public C467220p A05;
    public C13300iJ A06;
    public String A07;
    public String A08;
    public boolean A09;
    public ColorStateList A0A;
    public ViewStub A0B;
    public final C467220p A0C = new AnonymousClass3AW(this);

    public void setContentDescription(CharSequence charSequence) {
        getChildAt(0).setContentDescription(charSequence);
    }

    static {
        AlphaAnimation alphaAnimation = new AlphaAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        A0D = alphaAnimation;
        alphaAnimation.setDuration(200);
        A0D.setStartOffset(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0E = alphaAnimation2;
        alphaAnimation2.setDuration(200);
    }

    private C13390iS getOptimisticFollowStatus() {
        switch (this.A06.A1o.intValue()) {
            case 0:
            case 2:
                return C13390iS.FollowStatusRequested;
            default:
                return C13390iS.FollowStatusFollowing;
        }
    }

    public final void A01() {
        if (!this.A09) {
            this.A00.setTextColor(this.A0A);
            this.A00.setText(C0003R.string.following_button_follow);
            setInAnimation(A0D);
            setOutAnimation(A0E);
        }
    }

    public final void A02(C13300iJ r6, AnonymousClass0C1 r7, C467220p r8, AnonymousClass39U r9, AnonymousClass1NJ r10, String str, String str2, UserDetailEntryInfo userDetailEntryInfo) {
        int i;
        this.A06 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A03 = r9;
        this.A01 = r10;
        this.A07 = str;
        this.A08 = str2;
        this.A02 = userDetailEntryInfo;
        this.A09 = true;
        C13390iS optimisticFollowStatus = getOptimisticFollowStatus();
        switch (getOptimisticFollowStatus().ordinal()) {
            case 3:
                i = C0003R.string.following_button_following;
                break;
            case 4:
                i = C0003R.string.following_button_requested;
                break;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("FadeInFollowButton doesn't support expected follow state ", optimisticFollowStatus.name()));
        }
        this.A00.setText(i);
        this.A00.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_primary_text));
        postDelayed(new AnonymousClass6NT(this), 1500);
    }

    public final void A03(boolean z) {
        if (!this.A09) {
            if (z) {
                setInAnimation((Animation) null);
                setOutAnimation((Animation) null);
            }
            setDisplayedChild(1);
            if (z) {
                setInAnimation(A0D);
                setOutAnimation(A0E);
            }
        }
    }

    public final void A04(boolean z) {
        if (!this.A09) {
            if (z) {
                setInAnimation((Animation) null);
                setOutAnimation((Animation) null);
            }
            setDisplayedChild(0);
            if (z) {
                setInAnimation(A0D);
                setOutAnimation(A0E);
            }
        }
    }

    public void setDisplayedChild(int i) {
        if (!this.A09) {
            super.setDisplayedChild(i);
        }
    }

    public void setSecondaryView(int i) {
        this.A0B.setLayoutResource(i);
        this.A0B.inflate();
    }

    private void A00() {
        int A032 = AnonymousClass0Z0.A03(737597827);
        Context context = getContext();
        inflate(context, C0003R.layout.navbar_overflow_view_switcher_with_follow_button, this);
        this.A00 = (TextView) findViewById(C0003R.C0005id.action_bar_overflow_text);
        this.A0B = (ViewStub) findViewById(C0003R.C0005id.action_bar_view_stub);
        getContext();
        getContext();
        this.A0A = new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{C019000b.A00(context, C0003R.color.blue_3), C019000b.A00(context, C0003R.color.blue_5)});
        AnonymousClass0Z0.A0A(792004905, A032);
    }

    public FadeInFollowButton(Context context) {
        super(context);
        A00();
    }

    public FadeInFollowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
