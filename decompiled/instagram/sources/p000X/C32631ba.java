package p000X;

import com.instagram.pendingmedia.model.PendingMedia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1ba  reason: invalid class name and case insensitive filesystem */
public final class C32631ba extends C28691Ms {
    public C32641bb A00 = C32641bb.NONE;
    public C13300iJ A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public HashMap A08 = new HashMap();
    public List A09 = new ArrayList();
    public boolean A0A = true;
    public final List A0B = new ArrayList();
    public final Map A0C = new HashMap();
    public final Map A0D = new HashMap();
    public final Map A0E = new HashMap();
    public final Map A0F = new HashMap();

    public final int A03(AnonymousClass0C1 r2) {
        return A00(this, r2, false).size();
    }

    public static List A00(C32631ba r6, AnonymousClass0C1 r7, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        C36791ic A002 = C36791ic.A00(r7);
        for (int i2 = 0; i2 < r6.A09.size(); i2++) {
            AnonymousClass1NJ r2 = (AnonymousClass1NJ) r6.A09.get(i2);
            if (r2 != null && !A002.A04(r2) && (((i = r2.A05) == 0 || i == 3) && (z || !r6.A0D.containsKey(r2)))) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public static void A01(C32631ba r6, AnonymousClass0C1 r7, List list, boolean z, boolean z2) {
        if (z) {
            r6.A0C.clear();
            r6.A09.clear();
        }
        Iterator it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            AnonymousClass1NJ r2 = (AnonymousClass1NJ) it.next();
            if (A02(r2) && !r6.A0C.containsKey(r2.getId())) {
                if (z2) {
                    r6.A09.add(0, r2);
                } else {
                    r6.A09.add(r2);
                }
                r6.A0C.put(r2.getId(), r2);
                z3 = true;
            }
        }
        if (z3) {
            C23300zv.A00(r7).A04(new C32681bf(r6));
        }
    }

    public final C58442fx A05(AnonymousClass0C1 r4, AnonymousClass1NJ r5) {
        C58442fx r2 = (C58442fx) this.A0F.get(r5.getId());
        if (r2 != null) {
            return r2;
        }
        AnonymousClass3D7 r22 = new AnonymousClass3D7(r4, this, r5);
        this.A0F.put(r22.getId(), r22);
        return r22;
    }

    public final C58442fx A06(AnonymousClass0C1 r4, C162746x0 r5) {
        C58442fx r2 = (C58442fx) this.A0F.get(r5.A00.getId());
        if (r2 != null) {
            return r2;
        }
        AnonymousClass70F r22 = new AnonymousClass70F(r4, this, r5);
        this.A0F.put(r22.getId(), r22);
        return r22;
    }

    public final C58442fx A07(AnonymousClass0C1 r4, PendingMedia pendingMedia) {
        C58442fx r2 = (C58442fx) this.A0F.get(pendingMedia.getId());
        if (r2 != null) {
            return r2;
        }
        AnonymousClass3D7 r22 = new AnonymousClass3D7(r4, this, pendingMedia, this.A01);
        this.A0F.put(r22.getId(), r22);
        return r22;
    }

    public final List A08(AnonymousClass0C1 r5) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1NJ r1 : this.A09) {
            if (!this.A0D.containsKey(r1)) {
                arrayList.add(A05(r5, r1));
            }
        }
        return arrayList;
    }

    public final List A09(AnonymousClass0C1 r4) {
        ArrayList arrayList = new ArrayList();
        for (PendingMedia A072 : this.A0B) {
            arrayList.add(A07(r4, A072));
        }
        return arrayList;
    }

    public final List A0A(AnonymousClass0C1 r5, boolean z) {
        C58442fx A052;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1NJ r1 : A00(this, r5, z)) {
            if (this.A0D.containsKey(r1)) {
                A052 = A06(r5, (C162746x0) this.A0D.get(r1));
            } else {
                A052 = A05(r5, r1);
            }
            arrayList.add(A052);
        }
        return arrayList;
    }

    public final void A0B(AnonymousClass0C1 r5, AnonymousClass2NS r6) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1NJ r1 : this.A09) {
            if (r6.BnD(r1)) {
                arrayList.add(r1);
            }
        }
        if (this.A09.size() != arrayList.size()) {
            A01(this, r5, arrayList, true, false);
        }
    }

    public final void A0C(AnonymousClass0C1 r6, C32631ba r7, boolean z) {
        boolean z2;
        C32641bb r1 = r7.A00;
        if (r1 != this.A00) {
            this.A00 = r1;
        }
        if (!AnonymousClass17M.A00(r7.A07, this.A07)) {
            this.A07 = r7.A07;
            z2 = true;
        } else {
            z2 = false;
        }
        String str = r7.A04;
        if (str != null && !AnonymousClass17M.A00(str, this.A04)) {
            this.A04 = r7.A04;
            z2 = true;
        }
        C13300iJ r12 = r7.A01;
        if (r12 != null && !AnonymousClass17M.A00(r12, this.A01)) {
            this.A01 = r7.A01;
        }
        if (z) {
            this.A0C.clear();
            this.A09.clear();
        }
        if (!AnonymousClass17M.A00(r7.A06, this.A06)) {
            this.A06 = r7.A06;
            z2 = true;
        }
        for (AnonymousClass1NJ r2 : r7.A09) {
            if (A02(r2) && !this.A0C.containsKey(r2.getId())) {
                this.A09.add(r2);
                this.A0C.put(r2.getId(), r2);
                z2 = true;
            }
        }
        if (!AnonymousClass17M.A00(r7.A05, this.A05)) {
            this.A05 = r7.A05;
            z2 = true;
        }
        if (!AnonymousClass17M.A00(Boolean.valueOf(r7.A0A), Boolean.valueOf(this.A0A))) {
            this.A0A = r7.A0A;
            z2 = true;
        }
        if (!AnonymousClass17M.A00(r7.A03, this.A03)) {
            this.A03 = r7.A03;
            z2 = true;
        }
        if (z2) {
            C23300zv.A00(r6).A04(new C32681bf(this));
        }
    }

    public static boolean A02(AnonymousClass1NJ r2) {
        if (r2.AiO() && r2.A1T()) {
            return true;
        }
        AnonymousClass0QD.A02("InvalidVideoMediaInIGTVFeed", "id: " + r2.APo() + " type: " + r2.APx());
        return false;
    }

    public final C58442fx A04(AnonymousClass0C1 r2, int i, boolean z) {
        return (C58442fx) A0A(r2, z).get(i);
    }

    public C32631ba() {
    }

    public C32631ba(String str, C32641bb r3, String str2) {
        this.A02 = str;
        this.A00 = r3;
        this.A07 = str2;
    }
}
