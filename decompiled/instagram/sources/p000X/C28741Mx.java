package p000X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Mx  reason: invalid class name and case insensitive filesystem */
public final class C28741Mx {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r3.A04() == null) goto L_0x0018;
     */
    public static void A00(AnonymousClass0P4 r2, AnonymousClass1NG r3) {
        boolean z;
        r2.A0G("feed_item_type", r3.A0H.toString());
        if (r3.A0H == C29261Pf.MEDIA) {
            z = true;
        }
        z = false;
        if (z) {
            r2.A0G("media_id", r3.A04().getId());
            r2.A0G("delivery_flags", C06360Ot.A04(",", r3.A04().A3G));
            r2.A0A("is_ad", Boolean.valueOf(r3.A04().Aho()));
        }
    }

    public static void A01(AnonymousClass0P4 r2, C15880ng r3) {
        r2.A0G(TraceFieldType.RequestID, r3.A05);
        r2.A0G("session_id", r3.A06);
        r2.A0G("request_type", C16120o4.A00(r3.A04));
        r2.A0E("view_info_count", Integer.valueOf(r3.A03));
    }

    public static void A02(AnonymousClass0C1 r5, List list, AnonymousClass1I6 r7) {
        AnonymousClass0RU A01 = AnonymousClass0WN.A01(r5);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0P4 A012 = AnonymousClass0P4.A01("instagram_feed_item_deserialized", "feed_timeline");
            A00(A012, (AnonymousClass1NG) it.next());
            if (r7 != null) {
                A012.A0G("session_id", r7.AVo());
            }
            A01.BcG(A012);
        }
    }

    public static void A03(AnonymousClass0C1 r5, List list, AnonymousClass1I6 r7) {
        AnonymousClass0RU A01 = AnonymousClass0WN.A01(r5);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0P4 A012 = AnonymousClass0P4.A01("instagram_feed_item_serialized", "feed_timeline");
            A00(A012, (AnonymousClass1NG) it.next());
            if (r7 != null) {
                A012.A0G("session_id", r7.AVo());
            }
            A01.BcG(A012);
        }
    }
}
