package p000X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0rS  reason: invalid class name and case insensitive filesystem */
public final class C18190rS extends C18200rT {
    public final void A01(FragmentActivity fragmentActivity, AnonymousClass0C1 r21, C25654BTn bTn, String str, String str2, AnonymousClass0RN r25, String str3, C06270Ok r27) {
        AnonymousClass0RN r3 = r25;
        AnonymousClass0C1 r7 = r21;
        AnonymousClass2TH r1 = new AnonymousClass2TH(r7);
        C06270Ok r10 = r27;
        r1.A0G = new C98164Ly(r3, r7, r10);
        AnonymousClass2TI A00 = r1.A00();
        C25654BTn bTn2 = bTn;
        CML cml = (CML) bTn2.A01.peek();
        String str4 = str2;
        String str5 = str;
        CMD cmd = new CMD(bTn2, A00, r7, cml, r3, r10, str5, str4);
        AnonymousClass0C1 r13 = r7;
        CMD cmd2 = cmd;
        CMG A002 = CMF.A00(r13, cmd2, cml, str5, str4, r3.getModuleName());
        CMF.A01(r1, cmd, A002, cml, bTn2, (int[]) null);
        A00.A02(fragmentActivity, A002);
        String str6 = cml.A01;
        AnonymousClass0P4 A003 = AnonymousClass0P4.A00("instagram_category_selection_entrypoint_click", r3);
        A003.A0G("category_id", str6);
        A003.A0G("click_point", str3);
        if (r27 != null) {
            A003.A04(r10);
        }
        AnonymousClass0WN.A01(r7).BcG(A003);
    }

    public final CML A00(String str, AnonymousClass0C1 r3) {
        return (CML) CMM.A00(r3).A00.get(str);
    }
}
