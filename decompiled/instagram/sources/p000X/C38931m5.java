package p000X;

import android.content.Context;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import com.facebook.C0003R;
import com.instagram.model.shopping.ProductMention;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1m5  reason: invalid class name and case insensitive filesystem */
public final class C38931m5 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Context A05;
    public AnonymousClass4I5 A06;
    public AnonymousClass4I5 A07;
    public C38981mA A08;
    public AnonymousClass3MM A09;
    public C38971m9 A0A;
    public C38951m7 A0B;
    public C102084ax A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final SpannableStringBuilder A0S;
    public final C62222nH A0T;
    public final AnonymousClass0C1 A0U;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        if (r6.A03 != p000X.C173377aw.APPROVED) goto L_0x0093;
     */
    public final SpannableStringBuilder A00() {
        List<C39231mZ> A002;
        List<C39231mZ> A032;
        List<C39231mZ> A042;
        List<C39231mZ> A022;
        List<C39231mZ> A012;
        int i;
        boolean z;
        if (!(!this.A0K || AnonymousClass0OX.A00(this.A0D) || this.A0S.length() == 0 || this.A05 == null || this.A08 == null)) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it = this.A0D.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                ProductMention productMention = (ProductMention) it.next();
                C155386kK r7 = new C155386kK(this.A05, productMention, this.A08);
                int i2 = productMention.A00;
                if (((Boolean) AnonymousClass0L6.A02(this.A0U, AnonymousClass0L7.PRODUCT_MENTION_CONSUMPTION_EMOJI_FIX, "is_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
                    String spannableStringBuilder = this.A0S.toString();
                    if (spannableStringBuilder.codePointCount(0, spannableStringBuilder.length() - 1) >= i2) {
                        i2 = spannableStringBuilder.offsetByCodePoints(0, i2);
                    }
                }
                int i3 = productMention.A01 + i2;
                if (this.A0S.length() >= i3) {
                    this.A0S.setSpan(r7, i2, i3, 33);
                    if (productMention.A02.A07 == AnonymousClass230.APPROVED) {
                        z = true;
                    }
                    z = false;
                    if (z) {
                        hashSet2.add(Integer.valueOf(i2));
                    } else {
                        hashSet.add(Integer.valueOf(i2));
                    }
                }
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.addAll(hashSet);
            hashSet3.addAll(hashSet2);
            ArrayList<Integer> arrayList = new ArrayList<>(hashSet3);
            Collections.sort(arrayList);
            for (Integer intValue : arrayList) {
                int intValue2 = intValue.intValue();
                Integer valueOf = Integer.valueOf(intValue2);
                if (hashSet.contains(valueOf)) {
                    Context context = this.A05;
                    CharSequence A013 = C170547Qw.A01(context, C40811pI.A01(context, C0003R.C0004drawable.instagram_error_filled_24, AnonymousClass1BA.A03(context, C0003R.attr.glyphColorSecondary)), 0, context.getResources().getDimensionPixelSize(C0003R.dimen.product_mention_icon_right_padding), false, true);
                    this.A0S.insert(intValue2 + i, A013);
                    i += A013.length();
                }
                if (hashSet2.contains(valueOf)) {
                    Context context2 = this.A05;
                    CharSequence A014 = C170547Qw.A01(context2, C40811pI.A01(context2, C0003R.C0004drawable.instagram_shopping_outline_16, C0003R.color.igds_link), 0, context2.getResources().getDimensionPixelSize(C0003R.dimen.product_mention_icon_right_padding), false, true);
                    this.A0S.insert(intValue2 + i, A014);
                    i += A014.length();
                }
            }
        }
        if (this.A0Q) {
            C62222nH r0 = this.A0T;
            if (r0 != null) {
                A012 = Collections.unmodifiableList(r0.A01);
            } else {
                A012 = C38991mB.A01(this.A0S.toString());
            }
            for (C39231mZ r6 : A012) {
                if (this.A0P) {
                    this.A0S.setSpan(new UnderlineSpan(), r6.A01, r6.A00, 33);
                }
                C39241ma r4 = new C39241ma(Constants.ZERO, r6.A02.replace("#", ""), this.A0G, this.A02);
                if (this.A0A != null) {
                    r4.A00 = new C40841pL(this);
                }
                AnonymousClass3MM r02 = this.A09;
                if (r02 != null) {
                    r4.A01 = r02;
                }
                this.A0S.setSpan(r4, r6.A01, r6.A00, 33);
            }
            AnonymousClass0C1 r2 = this.A0U;
            C39191mV r5 = (C39191mV) r2.AVA(C39191mV.class, new C39211mX(r2));
            SpannableStringBuilder spannableStringBuilder2 = this.A0S;
            if (r5.A00 == null) {
                r5.A00 = r5.parseHashtagsToColor();
            }
            for (C39231mZ r62 : A012) {
                if (!r5.A00.isEmpty() && r5.A00.contains(r62.A02.toLowerCase()) && ((Boolean) AnonymousClass0L6.A02(r5.A01, AnonymousClass0L7.RAINBOW_HASHTAGS, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    AnonymousClass2Y4 r3 = new AnonymousClass2Y4(C38351l8.A00, (float[]) null, r62.A02);
                    r3.A01 = 7;
                    r3.A02 = Shader.TileMode.REPEAT;
                    spannableStringBuilder2.setSpan(r3, r62.A01, r62.A00, 33);
                }
            }
        }
        if (this.A0R) {
            C62222nH r03 = this.A0T;
            if (r03 != null) {
                A022 = Collections.unmodifiableList(r03.A02);
            } else {
                A022 = C38991mB.A02(this.A0S.toString());
            }
            int i4 = 0;
            for (C39231mZ r04 : A022) {
                String str = r04.A02;
                int i5 = r04.A01;
                int i6 = r04.A00;
                if (this.A0J) {
                    i5 -= i4;
                    i6 = (i6 - 1) - i4;
                    this.A0S.replace(i5, i5 + 1, "");
                }
                if (this.A0O) {
                    this.A0S.setSpan(new UnderlineSpan(), i5 + 1, i6, 33);
                }
                C39241ma r42 = new C39241ma(Constants.ONE, str.replace("@", ""), this.A0F, this.A01);
                if (this.A0B != null) {
                    r42.A00 = new C39281me(this);
                }
                AnonymousClass3MM r05 = this.A09;
                if (r05 != null) {
                    r42.A01 = r05;
                }
                this.A0S.setSpan(r42, i5, i6, 33);
                i4++;
            }
        }
        if (this.A0N) {
            C62222nH r06 = this.A0T;
            if (r06 != null) {
                A042 = Collections.unmodifiableList(r06.A04);
            } else {
                A042 = C38991mB.A04(this.A0S.toString());
            }
            for (C39231mZ r52 : A042) {
                C39241ma r43 = new C39241ma(Constants.A0Y, r52.A02, this.A0H, this.A03);
                if (this.A0C != null) {
                    r43.A00 = new C102074aw(this);
                }
                AnonymousClass3MM r07 = this.A09;
                if (r07 != null) {
                    r43.A01 = r07;
                }
                this.A0S.setSpan(r43, r52.A01, r52.A00, 33);
            }
        }
        if (this.A0M) {
            C62222nH r08 = this.A0T;
            if (r08 != null) {
                A032 = Collections.unmodifiableList(r08.A03);
            } else {
                A032 = C38991mB.A03(this.A0S.toString());
            }
            for (C39231mZ r63 : A032) {
                C39241ma r44 = new C39241ma(Constants.A0C, r63.A02, this.A0I, this.A04);
                if (this.A07 != null) {
                    r44.A00 = new AnonymousClass4U9(this);
                }
                AnonymousClass3MM r09 = this.A09;
                if (r09 != null) {
                    r44.A01 = r09;
                }
                this.A0S.setSpan(r44, r63.A01, r63.A00, 33);
            }
        }
        if (this.A0L) {
            C62222nH r010 = this.A0T;
            if (r010 != null) {
                A002 = Collections.unmodifiableList(r010.A00);
            } else {
                A002 = C38991mB.A00(this.A0S.toString());
            }
            for (C39231mZ r64 : A002) {
                C39241ma r45 = new C39241ma(Constants.A0N, r64.A02, this.A0E, this.A00);
                if (this.A06 != null) {
                    r45.A00 = new AnonymousClass4U8(this);
                }
                AnonymousClass3MM r011 = this.A09;
                if (r011 != null) {
                    r45.A01 = r011;
                }
                this.A0S.setSpan(r45, r64.A01, r64.A00, 33);
            }
        }
        return this.A0S;
    }

    public final void A01(C38971m9 r2) {
        this.A0A = r2;
        this.A0Q = true;
    }

    public final void A02(C38951m7 r2) {
        this.A0B = r2;
        this.A0R = true;
    }

    public C38931m5(AnonymousClass0C1 r2, SpannableStringBuilder spannableStringBuilder) {
        this(r2, spannableStringBuilder, (C62222nH) null);
    }

    public C38931m5(AnonymousClass0C1 r2, SpannableStringBuilder spannableStringBuilder, C62222nH r4) {
        this.A0F = false;
        this.A0G = false;
        this.A0P = false;
        this.A0O = false;
        this.A0H = false;
        this.A0I = false;
        this.A0E = false;
        this.A0J = false;
        this.A0Q = false;
        this.A0R = false;
        this.A0N = false;
        this.A0M = false;
        this.A0L = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A00 = 0;
        this.A0S = spannableStringBuilder;
        this.A0U = r2;
        this.A0T = r4;
    }
}
