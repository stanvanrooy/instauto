package p000X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Pm  reason: invalid class name and case insensitive filesystem */
public final class C29331Pm extends C29341Pn {
    public C150786ce A00;
    public C27361Hn A01;
    public final AnonymousClass0C1 A02;
    public final Object A03 = new Object();

    public final void A06() {
        synchronized (this.A03) {
            this.A00 = null;
            super.A06();
        }
    }

    public final void A0N(List list, AnonymousClass1QE r9, String str, String str2) {
        List list2;
        C150816ch r1;
        String str3;
        synchronized (this.A03) {
            if (this.A00 == null) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    AnonymousClass1NG r2 = (AnonymousClass1NG) list.get(i);
                    if (C29261Pf.GROUP_SET.equals(r2.A0H)) {
                        C474423y r6 = (C474423y) r2.A0G;
                        C150786ce r0 = this.A00;
                        if (r0 == null || !r0.A01.equals(r6.getId())) {
                            this.A00 = new C150786ce(r6, this.A02);
                        }
                        this.A00.A01(r9.AMe(r6).A01, false);
                        String str4 = r9.AMe(r6).A01;
                        Iterator it = r6.A03.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                list2 = null;
                                break;
                            }
                            C150826ci r12 = (C150826ci) it.next();
                            if (r12.A00.equals(str4)) {
                                list2 = Collections.unmodifiableList(r12.A05);
                                break;
                            }
                        }
                        if (list2 != null) {
                            list.addAll(i + 1, list2);
                        }
                    } else {
                        i++;
                    }
                }
            } else if (str == null) {
                AnonymousClass0QD.A01("MainFeedItemList", "pagination source is null when GroupSet exists");
            } else {
                if (str2 == null) {
                    AnonymousClass0QD.A01("MainFeedItemList", "nextMaxId is null when GroupSet exists");
                }
                Iterator it2 = this.A00.A02.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        r1 = null;
                        break;
                    }
                    r1 = (C150816ch) it2.next();
                    if (r1.A03.equals(str)) {
                        break;
                    }
                }
                AnonymousClass0a4.A06(r1);
                C150816ch r13 = r1;
                r13.A05.addAll(list);
                r13.A02 = str2;
                r13.A03 = str;
                C150786ce r02 = this.A00;
                C150816ch r03 = (C150816ch) r02.A02.get(r02.A00);
                if (r03 != null) {
                    str3 = r03.A03;
                } else {
                    str3 = null;
                }
                if (str.equals(str3)) {
                }
            }
            super.A0F(list);
        }
    }

    public C29331Pm(AnonymousClass0C1 r2, C27361Hn r3) {
        this.A02 = r2;
        this.A01 = r3;
    }
}
