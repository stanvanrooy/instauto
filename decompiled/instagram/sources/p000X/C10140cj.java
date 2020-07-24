package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0cj  reason: invalid class name and case insensitive filesystem */
public final class C10140cj implements AnonymousClass0T1 {
    public int A00;
    public C10500dP A01 = null;
    public ArrayList A02 = new ArrayList();
    public ScheduledFuture A03 = null;
    public final Context A04;
    public final SharedPreferences A05;
    public final ScheduledExecutorService A06;
    public final SimpleDateFormat A07;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005b */
    public static void A00(C10140cj r8, boolean z) {
        ArrayList arrayList;
        ScheduledFuture scheduledFuture;
        synchronized (r8) {
            arrayList = r8.A02;
            r8.A02 = new ArrayList();
            if (z && (scheduledFuture = r8.A03) != null) {
                scheduledFuture.cancel(false);
            }
            r8.A03 = null;
        }
        if (!arrayList.isEmpty()) {
            File file = new File(r8.A04.getCacheDir(), AnonymousClass000.A05("fbnslite_log", r8.A00));
            int i = 1;
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fileWriter.write(AnonymousClass000.A02((String) it.next(), 10));
                }
                fileWriter.close();
            } catch (IOException unused) {
            } catch (Throwable ) {
                throw th;
            }
            boolean z2 = false;
            if (file.length() >= 30000) {
                z2 = true;
            }
            if (z2) {
                if (r8.A00 != 0) {
                    i = 0;
                }
                r8.A00 = i;
                r8.A05.edit().putInt("CurrentFile", r8.A00).commit();
                new File(r8.A04.getCacheDir(), AnonymousClass000.A05("fbnslite_log", r8.A00)).delete();
            }
        }
    }

    public final void Aj3(String str, String str2) {
        Aj2(AnonymousClass000.A0N("[", str, "] ", str2));
    }

    public final void Aj4(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
            sb.append("; ");
        }
        Aj2(AnonymousClass000.A0N("[", str, "] ", sb.toString()));
    }

    public C10140cj(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        this.A07 = simpleDateFormat;
        this.A04 = context;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        this.A05 = this.A04.getSharedPreferences("Fbnslite_Flytrap", 0);
        this.A06 = Executors.newSingleThreadScheduledExecutor();
        this.A00 = this.A05.getInt("CurrentFile", 0);
    }

    public final void Aj2(String str) {
        String A0J = AnonymousClass000.A0J(this.A07.format(new Date(System.currentTimeMillis())), " ", str);
        synchronized (this) {
            if (A0J.length() > 500) {
                A0J = A0J.substring(0, 500);
            }
            this.A02.add(A0J);
            if (this.A03 == null) {
                this.A03 = this.A06.schedule(new AnonymousClass0X4(this), 60000, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void Bkz(C10500dP r1) {
        this.A01 = r1;
    }
}
