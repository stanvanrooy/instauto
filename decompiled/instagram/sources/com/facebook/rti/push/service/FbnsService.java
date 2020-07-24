package com.facebook.rti.push.service;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass060;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0T9;
import p000X.AnonymousClass0TL;
import p000X.AnonymousClass0TQ;
import p000X.AnonymousClass0TR;
import p000X.AnonymousClass0TT;
import p000X.AnonymousClass0TU;
import p000X.AnonymousClass0TV;
import p000X.AnonymousClass0TZ;
import p000X.AnonymousClass0UM;
import p000X.AnonymousClass0UP;
import p000X.AnonymousClass0UR;
import p000X.AnonymousClass0V7;
import p000X.AnonymousClass0VA;
import p000X.AnonymousClass0VB;
import p000X.AnonymousClass0VF;
import p000X.AnonymousClass0VH;
import p000X.AnonymousClass0VO;
import p000X.AnonymousClass0WB;
import p000X.AnonymousClass0X1;
import p000X.AnonymousClass0X2;
import p000X.AnonymousClass0X6;
import p000X.AnonymousClass0X7;
import p000X.AnonymousClass0X8;
import p000X.AnonymousClass0X9;
import p000X.AnonymousClass0XA;
import p000X.AnonymousClass0XB;
import p000X.AnonymousClass0XC;
import p000X.AnonymousClass0XD;
import p000X.AnonymousClass0XF;
import p000X.AnonymousClass0XG;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZP;
import p000X.C07200Sd;
import p000X.C07410Sz;
import p000X.C07440Tc;
import p000X.C07540Tm;
import p000X.C07870Ut;
import p000X.C07890Uv;
import p000X.C07930Uz;
import p000X.C08000Vg;
import p000X.C08040Vk;
import p000X.C08090Vp;
import p000X.C08310Wn;
import p000X.C08400Ww;
import p000X.C08410Wx;
import p000X.C08420Wy;
import p000X.C08430Wz;
import p000X.C10010cW;
import p000X.C10020cX;
import p000X.C10040cZ;
import p000X.C10050ca;
import p000X.C10060cb;
import p000X.C10070cc;
import p000X.C10080cd;
import p000X.C10090ce;
import p000X.C10100cf;
import p000X.C10110cg;
import p000X.C10120ch;
import p000X.C10130ci;
import p000X.C10140cj;
import p000X.C10150ck;
import p000X.C10160cl;
import p000X.C10170cm;
import p000X.C10180cn;
import p000X.C10290cy;
import p000X.C10380dD;
import p000X.C10460dL;
import p000X.C10470dM;
import p000X.C10480dN;
import p000X.C10760dp;
import p000X.C10960eC;
import p000X.C10970eD;
import p000X.C10980eE;
import p000X.C10990eF;
import p000X.C11000eG;
import p000X.C11030eJ;

public class FbnsService extends C10480dN {
    public static FbnsService A09;
    public static final List A0A = new AnonymousClass0XA();
    public static final List A0B = new AnonymousClass0XB();
    public AnonymousClass0UR A00;
    public AnonymousClass0X1 A01;
    public C10140cj A02;
    public C10130ci A03;
    public AnonymousClass0X9 A04;
    public AnonymousClass0XC A05;
    public AnonymousClass0XG A06;
    public String A07;
    public final IFbnsAIDLService.Stub A08 = new IFbnsAIDLService.Stub() {
        public final Map A00;

        {
            int A03 = AnonymousClass0Z0.A03(-1610380407);
            HashMap hashMap = new HashMap();
            this.A00 = hashMap;
            C08310Wn r0 = C08310Wn.GET_PREF_BASED_CONFIG;
            AnonymousClass0X2 r2 = C10010cW.A02;
            hashMap.put(r0, r2);
            this.A00.put(C08310Wn.SET_PREF_BASED_CONFIG, r2);
            Map map = this.A00;
            C08310Wn r1 = C08310Wn.GET_APPS_STATISTICS;
            map.put(r1, new C10180cn());
            Map map2 = this.A00;
            AnonymousClass0X2 r22 = C10010cW.A01;
            map2.put(r1, r22);
            this.A00.put(C08310Wn.GET_ANALYTICS_CONFIG, r22);
            this.A00.put(C08310Wn.SET_ANALYTICS_CONFIG, r22);
            this.A00.put(C08310Wn.GET_FLYTRAP_REPORT, new C10040cZ());
            Map map3 = this.A00;
            C08310Wn r02 = C08310Wn.GET_PREF_IDS;
            AnonymousClass0X2 r23 = C10010cW.A03;
            map3.put(r02, r23);
            this.A00.put(C08310Wn.SET_PREF_IDS, r23);
            AnonymousClass0Z0.A0A(887030966, A03);
        }

        private AnonymousClass0X2 A00(FbnsAIDLRequest fbnsAIDLRequest, boolean z) {
            IllegalArgumentException illegalArgumentException;
            int i;
            int i2;
            int A03 = AnonymousClass0Z0.A03(-1209262015);
            if (fbnsAIDLRequest == null || (i2 = fbnsAIDLRequest.A00) < 0) {
                AnonymousClass0DB.A0D("FbnsService", "Invalid FbnsAIDLRequest");
                illegalArgumentException = new IllegalArgumentException("FbnsService received invalid FbnsAIDLRequest");
                i = -81278191;
            } else {
                C08310Wn r4 = (C08310Wn) C08310Wn.A02.get(Integer.valueOf(i2));
                if (r4 == null) {
                    r4 = C08310Wn.NOT_EXIST;
                }
                if (r4 == C08310Wn.NOT_EXIST) {
                    illegalArgumentException = new IllegalArgumentException("FbnsService operation not found");
                    i = 1808603397;
                } else if (r4.A01 == z) {
                    AnonymousClass0X2 r1 = (AnonymousClass0X2) this.A00.get(r4);
                    if (r1 != null) {
                        AnonymousClass0Z0.A0A(-2098459803, A03);
                        return r1;
                    }
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("FbnsService does not implement operation" + r4);
                    AnonymousClass0Z0.A0A(-1264357490, A03);
                    throw illegalArgumentException2;
                } else {
                    AnonymousClass0DB.A0D("FbnsService", "FbnsAIDLOperation incorrect return type");
                    illegalArgumentException = new IllegalArgumentException("FbnsService operation incorrect return type");
                    i = 1328292942;
                }
            }
            AnonymousClass0Z0.A0A(i, A03);
            throw illegalArgumentException;
        }

        public final FbnsAIDLResult BYm(FbnsAIDLRequest fbnsAIDLRequest) {
            int A03 = AnonymousClass0Z0.A03(-242637195);
            AnonymousClass0X2 A002 = A00(fbnsAIDLRequest, true);
            FbnsService fbnsService = FbnsService.this;
            Bundle bundle = fbnsAIDLRequest.A00;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            FbnsAIDLResult fbnsAIDLResult = new FbnsAIDLResult(A002.ACN(fbnsService, bundle));
            AnonymousClass0Z0.A0A(-1500551814, A03);
            return fbnsAIDLResult;
        }

        public final void BsK(FbnsAIDLRequest fbnsAIDLRequest) {
            int A03 = AnonymousClass0Z0.A03(809272888);
            AnonymousClass0X2 A002 = A00(fbnsAIDLRequest, false);
            FbnsService fbnsService = FbnsService.this;
            Bundle bundle = fbnsAIDLRequest.A00;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            A002.ACQ(fbnsService, bundle);
            AnonymousClass0Z0.A0A(-1208654520, A03);
        }
    };

    public final String A0E() {
        return "FBNS_ALWAYS";
    }

    public final void A0H() {
        Integer num = null;
        List<AnonymousClass0XF> A032 = this.A06.A03();
        this.A06.A04();
        this.A01.A00(Constants.A0B, String.valueOf(A032.size()));
        C10980eE A002 = this.A0A.A03.A00(Constants.A04);
        if (A002.A00.contains("DELIVERY_RETRY_INTERVAL")) {
            num = Integer.valueOf(A002.A00.getInt("DELIVERY_RETRY_INTERVAL", DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD));
        }
        A0O(C07440Tc.CREDENTIALS_UPDATED, new AnonymousClass0VA((Boolean) null, num));
        for (AnonymousClass0XF r3 : A032) {
            Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
            intent.putExtra("pkg_name", r3.A02);
            intent.putExtra("appid", r3.A01);
            intent.setClassName(getPackageName(), getClass().getName());
            A0V(intent);
        }
    }

    public final boolean A0U(Intent intent) {
        if (intent != null) {
            if (!getPackageName().equals(AnonymousClass0UR.A00(intent))) {
                this.A01.A03(intent.toString());
                return false;
            }
        }
        return true;
    }

    public final synchronized void A0Y(ArrayList arrayList) {
        for (AnonymousClass0XF r0 : this.A06.A03()) {
            arrayList.add(r0.A02);
        }
    }

    public static final Intent A00(String str, String str2, String str3) {
        Intent intent = new Intent("com.facebook.rti.fbns.intent.RECEIVE");
        intent.setPackage(str);
        intent.addCategory(str);
        intent.putExtra("receive_type", str2);
        if (str3 != null) {
            intent.putExtra("data", str3);
        }
        return intent;
    }

    private void A02(Integer num, AnonymousClass0X6 r16, String str) {
        AnonymousClass0X1 r4 = this.A01;
        AnonymousClass0X6 r0 = r16;
        String str2 = r0.A02;
        String str3 = r0.A04;
        long j = this.A00;
        boolean A002 = this.A07.A00();
        long j2 = this.A07.A03.get();
        Map A003 = C07200Sd.A00("event_type", C08420Wy.A00(num));
        String str4 = str;
        if (!TextUtils.isEmpty(str4)) {
            A003.put("event_extra_info", str4);
        }
        if (!TextUtils.isEmpty(str2)) {
            A003.put(TraceFieldType.IsBuffered, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A003.put("dpn", str3);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        A003.put("s_boot_ms", String.valueOf(elapsedRealtime));
        A003.put("s_svc_ms", String.valueOf(elapsedRealtime - r4.A00));
        A003.put("s_mqtt_ms", String.valueOf(elapsedRealtime - j));
        A003.put("s_net_ms", String.valueOf(elapsedRealtime - r4.A01.A05.get()));
        if (j2 > 0) {
            A003.put("is_scr_on", String.valueOf(A002));
            A003.put("s_scr_ms", String.valueOf(elapsedRealtime - j2));
        }
        r4.A04("fbns_message_event", A003);
    }

    private void A03(String str, String str2, String str3) {
        int i;
        AnonymousClass0XD r4 = new AnonymousClass0XD(str, str2, str3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tk", r4.A02);
            jSONObject.putOpt("pn", r4.A01);
            jSONObject.putOpt("aid", r4.A00);
            String jSONObject2 = jSONObject.toString();
            C10120ch r6 = new C10120ch(this);
            try {
                i = this.A09.A04("/fbns_unreg_req", jSONObject2.getBytes("UTF-8"), Constants.ONE, r6);
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException("UTF-8 not supported");
            } catch (C08040Vk unused2) {
                i = -1;
            }
            if (i == -1) {
                this.A01.A00(Constants.A08, (String) null);
            }
        } catch (JSONException e) {
            AnonymousClass0DB.A0M("FbnsService", e, "service/unregister/serialization_exception");
            this.A01.A00(Constants.A12, (String) null);
        }
    }

    public final void A0B(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            printWriter.println(AnonymousClass000.A0J("[ ", "FbnsService", " ]"));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            A0Z(arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            A0Y(arrayList3);
            printWriter.println("validCompatibleApps=" + arrayList);
            printWriter.println("enabledCompatibleApps=" + arrayList2);
            printWriter.println("registeredApps=" + arrayList3);
            printWriter.println("notificationCounter=" + this.A05.A01);
        } catch (Exception unused) {
        }
        super.A0B(fileDescriptor, printWriter, strArr);
    }

    public final C07930Uz A0C() {
        long j;
        FbnsService fbnsService = A09;
        if (fbnsService != null) {
            fbnsService.A0L();
        }
        A09 = this;
        this.A02 = new C10140cj(getApplicationContext());
        C10110cg r14 = new C10110cg(this);
        C10100cf r13 = new C10100cf(this);
        C10090ce r12 = new C10090ce(this);
        AnonymousClass0UR r10 = new AnonymousClass0UR(this);
        C10960eC r2 = new C10960eC(this);
        C10050ca r11 = new C10050ca(this, r2);
        this.A07 = r11.AKC();
        C10160cl r0 = new C10160cl(this);
        SharedPreferences A002 = AnonymousClass0T9.A00(this, Constants.ONE);
        int intValue = ((Integer) C08400Ww.LOGGING_ANALYTICS_EVENTS_SAMPLE_RATE.A00(A002, -1)).intValue();
        if (intValue < 0 || intValue > 10000) {
            boolean z = true;
            int i = 1;
            if (!(!AnonymousClass0TT.A00(this).A02)) {
                i = 10000;
            }
            if (new Random().nextInt(10000) >= i) {
                z = false;
            }
            Integer valueOf = Integer.valueOf(i);
            Boolean valueOf2 = Boolean.valueOf(z);
            SharedPreferences.Editor edit = A002.edit();
            C08400Ww.LOGGING_ANALYTICS_EVENTS_SAMPLE_RATE.A01(edit, valueOf);
            C08400Ww.LOG_ANALYTICS_EVENTS.A01(edit, valueOf2);
            edit.apply();
        }
        int intValue2 = ((Integer) C08400Ww.LOGGING_HEALTH_STATS_SAMPLE_RATE.A00(A002, -1)).intValue();
        int i2 = 10000;
        if (intValue2 < 0 || intValue2 > 10000) {
            if (!AnonymousClass0TT.A00(this).A02) {
                i2 = 1;
            }
            Integer valueOf3 = Integer.valueOf(i2);
            SharedPreferences.Editor edit2 = A002.edit();
            C08400Ww.LOGGING_HEALTH_STATS_SAMPLE_RATE.A01(edit2, valueOf3);
            edit2.apply();
        } else {
            i2 = intValue2;
        }
        try {
            j = Long.valueOf(Long.parseLong(A002.getString(C08400Ww.ANALYTIC_FB_UID.A01, (String) null)));
        } catch (NumberFormatException unused) {
            j = -1L;
        }
        boolean z2 = false;
        if (new Random().nextInt(10000) < i2) {
            z2 = true;
        }
        C10080cd r6 = new C10080cd(this, A002.getBoolean(C08400Ww.LOG_ANALYTICS_EVENTS.A01, false), A002);
        String A003 = AnonymousClass0VH.A00(A0D());
        C10070cc r5 = new C10070cc(this, r0);
        String AKC = r11.AKC();
        String AG3 = r11.AG3();
        AnonymousClass0TT A004 = AnonymousClass0TT.A00(this);
        AnonymousClass0TZ r15 = new AnonymousClass0TZ(this, A004, AG3, (Map) null);
        C10990eF r41 = new C10990eF(this, A003, r5, r6, A002, new C10970eD(AKC), r15.A01(), A004.A01, A004.A00);
        C10380dD r28 = new C10380dD();
        Integer A0D = A0D();
        C07890Uv r18 = new C07890Uv();
        C07870Ut r8 = this.A0D;
        C10020cX r62 = new C10020cX(r2);
        C10290cy r22 = new C10290cy();
        Handler handler = new Handler(Looper.getMainLooper());
        C11030eJ r27 = new C11030eJ();
        C10140cj r7 = this.A02;
        C07870Ut r19 = r8;
        C10050ca r20 = r11;
        C10020cX r21 = r62;
        AnonymousClass0V7 r152 = new AnonymousClass0V7(this, A0D, r18, r19, r20, r21, r22, r0, (AnonymousClass0TQ) null, r14, handler, r27, r28, r41, r12, r13, new C10150ck(r0), new C08000Vg(), "567310203415052", r12, r2, z2, (Map) null, r7, j, (AnonymousClass0QT) null);
        C10170cm r02 = new C10170cm();
        r02.A01(r10, r152);
        return r02;
    }

    public final Integer A0D() {
        return Constants.ONE;
    }

    public final void A0M(int i) {
        this.A03.A01().A00.set(((long) i) * 1000);
    }

    public final void A0Q(AnonymousClass0VO r8) {
        if (AnonymousClass0VO.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD.equals(r8)) {
            boolean z = false;
            if (System.currentTimeMillis() - this.A06.A00.A00(Constants.A0N).A00.getLong("auto_reg_retry", 0) > 86400000) {
                z = true;
            }
            if (z) {
                C11000eG A002 = this.A06.A00.A00(Constants.A0N).A00();
                A002.A00.putLong("auto_reg_retry", System.currentTimeMillis());
                A002.A00.apply();
                List<AnonymousClass0XF> A032 = this.A06.A03();
                this.A06.A04();
                this.A01.A00(Constants.A06, String.valueOf(A032.size()));
                for (AnonymousClass0XF r3 : A032) {
                    Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
                    intent.putExtra("pkg_name", r3.A02);
                    intent.putExtra("appid", r3.A01);
                    intent.setClassName(getPackageName(), getClass().getName());
                    A0V(intent);
                }
            }
        }
    }

    public final void A0R(AnonymousClass0WB r18) {
        super.A0R(r18);
        C10130ci r5 = this.A03;
        ArrayList<AnonymousClass0VF> arrayList = new ArrayList<>();
        ArrayList<AnonymousClass0VF> arrayList2 = new ArrayList<>();
        C10460dL A012 = r5.A01();
        synchronized (A012) {
            arrayList.clear();
            arrayList2.clear();
            Map<String, ?> all = A012.A01.getAll();
            SharedPreferences.Editor edit = A012.A01.edit();
            boolean z = false;
            for (Map.Entry next : all.entrySet()) {
                C10470dM A002 = C10470dM.A00(next.getValue());
                if (A002 != null) {
                    long j = A002.A01;
                    if (j + 86400000 >= System.currentTimeMillis() && j <= System.currentTimeMillis()) {
                        if (A002.A00 + A012.A00.get() < System.currentTimeMillis()) {
                            A002.A00 = System.currentTimeMillis();
                            arrayList.add(A002);
                            edit.putString(A002.A01, A002.A01());
                            z = true;
                        }
                    }
                }
                edit.remove((String) next.getKey());
                if (A002 != null) {
                    arrayList2.add(A002);
                }
                z = true;
            }
            if (z) {
                edit.apply();
            }
        }
        for (AnonymousClass0VF r0 : arrayList2) {
            if (r0 != null) {
                String str = r0.A01;
                Intent intent = r0.A00;
                if (intent != null) {
                    r5.A04(str, intent.getPackage(), AnonymousClass0UM.DATA_EXPIRED);
                }
            }
        }
        int i = 0;
        for (AnonymousClass0VF r2 : arrayList) {
            r5.A03(r2.A01, r2.A00);
            if (r5.A05(r2)) {
                i++;
            }
        }
        ((AtomicLong) ((AnonymousClass060) this.A05.A07(AnonymousClass060.class)).A00(C10760dp.FbnsLiteNotificationDeliveryRetried)).addAndGet((long) i);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x03a4 */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a4 A[SYNTHETIC, Splitter:B:114:0x03a4] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03a8 A[Catch:{ all -> 0x03b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x024a A[Catch:{ UnsupportedEncodingException -> 0x037f, JSONException -> 0x0387 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0260 A[Catch:{ UnsupportedEncodingException -> 0x037f, JSONException -> 0x0387 }] */
    public final void A0S(String str, byte[] bArr, int i, long j, AnonymousClass0TV r29) {
        PowerManager.WakeLock wakeLock;
        String str2;
        boolean z;
        AnonymousClass0UM A002;
        boolean z2;
        String str3 = str;
        byte[] bArr2 = bArr;
        AnonymousClass0TV r3 = r29;
        super.A0S(str3, bArr2, i, j, r3);
        if (bArr == null) {
            AnonymousClass0DB.A0J("FbnsService", "receive/publish/empty_payload; topic=%s", str);
            wakeLock = r3.A00;
            if (wakeLock == null) {
                return;
            }
        } else {
            try {
                String str4 = new String(bArr2, "UTF-8");
                str2 = str4;
                if ("/fbns_msg".equals(str3) || "/fbns_msg_hp".equals(str3)) {
                    AnonymousClass0X6 r7 = new AnonymousClass0X6();
                    JSONObject jSONObject = new JSONObject(str4);
                    r7.A06 = jSONObject.optString("token");
                    r7.A01 = jSONObject.optString("ck");
                    r7.A04 = jSONObject.optString("pn");
                    r7.A00 = jSONObject.optString("cp");
                    r7.A05 = jSONObject.optString("fbpushnotif");
                    r7.A03 = jSONObject.optString("nid");
                    r7.A02 = jSONObject.optString("bu");
                    A02(Constants.ZERO, r7, r7.A03);
                    this.A02.Aj2(AnonymousClass000.A0N("===Received Notif: target = ", r7.A04, "; notifId = ", r7.A03));
                    AnonymousClass0XC r2 = this.A05;
                    if (!TextUtils.isEmpty(r7.A03)) {
                        Pair pair = new Pair(r7.A03, r7.A04);
                        if (r2.A00.contains(pair)) {
                            z = true;
                            if (!z) {
                                A02(Constants.ONE, r7, r7.A03);
                                this.A02.Aj2(AnonymousClass000.A0E("Duplicated Notif: notifId = ", r7.A03));
                            } else {
                                Intent A003 = A00(r7.A04, DialogModule.KEY_MESSAGE, r7.A05);
                                if (!TextUtils.isEmpty(r7.A06)) {
                                    A003.putExtra("token", r7.A06);
                                }
                                if (!TextUtils.isEmpty(r7.A00)) {
                                    A003.putExtra("collapse_key", r7.A00);
                                }
                                C10130ci r9 = this.A03;
                                String str5 = r7.A03;
                                if (TextUtils.isEmpty(str5)) {
                                    r9.A00.A01.A02(Constants.A0j, (String) null, (String) null);
                                    A002 = AnonymousClass0UM.DATA_INVALID;
                                } else {
                                    String str6 = A003.getPackage();
                                    if (TextUtils.isEmpty(str6)) {
                                        FbnsService fbnsService = r9.A00;
                                        fbnsService.A01.A02(Constants.A0u, str5, str6);
                                        fbnsService.A02.Aj2(AnonymousClass000.A0E("Error: invalid receiver = ", str6));
                                        A002 = AnonymousClass0UM.PACKAGE_INVALID;
                                    } else if (!C10130ci.A01.contains(str6)) {
                                        A002 = AnonymousClass0UM.PACKAGE_UNSUPPORTED;
                                    } else {
                                        A003.putExtra("extra_notification_sender", r9.A02.getPackageName());
                                        A003.putExtra("extra_notification_id", str5);
                                        C10460dL A012 = r9.A01();
                                        Intent intent = A003;
                                        synchronized (A012) {
                                            if (!A012.A01.contains(str5)) {
                                                long currentTimeMillis = System.currentTimeMillis();
                                                String A013 = new C10470dM(intent, str5, currentTimeMillis, currentTimeMillis).A01();
                                                if (!TextUtils.isEmpty(A013)) {
                                                    A012.A01.edit().putString(str5, A013).apply();
                                                }
                                            }
                                        }
                                        A002 = C10130ci.A00(r9, A003);
                                        if (A002.A00()) {
                                            r9.A01().A00(str5);
                                            r9.A04(str5, str6, A002);
                                        } else if (!A002.A01()) {
                                        }
                                    }
                                }
                                if (!A002.A01()) {
                                    if (A002 == AnonymousClass0UM.PACKAGE_UNSUPPORTED) {
                                        String packageName = getBaseContext().getPackageName();
                                        String str7 = r7.A04;
                                        if (packageName.equals(str7)) {
                                            this.A00.A04(A003, str7);
                                        }
                                    }
                                    String name = A002.name();
                                    A02(Constants.A0C, r7, name);
                                    this.A02.Aj2(AnonymousClass000.A0N("Error: Delivery helper failed notifId = ", r7.A03, "; reason = ", name));
                                }
                                C07540Tm r8 = this.A05;
                                String str8 = r7.A04;
                                r8.A01.putIfAbsent(str8, new AtomicLong());
                                ((AtomicLong) r8.A01.get(str8)).incrementAndGet();
                            }
                            wakeLock = r3.A00;
                            if (wakeLock != null) {
                                return;
                            }
                        } else {
                            r2.A00.add(pair);
                            if (r2.A00.size() > 100) {
                                r2.A00.removeFirst();
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                    try {
                        wakeLock = r3.A00;
                        if (wakeLock != null) {
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                } else {
                    if ("/fbns_reg_resp".equals(str3)) {
                        AnonymousClass0X8 r82 = new AnonymousClass0X8();
                        JSONObject jSONObject2 = new JSONObject(str4);
                        r82.A01 = jSONObject2.optString("pkg_name");
                        r82.A02 = jSONObject2.optString("token");
                        String optString = jSONObject2.optString("error");
                        r82.A00 = optString;
                        if (!TextUtils.isEmpty(optString)) {
                            if (TextUtils.isEmpty(r82.A01)) {
                                AnonymousClass0DB.A0D("FbnsService", "service/register/response/empty_package");
                            } else {
                                AnonymousClass0XG r1 = this.A06;
                                String str9 = r82.A01;
                                C07410Sz.A01(!TextUtils.isEmpty(str9));
                                C10980eE A004 = r1.A00.A00(Constants.A12);
                                AnonymousClass0XF A005 = AnonymousClass0XG.A00(str9, A004);
                                if (A005 == null) {
                                    AnonymousClass0DB.A0D("RegistrationState", "Missing entry");
                                } else {
                                    A005.A03 = "";
                                    A005.A00 = Long.valueOf(System.currentTimeMillis());
                                    AnonymousClass0XG.A01(str9, A005, A004);
                                }
                            }
                            this.A01.A00(Constants.A14, r82.A00);
                        } else if (TextUtils.isEmpty(r82.A01)) {
                            AnonymousClass0DB.A0D("FbnsService", "service/register/response/invalid");
                            this.A01.A00(Constants.A15, (String) null);
                        } else if (TextUtils.isEmpty(r82.A02)) {
                            AnonymousClass0DB.A0D("FbnsService", "service/register/response/empty_token");
                            this.A01.A00(Constants.A02, (String) null);
                        } else {
                            AnonymousClass0XG r72 = this.A06;
                            String str10 = r82.A01;
                            String str11 = r82.A02;
                            C07410Sz.A01(!TextUtils.isEmpty(str10));
                            C07410Sz.A01(!TextUtils.isEmpty(str11));
                            C11000eG A006 = r72.A00.A00(Constants.A0N).A00();
                            A006.A00.remove("auto_reg_retry");
                            A006.A00.apply();
                            C10980eE A007 = r72.A00.A00(Constants.A12);
                            AnonymousClass0XF A008 = AnonymousClass0XG.A00(str10, A007);
                            if (A008 == null) {
                                AnonymousClass0DB.A0D("RegistrationState", "Missing entry");
                                z2 = false;
                            } else {
                                A008.A03 = str11;
                                A008.A00 = Long.valueOf(System.currentTimeMillis());
                                z2 = AnonymousClass0XG.A01(str10, A008, A007);
                            }
                            if (z2) {
                                String str12 = r82.A01;
                                String str13 = r82.A02;
                                this.A04.A00(str12);
                                A0W(A00(str12, "registered", str13));
                                this.A01.A00(Constants.A0N, (String) null);
                            } else {
                                AnonymousClass0DB.A0D("FbnsService", "service/register/response/cache_update_failed");
                                this.A01.A00(Constants.A0Y, r82.A01);
                            }
                        }
                    } else if ("/fbns_exp_logging".equals(str3)) {
                        String optString2 = new JSONObject(str4).optString("beacon_id");
                        if (!TextUtils.isEmpty(optString2)) {
                            Long.parseLong(optString2);
                            try {
                                this.A09.A04("/fbns_exp_logging", str4.getBytes("UTF-8"), Constants.ZERO, (C08090Vp) null);
                            } catch (UnsupportedEncodingException unused2) {
                                throw new RuntimeException("UTF-8 not supported");
                            } catch (C08040Vk | NumberFormatException | JSONException ) {
                            }
                        }
                    } else {
                        AnonymousClass0DB.A0J("FbnsService", "receive/publish/wrong_topic; topic=%s", str);
                        this.A01.A01(Constants.ONE, str3);
                    }
                    wakeLock = r3.A00;
                    if (wakeLock != null) {
                    }
                }
            } catch (UnsupportedEncodingException unused3) {
                throw new RuntimeException("UTF-8 not supported");
            } catch (JSONException e) {
                AnonymousClass0DB.A0P("FbnsService", e, "receive/publish/payload_exception; topic=%s", str);
                this.A01.A01(Constants.ZERO, str3);
                this.A02.Aj2(AnonymousClass000.A0E("Error: invalid payload = ", str2));
            }
        }
        AnonymousClass0ZP.A02(wakeLock);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0146, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015f  */
    public final void A0V(Intent intent) {
        String str;
        String str2;
        String stringExtra = intent.getStringExtra("pkg_name");
        String stringExtra2 = intent.getStringExtra("appid");
        boolean booleanExtra = intent.getBooleanExtra("local_generation", false);
        this.A04.A00(stringExtra);
        if (!this.A0B.get()) {
            AnonymousClass0DB.A0D("FbnsService", "service/register/not_started");
            this.A01.A00(Constants.A0j, (String) null);
        }
        this.A01.A00(Constants.A07, stringExtra);
        String A022 = this.A06.A02(stringExtra);
        if (!TextUtils.isEmpty(A022)) {
            this.A04.A00(stringExtra);
            A0W(A00(stringExtra, "registered", A022));
            this.A01.A00(Constants.ZERO, (String) null);
            return;
        }
        if (booleanExtra && AnonymousClass0UP.A01(getPackageName())) {
            if (AnonymousClass0UP.A00.contains(stringExtra)) {
                String str3 = (String) this.A09.A0E.AOR().first;
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(this.A07)) {
                    C08410Wx r8 = new C08410Wx(this.A07, str3);
                    if (!TextUtils.isEmpty(r8.A01) && !TextUtils.isEmpty(r8.A00) && !TextUtils.isEmpty(stringExtra)) {
                        try {
                            str2 = Base64.encodeToString(("{" + "\"pn\":" + AnonymousClass000.A0J("\"", stringExtra, "\"") + "," + "\"di\":" + AnonymousClass000.A0J("\"", r8.A01, "\"") + "," + "\"ai\":" + "567310203415052" + "," + "\"ck\":" + AnonymousClass000.A0J("\"", r8.A00, "\"") + "}").getBytes(), 2);
                        } catch (AssertionError unused) {
                        }
                        if (str2 == null) {
                            str = "{" + "\"k\":" + AnonymousClass000.A0J("\"", str2, "\"") + "," + "\"v\":" + 0 + "," + "\"t\":" + AnonymousClass000.A0J("\"", "fbns-b64", "\"") + "}";
                        } else {
                            str = null;
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                }
            }
            str = null;
            if (!TextUtils.isEmpty(str)) {
                this.A04.A00(stringExtra);
                A0W(A00(stringExtra, "registered", str));
                return;
            }
        }
        A0X(stringExtra, stringExtra2, intent.getComponent().getClassName());
    }

    public final void A0Z(List list, List list2) {
        for (String A002 : AnonymousClass0UP.A00) {
            AnonymousClass0TL A003 = AnonymousClass0TR.A00(this, A002, 64);
            if (A003.A02 == Constants.A0Y || A003.A02 == Constants.A0C || A003.A02 == Constants.A0u) {
                list.add(A003.A00);
            }
            if (A003.A02 == Constants.A0u) {
                list2.add(A003.A00);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        intent.toString();
        AnonymousClass0UR r0 = this.A00;
        if (AnonymousClass0TR.A01(r0.A00, AnonymousClass0UR.A00(intent))) {
            return this.A08;
        }
        AnonymousClass0DB.A0J("FbnsService", "onBind invalid signature", intent.toString());
        this.A01.A03(intent.toString());
        return null;
    }

    public static String A01(String str) {
        if (AnonymousClass0UP.A01(str)) {
            return "com.facebook.oxygen.services.fbns.PreloadedFbnsService";
        }
        return FbnsService.class.getName();
    }

    public final void A09() {
        super.A09();
        if (A09 == this) {
            A09 = null;
        }
    }

    public final void A0F() {
        super.A0F();
        C07540Tm r1 = this.A05;
        this.A03.A01();
        r1.A0H = "S";
    }

    public final void A0G() {
        super.A0G();
        C10170cm r0 = (C10170cm) this.A0A;
        AnonymousClass0XG r5 = r0.A03;
        AnonymousClass0X1 r4 = r0.A01;
        AnonymousClass0X9 r3 = r0.A02;
        AnonymousClass0UR r2 = r0.A00;
        C10130ci r1 = new C10130ci(this, r2, r0.A05);
        this.A06 = r5;
        this.A01 = r4;
        this.A04 = r3;
        this.A05 = new AnonymousClass0XC();
        this.A00 = r2;
        this.A03 = r1;
    }

    public final void A0I() {
        super.A0I();
        C10130ci r1 = this.A03;
        if (r1.A00 == null) {
            AnonymousClass0VB r4 = new AnonymousClass0VB(r1);
            r1.A00 = r4;
            AnonymousClass0TU.A00.A07(r1.A02, r4, new IntentFilter("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK"), (Handler) null);
        }
    }

    public final void A0J() {
        super.A0J();
        C10130ci r3 = this.A03;
        BroadcastReceiver broadcastReceiver = r3.A00;
        if (broadcastReceiver != null) {
            AnonymousClass0TU.A00.A06(r3.A02, broadcastReceiver);
            r3.A00 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    public final void A0N(Intent intent, AnonymousClass0VA r13) {
        boolean z;
        String str;
        AnonymousClass0X1 r2;
        Integer num;
        super.A0N(intent, r13);
        String action = intent.getAction();
        if ("com.facebook.rti.fbns.intent.REGISTER".equals(action) || "com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action) || "com.facebook.rti.fbns.intent.UNREGISTER".equals(action)) {
            String stringExtra = intent.getStringExtra("pkg_name");
            String A002 = AnonymousClass0UR.A00(intent);
            if (TextUtils.isEmpty(stringExtra)) {
                AnonymousClass0DB.A0K("FbnsService", "Empty package name for %s from %s", action, A002);
                r2 = this.A01;
                num = Constants.A04;
            } else {
                if ("com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action)) {
                    stringExtra = getPackageName();
                }
                if (!stringExtra.equals(A002)) {
                    AnonymousClass0DB.A0K("FbnsService", "Package mismatch for %s from %s: packageName %s", action, A002, stringExtra);
                    r2 = this.A01;
                    num = Constants.A03;
                }
            }
            Map A003 = C07200Sd.A00("event_type", C08430Wz.A00(num));
            if (!TextUtils.isEmpty(action)) {
                A003.put("event_extra_info", action);
            }
            if (!TextUtils.isEmpty(A002)) {
                A003.put("spn", A002);
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                A003.put("dpn", stringExtra);
            }
            r2.A04("fbns_registration_event", A003);
            z = false;
            if (!z) {
                String action2 = intent.getAction();
                if ("com.facebook.rti.fbns.intent.REGISTER".equals(action2)) {
                    A0O(C07440Tc.FBNS_REGISTER, r13);
                    A0V(intent);
                } else if ("com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action2)) {
                    A0O(C07440Tc.FBNS_REGISTER_RETRY, r13);
                    A0X(intent.getStringExtra("pkg_name"), intent.getStringExtra("appid"), intent.getComponent().getClassName());
                } else if ("com.facebook.rti.fbns.intent.UNREGISTER".equals(action2)) {
                    A0O(C07440Tc.FBNS_UNREGISTER, r13);
                    String stringExtra2 = intent.getStringExtra("pkg_name");
                    String A022 = this.A06.A02(stringExtra2);
                    AnonymousClass0XG r1 = this.A06;
                    C07410Sz.A01(!TextUtils.isEmpty(stringExtra2));
                    AnonymousClass0XF A004 = AnonymousClass0XG.A00(stringExtra2, r1.A00.A00(Constants.A12));
                    if (A004 == null) {
                        str = null;
                    } else {
                        str = A004.A01;
                    }
                    AnonymousClass0XG r12 = this.A06;
                    C07410Sz.A01(!TextUtils.isEmpty(stringExtra2));
                    C10980eE A005 = r12.A00.A00(Constants.A12);
                    AnonymousClass0XF A006 = AnonymousClass0XG.A00(stringExtra2, A005);
                    if (A006 != null && !A006.A04) {
                        A006.A04 = true;
                        AnonymousClass0XG.A01(stringExtra2, A006, A005);
                    }
                    A0W(A00(stringExtra2, "unregistered", (String) null));
                    this.A01.A00(Constants.A05, (String) null);
                    if (!(A022 == null || str == null)) {
                        A03(A022, stringExtra2, str);
                    }
                } else {
                    AnonymousClass0DB.A0D("FbnsService", "service/doIntent/unrecognized_action");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                A0Z(arrayList, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                A0Y(arrayList3);
                C07540Tm r14 = this.A05;
                r14.A0J = C07540Tm.A02(arrayList);
                r14.A0G = C07540Tm.A02(arrayList2);
                r14.A0I = C07540Tm.A02(arrayList3);
                return;
            }
            return;
        }
        z = true;
        if (!z) {
        }
    }

    public final void A0W(Intent intent) {
        String str;
        String str2 = intent.getPackage();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (str2.equals(getPackageName()) || AnonymousClass0TR.A01(this.A00.A00, str2)) {
            this.A00.A04(intent, str2);
            return;
        }
        String A022 = this.A06.A02(str2);
        AnonymousClass0XG r1 = this.A06;
        C07410Sz.A01(!TextUtils.isEmpty(str2));
        AnonymousClass0XF A002 = AnonymousClass0XG.A00(str2, r1.A00.A00(Constants.A12));
        if (A002 == null) {
            str = null;
        } else {
            str = A002.A01;
        }
        if (A022 != null && str != null) {
            A03(A022, str2, str);
        }
    }

    public final void A0X(String str, String str2, String str3) {
        int i;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.A04.A01(str, str2, str3);
            AnonymousClass0XG r3 = this.A06;
            C07410Sz.A01(!TextUtils.isEmpty(str));
            C07410Sz.A01(!TextUtils.isEmpty(str2));
            AnonymousClass0XF r2 = new AnonymousClass0XF();
            r2.A02 = str;
            r2.A01 = str2;
            r2.A00 = Long.valueOf(System.currentTimeMillis());
            AnonymousClass0XG.A01(str, r2, r3.A00.A00(Constants.A12));
            AnonymousClass0X7 r4 = new AnonymousClass0X7(str, str2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("pkg_name", r4.A01);
                jSONObject.putOpt("appid", r4.A00);
                String jSONObject2 = jSONObject.toString();
                C10060cb r6 = new C10060cb(this);
                try {
                    i = this.A09.A04("/fbns_reg_req", jSONObject2.getBytes("UTF-8"), Constants.ONE, r6);
                } catch (UnsupportedEncodingException unused) {
                    throw new RuntimeException("UTF-8 not supported");
                } catch (C08040Vk unused2) {
                    i = -1;
                }
                if (i == -1) {
                    this.A01.A00(Constants.A0u, (String) null);
                }
            } catch (JSONException e) {
                AnonymousClass0DB.A0M("FbnsService", e, "service/register/serialize_exception");
                this.A01.A00(Constants.A12, (String) null);
            }
        }
    }

    public final void onCreate() {
        int A042 = AnonymousClass0Z0.A04(-1022325934);
        super.onCreate();
        AnonymousClass0Z0.A0B(-1752820605, A042);
    }
}
