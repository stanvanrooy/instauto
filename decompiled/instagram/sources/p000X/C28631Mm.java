package p000X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.1Mm  reason: invalid class name and case insensitive filesystem */
public final class C28631Mm implements C28641Mn {
    public final int A00;
    public final AnonymousClass1L8 A01;
    public final C17860qv A02;
    public final Context A03;

    public final AnonymousClass1N3 Ayb(int i, Bundle bundle) {
        this.A02.onStart();
        return new C28761Mz(this, this.A03);
    }

    public final /* bridge */ /* synthetic */ void B9b(AnonymousClass1N3 r3, Object obj) {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01(AnonymousClass000.A0E(this.A02.getName(), " onFinish"), 836278895);
        }
        try {
            this.A02.onFinish();
            this.A01.A06(this.A00);
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-816783763);
            }
        }
    }

    public C28631Mm(Context context, AnonymousClass1L8 r3, int i, C17860qv r5) {
        this.A03 = context.getApplicationContext();
        this.A01 = r3;
        this.A00 = i;
        this.A02 = r5;
    }
}
