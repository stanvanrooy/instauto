package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1kS  reason: invalid class name and case insensitive filesystem */
public abstract class C37931kS extends C17920r1 implements AnonymousClass1OF {
    public final C28951Nz A00;
    public final QuickPromotionSlot A01;
    public final C37941kT A02;
    public final AnonymousClass0C1 A03;
    public final Map A04;
    public final Set A05;

    public AnonymousClass1OF A00() {
        return null;
    }

    public void A01(C37941kT r1) {
    }

    public final void BD5() {
        A01((C37941kT) null);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        long j;
        int A032 = AnonymousClass0Z0.A03(-1002141406);
        C38361l9 r5 = (C38361l9) obj;
        int A033 = AnonymousClass0Z0.A03(1478728618);
        QuickPromotionSlot quickPromotionSlot = this.A01;
        int hashCode = quickPromotionSlot.hashCode();
        AnonymousClass00B.A01.markerStart(35061762, hashCode);
        AnonymousClass00B.A01.markerAnnotate(35061762, hashCode, "slot", quickPromotionSlot.name());
        long currentTimeMillis = System.currentTimeMillis();
        for (QuickPromotionSurface quickPromotionSurface : this.A04.keySet()) {
            Set set = (Set) this.A04.get(quickPromotionSurface);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
            AnonymousClass0C1 r13 = this.A03;
            Set set2 = this.A05;
            ArrayList<AnonymousClass2BW> arrayList = null;
            if (set != null) {
                ArrayList arrayList2 = new ArrayList();
                List<AnonymousClass2BW> A002 = r5.A00(quickPromotionSurface);
                if (A002 != null && !A002.isEmpty()) {
                    long seconds2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    for (AnonymousClass2BW r11 : A002) {
                        AnonymousClass0C1 r19 = r13;
                        AnonymousClass2BW r20 = r11;
                        if (this.A00.A00(r19, r20, quickPromotionSurface, set, set2, seconds2, seconds, r11.A05).A01) {
                            arrayList2.add(r11);
                        }
                    }
                    arrayList = arrayList2;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                for (AnonymousClass2BW r12 : arrayList) {
                    C49162Ba r112 = r12.A02;
                    Long A003 = r12.A00();
                    if (A003 != null) {
                        j = A003.longValue();
                    } else if (r12.A03 != null) {
                        j = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + r12.A03.longValue();
                    } else {
                        j = 0;
                    }
                    BXX A022 = C25731BXb.A00().A02(this.A03.A04(), r112.A05);
                    if (A022 == null) {
                        A022 = new BXX(this.A03.A04(), r112.A05, j);
                        C25731BXb.A00().A01.A01(A022);
                    }
                    List list = r112.A06;
                    AnonymousClass0a4.A06(list);
                    C37941kT r113 = this.A02;
                    String A042 = this.A03.A04();
                    C49162Ba r15 = r12.A02;
                    int i = r12.A00;
                    boolean z = r12.A05;
                    r113.A00(C25711BWg.A00(A042, (C49262Bl) list.get(0), r15, quickPromotionSurface, j, i, z, r12.A04, A022));
                }
            }
        }
        QuickPromotionSlot quickPromotionSlot2 = this.A01;
        int i2 = this.A02.A00;
        int hashCode2 = quickPromotionSlot2.hashCode();
        AnonymousClass00B.A01.markerPoint(35061762, hashCode2, "edges_validated");
        AnonymousClass00B.A01.markerAnnotate(35061762, hashCode2, "promotion_count", i2);
        AnonymousClass0Z0.A0A(851402093, A033);
        AnonymousClass0Z0.A0A(278070553, A032);
    }

    public C37931kS(QuickPromotionSlot quickPromotionSlot, Map map, C37941kT r3, C28951Nz r4, AnonymousClass0C1 r5, Set set) {
        this.A01 = quickPromotionSlot;
        this.A04 = map;
        this.A02 = r3;
        this.A00 = r4;
        this.A03 = r5;
        this.A05 = set;
    }

    public final void B2a() {
        AnonymousClass1OF A002 = A00();
        if (A002 != null) {
            A002.B2a();
        }
    }

    public final void onFail(C43791v5 r3) {
        int A032 = AnonymousClass0Z0.A03(982666394);
        B2a();
        AnonymousClass0Z0.A0A(-1499037536, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0Z0.A03(779045661);
        int A033 = AnonymousClass0Z0.A03(1413565541);
        if (!this.A02.A01.isEmpty()) {
            BGY(this.A04, this.A02);
        } else {
            BD5();
        }
        AnonymousClass0Z0.A0A(-1280180852, A033);
        AnonymousClass0Z0.A0A(814425904, A032);
    }

    public final void BGY(Map map, C37941kT r2) {
        A01(r2);
    }
}
