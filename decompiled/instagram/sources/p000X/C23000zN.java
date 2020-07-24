package p000X;

import android.util.Pair;
import com.instagram.model.reels.Reel;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0zN  reason: invalid class name and case insensitive filesystem */
public abstract class C23000zN {
    public static C17850qu A00(Reel reel, String str, AnonymousClass0C1 r6) {
        C15890nh r2 = new C15890nh(r6);
        r2.A09 = Constants.ONE;
        r2.A0C = "friendships/mute_friend_reel/";
        r2.A09("reel_id", reel.getId());
        r2.A09("source", "main_feed");
        r2.A09("reel_type", str);
        r2.A06(C68162yY.class, false);
        r2.A0G = true;
        return r2.A03();
    }

    public static C17850qu A01(Reel reel, String str, AnonymousClass0C1 r5) {
        C15890nh r2 = new C15890nh(r5);
        r2.A09 = Constants.ONE;
        r2.A0C = "friendships/unmute_friend_reel/";
        r2.A09("reel_id", reel.getId());
        r2.A09("reel_type", str);
        r2.A06(C68162yY.class, false);
        r2.A0G = true;
        return r2.A03();
    }

    public static C17850qu A02(AnonymousClass0C1 r4, C13300iJ r5, String str, String str2) {
        C15890nh r3 = new C15890nh(r4);
        r3.A09 = Constants.ONE;
        r3.A0E("friendships/mute_friend_reel/%s/", r5.getId());
        r3.A09("source", str);
        r3.A09("reel_type", str2);
        r3.A06(C68162yY.class, false);
        r3.A0G = true;
        return r3.A03();
    }

    public static String A04(Collection collection) {
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0S();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A05.A0g((String) it.next());
            }
            A05.A0P();
            A05.close();
            return stringWriter.toString();
        } catch (IOException e) {
            AnonymousClass0DB.A0B(C23000zN.class, e, "Failed to convert a collection to json", new Object[0]);
            return null;
        }
    }

    public static void A05(C15890nh r4, AnonymousClass0C1 r5, boolean z) {
        AnonymousClass0L7 r2 = AnonymousClass0L7.NETWORK_STACK_CAP_API_REQUEST_2020_H1;
        if (!((Boolean) AnonymousClass0L6.A02(r5, r2, "include_critical_api", false, (AnonymousClass04H) null)).booleanValue()) {
            return;
        }
        if (!z || ((Boolean) AnonymousClass0L6.A02(r5, r2, "is_reel_prefetch_critical_api", false, (AnonymousClass04H) null)).booleanValue()) {
            r4.A03 = C15920nk.CriticalAPI;
        }
    }

    public static C17850qu A03(Set set, Map map, AnonymousClass0C1 r5, String str) {
        String A04 = A04(set);
        if (A04 == null) {
            return null;
        }
        C15890nh r3 = new C15890nh(r5);
        r3.A09 = Constants.ONE;
        r3.A0C = "feed/reels_media/";
        r3.A0B("user_ids", A04);
        r3.A06(C43231u3.class, false);
        r3.A09("source", str);
        r3.A0G = true;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                r3.A09((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Pair A00 = C23040zR.A00(r5);
        r3.A0A((String) A00.first, (String) A00.second);
        return r3.A03();
    }
}
