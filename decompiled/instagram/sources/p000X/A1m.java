package p000X;

import android.content.Context;
import com.facebook.redex.dynamicanalysis.DynamicAnalysis;

/* renamed from: X.A1m */
public final class A1m extends AnonymousClass0O9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0C1 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A1m(Context context, AnonymousClass0C1 r3) {
        super(286);
        this.A00 = context;
        this.A01 = r3;
    }

    public final void run() {
        AnonymousClass0DB.A0E("DYNA|IgDynamicAnalysisManager", "Cold start data isn't ready or already consumed");
        DynamicAnalysis.A00();
    }
}
