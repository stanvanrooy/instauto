package p000X;

import android.app.Application;
import java.util.concurrent.Executor;

/* renamed from: X.06f  reason: invalid class name and case insensitive filesystem */
public final class C032506f extends AnonymousClass0N1 {
    public final /* synthetic */ AnonymousClass0EV A00;

    public C032506f(AnonymousClass0EV r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        AnonymousClass0ZL.A01("ReportSender", -1300134333);
        try {
            AnonymousClass0EV r1 = this.A00;
            Application application = r1.A0H;
            if (r1.A04 == null) {
                r1.A04 = new AnonymousClass06S(r1);
            }
            C09130af r4 = (C09130af) r1.A04.get();
            AnonymousClass0EV r12 = this.A00;
            AnonymousClass0IT A03 = r12.A03();
            if (r12.A03 == null) {
                r12.A03 = new AnonymousClass06g(r12);
            }
            AnonymousClass0EF r6 = (AnonymousClass0EF) r12.A03.get();
            AnonymousClass0EV r13 = this.A00;
            if (r13.A07 == null) {
                r13.A07 = new AnonymousClass06T(r13);
            }
            return new AnonymousClass0F7(application, r4, A03, r6, (Executor) r13.A07.get(), new AnonymousClass0EU(this));
        } finally {
            AnonymousClass0ZL.A00(-635862247);
        }
    }
}
