package p000X;

import android.text.Editable;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.CEB */
public final class CEB extends C17920r1 {
    public final /* synthetic */ Editable A00;
    public final /* synthetic */ CEE A01;

    public CEB(CEE cee, Editable editable) {
        this.A01 = cee;
        this.A00 = editable;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(1462439911);
        super.onFail(r6);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A01.A00.A07, C27398CBr.INTERESTS_SELECTION, "interest_search_fetch", str);
        AnonymousClass0Z0.A0A(373651812, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ImmutableList A09;
        ImmutableList A092;
        int A03 = AnonymousClass0Z0.A03(521833251);
        CGL cgl = (CGL) obj;
        int A032 = AnonymousClass0Z0.A03(490233444);
        super.onSuccess(cgl);
        CCZ.A09(this.A01.A00.A07, C27398CBr.INTERESTS_SELECTION, "interest_search_fetch");
        CF1 cf1 = this.A01.A00.A0F;
        String obj2 = this.A00.toString();
        List list = cgl.A00;
        if (list == null) {
            A09 = ImmutableList.A01();
        } else {
            A09 = ImmutableList.A09(list);
        }
        cf1.A00.put(obj2.toLowerCase(Locale.US), A09);
        CEZ cez = this.A01.A00.A06;
        List list2 = cgl.A00;
        if (list2 == null) {
            A092 = ImmutableList.A01();
        } else {
            A092 = ImmutableList.A09(list2);
        }
        AnonymousClass0a4.A06(A092);
        cez.A01 = A092;
        cez.notifyDataSetChanged();
        CE6.A01(this.A01.A00);
        AnonymousClass0Z0.A0A(1802084296, A032);
        AnonymousClass0Z0.A0A(797676213, A03);
    }
}
