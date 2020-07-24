package p000X;

import android.content.Context;

/* renamed from: X.1Mz  reason: invalid class name and case insensitive filesystem */
public final class C28761Mz extends AnonymousClass1N0 {
    public final /* synthetic */ C28631Mm A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28761Mz(C28631Mm r1, Context context) {
        super(context);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A08() {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01(AnonymousClass000.A0E("run ", this.A00.A02.getName()), -479205622);
        }
        try {
            this.A00.A02.run();
            return Boolean.TRUE;
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1379370995);
            }
        }
    }
}
