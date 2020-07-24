package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.1un  reason: invalid class name and case insensitive filesystem */
public final class C43631un implements View.OnAttachStateChangeListener {
    public View.OnClickListener A00;
    public UserDetailEntryInfo A01;
    public FollowButton A02;
    public String A03;
    public String A04;
    public String A05;
    public final C43641uo A06 = new C43641uo();

    public final void A00(AnonymousClass0C1 r2, C13300iJ r3) {
        A01(r2, r3, (C467220p) null);
    }

    public final void A01(AnonymousClass0C1 r8, C13300iJ r9, C467220p r10) {
        A02(r8, r9, r10, (AnonymousClass1NJ) null, (C06270Ok) null, (AnonymousClass1I6) null);
    }

    public final void A02(AnonymousClass0C1 r9, C13300iJ r10, C467220p r11, AnonymousClass1NJ r12, C06270Ok r13, AnonymousClass1I6 r14) {
        A04(r9, r10, r11, r12, r13, r14, (String) null);
    }

    public final void A04(AnonymousClass0C1 r12, C13300iJ r13, C467220p r14, AnonymousClass1NJ r15, C06270Ok r16, AnonymousClass1I6 r17, String str) {
        C13300iJ r3 = r13;
        if (r13 != null) {
            AnonymousClass0C1 r4 = r12;
            C13390iS A0J = C26661Ek.A00(r12).A0J(r13);
            this.A02.A00(A0J);
            if (C14090jk.A05(r12, r13)) {
                this.A02.setVisibility(8);
                return;
            }
            this.A02.setVisibility(0);
            this.A02.A01(r13, A0J);
            FollowButton followButton = this.A02;
            View.OnClickListener onClickListener = this.A00;
            if (onClickListener == null) {
                onClickListener = new C467320q(this, r3, r4, r14, A0J, r15, r16, r17, str);
            }
            followButton.setOnClickListener(onClickListener);
        }
    }

    public final void A05(AnonymousClass0C1 r9, C13300iJ r10, C467220p r11, String str) {
        A04(r9, r10, r11, (AnonymousClass1NJ) null, (C06270Ok) null, (AnonymousClass1I6) null, str);
    }

    public final void A03(AnonymousClass0C1 r24, C13300iJ r25, C467220p r26, AnonymousClass1NJ r27, C06270Ok r28, AnonymousClass1I6 r29, String str) {
        Resources resources;
        int i;
        String string;
        AnonymousClass0C1 r12 = r24;
        C13300iJ r13 = r25;
        C13390iS A0J = C26661Ek.A00(r12).A0J(r13);
        C43641uo r7 = this.A06;
        FollowButton followButton = this.A02;
        Context context = followButton.getContext();
        if (!AnonymousClass0NT.A07(context) && !C16180oA.A00(r12).A00.getBoolean("seen_offline_follow_nux", false) && (A0J == C13390iS.FollowStatusFollowing || A0J == C13390iS.FollowStatusNotFollowing)) {
            if (r7.A02 == null) {
                r7.A02 = new C105754hN(r7, r12);
            }
            AnonymousClass1RF r8 = r7.A02;
            if (A0J != C13390iS.FollowStatusNotFollowing) {
                resources = context.getResources();
                i = C0003R.string.offline_unfollow_nux_title;
                string = resources.getString(i, new Object[]{r13.A0B()});
            } else if (r13.A1o == Constants.A0C) {
                string = context.getResources().getString(C0003R.string.offline_follow_request_nux_title);
            } else {
                resources = context.getResources();
                i = C0003R.string.offline_follow_nux_title;
                string = resources.getString(i, new Object[]{r13.A0B()});
            }
            Object A012 = AnonymousClass0PK.A01(context, Activity.class);
            AnonymousClass0a4.A06(A012);
            C56142c0 r1 = new C56142c0((Activity) A012, new AnonymousClass95U((CharSequence) string));
            r1.A05 = C56162c2.BELOW_ANCHOR;
            r1.A09 = false;
            r1.A04 = r8;
            r1.A0B = false;
            r1.A02(followButton);
            r7.A01 = r1.A00();
            if (r7.A00 == null) {
                r7.A00 = new Handler(Looper.getMainLooper());
            }
            Runnable runnable = r7.A03;
            if (runnable == null) {
                r7.A03 = new C105764hO(r7);
            } else {
                AnonymousClass0ZA.A08(r7.A00, runnable);
            }
            AnonymousClass0ZA.A09(r7.A00, r7.A03, 500, -1035528114);
        }
        this.A02.A00(A0J);
        Context context2 = this.A02.getContext();
        String str2 = this.A03;
        String str3 = this.A05;
        C467220p r14 = r26;
        String str4 = this.A04;
        UserDetailEntryInfo userDetailEntryInfo = this.A01;
        String str5 = str3;
        AnonymousClass5GK.A00(context2, r12, r13, r14, str2, str5, str4, userDetailEntryInfo, r27, r28, r29, str);
    }

    public final void onViewAttachedToWindow(View view) {
        this.A06.A00(true);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A06.A00(false);
    }

    public C43631un(FollowButton followButton) {
        this.A02 = followButton;
    }
}
