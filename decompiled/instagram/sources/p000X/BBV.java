package p000X;

import android.os.SystemClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.BBV */
public abstract class BBV {
    public C14400kQ A00;
    public ScheduledExecutorService A01;
    public C14390kP A02;

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b9, code lost:
        r6.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00be, code lost:
        r5 = null;
        r6 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c5, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd  */
    public List A02(String str) {
        String str2;
        long j;
        IOException iOException;
        IOException iOException2;
        HttpURLConnection httpURLConnection;
        String str3 = str;
        if (!(this instanceof BBX)) {
            BSL bsl = (BSL) this;
            String A002 = A00(str3);
            boolean z = bsl.A01;
            ArrayList arrayList = new ArrayList();
            ScheduledExecutorService scheduledExecutorService = bsl.A01;
            BSP bsp = BSP.DOWNLOAD;
            BSU bsu = new BSU();
            bsu.A00 = ((long) bsl.A00.A01) * 1000;
            bsu.A02 = AnonymousClass000.A0N("https://", A002, "/", (String) null);
            bsu.A01 = str3;
            arrayList.add(BSL.A01(str3, A002, new BSR(scheduledExecutorService, bsp, bsu)));
            if (z) {
                byte[] bArr = new byte[bsl.A00.A02];
                new Random().nextBytes(bArr);
                ScheduledExecutorService scheduledExecutorService2 = bsl.A01;
                BSP bsp2 = BSP.UPLOAD;
                BSU bsu2 = new BSU();
                bsu2.A00 = ((long) bsl.A00.A01) * 1000;
                bsu2.A03 = bArr;
                bsu2.A02 = AnonymousClass000.A0N("https://", A002, "/", (String) null);
                bsu2.A01 = str3;
                arrayList.add(BSL.A01(str3, A002, new BSR(scheduledExecutorService2, bsp2, bsu2)));
            }
            return arrayList;
        }
        String A003 = A00(str3);
        ? r6 = 0;
        try {
            str2 = InetAddress.getByName(A003).getHostAddress();
            httpURLConnection = (HttpURLConnection) new URL(AnonymousClass000.A0E("https://", A003)).openConnection();
            try {
                AnonymousClass0ZO.A02(httpURLConnection, 1366208135);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                httpURLConnection.getResponseCode();
                j = SystemClock.elapsedRealtime() - elapsedRealtime;
                httpURLConnection.disconnect();
            } catch (IOException e) {
                iOException2 = e;
                if (httpURLConnection != null) {
                }
                j = -1;
                r6 = iOException2;
                BBY bby = new BBY(str2, j, r6);
                iOException = bby.A01;
                if (iOException != null) {
                }
                String A0G = AnonymousClass000.A0G(bby.A02, ":", 443);
                boolean z2 = false;
                if (iOException != null) {
                }
                return Collections.singletonList(new BBZ(A0G, str3, z2, iOException == null ? iOException.toString() : null, (int) bby.A00));
            } catch (Throwable th) {
                th = th;
                r6 = httpURLConnection;
                if (r6 != 0) {
                }
                throw th;
            }
        } catch (IOException e2) {
            httpURLConnection = null;
            iOException2 = e2;
            if (httpURLConnection != null) {
            }
            j = -1;
            r6 = iOException2;
            BBY bby2 = new BBY(str2, j, r6);
            iOException = bby2.A01;
            if (iOException != null) {
            }
            String A0G2 = AnonymousClass000.A0G(bby2.A02, ":", 443);
            boolean z22 = false;
            if (iOException != null) {
            }
            return Collections.singletonList(new BBZ(A0G2, str3, z22, iOException == null ? iOException.toString() : null, (int) bby2.A00));
        } catch (Throwable th2) {
        }
        BBY bby22 = new BBY(str2, j, r6);
        iOException = bby22.A01;
        if (iOException != null) {
            AnonymousClass0DB.A0G("InstagramSonarProber", "Error in probe session", iOException);
        }
        String A0G22 = AnonymousClass000.A0G(bby22.A02, ":", 443);
        boolean z222 = false;
        if (iOException != null) {
            z222 = true;
        }
        return Collections.singletonList(new BBZ(A0G22, str3, z222, iOException == null ? iOException.toString() : null, (int) bby22.A00));
    }

    public Set A03(String str) {
        LinkedHashSet linkedHashSet;
        if (this instanceof BBR) {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("all_clusters");
            Iterator<String> keys = jSONObject.keys();
            linkedHashSet = new LinkedHashSet();
            Random random = new Random();
            while (keys.hasNext()) {
                JSONArray jSONArray = jSONObject.getJSONArray(keys.next());
                linkedHashSet.add((String) jSONArray.get(random.nextInt(jSONArray.length())));
            }
        } else if (this instanceof BBS) {
            JSONArray jSONArray2 = new JSONObject(str).getJSONArray("fna_candidates");
            linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < jSONArray2.length(); i++) {
                if (jSONArray2.getString(i).startsWith("fna:")) {
                    linkedHashSet.add(jSONArray2.getString(i));
                }
            }
        } else if (!(this instanceof BBU)) {
            BBT bbt = (BBT) this;
            JSONArray jSONArray3 = new JSONObject(str).getJSONArray("fna_candidates");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                if (jSONArray3.getString(i2).startsWith("fna:")) {
                    arrayList.add(jSONArray3.getString(i2));
                }
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            if (arrayList.size() > 0) {
                linkedHashSet2.add(arrayList.get(bbt.A00.nextInt(arrayList.size())));
            }
            return linkedHashSet2;
        } else {
            BBU bbu = (BBU) this;
            JSONArray jSONArray4 = new JSONObject(str).getJSONArray("closest");
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            if (jSONArray4.length() != 0) {
                linkedHashSet3.add(jSONArray4.getString(bbu.A00.nextInt(jSONArray4.length())));
                return linkedHashSet3;
            }
            throw new RuntimeException("Empty response for closest clusters.");
        }
        return linkedHashSet;
    }

    public static final String A00(String str) {
        StringBuilder sb;
        String str2;
        if (str.startsWith("fna:")) {
            sb = new StringBuilder("sonar.");
            sb.append(str.substring(4));
            str2 = ".fna.fbcdn.net";
        } else if (str.length() >= 6) {
            sb = new StringBuilder("sonar-");
            sb.append(str);
            str2 = ".xx.fbcdn.net";
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid cluster: ", str));
        }
        sb.append(str2);
        return sb.toString();
    }

    public BBV(C14400kQ r1, ScheduledExecutorService scheduledExecutorService, C14390kP r3) {
        this.A00 = r1;
        this.A01 = scheduledExecutorService;
        this.A02 = r3;
    }
}
