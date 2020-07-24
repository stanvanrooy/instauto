package p000X;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import com.facebook.tigon.iface.TigonRequest;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reliability.InstacrashSessionProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Gu  reason: invalid class name and case insensitive filesystem */
public final class C04920Gu extends AnonymousClass0Fz {
    public final C05530Kx A00;
    public final AnonymousClass0Ks A01;
    public final C05420Kl A02;
    public final InstacrashSessionProvider A03;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r3.close();
        r4 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018b, code lost:
        r5.disconnect();
        android.os.StrictMode.setThreadPolicy(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0195, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a5, code lost:
        if (r5 == null) goto L_0x01aa;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0199 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b3 A[Catch:{ JSONException -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b7 A[Catch:{ JSONException -> 0x01e8 }] */
    public final AnonymousClass0G1 A03(Context context, int i, int i2, Map map) {
        HttpURLConnection httpURLConnection;
        Integer num;
        String str;
        String[] strArr;
        if (i >= 1 && i > i2) {
            InstacrashSessionProvider instacrashSessionProvider = this.A03;
            Context context2 = context;
            AnonymousClass0Kk A002 = instacrashSessionProvider.A00(context);
            if (A002 == null || A002.A00.startsWith("fm")) {
                instacrashSessionProvider.A00 = null;
                new File(context.getApplicationInfo().dataDir, "ig_crash_log_session").delete();
                String uuid = UUID.randomUUID().toString();
                try {
                    FileWriter fileWriter = new FileWriter(new File(context.getApplicationInfo().dataDir, "ig_crash_log_session"));
                    fileWriter.write(uuid);
                    instacrashSessionProvider.A00 = new AnonymousClass0Kk(uuid);
                    fileWriter.close();
                } catch (IOException e) {
                    AnonymousClass0DB.A0G("com.instagram.reliability.InstacrashSessionProvider", "error writing", e);
                } catch (Throwable ) {
                    throw th;
                }
                A002 = instacrashSessionProvider.A00;
            }
            long j = -1;
            if (map != null && map.containsKey("number_of_crashes")) {
                Object obj = map.get("number_of_crashes");
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                }
            }
            new C05470Kq(this.A02, j, context2, A002).start();
            if (C05630Li.A03(new C05000Hl("is_enabled", AnonymousClass0L7.INSTACRASH_MITIGATION_ALWAYS, false, (String[]) null, (AnonymousClass04H) null))) {
                num = Constants.ONE;
            } else {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https").authority("i.instagram.com").path("api/v1/instacrash/resolver").appendQueryParameter("app_id", "567067343352427");
                String str2 = null;
                try {
                    if (C05770Lw.A01(context).A00.getBoolean("instacrash_loop_test_mode", false)) {
                        builder.appendQueryParameter("is_test", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    }
                    httpURLConnection = (HttpURLConnection) new URL(builder.build().toString()).openConnection();
                    try {
                        httpURLConnection.addRequestProperty("User-Agent", AnonymousClass0QR.A00(context));
                        httpURLConnection.setRequestMethod(TigonRequest.GET);
                        AnonymousClass0ZO.A02(httpURLConnection, 1762399045);
                        httpURLConnection.getResponseMessage();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode >= 200 && responseCode < 300) {
                            StringBuilder sb = new StringBuilder();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AnonymousClass0ZO.A00(httpURLConnection, 209308399)));
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            if (TextUtils.isEmpty(str2)) {
                                String string = new JSONObject(str2).getString("mitigation");
                                Integer[] A003 = Constants.ZERO(2);
                                int length = A003.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        num = Constants.ZERO;
                                        break;
                                    }
                                    num = A003[i3];
                                    if (1 - num.intValue() != 0) {
                                        str = "no-op";
                                    } else {
                                        str = "clear_minus_credentials";
                                    }
                                    if (str.equalsIgnoreCase(string)) {
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                num = Constants.ZERO;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable ) {
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    httpURLConnection = null;
                    try {
                        AnonymousClass0DB.A0G("InstacrashMitigationRetriever", "Error retrieving mitigation", e);
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = null;
                    if (httpURLConnection != null) {
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
                httpURLConnection.disconnect();
                StrictMode.setThreadPolicy(threadPolicy);
                try {
                    if (TextUtils.isEmpty(str2)) {
                    }
                } catch (JSONException e4) {
                    AnonymousClass0DB.A0G("InstacrashMitigationRetriever", "Error parsing json", e4);
                    num = Constants.ZERO;
                }
            }
            if (num != Constants.ZERO) {
                new C05460Kp(this.A02, context, A002).start();
                C05480Kr AQN = this.A00.AQN(context, this);
                if (num == Constants.ONE) {
                    String string2 = AQN.A01.getString("current", (String) null);
                    if (TextUtils.isEmpty(string2)) {
                        strArr = new String[0];
                    } else {
                        strArr = C05480Kr.A03;
                    }
                    AQN.A02.A06(AQN.A00, strArr);
                    AQN.A01.edit().putString("current", string2).commit();
                }
                return new AnonymousClass0G1(true, true);
            }
        }
        return new AnonymousClass0G1(true, false);
    }

    public final String A04() {
        return "Instagram Instacrash Remedy";
    }

    public final AnonymousClass0G1 A02(Context context, int i, int i2, Map map) {
        return new AnonymousClass0G1(false, false);
    }

    public final void A05(Context context, AnonymousClass0G0 r7) {
        if (this.A03.A00(context) != null) {
            C05420Kl r4 = this.A02;
            AnonymousClass0Kk A002 = this.A03.A00(context);
            boolean z = false;
            if (C05760Lv.A01.A00.getString("current", (String) null) != null) {
                z = true;
            }
            new C05440Kn(r4, z, context, A002).start();
            this.A03.A00 = null;
            new File(context.getApplicationInfo().dataDir, "ig_crash_log_session").delete();
        }
    }

    public C04920Gu() {
        this(new C05420Kl(), new AnonymousClass0Ks(), new AnonymousClass0HD(), new InstacrashSessionProvider());
    }

    public C04920Gu(C05420Kl r1, AnonymousClass0Ks r2, C05530Kx r3, InstacrashSessionProvider instacrashSessionProvider) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = instacrashSessionProvider;
    }
}
