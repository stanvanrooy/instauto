package p000X;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.1Qu  reason: invalid class name and case insensitive filesystem */
public final class C29671Qu extends C27291Hg implements C29681Qv {
    public C183707sw A00;
    public AnonymousClass1I6 A01;
    public String A02;
    public final AnonymousClass1HD A03;
    public final FragmentActivity A04;
    public final C23300zv A05;
    public final C11200ea A06 = new AnonymousClass1R4(this);
    public final C11200ea A07 = new AnonymousClass1R1(this);
    public final C11200ea A08 = new C29701Qx(this);
    public final C11200ea A09 = new C29691Qw(this);
    public final C11200ea A0A = new C29711Qy(this);
    public final C11200ea A0B = new C29721Qz(this);
    public final C11200ea A0C = new AnonymousClass1R5(this);
    public final C11200ea A0D = new AnonymousClass1R3(this);
    public final C11200ea A0E = new AnonymousClass1R7(this);
    public final C11200ea A0F = new AnonymousClass1R6(this);
    public final C11200ea A0G = new AnonymousClass1R2(this);
    public final C11200ea A0H = new AnonymousClass1R0(this);
    public final C27371Ho A0I;
    public final AnonymousClass0C1 A0J;
    public final AnonymousClass1R8 A0K;

    public static void A00(FragmentActivity fragmentActivity, AnonymousClass0C1 r4, AnonymousClass1NJ r5, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("LikesListFragment.MEDIA_ID", r5.getId());
        bundle.putInt("LikesListFragment.EMPTY_STATE_STRING_RESOURCE_ID", C0003R.string.no_users_found_for_likers_list);
        C52362Om r1 = new C52362Om(fragmentActivity, r4);
        r1.A0B = true;
        r1.A08(new C128365eZ(), bundle);
        r1.A05 = str;
        r1.A02();
    }

    public static void A01(C29671Qu r3, FragmentActivity fragmentActivity, AnonymousClass1HD r5, AnonymousClass0C1 r6, String str, C62612o2 r8) {
        C162256wC r2;
        if (fragmentActivity instanceof C62622o3) {
            r2 = ((C62622o3) fragmentActivity).ARz();
        } else {
            r2 = null;
        }
        if (r2 == null || !r2.A0i()) {
            C52362Om r1 = new C52362Om(fragmentActivity, r6);
            r1.A0B = true;
            r1.A02 = r5;
            if (str != null) {
                r1.A05 = str;
            }
            r1.A02();
            return;
        }
        C33421ct.A00().addLast(new AnonymousClass6BE(r3, r5, r6, str));
        r2.A0k(r8);
    }

    public static void A02(C29671Qu r3, FragmentActivity fragmentActivity, AnonymousClass0C1 r5, AnonymousClass1NJ r6, String str, C62612o2 r8) {
        C162256wC r2;
        if (fragmentActivity instanceof C62622o3) {
            r2 = ((C62622o3) fragmentActivity).ARz();
        } else {
            r2 = null;
        }
        if (r2 == null || !r2.A0i()) {
            A00(fragmentActivity, r5, r6, str);
            return;
        }
        C33421ct.A00().addLast(new AnonymousClass6BF(r3, r5, r6, str));
        r2.A0k(r8);
    }

    public static boolean A03(C29671Qu r1) {
        C31221Wz A012 = C31201Wx.A01(r1.A03.getContext());
        if (A012 == null || !A012.A0Q()) {
            return true;
        }
        return false;
    }

    public final void BE0() {
        Dialog dialog;
        C23300zv r2 = this.A05;
        r2.A03(C35281g6.class, this.A0F);
        r2.A03(AnonymousClass1g7.class, this.A0E);
        r2.A03(C35291g8.class, this.A0C);
        r2.A03(C35301g9.class, this.A0A);
        r2.A03(C35311gA.class, this.A0G);
        r2.A03(C35321gB.class, this.A07);
        r2.A03(C35331gC.class, this.A06);
        r2.A03(C35341gD.class, this.A0H);
        r2.A03(C35351gE.class, this.A0B);
        r2.A03(C35361gF.class, this.A09);
        r2.A03(C35371gG.class, this.A08);
        r2.A03(C35381gH.class, this.A0D);
        C183707sw r0 = this.A00;
        if (r0 != null && (dialog = r0.A00) != null) {
            dialog.dismiss();
        }
    }

    public final void BJx() {
        C23300zv r2 = this.A05;
        r2.A02(C35281g6.class, this.A0F);
        r2.A02(AnonymousClass1g7.class, this.A0E);
        r2.A02(C35291g8.class, this.A0C);
        r2.A02(C35301g9.class, this.A0A);
        r2.A02(C35311gA.class, this.A0G);
        r2.A02(C35321gB.class, this.A07);
        r2.A02(C35331gC.class, this.A06);
        r2.A02(C35341gD.class, this.A0H);
        r2.A02(C35351gE.class, this.A0B);
        r2.A02(C35361gF.class, this.A09);
        r2.A02(C35371gG.class, this.A08);
        r2.A02(C35381gH.class, this.A0D);
    }

    public final void BkV(AnonymousClass1I6 r2) {
        this.A01 = r2;
        this.A0K.A00 = r2;
    }

    public C29671Qu(AnonymousClass1HD r3, C27371Ho r4, AnonymousClass0C1 r5) {
        this.A03 = r3;
        this.A04 = r3.getActivity();
        this.A0I = r4;
        this.A0J = r5;
        this.A05 = C23300zv.A00(r5);
        this.A0K = new AnonymousClass1R8(r4, r5, this.A01);
    }
}
