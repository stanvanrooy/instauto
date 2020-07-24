package p000X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.reels.persistence.UserReelMediasStore;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1u0  reason: invalid class name and case insensitive filesystem */
public final class C43201u0 {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C43221u2 A01;
    public final AnonymousClass0C1 A02;
    public final Set A03;
    public final AnonymousClass12K A04;
    public final String A05;
    public final Map A06;

    public static C17850qu A00(C43201u0 r5, Set set) {
        C17850qu A032 = C23000zN.A03(set, r5.A06, r5.A02, r5.A05);
        A032.A00 = new C43251u5(r5.A02, set, r5.A01, r5.A04);
        return A032;
    }

    public C43201u0(Set set, C43221u2 r4, Map map, AnonymousClass0C1 r6, String str) {
        this.A03 = set;
        this.A01 = r4;
        this.A06 = map;
        this.A02 = r6;
        this.A05 = str;
        this.A04 = (AnonymousClass12K) r6.AV9(AnonymousClass12K.class);
    }

    public final void A01() {
        if (C252117x.A02().A07() || C252117x.A02().A06() || !((Boolean) AnonymousClass0L6.A02(this.A02, AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH, "user_reel_persist_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C12810hQ.A02(A00(this, this.A03));
            return;
        }
        AnonymousClass2C6 r2 = new AnonymousClass2C6(this);
        AnonymousClass0C1 r3 = this.A02;
        UserReelMediasStore.A03(new AnonymousClass2C9(r3, this.A03, new AnonymousClass2C8(this, r2)), r3, 0);
    }
}
