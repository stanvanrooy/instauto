package com.instagram.profile.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.recommended.FollowListData;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1D1;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1N4;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1TY;
import p000X.AnonymousClass1US;
import p000X.AnonymousClass1UY;
import p000X.AnonymousClass1UZ;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass2A5;
import p000X.AnonymousClass2KM;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2TH;
import p000X.AnonymousClass2TI;
import p000X.AnonymousClass2UC;
import p000X.AnonymousClass2UD;
import p000X.AnonymousClass2VW;
import p000X.AnonymousClass380;
import p000X.AnonymousClass388;
import p000X.AnonymousClass38B;
import p000X.AnonymousClass39B;
import p000X.AnonymousClass39P;
import p000X.AnonymousClass39Q;
import p000X.AnonymousClass39R;
import p000X.AnonymousClass39T;
import p000X.AnonymousClass39U;
import p000X.AnonymousClass39V;
import p000X.AnonymousClass39W;
import p000X.AnonymousClass3AN;
import p000X.AnonymousClass3AT;
import p000X.AnonymousClass3B6;
import p000X.AnonymousClass3C0;
import p000X.AnonymousClass3C6;
import p000X.AnonymousClass4BH;
import p000X.AnonymousClass4D4;
import p000X.AnonymousClass4KN;
import p000X.AnonymousClass51O;
import p000X.AnonymousClass5DQ;
import p000X.AnonymousClass5G1;
import p000X.AnonymousClass5GK;
import p000X.AnonymousClass609;
import p000X.AnonymousClass68N;
import p000X.AnonymousClass68Q;
import p000X.AnonymousClass6GA;
import p000X.AnonymousClass6LX;
import p000X.AnonymousClass6TJ;
import p000X.AnonymousClass6TK;
import p000X.AnonymousClass7BW;
import p000X.AnonymousClass9FE;
import p000X.AnonymousClass9FF;
import p000X.B4b;
import p000X.C05000Hl;
import p000X.C06220Of;
import p000X.C06270Ok;
import p000X.C107124jd;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C116394zD;
import p000X.C116444zJ;
import p000X.C120595Fg;
import p000X.C120735Fu;
import p000X.C120745Fv;
import p000X.C123985Sy;
import p000X.C124685Vw;
import p000X.C12890hY;
import p000X.C13300iJ;
import p000X.C13390iS;
import p000X.C13460iZ;
import p000X.C13510ie;
import p000X.C14090jk;
import p000X.C14100jl;
import p000X.C1414262u;
import p000X.C144546Gb;
import p000X.C145676Kq;
import p000X.C15890nh;
import p000X.C16180oA;
import p000X.C16230oG;
import p000X.C17020pY;
import p000X.C17510qM;
import p000X.C17530qO;
import p000X.C17850qu;
import p000X.C17990r8;
import p000X.C18320rf;
import p000X.C18980sj;
import p000X.C19000sl;
import p000X.C21980xe;
import p000X.C23300zv;
import p000X.C26441Dh;
import p000X.C26661Ek;
import p000X.C27171Gt;
import p000X.C27264C5x;
import p000X.C27291Hg;
import p000X.C27355CAa;
import p000X.C27371Ho;
import p000X.C27665CMj;
import p000X.C28051Kf;
import p000X.C30231Ta;
import p000X.C30549DeX;
import p000X.C30551DeZ;
import p000X.C31121Wn;
import p000X.C31201Wx;
import p000X.C31811a0;
import p000X.C33441cv;
import p000X.C34071dx;
import p000X.C36981iv;
import p000X.C468621e;
import p000X.C482427f;
import p000X.C482527g;
import p000X.C51512Ky;
import p000X.C51522Kz;
import p000X.C52362Om;
import p000X.C52902Qq;
import p000X.C52912Qs;
import p000X.C52932Qu;
import p000X.C52952Qw;
import p000X.C53882Us;
import p000X.C53892Uu;
import p000X.C56202c6;
import p000X.C57942f3;
import p000X.C58422fu;
import p000X.C59012gt;
import p000X.C59032gv;
import p000X.C62922ob;
import p000X.C63572ph;
import p000X.C68132yV;
import p000X.C689630l;
import p000X.C69;
import p000X.C709138e;
import p000X.C711339b;
import p000X.C71343Ad;
import p000X.C72793Ha;
import p000X.C72803Hb;
import p000X.C77383Zp;
import p000X.C96674Gb;
import p000X.C97854Kr;

public final class UserDetailDelegate extends C27291Hg implements AnonymousClass39P, AnonymousClass1HL, C68132yV, AnonymousClass39Q, AnonymousClass39R, AnonymousClass39T, AnonymousClass1W5, C63572ph, AnonymousClass39U {
    public C51522Kz A00;
    public C62922ob A01;
    public AutoLaunchReelParams A02;
    public C124685Vw A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07 = false;
    public final FragmentActivity A08;
    public final C31121Wn A09;
    public final AnonymousClass1US A0A;
    public final AnonymousClass0QT A0B;
    public final C27371Ho A0C;
    public final C72793Ha A0D;
    public final C52932Qu A0E;
    public final C72803Hb A0F;
    public final AnonymousClass39B A0G;
    public final UserDetailFragment A0H;
    public final UserDetailTabController A0I;
    public final AnonymousClass1UY A0J;
    public final AnonymousClass0C1 A0K;
    public final AnonymousClass1D1 A0L;
    public final String A0M;
    public final String A0N;
    public final C52912Qs A0O;
    public final C11200ea A0P = new AnonymousClass39V(this);
    public final UserDetailLaunchConfig A0Q;
    public final AnonymousClass380 A0R;
    public final String A0S;
    public final List A0T = new ArrayList();

    public final void Aw7(C13300iJ r1) {
    }

    public final void AwG(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void B5C(C13300iJ r1) {
    }

    public final void B5D(C13300iJ r1) {
    }

    public final void B8p(C31811a0 r12, List list, Reel reel) {
        String str;
        AnonymousClass1OY r9;
        C31811a0 r4 = r12;
        View AGS = r12.AGS();
        if (this.A03 == null) {
            this.A03 = new C124685Vw((Activity) this.A08, AGS, (AnonymousClass1W5) this);
        }
        if (!this.A03.A00.equals(C06220Of.A0A(AGS))) {
            this.A03.A00 = C06220Of.A0A(AGS);
        }
        C124685Vw r2 = this.A03;
        AnonymousClass1UY r3 = this.A0J;
        r3.A0A = this.A0H.A0l.A04;
        r3.A00 = new AnonymousClass39W(A02(this));
        r3.A04 = r2;
        List list2 = list;
        boolean z = false;
        if (list.size() >= 2) {
            z = true;
        }
        r3.A0D = z;
        AutoLaunchReelParams autoLaunchReelParams = this.A02;
        if (autoLaunchReelParams != null) {
            str = autoLaunchReelParams.A03;
            AnonymousClass1UY r1 = this.A0J;
            r1.A0E = autoLaunchReelParams.A05;
            r1.A0G = autoLaunchReelParams.A08;
            r1.A0F = autoLaunchReelParams.A06;
            r1.A09 = autoLaunchReelParams.A02;
        } else {
            str = null;
        }
        AnonymousClass1UY r32 = this.A0J;
        if (str != null) {
            r9 = AnonymousClass1OY.PUSH_NOTIFICATION;
        } else {
            r9 = AnonymousClass1OY.PROFILE;
        }
        r32.A04(r4, reel, list2, list, list, r9, str);
        this.A02 = null;
    }

    public final void B91(C13300iJ r11, int i) {
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_more", A01(this), A02(this), this.A0M, this.A0N, "cta");
        C13300iJ r6 = r11;
        AnonymousClass68Q r3 = new AnonymousClass68Q(this.A08, this.A0H, r6, this.A0K, this, i);
        AnonymousClass2OA r2 = new AnonymousClass2OA(r3.A00);
        r2.A0K(r3.A01);
        r2.A0W(AnonymousClass68Q.A00(r3), r3.A06);
        r2.A0V(true);
        r2.A03().show();
    }

    public final void BHS(Reel reel) {
    }

    public final void BHt(Reel reel) {
    }

    public final void BIH(C13300iJ r1) {
    }

    public final void BKc(C13300iJ r1, int i) {
    }

    public final boolean BmW(C13300iJ r2) {
        return false;
    }

    public static Context A00(UserDetailDelegate userDetailDelegate) {
        return userDetailDelegate.A0H.getContext();
    }

    public static AnonymousClass3C6 A01(UserDetailDelegate userDetailDelegate) {
        C13300iJ A072 = userDetailDelegate.A0I.A07();
        AnonymousClass0C1 r2 = userDetailDelegate.A0K;
        if (r2.A06.getId().equals(A072.getId())) {
            return AnonymousClass3C6.SELF;
        }
        if (C26661Ek.A00(r2).A0J(A072).equals(C13390iS.FollowStatusFollowing)) {
            return AnonymousClass3C6.FOLLOWING;
        }
        return AnonymousClass3C6.NOT_FOLLOWING;
    }

    public static String A02(UserDetailDelegate userDetailDelegate) {
        C13300iJ A072 = userDetailDelegate.A0I.A07();
        if (A072 != null) {
            return A072.getId();
        }
        return userDetailDelegate.A0Q.A0D;
    }

    public static ArrayList A03(C13300iJ r3) {
        ArrayList arrayList = new ArrayList();
        List<C13300iJ> list = r3.A2p;
        if (list != null) {
            for (C13300iJ id : list) {
                arrayList.add(id.getId());
            }
        }
        return arrayList;
    }

    private void A04() {
        if (this.A0H.isVisible()) {
            UserDetailFragment userDetailFragment = this.A0H;
            C17850qu A002 = C120745Fv.A00(this.A0K, this.A0I.A07().getId());
            A002.A00 = new C120735Fu(this);
            userDetailFragment.schedule(A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r7.A07(r4.A0K) != false) goto L_0x000b;
     */
    public static void A05(UserDetailDelegate userDetailDelegate, AnonymousClass3B6 r5, C13300iJ r6, C71343Ad r7) {
        boolean z;
        AnonymousClass1D1 r3;
        if (r7 != null) {
            z = true;
        }
        z = false;
        AnonymousClass0C1 r1 = userDetailDelegate.A0K;
        if (C14090jk.A05(r1, r6) && (r3 = userDetailDelegate.A0L) != null && !z) {
            C27171Gt r12 = new C27171Gt();
            r12.A00 = r3.AIZ().A05();
            r12.A0B = true;
            r12.A09 = "profile_picture_tap_on_self_profile";
            r3.Bsx(r12);
        } else if (z) {
            userDetailDelegate.B8p(r5, r7.A04(r1), r7.A02(userDetailDelegate.A0K));
        }
    }

    public static void A06(UserDetailDelegate userDetailDelegate, C13300iJ r13, Context context, String str) {
        AnonymousClass6TK.A01(userDetailDelegate.A0K, userDetailDelegate.A0S, "get_directions", "business_profile", r13.getId(), C13300iJ.A02(r13.A0M));
        AnonymousClass6TJ.A00(userDetailDelegate.A0K, Constants.A0N, r13, userDetailDelegate.A0H, userDetailDelegate.A0M, userDetailDelegate.A0N);
        AnonymousClass3C0.A03(userDetailDelegate.A0K, userDetailDelegate.A0H, "tap_directions", A01(userDetailDelegate), A02(userDetailDelegate), userDetailDelegate.A0M, userDetailDelegate.A0N, str);
        C97854Kr.A03(context, r13.A23, r13.A21, r13.A22);
    }

    private void A08(C13390iS r11, String str) {
        String str2;
        if (r11 == C13390iS.FollowStatusFollowing) {
            str2 = "unfollow";
        } else {
            str2 = "follow";
        }
        AnonymousClass3C0.A04(this.A0K, this.A0H, str2, AnonymousClass3C0.A01(r11), A02(this), this.A0M, this.A0N, this.A04, this.A05, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0099, code lost:
        if (r3 == p000X.C13390iS.FollowStatusRequested) goto L_0x009b;
     */
    private void A09(C13300iJ r14, String str, boolean z) {
        boolean z2;
        String str2;
        C13390iS r2 = r14.A0N;
        String str3 = str;
        if (r14.A0e()) {
            AnonymousClass3C0.A04(this.A0K, this.A0H, "unblock", AnonymousClass3C0.A01(r2), A02(this), this.A0M, this.A0N, this.A04, this.A05, str3);
        } else {
            A08(r2, str);
        }
        if (r2 == C13390iS.FollowStatusNotFollowing) {
            if (z) {
                if ((!this.A0H.A1V.A00.isEmpty()) || !this.A0I.A07().A0c()) {
                    this.A0I.A0D(AnonymousClass2KM.Open);
                } else {
                    A04();
                }
            }
            if (r14.A0l()) {
                C17990r8.A00.A01(this.A0K);
                UserDetailFragment userDetailFragment = this.A0H;
                AnonymousClass0C1 r0 = this.A0K;
                String id = r14.getId();
                C15890nh r3 = new C15890nh(r0);
                r3.A09 = Constants.ONE;
                r3.A0C = "friendships/recommend_accounts/remind/";
                r3.A09("receiver_id", id);
                r3.A06(AnonymousClass1N4.class, false);
                userDetailFragment.schedule(r3.A03());
            }
        }
        if (!TextUtils.isEmpty(this.A0Q.A0A)) {
            AnonymousClass0C1 r5 = this.A0K;
            UserDetailFragment userDetailFragment2 = this.A0H;
            String str4 = this.A0Q.A0A;
            String str5 = this.A04;
            String str6 = this.A05;
            C13390iS r32 = r14.A0M;
            if (r32 != C13390iS.FollowStatusFollowing) {
                z2 = false;
            }
            z2 = true;
            if (z2) {
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("search_follow_button_clicked", userDetailFragment2);
                A002.A0G("rank_token", str4);
                A002.A0G(MemoryDumpUploadJob.EXTRA_USER_ID, r14.getId());
                A002.A0A("inline", false);
                if (r14.A0M == C13390iS.FollowStatusFollowing) {
                    str2 = "follow";
                } else {
                    str2 = "requested";
                }
                A002.A0G("follow_status", str2);
                A002.A0H("hashtag_id", str5);
                A002.A0H("hashtag_name", str6);
                AnonymousClass0WN.A01(r5).BcG(A002);
            }
        }
        if (C26661Ek.A00(this.A0K).A0J(r14) == C13390iS.FollowStatusNotFollowing && r14.A1o == Constants.A0C) {
            C17020pY.A00().A0Q(this.A0K).A0Q(r14.getId());
            C709138e r02 = this.A0I.A0E;
            r02.A0A = null;
            C709138e.A00(r02);
        }
        if (r2 == C13390iS.FollowStatusFollowing && r14.A0l()) {
            AnonymousClass0L7 r33 = AnonymousClass0L7.UNFOLLOW_RECIPROCAL;
            if (C144546Gb.A00(new C05000Hl("is_enabled", r33, false, (String[]) null, (AnonymousClass04H) null), new C05000Hl("is_rollout", r33, (Object) null, (String[]) null, (AnonymousClass04H) null), this.A0K)) {
                C123985Sy r6 = new C123985Sy(this);
                C51512Ky r22 = new C51512Ky();
                r22.A09 = A00(this).getString(C0003R.string.remove_follower_prompt, new Object[]{r14.AZn()});
                r22.A04 = r14.ASv();
                r22.A06 = Constants.A0C;
                r22.A0B = true;
                r22.A05 = r6;
                r22.A08 = A00(this).getString(C0003R.string.remove_follower);
                r22.A00 = 10000;
                r22.A01 = A00(this).getResources().getDimensionPixelOffset(C0003R.dimen.tab_bar_height);
                C51522Kz A003 = r22.A00();
                this.A00 = A003;
                C11130eT.A01.BXT(new C33441cv(A003));
            }
        }
    }

    public final int A0A() {
        C13300iJ r0 = this.A0H.A0r;
        if (r0 == null || !r0.A36 || C16180oA.A00(this.A0K).A00.getBoolean("has_tapped_on_favorites_profile_navbar_icon", false)) {
            return 0;
        }
        return 1;
    }

    public final void A0B() {
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_profile_bio_more", A01(this), A02(this), this.A0M, this.A0N, "user_profile_header");
        C709138e r1 = this.A0I.A0E;
        r1.A0I = true;
        C709138e.A00(r1);
    }

    public final void A0C() {
        AnonymousClass0a4.A06(this.A0H.A0r);
        Intent intent = new Intent(this.A08, BusinessConversionActivity.class);
        Bundle bundle = this.A0H.mArguments;
        bundle.putString("entry_point", "setting");
        bundle.putInt("intro_entry_position", 0);
        if (((Boolean) AnonymousClass0L6.A02(this.A0K, AnonymousClass0L7.CX_PROFILE_SLIDEOUT_MENU_ENTRYPOINT, "is_creator_tools_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C53882Us.A01();
            bundle.putInt("business_account_flow", C53892Uu.A00(Constants.A0C));
            intent.putExtras(bundle);
            AnonymousClass1BH.A0B(intent, 13, this.A0H);
            return;
        }
        AnonymousClass2OA r4 = new AnonymousClass2OA(A00(this));
        r4.A07(C0003R.string.slideout_menu_get_insights_dialog_header);
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A0K, AnonymousClass0L7.CX_PROFILE_SLIDEOUT_MENU_ENTRYPOINT, "is_professional_tools_enabled", false, (AnonymousClass04H) null)).booleanValue();
        int i = C0003R.string.slideout_menu_get_insights_dialog_message;
        if (booleanValue) {
            i = C0003R.string.slideout_menu_add_professional_tools_dialog_message;
        }
        r4.A06(i);
        r4.A0A(C0003R.string.continue_to, new AnonymousClass51O(this, bundle, intent));
        r4.A09(C0003R.string.not_now, (DialogInterface.OnClickListener) null);
        r4.A03().show();
    }

    public final void A0D(RectF rectF, C77383Zp r10) {
        C19000sl.A00.A01();
        Bundle bundle = new Bundle();
        bundle.putParcelable("NametagFragment.ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
        bundle.putSerializable("NametagFragment.ARGUMENT_ENTRY_POINT", r10);
        bundle.putBoolean("NametagFragment.ARGUMENT_SCAN_MODE", false);
        C59032gv r2 = new C59032gv(this.A0K, TransparentModalActivity.class, "nametag", bundle, this.A08);
        r2.A0A = ModalActivity.A04;
        r2.A06(this.A08);
    }

    public final void A0F(C13300iJ r4, C689630l r5, String str) {
        switch (r5.ordinal()) {
            case 5:
                AnonymousClass6LX.A04(this.A0B, str, r4.getId());
                return;
            case 6:
                AnonymousClass6LX.A0B(this.A0B, "click", str, r4.getId());
                return;
            default:
                AnonymousClass0QD.A01("restrict_error", "unsupported entrypoint requested logging event.");
                return;
        }
    }

    public final void A0G(AnonymousClass5DQ r12) {
        AnonymousClass1HD A052;
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_follow_details", A01(this), A02(this), this.A0M, this.A0N, "user_profile_header");
        FollowListData A002 = FollowListData.A00(r12, this.A0I.A07().getId());
        C52362Om r3 = new C52362Om(this.A08, this.A0K);
        r3.A0B = true;
        C13300iJ A072 = this.A0I.A07();
        AnonymousClass0a4.A06(A072);
        if (AnonymousClass388.A02(this.A0K, A072)) {
            C116444zJ A003 = C17530qO.A00.A00();
            A052 = A003.A03(A003.A02(this.A0K, A002, A072));
        } else {
            boolean z = false;
            if (A002.A00 == AnonymousClass5DQ.Mutual) {
                z = true;
            }
            AnonymousClass0a4.A09(z);
            A052 = C17530qO.A00.A00().A05(this.A0K, A072.getId(), A002, false, 0);
        }
        r3.A02 = A052;
        r3.A02();
    }

    public final AnonymousClass5G1 ATf(C13300iJ r5) {
        AnonymousClass5G1 r0 = (AnonymousClass5G1) C17990r8.A00.A01(this.A0K).A00.get(AnonymousClass000.A03(this.A0I.A07().getId(), '|', r5.getId()));
        if (r0 == null) {
            return AnonymousClass5G1.NOT_SENT;
        }
        return r0;
    }

    public final void Anj(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass1AM r0;
        AnonymousClass3C0.A03(this.A0K, this.A0H, str, A01(this), A02(this), this.A0M, this.A0N, str2);
        C26441Dh A002 = C26441Dh.A00(this.A0K);
        UserDetailFragment userDetailFragment = this.A0H;
        AnonymousClass1HD r02 = userDetailFragment.mParentFragment;
        if (r02 == null) {
            r0 = userDetailFragment.mFragmentManager;
        } else {
            r0 = r02.mFragmentManager;
        }
        A002.A08(userDetailFragment, r0.A0I(), str4, new C116394zD(this, str3, str5, str6));
        C26441Dh.A00(this.A0K).A06(this.A0H);
        C711339b r03 = this.A0H.A0f;
        if (r03 != null) {
            r03.A00 = str6;
        }
    }

    public final void Ats(C13300iJ r20, String str) {
        C13300iJ r14 = r20;
        String str2 = r14.A2N;
        String str3 = r14.A2J;
        String str4 = str;
        if (!TextUtils.isEmpty(str2)) {
            C06270Ok A002 = C06270Ok.A00();
            A002.A09("app_id", r14.A2L);
            AnonymousClass6TK.A00(this.A0K, this.A0S, r14.getId(), C13300iJ.A02(r14.A0M), A002);
            AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_fbe", A01(this), A02(this), this.A0M, this.A0N, str4);
            AnonymousClass2UC r4 = new AnonymousClass2UC(this.A0H.requireActivity(), this.A0K, str2, AnonymousClass2UD.PROFILE_CTA);
            r4.A03(r14.getId());
            r4.A04(this.A0H.getModuleName());
            r4.A01();
        } else if (!TextUtils.isEmpty(str3)) {
            C06270Ok A003 = C06270Ok.A00();
            A003.A09("app_id", r14.A2I);
            AnonymousClass6TK.A00(this.A0K, this.A0S, r14.getId(), C13300iJ.A02(r14.A0M), A003);
            AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_instant_experience", A01(this), A02(this), this.A0M, this.A0N, str4);
            Context A004 = A00(this);
            UserDetailFragment userDetailFragment = this.A0H;
            AnonymousClass7BW.A00(A004, userDetailFragment.getActivity(), r14, this.A0K, str3, AnonymousClass2UD.PROFILE_CTA, userDetailFragment.getModuleName());
        } else {
            AnonymousClass0QD.A01("com.instagram.profile.fragment.UserDetailDelegate", "CTA url is empty");
        }
    }

    public final void Att(C13300iJ r5, Context context, String str) {
        if (TextUtils.isEmpty(r5.A2R)) {
            A06(this, r5, context, str);
            return;
        }
        C30549DeX deX = new C30549DeX(this.A08, this.A0K, this.A0H);
        deX.A02 = new C30551DeZ(this, r5, context, str);
        AnonymousClass2OA r2 = new AnonymousClass2OA(deX.A00);
        r2.A0K(deX.A01);
        r2.A0W(C30549DeX.A00(deX), deX.A04);
        r2.A0V(true);
        r2.A03().show();
    }

    public final void Atu(C13300iJ r14, String str) {
        AnonymousClass6TK.A01(this.A0K, this.A0S, "send_email", "business_profile", r14.getId(), C13300iJ.A02(r14.A0M));
        AnonymousClass6TJ.A00(this.A0K, Constants.A0C, r14, this.A0H, this.A0M, this.A0N);
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_email", A01(this), A02(this), this.A0M, this.A0N, str);
        String A0E2 = AnonymousClass000.A0E("mailto:", r14.A2d);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.setData(Uri.parse(A0E2));
        AnonymousClass1BH.A0G(intent, this.A0H);
    }

    public final void Atv(C13300iJ r14, String str) {
        AnonymousClass6TK.A01(this.A0K, this.A0S, "call_phone_number", "business_profile", r14.getId(), C13300iJ.A02(r14.A0M));
        AnonymousClass6TJ.A00(this.A0K, Constants.ZERO, r14, this.A0H, this.A0M, this.A0N);
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_call", A01(this), A02(this), this.A0M, this.A0N, str);
        String A0E2 = AnonymousClass000.A0E("tel:", r14.A2B.trim());
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.addFlags(268435456);
        intent.setData(Uri.parse(A0E2));
        AnonymousClass1BH.A0G(intent, this.A0H);
    }

    public final void Atw(C13300iJ r14, String str) {
        AnonymousClass6TK.A01(this.A0K, this.A0S, "text_phone_number", "business_profile", r14.getId(), C13300iJ.A02(r14.A0M));
        AnonymousClass6TJ.A00(this.A0K, Constants.ONE, r14, this.A0H, this.A0M, this.A0N);
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_text", A01(this), A02(this), this.A0M, this.A0N, str);
        String trim = r14.A2B.trim();
        AnonymousClass1BH.A07(AnonymousClass4KN.A00(trim, (String) null), this.A0H);
    }

    public final void Atx(ArrayList arrayList) {
        C13510ie.A00(this.A0K).A01(this.A0H.A0r, true);
        AnonymousClass0C1 r0 = this.A0K;
        String A022 = A02(this);
        Bundle bundle = new Bundle();
        AnonymousClass68N r3 = new AnonymousClass68N();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r0.getToken());
        bundle.putString("ContactOptionsFragment.USER_ID", A022);
        bundle.putIntegerArrayList("ContactOptionsFragment.ACTION_ID_LIST", arrayList);
        r3.setArguments(bundle);
        r3.A00 = this;
        AnonymousClass2TH r2 = new AnonymousClass2TH(this.A0K);
        r2.A0L = A00(this).getResources().getString(C0003R.string.contact);
        AnonymousClass2TI A002 = r2.A00();
        Context A003 = A00(this);
        C31201Wx.A00(this.A08);
        A002.A01(A003, r3);
    }

    public final void Aty(C13300iJ r7, String str) {
        C27264C5x c5x = new C27264C5x();
        c5x.A05 = new AnonymousClass4BH(this);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A0K.getToken());
        bundle.putSerializable("fundraiser_entrypoint", C69.ACTION_BUTTON);
        C482527g r4 = r7.A03;
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A052 = C12890hY.A00.A05(stringWriter);
            C482427f.A00(A052, r4);
            A052.close();
            bundle.putString("fundraiser_donate_action_button_model_json", stringWriter.toString());
            c5x.setArguments(bundle);
            AnonymousClass2TH r2 = new AnonymousClass2TH(this.A0K);
            r2.A0T = false;
            r2.A0L = A00(this).getString(C0003R.string.profile_donate_button__bottom_sheet_title);
            AnonymousClass2TI A002 = r2.A00();
            Context A003 = A00(this);
            if (this.A0H.mParentFragment == null) {
            }
            A002.A01(A003, c5x);
        } catch (IOException unused) {
            AnonymousClass0QD.A02("com.instagram.profile.fragment.UserDetailDelegate", "Could not json serialize FundraiserDonateActionButtonModel for the fundraiser consumption sheet.");
        }
    }

    public final void Atz(C13300iJ r2, String str) {
        A07(this, r2.A2R, str);
    }

    public final void Au0(AnonymousClass2OA r9) {
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_more", A01(this), A02(this), this.A0M, this.A0N, "button_tray");
        r9.A0K(this.A0H);
        r9.A03().show();
    }

    public final void Au1() {
        Bundle bundle = new Bundle();
        bundle.putString("entry_point", this.A0S);
        bundle.putString("edit_profile_entry", this.A0S);
        C59032gv.A03(ModalActivity.class, "business_onboarding_check_list", bundle, this.A08);
    }

    public final void Au2(C13300iJ r16, String str) {
        String str2;
        String str3;
        C13300iJ r8 = r16;
        Integer A052 = C52952Qw.A05(r8, this.A0K);
        switch (A052.intValue()) {
            case 0:
            case 1:
                if (A052 == Constants.ZERO) {
                    str2 = "tap_shop";
                } else {
                    str2 = "tap_empty_shop";
                }
                if (AnonymousClass9FF.A00(this.A0K).A01()) {
                    str3 = "mini_shop_storefront_hia";
                } else {
                    str3 = "profile_hia";
                }
                C17510qM r0 = C17510qM.A00;
                FragmentActivity fragmentActivity = this.A08;
                AnonymousClass0C1 r2 = this.A0K;
                C27371Ho r4 = this.A0C;
                AnonymousClass9FE A0T2 = r0.A0T(fragmentActivity, r2, "business_shop", r4, (String) null, r4.getModuleName(), str3, r8);
                A0T2.A00 = this.A0H;
                A0T2.A02();
                break;
            case 2:
                C52952Qw.A0C(this.A0K, r8, this.A0H.getModuleName(), "add_shop", this.A08, false);
                str2 = "tap_add_shop";
                break;
            default:
                str2 = "";
                break;
        }
        AnonymousClass0C1 r3 = this.A0K;
        boolean z = false;
        if (r3.A06.A09 == C468621e.APPROVED) {
            z = true;
        }
        if (z) {
            C17510qM.A00.A0K(r3).A01(this.A08, this.A0H);
        }
        AnonymousClass3C0.A03(this.A0K, this.A0H, str2, A01(this), A02(this), this.A0M, this.A0N, str);
    }

    public final void Au3(C13300iJ r10, String str) {
        AnonymousClass2A5 r1;
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_support", A01(this), A02(this), this.A0M, this.A0N, str);
        UserDetailFragment userDetailFragment = this.A0H;
        if (AnonymousClass3AT.A08(userDetailFragment.A0n, userDetailFragment.A0r)) {
            if (userDetailFragment.A12) {
                C13300iJ r12 = userDetailFragment.A0r;
                C58422fu r0 = r12.A0A;
                if (r0 != null) {
                    userDetailFragment.A08.A01(r0.A01, r0.A05, r0.A06, r12.getId(), r0.A03);
                }
            } else {
                C13300iJ r2 = userDetailFragment.A0r;
                AnonymousClass2A5 r13 = r2.A0G;
                C57942f3 A002 = AnonymousClass3AT.A00(r2, r13);
                if (A002 != null) {
                    userDetailFragment.A08.A01(A002.A00, A002.A02, A002.A03, r2.getId(), r13.A00);
                }
            }
        }
        String str2 = "";
        if (AnonymousClass38B.A00(this.A0K, false)) {
            C58422fu r02 = r10.A0A;
            if (r02 != null) {
                str2 = r02.A06;
            }
        } else {
            C57942f3 A003 = AnonymousClass3AT.A00(r10, r10.A0G);
            if (A003 != null) {
                str2 = A003.A03;
            }
        }
        try {
            if (AnonymousClass38B.A00(this.A0K, false)) {
                r1 = AnonymousClass2A5.A00(r10.A0A.A03);
                if (r1 == null) {
                    throw new IllegalArgumentException("No SMBPartnerType for provided category type");
                }
            } else {
                r1 = r10.A0G;
            }
        } catch (IllegalArgumentException unused) {
            r1 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (!AnonymousClass3AT.A07(this.A08, str2, r1)) {
            AnonymousClass2UC r3 = new AnonymousClass2UC(this.A08, this.A0K, str2, AnonymousClass2UD.SMB_SUPPORT_PROFILE_BUTTON);
            r3.A03(this.A0K.A04());
            r3.A04(this.A0H.getModuleName());
            r3.A01();
            return;
        }
        UserDetailFragment userDetailFragment2 = this.A0H;
        if (!AnonymousClass3AT.A08(userDetailFragment2.A0n, userDetailFragment2.A0r)) {
            return;
        }
        if (userDetailFragment2.A12) {
            C13300iJ r14 = userDetailFragment2.A0r;
            C58422fu r03 = r14.A0A;
            if (r03 != null) {
                userDetailFragment2.A08.A00(r03.A01, r03.A05, r03.A06, r14.getId(), r03.A03);
                return;
            }
            return;
        }
        C13300iJ r22 = userDetailFragment2.A0r;
        AnonymousClass2A5 r15 = r22.A0G;
        C57942f3 A004 = AnonymousClass3AT.A00(r22, r15);
        if (A004 != null) {
            userDetailFragment2.A08.A00(A004.A00, A004.A02, A004.A03, r22.getId(), r15.A00);
        }
    }

    public final void Aux(String str) {
        AnonymousClass2KM r0 = this.A0I.A0E.A03;
        AnonymousClass2KM r3 = AnonymousClass2KM.Closed;
        if (r0 == r3) {
            AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_suggested_users", A01(this), A02(this), this.A0M, this.A0N, str);
        }
        if ((!this.A0H.A1V.A00.isEmpty()) || !this.A0I.A07().A0c()) {
            C709138e r2 = this.A0I.A0E;
            AnonymousClass2KM r1 = r2.A03;
            AnonymousClass2KM r02 = AnonymousClass2KM.Open;
            if (r1 == r02) {
                r2.A03 = r3;
                C709138e.A00(r2);
            } else if (r1 == r3) {
                r2.A03 = r02;
                C709138e.A00(r2);
            }
        } else {
            A04();
        }
    }

    public final void Avg(C13300iJ r3) {
        if (this.A0H.isResumed()) {
            A09(r3, "user_profile_top_bar", false);
        }
    }

    public final void Avr(String str) {
        AnonymousClass3C0.A03(this.A0K, this.A0H, "edit_profile", AnonymousClass3C6.SELF, A02(this), this.A0M, this.A0N, "user_profile_header");
        if (str != null) {
            AnonymousClass0C1 r3 = this.A0K;
            String A012 = C14100jl.A01(r3);
            AnonymousClass0P4 A002 = C1414262u.A00(Constants.ZERO);
            A002.A0G("entry_point", str);
            A002.A0G("fb_user_id", A012);
            A002.A0G("step", "edit_profile");
            AnonymousClass0WN.A01(r3).BcG(A002);
        }
        C52362Om r2 = new C52362Om(this.A08, this.A0K);
        r2.A02 = C18980sj.A00.A00().A06("profile");
        r2.A04 = "EditProfileFragment.BACK_STACK_NAME";
        r2.A03 = this.A0O;
        r2.A09 = true;
        r2.A02();
    }

    public final void Avu(C13300iJ r3) {
        String str;
        if (r3.A0N == C13390iS.FollowStatusFollowing) {
            str = "following_sheet";
        } else {
            str = "button_tray";
        }
        A09(r3, str, true);
    }

    public final void Avx(FollowButton followButton, String str, AnonymousClass1NJ r24, String str2, String str3, UserDetailEntryInfo userDetailEntryInfo) {
        String id;
        C13300iJ r2 = this.A0H.A0r;
        if (r2 != null) {
            C13390iS A0J2 = C26661Ek.A00(this.A0K).A0J(r2);
            FollowButton followButton2 = followButton;
            String str4 = str3;
            if (r2.A0e()) {
                AnonymousClass5GK.A04(followButton2, this.A0K, str4, r2, this);
                return;
            }
            AnonymousClass1NJ r11 = r24;
            if (A0J2 == C13390iS.FollowStatusFollowing) {
                AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_follow_sheet", AnonymousClass3C0.A01(r2.A0M), A02(this), this.A0M, this.A0N, str);
                if (C18320rf.A00(this.A0K, true)) {
                    AnonymousClass6LX.A04(this.A0B, "profile_following_sheet_entry_point", r2.getId());
                }
                if (r24 == null) {
                    id = null;
                } else {
                    id = r11.getId();
                }
                C18980sj.A00.A00();
                AnonymousClass0C1 r0 = this.A0K;
                String id2 = r2.getId();
                ArrayList A032 = A03(r2);
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r0.getToken());
                bundle.putString("ProfileFollowRelationshipFragment.ARG_DISPLAYED_USER_ID", id2);
                bundle.putString("ProfileFollowRelationshipFragment.ARG_SOURCE_MEDIA_ID", id);
                bundle.putBoolean("ProfileFollowRelationShipFragment.ARG_SHOW_USER_SUGGESTIONS", false);
                bundle.putStringArrayList("ProfileFollowRelationShipFragment.ARG_CHAINING_USER_IDS", A032);
                ProfileFollowRelationshipFragment profileFollowRelationshipFragment = new ProfileFollowRelationshipFragment();
                profileFollowRelationshipFragment.setArguments(bundle);
                AnonymousClass2TH r22 = new AnonymousClass2TH(this.A0K);
                r22.A0F = profileFollowRelationshipFragment;
                r22.A0T = false;
                r22.A00 = 0.7f;
                r22.A0L = this.A0H.A0r.AZn();
                AnonymousClass2TI A002 = r22.A00();
                C13300iJ r4 = this.A0H.A0r;
                Context A003 = A00(this);
                profileFollowRelationshipFragment.A01 = new C145676Kq(A002, r4, A003, this.A0K, this.A0I, str2, userDetailEntryInfo, str4, r11, this, this);
                profileFollowRelationshipFragment.A04 = this.A0T;
                C31201Wx.A00(this.A08);
                A002.A01(A003, profileFollowRelationshipFragment);
                this.A0H.A0N("following");
                return;
            }
            followButton2.A02.A03(this.A0K, r2, this, r11, (C06270Ok) null, (AnonymousClass1I6) null, (String) null);
        }
    }

    public final void Aw8(String str) {
        UserDetailFragment userDetailFragment = this.A0H;
        C13300iJ r3 = userDetailFragment.A0r;
        AnonymousClass0a4.A06(r3);
        AnonymousClass0C1 r2 = this.A0K;
        if (C36981iv.A06(r2, r3, this.A08, userDetailFragment, false)) {
            C27355CAa.A02(r2, str, "profile", C14100jl.A01(r2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r15.A07(r12.A0K) != false) goto L_0x0024;
     */
    public final void AwD(AnonymousClass3B6 r13, C13300iJ r14, C71343Ad r15) {
        boolean z;
        C13300iJ r8 = r14;
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_profile_pic", A01(this), r14.getId(), this.A0M, this.A0N, "user_profile_header");
        C71343Ad r9 = r15;
        if (r15 != null) {
            z = false;
        }
        z = true;
        UserDetailFragment userDetailFragment = this.A0H;
        AnonymousClass3B6 r7 = r13;
        if (!userDetailFragment.A0Q() || !r14.A0Z() || !z) {
            A05(this, r13, r14, r15);
            return;
        }
        FragmentActivity activity = userDetailFragment.getActivity();
        if (activity != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(activity.getString(C0003R.string.add_profile_photo_title));
            arrayList.add(activity.getString(C0003R.string.add_to_your_story));
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
            AnonymousClass2OA r1 = new AnonymousClass2OA(activity);
            r1.A0K(this.A0H);
            r1.A0W(charSequenceArr, new C96674Gb(this, r7, r8, r9, charSequenceArr, activity));
            r1.A0V(true);
            r1.A03().show();
        }
    }

    public final void AwH() {
        AnonymousClass2VW.A01(this.A0K, "profile");
        AnonymousClass609.A00(this.A08, this.A0K);
    }

    public final void B4l(Reel reel, C59012gt r7) {
        AnonymousClass1D1 r1;
        this.A0I.A09();
        if (!r7.A02.isEmpty()) {
            C17020pY A002 = C17020pY.A00();
            UserDetailFragment userDetailFragment = this.A0H;
            AnonymousClass0C1 r2 = this.A0K;
            FragmentActivity fragmentActivity = this.A08;
            if (fragmentActivity instanceof AnonymousClass1D1) {
                r1 = (AnonymousClass1D1) fragmentActivity;
            } else {
                r1 = null;
            }
            A002.A0I(userDetailFragment, r2, r1).A00(Constants.ZERO, r7.A02);
        }
    }

    public final void B5A(C13300iJ r3, int i) {
        A08(r3.A0N, "suggested_users_unit");
    }

    public final void B5E(C13300iJ r7, Integer num) {
        C13300iJ A072 = this.A0I.A07();
        if (Constants.A0u == num && A072 != null) {
            C18320rf.A00.A03().A03(this.A0K, this.A0H, this.A0B, A072, AnonymousClass6GA.PROFILE_UNBLOCK);
        }
    }

    public final void BAE() {
        C31121Wn r1 = this.A09;
        if (r1 != null) {
            r1.A06(this.A08);
        }
    }

    public final void BBa(String str) {
        AnonymousClass3C0.A03(this.A0K, this.A0H, "direct_message", A01(this), A02(this), this.A0M, this.A0N, str);
        C21980xe A002 = C21980xe.A00(this.A08, this.A0K, str, this.A0H);
        A002.A07(Collections.singletonList(new PendingRecipient(this.A0I.A07())));
        A002.A08(true);
        A002.A0C();
    }

    public final void BE0() {
        try {
            if (this.A08 != null) {
                C34071dx A0T2 = C17020pY.A00().A0T(this.A08);
                if (A0T2 != null) {
                    A0T2.A0T();
                    return;
                }
                return;
            }
            AnonymousClass0QD.A02("UserDetailDelegate#onPause unable to teardown ReelViewerAnimator", "unable to call ReelViewerAnimator#get because mActivity is null");
        } catch (NullPointerException e) {
            AnonymousClass0QD.A06("UserDetailDelegate#onPause NPE on ReelViewerAnimator#get but null check passed", "mActivity: " + this.A08, e);
        }
    }

    public final void BHG(C13300iJ r7) {
        C52362Om r5 = new C52362Om(this.A08, this.A0K);
        r5.A0B = true;
        r5.A02 = C18980sj.A00.A00().A02(C52902Qq.A01(this.A0K, r7.getId(), "recommend_accounts_chaining", this.A0C.getModuleName()).A03());
        r5.A02();
    }

    public final void BHH(C13300iJ r8) {
        C17990r8.A00.A01(this.A0K).A00(this.A0H, this.A0K, this.A0I.A07().getId(), r8.getId(), new C107124jd(this));
    }

    public final void BHI() {
        Bundle bundle = new Bundle();
        bundle.putString("target_user_id", this.A0I.A07().getId());
        new C59032gv(this.A0K, ModalActivity.class, "recommend_accounts_sender", bundle, this.A08).A06(this.A08);
    }

    public final void BNO() {
        this.A0I.A0D(AnonymousClass2KM.Closed);
        this.A0I.A09();
    }

    public final void BNP(String str) {
        AnonymousClass1HD A062;
        C13300iJ A072 = this.A0I.A07();
        AnonymousClass0a4.A06(A072);
        if (AnonymousClass388.A02(this.A0K, A072)) {
            FollowListData A002 = FollowListData.A00(AnonymousClass5DQ.Similar, str);
            C116444zJ A003 = C17530qO.A00.A00();
            A062 = A003.A03(A003.A02(this.A0K, A002, A072));
        } else {
            A062 = C17530qO.A00.A00().A06(this.A0K, str, A03(this.A0I.A07()));
        }
        C52362Om r2 = new C52362Om(this.A08, this.A0K);
        r2.A0B = true;
        r2.A02 = A062;
        r2.A02();
    }

    public final void BUH(C13300iJ r9, int i) {
        AnonymousClass3C0.A03(this.A0K, this.A0H, "tap_suggested_user_profile", A01(this), A02(this), this.A0M, this.A0N, "suggested_users_unit");
        C52362Om r5 = new C52362Om(this.A08, this.A0K);
        r5.A0B = true;
        r5.A02 = C18980sj.A00.A00().A02(C52902Qq.A01(this.A0K, r9.getId(), "profile_user_row", this.A0C.getModuleName()).A03());
        r5.A05 = "suggested_users";
        r5.A02();
    }

    public final void Ba0(View view, C13300iJ r12) {
        Integer A052 = C52952Qw.A05(r12, this.A0K);
        if ((Constants.ZERO == A052 || Constants.ONE == A052) && AnonymousClass9FF.A00(this.A0K).A01()) {
            AnonymousClass380 r3 = this.A0R;
            String id = r12.getId();
            UserDetailLaunchConfig userDetailLaunchConfig = this.A0Q;
            String str = userDetailLaunchConfig.A06;
            String str2 = userDetailLaunchConfig.A0B;
            String str3 = this.A0M;
            String str4 = this.A0N;
            C28051Kf r2 = r3.A01;
            C30231Ta A002 = AnonymousClass1TY.A00(new B4b(id, str, str2, str3, str4), (Object) null, id);
            A002.A00(r3.A00);
            r2.A03(view, A002.A02());
        }
    }

    public final void Bel() {
        this.A0H.Bel();
    }

    public final void Bo9(View view) {
        UserDetailFragment userDetailFragment = this.A0H;
        C16180oA A002 = C16180oA.A00(userDetailFragment.A0n);
        if (!C14090jk.A05(userDetailFragment.A0n, userDetailFragment.A0r) && !A002.A00.getBoolean("smb_support_button_tooltip", false) && C120595Fg.A01(view)) {
            if (userDetailFragment.A0K == null) {
                userDetailFragment.A0K = C120595Fg.A00(view, userDetailFragment.getActivity(), userDetailFragment.getString(C0003R.string.smb_support_button_tooltip_text, userDetailFragment.A0r.AZn()));
            }
            C56202c6 r1 = userDetailFragment.A0K;
            if (!r1.A07()) {
                r1.A05();
                A002.A00.edit().putBoolean("smb_support_button_tooltip", true).apply();
            }
        }
    }

    public final void BoC(View view) {
        UserDetailFragment userDetailFragment = this.A0H;
        C16180oA A002 = C16180oA.A00(userDetailFragment.A0n);
        if (userDetailFragment.A0r.A1b == Constants.A0C && !A002.A00.getBoolean("edit_profile_button_for_smb_support", false) && C120595Fg.A01(view) && AnonymousClass3AT.A08(userDetailFragment.A0n, userDetailFragment.A0r)) {
            if (userDetailFragment.A0H == null) {
                userDetailFragment.A0H = C120595Fg.A00(view, userDetailFragment.getActivity(), userDetailFragment.getString(C0003R.string.edit_profile_for_smb_support_tooltip_text));
            }
            C56202c6 r1 = userDetailFragment.A0H;
            if (!r1.A07()) {
                r1.A05();
                A002.A00.edit().putBoolean("edit_profile_button_for_smb_support", true).apply();
            }
        }
    }

    public final void BoI(View view) {
        UserDetailFragment userDetailFragment = this.A0H;
        C16180oA A002 = C16180oA.A00(userDetailFragment.A0n);
        if (!A002.A00.getBoolean("insights_button_tooltip", false) && C120595Fg.A01(view) && ((Boolean) AnonymousClass0L6.A02(userDetailFragment.A0n, AnonymousClass0L7.PROFILE_INSIGHTS_BUTTON_TOOLTIP, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            if (userDetailFragment.A0I == null) {
                userDetailFragment.A0I = C120595Fg.A00(view, userDetailFragment.getActivity(), userDetailFragment.getString(C0003R.string.insights_button_tooltip_text));
            }
            C56202c6 r1 = userDetailFragment.A0I;
            if (!r1.A07()) {
                r1.A05();
                A002.A00.edit().putBoolean("insights_button_tooltip", true).apply();
            }
        }
    }

    public final void BoL(View view) {
        C13300iJ r1;
        SharedPreferences.Editor edit;
        String str;
        String string;
        UserDetailFragment userDetailFragment = this.A0H;
        if (userDetailFragment.getActivity() != null && (r1 = userDetailFragment.A0r) != null) {
            AnonymousClass0C1 r0 = userDetailFragment.A0n;
            boolean A052 = C14090jk.A05(r0, r1);
            if (!A052 && C27665CMj.A00(r0).getBoolean("has_shown_mini_shop_other_shop_tooltip", false)) {
                return;
            }
            if ((!A052 || !C27665CMj.A00(userDetailFragment.A0n).getBoolean("has_shown_mini_shop_self_shop_tooltip", false)) && C120595Fg.A01(view) && AnonymousClass9FF.A00(userDetailFragment.A0n).A01()) {
                if (userDetailFragment.A0J == null) {
                    if (A052) {
                        string = userDetailFragment.getString(C0003R.string.mini_shop_business_tooltip);
                    } else {
                        string = userDetailFragment.getString(C0003R.string.mini_shop_consumer_tooltip, userDetailFragment.A0r.AZn());
                    }
                    userDetailFragment.A0J = C120595Fg.A00(view, userDetailFragment.getActivity(), string);
                }
                C56202c6 r12 = userDetailFragment.A0J;
                if (!r12.A07()) {
                    r12.A05();
                    if (A052) {
                        edit = C27665CMj.A00(userDetailFragment.A0n).edit();
                        str = "has_shown_mini_shop_self_shop_tooltip";
                    } else {
                        edit = C27665CMj.A00(userDetailFragment.A0n).edit();
                        str = "has_shown_mini_shop_other_shop_tooltip";
                    }
                    edit.putBoolean(str, true).apply();
                }
            }
        }
    }

    public UserDetailDelegate(FragmentActivity fragmentActivity, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, C31121Wn r6, AnonymousClass0C1 r7, AnonymousClass1D1 r8, AnonymousClass1US r9, C52932Qu r10, C72793Ha r11, C72803Hb r12, C27371Ho r13, AnonymousClass39B r14, UserDetailLaunchConfig userDetailLaunchConfig, AnonymousClass0QT r16, AnonymousClass380 r17) {
        String str;
        String str2;
        this.A08 = fragmentActivity;
        this.A0H = userDetailFragment;
        this.A0I = userDetailTabController;
        this.A09 = r6;
        this.A0K = r7;
        this.A0L = r8;
        this.A0A = r9;
        this.A0E = r10;
        this.A0D = r11;
        this.A0F = r12;
        this.A0C = r13;
        AnonymousClass1NJ r1 = userDetailFragment.A0F;
        if (r1 != null) {
            str = r1.APo();
        } else {
            str = null;
        }
        this.A0M = str;
        if (r1 != null) {
            str2 = r1.AYw();
        } else {
            str2 = null;
        }
        this.A0N = str2;
        this.A0G = r14;
        this.A0Q = userDetailLaunchConfig;
        this.A0B = r16;
        this.A0R = r17;
        this.A0O = new AnonymousClass39W(A02(this));
        this.A0J = new AnonymousClass1UY(r7, new AnonymousClass1UZ(userDetailFragment), userDetailFragment);
        this.A0S = this.A0Q.A06;
    }

    public static void A07(UserDetailDelegate userDetailDelegate, String str, String str2) {
        AnonymousClass0a4.A06(str);
        AnonymousClass3C0.A03(userDetailDelegate.A0K, userDetailDelegate.A0H, "tap_location", A01(userDetailDelegate), A02(userDetailDelegate), userDetailDelegate.A0M, userDetailDelegate.A0N, str2);
        AnonymousClass1HD Apr = C16230oG.A00.getFragmentFactory().Apr(str);
        C52362Om r2 = new C52362Om(userDetailDelegate.A08, userDetailDelegate.A0K);
        r2.A0B = true;
        r2.A02 = Apr;
        r2.A02();
    }

    public final void A0E(C13300iJ r8) {
        String id = r8.getId();
        C18320rf.A00.A07(this.A08, AnonymousClass1L8.A00(this.A0H), this.A0K, id, new AnonymousClass4D4(this, id));
    }

    public final void Ayk(View view) {
        super.Ayk(view);
        C23300zv.A00(this.A0K).A02(AnonymousClass3AN.class, this.A0P);
    }

    public final void Azh() {
        super.Azh();
        C23300zv.A00(this.A0K).A03(AnonymousClass3AN.class, this.A0P);
    }
}
