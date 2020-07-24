package p000X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.0hJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12740hJ implements AnonymousClass0IT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C12700hF A01;

    public /* synthetic */ C12740hJ(C12700hF r1, Context context) {
        this.A01 = r1;
        this.A00 = context;
    }

    public final Object get() {
        C12700hF r0 = this.A01;
        Context context = this.A00;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        if (AnonymousClass8FZ.A02 == null) {
            AnonymousClass8FZ.A02 = new AnonymousClass8FZ(context.getApplicationContext(), quickPerformanceLogger);
            AnonymousClass0Q7.A03().A0B(AnonymousClass8FZ.A02);
        }
        return AnonymousClass8FZ.A02;
    }
}
