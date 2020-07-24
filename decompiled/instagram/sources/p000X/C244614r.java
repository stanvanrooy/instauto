package p000X;

import java.util.HashMap;

/* renamed from: X.14r  reason: invalid class name and case insensitive filesystem */
public final class C244614r implements C22550yc {
    public final C244414p A00;
    public final C05000Hl A01;
    public final HashMap A02 = new HashMap();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean booleanValue;
        String str = (String) obj;
        AnonymousClass0a4.A06(str);
        Boolean bool = (Boolean) this.A02.get(str);
        if (bool != null) {
            return bool;
        }
        C105814hT AF4 = this.A00.AF4(str);
        if (AF4 == null) {
            AnonymousClass0QD.A01("expose_null_txn", "Attempting to expose param, but transaction is null");
            booleanValue = false;
        } else {
            booleanValue = ((Boolean) this.A01.A01(AF4.A03)).booleanValue();
        }
        HashMap hashMap = this.A02;
        Boolean valueOf = Boolean.valueOf(booleanValue);
        hashMap.put(str, valueOf);
        return valueOf;
    }

    public C244614r(C05000Hl r2, C244414p r3) {
        this.A01 = r2;
        this.A00 = r3;
    }
}
