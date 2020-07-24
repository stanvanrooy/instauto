package p000X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.LruCache;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.feed.media.CreativeConfig;

/* renamed from: X.1jG  reason: invalid class name and case insensitive filesystem */
public final class C37191jG {
    public static void A03(View view, float f, float f2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{f, f2}).setDuration(300);
        duration.addListener(new AnonymousClass673(f, view, f2));
        duration.start();
    }

    public static int A00(AnonymousClass1NJ r1, Resources resources) {
        boolean z;
        instagramComment r0;
        CreativeConfig creativeConfig;
        if (r1 == null || (((r0 = r1.A0K) == null || !r0.A0f) && ((creativeConfig = r1.A0M) == null || !creativeConfig.A03()))) {
            z = false;
        } else {
            z = true;
        }
        int i = C0003R.dimen.feed_item_bottom_padding;
        if (z) {
            i = C0003R.dimen.feed_item_bottom_padding_with_translation;
        }
        return resources.getDimensionPixelOffset(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018d, code lost:
        r6.append(r2.getString(r0));
     */
    public static SpannableStringBuilder A01(Context context, AnonymousClass1NJ r10, AnonymousClass0C1 r11, C36841ih r12, boolean z, boolean z2, boolean z3, boolean z4, C29181Ox r17) {
        int i;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (r12.A0E != C17070pd.ADS_HISTORY || TextUtils.isEmpty(r10.A20)) {
            C29181Ox r5 = r17;
            if (z2) {
                long longValue = r10.A0k().longValue();
                SpannableStringBuilder spannableStringBuilder2 = null;
                if (longValue != 0) {
                    str = C15960no.A04(context, (double) longValue);
                } else {
                    str = null;
                }
                if (z3 && !TextUtils.isEmpty(r10.A0n())) {
                    CharSequence charSequence = (CharSequence) r5.A04.get(r10);
                    spannableStringBuilder2 = charSequence;
                    if (charSequence == null) {
                        Context context2 = r5.A00;
                        AnonymousClass0C1 r6 = r5.A08;
                        int A01 = AnonymousClass1BA.A01(context2, C0003R.attr.textColorBoldLink);
                        String A0n = r10.A0n();
                        AnonymousClass0a4.A06(A0n);
                        C38931m5 r3 = new C38931m5(r6, new SpannableStringBuilder(A0n));
                        r3.A0F = true;
                        r3.A0G = true;
                        r3.A01 = A01;
                        r3.A02 = A01;
                        r3.A01(new C38961m8(r6, r10, false));
                        r3.A02(new C38941m6(r6, r10));
                        SpannableStringBuilder A00 = r3.A00();
                        for (int length = A00.length() - 1; length >= 0; length--) {
                            if (A00.charAt(length) == '@') {
                                A00.delete(length, length + 1);
                            }
                        }
                        r5.A04.put(r10, A00);
                        spannableStringBuilder2 = A00;
                    }
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(spannableStringBuilder2)) {
                    spannableStringBuilder.append(str);
                    spannableStringBuilder.append(" • ");
                    spannableStringBuilder.append(spannableStringBuilder2);
                } else if (!TextUtils.isEmpty(str)) {
                    spannableStringBuilder.append(str);
                } else if (!TextUtils.isEmpty(spannableStringBuilder2)) {
                    spannableStringBuilder.append(spannableStringBuilder2);
                }
            }
            if (z4) {
                CharSequence text = context.getResources().getText(C0003R.string.close_friends_badge_label);
                spannableStringBuilder.append(" • ");
                spannableStringBuilder.append(text);
            }
            if (z) {
                C36881il r32 = r12.A0D;
                String A05 = AnonymousClass000.A05(r10.getId(), r32.A00);
                CharSequence charSequence2 = (CharSequence) r5.A05.get(A05);
                SpannableStringBuilder spannableStringBuilder3 = charSequence2;
                if (charSequence2 == null) {
                    Context context3 = r5.A00;
                    AnonymousClass0C1 r1 = r5.A08;
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                    switch (r32.ordinal()) {
                        case 0:
                            i = C0003R.string.see_translation;
                            break;
                        case 1:
                            i = C0003R.string.see_original;
                            break;
                        case 2:
                            i = C0003R.string.loading_translation;
                            break;
                        default:
                            if (r32 != C36881il.Loading) {
                                spannableStringBuilder4.setSpan(new C42941tV(AnonymousClass1BA.A01(context3, C0003R.attr.textColorBoldLink), C23300zv.A00(r1), r10), 0, spannableStringBuilder4.length(), 33);
                            }
                            r5.A05.put(A05, spannableStringBuilder4);
                            spannableStringBuilder3 = spannableStringBuilder4;
                            break;
                    }
                }
                A02(spannableStringBuilder, spannableStringBuilder3);
            }
            if (r10.A3b) {
                A02(spannableStringBuilder, r10.A1p);
            }
            if (C30671Ut.A0F(r11, r10)) {
                A02(spannableStringBuilder, context.getResources().getText(C0003R.string.ad_autotranslated_label));
            }
            if (r10.A1J() && ((Boolean) AnonymousClass0L6.A02(r11, AnonymousClass0L7.CAMERA_ANDROID_FEED_EFFECT_ATTRIBUTION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(context.getString(C0003R.string.made_with_effect_caps));
                if (r10.A1J()) {
                    spannableStringBuilder5.setSpan(new AnonymousClass689(AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink), C23300zv.A00(r11), r10), 0, spannableStringBuilder5.length(), 33);
                }
                A02(spannableStringBuilder, spannableStringBuilder5);
                return spannableStringBuilder;
            }
        } else {
            A02(spannableStringBuilder, r10.A20);
        }
        return spannableStringBuilder;
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (spannableStringBuilder.length() != 0) {
            spannableStringBuilder.append(" • ");
        }
        spannableStringBuilder.append(charSequence);
    }

    public static void A04(TextView textView, AnonymousClass1NJ r3, AnonymousClass0C1 r4, AnonymousClass78M r5) {
        CharSequence charSequence;
        LruCache lruCache;
        if (C36451i4.A06(r3, r4)) {
            charSequence = (CharSequence) r5.A06.get(r3);
            if (charSequence == null) {
                charSequence = C39331mk.A01(r5.A02, r5.A0A, r3);
                lruCache = r5.A06;
            }
            A05(r4, textView, charSequence, r3);
        } else if (C36451i4.A05(r3, r4)) {
            charSequence = (CharSequence) r5.A03.get(r3);
            if (charSequence == null) {
                charSequence = C39331mk.A00(r5.A02, r5.A0A, r3);
                lruCache = r5.A03;
            }
            A05(r4, textView, charSequence, r3);
        } else {
            textView.setVisibility(8);
            return;
        }
        lruCache.put(r3, charSequence);
        A05(r4, textView, charSequence, r3);
    }

    public static void A05(AnonymousClass0C1 r1, TextView textView, CharSequence charSequence, AnonymousClass1NJ r4) {
        textView.setText(charSequence);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setOnClickListener(new C42931tU(r1, r4));
        textView.setLongClickable(false);
        textView.setVisibility(0);
        textView.setAlpha(1.0f);
    }
}
