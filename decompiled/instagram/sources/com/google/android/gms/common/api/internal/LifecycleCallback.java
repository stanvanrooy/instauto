package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000X.BCG;
import p000X.BE7;
import p000X.BE8;
import p000X.BE9;
import p000X.BED;
import p000X.BEE;

public class LifecycleCallback {
    public final BED A00;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    public void A01(int i, int i2, Intent intent) {
        if (this instanceof BE9) {
            BE9 be9 = (BE9) this;
            BEE bee = (BEE) be9.A02.get();
            boolean z = true;
            if (i == 1) {
                if (i2 != -1) {
                    if (i2 == 0) {
                        int i3 = 13;
                        if (intent != null) {
                            i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                        }
                        BEE bee2 = new BEE(new ConnectionResult(i3, (PendingIntent) null), bee == null ? -1 : bee.A00);
                        be9.A02.set(bee2);
                        bee = bee2;
                    }
                }
                if (z) {
                }
            } else if (i == 2) {
                int isGooglePlayServicesAvailable = be9.A01.isGooglePlayServicesAvailable(be9.A00.AP1());
                if (isGooglePlayServicesAvailable != 0) {
                    z = false;
                }
                if (bee != null) {
                    if (bee.A01.A00 == 18 && isGooglePlayServicesAvailable == 18) {
                        return;
                    }
                    if (z) {
                        be9.A02.set((Object) null);
                        be9.A07();
                        return;
                    } else if (bee != null) {
                        be9.A08(bee.A01, bee.A00);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    public void A02(Bundle bundle) {
    }

    public void A03(Bundle bundle) {
    }

    public void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this instanceof BE7) {
            BE7 be7 = (BE7) this;
            for (int i = 0; i < be7.A00.size(); i++) {
                BE8 A002 = BE7.A00(be7, i);
                if (A002 != null) {
                    printWriter.append(str).append("GoogleApiClient #").print(A002.A00);
                    printWriter.println(":");
                    A002.A02.A0H(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    public void A05() {
    }

    public void A06() {
    }

    public static BED getChimeraLifecycleFragmentImpl(BCG bcg) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public LifecycleCallback(BED bed) {
        this.A00 = bed;
    }
}
