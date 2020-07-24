package p000X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.0jB  reason: invalid class name and case insensitive filesystem */
public final class C13760jB {
    public static final long TWO_HOUR_TTL_MS = 7200000;
    public C13770jC A00;
    public String A01;
    public C06180Ob A02;
    public final QuickExperimentDebugStore A03;

    public final synchronized AnonymousClass0PL A00(C06590Pq r9, Set set) {
        AnonymousClass0PL r3;
        long A002 = C150416c3.A00(this.A01);
        int A05 = (int) C13740j9.A00("LauncherSyncPrefs").A05(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, -1);
        C150416c3.A01(this.A01, SystemClock.elapsedRealtime());
        C13740j9.A00("LauncherSyncPrefs").A0B(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, (long) C06460Pd.A00());
        C13770jC r2 = this.A00;
        String str = this.A01;
        r3 = new AnonymousClass0PL();
        C44221vn.A00(r9, str, new C44211vm(r2, r3, str, A002, A05));
        return r3;
    }

    public final synchronized void A02(Context context, C06590Pq r3, String str, Integer num, AnonymousClass0LM r6) {
        C44221vn.A00(r3, str, new C96224Eh(context, str, num, r6));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r1 != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r4 > (r6 + 7200000)) goto L_0x002d;
     */
    public final synchronized void A05(C06590Pq r10, Set set) {
        boolean z;
        boolean z2;
        int A002 = C06460Pd.A00();
        long A003 = C150416c3.A00(this.A01);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (A002 == ((int) C13740j9.A00("LauncherSyncPrefs").A05(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, -1))) {
            if (elapsedRealtime >= A003) {
                z2 = false;
            }
            z2 = true;
            z = false;
        }
        z = true;
        if (z) {
            A00(r10, set);
        } else {
            new AnonymousClass0PL().A01(C33641dF.DID_NOT_SYNC);
        }
    }

    public final List A01() {
        ArrayList arrayList = new ArrayList();
        C13780jD r0 = this.A00.A00;
        ArrayList<C13870jM> arrayList2 = new ArrayList<>();
        for (C13860jL r02 : r0.A00.values()) {
            arrayList2.addAll(r02.A01.values());
        }
        for (C13870jM r1 : arrayList2) {
            String str = r1.A01;
            String str2 = r1.A02;
            String overriddenParameter = this.A03.getOverriddenParameter(str, str2);
            boolean z = false;
            if (overriddenParameter != null) {
                z = true;
            }
            if (overriddenParameter == null) {
                overriddenParameter = r1.A03;
            }
            arrayList.add(new AnonymousClass41L(str, str2, z, overriddenParameter, r1.A00, AnonymousClass13O.LAUNCHER));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void A03(C06590Pq r21, Set set) {
        C13830jI r0;
        C06590Pq r8 = r21;
        if (r8.AgN()) {
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass0C1 A022 = C05210Iq.A02(r8);
            long j = C16180oA.A00(A022).A00.getLong("launcher_last_consistency_check_time_ms", 0);
            if (!set.isEmpty() && ((Boolean) AnonymousClass0L6.A00(r8, AnonymousClass0L7.LAUNCHER_VALUE_CONSISTENCY_CHECKER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                if (currentTimeMillis > ((long) (((Integer) AnonymousClass0L6.A00(r8, AnonymousClass0L7.LAUNCHER_VALUE_CONSISTENCY_CHECKER, "time_interval_in_secs", 86400, (AnonymousClass04H) null)).intValue() * 1000)) + j || currentTimeMillis < j) {
                    C13770jC r13 = this.A00;
                    JSONObject jSONObject = new JSONObject();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        JSONObject jSONObject2 = new JSONObject();
                        C13790jE r3 = r13.A01;
                        synchronized (r3) {
                            r0 = (C13830jI) r3.A00.A00.get(str);
                        }
                        if (r0 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            for (Map.Entry entry : r0.A00.entrySet()) {
                                StringWriter stringWriter = new StringWriter();
                                C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                                C13840jJ.A00(A05, (C13850jK) entry.getValue());
                                A05.close();
                                jSONObject3.put((String) entry.getKey(), new JSONObject(stringWriter.toString()));
                            }
                            jSONObject2.put("parameters", jSONObject3);
                        }
                        jSONObject.put(str, jSONObject2);
                    }
                    String jSONObject4 = jSONObject.toString();
                    String str2 = this.A01;
                    AnonymousClass0C1 r10 = A022;
                    boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r10, AnonymousClass0L7.CLIENT_CONFIG_REALTIME_SUBSCRIPTION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                    C15890nh r4 = new C15890nh(r8);
                    r4.A09 = Constants.ONE;
                    r4.A0C = "launcher/check_consistency/";
                    r4.A09("id", str2);
                    r4.A09("serialized_configs", jSONObject4);
                    r4.A0C("is_realtime_subscription_enabled", booleanValue);
                    r4.A06(AnonymousClass1N4.class, false);
                    r4.A0G = true;
                    C17850qu A032 = r4.A03();
                    A032.A00 = new AnonymousClass4BA();
                    C12810hQ.A03(A032, 238, 3, true, true);
                    C16180oA.A00(r10).A00.edit().putLong("launcher_last_consistency_check_time_ms", currentTimeMillis).apply();
                }
            }
        }
    }

    public void sendExposure(C06590Pq r4, String str, List list) {
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_launcher_config_exposure", (AnonymousClass0RN) null);
        A002.A0G("id", this.A01);
        A002.A0G("config_name", str);
        A002.A0I("logging_id", list);
        AnonymousClass0WN.A01(r4).BcG(A002);
    }

    public C13760jB(String str, C13770jC r2, QuickExperimentDebugStore quickExperimentDebugStore, C06180Ob r4) {
        this.A01 = str;
        this.A00 = r2;
        this.A03 = quickExperimentDebugStore;
        this.A02 = r4;
    }

    public final void A04(C06590Pq r3, Set set) {
        if (!set.isEmpty()) {
            C44221vn.A00(r3, this.A01, new C96214Eg(this, set));
        }
    }
}
