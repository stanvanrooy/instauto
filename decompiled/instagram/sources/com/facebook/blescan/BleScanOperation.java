package com.facebook.blescan;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass22R;
import p000X.C229979yy;
import p000X.C50922Ij;

public final class BleScanOperation extends AnonymousClass22R {
    public C50922Ij A00;
    public C229979yy A01;
    public boolean A02;
    public final Context A03;
    public final ScheduledExecutorService A04;

    public static void A00(BleScanOperation bleScanOperation) {
        bleScanOperation.A02 = false;
        bleScanOperation.A00 = null;
        C229979yy r0 = bleScanOperation.A01;
        if (r0 != null) {
            if (r0.AhQ()) {
                try {
                    bleScanOperation.A01.BqV();
                } catch (Exception e) {
                    AnonymousClass0DB.A0G("com.facebook.blescan.BleScanOperation", "Exception stopping BLE scanning", e);
                }
            }
            bleScanOperation.A01 = null;
        }
    }

    public BleScanOperation(ScheduledExecutorService scheduledExecutorService, Context context, C229979yy r3) {
        this.A04 = scheduledExecutorService;
        this.A03 = context;
        this.A01 = r3;
    }
}
