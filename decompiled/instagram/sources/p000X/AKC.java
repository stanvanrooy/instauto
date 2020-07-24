package p000X;

import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AKC */
public final class AKC {
    public long A00;
    public C23375AKa A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05 = true;
    public final AnonymousClass0C1 A06;
    public final C23385AKk A07;
    public final C23375AKa A08;
    public final C23375AKa A09;
    public final AK9 A0A;

    public final void A00(AKR akr) {
        if (this.A04) {
            boolean z = akr.A05;
            this.A0A.A0E.AxN(z);
            if (!z) {
                long j = this.A00;
                if (akr.A04 == null) {
                    akr.A04 = new ArrayList();
                }
                long j2 = 0;
                for (AKX akx : akr.A04) {
                    if (akx.AJ6() > j2) {
                        j2 = akx.AJ6();
                    }
                }
                if (akr.A03 == null) {
                    akr.A03 = new ArrayList();
                }
                long j3 = 0;
                for (AKX akx2 : akr.A03) {
                    if (akx2.AJ6() > j3) {
                        j3 = akx2.AJ6();
                    }
                }
                this.A00 = Math.max(j, Math.max(j2, j3));
                if (akr.A03 == null) {
                    akr.A03 = new ArrayList();
                }
                List<AKS> list = akr.A03;
                List<AJX> list2 = null;
                AKL akl = akr.A01;
                if (akl != null) {
                    HashMap hashMap = akl.A01;
                    for (AKS aks : list) {
                        C23334AIl A002 = C23334AIl.A00((String) hashMap.get(aks.AZf().getId()));
                        if (A002 != null) {
                            aks.A00 = A002;
                        }
                    }
                    AKL akl2 = akr.A01;
                    list2 = akl2.A02;
                    this.A03 = akl2.A00;
                }
                AK9 ak9 = this.A0A;
                if (akr.A04 == null) {
                    akr.A04 = new ArrayList();
                }
                List<AKJ> list3 = akr.A04;
                AKS aks2 = akr.A02;
                int i = akr.A00;
                boolean z2 = this.A05;
                if (!ak9.A02.A05()) {
                    ak9.A0D(aks2);
                }
                ak9.A00 = (int) (((long) i) * 1000);
                if (!list.isEmpty() || !list3.isEmpty() || list2 == null || !list2.isEmpty()) {
                    AnonymousClass79M r4 = ak9.A01;
                    if (r4 != null) {
                        int size = list.size();
                        int size2 = list3.size();
                        r4.A0i.addAndGet(size);
                        r4.A0h.addAndGet(size);
                        r4.A0a.addAndGet(size2);
                        r4.A0f.addAndGet(size2);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (AKX akx3 : list) {
                        if (!akx3.AZf().equals(ak9.A0L.A06) || z2) {
                            arrayList.add(akx3);
                        }
                    }
                    for (AKJ akj : list3) {
                        if (!akj.AZf().equals(ak9.A0L.A06)) {
                            arrayList.add(akj);
                        }
                    }
                    if (list2 != null) {
                        for (AJX ajx : list2) {
                            if (ajx.AZf() != null && !ajx.AZf().equals(ak9.A0L.A06)) {
                                arrayList.add(ajx);
                            }
                        }
                    }
                    Collections.sort(arrayList, ak9.A0H);
                    if (z2) {
                        C23346AIx aIx = ak9.A07;
                        boolean z3 = false;
                        if (arrayList.size() <= 500) {
                            z3 = true;
                        }
                        AnonymousClass0a4.A09(z3);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (aIx.A02.contains((AKX) it.next())) {
                                it.remove();
                            }
                        }
                        aIx.maybeEvictOldComments(arrayList.size());
                        aIx.A02.addAll(arrayList);
                        aIx.A01();
                    } else {
                        ak9.A06.addAll(arrayList);
                    }
                }
                boolean z4 = false;
                if (ak9.A02.A01() == Constants.A0C) {
                    z4 = true;
                }
                if (z4) {
                    if (z2) {
                        ak9.A0J(new AKJ(ak9.A0L.A06, ak9.A0K.getContext().getString(C0003R.string.user_joined_system_comment, new Object[]{ak9.A0L.A06.AZn()})));
                    }
                    if (ak9.A0A && !ak9.A09) {
                        String string = ak9.A0K.getContext().getString(C0003R.string.live_with_request_to_join_system_comment, new Object[]{ak9.A0M.AZn()});
                        ak9.A09 = true;
                        ak9.A0J(new AKV(ak9.A0L.A06, string));
                        ak9.A0A();
                    }
                }
                AK9.A07(ak9);
                this.A05 = false;
            }
        }
    }

    public AKC(AnonymousClass0C1 r2, C23375AKa aKa, C23375AKa aKa2, AK9 ak9, C23385AKk aKk) {
        this.A06 = r2;
        this.A09 = aKa;
        this.A08 = aKa2;
        this.A01 = aKa2;
        this.A0A = ak9;
        this.A07 = aKk;
    }
}
