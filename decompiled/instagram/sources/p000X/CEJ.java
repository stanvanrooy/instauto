package p000X;

import android.text.Editable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.CEJ */
public final class CEJ extends C17920r1 {
    public final /* synthetic */ Editable A00;
    public final /* synthetic */ CEK A01;

    public CEJ(CEK cek, Editable editable) {
        this.A01 = cek;
        this.A00 = editable;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-591508887);
        super.onFail(r6);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A01.A00.A05, C27398CBr.LOCATIONS_SELECTION, "local_search_fetch", str);
        AnonymousClass0Z0.A0A(328379896, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1693831020);
        CGM cgm = (CGM) obj;
        int A032 = AnonymousClass0Z0.A03(-677614905);
        super.onSuccess(cgm);
        CCZ.A09(this.A01.A00.A05, C27398CBr.LOCATIONS_SELECTION, "local_search_fetch");
        List list = cgm.A00;
        if (list == null) {
            list = new ArrayList();
        }
        this.A01.A00.A09.A00.put(this.A00.toString().toLowerCase(Locale.US), list);
        CEL cel = this.A01.A00.A03;
        AnonymousClass0a4.A06(list);
        cel.A01 = list;
        cel.notifyDataSetChanged();
        AnonymousClass0Z0.A0A(608027869, A032);
        AnonymousClass0Z0.A0A(-430045928, A03);
    }
}
