package p000X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.C0003R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0sR  reason: invalid class name and case insensitive filesystem */
public final class C18800sR extends C18810sS {
    public final void A00(Context context, AnonymousClass0C1 r18, String str, C13300iJ r20, C105394gn r21, String str2, String str3) {
        int i;
        AnonymousClass0C1 r10 = r18;
        Context context2 = context;
        C13300iJ r12 = r20;
        C105584h6 r7 = new C105584h6(this, context2, r10, str, r12, str3, r21, str2);
        C105564h4 r6 = new C105564h4(r7);
        C105604h8 r5 = new C105604h8(r7);
        C105594h7 r4 = new C105594h7(r7);
        boolean z = !r12.A0e();
        boolean A02 = C14090jk.A02(r10);
        AnonymousClass2OA r3 = new AnonymousClass2OA(context2);
        int i2 = C0003R.string.dialog_unblock_user_title;
        if (z) {
            i2 = C0003R.string.dialog_block_user_title;
        }
        r3.A03 = context2.getString(i2, new Object[]{str2});
        if (z) {
            i = C0003R.string.dialog_block_user_message;
        } else {
            i = C0003R.string.dialog_unblock_user_message;
            if (A02) {
                i = C0003R.string.dialog_unblock_user_from_private_account_message;
            }
        }
        r3.A0M(context2.getString(i));
        int i3 = C0003R.string.dialog_unblock_user_button;
        if (z) {
            i3 = C0003R.string.dialog_block_user_button;
        }
        r3.A0P(context2.getString(i3), r6);
        r3.A09(C0003R.string.cancel, r5);
        r3.A0E(r4);
        r3.A03().show();
    }

    public final void A01(AnonymousClass0C1 r7, List list, C17920r1 r9) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C13300iJ A02 = C13510ie.A00(r7).A02(str);
            if (A02 != null) {
                hashMap.put(str, Boolean.valueOf(A02.A0e()));
                C107254jq.A00(r7, A02, true);
            } else {
                AnonymousClass0QD.A01("BulkBlockRequestManager", "User is missing from user cache");
            }
        }
        C15890nh r2 = new C15890nh(r7);
        r2.A09 = Constants.ONE;
        r2.A0C = "friendships/block_many/";
        r2.A09("user_ids", TextUtils.join(",", list));
        r2.A06 = new C106774j3(r7);
        r2.A0G = true;
        C17850qu A03 = r2.A03();
        A03.A00 = new C100764Wz(r9, list, r7, hashMap);
        AnonymousClass28P r4 = C483527q.A00(r7).A02;
        r4.A00();
        r4.A04(System.currentTimeMillis() - 1);
        C12810hQ.A00().schedule(A03);
    }
}
