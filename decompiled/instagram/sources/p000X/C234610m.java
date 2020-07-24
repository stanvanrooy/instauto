package p000X;

import com.instagram.notifications.badging.impl.InMemoryBadgingRepository$getBadges$1;
import java.util.Map;

/* renamed from: X.10m  reason: invalid class name and case insensitive filesystem */
public final class C234610m {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass107 A02;
    public final C234410k A03;
    public final Map A04;
    public final AnonymousClass101 A05;

    public C234610m(AnonymousClass107 r2, C234410k r3, Map map, AnonymousClass101 r5) {
        C13150hy.A02(r2, "useCaseGraph");
        C13150hy.A02(r3, "badgingApi");
        C13150hy.A02(map, "badgeSourceMap");
        C13150hy.A02(r5, "coroutineScope");
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = map;
        this.A05 = r5;
    }

    public final AnonymousClass10W A00(AnonymousClass108 r4) {
        AnonymousClass10W r2;
        C13150hy.A02(r4, "useCase");
        AnonymousClass107 r0 = this.A02;
        C13150hy.A02(r4, "useCase");
        AnonymousClass109 r02 = (AnonymousClass109) r0.A00.get(r4);
        if (r02 != null) {
            r2 = r02.A02;
        } else {
            r2 = null;
        }
        if (r2 != null) {
            return new C52562Ph(r2, new InMemoryBadgingRepository$getBadges$1(this, (C233910f) null));
        }
        return BD5.A00;
    }
}
