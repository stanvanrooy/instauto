package p000X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.17j  reason: invalid class name and case insensitive filesystem */
public final class C251217j implements Runnable {
    public final /* synthetic */ C251117i A00;

    public C251217j(C251117i r1) {
        this.A00 = r1;
    }

    public final void run() {
        String str;
        synchronized (this.A00) {
            try {
                C251117i r2 = this.A00;
                r2.A00 = r2.A01.now();
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        HashMap hashMap = new HashMap();
        C251117i r5 = this.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList<C250917g> arrayList2 = new ArrayList<>();
        synchronized (r5.A09) {
            try {
                arrayList2.addAll(r5.A09);
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        for (C250917g AJs : arrayList2) {
            r5.A01.now();
            List AJs2 = AJs.AJs();
            r5.A01.now();
            arrayList.addAll(AJs2);
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        for (C250317a r22 : this.A00.A08) {
            try {
                str = (String) r22.A01.call();
            } catch (Exception unused) {
                str = null;
            }
            if (str != null) {
                hashMap.put(r22.A00, str);
            }
        }
        int i = this.A00.A05;
        if (i != 2000) {
            hashMap.put("sample_period_ms", Integer.toString(i));
        }
        this.A00.A0B.set(Pair.create(hashMap, unmodifiableList));
        ArrayList<C251417l> arrayList3 = new ArrayList<>();
        synchronized (this.A00.A0A) {
            try {
                arrayList3.addAll(this.A00.A0A);
            } catch (Throwable th3) {
                while (true) {
                    th = th3;
                    break;
                }
            }
        }
        for (C251417l A2q : arrayList3) {
            A2q.A2q(this.A00, hashMap, unmodifiableList);
        }
        synchronized (this.A00) {
            try {
                this.A00.A03 = false;
            } catch (Throwable th4) {
                while (true) {
                    th = th4;
                    break;
                }
            }
        }
        C251117i.A00(this.A00);
        return;
        throw th;
    }
}
