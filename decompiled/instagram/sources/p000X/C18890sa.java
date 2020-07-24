package p000X;

import android.content.Context;

/* renamed from: X.0sa  reason: invalid class name and case insensitive filesystem */
public final class C18890sa extends C18900sb {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007f, code lost:
        if ((r7 - r4) < java.util.concurrent.TimeUnit.DAYS.toMillis((long) ((java.lang.Integer) p000X.AnonymousClass0L6.A02(r10, r3, "cool_down_interval_day", 14, (p000X.AnonymousClass04H) null)).intValue())) goto L_0x0081;
     */
    public final void A00(AnonymousClass0C1 r10, Context context) {
        boolean z;
        if (Constants.ONE == r10.A06.A1b && C42251s2.A04(r10) && C25804BaD.A00(r10).A02 && ((Boolean) AnonymousClass0L6.A02(r10, AnonymousClass0L7.FEED_XPOSTING_PRIVACY_ONLY_ME_FIX, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = C16180oA.A00(r10).A00.getInt("fb_feed_crossposting_only_me_privacy_prompt_times_shown", 0);
            long j = C16180oA.A00(r10).A00.getLong("fb_feed_crossposting_only_me_privacy_prompt_time_stamp_ms", 0);
            AnonymousClass0L7 r3 = AnonymousClass0L7.FEED_XPOSTING_PRIVACY_ONLY_ME_FIX;
            if (i < ((Integer) AnonymousClass0L6.A02(r10, r3, "cool_down_max_time", 3, (AnonymousClass04H) null)).intValue()) {
                z = true;
            }
            z = false;
            if (z) {
                C25803BaC baC = new C25803BaC();
                AnonymousClass2TH r1 = new AnonymousClass2TH(r10);
                r1.A0T = false;
                r1.A0F = baC;
                r1.A00().A06(context, baC);
            }
        }
    }

    public final void A01(AnonymousClass0C1 r7, AnonymousClass0RN r8) {
        C25804BaD A00 = C25804BaD.A00(r7);
        Integer num = Constants.ONE;
        AnonymousClass0C1 r1 = A00.A00;
        if (num == r1.A06.A1b && C42251s2.A04(r1) && ((Boolean) AnonymousClass0L6.A02(A00.A00, AnonymousClass0L7.FEED_XPOSTING_PRIVACY_ONLY_ME_FIX, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C15890nh r2 = new C15890nh(A00.A00);
            r2.A0C = "ig_fb_xposting/fb_feed/privacy_setting/only_me_check/";
            r2.A09 = Constants.A0N;
            r2.A06(C23645AWi.class, false);
            C17850qu A03 = r2.A03();
            A03.A00 = new C25796Ba5(A00, r8);
            C12810hQ.A02(A03);
        }
    }

    public final void A02(String str, AnonymousClass0C1 r3) {
        C25804BaD.A00(r3).A01 = str;
    }
}
