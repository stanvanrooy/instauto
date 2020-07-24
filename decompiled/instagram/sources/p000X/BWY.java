package p000X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.io.File;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BWY */
public final class BWY extends C17920r1 {
    public final /* synthetic */ BWZ A00;
    public final /* synthetic */ QuickPromotionSlot A01;
    public final /* synthetic */ File A02;

    public BWY(BWZ bwz, QuickPromotionSlot quickPromotionSlot, File file) {
        this.A00 = bwz;
        this.A01 = quickPromotionSlot;
        this.A02 = file;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List<AnonymousClass2BW> A002;
        long j;
        long seconds;
        int A03 = AnonymousClass0Z0.A03(292228206);
        C38361l9 r4 = (C38361l9) obj;
        int A032 = AnonymousClass0Z0.A03(-364289057);
        BWZ bwz = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        QuickPromotionSlot quickPromotionSlot = this.A01;
        HashMap hashMap = new HashMap();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds2 = timeUnit.toSeconds(currentTimeMillis);
        long seconds3 = timeUnit.toSeconds(System.currentTimeMillis());
        for (C37731k8 r2 : C37721k7.A00(quickPromotionSlot)) {
            if (!(r4.A00(r2.A00) == null || (A002 = r4.A00(r2.A00)) == null || A002.isEmpty())) {
                for (AnonymousClass2BW r6 : A002) {
                    C28951Nz r8 = bwz.A01;
                    AnonymousClass0C1 r7 = bwz.A03;
                    QuickPromotionSurface quickPromotionSurface = r2.A00;
                    C28951Nz r18 = r8;
                    AnonymousClass0C1 r19 = r7;
                    AnonymousClass2C5 A003 = r18.A00(r19, r6, quickPromotionSurface, r2.A01, EnumSet.allOf(C28841Nk.class), seconds3, seconds2, false);
                    C49162Ba r82 = r6.A02;
                    String str = r82.A05;
                    if (!A003.A01) {
                        hashMap.put(str, A003);
                    } else {
                        Long l = r6.A03;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        Long A004 = r6.A00();
                        if (A004 != null) {
                            seconds = A004.longValue();
                        } else {
                            seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + j;
                        }
                        BXX A022 = C25731BXb.A00().A02(bwz.A03.A04(), str);
                        if (A022 == null) {
                            A022 = new BXX(bwz.A03.A04(), r82.A05, seconds);
                        }
                        QuickPromotionSurface quickPromotionSurface2 = r2.A00;
                        C49162Ba r12 = r6.A02;
                        String A04 = bwz.A03.A04();
                        List list = r12.A06;
                        AnonymousClass11J.A00(list);
                        hashMap.put(str, bwz.A02.A00(bwz.getContext(), bwz.A03, C25711BWg.A00(A04, (C49262Bl) list.get(0), r12, quickPromotionSurface2, seconds, r6.A00, false, r6.A04, A022)));
                    }
                }
            }
        }
        QuickPromotionSlot quickPromotionSlot2 = this.A01;
        HashMap hashMap2 = new HashMap();
        for (C37731k8 r1 : C37721k7.A00(quickPromotionSlot2)) {
            List A005 = r4.A00(r1.A00);
            if (A005 == null) {
                A005 = Collections.emptyList();
            }
            hashMap2.put(r1, A005);
        }
        BWQ bwq = this.A00.A00;
        C25632BSq bSq = new C25632BSq(this.A02, hashMap, hashMap2, this.A01);
        bwq.A02.remove(bSq);
        bwq.A02.add(bSq);
        Collections.sort(bwq.A02, bwq.A01);
        if (!bwq.A02.isEmpty()) {
            bwq.A00.notifyChanged();
        } else {
            bwq.A00.notifyInvalidated();
        }
        this.A00.A05.remove(this.A01);
        BWZ bwz2 = this.A00;
        bwz2.A04.setIsLoading(!bwz2.A05.isEmpty());
        AnonymousClass0Z0.A0A(-1676931488, A032);
        AnonymousClass0Z0.A0A(-526577253, A03);
    }

    public final void onFail(C43791v5 r5) {
        int A03 = AnonymousClass0Z0.A03(635013294);
        C53642Tq.A01(this.A00.getContext(), "Error loading QPs", 0).show();
        this.A00.A05.remove(this.A01);
        BWZ bwz = this.A00;
        bwz.A04.setIsLoading(!bwz.A05.isEmpty());
        AnonymousClass0Z0.A0A(624155073, A03);
    }
}
