package p000X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.1qH  reason: invalid class name and case insensitive filesystem */
public final class C41421qH extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r2 == 3) goto L_0x001f;
     */
    public final void A00() {
        boolean z;
        C37531jo r5 = this.A00;
        int intValue = ((Integer) AnonymousClass0L6.A02(r5.A07, AnonymousClass0L7.EMOJI_UTIL_UNIVERSE_3, "emoji_infra_state", 0, (AnonymousClass04H) null)).intValue();
        if (intValue != 2) {
            z = false;
        }
        z = true;
        if (z) {
            AnonymousClass0C1 r7 = r5.A07;
            Context context = r5.A06;
            boolean z2 = false;
            if (intValue == 2) {
                z2 = true;
            }
            AnonymousClass2FK.A01 = System.currentTimeMillis();
            BLq A002 = AnonymousClass0N3.A00();
            C25488BMy bMy = new C25488BMy(context, A002);
            bMy.A01 = z2;
            C196608b9 r2 = new C196608b9(r7, z2);
            AnonymousClass11J.A01(r2, "initCallback cannot be null");
            if (bMy.A00 == null) {
                bMy.A00 = new AnonymousClass003();
            }
            bMy.A00.add(r2);
            if (C196548b3.A08 == null) {
                synchronized (C196548b3.A07) {
                    if (C196548b3.A08 == null) {
                        C196548b3.A08 = new C196548b3(bMy);
                    }
                }
            }
            AnonymousClass0ZA.A0E(new Handler(C15740nS.A00()), new C25484BMu(context.getApplicationContext(), A002, new Handler(), new BN9()), 1126082366);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41421qH(C37531jo r3) {
        super("startEmojiCompatFontDownload", 401);
        this.A00 = r3;
    }
}
