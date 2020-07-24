package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Tm  reason: invalid class name and case insensitive filesystem */
public final class C07540Tm {
    public static final Map A0K = new C07520Tk();
    public final C07560To A00;
    public final ConcurrentMap A01 = new ConcurrentHashMap();
    public final Context A02;
    public final C10960eC A03;
    public final RealtimeSinceBootClock A04;
    public final C10930e7 A05;
    public final AnonymousClass0TQ A06;
    public final AnonymousClass0TY A07;
    public final AnonymousClass0UC A08;
    public final AnonymousClass0UE A09;
    public final String A0A;
    public final HashMap A0B;
    public final HashMap A0C;
    public final boolean A0D;
    public volatile C07440Tc A0E;
    public volatile String A0F = "";
    public volatile String A0G = "";
    public volatile String A0H = "";
    public volatile String A0I = "";
    public volatile String A0J = "";

    public static synchronized AtomicLong A04(C07540Tm r2, C07530Tl r3) {
        AtomicLong atomicLong;
        synchronized (r2) {
            if (!r2.A0B.containsKey(r3)) {
                r2.A0B.put(r3, new AtomicLong());
            }
            atomicLong = (AtomicLong) r2.A0B.get(r3);
        }
        return atomicLong;
    }

    public final synchronized C07590Tr A07(Class cls) {
        String name;
        Object obj;
        try {
            name = cls.getName();
            if (!this.A0C.containsKey(name)) {
                if (cls == AnonymousClass063.class) {
                    obj = new AnonymousClass063(this.A02, this.A0A, this.A05, this.A04, this.A0D);
                } else if (cls == C031905y.class) {
                    obj = new C031905y(this.A02, this.A0A, this.A05, this.A04, this.A0D);
                } else if (cls == C032005z.class) {
                    obj = new C032005z(this.A02, this.A0A, this.A05, this.A04, this.A0D);
                } else {
                    obj = (C07590Tr) cls.newInstance();
                }
                this.A0C.put(name, obj);
            }
        } catch (Exception e) {
            throw new RuntimeException("Incorrect stat category used:", e);
        }
        return (C07590Tr) this.A0C.get(name);
    }

    public static AnonymousClass062 A00(C07540Tm r6) {
        String str;
        String str2;
        String upperCase;
        String str3;
        String upperCase2;
        String str4;
        String upperCase3;
        String str5;
        AnonymousClass062 r2 = (AnonymousClass062) r6.A07(AnonymousClass062.class);
        r2.A02(C10850dy.ServiceName, r6.A0A);
        r2.A02(C10850dy.ClientCoreName, r6.A0F);
        r2.A02(C10850dy.NotificationStoreName, r6.A0H);
        SharedPreferences A002 = AnonymousClass0T9.A00(r6.A02, Constants.ONE);
        r2.A02(C10850dy.YearClass, String.valueOf(A002.getInt("year_class", 0)));
        r2.A02(C10850dy.MqttGKs, A03(r6.A03.A00(Constants.A15).A01()));
        r2.A02(C10850dy.MqttFlags, A03(AnonymousClass0T9.A00(r6.A02, Constants.A0Y).getAll()));
        AnonymousClass0TQ r0 = r6.A06;
        if (r0 != null) {
            C10850dy r1 = C10850dy.AppState;
            if (((Boolean) r0.get()).booleanValue()) {
                str5 = "fg";
            } else {
                str5 = "bg";
            }
            r2.A02(r1, str5);
        }
        C10850dy r12 = C10850dy.ScreenState;
        if (r6.A09.A00()) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r2.A02(r12, str);
        C07400Sy A003 = r6.A07.A00("phone", TelephonyManager.class);
        C10850dy r13 = C10850dy.Country;
        if (A003.A01()) {
            str2 = ((TelephonyManager) A003.A00()).getNetworkCountryIso();
        } else {
            str2 = "";
        }
        if (str2 == null) {
            upperCase = null;
        } else {
            upperCase = str2.toUpperCase();
        }
        r2.A02(r13, upperCase);
        C10850dy r3 = C10850dy.NetworkType;
        NetworkInfo A022 = r6.A08.A02();
        if (A022 == null || TextUtils.isEmpty(A022.getTypeName())) {
            str3 = NetInfoModule.CONNECTION_TYPE_NONE;
        } else {
            str3 = A022.getTypeName();
        }
        if (str3 == null) {
            upperCase2 = null;
        } else {
            upperCase2 = str3.toUpperCase();
        }
        r2.A02(r3, upperCase2);
        C10850dy r32 = C10850dy.NetworkSubtype;
        NetworkInfo A023 = r6.A08.A02();
        if (A023 == null || TextUtils.isEmpty(A023.getSubtypeName())) {
            str4 = NetInfoModule.CONNECTION_TYPE_NONE;
        } else {
            str4 = A023.getSubtypeName();
        }
        if (str4 == null) {
            upperCase3 = null;
        } else {
            upperCase3 = str4.toUpperCase();
        }
        r2.A02(r32, upperCase3);
        r2.A02(C10850dy.IsEmployee, Boolean.valueOf(A002.getBoolean("is_employee", false)));
        r2.A02(C10850dy.ValidCompatibleApps, r6.A0J);
        r2.A02(C10850dy.EnabledCompatibleApps, r6.A0G);
        r2.A02(C10850dy.RegisteredApps, r6.A0I);
        return r2;
    }

    private AnonymousClass060 A01(long j) {
        AnonymousClass060 r4 = (AnonymousClass060) A07(AnonymousClass060.class);
        ((AtomicLong) r4.A00(C10760dp.MqttDurationMs)).set(j);
        AtomicLong atomicLong = (AtomicLong) r4.A00(C10760dp.NetworkDurationMs);
        long j2 = this.A08.A05.get();
        long j3 = 0;
        if (j2 != 0) {
            j3 = SystemClock.elapsedRealtime() - j2;
        }
        atomicLong.set(j3);
        AtomicLong atomicLong2 = (AtomicLong) r4.A00(C10760dp.NetworkTotalDurationMs);
        AnonymousClass0UC r1 = this.A08;
        long j4 = r1.A04.get();
        long j5 = r1.A05.get();
        long j6 = 0;
        if (j5 != 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        atomicLong2.set(j4 + j6);
        ((AtomicLong) r4.A00(C10760dp.ServiceDurationMs)).set(SystemClock.elapsedRealtime() - A04(this, C07530Tl.A01).get());
        return r4;
    }

    public static String A03(Map map) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(";");
            }
            sb.append((String) entry.getKey());
            sb.append("|");
            sb.append(String.valueOf(entry.getValue()));
        }
        return sb.toString();
    }

    public final C07510Tj A05(long j) {
        return new C07510Tj(A00(this), A01(j), (AnonymousClass064) null, (AnonymousClass061) A07(AnonymousClass061.class), (C07550Tn) null, (AnonymousClass063) null, (C031905y) null, (C032005z) null, true, false);
    }

    public final C07510Tj A06(long j, boolean z) {
        return new C07510Tj(A00(this), A01(j), (AnonymousClass064) A07(AnonymousClass064.class), (AnonymousClass061) null, this.A00.A00(z), (AnonymousClass063) A07(AnonymousClass063.class), (C031905y) A07(C031905y.class), (C032005z) A07(C032005z.class), false, true);
    }

    public final void A08(String str, String str2, String str3, boolean z) {
        boolean booleanValue;
        StringBuilder sb;
        String str4;
        String str5;
        char c;
        String str6 = str;
        AnonymousClass0TQ r0 = this.A06;
        if (r0 == null) {
            booleanValue = false;
        } else {
            booleanValue = ((Boolean) r0.get()).booleanValue();
        }
        AnonymousClass0XL r6 = AnonymousClass0XL.A02;
        boolean z2 = false;
        if (SystemClock.elapsedRealtime() - r6.A00 > 17000) {
            z2 = true;
        }
        String str7 = r6.A01;
        if (str7 != null && ((!z && AnonymousClass0W6.PINGREQ.name().equals(str6)) || (z && AnonymousClass0W6.PINGRESP.name().equals(str6)))) {
            str6 = AnonymousClass000.A0J(str6, "_", str7);
        }
        if (booleanValue) {
            sb = new StringBuilder();
            sb.append(str6);
            str4 = "_FG";
        } else {
            sb = new StringBuilder();
            sb.append(str6);
            str4 = "_BG";
        }
        sb.append(str4);
        String sb2 = sb.toString();
        String str8 = "fg";
        if (z2) {
            str5 = "rw";
            if (!booleanValue) {
                ((C031905y) A07(C031905y.class)).A03(1, "tc", "bg", str5, str3);
            }
            ((C031905y) A07(C031905y.class)).A03(1, "tc", str8, str5, str3);
        } else {
            str5 = "nw";
            if (!booleanValue) {
                ((C031905y) A07(C031905y.class)).A03(1, "tc", "bg", str5, str3);
            }
            ((C031905y) A07(C031905y.class)).A03(1, "tc", str8, str5, str3);
        }
        if (!booleanValue) {
            str8 = "bg";
        }
        String str9 = str2;
        if (TextUtils.isEmpty(str9)) {
            c = 1;
        } else if (str9.startsWith("/")) {
            c = 1;
            sb2 = str9.substring(1);
        } else {
            c = 1;
            sb2 = str9;
        }
        String[] strArr = new String[2];
        strArr[0] = sb2;
        strArr[c] = str8;
        ((C032005z) A07(C032005z.class)).A03(1, strArr);
        r6.A00 = SystemClock.elapsedRealtime();
    }

    public C07540Tm(Context context, AnonymousClass0TY r3, String str, AnonymousClass0UC r5, AnonymousClass0UE r6, RealtimeSinceBootClock realtimeSinceBootClock, C10930e7 r8, AnonymousClass0TQ r9, boolean z, C10960eC r11) {
        this.A02 = context;
        this.A07 = r3;
        this.A0A = str;
        this.A08 = r5;
        this.A09 = r6;
        this.A00 = new C07560To(context, realtimeSinceBootClock);
        this.A05 = r8;
        this.A04 = realtimeSinceBootClock;
        this.A06 = r9;
        this.A0B = new HashMap();
        this.A0C = new HashMap();
        this.A0D = z;
        this.A03 = r11;
    }

    public static String A02(List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (A0K.containsKey(str)) {
                listIterator.set(String.valueOf(A0K.get(str)));
            } else {
                AnonymousClass0DB.A0K("MqttHealthStatsHelper", "appPkgName %s not found in encoding map", str);
            }
        }
        return TextUtils.join(";", list);
    }
}
