package p000X;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.modal.ModalActivity;
import com.instagram.user.recommended.FollowListData;

/* renamed from: X.0si  reason: invalid class name and case insensitive filesystem */
public final class C18970si extends C18980sj {
    public Context A00;
    public C52892Qp A01;
    public boolean A02;

    public final C52892Qp A00() {
        if (this.A01 == null) {
            this.A01 = new C52892Qp(this.A00);
        }
        return this.A01;
    }

    public final void A01(Context context, AnonymousClass0C1 r11, AnonymousClass1L8 r12, AnonymousClass1NJ r13, String str, C17920r1 r15, C17920r1 r16) {
        Context context2;
        int i;
        C154126iD r3 = new C154126iD(context, r11, r12, str);
        boolean z = r13.A3Z;
        String string = r3.A02.getString(C0003R.string.photos_and_videos_of_you_menu_remove_option);
        if (z) {
            context2 = r3.A02;
            i = C0003R.string.photos_and_videos_of_you_menu_hide_option;
        } else {
            context2 = r3.A02;
            i = C0003R.string.photos_and_videos_of_you_menu_show_option;
        }
        String string2 = context2.getString(i);
        String string3 = r3.A02.getString(C0003R.string.learn_more);
        AnonymousClass2OA r4 = new AnonymousClass2OA(r3.A02);
        r4.A0U(true);
        r4.A0V(true);
        r4.A03 = r3.A02.getString(C0003R.string.post_you_were_tagged_in);
        r4.A0S(string, new C154136iE(r3, r13, r15), true, Constants.A0Y);
        r4.A0N(string2, new C154116iC(r3, z, r13, r16));
        r4.A0O(string3, new C154176iI(r3));
        Dialog A03 = r4.A03();
        r3.A00 = A03;
        A03.show();
    }

    public final boolean A04() {
        return this.A02;
    }

    public C18970si(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public final void A02(FragmentActivity fragmentActivity, AnonymousClass0C1 r12, C13300iJ r13, C52912Qs r14, AnonymousClass5DQ r15, boolean z) {
        FollowListData A002 = FollowListData.A00(r15, r13.getId());
        AnonymousClass0C1 r5 = r12;
        if (AnonymousClass388.A02(r12, r13) && r13.A1f != null && r13.A1g != null) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (z) {
                new C59032gv(r5, ModalActivity.class, "unified_follow_list", C17530qO.A00.A00().A02(r12, A002, r13), fragmentActivity2).A06(fragmentActivity);
                return;
            }
            C52362Om r2 = new C52362Om(fragmentActivity, r12);
            r2.A0B = true;
            C116444zJ A003 = C17530qO.A00.A00();
            r2.A02 = A003.A03(A003.A02(r12, A002, r13));
            r2.A02();
        }
    }

    public final void A03(boolean z) {
        this.A02 = z;
    }
}
