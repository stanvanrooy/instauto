package p000X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.1k9  reason: invalid class name and case insensitive filesystem */
public final class C37741k9 {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r4 == false) goto L_0x0019;
     */
    public static Layout A00(instagramComment r21, int i, AnonymousClass1PB r23, Context context, C29191Oy r25, C17070pd r26) {
        boolean z;
        boolean booleanValue;
        String str;
        Boolean bool = null;
        instagramComment r10 = r21;
        Integer num = r10.A0K;
        Integer num2 = Constants.ONE;
        boolean z2 = false;
        if (num == num2) {
            boolean z3 = true;
            if (((i >> 1) & 1) != 1) {
                z3 = false;
            }
            z = true;
        }
        z = false;
        boolean z4 = true;
        if (((i >> 2) & 1) != 1) {
            z4 = false;
        }
        boolean z5 = true;
        if ((i & 1) != 1) {
            z5 = false;
        }
        if (num == num2 && z5) {
            z2 = true;
        }
        if (z2) {
            bool = false;
        }
        if (bool == null) {
            booleanValue = false;
            if (!r10.A0g) {
                booleanValue = true;
            }
        } else {
            booleanValue = bool.booleanValue();
        }
        AnonymousClass1PB r15 = r23;
        Context context2 = context;
        CharSequence generateSingleCommentText = generateSingleCommentText(context2, r25, new C37751kA(r10, false, z, booleanValue, z4, r15, r26, false, false, (Integer) null, (Integer) null));
        try {
            TextPaint textPaint = r15.A04;
            return new StaticLayout(generateSingleCommentText, textPaint, r15.A02, Layout.Alignment.ALIGN_NORMAL, r15.A01, r15.A00, r15.A05);
        } catch (ArrayIndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder("OutOfBounds when creating new StaticLayout for mComment text: ");
            sb.append(r10.commentText);
            sb.append("generated mComment text:");
            sb.append(generateSingleCommentText);
            sb.append(", mComment type: ");
            if (1 - r10.A0K.intValue() != 0) {
                str = ReactProgressBarViewManager.DEFAULT_STYLE;
            } else {
                str = "Caption";
            }
            sb.append(str);
            sb.append(", media surface: ");
            sb.append(r26.name());
            sb.append(", mShouldExpand: ");
            sb.append(z);
            sb.append(", mForceHideUsername: ");
            sb.append(z2);
            sb.append(", showVerfifiedBadge: ");
            sb.append(false);
            sb.append(", mShowTranslatedText: ");
            sb.append(z4);
            sb.append(", isRTL: ");
            sb.append(C06400Ox.A02(context2));
            AnonymousClass0QD.A03("MediaRenderer OutOfBounds", sb.toString(), 1);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    public static CharSequence generateSingleCommentText(Context context, C29191Oy r8, C37751kA r9) {
        StringBuilder sb;
        String str;
        boolean A06;
        SpannableStringBuilder A00;
        CharSequence A01;
        int A002;
        int A003;
        if (!r9.A01) {
            boolean A02 = C06400Ox.A02(context);
            if (!A02) {
                sb = new StringBuilder();
            }
            if (r9.A08) {
                if (!TextUtils.isEmpty((String) r8.A02.get(r9.A03.AS8()))) {
                    str = (String) r8.A02.get(r9.A03.AS8());
                    sb.append(str);
                    String string = context.getResources().getString(C0003R.string.caption_ellipsis_more);
                    if (A02) {
                        string = AnonymousClass000.A0E("‏", string);
                    }
                    instagramComment r5 = r9.A03;
                    A06 = r5.A06();
                    if (!A06) {
                        string = " [...]";
                    }
                    int AP2 = r8.A00.AP2(r9.A04, r5);
                    if (!A06 || r9.A09) {
                        A00 = C29191Oy.A00(context, r8.A04, r5, r9.A0A, AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink));
                    } else {
                        A00 = new SpannableStringBuilder();
                    }
                    A01 = C37811kG.A01(A00, sb, string, AP2, r9.A02);
                    if (!A01.toString().equals(sb.toString())) {
                        return r8.A04(context, r9);
                    }
                    int length = A00.length();
                    A00.append(C29191Oy.A01(r8, context, r9.A03, new SpannableStringBuilder(A01.toString()), r9.A06));
                    A00.setSpan(new C39301mg(r8, r9), length, A00.length(), 33);
                    int length2 = A00.length();
                    A00.append(string);
                    boolean z = r9.A07;
                    Integer num = r9.A05;
                    if (num != null) {
                        A002 = num.intValue();
                    } else {
                        A002 = C019000b.A00(context, C0003R.color.igds_secondary_text);
                    }
                    A00.setSpan(new C39311mh(r8, z, A002, r9), length2, A00.length(), 33);
                    return A00;
                }
            }
            str = r9.A03.commentText;
            sb.append(str);
            String string2 = context.getResources().getString(C0003R.string.caption_ellipsis_more);
            if (A02) {
            }
            instagramComment r52 = r9.A03;
            A06 = r52.A06();
            if (!A06) {
            }
            int AP22 = r8.A00.AP2(r9.A04, r52);
            if (!A06 || r9.A09) {
            }
            A01 = C37811kG.A01(A00, sb, string2, AP22, r9.A02);
            if (!A01.toString().equals(sb.toString())) {
            }
        } else if (!r9.A00) {
            return r8.A04(context, r9);
        } else {
            String A03 = C29191Oy.A03(context, r9);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) r8.A01.get(A03);
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            String string3 = context.getResources().getString(C0003R.string.caption_ellipsis_less);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r8.A05(context, r9));
            int length3 = spannableStringBuilder2.length();
            spannableStringBuilder2.append(" ");
            spannableStringBuilder2.append(string3);
            boolean z2 = r9.A07;
            Integer num2 = r9.A05;
            if (num2 != null) {
                A003 = num2.intValue();
            } else {
                A003 = C019000b.A00(context, C0003R.color.igds_secondary_text);
            }
            spannableStringBuilder2.setSpan(new C151636e2(r8, z2, A003, r9), length3, spannableStringBuilder2.length(), 33);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
            r8.A01.put(A03, spannableStringBuilder3);
            return spannableStringBuilder3;
        }
    }
}
