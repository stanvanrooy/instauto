package p000X;

import android.os.Bundle;
import com.facebook.rti.push.service.FbnsService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0cZ  reason: invalid class name and case insensitive filesystem */
public final class C10040cZ implements AnonymousClass0X2 {
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0103 */
    public final Bundle ACN(FbnsService fbnsService, Bundle bundle) {
        String valueOf;
        String valueOf2;
        HashSet hashSet;
        ArrayList arrayList = new ArrayList();
        C10140cj r7 = fbnsService.A02;
        C10500dP r0 = r7.A01;
        if (r0 != null) {
            C10480dN r5 = r0.A00;
            HashMap hashMap = new HashMap();
            hashMap.put("is_mqtt_direct", "false");
            long j = r5.A09.A00;
            if (j > 0) {
                valueOf = new Date(j).toString();
            } else {
                valueOf = String.valueOf(j);
            }
            hashMap.put("last_connection_time", valueOf);
            long j2 = r5.A09.A02;
            if (j2 > 0) {
                valueOf2 = new Date(j2).toString();
            } else {
                valueOf2 = String.valueOf(j2);
            }
            hashMap.put("last_network_changed_time", valueOf2);
            C07890Uv r02 = r5.A09;
            synchronized (r02.A0R) {
                hashSet = new HashSet(r02.A0R.keySet());
            }
            hashMap.put("subscribed_topics", hashSet.toString());
            hashMap.put("mqtt_health_stats", C10480dN.A04(r5));
            r7.Aj4("DumpSys", hashMap);
        } else {
            r7.Aj2("SystemDumper not connected");
        }
        try {
            AnonymousClass0Z9.A01(r7.A06, new AnonymousClass0X3(r7), -972433988).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        ArrayList<File> arrayList2 = new ArrayList<>();
        int i = 0;
        if (r7.A00 == 0) {
            i = 1;
        }
        File file = new File(r7.A04.getCacheDir(), AnonymousClass000.A05("fbnslite_log", i));
        if (file.exists()) {
            arrayList2.add(file);
        }
        File file2 = new File(r7.A04.getCacheDir(), AnonymousClass000.A05("fbnslite_log", r7.A00));
        if (file2.exists()) {
            arrayList2.add(file2);
        }
        for (File file3 : arrayList2) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file3));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                }
            } catch (IOException e) {
                arrayList.add(AnonymousClass000.A0N("Error reading file ", file3.getName(), " - ", e.toString()));
            } catch (Throwable ) {
                throw th;
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("flytrap", arrayList);
        return bundle2;
    }

    public final void ACQ(FbnsService fbnsService, Bundle bundle) {
        throw new IllegalArgumentException("not implemented for FlytrapReportFetcher");
    }
}
