package p000X;

import android.os.SystemClock;
import com.facebook.common.dextricks.DexStore;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BSM */
public final class BSM implements Callable {
    public final /* synthetic */ BSO A00;
    public final /* synthetic */ BSQ A01;

    public BSM(BSQ bsq, BSO bso) {
        this.A01 = bsq;
        this.A00 = bso;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01be, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c5, code lost:
        r9 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:38:0x011a, B:65:0x01bd, B:71:0x01c4] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01c4 */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d9  */
    public final /* bridge */ /* synthetic */ Object call() {
        HttpURLConnection httpURLConnection;
        long j;
        Thread currentThread;
        long j2;
        String str;
        long j3;
        long j4;
        BSO bso;
        int length;
        ArrayList arrayList = new ArrayList();
        this.A00.A01(this.A01.A02.A01);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = 0;
        try {
            httpURLConnection = (HttpURLConnection) new URL(this.A01.A02.A02).openConnection();
            try {
                httpURLConnection.setConnectTimeout((int) this.A01.A02.A00);
                httpURLConnection.setReadTimeout((int) this.A01.A02.A00);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(AnonymousClass0C5.$const$string(307), AnonymousClass0C5.$const$string(27));
                AnonymousClass0ZO.A02(httpURLConnection, -1748970280);
                BSO bso2 = this.A00;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                synchronized (bso2.A00) {
                    bso2.A00.A00.A00 = elapsedRealtime2;
                }
                byte[] bArr = this.A01.A02.A03;
                if (bArr == null) {
                    bArr = new byte[100000];
                    new Random().nextBytes(bArr);
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AnonymousClass0ZO.A01(httpURLConnection, -327095210));
                try {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    long j6 = 0;
                    j = 0;
                    int i = 0;
                    while (true) {
                        try {
                            currentThread = Thread.currentThread();
                            if (!currentThread.isInterrupted() && i < (length = bArr.length)) {
                                int min = Math.min(length - i, DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                                bufferedOutputStream.write(bArr, i, min);
                                i += min;
                                long j7 = (long) min;
                                long j8 = j7;
                                j5 += j7;
                                j6 = SystemClock.elapsedRealtime();
                                j = Math.max(j6 - elapsedRealtime3, 1);
                                BSO bso3 = this.A00;
                                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                long round = Math.round((((double) j5) * 8.0d) / (((double) j) / 1000.0d));
                                BSO bso4 = bso3;
                                synchronized (bso4.A00) {
                                    BSS bss = bso4.A00.A00;
                                    bss.A04 = elapsedRealtime4;
                                    bss.A02 = j5;
                                    bss.A03 = j;
                                    bss.A01 = round;
                                }
                                arrayList.add(new Long[]{Long.valueOf(j), Long.valueOf(j8)});
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    try {
                        bufferedOutputStream.close();
                        if (currentThread.isInterrupted()) {
                            httpURLConnection.disconnect();
                            j = Math.max(j6 - elapsedRealtime3, 1);
                        } else if (httpURLConnection.getResponseCode() != 200) {
                            bso = this.A00;
                            j4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            j3 = Math.round((((double) j5) * 8.0d) / (((double) j) / 1000.0d));
                            str = AnonymousClass000.A05("Unexpected response code: ", httpURLConnection.getResponseCode());
                            j2 = j5;
                            bso.A00(j4, arrayList, j5, j, j3, str);
                            return null;
                        } else {
                            j2 = j5;
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AnonymousClass0ZO.A00(httpURLConnection, 1493968395)));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    stringBuffer.append(readLine);
                                }
                                httpURLConnection.disconnect();
                                JSONObject jSONObject = new JSONObject(stringBuffer.toString());
                                j = (long) Math.max(jSONObject.getInt("durationMS"), 1);
                                j5 = (long) jSONObject.getInt("bytes");
                            } catch (IOException | JSONException e) {
                                e = e;
                                j5 = j2;
                                if (httpURLConnection != null) {
                                }
                                this.A00.A00(SystemClock.elapsedRealtime() - elapsedRealtime, arrayList, j5, j, Math.round((((double) j5) * 8.0d) / (((double) j) / 1000.0d)), e.getMessage());
                                return null;
                            }
                        }
                        bso = this.A00;
                        j4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        j3 = Math.round((((double) j5) * 8.0d) / (((double) j) / 1000.0d));
                        if (currentThread.isInterrupted()) {
                            str = "Cancelled";
                        } else {
                            str = null;
                        }
                        j2 = j5;
                        bso.A00(j4, arrayList, j5, j, j3, str);
                        return null;
                    } catch (IOException | JSONException e2) {
                        e = e2;
                        j2 = j5;
                        j5 = j2;
                        if (httpURLConnection != null) {
                        }
                        this.A00.A00(SystemClock.elapsedRealtime() - elapsedRealtime, arrayList, j5, j, Math.round((((double) j5) * 8.0d) / (((double) j) / 1000.0d)), e.getMessage());
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = 0;
                    throw th;
                }
            } catch (IOException | JSONException e3) {
                e = e3;
                j = 0;
            }
        } catch (IOException | JSONException e4) {
            e = e4;
            j = 0;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.A00.A00(SystemClock.elapsedRealtime() - elapsedRealtime, arrayList, j5, j, Math.round((((double) j5) * 8.0d) / (((double) j) / 1000.0d)), e.getMessage());
            return null;
        }
    }
}
