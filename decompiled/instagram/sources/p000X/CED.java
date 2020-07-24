package p000X;

import android.text.Editable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.CED */
public final class CED extends C17920r1 {
    public final /* synthetic */ Editable A00;
    public final /* synthetic */ CEF A01;

    public CED(CEF cef, Editable editable) {
        this.A01 = cef;
        this.A00 = editable;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-1732293473);
        super.onFail(r6);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0C(this.A01.A00.A07, C27398CBr.LOCATIONS_SELECTION, "regional_search_fetch", str);
        AnonymousClass0Z0.A0A(624249685, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-2065093410);
        CGM cgm = (CGM) obj;
        int A032 = AnonymousClass0Z0.A03(-1427928654);
        super.onSuccess(cgm);
        CCZ.A09(this.A01.A00.A07, C27398CBr.LOCATIONS_SELECTION, "regional_search_fetch");
        List list = cgm.A00;
        if (list == null) {
            list = new ArrayList();
        }
        CF1 cf1 = this.A01.A00.A0F;
        String obj2 = this.A00.toString();
        cf1.A00.put(obj2.toLowerCase(Locale.US), new ArrayList(list));
        list.removeAll(this.A01.A00.A07.A07.A05);
        CE7.A01(this.A01.A00, list);
        AnonymousClass0Z0.A0A(-674407273, A032);
        AnonymousClass0Z0.A0A(-1875334040, A03);
    }
}
