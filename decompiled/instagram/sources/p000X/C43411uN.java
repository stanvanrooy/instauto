package p000X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1uN  reason: invalid class name and case insensitive filesystem */
public final class C43411uN implements C36321hr {
    public int A00;
    public C49592Cv A01;
    public C29261Pf A02;
    public C49752Dl A03;
    public C43481uU A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public List A0G;
    public List A0H;
    public Map A0I = new HashMap();
    public Map A0J = new HashMap();
    public boolean A0K = true;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public final C43431uP A00(int i) {
        List list = this.A0H;
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        return (C43431uP) this.A0H.get(i);
    }

    public final Integer A01(C28487Chi chi) {
        Integer num = (Integer) this.A0I.get(chi);
        if (num == null) {
            return -1;
        }
        return num;
    }

    public final Integer A02(C43451uR r2) {
        Integer num = (Integer) this.A0J.get(r2);
        if (num == null) {
            return -1;
        }
        return num;
    }

    public final List A03() {
        ArrayList arrayList = new ArrayList();
        if (this.A0H != null) {
            for (int i = 0; i < this.A0H.size(); i++) {
                C43431uP r2 = (C43431uP) this.A0H.get(i);
                if (r2.A05 == C43471uT.SUGGESTED_USER) {
                    arrayList.add((C43451uR) r2.A04);
                } else {
                    AnonymousClass0QD.A02("SuggestedUsers", "You should only call `getRecommendedUsersListFromSuggestedItems(...)` if you are certain the suggested items are all of type SUGGESTED_USER. This hairiness should only occur during the migration from the List<RecommendedUser> to the List<SuggestedItem> response.");
                }
            }
        }
        return arrayList;
    }

    public final void A04(String str) {
        List list = this.A0H;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C43431uP r2 = (C43431uP) it.next();
                if (r2.A05 == C43471uT.SUGGESTED_USER && str.equals(((C43451uR) r2.A04).getId())) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public final boolean A05() {
        List list = this.A0G;
        if ((list == null || list.isEmpty()) && this.A05.intValue() < 0) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        List list = this.A0H;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A07(String str) {
        List<C43451uR> list = this.A0G;
        if (list != null) {
            for (C43451uR id : list) {
                if (id.getId().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        List<C43431uP> list2 = this.A0H;
        if (list2 != null) {
            for (C43431uP r2 : list2) {
                if (r2.A05 == C43471uT.SUGGESTED_USER && str.equalsIgnoreCase(((C43451uR) r2.A04).getId())) {
                    return true;
                }
            }
        }
        List<C28487Chi> list3 = this.A0F;
        if (list3 == null) {
            return false;
        }
        for (C28487Chi chi : list3) {
            if (chi.A05.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final C29261Pf ALf() {
        return this.A02;
    }

    public final String AYw() {
        return this.A0E;
    }

    public final Integer AZP() {
        return Constants.A0N;
    }

    public final String getId() {
        return this.A07;
    }
}
