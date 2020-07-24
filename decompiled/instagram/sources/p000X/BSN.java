package p000X;

import android.os.SystemClock;
import com.facebook.common.dextricks.DexStore;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.BSN */
public final class BSN implements Callable {
    public final /* synthetic */ BSO A00;
    public final /* synthetic */ BSQ A01;

    public BSN(BSQ bsq, BSO bso) {
        this.A01 = bsq;
        this.A00 = bso;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0.close();
        r13.disconnect();
        r6 = java.lang.Math.max(r8 - r16, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r8 = r12.A00;
        r28 = android.os.SystemClock.elapsedRealtime() - r24;
        r35 = java.lang.Math.round((((double) r4) * 8.0d) / (((double) r6) / 1000.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0108, code lost:
        if (r10.isInterrupted() == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010a, code lost:
        r37 = "Cancelled";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010d, code lost:
        r37 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
        r2 = r4;
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r8.A00(r28, r26, r4, r6, r35, r37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011d, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012f, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0130, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013f, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0140, code lost:
        r2 = r4;
        r0 = r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:32:0x00e3, B:48:0x0127, B:54:0x012e] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x012e */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0144  */
    public final /* bridge */ /* synthetic */ Object call() {
        HttpURLConnection httpURLConnection;
        long j;
        long j2;
        ArrayList arrayList = new ArrayList();
        this.A00.A01(this.A01.A02.A01);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            httpURLConnection = (HttpURLConnection) new URL(this.A01.A02.A02).openConnection();
            try {
                httpURLConnection.setConnectTimeout((int) this.A01.A02.A00);
                httpURLConnection.setReadTimeout((int) this.A01.A02.A00);
                AnonymousClass0ZO.A02(httpURLConnection, -1304889537);
                BSO bso = this.A00;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                synchronized (bso.A00) {
                    bso.A00.A00.A00 = elapsedRealtime2;
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(AnonymousClass0ZO.A00(httpURLConnection, 1243755417));
                try {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    byte[] bArr = new byte[DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                    long j3 = 0;
                    j2 = 0;
                    j = 0;
                    while (true) {
                        try {
                            Thread currentThread = Thread.currentThread();
                            if (currentThread.isInterrupted()) {
                                break;
                            }
                            long read = (long) bufferedInputStream.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            j2 += read;
                            j3 = SystemClock.elapsedRealtime();
                            j = Math.max(j3 - elapsedRealtime3, 1);
                            BSO bso2 = this.A00;
                            long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            long round = Math.round((((double) j2) * 8.0d) / (((double) j) / 1000.0d));
                            BSO bso3 = bso2;
                            synchronized (bso3.A00) {
                                BSS bss = bso3.A00.A00;
                                bss.A04 = elapsedRealtime4;
                                bss.A02 = j2;
                                bss.A03 = j;
                                bss.A01 = round;
                            }
                            arrayList.add(new Long[]{Long.valueOf(j), Long.valueOf(read)});
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    while (true) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j2 = 0;
                    j = 0;
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnection = null;
            long j4 = 0;
            j = 0;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            this.A00.A00(SystemClock.elapsedRealtime() - elapsedRealtime, arrayList, j4, j, Math.round((((double) j4) * 8.0d) / (((double) j) / 1000.0d)), e.getMessage());
            return null;
        }
    }
}
