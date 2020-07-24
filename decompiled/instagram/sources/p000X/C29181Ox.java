package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.LruCache;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.1Ox  reason: invalid class name and case insensitive filesystem */
public final class C29181Ox implements C06570Po {
    public Context A00;
    public C11200ea A01;
    public C11200ea A02;
    public final LruCache A03 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A04 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A05 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final AnonymousClass1P9 A06;
    public final AnonymousClass1P7 A07;
    public final AnonymousClass0C1 A08;
    public final Map A09 = new WeakHashMap();
    public final LruCache A0A = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0B = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0C = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0D = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0E = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final C23300zv A0F;
    public final C11200ea A0G = new AnonymousClass1P3(this);
    public final C29191Oy A0H;
    public final AnonymousClass1P2 A0I = new AnonymousClass1P2();

    public static synchronized C29181Ox A00(Context context, AnonymousClass0C1 r5) {
        C29181Ox r2;
        Class<C29181Ox> cls = C29181Ox.class;
        synchronized (cls) {
            r2 = (C29181Ox) r5.AV9(cls);
            if (r2 == null) {
                Context applicationContext = context.getApplicationContext();
                C15330mi.A01(applicationContext);
                r2 = new C29181Ox(applicationContext, r5, C29191Oy.A02(r5));
                r5.BYi(cls, r2);
            }
        }
        return r2;
    }

    public static C29181Ox getTestInstance(Context context, AnonymousClass0C1 r3, C29191Oy r4) {
        return new C29181Ox(context.getApplicationContext(), r3, r4);
    }

    public final Drawable A01(AnonymousClass1NJ r12) {
        String str;
        ArrayList arrayList = new ArrayList();
        boolean A042 = C36451i4.A04(r12, this.A08);
        if (A042) {
            C13300iJ r2 = this.A08.A06;
            AnonymousClass1WI r1 = new AnonymousClass1WI();
            r1.A01 = r2.getId();
            r1.A00 = r2.ASv();
            arrayList.add(r1);
            List list = r12.A2Y;
            if (list != null) {
                arrayList.addAll(list);
            }
        } else {
            List list2 = r12.A2Y;
            AnonymousClass0a4.A06(list2);
            arrayList.addAll(list2);
        }
        String id = r12.getId();
        if (A042) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        String A0E2 = AnonymousClass000.A0E(id, str);
        Drawable drawable = (Drawable) this.A0D.get(A0E2);
        if (drawable != null) {
            return drawable;
        }
        Context context = this.A00;
        Drawable A002 = C39471my.A00(context, arrayList, context.getResources().getDimensionPixelSize(C0003R.dimen.facepile_avatar_size), true, Constants.ZERO, true, true, (Float) null);
        this.A0D.put(A0E2, A002);
        return A002;
    }

    public final Layout A02(instagramComment r18) {
        SpannableStringBuilder A002;
        instagramComment r4 = r18;
        Layout layout = (Layout) this.A0B.get(AnonymousClass000.A0J(r4.mediaId, "_", r4.AS8()));
        if (layout != null) {
            return layout;
        }
        C29191Oy r7 = this.A0H;
        Context context = this.A00;
        if (r4.A0g) {
            A002 = new SpannableStringBuilder();
        } else {
            A002 = C29191Oy.A00(context, r7.A04, r4, false, AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink));
        }
        String str = r4.commentText;
        String str2 = str;
        if (str != null) {
            C38931m5 r8 = new C38931m5(r7.A04, new SpannableStringBuilder(str2));
            AnonymousClass0C1 r2 = r7.A04;
            r8.A01(new C38961m8(r2, r4.A0C.A0Q(r2), r4.A06()));
            AnonymousClass0C1 r1 = r7.A04;
            r8.A02(new C38941m6(r1, r4.A0C.A0Q(r1)));
            C38981mA r12 = new C38981mA(r7, r4);
            List A042 = r4.A04();
            r8.A05 = context;
            r8.A08 = r12;
            r8.A0D = A042;
            r8.A0K = true;
            A002.append(r8.A00());
        }
        if (A002.length() > 0) {
            A002.setSpan(new C39461mx(r7, r4), 0, A002.length(), 33);
        }
        AnonymousClass1PB r0 = this.A06.A00;
        StaticLayout staticLayout = new StaticLayout(A002, r0.A04, r0.A02, Layout.Alignment.ALIGN_NORMAL, r0.A01, r0.A00, r0.A05);
        this.A0B.put(AnonymousClass000.A0J(r4.mediaId, "_", r4.AS8()), staticLayout);
        return staticLayout;
    }

    public final Layout A03(instagramComment r14, int i, boolean z, boolean z2, C17070pd r18) {
        Layout layout;
        AnonymousClass1PB r8;
        instagramComment r6 = r14;
        Map map = (Map) this.A0I.A00.get(r14.AS8());
        int i2 = i;
        C17070pd r11 = r18;
        if (map == null) {
            layout = null;
        } else {
            layout = (Layout) map.get(C06360Ot.formatString("%d%b%b%s", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), r11.name()));
        }
        if (layout == null) {
            AnonymousClass1P9 r0 = this.A06;
            boolean z3 = z2;
            if (z && z2) {
                r8 = r0.A02;
            } else if (z) {
                r8 = r0.A01;
            } else if (z2) {
                r8 = r0.A03;
            } else {
                r8 = r0.A00;
            }
            layout = C37741k9.A00(r6, i2, r8, this.A00, this.A0H, r11);
            AnonymousClass1P2 r2 = this.A0I;
            Map map2 = (Map) r2.A00.get(r14.AS8());
            if (map2 == null) {
                map2 = new HashMap();
                r2.A00.put(r14.AS8(), map2);
            }
            map2.put(C06360Ot.formatString("%d%b%b%s", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z3), r11.name()), layout);
        }
        return layout;
    }

    public final CharSequence A04(AnonymousClass1NJ r3) {
        CharSequence charSequence = (CharSequence) this.A0C.get(r3);
        if (charSequence != null) {
            return charSequence;
        }
        CharSequence A002 = C39331mk.A00(this.A00, this.A08, r3);
        this.A0C.put(r3, A002);
        return A002;
    }

    public final CharSequence A05(AnonymousClass1NJ r3) {
        CharSequence charSequence = (CharSequence) this.A0E.get(r3);
        if (charSequence != null) {
            return charSequence;
        }
        CharSequence A012 = C39331mk.A01(this.A00, this.A08, r3);
        this.A0E.put(r3, A012);
        return A012;
    }

    public final void A08() {
        this.A0C.evictAll();
        this.A0E.evictAll();
        this.A04.evictAll();
        this.A05.evictAll();
        this.A03.evictAll();
        this.A09.clear();
        this.A0A.evictAll();
        this.A0B.evictAll();
        this.A0I.A00.evictAll();
        this.A0D.evictAll();
    }

    public final void A09(AnonymousClass1NJ r5) {
        String str;
        this.A0C.remove(r5);
        this.A0E.remove(r5);
        this.A04.remove(r5);
        this.A03.remove(r5);
        LruCache lruCache = this.A0D;
        boolean A042 = C36451i4.A04(r5, this.A08);
        String id = r5.getId();
        if (A042) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        lruCache.remove(AnonymousClass000.A0E(id, str));
        AnonymousClass1NV A0I2 = r5.A0I();
        if (A0I2 != null) {
            for (instagramComment AS8 : A0I2.A00) {
                Map map = (Map) this.A0I.A00.get(AS8.AS8());
                if (map != null) {
                    map.clear();
                }
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A0F.A03(AnonymousClass1P8.class, this.A02);
        C11130eT.A01.A03(AnonymousClass1P6.class, this.A01);
        C11130eT.A01.A03(AnonymousClass1BB.class, this.A0G);
    }

    public C29181Ox(Context context, AnonymousClass0C1 r5, C29191Oy r6) {
        AnonymousClass1P9 r0;
        this.A0H = r6;
        this.A02 = new AnonymousClass1P4(this);
        AnonymousClass1P5 r2 = new AnonymousClass1P5(this);
        this.A01 = r2;
        C11130eT.A01.A02(AnonymousClass1P6.class, r2);
        C11130eT.A01.A02(AnonymousClass1BB.class, this.A0G);
        this.A07 = new AnonymousClass1P7(this, C15740nS.A00());
        this.A00 = context;
        this.A08 = r5;
        C23300zv A002 = C23300zv.A00(r5);
        this.A0F = A002;
        A002.A02(AnonymousClass1P8.class, this.A02);
        Context context2 = this.A00;
        synchronized (AnonymousClass1P9.class) {
            if (AnonymousClass1P9.A04 == null) {
                AnonymousClass1P9.A04 = new AnonymousClass1P9(context2);
            }
            r0 = AnonymousClass1P9.A04;
        }
        this.A06 = r0;
    }

    public final CharSequence A06(String str) {
        String A052 = AnonymousClass000.A05(str, C0003R.color.red_4);
        CharSequence charSequence = (CharSequence) this.A0A.get(A052);
        if (charSequence != null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C019000b.A00(this.A00, C0003R.color.red_4)), 0, spannableStringBuilder.length(), 18);
        this.A0A.put(A052, spannableStringBuilder);
        return spannableStringBuilder;
    }

    public final CharSequence A07(String str, boolean z) {
        String A0S = AnonymousClass000.A0S(str, z);
        CharSequence charSequence = (CharSequence) this.A0A.get(A0S);
        SpannableStringBuilder spannableStringBuilder = charSequence;
        if (charSequence == null) {
            Context context = this.A00;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            if (z) {
                int A012 = AnonymousClass1BA.A01(context, C0003R.attr.textColorBoldLink);
                spannableStringBuilder2.append("    ");
                spannableStringBuilder2.setSpan(new ImageSpan(C132535lS.A00(context, C0003R.C0004drawable.adchoices, 14, 2, A012), 0), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 18);
            }
            this.A0A.put(A0S, spannableStringBuilder2);
            spannableStringBuilder = spannableStringBuilder2;
        }
        return spannableStringBuilder;
    }
}
