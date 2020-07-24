package p000X;

import android.content.Context;

/* renamed from: X.0eC  reason: invalid class name and case insensitive filesystem */
public final class C10960eC {
    public Context A00;

    public final C10980eE A00(Integer num) {
        boolean z;
        AnonymousClass0T6 r3 = AnonymousClass0T6.A00;
        Context context = this.A00;
        String A0E = AnonymousClass000.A0E("rti.mqtt.", AnonymousClass0T3.A00(num));
        switch (num.intValue()) {
            case 1:
            case 2:
            case 4:
            case 5:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return new C10980eE(r3.A00(context, A0E, z));
    }

    public C10960eC(Context context) {
        this.A00 = context;
    }
}
