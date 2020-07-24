package p000X;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0oJ  reason: invalid class name and case insensitive filesystem */
public final class C16260oJ extends C16270oK {
    public AnonymousClass5OC A00;

    public final AnonymousClass5OC A01() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass5OC();
        }
        return this.A00;
    }

    public final C122715Np A00(AnonymousClass0C1 r2) {
        return C122715Np.A00(r2);
    }

    public final List A02(AnonymousClass0C1 r2) {
        return Collections.unmodifiableList(AnonymousClass5NJ.A00(r2).A05);
    }

    public final void A03(AnonymousClass0C1 r3) {
        AnonymousClass5NJ A002 = AnonymousClass5NJ.A00(r3);
        synchronized (A002) {
            A002.A00 = null;
            A002.A02.clear();
            A002.A03.clear();
            A002.A04.clear();
            A002.A05.clear();
        }
    }

    public final void A04(AnonymousClass0C1 r4, Context context, AnonymousClass1NJ r6) {
        AnonymousClass5NJ A002 = AnonymousClass5NJ.A00(r4);
        synchronized (A002) {
            A002.A00 = r6;
            for (AnonymousClass5NO A02 : A002.A03) {
                AnonymousClass5NJ.A02(A002, A02);
            }
            A002.A03.clear();
            for (AnonymousClass5NO A01 : A002.A02) {
                AnonymousClass5NJ.A01(A002, context, A01);
            }
            A002.A02.clear();
        }
    }
}
