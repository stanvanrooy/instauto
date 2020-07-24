package p000X;

import android.net.Uri;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

/* renamed from: X.0af  reason: invalid class name and case insensitive filesystem */
public final class C09130af {
    public static final List A03 = Arrays.asList(new String[]{"log_type", "build_id", "app_id", MemoryDumpUploadJob.EXTRA_USER_ID, "device_id"});
    public Uri A00;
    public C025002p A01;
    public String A02 = "Android";

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0200, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0204 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:71:0x0204=Splitter:B:71:0x0204, B:60:0x01ef=Splitter:B:60:0x01ef} */
    public final boolean A00(Properties properties, Map map, int i) {
        String str;
        OutputStream outputStream;
        AnonymousClass0FB r4 = new AnonymousClass0FB(this.A00, this.A02, this.A01);
        HashMap hashMap = new HashMap();
        String property = properties.getProperty(MemoryDumpUploadJob.EXTRA_USER_ID);
        if (property != null && !property.equals("") && !property.equals("0")) {
            hashMap.put("Cookie", AnonymousClass000.A0E("c_user=", property));
        }
        r4.A03 = hashMap;
        HashMap hashMap2 = new HashMap();
        for (String str2 : A03) {
            String property2 = properties.getProperty(str2);
            if (property2 == null) {
                if (str2.endsWith("id")) {
                    property2 = "0";
                } else {
                    property2 = "unknown";
                }
            }
            hashMap2.put(str2, property2);
            properties.put(str2, property2);
        }
        properties.put("attempt_count", String.valueOf(i));
        properties.put("property_count", String.valueOf(properties.size()));
        C024002f r3 = new C024002f();
        HttpURLConnection AIe = r4.A01.AIe(new URL(r4.A00.toString()));
        String uuid = UUID.randomUUID().toString();
        AIe.setRequestMethod("POST");
        AIe.setRequestProperty("User-Agent", r4.A02);
        AIe.setRequestProperty("Content-Type", String.format("multipart/form-data;boundary=%s", new Object[]{uuid}));
        Map map2 = r4.A03;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry entry : r4.A03.entrySet()) {
                AIe.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        AIe.setDoOutput(true);
        AIe.setChunkedStreamingMode(0);
        try {
            OutputStream A012 = AnonymousClass0ZO.A01(AIe, -1485928161);
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                AnonymousClass0FB.A00((String) entry2.getKey(), (String) entry2.getValue(), A012, uuid);
            }
            for (Map.Entry entry3 : properties.entrySet()) {
                AnonymousClass0FB.A00(AnonymousClass000.A0J("data[", entry3.getKey().toString(), "]"), entry3.getValue().toString(), A012, uuid);
            }
            for (Map.Entry entry4 : map.entrySet()) {
                C025302s r42 = (C025302s) entry4.getValue();
                boolean z = r42.A02;
                boolean z2 = r42.A01;
                Object key = entry4.getKey();
                if (z2) {
                    str = "form-data; filename=\"file\"; name=";
                } else {
                    str = "form-data; name=";
                }
                A012.write(String.format("--%s\r\nContent-Disposition: %s\"%s\"\r\nContent-Type: application/binary\r\nContent-Transfer-Encoding: binary\r\n\r\n", new Object[]{uuid, str, key.toString()}).getBytes());
                if (z) {
                    outputStream = new C024802n(A012);
                } else {
                    outputStream = A012;
                }
                InputStream inputStream = r42.A00;
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                }
                if (z) {
                    ((C024802n) outputStream).A00();
                }
                A012.write("\r\n".getBytes());
            }
            A012.write(String.format("--%s--\r\n", new Object[]{uuid}).getBytes());
            A012.flush();
            int responseCode = AIe.getResponseCode();
            r3.A00 = responseCode;
            if (responseCode == 200) {
                AnonymousClass0ZO.A00(AIe, 59835760).close();
            } else {
                AIe.getErrorStream().close();
            }
            A012.close();
            AIe.disconnect();
            if (r3.A00 == 200) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            AIe.disconnect();
            throw th;
        }
    }

    public C09130af(Uri uri, AnonymousClass0Bf r3) {
        this.A00 = uri;
        this.A01 = r3;
    }

    public C09130af(Uri uri, C09140ag r3) {
        this.A00 = uri;
        this.A01 = r3;
    }
}
