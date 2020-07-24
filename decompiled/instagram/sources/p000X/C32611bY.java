package p000X;

import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1bY  reason: invalid class name and case insensitive filesystem */
public final class C32611bY implements C32621bZ {
    public C11200ea A00;
    public final C23300zv A01;
    public final C32631ba A02;
    public final AnonymousClass1LQ A03;
    public final AnonymousClass0C1 A04;
    public final Runnable A05 = new C32661bd(this);
    public final Set A06 = new HashSet();

    public final void A02() {
        C32671be r2 = new C32671be(this);
        this.A00 = r2;
        this.A01.A02(AnonymousClass14J.class, r2);
        A03();
    }

    public final void A03() {
        PendingMediaStore A012 = PendingMediaStore.A01(this.A04);
        Integer num = Constants.A0u;
        ArrayList<PendingMedia> arrayList = new ArrayList<>(A012.A02.size());
        for (PendingMedia pendingMedia : A012.A02.values()) {
            if (C42831tK.A00(num, pendingMedia)) {
                arrayList.add(pendingMedia);
            }
        }
        HashSet hashSet = new HashSet();
        if (arrayList.isEmpty()) {
            C32631ba r2 = this.A02;
            AnonymousClass0C1 r1 = this.A04;
            r2.A0E.clear();
            r2.A0B.clear();
            C23300zv.A00(r1).BXT(new C32681bf(r2));
        } else {
            C32631ba r3 = this.A02;
            for (PendingMedia pendingMedia2 : arrayList) {
                C58442fx A07 = this.A02.A07(this.A04, pendingMedia2);
                if (A07.AZF() == Constants.ONE && A07.ARh().A0d != null) {
                    AnonymousClass1NJ r5 = A07.ARh().A0d;
                    A07.BlT(Constants.ZERO);
                    A07.Bir(r5);
                    if (!r5.AiO() || !r5.A1T()) {
                        AnonymousClass0QD.A02("InvalidVideoMediaInIGTVFeed", "id: " + r5.APo() + " type: " + r5.APx());
                    } else {
                        r3.A0C.put(A07.getId(), r5);
                    }
                }
                if (!this.A06.contains(pendingMedia2)) {
                    pendingMedia2.A0X(this);
                    this.A06.add(pendingMedia2);
                }
                hashSet.add(pendingMedia2);
                C32631ba r6 = this.A02;
                AnonymousClass0C1 r52 = this.A04;
                if (pendingMedia2.A0d == null && pendingMedia2.A3F != C42421sK.NOT_UPLOADED && !r6.A0E.containsKey(pendingMedia2.getId())) {
                    r6.A0E.put(pendingMedia2.getId(), pendingMedia2);
                    r6.A0B.add(0, pendingMedia2);
                } else if (pendingMedia2.A0d != null && r6.A0E.containsKey(pendingMedia2.getId())) {
                    r6.A0E.remove(pendingMedia2.getId());
                    r6.A0B.remove(pendingMedia2);
                    AnonymousClass1NJ r22 = pendingMedia2.A0d;
                    r6.A0C.put(r22.getId(), r22);
                    r6.A09.add(0, r22);
                } else if (pendingMedia2.A3F == C42421sK.NOT_UPLOADED) {
                    PendingMedia pendingMedia3 = (PendingMedia) r6.A0E.remove(pendingMedia2.getId());
                    if (pendingMedia3 != null) {
                        r6.A0B.remove(pendingMedia3);
                    }
                }
                C23300zv.A00(r52).BXT(new C32681bf(r6));
            }
        }
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            PendingMedia pendingMedia4 = (PendingMedia) it.next();
            if (!hashSet.contains(pendingMedia4)) {
                pendingMedia4.A0Y(this);
                it.remove();
            }
        }
        this.A03.B6t(A00(this.A04, this.A02), A01(this.A04, this.A02));
    }

    public final void BGJ(PendingMedia pendingMedia) {
        C12670hC.A04(this.A05);
    }

    public C32611bY(AnonymousClass0C1 r2, AnonymousClass1LQ r3, C32631ba r4) {
        this.A04 = r2;
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = C23300zv.A00(r2);
    }

    public static boolean A00(AnonymousClass0C1 r0, C32631ba r1) {
        for (C58442fx Afn : r1.A09(r0)) {
            if (Afn.Afn()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    public static boolean A01(AnonymousClass0C1 r1, C32631ba r2) {
        for (C58442fx r12 : r2.A09(r1)) {
            if (r12.AhJ() || r12.Agy()) {
                return true;
            }
            while (r2.hasNext()) {
            }
        }
        return false;
    }
}
