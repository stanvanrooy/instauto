package p000X;

import android.util.Base64;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.0So  reason: invalid class name and case insensitive filesystem */
public final class C07310So implements Runnable {
    public final /* synthetic */ C10990eF A00;

    public C07310So(C10990eF r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01a5 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01cb A[LOOP:0: B:13:0x0034->B:106:0x01cb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0023 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017b A[Catch:{ IOException -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a2 A[SYNTHETIC, Splitter:B:91:0x01a2] */
    public final void run() {
        InputStreamReader inputStreamReader;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        C07260Sj r7 = this.A00.A03;
        if (r7.A01.exists()) {
            File[] listFiles = r7.A01.listFiles();
            if (listFiles == null) {
                if (!r7.A01.exists()) {
                    str3 = "directory_not_found";
                } else if (r7.A01.isFile()) {
                    str3 = "directory_is_file";
                } else {
                    str3 = "directory_unknown_error";
                }
                AnonymousClass0DB.A0D("AnalyticsUploader", str3);
                return;
            }
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file = listFiles[i2];
                boolean z2 = false;
                try {
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
                    try {
                        StringBuilder sb = new StringBuilder();
                        char[] cArr = new char[1024];
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        String sb2 = sb.toString();
                        try {
                            inputStreamReader.close();
                        } catch (IOException unused) {
                        }
                        C07220Sf r10 = r7.A00;
                        String str4 = sb2;
                        HashMap hashMap = new HashMap();
                        hashMap.put("method", "logging.clientevent");
                        hashMap.put("format", "json");
                        hashMap.put("access_token", r10.A01);
                        if (sb2 == null) {
                            try {
                                AnonymousClass0DB.A0E("AnalyticsHttpClient", "Json data cannot be null");
                            } catch (IOException e) {
                                AnonymousClass0DB.A0M("AnalyticsHttpClient", e, "Unable to compress message to Json object, using original message");
                                hashMap.put(DialogModule.KEY_MESSAGE, str4);
                            }
                        }
                        byte[] bytes = sb2.getBytes("UTF-8");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
                        deflaterOutputStream.write(bytes);
                        deflaterOutputStream.close();
                        hashMap.put(DialogModule.KEY_MESSAGE, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                        hashMap.put("compressed", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        C07230Sg r0 = r10.A00;
                        String str5 = r10.A02;
                        try {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) r0.A00.get()).openConnection();
                                httpURLConnection.setConnectTimeout(10000);
                                try {
                                    httpURLConnection.setDoOutput(true);
                                    httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                                    httpURLConnection.setRequestProperty("User-Agent", str5);
                                    httpURLConnection.setRequestProperty("X-FB-HTTP-Engine", "MQTT Analytics");
                                    try {
                                        DataOutputStream dataOutputStream = new DataOutputStream(AnonymousClass0ZO.A01(httpURLConnection, 133641169));
                                        StringBuilder sb3 = new StringBuilder();
                                        for (Map.Entry entry : hashMap.entrySet()) {
                                            if (sb3.length() != 0) {
                                                sb3.append("&");
                                            }
                                            try {
                                                sb3.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                                                sb3.append("=");
                                                sb3.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
                                            } catch (UnsupportedEncodingException e2) {
                                                AnonymousClass0DB.A0M("AnalyticsService", e2, "");
                                                dataOutputStream.close();
                                                z = false;
                                                if (z) {
                                                }
                                                httpURLConnection.disconnect();
                                                i = -1;
                                                AnonymousClass0DB.A0K("AnalyticsUploader", "File %s was not deleted", file);
                                                if (i == 200) {
                                                }
                                                if (z2) {
                                                }
                                            }
                                        }
                                        try {
                                            dataOutputStream.writeBytes(sb3.toString());
                                            dataOutputStream.flush();
                                            dataOutputStream.close();
                                            z = true;
                                        } catch (IOException e3) {
                                            AnonymousClass0DB.A0M("AnalyticsService", e3, "Failed to write to output stream");
                                        } catch (Throwable th) {
                                            dataOutputStream.close();
                                            throw th;
                                        }
                                    } catch (IOException e4) {
                                        AnonymousClass0DB.A0M("AnalyticsService", e4, "Unable to create output stream");
                                        z = false;
                                        if (z) {
                                        }
                                        httpURLConnection.disconnect();
                                        i = -1;
                                        AnonymousClass0DB.A0K("AnalyticsUploader", "File %s was not deleted", file);
                                        if (i == 200) {
                                        }
                                        if (z2) {
                                        }
                                    } catch (SecurityException e5) {
                                        AnonymousClass0DB.A0M("AnalyticsService", e5, "Unable to create output stream");
                                        z = false;
                                        if (z) {
                                        }
                                        httpURLConnection.disconnect();
                                        i = -1;
                                        AnonymousClass0DB.A0K("AnalyticsUploader", "File %s was not deleted", file);
                                        if (i == 200) {
                                        }
                                        if (z2) {
                                        }
                                    }
                                    if (z) {
                                        i = httpURLConnection.getResponseCode();
                                        httpURLConnection.disconnect();
                                        if (i == 200 && !file.delete()) {
                                            AnonymousClass0DB.A0K("AnalyticsUploader", "File %s was not deleted", file);
                                        }
                                        if (i == 200) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                } catch (IOException e6) {
                                    try {
                                        AnonymousClass0DB.A0M("AnalyticsService", e6, "");
                                    } catch (Throwable th2) {
                                        httpURLConnection.disconnect();
                                        throw th2;
                                    }
                                }
                                httpURLConnection.disconnect();
                                i = -1;
                            } catch (IOException e7) {
                                e = e7;
                                str = "AnalyticsService";
                                str2 = "Failed to open http connection";
                                AnonymousClass0DB.A0M(str, e, str2);
                                i = -1;
                                AnonymousClass0DB.A0K("AnalyticsUploader", "File %s was not deleted", file);
                                if (i == 200) {
                                }
                                if (z2) {
                                }
                            }
                        } catch (MalformedURLException e8) {
                            e = e8;
                            str = "AnalyticsService";
                            str2 = "Logging end point malformed";
                            AnonymousClass0DB.A0M(str, e, str2);
                            i = -1;
                            AnonymousClass0DB.A0K("AnalyticsUploader", "File %s was not deleted", file);
                            if (i == 200) {
                            }
                            if (z2) {
                            }
                        }
                        AnonymousClass0DB.A0K("AnalyticsUploader", "File %s was not deleted", file);
                        if (i == 200) {
                        }
                        if (z2) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (inputStreamReader != null) {
                        }
                        try {
                            throw th;
                        } catch (IOException e9) {
                            AnonymousClass0DB.A0M("AnalyticsUploader", e9, "Unable to read file");
                            z2 = false;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = null;
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    throw th;
                }
            }
        }
    }
}
