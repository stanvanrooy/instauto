package p000X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.AO6 */
public final class AO6 extends C689130g {
    public boolean A00 = false;
    public final C68342yv A01 = new C68342yv();
    public final List A02 = new ArrayList();
    public final Set A03 = new HashSet();
    public final AnonymousClass0C1 A04;
    public final C23508APe A05;
    public final List A06 = new ArrayList();

    public static void A00(AO6 ao6) {
        List<C13300iJ> list;
        boolean z;
        if (ao6.A00) {
            list = ao6.A06;
        } else {
            list = ao6.A02;
        }
        ao6.clear();
        for (C13300iJ r4 : list) {
            if (ao6.A03.contains(r4.getId())) {
                z = true;
                if (!r4.A0f()) {
                    ao6.addModel(new C23528APy(r4, z, true ^ r4.equals(ao6.A04.A06)), (Object) null, ao6.A05);
                }
            }
            z = false;
            ao6.addModel(new C23528APy(r4, z, true ^ r4.equals(ao6.A04.A06)), (Object) null, ao6.A05);
        }
        ao6.updateListView();
    }

    public AO6(Context context, C23472ANu aNu, AKU aku, AnonymousClass0C1 r7) {
        this.A04 = r7;
        C23508APe aPe = new C23508APe(context, aNu, aku);
        this.A05 = aPe;
        init(aPe);
    }

    public final void A01(String str) {
        String lowerCase = str.toLowerCase();
        C68362yx ATO = this.A01.ATO(lowerCase);
        this.A06.clear();
        boolean z = !TextUtils.isEmpty(lowerCase);
        this.A00 = z;
        if (ATO.A00 == Constants.A0C) {
            this.A06.addAll(ATO.A04);
        } else if (z) {
            ArrayList arrayList = new ArrayList();
            for (C13300iJ r1 : this.A02) {
                if (r1.AZn().toLowerCase().contains(lowerCase) || r1.A0B().toLowerCase().contains(lowerCase)) {
                    arrayList.add(r1);
                }
            }
            this.A01.A4E(lowerCase, arrayList, (String) null);
            this.A06.addAll(arrayList);
        }
        A00(this);
    }
}
