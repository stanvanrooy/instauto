package p000X;

import java.io.IOException;

/* renamed from: X.0an  reason: invalid class name and case insensitive filesystem */
public final class C09190an implements C06560Pn {
    public final /* synthetic */ AnonymousClass05V A00;
    public final /* synthetic */ C15130mO A01;

    public final void As0(C06590Pq r1) {
    }

    public C09190an(AnonymousClass05V r1, C15130mO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Arz(C06590Pq r5) {
        try {
            this.A01.A01(r5);
        } catch (IOException e) {
            AnonymousClass0QD.A01("ig_cache_logger", C06360Ot.formatString("Could not report logs. %s", e.getLocalizedMessage()));
        }
    }
}
