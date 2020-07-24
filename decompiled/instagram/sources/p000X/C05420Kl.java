package p000X;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.0Kl  reason: invalid class name and case insensitive filesystem */
public final class C05420Kl {
    public static final Class A00 = C05420Kl.class;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:38|39|40|41|42) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x014c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0153 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x015a */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0174  */
    public static void A00(Context context, AnonymousClass0Kk r9, Map map) {
        HttpURLConnection httpURLConnection;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String uri = new Uri.Builder().scheme("https").authority("i.instagram.com").path("api/v1/instacrash/log/").build().toString();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Do not call this on the main thread");
        } else if (r9 == null) {
            AnonymousClass0QD.A01(A00.getSimpleName(), "tried to report instacrash without session");
            return;
        } else {
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                try {
                    httpURLConnection.addRequestProperty("User-Agent", AnonymousClass0QR.A00(context));
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    String A01 = C06630Pu.A01(context);
                    String upperCase = C05860Mt.A02.A05(context).toUpperCase();
                    int A002 = C06630Pu.A00(context);
                    HashMap hashMap = new HashMap();
                    hashMap.put("session_id", r9.A00);
                    hashMap.put("app_name", "Instagram");
                    hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, A01);
                    hashMap.put("build_number", Integer.toString(A002));
                    hashMap.put("device_id", upperCase);
                    hashMap.put("forced_mitigation", Boolean.valueOf(r9.A00.startsWith("fm")));
                    hashMap.putAll(map);
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (sb.length() != 0) {
                            sb.append('&');
                        }
                        sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                        sb.append('=');
                        sb.append(URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8"));
                    }
                    byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes());
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = byteArrayInputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArrayInputStream.close();
                            httpURLConnection.setFixedLengthStreamingMode(byteArray.length);
                            AnonymousClass0ZO.A01(httpURLConnection, 363345135).write(byteArray);
                            AnonymousClass0ZO.A02(httpURLConnection, 1579665819);
                            httpURLConnection.getResponseCode();
                            httpURLConnection.getResponseMessage();
                            httpURLConnection.disconnect();
                            return;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    httpURLConnection2 = httpURLConnection;
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    AnonymousClass0QD.A09(A00.getName(), e);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                    }
                    throw th;
                }
            }
        }
        try {
        } catch (Throwable th3) {
            byteArrayInputStream.close();
            throw th3;
        }
        try {
        } catch (Throwable th4) {
            byteArrayOutputStream.close();
            throw th4;
        }
    }
}
