package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.1Uj  reason: invalid class name and case insensitive filesystem */
public final class C30571Uj {
    public final Activity A00;
    public final AnonymousClass1US A01;
    public final AnonymousClass0C1 A02;

    public static void A00(Context context, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass2OA r1 = new AnonymousClass2OA(context);
        r1.A07(C0003R.string.close_friends_home_first_modification_dialog_title);
        r1.A06(C0003R.string.close_friends_home_first_modification_dialog_message_v4);
        r1.A0V(true);
        r1.A0A(C0003R.string.f118ok, onClickListener);
        r1.A09(C0003R.string.cancel, onClickListener);
        r1.A03().show();
    }

    public final void A02(AnonymousClass0RN r23, C121705Jo r24, C698834a r25, AnonymousClass54G r26, DialogInterface.OnDismissListener onDismissListener) {
        int i;
        String string;
        String str;
        String str2;
        String str3;
        C121705Jo r7 = r24;
        C39941no r0 = r7.A00;
        C13300iJ r5 = r0.A0D;
        boolean A14 = r0.A14();
        boolean A002 = AnonymousClass17M.A00(r5, this.A02.A06);
        Resources resources = this.A00.getResources();
        if (A002) {
            i = C0003R.string.dialog_title_shared_with_your_close_friends;
            int i2 = C0003R.string.shared_with_close_friends_self_owner_story_photo;
            if (A14) {
                i2 = C0003R.string.shared_with_close_friends_self_owner_story_video;
            }
            string = resources.getString(i2);
        } else {
            i = C0003R.string.dialog_title_shared_with_you;
            int i3 = C0003R.string.shared_with_close_friends_other_owner_story_photo;
            if (A14) {
                i3 = C0003R.string.shared_with_close_friends_other_owner_story_video;
            }
            string = resources.getString(i3, new Object[]{r5.AZn()});
        }
        ArrayList arrayList = new ArrayList();
        int A03 = (int) C06220Of.A03(this.A00, 66);
        arrayList.add(new C39491n0(A03, (int) C06220Of.A03(this.A00, 3), -1, C019000b.A00(this.A00, C0003R.color.grey_1), this.A02.A06.ASv()));
        arrayList.add(C75933Tu.A03(this.A00, C0003R.C0004drawable.close_friends_star_60, 3));
        Activity activity = this.A00;
        Activity activity2 = activity;
        C39511n2 r15 = new C39511n2(activity2, arrayList, (int) C06220Of.A03(activity, 66), 0.3f, false, Constants.ZERO);
        AnonymousClass2OA r8 = new AnonymousClass2OA(this.A00);
        r8.A0H(r15);
        r8.A07(i);
        r8.A0M(string);
        r8.A08(C0003R.string.edit_your_close_friends_button_continue, new C121735Jr(this, r26));
        r8.A09(C0003R.string.done, new C121695Jn(this));
        r8.A0F(onDismissListener);
        if (!A002 && !r5.A0g()) {
            r8.A0P(resources.getString(C0003R.string.add_user_to_close_friends, new Object[]{r5.AZn()}), new C28566Cj6(this, r25, r5));
        }
        r8.A03().show();
        C16180oA.A00(this.A02).A00.edit().putBoolean("has_tapped_on_favorites_badge", true).apply();
        C39941no r1 = r7.A00;
        int A012 = r1.A01();
        if (r1.A0t()) {
            str = r1.A08.APo();
        } else {
            str = null;
        }
        if (r1.A0y()) {
            str2 = r1.A0C().AZV();
        } else {
            str2 = null;
        }
        C37171jE A0A = r1.A0A();
        if (A0A != C37171jE.DEFAULT) {
            str3 = A0A.A00;
        } else {
            str3 = null;
        }
        AnonymousClass0C1 r02 = this.A02;
        String id = r5.getId();
        C91883yG r12 = new C91883yG(AnonymousClass0QT.A00(r02, r23).A02("ig_click_audience_button"));
        r12.A08("a_pk", id);
        r12.A06("m_t", Integer.valueOf(A012));
        if (str != null) {
            r12.A08("m_k", str);
        }
        if (str2 != null) {
            r12.A08("upload_id", str2);
        }
        if (str3 != null) {
            r12.A08("audience", str3);
        }
        r12.A01();
    }

    public C30571Uj(Activity activity, AnonymousClass0C1 r2, AnonymousClass1US r3) {
        this.A00 = activity;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static boolean A01(AnonymousClass0C1 r3) {
        if (C16180oA.A00(r3).A00.getBoolean("has_seen_favorites_change_confirmation_dialog", false) || !r3.A06.A0Y()) {
            return false;
        }
        return true;
    }
}
