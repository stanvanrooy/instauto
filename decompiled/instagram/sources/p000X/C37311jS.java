package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1jS  reason: invalid class name and case insensitive filesystem */
public final class C37311jS {
    public static Map A03(List list) {
        String str;
        String str2;
        if (list != null) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C34151eA r3 = (C34151eA) it.next();
                int ordinal = r3.A0Q.ordinal();
                if (ordinal != 19) {
                    str = null;
                } else {
                    str = "poll";
                }
                if (ordinal != 19) {
                    str2 = null;
                } else {
                    str2 = r3.A06().A01;
                }
                if (!TextUtils.isEmpty(str) && str2 != null) {
                    hashMap.put(str, str2);
                }
            }
            if (!hashMap.isEmpty()) {
                return hashMap;
            }
        }
        return null;
    }

    public static C39941no A01(C249616t r2, AnonymousClass0C1 r3) {
        if (r2 instanceof Reel) {
            Reel reel = (Reel) r2;
            if (!reel.A0J(r3).isEmpty()) {
                return reel.A0C(r3, 0);
            }
            return null;
        } else if (r2 instanceof C39941no) {
            return (C39941no) r2;
        } else {
            return null;
        }
    }

    public static void A04(AnonymousClass0P4 r4, C36031hK r5, int i) {
        boolean z = false;
        if (r5.A00.A02.A02 != 0) {
            z = true;
        }
        String str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str2 = "0";
        if (z) {
            str2 = str;
        }
        r4.A0G("has_my_reel", str2);
        boolean z2 = false;
        if (r5.A00.A01.A02 != 0) {
            z2 = true;
        }
        if (!z2) {
            str = "0";
        }
        r4.A0G("has_my_replay_reel", str);
        r4.A0E("viewed_reel_count", Integer.valueOf(r5.A00.A02.A03));
        r4.A0E("new_reel_count", Integer.valueOf(r5.A00.A02.A01));
        r4.A0E("live_reel_count", Integer.valueOf(r5.A00.A00.A01));
        r4.A0E("new_replay_reel_count", Integer.valueOf(r5.A00.A01.A01));
        r4.A0E("viewed_replay_reel_count", Integer.valueOf(r5.A00.A01.A03));
        r4.A0E("muted_reel_count", Integer.valueOf(r5.A00.A02.A00));
        r4.A0E("muted_live_reel_count", Integer.valueOf(r5.A00.A00.A00));
        r4.A0E("muted_replay_reel_count", Integer.valueOf(r5.A00.A01.A00));
        r4.A0E("unfetched_reel_count", Integer.valueOf(i));
    }

    public static void A05(C37141jB r2, Reel reel) {
        String str;
        Integer num = reel.A0S;
        AnonymousClass0a4.A07(num, "Netego item should have a netego type");
        r2.A41 = AnonymousClass2AJ.A00(num);
        r2.A3y = reel.A0H();
        switch (num.intValue()) {
            case 0:
                AnonymousClass9G1 r1 = reel.A0K;
                AnonymousClass0a4.A07(r1, "Bakeoff netego should have a SimpleAction");
                str = r1.A07;
                break;
            case 1:
                AnonymousClass9G0 r12 = reel.A0J;
                AnonymousClass0a4.A07(r12, "Ad4ad netego should have an Ad4ad object");
                AnonymousClass1NJ r0 = reel.A07;
                if (r0 != null) {
                    r2.A3v = r0.getId();
                }
                str = r12.A04;
                break;
            case 2:
                AnonymousClass9G2 r13 = reel.A0L;
                AnonymousClass0a4.A07(r13, "SU netego should have a SimpleSuggestedUsers object");
                str = r13.A05;
                break;
            default:
                throw new IllegalArgumentException("Unsupported netego type");
        }
        r2.A40 = str;
    }

    public static void A06(C37141jB r8, C39941no r9, C50282Fr r10, C701435a r11, C64982sM r12, int i, boolean z) {
        A0B(r8, new AnonymousClass3GS(r11.A05, r10, r10.A0A, r9, r12, i, z));
        r8.A4T = r11.A08;
        r8.A57 = r11.A04.AaT();
        r8.A4m = r11.A07;
    }

    public static void A07(C37141jB r7, C39941no r8, C50282Fr r9, AnonymousClass3FN r10, C701435a r11) {
        C37141jB r0 = r7;
        C50282Fr r2 = r9;
        A06(r0, r8, r2, r11, r10.A03, r10.A02.A00(r8), r10.A04);
    }

    public static void A08(C37141jB r7, C39941no r8, AnonymousClass3FM r9, C701435a r10) {
        C37141jB r0 = r7;
        A06(r0, r8, r9.A00, r10, r9.A02, r9.A01.A00(r8), r9.A03);
    }

    public static void A09(C37141jB r7, C50282Fr r8, AnonymousClass8TW r9, C701435a r10) {
        C37141jB r0 = r7;
        A06(r0, r9.A01, r8, r10, r9.A02, -1, false);
    }

    public static void A0A(C37141jB r1, C66352vL r2) {
        r1.A2s = Integer.valueOf(r2.A05);
        r1.A0W = r2.A00;
        r1.A2t = Integer.valueOf(r2.A06);
        r1.A1C = r2.A02;
        r1.A1R = r2.A0C;
        r1.A0A(r2.A07);
        r1.A1I = r2.A03;
    }

    public static void A0B(C37141jB r4, AnonymousClass3GS r5) {
        Map unmodifiableMap;
        int i;
        String str;
        Reel reel = r5.A01;
        r4.A4N = reel.getId();
        r4.A1U = r5.A00;
        r4.A1P = reel.A07(r5.A05);
        C50282Fr r1 = r5.A03;
        r4.A1Q = r1.A01();
        r4.A1O = C50282Fr.A00(r1, r5.A05).indexOf(r5.A02);
        r4.A4U = r5.A01.A0I();
        r4.A1S = r5.A04.A09;
        Map A03 = A03(r5.A02.A0U());
        if (A03 == null) {
            unmodifiableMap = null;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(A03);
        }
        r4.A5U = unmodifiableMap;
        if (r5.A01.A0n(r5.A05)) {
            i = r5.A01.A00;
        } else {
            i = -1;
        }
        r4.A0m = i;
        r4.A2f = Boolean.valueOf(r5.A07);
        AttributedAREffect attributedAREffect = r5.A01.A09;
        if (attributedAREffect != null) {
            str = attributedAREffect.getId();
        } else {
            str = null;
        }
        if (str != null) {
            try {
                r4.A2v = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                AnonymousClass0QD.A02("ReelLoggerUtil", "Unable to convert invalid effect id into Long");
            }
        }
        C50282Fr r12 = r5.A03;
        List list = r12.A0A.A0c;
        if (list != null) {
            int indexOf = C50282Fr.A00(r12, r5.A05).indexOf(r5.A02);
            r4.A0G(list);
            r4.A1P = C66262vC.A00(list);
            r4.A1O = C66262vC.A01(list, indexOf);
            r4.A1T = indexOf;
        }
        C64982sM r0 = r5.A04;
        r4.A0D = ((double) (r0.A06 * r0.A07)) / 1000.0d;
        if (r5.A02.Aho()) {
            r4.A0Z = r5.A03.A09;
        } else {
            r4.A1Y = r5.A03.A09;
        }
    }

    public static void A0C(C37141jB r6, C64982sM r7) {
        float f = r7.A06;
        float f2 = r7.A07;
        r6.A09 = ((double) (f * f2)) / 1000.0d;
        r6.A0A = ((double) (f * Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f - f2))) / 1000.0d;
        r6.A06 = r7.A00;
        r6.A08 = r7.A03;
        r6.A07 = r7.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r5 = r22;
     */
    public static void A0E(AnonymousClass0C1 r22, C37141jB r23, C249616t r24, C66352vL r25, AnonymousClass3GS r26, Context context) {
        AnonymousClass0C1 r5;
        C39941no A01;
        String str;
        ArrayList arrayList;
        List<AnonymousClass40Y> unmodifiableList;
        String str2;
        String str3;
        String str4;
        C249616t r1 = r24;
        if (r1.Aho() && (A01 = A01(r1, r5)) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(A01.A0R(r5));
            if (A01.A0E != Constants.ONE || C30671Ut.A04(r5, A01.A08) == null) {
                str = null;
            } else {
                str = C30671Ut.A04(r5, A01.A08);
            }
            if (str != null) {
                sb.append(" ");
                if (A01.A0E != Constants.ONE || C30671Ut.A04(r5, A01.A08) == null) {
                    str4 = null;
                } else {
                    str4 = C30671Ut.A04(r5, A01.A08);
                }
                sb.append(str4);
            }
            C37141jB r12 = r23;
            r12.A4l = sb.toString();
            r12.A36 = A01.A0Q(r5);
            if (A01.A0P(r5) != null) {
                r12.A3N = A01.A0P(r5);
                if (A01.A0E != Constants.ONE || C30671Ut.A05(r5, A01.A08) == null) {
                    str2 = null;
                } else {
                    str2 = C30671Ut.A05(r5, A01.A08);
                }
                r12.A3M = str2;
                if (A01.A0E != Constants.ONE || C30671Ut.A07(r5, A01.A08) == null) {
                    str3 = null;
                } else {
                    str3 = C30671Ut.A07(r5, A01.A08);
                }
                r12.A3O = str3;
            }
            C66352vL r13 = r25;
            AnonymousClass3GS r4 = r26;
            if (r25 != null) {
                r12.A0a = r13.A0A;
                r12.A1R = r13.A0C;
                r12.A0b = r13.A0B;
                r12.A0X = r4.A04.A09;
                if (r13.A09) {
                    r12.A1N = r13.A04;
                    r12.A0q = r13.A01;
                } else {
                    r12.A1M = r13.A04;
                    r12.A0p = r13.A01;
                }
                r12.A2s = Integer.valueOf(r13.A05);
                r12.A0W = r13.A00;
                r12.A2t = Integer.valueOf(r13.A06);
                r12.A1C = r13.A02;
                r12.A0A(r13.A07);
                r12.A1I = r13.A03;
                DjR djR = r13.A08;
                if (djR != null) {
                    String str5 = djR.A01;
                    int i = djR.A00;
                    r12.A30 = str5;
                    r12.A15 = i;
                }
            }
            Context context2 = context;
            r12.A05(C06220Of.A01(context2, (float) C06220Of.A09(context2)), C06220Of.A01(context2, (float) C06220Of.A08(context2)), C06220Of.A0B(context2).density);
            if (((Boolean) AnonymousClass0L6.A03(r5, AnonymousClass0L7.STORIES_NEW_PORTAL_LAUNCHER, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                AnonymousClass5Q7 r0 = r4.A04.A0E;
                if (r0 != null) {
                    Map AOo = r0.AOo();
                    if (r12.A1y == null) {
                        r12.A1y = C06270Ok.A00();
                    }
                    r12.A1y.A0C(AOo);
                }
            } else {
                C61762mM r02 = r4.A04.A0F;
                if (r02 != null) {
                    AnonymousClass1NJ r132 = A01.A08;
                    float A012 = C06220Of.A01(context2, r02.A02);
                    float A013 = C06220Of.A01(context2, r02.A03);
                    float A014 = C06220Of.A01(context2, r02.A08);
                    float A015 = C06220Of.A01(context2, r02.A09);
                    float A016 = C06220Of.A01(context2, r02.A00);
                    int i2 = r02.A0A;
                    boolean z = r02.A0L;
                    int i3 = r02.A0B;
                    int i4 = r02.A0D;
                    int i5 = r02.A0E;
                    int i6 = i2;
                    boolean z2 = z;
                    int i7 = i3;
                    r12.A08(r132, A012, A013, A014, A015, A016, i6, z2, i7, i4, i5, r02.A0C, C06220Of.A01(context2, r02.A01), C06220Of.A01(context2, r02.A04), C06220Of.A01(context2, r02.A07));
                }
            }
            boolean A06 = C66262vC.A06(A01, r5);
            if (r12.A1y == null) {
                r12.A1y = C06270Ok.A00();
            }
            r12.A1y.A05("is_showreel_native", Boolean.valueOf(A06));
            Map map = r4.A04.A0K;
            if (map == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(map.values());
            }
            if (arrayList == null) {
                unmodifiableList = null;
            } else {
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            if (unmodifiableList != null && !unmodifiableList.isEmpty()) {
                ArrayList<C06270Ok> arrayList2 = new ArrayList<>();
                for (AnonymousClass40Y r42 : unmodifiableList) {
                    C06270Ok A00 = C06270Ok.A00();
                    A00.A09("id", r42.A07);
                    A00.A09("type", r42.A08);
                    A00.A06(IgReactMediaPickerNativeModule.WIDTH, Float.valueOf(r42.A06));
                    A00.A06(IgReactMediaPickerNativeModule.HEIGHT, Float.valueOf(r42.A02));
                    A00.A06("center_x", Float.valueOf(r42.A00));
                    A00.A06("center_y", Float.valueOf(r42.A01));
                    A00.A06("rotation", Float.valueOf(r42.A03));
                    A00.A06("scale_x", Float.valueOf(r42.A04));
                    A00.A06("scale_x", Float.valueOf(r42.A05));
                    arrayList2.add(A00);
                }
                if (r12.A1y == null) {
                    r12.A1y = C06270Ok.A00();
                }
                C06170Oa A002 = C06170Oa.A00();
                for (C06270Ok add : arrayList2) {
                    A002.A00.add(add);
                }
                r12.A1y.A04("stickers", A002);
            }
        }
    }

    public static void A0F(AnonymousClass0C1 r4, C27371Ho r5, C50282Fr r6, String str, AnonymousClass1ME r8, int i, int i2, Integer num) {
        Reel reel = r6.A0A;
        C37141jB A01 = C37591ju.A01(str, reel, r5);
        if (!reel.A0l(r4) && reel.A0C(r4, 0).A0t()) {
            A01.A0B(r4, reel.A0C(r4, 0).A08);
        }
        A01.A2s = Integer.valueOf(r8.A06);
        A01.A0W = r8.A01;
        A01.A2t = Integer.valueOf(r8.A07);
        A01.A1C = r8.A05;
        Reel reel2 = r6.A0A;
        A01.A0A(reel2.A0F);
        A01.A1I = reel2.A01;
        A01.A1R = i;
        A01.A1S = r8.A02;
        A01.A0b = i2;
        A01.A2q = num;
        DjR djR = reel2.A0N;
        DjR djR2 = djR;
        if (djR != null) {
            String str2 = djR.A01;
            int i3 = djR2.A00;
            A01.A30 = str2;
            A01.A15 = i3;
        }
        Integer num2 = Constants.ZERO;
        Integer num3 = r8.A08;
        if (num2 == num3) {
            A01.A5N = r8.A00();
            A01.A0t = r8.A03;
        } else if (Constants.ONE == num3) {
            if (!r8.A00().isEmpty()) {
                A01.A55 = (String) r8.A00().get(0);
            }
            A01.A0V = r8.A03;
            A01.A05 = r8.A00;
        }
        C36901in.A06(AnonymousClass0WN.A01(r4), A01, Constants.ONE);
    }

    public static AnonymousClass0P4 A00(AnonymousClass0RN r4, String str, String str2, long j, C36031hK r9, AnonymousClass1OR r10, Integer num, boolean z, boolean z2) {
        int i;
        String str3;
        AnonymousClass0P4 A00 = AnonymousClass0P4.A00("reel_tray_refresh", r4);
        if (r10 != null) {
            i = new ArrayList(r10.A05).size();
        } else {
            i = 0;
        }
        A04(A00, r9, i);
        A00.A0C("tray_refresh_time", Double.valueOf(((double) j) / 1000.0d));
        if (z) {
            str3 = "disk";
        } else {
            str3 = "network";
        }
        A00.A0G("tray_refresh_type", str3);
        A00.A0G("tray_refresh_reason", C22980zL.A00(num));
        A00.A0G("tray_session_id", str);
        A00.A0A("was_successful", Boolean.valueOf(z2));
        A00.A0G("story_ranking_token", str2);
        return A00;
    }

    public static AnonymousClass2TY A02(View view, String str) {
        String str2;
        Context context = view.getContext();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float A01 = C06220Of.A01(context, (float) iArr[0]);
        float A012 = C06220Of.A01(context, (float) iArr[1]);
        float A013 = C06220Of.A01(context, (float) view.getWidth());
        float A014 = C06220Of.A01(context, (float) view.getHeight());
        if (view instanceof TextView) {
            str2 = ((TextView) view).getText().toString();
        } else {
            str2 = null;
        }
        return new AnonymousClass2TY(A013, A014, A01, A012, str, str2);
    }

    public static void A0D(C37151jC r6, Context context) {
        float A01 = C06220Of.A01(context, (float) C06220Of.A09(context));
        float A012 = C06220Of.A01(context, (float) C06220Of.A08(context));
        float f = C06220Of.A0B(context).density;
        r6.BkK(A01, A012, ((float) C06220Of.A07(context)) / f, ((float) C06220Of.A06(context)) / f, f);
    }
}
