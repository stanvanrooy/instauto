package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1mk  reason: invalid class name and case insensitive filesystem */
public final class C39331mk {
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0209, code lost:
        if (r1 != false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024d, code lost:
        if (r1 != false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0280, code lost:
        if ((r5 - r6.size()) > 1) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0290, code lost:
        if (r1 != false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02bd, code lost:
        if (r3 != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (p000X.C468221a.A00() == p000X.Constants.A0N) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r11 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f8, code lost:
        if (r14.A09() > 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r14.A17().isEmpty() != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bf, code lost:
        if (r9.intValue() <= 0) goto L_0x01c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017b  */
    public static CharSequence A00(Context context, AnonymousClass0C1 r16, AnonymousClass1NJ r17) {
        boolean z;
        C38931m5 r1;
        C38961m8 r0;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Integer num;
        int intValue;
        Spanned A00;
        int intValue2;
        AnonymousClass1NJ r14 = r17;
        if (r14.A09() == 0) {
            AnonymousClass0QD.A01("MediaLikersTextRenderer", AnonymousClass000.A0E("generateLikersText() called with 0 likes, media id ", r14.getId()));
            return "";
        }
        if (r14.A17() != null) {
            z = true;
        }
        z = false;
        ArrayList<String> arrayList = new ArrayList<>();
        AnonymousClass0C1 r13 = r16;
        Context context2 = context;
        if (C36461i5.A00(r13).A02(r14.A0N())) {
            boolean A08 = C36451i4.A08(r14, z, r13);
            if (A08) {
                arrayList.add(r13.A06.AZn());
                if (z) {
                }
                if (!r14.Aho()) {
                    AnonymousClass1OU A0N = r14.A0N();
                    Resources resources = context.getResources();
                    if (!C36451i4.A03(r14, r13)) {
                        z6 = false;
                    }
                    z6 = true;
                    AnonymousClass0a4.A09(z6);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    List singletonList = Collections.singletonList(AnonymousClass000.A0E("@", r13.A06.AZn()));
                    int[] iArr = AnonymousClass263.A00;
                    C36461i5 A002 = C36461i5.A00(r13);
                    if (A0N.A02 || !A002.A00) {
                        num = A0N.A00;
                    } else {
                        num = Constants.A0N;
                    }
                    int i = iArr[num.intValue()];
                    if (i == 1) {
                        AnonymousClass0a4.A09(A08);
                        if (r14.A09() > 2) {
                        }
                    } else if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    Integer num2 = r14.A1J;
                                    if (num2 != null && num2.intValue() >= 1000) {
                                        C39371mo.A03(resources, spannableStringBuilder, r14.A09());
                                    }
                                }
                            }
                            spannableStringBuilder.append(C46031z1.A00(resources, C0003R.string.view_likes));
                        } else if (A08) {
                            Integer num3 = r14.A1J;
                            if (num3 != null && (intValue2 = num3.intValue()) >= 1000) {
                                C39371mo.A08(resources, spannableStringBuilder, singletonList, intValue2, true);
                            }
                            if (r14.A09() > 2) {
                                C39371mo.A06(resources, spannableStringBuilder, singletonList, r14.A09());
                            } else {
                                C39371mo.A07(resources, spannableStringBuilder, singletonList, 3);
                            }
                        } else {
                            int A09 = r14.A09();
                            int intValue3 = r14.A1J.intValue();
                            if (intValue3 >= 1000) {
                                A00 = C46031z1.A01(resources, C0003R.string.liked_by_n_people, C39371mo.A00(A09, resources, true));
                            } else if (intValue3 > 0) {
                                A00 = C46031z1.A00(resources, C0003R.string.view_likes);
                            } else {
                                throw new IllegalArgumentException(AnonymousClass000.A05("Illegal ads bucketed like count: ", intValue3));
                            }
                            spannableStringBuilder.append(A00);
                        }
                    } else if (A08) {
                        Integer num4 = r14.A1J;
                        if (num4 != null && (intValue = num4.intValue()) >= 100) {
                            C39371mo.A05(resources, spannableStringBuilder, singletonList, intValue);
                        }
                        if (r14.A09() > 2) {
                        }
                    } else {
                        C39371mo.A04(resources, spannableStringBuilder, r14.A1J.intValue());
                    }
                    r1 = new C38931m5(r13, spannableStringBuilder);
                    r1.A0F = true;
                    r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                    r1.A0J = true;
                    r0 = new C38961m8(r13, r14, false);
                } else if (arrayList.isEmpty()) {
                    return new SpannableStringBuilder(C46031z1.A00(context.getResources(), C0003R.string.view_likes));
                } else {
                    Resources resources2 = context.getResources();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    ArrayList arrayList2 = new ArrayList();
                    for (String A0E : arrayList) {
                        arrayList2.add(AnonymousClass000.A0E("@", A0E));
                    }
                    int A092 = r14.A09();
                    Integer num5 = r14.A1L;
                    if (A092 > arrayList2.size()) {
                        if (num5 != null) {
                            z2 = true;
                        }
                        z2 = false;
                        Integer A01 = C36461i5.A00(r13).A01(r14.A0N());
                        if (!z2 || !(A01 == Constants.ONE || A01 == Constants.A0N)) {
                            if (z2 && A01 == Constants.A0Y) {
                                List list = r14.A2Y;
                                if (list != null) {
                                    boolean isEmpty = list.isEmpty();
                                    z5 = true;
                                }
                                z5 = false;
                                if (!z5) {
                                    if (A08) {
                                        C39371mo.A05(resources2, spannableStringBuilder2, Collections.singletonList(AnonymousClass000.A0E("@", r13.A06.AZn())), num5.intValue());
                                    } else {
                                        C39371mo.A04(resources2, spannableStringBuilder2, num5.intValue());
                                    }
                                    r1 = new C38931m5(r13, spannableStringBuilder2);
                                    r1.A0F = true;
                                    r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                                    r1.A0J = true;
                                    r0 = new C38961m8(r13, r14, false);
                                }
                            } else if (z2 && A01 == Constants.A0C) {
                                C39371mo.A08(resources2, spannableStringBuilder2, arrayList2, A092, true);
                                r1 = new C38931m5(r13, spannableStringBuilder2);
                                r1.A0F = true;
                                r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                                r1.A0J = true;
                                r0 = new C38961m8(r13, r14, false);
                            } else if (!z2 || !(A01 == Constants.A0j || A01 == Constants.A12)) {
                                if (A01 == Constants.A0u || A01 == Constants.A12) {
                                    List list2 = r14.A2Y;
                                    if (list2 != null) {
                                        boolean isEmpty2 = list2.isEmpty();
                                        z3 = true;
                                    }
                                    z3 = false;
                                    if (!z3) {
                                        if (A08) {
                                            C39371mo.A06(resources2, spannableStringBuilder2, Collections.singletonList(AnonymousClass000.A0E("@", r13.A06.AZn())), A092);
                                        } else {
                                            spannableStringBuilder2.append(C46031z1.A00(resources2, C0003R.string.view_likes));
                                        }
                                        r1 = new C38931m5(r13, spannableStringBuilder2);
                                        r1.A0F = true;
                                        r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                                        r1.A0J = true;
                                        r0 = new C38961m8(r13, r14, false);
                                    }
                                }
                                C39371mo.A06(resources2, spannableStringBuilder2, arrayList2, A092);
                                r1 = new C38931m5(r13, spannableStringBuilder2);
                                r1.A0F = true;
                                r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                                r1.A0J = true;
                                r0 = new C38961m8(r13, r14, false);
                            } else {
                                List list3 = r14.A2Y;
                                if (list3 != null) {
                                    boolean isEmpty3 = list3.isEmpty();
                                    z4 = true;
                                }
                                z4 = false;
                                if (z4) {
                                    C39371mo.A08(resources2, spannableStringBuilder2, arrayList2, A092, false);
                                } else if (A08) {
                                    C39371mo.A08(resources2, spannableStringBuilder2, Collections.singletonList(AnonymousClass000.A0E("@", r13.A06.AZn())), A092, false);
                                } else {
                                    C39371mo.A03(resources2, spannableStringBuilder2, A092);
                                }
                                r1 = new C38931m5(r13, spannableStringBuilder2);
                                r1.A0F = true;
                                r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                                r1.A0J = true;
                                r0 = new C38961m8(r13, r14, false);
                            }
                        }
                        C39371mo.A05(resources2, spannableStringBuilder2, arrayList2, num5.intValue());
                        r1 = new C38931m5(r13, spannableStringBuilder2);
                        r1.A0F = true;
                        r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                        r1.A0J = true;
                        r0 = new C38961m8(r13, r14, false);
                    }
                    C39371mo.A07(resources2, spannableStringBuilder2, arrayList2, 3);
                    r1 = new C38931m5(r13, spannableStringBuilder2);
                    r1.A0F = true;
                    r1.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                    r1.A0J = true;
                    r0 = new C38961m8(r13, r14, false);
                }
                r1.A01(r0);
                r1.A02(new C38941m6(r13, r14));
                return r1.A00();
            }
            arrayList.addAll(r14.A17());
            if (!r14.Aho()) {
            }
            r1.A01(r0);
            r1.A02(new C38941m6(r13, r14));
            return r1.A00();
        }
        if (z) {
            arrayList.addAll(r14.A17());
        }
        if (!arrayList.isEmpty()) {
            return A02(context2, r13, r14, true, 3, arrayList);
        }
        Resources resources3 = context.getResources();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append(C43301uA.A01(resources3, r14.A09()));
        spannableStringBuilder3.setSpan(new StyleSpan(1), 0, spannableStringBuilder3.length(), 33);
        return spannableStringBuilder3;
    }

    public static CharSequence A01(Context context, AnonymousClass0C1 r10, AnonymousClass1NJ r11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context2 = context;
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        AnonymousClass1NJ r8 = r11;
        spannableStringBuilder2.append(C43301uA.A00(C0003R.string.views, resources, r11.A1W));
        AnonymousClass0C1 r7 = r10;
        spannableStringBuilder2.setSpan(new C43311uB(AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink), C23300zv.A00(r10), r11), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append(spannableStringBuilder2);
        List A17 = r11.A17();
        if (A17 != null && !A17.isEmpty()) {
            spannableStringBuilder.append(context.getResources().getString(C0003R.string.dot_with_space));
            spannableStringBuilder.append(A02(context2, r7, r8, false, 2, A17));
        }
        return spannableStringBuilder;
    }

    public static CharSequence A02(Context context, AnonymousClass0C1 r12, AnonymousClass1NJ r13, boolean z, int i, List list) {
        int i2;
        int i3;
        Object[] objArr;
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AnonymousClass000.A0E("@", (String) it.next()));
        }
        int A09 = r13.A09();
        if (A09 <= arrayList.size() || !z) {
            C39371mo.A07(resources, spannableStringBuilder, arrayList, i);
        } else {
            int min = Math.min(arrayList.size(), 2);
            if (min == 1) {
                i2 = A09 - 1;
                i3 = C0003R.plurals.liked_by_x_and_n_others;
                objArr = new Object[]{arrayList.get(0), C39371mo.A01(i2, false, resources)};
            } else if (min != 2) {
                i2 = A09 - 3;
                i3 = C0003R.plurals.liked_by_x_y_z_and_n_others;
                objArr = new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), C39371mo.A01(i2, false, resources)};
            } else {
                i2 = A09 - 2;
                i3 = C0003R.plurals.liked_by_x_y_and_n_others;
                objArr = new Object[]{arrayList.get(0), arrayList.get(1), C39371mo.A01(i2, false, resources)};
            }
            spannableStringBuilder.append(Html.fromHtml(resources.getQuantityString(i3, i2, objArr)));
        }
        C38931m5 r2 = new C38931m5(r12, spannableStringBuilder);
        r2.A0F = true;
        r2.A01 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
        r2.A0J = true;
        r2.A01(new C38961m8(r12, r13, false));
        r2.A02(new C38941m6(r12, r13));
        return r2.A00();
    }
}
