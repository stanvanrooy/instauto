package p000X;

import android.content.Context;

/* renamed from: X.05g  reason: invalid class name and case insensitive filesystem */
public class C030705g extends C10000cV {
    public final AnonymousClass00N A00;

    public final synchronized AnonymousClass0XW A00(Context context, String str) {
        AnonymousClass0XW r0;
        r0 = null;
        if (str != null) {
            r0 = (AnonymousClass0XW) this.A00.get(str);
        }
        return r0;
    }

    public final synchronized boolean A01(String str) {
        return false;
    }

    public C030705g(AnonymousClass0XW r5, AnonymousClass0XW r6) {
        AnonymousClass00N r1 = new AnonymousClass00N(2);
        this.A00 = r1;
        r1.put("android.intent.action.ACTION_SHUTDOWN", r5);
        this.A00.put("android.intent.action.BOOT_COMPLETED", r6);
    }
}
