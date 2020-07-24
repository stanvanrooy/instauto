package p000X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.BBW */
public final class BBW implements Runnable {
    public final /* synthetic */ BBV A00;

    public BBW(BBV bbv) {
        this.A00 = bbv;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:44|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0118, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0123 */
    public final void run() {
        HttpURLConnection httpURLConnection;
        String str;
        BBV bbv = this.A00;
        try {
            httpURLConnection = (HttpURLConnection) new URL(bbv.A00.A03).openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setChunkedStreamingMode(0);
            PrintWriter printWriter = new PrintWriter(AnonymousClass0ZO.A01(httpURLConnection, -1318610755));
            printWriter.print(bbv.A00.A04);
            printWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AnonymousClass0ZO.A00(httpURLConnection, -1373525909)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            String sb2 = sb.toString();
            bufferedReader.close();
            httpURLConnection.disconnect();
            Set<String> A03 = bbv.A03(sb2);
            ArrayList arrayList = new ArrayList();
            for (String A02 : A03) {
                arrayList.addAll(bbv.A02(A02));
            }
            int i = bbv.A00.A00;
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("async_tcp_probe", C25262BBa.A00);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                A002.A0G(AnonymousClass000.A05("address_", i2), ((BBZ) arrayList.get(i2)).A03);
                A002.A0G(AnonymousClass000.A05("region_", i2), ((BBZ) arrayList.get(i2)).A01);
                String A05 = AnonymousClass000.A05("has_err_", i2);
                if (((BBZ) arrayList.get(i2)).A04) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str = "0";
                }
                A002.A0G(A05, str);
                A002.A0G(AnonymousClass000.A05("err_msg_", i2), ((BBZ) arrayList.get(i2)).A02);
                A002.A0G(AnonymousClass000.A05("ttfb_", i2), Integer.toString(((BBZ) arrayList.get(i2)).A00));
            }
            A002.A0G("sample_rate", Integer.toString(i));
            A002.A0G("probe_mode", Integer.toString(100));
            A002.A0G("random_order", Integer.toString(0));
            AnonymousClass0WN.A00().BcG(A002);
        } catch (IOException | RuntimeException | JSONException e) {
            AnonymousClass0DB.A0G("InstagramSonarProber", "Error in probe session", e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
