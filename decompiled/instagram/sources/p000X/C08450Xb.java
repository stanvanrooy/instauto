package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.0Xb  reason: invalid class name and case insensitive filesystem */
public abstract class C08450Xb {
    public final C08440Xa A00;

    public boolean A00(Context context, Object obj, Intent intent) {
        return A01(context, obj, intent, (C23463ANk) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r1 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r1.equals(r11.getClass().getName()) != false) goto L_0x0034;
     */
    public boolean A01(Context context, Object obj, Intent intent, C23463ANk aNk) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.A00.BmZ()) {
            return true;
        }
        if (!AnonymousClass1A1.A00(obj, intent, context, aNk, this.A00.AJk())) {
            AnonymousClass0XZ[] ANt = this.A00.ANt();
            int length = ANt.length;
            int i = 0;
            while (i < length) {
                AnonymousClass0XZ r7 = ANt[i];
                String str = r7.A02;
                if (str != null) {
                    z = false;
                }
                z = true;
                if (z) {
                    IntentFilter intentFilter = r7.A01;
                    if (intentFilter != null) {
                        z3 = false;
                        if (intentFilter.match(r7.A00, intent, false, "TAG") > 0) {
                            z3 = true;
                        }
                        if (r7.A03) {
                            boolean z4 = z3;
                            z3 = false;
                        }
                        z2 = true;
                    }
                    z3 = true;
                    z2 = true;
                }
                z2 = false;
                if (!z2) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public C08450Xb(C08440Xa r1) {
        this.A00 = r1;
    }
}
