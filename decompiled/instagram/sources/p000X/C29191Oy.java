package p000X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.LruCache;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.util.List;

/* renamed from: X.1Oy  reason: invalid class name and case insensitive filesystem */
public final class C29191Oy implements C06570Po {
    public AnonymousClass1P1 A00 = new AnonymousClass1P0(this);
    public final LruCache A01 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A02 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final C23300zv A03;
    public final AnonymousClass0C1 A04;
    public final LruCache A05 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);

    public static String A03(Context context, C37751kA r7) {
        String A052 = C06360Ot.formatString("%s%d%d%b%b%b", r7.A03.AS8(), Integer.valueOf(AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink)), Integer.valueOf(AnonymousClass1BA.A01(context, C0003R.attr.textColorRegularLink)), Boolean.valueOf(r7.A0A), Boolean.valueOf(r7.A08), Boolean.valueOf(r7.A00));
        Integer num = r7.A06;
        if (num != null) {
            A052 = String.format("%s%d", new Object[]{A052, num});
        }
        if (r7.A03.A0K != Constants.ONE) {
            return A052;
        }
        return String.format("%s%b", new Object[]{A052, Boolean.valueOf(r7.A09)});
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static SpannableStringBuilder A01(C29191Oy r5, Context context, instagramComment r7, SpannableStringBuilder spannableStringBuilder, Integer num) {
        AnonymousClass0C1 r2 = r5.A04;
        C38931m5 r4 = new C38931m5(r2, spannableStringBuilder);
        r4.A02(new C38941m6(r2, r7.A0C));
        r4.A01(new C38961m8(r5.A04, r7.A0C, r7.A06()));
        C38981mA r1 = new C38981mA(r5, r7);
        List A042 = r7.A04();
        r4.A05 = context;
        r4.A08 = r1;
        r4.A0D = A042;
        r4.A0K = true;
        if (num != null) {
            int intValue = num.intValue();
            r4.A03 = intValue;
            r4.A02 = intValue;
            r4.A01 = intValue;
        }
        return r4.A00();
    }

    public static C29191Oy A02(AnonymousClass0C1 r2) {
        return (C29191Oy) r2.AVA(C29191Oy.class, new C29201Oz(r2));
    }

    public static C29191Oy getTestInstance(AnonymousClass0C1 r1) {
        return new C29191Oy(r1);
    }

    public final void A06(String str) {
        for (String str2 : this.A05.snapshot().keySet()) {
            if (str2.startsWith(str)) {
                this.A05.remove(str2);
            }
        }
        for (String str3 : this.A01.snapshot().keySet()) {
            if (str3.startsWith(str)) {
                this.A01.remove(str3);
            }
        }
    }

    public C29191Oy(AnonymousClass0C1 r3) {
        this.A04 = r3;
        this.A03 = C23300zv.A00(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        if (r0.A0H == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ea, code lost:
        if (r0.A0H == false) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    public static SpannableStringBuilder A00(Context context, AnonymousClass0C1 r12, instagramComment r13, boolean z, int i) {
        String AZn;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        C13300iJ AZf = r13.AZf();
        if (AZf == null) {
            return new SpannableStringBuilder();
        }
        AnonymousClass1NJ r2 = r13.A0C;
        AnonymousClass1NJ r8 = r2;
        boolean A022 = C06400Ox.A02(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!AZf.A0r()) {
            if (r2 != null) {
                C36331hs A012 = AnonymousClass11C.A00(r12).A01(r2);
                if (A012 != null) {
                    z2 = A012.A0N;
                } else {
                    C30141Sr r0 = r2.A0d;
                    if (r0 != null) {
                        z2 = true;
                    }
                    z2 = false;
                }
                if (z2 && !TextUtils.isEmpty(C30671Ut.A03(r12, r2)) && r2.A0c(r12) == AZf) {
                    AZn = C30671Ut.A03(r12, r2);
                    if (!A022) {
                        str = "‏‮";
                    } else {
                        str = "";
                    }
                    spannableStringBuilder.append(str);
                    if (!A022) {
                        StringBuilder sb = new StringBuilder(AZn);
                        sb.reverse();
                        str2 = sb.toString();
                    } else {
                        str2 = AZn;
                    }
                    spannableStringBuilder.append(str2);
                    C37761kB r22 = new C37761kB(r12, AZf, r8, i);
                    int length = str.length();
                    spannableStringBuilder.setSpan(r22, length, AZn.length() + length, 33);
                    spannableStringBuilder.append(" ");
                    if (z && AZf.A0s()) {
                        C466820l.A04(context, spannableStringBuilder, true, false);
                        spannableStringBuilder.append(" ");
                    }
                    if (A022) {
                        spannableStringBuilder.append("‬");
                        return spannableStringBuilder;
                    }
                }
            }
            AZn = AZf.AZn();
            if (!A022) {
            }
            spannableStringBuilder.append(str);
            if (!A022) {
            }
            spannableStringBuilder.append(str2);
            C37761kB r222 = new C37761kB(r12, AZf, r8, i);
            int length2 = str.length();
            spannableStringBuilder.setSpan(r222, length2, AZn.length() + length2, 33);
            spannableStringBuilder.append(" ");
            C466820l.A04(context, spannableStringBuilder, true, false);
            spannableStringBuilder.append(" ");
            if (A022) {
            }
        } else if (r2 != null) {
            C36331hs A013 = AnonymousClass11C.A00(r12).A01(r2);
            if (A013 != null) {
                z3 = A013.A0N;
            } else {
                C30141Sr r02 = r2.A0d;
                if (r02 != null) {
                    z3 = true;
                }
                z3 = false;
            }
            if (z3 && !TextUtils.isEmpty(C30671Ut.A03(r12, r2)) && r2.A0c(r12) == AZf) {
                spannableStringBuilder.append(C30671Ut.A03(r12, r2)).append(" ");
                spannableStringBuilder.setSpan(new C38311l4(), 0, C30671Ut.A03(r12, r2).length(), 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, C30671Ut.A03(r12, r2).length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder A04(Context context, C37751kA r8) {
        String A032 = A03(context, r8);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.A01.get(A032);
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder(A05(context, r8));
            instagramComment r1 = r8.A03;
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.setSpan(new C39461mx(this, r1), 0, spannableStringBuilder.length(), 33);
            }
            this.A01.put(A032, spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f  */
    public final SpannableStringBuilder A05(Context context, C37751kA r8) {
        String str;
        boolean A022 = C06400Ox.A02(context);
        String A032 = A03(context, r8);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.A05.get(A032);
        if (spannableStringBuilder == null) {
            if (r8.A09) {
                spannableStringBuilder = A00(context, this.A04, r8.A03, r8.A0A, AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink));
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (r8.A08) {
                if (!TextUtils.isEmpty((String) this.A02.get(r8.A03.AS8()))) {
                    str = (String) this.A02.get(r8.A03.AS8());
                    if (str != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        if (A022) {
                            spannableStringBuilder2.append("‏‪");
                        }
                        spannableStringBuilder2.append(str);
                        spannableStringBuilder.append(A01(this, context, r8.A03, spannableStringBuilder2, r8.A06));
                    }
                    this.A05.put(A032, spannableStringBuilder);
                }
            }
            str = r8.A03.commentText;
            if (str != null) {
            }
            this.A05.put(A032, spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public void setLineCountProvider(AnonymousClass1P1 r1) {
        this.A00 = r1;
    }
}
