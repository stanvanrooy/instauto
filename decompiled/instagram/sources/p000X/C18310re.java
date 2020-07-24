package p000X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0re  reason: invalid class name and case insensitive filesystem */
public final class C18310re extends C18320rf {
    public AnonymousClass6LM A00;
    public AnonymousClass2V0 A01;

    public final C17850qu A01(AnonymousClass0C1 r4) {
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.A0N;
        r2.A0C = "restrict_action/get_restricted_users/";
        r2.A06(C62452nj.class, false);
        return r2.A03();
    }

    public final C17850qu A02(AnonymousClass0C1 r4, String str) {
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.ONE;
        r2.A0C = "restrict_action/approve_restricted_comment/";
        r2.A09("comment_id", str);
        r2.A06(AnonymousClass1N4.class, false);
        return r2.A03();
    }

    public final AnonymousClass6LM A03() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass6LM();
        }
        return this.A00;
    }

    public final AnonymousClass2V0 A04() {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass2V0();
        }
        return this.A01;
    }

    public final C67182wk A05(AnonymousClass0C1 r4) {
        C67182wk r1;
        Class<C67172wj> cls = C67172wj.class;
        C67172wj r0 = (C67172wj) r4.AV9(cls);
        if (r0 != null) {
            r1 = (C67182wk) r0.A00.get();
        } else {
            r1 = null;
        }
        if (r1 != null) {
            return r1;
        }
        C67182wk r12 = new C67182wk();
        r4.BYi(cls, new C67172wj(r12));
        return r12;
    }

    public final void A06(Context context, AnonymousClass1L8 r7, AnonymousClass0C1 r8, String str, C109584np r10) {
        C67182wk A05 = A05(r8);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("session_user_id:%s::change_type:%s::target_user_id:%s", r8.A04(), "restrict", TextUtils.join(",", Collections.singletonList(str)));
        if (!C943546c.A00(formatStrLocaleSafe)) {
            C15890nh r2 = new C15890nh(r8);
            r2.A09 = Constants.ONE;
            r2.A0C = "restrict_action/restrict/";
            r2.A09("target_user_id", str);
            r2.A06(C62452nj.class, false);
            C17850qu A03 = r2.A03();
            A03.A00 = new C109574no(formatStrLocaleSafe, r8, new C109614ns(A05), r10);
            C28351Lj.A00(context, r7, A03);
        }
    }

    public final void A07(Context context, AnonymousClass1L8 r7, AnonymousClass0C1 r8, String str, C109584np r10) {
        C67182wk A05 = A05(r8);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("session_user_id:%s::change_type:%s::target_user_id:%s", r8.A04(), "unrestrict", TextUtils.join(",", Collections.singletonList(str)));
        if (!C943546c.A00(formatStrLocaleSafe)) {
            C15890nh r2 = new C15890nh(r8);
            r2.A09 = Constants.ONE;
            r2.A0C = "restrict_action/unrestrict/";
            r2.A09("target_user_id", str);
            r2.A06(C62452nj.class, false);
            C17850qu A03 = r2.A03();
            A03.A00 = new C109574no(formatStrLocaleSafe, r8, new C109624nt(A05), r10);
            C28351Lj.A00(context, r7, A03);
        }
    }

    public final void A08(Context context, AnonymousClass1L8 r8, AnonymousClass0C1 r9, List list, C109584np r11) {
        C67182wk A05 = A05(r9);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("session_user_id:%s::change_type:%s::target_user_id:%s", r9.A04(), "restrict_many", TextUtils.join(",", list));
        if (!C943546c.A00(formatStrLocaleSafe)) {
            C15890nh r2 = new C15890nh(r9);
            r2.A09 = Constants.ONE;
            r2.A0C = "restrict_action/restrict_many/";
            r2.A09("user_ids", TextUtils.join(",", list));
            r2.A06(C62452nj.class, false);
            C17850qu A03 = r2.A03();
            A03.A00 = new C109574no(formatStrLocaleSafe, r9, new C109604nr(A05), r11);
            C28351Lj.A00(context, r8, A03);
        }
    }
}
