package p000X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1hm  reason: invalid class name and case insensitive filesystem */
public final class C36271hm extends C27591Il {
    public int A00 = -1;
    public boolean A01 = false;
    public final AnonymousClass1PE A02;
    public final C29541Qh A03;
    public final AnonymousClass1I6 A04;
    public final AnonymousClass22L A05 = new AnonymousClass22K(this);
    public final AnonymousClass1LV A06;
    public final AnonymousClass0C1 A07;

    public C36271hm(AnonymousClass0C1 r2, AnonymousClass1I6 r3, AnonymousClass1PE r4, C29541Qh r5, AnonymousClass1LV r6) {
        this.A07 = r2;
        this.A04 = r3;
        this.A06 = r6;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final void A09(C255119b r13, int i, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        int A032 = AnonymousClass0Z0.A03(-659613257);
        int i7 = i3;
        if (i7 < 4) {
            i6 = 275953993;
        } else {
            boolean z2 = false;
            if (i + i2 + 4 >= i7) {
                z2 = true;
            }
            if (z2 && this.A00 != i7) {
                this.A00 = i7;
                Iterator it = this.A02.A0T.A01.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AnonymousClass1NG) it.next()).A0H == C29261Pf.END_OF_FEED_DEMARCATOR) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z || ((Boolean) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.HOME_FLASH_FEED, "deliver_seen_items", false, (AnonymousClass04H) null)).booleanValue()) {
                    System.currentTimeMillis();
                    this.A01 = z;
                    AnonymousClass1LV r6 = this.A06;
                    AnonymousClass22L r8 = this.A05;
                    List A0N = this.A02.A0N();
                    C472022q r10 = new C472022q(((Integer) AnonymousClass0L6.A02(this.A07, AnonymousClass0L7.HOME_FLASH_FEED, "freshness_window_max_minutes_before_now", 1440, (AnonymousClass04H) null)).intValue(), 0);
                    C28371Ll r62 = r6.A0A;
                    r62.A00.ADc(new C472122r(r62, A0N, r8, z, r10, 1));
                }
            }
            i6 = 595009572;
        }
        AnonymousClass0Z0.A0A(i6, A032);
    }
}
