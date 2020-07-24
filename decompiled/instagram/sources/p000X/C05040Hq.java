package p000X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Hq  reason: invalid class name and case insensitive filesystem */
public final class C05040Hq implements C06570Po {
    public final long A00;
    public final Context A01;
    public final C13760jB A02;
    public final QuickExperimentDebugStore A03;
    public final AnonymousClass0LP A04;
    public final AnonymousClass0LB A05;
    public final Set A06;
    public final Set A07;

    public final AnonymousClass0PL A00(C06590Pq r5) {
        AnonymousClass0LB r3 = this.A05;
        return AnonymousClass0LB.A01(r3, this.A01, r5, true, new AnonymousClass0LC(r3));
    }

    public final List A01() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : Collections.unmodifiableMap(this.A04.mExperiments).entrySet()) {
            for (Map.Entry entry2 : ((C05720Lr) entry.getValue()).A00().entrySet()) {
                String overriddenParameter = this.A03.getOverriddenParameter((String) entry.getKey(), (String) entry2.getKey());
                String str = (String) entry.getKey();
                String str2 = (String) entry2.getKey();
                boolean z = false;
                if (overriddenParameter != null) {
                    z = true;
                }
                if (overriddenParameter == null) {
                    overriddenParameter = (String) entry2.getValue();
                }
                arrayList.add(new AnonymousClass41L(str, str2, z, overriddenParameter, ((C05720Lr) entry.getValue()).A00, AnonymousClass13O.QUICK_EXPERIMENT));
            }
        }
        return arrayList;
    }

    public final void A02(C06590Pq r15) {
        AnonymousClass0LB r7 = this.A05;
        if (r15.AgN()) {
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass0C1 A022 = C05210Iq.A02(r15);
            long j = C16180oA.A00(A022).A00.getLong("qe_last_consistency_check_time_ms", 0);
            if (!r7.A06.isEmpty() && ((Boolean) AnonymousClass0L6.A00(r15, AnonymousClass0L7.QE_VALUE_CONSISTENCY_CHECKER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() && (currentTimeMillis > ((long) (((Integer) AnonymousClass0L6.A00(r15, AnonymousClass0L7.QE_VALUE_CONSISTENCY_CHECKER, "time_interval_in_secs", 86400, (AnonymousClass04H) null)).intValue() * 1000)) + j || currentTimeMillis < j)) {
                try {
                    AnonymousClass0LA r0 = r7.A04;
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : r0.A00.entrySet()) {
                        StringWriter stringWriter = new StringWriter();
                        C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                        AnonymousClass0LN.A00(A052, (AnonymousClass0LO) entry.getValue());
                        A052.close();
                        jSONObject.put((String) entry.getKey(), new JSONObject(stringWriter.toString()));
                    }
                    String jSONObject2 = jSONObject.toString();
                    String str = r7.A05;
                    boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(A022, AnonymousClass0L7.CLIENT_CONFIG_REALTIME_SUBSCRIPTION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                    C15890nh r4 = new C15890nh(r15);
                    r4.A09 = Constants.ONE;
                    r4.A0C = "qe/check_consistency/";
                    r4.A09("id", str);
                    r4.A09("serialized_configs", jSONObject2);
                    r4.A0C("is_realtime_subscription_enabled", booleanValue);
                    r4.A06(AnonymousClass1N4.class, false);
                    r4.A0G = true;
                    C17850qu A032 = r4.A03();
                    A032.A00 = new AnonymousClass0LG(r7);
                    C12810hQ.A02(A032);
                    C16180oA.A00(A022).A00.edit().putLong("qe_last_consistency_check_time_ms", currentTimeMillis).apply();
                } catch (IOException | JSONException unused) {
                }
            }
        }
        this.A02.A03(r15, this.A06);
    }

    public final void A05(C06590Pq r5, Set set, Set set2) {
        AnonymousClass0LB r3 = this.A05;
        Context context = this.A01;
        C25896Bbk A012 = AnonymousClass93S.A01(set, this.A07);
        if (!A012.isEmpty()) {
            C17850qu A002 = AnonymousClass0LB.A00(context, r5, r3.A05, A012);
            A002.A00 = new AnonymousClass0LF(r3, A012);
            C12810hQ.A02(A002);
        }
        this.A02.A04(r5, AnonymousClass93S.A01(set2, this.A06));
    }

    public final void onUserSessionWillEnd(boolean z) {
        String createSharedPreferencesKey = AnonymousClass0LP.createSharedPreferencesKey(this.A04.A02);
        synchronized (C13740j9.class) {
            C13740j9 r2 = (C13740j9) C13740j9.A04.get(createSharedPreferencesKey);
            if (r2 != null) {
                AnonymousClass0Q7.A03().A0D(r2.A01);
                C13740j9.A04.remove(createSharedPreferencesKey);
                r2.A07();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    public C05040Hq(Context context, String str, Set set, Set set2) {
        AnonymousClass0LA r4;
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        C06180Ob r8 = C06190Oc.A00;
        this.A07 = set;
        String str2 = str;
        File file = new File(applicationContext.getFilesDir(), AnonymousClass000.A0E("qe_cache2_", str));
        Set set3 = this.A07;
        synchronized (AnonymousClass0LB.class) {
            try {
                C13080hr A072 = C12890hY.A00.A07(file);
                A072.A0p();
                r4 = AnonymousClass0L9.parseFromJson(A072);
                A072.close();
            } catch (FileNotFoundException unused) {
            } catch (IOException e) {
                AnonymousClass0QD.A05("QuickExperimentStore", "Error while reading file - not loading cache", e);
            } catch (Throwable ) {
                throw th;
            }
        }
        this.A05 = new AnonymousClass0LB(r4 == null ? new AnonymousClass0LA() : r4, file, str2, set3, r8);
        this.A03 = QuickExperimentDebugStoreManager.getOverrideStore(this.A01.getFilesDir());
        this.A04 = new AnonymousClass0LP(str, this.A05, r8);
        this.A02 = new C13760jB(str, new C13770jC(context.getFilesDir(), str), this.A03, r8);
        this.A06 = set2;
        this.A00 = System.currentTimeMillis();
        return;
        r4 = null;
        this.A05 = new AnonymousClass0LB(r4 == null ? new AnonymousClass0LA() : r4, file, str2, set3, r8);
        this.A03 = QuickExperimentDebugStoreManager.getOverrideStore(this.A01.getFilesDir());
        this.A04 = new AnonymousClass0LP(str, this.A05, r8);
        this.A02 = new C13760jB(str, new C13770jC(context.getFilesDir(), str), this.A03, r8);
        this.A06 = set2;
        this.A00 = System.currentTimeMillis();
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r2 > (r0 + 7200000)) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (p000X.AnonymousClass0LH.A02 != null) goto L_0x000f;
     */
    public final void A03(C06590Pq r11, String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!AnonymousClass0LR.A01()) {
            if (AnonymousClass0LH.A03 == null) {
                z = false;
            }
            z = true;
            if (!z) {
                AnonymousClass0LP r4 = this.A04;
                C05720Lr A002 = AnonymousClass0LP.A00(r4, str);
                if (!A002.A04.contains(str2) || (A002.A02 == null && TextUtils.isEmpty(A002.A01))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = A002.A05.get();
                    if (elapsedRealtime >= j) {
                        z3 = false;
                    }
                    z3 = true;
                    if (z3 && A002.A05.compareAndSet(j, elapsedRealtime)) {
                        r4.A00.A0B(str, elapsedRealtime);
                        AnonymousClass0QV r2 = AnonymousClass0QV.A03;
                        AnonymousClass0a4.A0C(true, "must set one of mModuleName or mAnalyticsModule");
                        C44201vl r22 = new C44201vl(new AnonymousClass0QT(r11, (AnonymousClass0RN) null, r2).A02("ig_qe_exposure"));
                        r22.A08("id", r4.A02);
                        r22.A08("experiment", str);
                        r22.A08("group", A002.A01);
                        String str3 = A002.A02;
                        if (str3 != null) {
                            r22.A08("logging_id", str3);
                        }
                        r22.A01();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (A002.A00 == 0) {
                            A002.A00 = currentTimeMillis;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r0 > (r2 + 7200000)) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (p000X.AnonymousClass0LH.A02 != null) goto L_0x000f;
     */
    public final void A04(C06590Pq r12, String str, String str2) {
        boolean z;
        boolean z2;
        if (!AnonymousClass0LR.A01()) {
            if (AnonymousClass0LH.A03 == null) {
                z = false;
            }
            z = true;
            if (!z) {
                C13760jB r10 = this.A02;
                C13870jM A002 = r10.A00.A00(str, str2);
                if (A002 != null) {
                    List list = A002.A04;
                    long j = A002.A05.get();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (!list.isEmpty()) {
                        if (elapsedRealtime >= j) {
                            z2 = false;
                        }
                        z2 = true;
                        if (z2 && A002.A05.compareAndSet(j, elapsedRealtime)) {
                            r10.sendExposure(r12, str, list);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (A002.A00 == 0) {
                                A002.A00 = currentTimeMillis;
                            }
                        }
                    }
                }
            }
        }
    }
}
