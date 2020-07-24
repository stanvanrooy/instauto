package p000X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.feed.media.EffectPreview;
import java.util.List;

/* renamed from: X.1ey  reason: invalid class name and case insensitive filesystem */
public final class C34581ey {
    public static int A00 = -1;

    public static void A04(Activity activity, float f, int i) {
        boolean z = false;
        int A08 = AnonymousClass0OW.A08(-16777216, 0, f);
        AnonymousClass1X4.A02(activity, Color.argb((Color.alpha(A08) * Color.alpha(i)) / 255, (Color.red(A08) * Color.red(i)) / 255, (Color.green(A08) * Color.green(i)) / 255, (Color.blue(A08) * Color.blue(i)) / 255));
        if (((double) f) > 0.6d) {
            z = true;
        }
        AnonymousClass1X4.A03(activity, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (p000X.AnonymousClass1OY.ACTIVITY_FEED.equals(r7) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (A09(r5) == false) goto L_0x0011;
     */
    public static boolean A0B(C39941no r5, AnonymousClass0C1 r6, AnonymousClass1OY r7) {
        boolean z;
        boolean z2;
        if (r5 != null) {
            if (r5.A0t()) {
                z = true;
            }
            z = false;
            boolean A0x = r5.A0x();
            if (z || A0x) {
                boolean z3 = !AnonymousClass17M.A00(r5.A0D, r6.A06);
                if (!AnonymousClass1OY.PUSH_NOTIFICATION.equals(r7)) {
                    z2 = false;
                }
                z2 = true;
                if (z3 || z2 || r5.A0v()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static AnonymousClass1UP A01(C39941no r1, Context context) {
        List list;
        switch (r1.A0E.intValue()) {
            case 0:
                AnonymousClass2Ay r12 = r1.A0A;
                AnonymousClass0a4.A06(r12);
                List ATk = r12.ATk();
                if (!AnonymousClass0OX.A00(ATk)) {
                    list = ((C43531uZ) ATk.get(0)).A09;
                } else {
                    list = null;
                }
                if (list != null) {
                    return (AnonymousClass1UP) list.get(0);
                }
                return null;
            case 1:
                AnonymousClass1NJ r13 = r1.A08;
                AnonymousClass0a4.A07(r13, "Reel item is of MEDIA type but doesn't have a media!");
                return C37201jH.A01(r13.A16(), context);
            default:
                return null;
        }
    }

    public static Integer A03(AnonymousClass0C1 r4) {
        AnonymousClass0L7 r3 = AnonymousClass0L7.STORY_NEW_CTA_BUTTON;
        if (((Boolean) AnonymousClass0L6.A02(r4, r3, "is_center_align_small_button_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return Constants.ONE;
        }
        if (((Boolean) AnonymousClass0L6.A02(r4, r3, "is_full_width_button_with_overflow_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return Constants.A0C;
        }
        return Constants.ZERO;
    }

    public static void A05(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
            view.animate().cancel();
            view.setAlpha(1.0f);
            return;
        }
        view.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setDuration(200).start();
    }

    public static boolean A07(C39941no r2) {
        AnonymousClass1NJ r0;
        if (r2.A0E != Constants.ONE || (r0 = r2.A08) == null || !r0.A3I) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r2 == p000X.Constants.A0u) goto L_0x001f;
     */
    public static boolean A08(C39941no r2) {
        boolean z;
        if (r2 == null) {
            return false;
        }
        if (r2.A0t() || r2.A0k() || r2.A0o()) {
            return true;
        }
        Integer num = r2.A0E;
        if (num != Constants.A0j) {
            z = false;
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r0 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r1 != false) goto L_0x0015;
     */
    public static boolean A0C(C50282Fr r0, C39941no r1) {
        boolean z;
        boolean z2;
        if (r0.A0A.A0m) {
            AnonymousClass1NJ r02 = r1.A08;
            if (r02 != null) {
                Boolean bool = r02.A14;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z2 = false;
                }
                z2 = true;
                z = false;
            }
            z = true;
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static int A00(Context context) {
        return (C06220Of.A06(context) - C27141Gq.A00) - AnonymousClass0PB.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        if (r1 != false) goto L_0x0096;
     */
    public static CharSequence A02(C39941no r4, Context context) {
        boolean z;
        int i;
        AnonymousClass1NJ r0;
        String str;
        EffectPreview effectPreview;
        if (r4.A0b()) {
            i = C0003R.string.igtv_cta_text;
        } else if (A07(r4)) {
            i = C0003R.string.view_insights;
        } else if (r4.A0i()) {
            i = C0003R.string.profile_shop_cta_text;
        } else if (r4.A0d()) {
            i = C0003R.string.instagram_shop_cta_text;
        } else if (r4.A0g()) {
            i = C0003R.string.product_collection_cta_text;
        } else if (r4.A0h()) {
            i = C0003R.string.product_details_page_cta_text;
        } else if (r4.A0Z()) {
            C43531uZ A08 = r4.A08();
            if (A08 == null || (effectPreview = A08.A01) == null) {
                str = null;
            } else {
                str = effectPreview.A05;
            }
            if (str != null) {
                return C46031z1.A01(context.getResources(), C0003R.string.ar_effect_cta_text_with_name, str);
            }
            i = C0003R.string.ar_effect_cta_text;
        } else if (r4.A0x()) {
            switch (r4.A0E.intValue()) {
                case 1:
                    AnonymousClass0a4.A07(r4.A0B, "Netego ad4ad unit needs to have an Ad4ad object");
                    return r4.A0B.A00;
                case 5:
                    AnonymousClass0a4.A07(r4.A0C, "Netego bakeoff unit needs to have a SimpleAction");
                    return r4.A0C.A01;
                case 6:
                    AnonymousClass0a4.A07(r4.A01, "Netego SU unit needs to have an SU object");
                    return r4.A01.A01;
                default:
                    throw new UnsupportedOperationException("Reel item isn't a netego unit with an action");
            }
        } else {
            if (r4.A0E == Constants.ONE && (r0 = r4.A08) != null) {
                boolean isEmpty = TextUtils.isEmpty(r0.A22);
                z = true;
            }
            z = false;
            if (z) {
                return r4.A08.A22;
            }
            i = C0003R.string.see_more;
        }
        return context.getString(i);
    }

    public static void A06(TextView textView, Drawable drawable) {
        if (C06400Ox.A02(textView.getContext())) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public static boolean A09(C39941no r1) {
        if (A0A(r1) || A07(r1)) {
            return true;
        }
        return false;
    }

    public static boolean A0A(C39941no r1) {
        if (r1.A0b() || r1.A0i() || r1.A0d() || r1.A0g() || r1.A0h() || r1.A0Z() || r1.A0e()) {
            return true;
        }
        return false;
    }

    public static boolean A0D(AnonymousClass0C1 r2) {
        if (A03(r2) != Constants.ZERO) {
            return true;
        }
        return false;
    }
}
