package p000X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.insights.fragment.AccountInsightsNativeFragment;
import java.security.InvalidParameterException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* renamed from: X.1iv  reason: invalid class name and case insensitive filesystem */
public final class C36981iv {
    public static String A02(int i, Date date, SimpleDateFormat simpleDateFormat, NumberFormat numberFormat) {
        StringBuilder sb = new StringBuilder();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(5, -14);
        Date time = instance.getTime();
        instance.add(5, 6);
        Date time2 = instance.getTime();
        if (i >= 0) {
            sb.append("+");
        }
        sb.append(numberFormat.format((long) i));
        sb.append(" vs. ");
        sb.append(simpleDateFormat.format(time));
        sb.append(" - ");
        sb.append(simpleDateFormat.format(time2));
        return sb.toString();
    }

    public static boolean A03(AnonymousClass0C1 r4) {
        C13300iJ r2 = r4.A06;
        if (r2.A1b == Constants.A0C) {
            C468621e r0 = C468621e.ONBOARDED;
            C468621e r1 = r2.A09;
            if ((r0.equals(r1) || C468621e.IN_GRACEFUL_REVIEW.equals(r1)) && ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.ACCOUNT_INSIGHTS_SHOPPING_CONTENT, "show_partner_content", false, (AnonymousClass04H) null)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean A04(AnonymousClass0C1 r2, AnonymousClass1NJ r3) {
        if ((!r2.A06.equals(r3.A0c(r2)) || !r3.A0c(r2).A0S()) && !r3.A3I) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r4.A0c(r3).A0Q() == false) goto L_0x001c;
     */
    public static boolean A05(AnonymousClass0C1 r3, AnonymousClass1NJ r4, C17070pd r5) {
        boolean z;
        if (r5 != C17070pd.PROMOTION_PREVIEW) {
            if (r3.A06.equals(r4.A0c(r3))) {
                z = true;
            }
            z = false;
            if ((z || A04(r3, r4)) && ((!r4.Aho() || r4.A1V()) && !AnonymousClass1YR.Clips.equals(r4.A0t))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r6, p000X.AnonymousClass0L7.ACCOUNT_INSIGHTS_REDESIGN_BETA, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    public static boolean A06(AnonymousClass0C1 r6, C13300iJ r7, FragmentActivity fragmentActivity, AnonymousClass0RN r9, boolean z) {
        boolean z2;
        boolean z3;
        Boolean bool = r7.A1U;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            z2 = true;
        }
        z2 = false;
        if (z2) {
            AnonymousClass4MN r1 = new AnonymousClass4MN();
            C52362Om r0 = new C52362Om(fragmentActivity, r6);
            r0.A02 = r1;
            if (z) {
                r0.A08 = false;
            }
            r0.A02();
            return false;
        }
        AnonymousClass00B.A01.markerStart(39124996);
        if (!((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.ACCOUNT_INSIGHTS_REDESIGN_MVP, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            z3 = false;
        }
        z3 = true;
        if (z3) {
            AnonymousClass00B.A01.markerAnnotate(39124996, "insights_type", "redesign");
            if (((Boolean) C05680Ln.AIR.A01(r6)).booleanValue()) {
                C52362Om r2 = new C52362Om(fragmentActivity, r6);
                C139165x9 r12 = new C139165x9(r6);
                r12.A03("com.instagram.insights.account.summary.screen");
                r12.A04(fragmentActivity.getString(C0003R.string.insights));
                r12.A00.A0N = false;
                r2.A02 = r12.A02();
                if (z) {
                    r2.A08 = false;
                }
                r2.A02();
                return true;
            }
            AnonymousClass4MC r22 = new AnonymousClass4MC(r6, fragmentActivity, r9);
            C53562Th A00 = C53572Ti.A00(r6, "com.instagram.insights.account.summary", (Map) null);
            A00.A00 = new AnonymousClass4ZA(r22, fragmentActivity);
            C12810hQ.A02(A00);
            return true;
        }
        AnonymousClass00B.A01.markerAnnotate(39124996, "insights_type", "old");
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r6.getToken());
        C52362Om r13 = new C52362Om(fragmentActivity, r6);
        AccountInsightsNativeFragment accountInsightsNativeFragment = new AccountInsightsNativeFragment();
        accountInsightsNativeFragment.setArguments(bundle);
        r13.A02 = accountInsightsNativeFragment;
        r13.A06 = "AccountInsights";
        if (z) {
            r13.A08 = false;
        }
        r13.A02();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    public static boolean A07(C13300iJ r2) {
        boolean z;
        Boolean bool = r2.A1U;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            z = true;
        }
        z = false;
        if (!z || C05760Lv.A01.A00.getBoolean("has_seen_top_account_insights_dialog", false)) {
            return false;
        }
        return true;
    }

    public static int A00(C26808Bst bst, C27328C8z c8z) {
        switch (bst.ordinal()) {
            case 0:
                return c8z.A01;
            case 1:
                return c8z.A02;
            case 2:
                return c8z.A03;
            case 4:
                return c8z.A04;
            case 5:
                return c8z.A06;
            case 6:
                return c8z.A05;
            case 7:
                return c8z.A07;
            case 8:
                return c8z.A09;
            case 9:
                return c8z.A0A;
            case 10:
                return c8z.A0B;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return c8z.A0C;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return c8z.A0E;
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return c8z.A0F;
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return c8z.A0G;
            case 15:
                return c8z.A0H;
            case 16:
                return c8z.A0I;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return c8z.A0J;
            case 18:
                return c8z.A0K;
            case 19:
                return c8z.A0D;
            case 20:
                return c8z.A00;
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                return c8z.A08;
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                return c8z.A0L;
            case 23:
                return c8z.A0M;
            default:
                throw new InvalidParameterException(AnonymousClass000.A0J("InsightsDataOrdering [", bst.name(), "] not implemented"));
        }
    }

    public static String A01(int i) {
        return NumberFormat.getInstance(C15300mf.A03()).format((long) i);
    }
}
