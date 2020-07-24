package p000X;

import android.content.Context;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Nv  reason: invalid class name and case insensitive filesystem */
public final class C28911Nv implements C28921Nw, C06570Po {
    public final C28921Nw A00;
    public final AnonymousClass1O8 A01;
    public final Map A02 = new HashMap();
    public final Set A03 = new HashSet();
    public final AnonymousClass0C1 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r10.A00.isEmpty() != false) goto L_0x000b;
     */
    public static void A00(C28911Nv r5, QuickPromotionSlot quickPromotionSlot, Set set, Map map, Map map2, C61482ls r10) {
        boolean z;
        if (r10 != null) {
            z = true;
        }
        z = false;
        QuickPromotionSlot quickPromotionSlot2 = quickPromotionSlot;
        r5.A03.add(quickPromotionSlot);
        C28921Nw r0 = r5.A00;
        r0.BgM(quickPromotionSlot2, new C40881pP(r5, quickPromotionSlot2, z, map2, map));
        r0.AT9(quickPromotionSlot2, set, map2, r10);
    }

    public final void AT9(QuickPromotionSlot quickPromotionSlot, Set set, Map map, C61482ls r18) {
        int i;
        QuickPromotionSlot quickPromotionSlot2 = quickPromotionSlot;
        if (!this.A03.contains(quickPromotionSlot)) {
            Set set2 = set;
            C61482ls r13 = r18;
            Map map2 = map;
            if (r18 == null || r13.A00.isEmpty()) {
                AnonymousClass1O8 r6 = this.A01;
                if (!map2.isEmpty()) {
                    i = 1;
                    for (Map.Entry entry : map2.entrySet()) {
                        if (i == 3) {
                            break;
                        }
                        Object obj = r6.A01.get(entry.getKey());
                        AnonymousClass0a4.A06(obj);
                        AnonymousClass1O9 r3 = (AnonymousClass1O9) obj;
                        Iterator it = ((Set) entry.getValue()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int A002 = r3.A00((Trigger) it.next());
                            if (A002 == 3) {
                                i = 3;
                                break;
                            } else if (A002 == 2 || (A002 == 0 && i != 2)) {
                                i = A002;
                            }
                        }
                    }
                } else {
                    i = 3;
                }
                if (i == 1 || i == 0) {
                    AnonymousClass1O8 r0 = this.A01;
                    r0.BgM(quickPromotionSlot, new C37901kP(this, quickPromotionSlot2, set2, map2, map2, r13));
                    r0.AT9(quickPromotionSlot, set2, map2, r13);
                } else if (i == 3) {
                    AnonymousClass0QD.A01("IG-QP", "Surface to trigger mapping is invalid: " + map2);
                    AnonymousClass1OF r02 = (AnonymousClass1OF) this.A02.get(quickPromotionSlot);
                    if (r02 != null) {
                        r02.B2a();
                    }
                } else {
                    AnonymousClass1O8 r5 = this.A01;
                    HashMap hashMap = new HashMap();
                    for (C37731k8 r62 : C37721k7.A00(quickPromotionSlot)) {
                        Object obj2 = r5.A01.get(r62.A00);
                        AnonymousClass0a4.A06(obj2);
                        AnonymousClass1O9 r7 = (AnonymousClass1O9) obj2;
                        HashSet hashSet = new HashSet();
                        Iterator it2 = r62.A01.iterator();
                        while (it2.hasNext()) {
                            Trigger trigger = (Trigger) it2.next();
                            int A003 = r7.A00(trigger);
                            if (A003 == 0 || A003 == 2) {
                                hashSet.add(trigger);
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            hashMap.put(r62.A00, hashSet);
                        }
                    }
                    A00(this, quickPromotionSlot2, set2, map2, hashMap, r13);
                }
            } else {
                A00(this, quickPromotionSlot2, set2, map2, map2, r13);
            }
        }
    }

    public final void Ads(QuickPromotionSlot quickPromotionSlot, AnonymousClass2O9 r7) {
        if (!((Boolean) AnonymousClass0L6.A02(this.A04, AnonymousClass0L7.INSTAGRAM_NS_QP_PREFETCH, "prefetch_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass1O8 r0 = this.A01;
            QuickPromotionSurface AXN = r7.AXN();
            Set<Trigger> AZ3 = r7.AZ3();
            Object obj = r0.A01.get(AXN);
            AnonymousClass0a4.A06(obj);
            AnonymousClass1O9 r4 = (AnonymousClass1O9) obj;
            for (Trigger triggerStore : AZ3) {
                C37891kO triggerStore2 = r4.getTriggerStore(triggerStore);
                if (triggerStore2 != null) {
                    triggerStore2.A02.clear();
                    triggerStore2.A01 = -1L;
                }
            }
        }
    }

    public final void BgM(QuickPromotionSlot quickPromotionSlot, AnonymousClass1OF r3) {
        this.A02.put(quickPromotionSlot, r3);
    }

    public final void BsF(QuickPromotionSlot quickPromotionSlot) {
        this.A02.remove(quickPromotionSlot);
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A02.clear();
        this.A03.clear();
        this.A04.BbT(C28911Nv.class);
    }

    public C28911Nv(Context context, AnonymousClass0C1 r3, C28921Nw r4) {
        this.A04 = r3;
        this.A01 = new AnonymousClass1O8(context, r3);
        this.A00 = r4;
    }
}
