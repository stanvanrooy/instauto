package p000X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.0nU  reason: invalid class name and case insensitive filesystem */
public final class C15760nU implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0MT A02;
    public final /* synthetic */ AnonymousClass0C1 A03;
    public final /* synthetic */ C15630nH A04;

    public C15760nU(C15630nH r1, Context context, AnonymousClass0C1 r3, AnonymousClass0MT r4, int i) {
        this.A04 = r1;
        this.A01 = context;
        this.A03 = r3;
        this.A02 = r4;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return C15630nH.A01(this.A04, this.A01, this.A03, this.A02, this.A00);
    }
}
