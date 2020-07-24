package p000X;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: X.BXY */
public final class BXY extends AnonymousClass0O9 {
    public final /* synthetic */ C25731BXb A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BXY(C25731BXb bXb) {
        super(177, 4, false, false);
        this.A00 = bXb;
    }

    public final void run() {
        C25732BXc bXc;
        C25731BXb bXb = this.A00;
        synchronized (bXb.A00) {
            bXc = (C25732BXc) bXb.A00.A01("state-v1", false);
        }
        C25732BXc bXc2 = bXb.A01;
        synchronized (bXc2) {
            if (bXc != null) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (bXc) {
                    for (BXX bxx : bXc.A00) {
                        String A0E = AnonymousClass000.A0E(bxx.A02, bxx.A01);
                        BXX bxx2 = (BXX) bXc2.A01.get(A0E);
                        if (bxx2 != null) {
                            synchronized (bxx2) {
                                synchronized (bxx) {
                                    List list = bxx2.A05;
                                    List list2 = bxx.A05;
                                    TreeSet treeSet = new TreeSet(list);
                                    treeSet.addAll(list2);
                                    bxx2.A05 = new ArrayList(treeSet);
                                    List list3 = bxx2.A06;
                                    List list4 = bxx.A06;
                                    TreeSet treeSet2 = new TreeSet(list3);
                                    treeSet2.addAll(list4);
                                    bxx2.A06 = new ArrayList(treeSet2);
                                    List list5 = bxx2.A04;
                                    List list6 = bxx.A04;
                                    TreeSet treeSet3 = new TreeSet(list5);
                                    treeSet3.addAll(list6);
                                    bxx2.A04 = new ArrayList(treeSet3);
                                    if (bxx2.A00.longValue() == 0) {
                                        bxx2.A00 = bxx.A00;
                                    }
                                }
                            }
                        } else if (bxx.A00.longValue() < currentTimeMillis) {
                            C25732BXc.A00(bXc2, A0E, bxx);
                        }
                    }
                }
            }
        }
    }
}
