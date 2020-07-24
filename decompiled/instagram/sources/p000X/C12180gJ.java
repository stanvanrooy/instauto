package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0gJ  reason: invalid class name and case insensitive filesystem */
public final class C12180gJ implements Runnable, C12170gI {
    public Context A00;
    public Handler A01;
    public C12100gB A02;
    public volatile boolean A03 = false;

    public final void A5F() {
        if (this.A03) {
            AnonymousClass0ZA.A08(this.A01, this);
            this.A03 = false;
        }
        AnonymousClass0ZA.A09(this.A01, this, ArLinkScanControllerImpl.ERROR_DELAY_MS, 953278287);
        this.A03 = true;
    }

    public final void A5G() {
        if (this.A03) {
            AnonymousClass0ZA.A08(this.A01, this);
            this.A03 = false;
        }
    }

    public final void run() {
        C12410gh r7;
        for (int A04 : this.A02.A01) {
            for (AnonymousClass299 r2 : new ArrayList(this.A02.A04(A04).A05)) {
                if (r2.A04 == 1 && r2 != null && (r7 = r2.A01) != null && (r7 instanceof C55852bW)) {
                    C55852bW r72 = (C55852bW) r7;
                    if (r72.A00 != 0) {
                        C51762Ma r0 = r2.A05;
                        if (r0 == null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("optimization_type", "CPU-Boost-without-parameters");
                            String A002 = AnonymousClass0KW.A00(r2.A03);
                            long j = r72.A00;
                            long j2 = r72.A02;
                            long j3 = j2;
                            C45241xW.A01(A002, j, j3, r72.A01, this.A00, new HashMap(), hashMap);
                        } else {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("cpu_level", Long.valueOf((long) r0.A03));
                            hashMap2.put("gpu_level", -1L);
                            hashMap2.put("platform", Long.valueOf((long) r2.A05.A00));
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("optimization_type", "CPU-Boost");
                            C45241xW.A01(AnonymousClass0KW.A00(r2.A03), r72.A00, r72.A02, r72.A01, this.A00, hashMap2, hashMap3);
                            r72.A00 = 0;
                            r72.A01 = 0;
                            r72.A02 = 0;
                        }
                    }
                }
            }
        }
        this.A03 = false;
    }

    public final void ACs(Context context, C12100gB r4, HandlerThread handlerThread) {
        this.A00 = context.getApplicationContext();
        this.A02 = r4;
        this.A01 = new Handler(handlerThread.getLooper());
    }
}
