package p000X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.profile.intf.UserDetailEntryInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Kp  reason: invalid class name and case insensitive filesystem */
public final class C28151Kp implements C28161Kq {
    public Integer A00;
    public Set A01;
    public final AnonymousClass1HD A02;
    public final FragmentActivity A03;
    public final AnonymousClass0RN A04;
    public final C28131Kn A05;
    public final AnonymousClass0C1 A06;
    public final AnonymousClass1KT A07;

    public final void BQ8(int i, int i2, C43451uR r14, String str, String str2, String str3, String str4) {
        Integer num;
        C43451uR r4 = r14;
        C13300iJ r0 = r14.A02;
        if (r0 != null) {
            num = C466320g.A01(r0.A0M);
        } else {
            num = null;
        }
        int i3 = i;
        A01(Constants.A0N, i3, i2, r4, str, str2, (Long) null, str3, str4, num);
    }

    private void A01(Integer num, int i, int i2, C43451uR r6, String str, String str2, Long l, String str3, String str4, Integer num2) {
        AnonymousClass2O7 r1 = new AnonymousClass2O7(num, this.A04);
        r1.A03 = Integer.valueOf(i);
        r1.A00 = i2;
        r1.A0F = C52182Nu.A00(this.A00);
        r1.A0D = r6.getId();
        r1.A0E = r6.A05;
        r1.A05 = r6.A03;
        r1.A0C = r6.A04;
        r1.A01 = Boolean.valueOf(r6.A08);
        r1.A09 = str;
        r1.A07 = str2;
        r1.A04 = l;
        r1.A0A = str3;
        r1.A0B = str4;
        r1.A02 = num2;
        r1.A00(this.A06);
    }

    public final void A3d(C36321hr r2, C36851ii r3) {
        C28131Kn r0 = this.A05;
        if (r0 != null) {
            r0.A3d(r2, r3);
        }
    }

    public final AnonymousClass0RN AFt() {
        return this.A04;
    }

    public final void B4A(C126785c0 r3) {
        AnonymousClass1KT r1 = this.A07;
        if (r1 != null) {
            r1.A01(C696433b.READ_ONLY, r3);
        }
    }

    public final void BQ5(AnonymousClass0C1 r14, int i, int i2, C43451uR r17, String str, String str2, String str3, String str4) {
        String str5 = str3;
        C43451uR r6 = r17;
        String str6 = str;
        String str7 = str2;
        A01(Constants.ONE, i, i2, r6, str6, str7, (Long) null, str5, str4, (Integer) null);
        FragmentActivity fragmentActivity = this.A03;
        if (AnonymousClass1H4.A01(fragmentActivity.A05())) {
            C52362Om r4 = new C52362Om(fragmentActivity, this.A06);
            r4.A0B = true;
            C52892Qp A002 = C18980sj.A00.A00();
            C52902Qq A012 = C52902Qq.A01(this.A06, r6.getId(), "suggested_user_card", this.A04.getModuleName());
            C28798Cmu cmu = new C28798Cmu();
            cmu.A07 = str6;
            cmu.A02 = str7;
            cmu.A08 = str5;
            A012.A02 = new UserDetailEntryInfo(cmu);
            r4.A02 = A002.A02(A012.A03());
            r4.A05 = "suggested_users";
            r4.A02();
        }
    }

    public final void BQ7(C29261Pf r12, int i, int i2, C43451uR r15, String str, String str2, String str3, String str4) {
        C17850qu A012;
        int i3 = i;
        A01(Constants.A0u, i3, i2, r15, str, str2, (Long) null, str3, str4, (Integer) null);
        String id = r15.A02.getId();
        String str5 = r15.A03;
        if (r12 == C29261Pf.SUGGESTED_CLOSE_FRIENDS) {
            C15890nh r2 = new C15890nh(this.A06);
            r2.A09 = Constants.ONE;
            r2.A0C = "discover/dismiss_close_friend_suggestion/";
            r2.A09("target_id", id);
            r2.A06(AnonymousClass1N4.class, false);
            A012 = r2.A03();
        } else {
            A012 = AnonymousClass5UD.A01(this.A06, id, r15.A05, str5);
        }
        C12810hQ.A02(A012);
    }

    public final void BQ9(int i, int i2, C43451uR r14, String str, String str2, Long l, String str3, String str4) {
        if (this.A01 == null) {
            this.A01 = new HashSet();
        }
        C43451uR r4 = r14;
        if (this.A01.add(r14.getId())) {
            int i3 = i;
            int i4 = i2;
            String str5 = str;
            A01(Constants.ZERO, i3, i4, r4, str5, str2, l, str3, str4, (Integer) null);
        }
    }

    public final void BQA(C29261Pf r5, int i, String str, String str2, C43411uN r9, String str3) {
        AnonymousClass1HD r1;
        if (r5 == C29261Pf.SUGGESTED_CLOSE_FRIENDS) {
            C52362Om r2 = new C52362Om(this.A03, this.A06);
            r2.A0B = true;
            r2.A02 = AnonymousClass1UT.A00.A02(this.A06);
            r2.A02();
            return;
        }
        AnonymousClass2O7 r22 = new AnonymousClass2O7(Constants.A0j, this.A04);
        r22.A03 = Integer.valueOf(i);
        r22.A00 = 0;
        r22.A0F = C52182Nu.A00(this.A00);
        r22.A00(this.A06);
        if ((r5 == C29261Pf.SUGGESTED_PRODUCERS_V2 || r5 == C29261Pf.SUGGESTED_PRODUCERS) && str2 != null && (str2.equals("discover_accounts") || str2.equals("discover_accounts_flat"))) {
            List<C43451uR> list = r9.A0G;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C43451uR r0 : list) {
                    C13300iJ r02 = r0.A02;
                    if (r02 != null) {
                        arrayList.add(r02.getId());
                    }
                }
                if (str2.equals("discover_accounts_flat")) {
                    r1 = C29162Csv.A00(arrayList);
                } else {
                    C29161Csu csu = new C29161Csu();
                    String str4 = r9.A0D;
                    csu.A0G = arrayList;
                    csu.A0C = str4;
                    r1 = csu;
                }
                Bundle bundle = r1.mArguments;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("entry_point", str3);
                r1.setArguments(bundle);
                C52362Om r3 = new C52362Om(this.A03, this.A06);
                r3.A02 = r1;
                r3.A02();
                return;
            }
            return;
        }
        A00(r5, str, str2);
    }

    public final void BQB() {
        Set set = this.A01;
        if (set != null) {
            set.clear();
        }
    }

    public final void BZm(C36321hr r2, View view) {
        C28131Kn r0 = this.A05;
        if (r0 != null) {
            r0.BZm(r2, view);
        }
    }

    public final void Brz(View view) {
        C28131Kn r0 = this.A05;
        if (r0 != null) {
            r0.Brz(view);
        }
    }

    public C28151Kp(AnonymousClass0C1 r1, AnonymousClass1HD r2, AnonymousClass0RN r3, FragmentActivity fragmentActivity, Integer num, AnonymousClass1KT r6, C28131Kn r7) {
        this.A06 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = fragmentActivity;
        this.A00 = num;
        this.A07 = r6;
        this.A05 = r7;
    }

    private void A00(C29261Pf r13, String str, String str2) {
        String str3;
        if (C22100xq.A01()) {
            C52362Om r2 = new C52362Om(this.A03, this.A06);
            r2.A0B = true;
            AnonymousClass5W6 A022 = C22100xq.A00().A02();
            switch (this.A00.intValue()) {
                case 1:
                    str3 = "explore_people";
                    break;
                case 2:
                    str3 = "social_context_follow_list";
                    break;
                default:
                    str3 = "feed_unit";
                    break;
            }
            r2.A02 = A022.A02(str3, str, str2, r13.toString(), (Boolean) null, (String) null, -1, false);
            r2.A02();
        }
    }

    public final void BQ4(C43471uT r4, C43481uU r5, C29261Pf r6, String str, String str2) {
        C126785c0 r0;
        switch (r4.ordinal()) {
            case 1:
                switch (r5.ordinal()) {
                    case 1:
                    case 2:
                        r0 = C126785c0.SUGGESTED_USERS_FEED_UNIT_V2;
                        break;
                    default:
                        r0 = C126785c0.SUGGESTED_USERS_FEED_UNIT;
                        break;
                }
                B4A(r0);
                return;
            case 2:
                C127735dY.A04(this.A06, this.A02, this.A04);
                return;
            case 3:
                A00(r6, str, str2);
                return;
            case 4:
                if (C15970np.A03(this.A06.A06) == 0) {
                    C52362Om r2 = new C52362Om(this.A03, this.A06);
                    r2.A02 = C18980sj.A00.A00().A06("profile");
                    r2.A04 = "EditProfileFragment.BACK_STACK_NAME";
                    r2.A03 = new AnonymousClass39W(this.A06.A04());
                    r2.A02();
                    return;
                }
                C15970np.A04().A0F(this.A03, this.A06);
                return;
            default:
                AnonymousClass0QD.A01("SuggestedUsersDelegateImpl", "Unhandled Suggested Upsell button click `SuggestedItemType`. Please fix ASAP because  otherwise tap behavior for your upsell will be nonfunctional. ");
                return;
        }
    }
}
