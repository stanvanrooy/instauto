package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.0xx  reason: invalid class name and case insensitive filesystem */
public final class C22170xx extends C22180xy {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r8, p000X.AnonymousClass0L7.COMMENT_WARNING_NON_ENGLISH, "is_enabled", false, p000X.AnonymousClass0LY.A01)).booleanValue() != false) goto L_0x0041;
     */
    public final boolean A03(AnonymousClass0C1 r8, boolean z) {
        boolean z2;
        if (!z || ((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.DELAYED_COMMENTS, "is_comment_warning_enabled_ads", false, (AnonymousClass04H) null)).booleanValue()) {
            if (!((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.DELAYED_COMMENTS, "is_comment_warning_enabled_detail", false, (AnonymousClass04H) null)).booleanValue()) {
                z2 = false;
            }
            z2 = true;
            if (z2) {
                boolean z3 = false;
                if (System.currentTimeMillis() / 1000 < C16180oA.A00(r8).A00.getLong("comment_warning_earliest_next_request_time", 0)) {
                    z3 = true;
                }
                if (!z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int A00(AnonymousClass0C1 r5) {
        double d;
        Object A02;
        if (((Boolean) AnonymousClass0L6.A03(r5, AnonymousClass0L7.DELAYED_COMMENTS, "is_comment_warning_enabled_detail", false, (AnonymousClass04H) null)).booleanValue()) {
            A02 = AnonymousClass0L6.A02(r5, AnonymousClass0L7.DELAYED_COMMENTS, "comment_warning_in_seconds", Double.valueOf(0.0d), (AnonymousClass04H) null);
        } else if (((Boolean) AnonymousClass0L6.A03(r5, AnonymousClass0L7.COMMENT_WARNING_NON_ENGLISH, "is_enabled", false, AnonymousClass0LY.A01)).booleanValue()) {
            A02 = AnonymousClass0L6.A02(r5, AnonymousClass0L7.COMMENT_WARNING_NON_ENGLISH, "warning_time_seconds", Double.valueOf(0.0d), AnonymousClass0LY.A01);
        } else {
            d = 0.0d;
            return (int) (d * 1000.0d);
        }
        d = ((Double) A02).doubleValue();
        return (int) (d * 1000.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1 == false) goto L_0x0027;
     */
    public final String A01(Context context, AnonymousClass0C1 r6) {
        int i;
        AnonymousClass0L7 r3 = AnonymousClass0L7.DELAYED_COMMENTS;
        if (((Boolean) AnonymousClass0L6.A03(r6, r3, "is_comment_warning_enabled_detail", false, (AnonymousClass04H) null)).booleanValue()) {
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r6, r3, "comment_warning_new_copy", false, (AnonymousClass04H) null)).booleanValue();
            i = C0003R.string.comment_offensive_alert_message_new_copy;
        }
        i = C0003R.string.comment_offensive_alert_message;
        return context.getString(i);
    }

    public final void A02(AnonymousClass0C1 r5, C157986ot r6) {
        long j;
        Long l = r6.A05;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        C16180oA.A00(r5).A00.edit().putLong("comment_warning_earliest_next_request_time", j).apply();
    }
}
