package p000X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.PendingRecipient;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1l0  reason: invalid class name and case insensitive filesystem */
public final class C38271l0 {
    public static String A03(Reel reel, AnonymousClass0C1 r4) {
        if (reel != null && reel.A0W()) {
            return "live_";
        }
        if (reel != null && reel.A0X()) {
            return "replay_";
        }
        if (reel != null) {
            boolean z = false;
            if (reel.A0J != null) {
                z = true;
            }
            if (z) {
                return "reel_netego_ad4ad_";
            }
        }
        if (reel == null || !reel.A0x || !((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.STORY_ADS_SELF_VIEW_REEL_LOGGING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return "reel_";
        }
        return "self_reel_";
    }

    public static String A04(C39941no r1) {
        if (r1 != null && r1.A0n()) {
            return "live_";
        }
        if (r1 != null && r1.A0o()) {
            return "replay_";
        }
        if (r1 == null || !r1.A0v()) {
            return "reel_";
        }
        return "reel_netego_ad4ad_";
    }

    public static String A05(C50282Fr r0, AnonymousClass0C1 r1) {
        Reel reel;
        if (r0 != null) {
            reel = r0.A0A;
        } else {
            reel = null;
        }
        return A03(reel, r1);
    }

    public static void A06(AnonymousClass0C1 r6, Reel reel, Long l, Long l2, Long l3) {
        if (l != null) {
            reel.A03 = l.longValue();
        }
        if (l2 != null) {
            reel.A0P(r6, l2.longValue());
        }
        if (l3 != null) {
            boolean z = false;
            if (l3.longValue() > reel.A09(r6)) {
                z = true;
            }
            reel.A0o = z;
        }
    }

    public static boolean A07(Reel reel) {
        C249916w r0 = reel.A0M;
        if (r0 == null || r0.AZG().intValue() != 6) {
            return false;
        }
        return true;
    }

    public static DirectShareTarget A00(C50282Fr r6, C39941no r7) {
        String name;
        if (r6.A0H()) {
            ArrayList arrayList = new ArrayList();
            for (C13300iJ pendingRecipient : ((C51242Jv) r6.A0A.A0M).A02) {
                arrayList.add(new PendingRecipient(pendingRecipient));
            }
            String id = r6.A0B().getId();
            C249916w r0 = r6.A0A.A0M;
            if (r0 == null) {
                name = null;
            } else {
                name = r0.getName();
            }
            return new DirectShareTarget(arrayList, id, name, true);
        }
        PendingRecipient pendingRecipient2 = new PendingRecipient(r7.A0D);
        return new DirectShareTarget(Collections.singletonList(pendingRecipient2), (String) null, pendingRecipient2.AZn(), true);
    }

    public static Reel A01(AnonymousClass0C1 r0, C13300iJ r1) {
        Reel A02 = A02(r0, r1);
        if (A02 == null || A02.A0m(r0)) {
            return null;
        }
        return A02;
    }

    public static Reel A02(AnonymousClass0C1 r7, C13300iJ r8) {
        Long l;
        if (!(ReelStore.A02(r7).A0G(r8.getId()) == null && ((l = r8.A1x) == null || l.longValue() == 0))) {
            ReelStore A02 = ReelStore.A02(r7);
            String id = r8.getId();
            Reel A0I = A02.A0I(id, new C249816v(r8), r7.A04().equals(id));
            Long l2 = r8.A1x;
            r8.A1x = null;
            Long l3 = r8.A1y;
            r8.A1y = null;
            Long l4 = r8.A1w;
            r8.A1w = null;
            A06(r7, A0I, l2, l3, l4);
            if (!A09(r7, r8) || Reel.A06(Long.valueOf(A0I.A03))) {
                return null;
            }
            return A0I;
        }
        return null;
    }

    public static boolean A08(C39941no r5) {
        AnonymousClass24Q r0;
        C34151eA A00 = C65382t0.A00(r5.A0U(), C34181eD.COUNTDOWN);
        if (A00 == null) {
            r0 = null;
        } else {
            r0 = A00.A0L;
        }
        if (r0 == null || r0.A00 > TimeUnit.MILLISECONDS.toSeconds(new Date().getTime())) {
            return false;
        }
        return true;
    }

    public static boolean A09(AnonymousClass0C1 r2, C13300iJ r3) {
        if (r3.A0e()) {
            return false;
        }
        if (r3.A1o == Constants.ONE || r2.A04().equals(r3.getId()) || C26661Ek.A00(r2).A0J(r3) == C13390iS.FollowStatusFollowing) {
            return true;
        }
        return false;
    }
}
