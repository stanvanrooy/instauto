package p000X;

import android.view.ViewStub;
import android.widget.TextView;

/* renamed from: X.1fe  reason: invalid class name and case insensitive filesystem */
public final class C35001fe {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public C26571Ea A03;
    public C158306pP A04;

    public final C158306pP A00() {
        if (this.A04 == null) {
            this.A04 = new C158306pP(this.A03.A01());
        }
        return this.A04;
    }

    public C35001fe(ViewStub viewStub) {
        this.A03 = new C26571Ea(viewStub);
    }
}
