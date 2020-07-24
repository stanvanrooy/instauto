package p000X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.24k  reason: invalid class name and case insensitive filesystem */
public final class C475324k implements C06570Po, C475424l {
    public final C242914a A00;

    public final AnonymousClass16T Aap() {
        return this.A00.Aap();
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.close();
    }

    public C475324k(Context context, String str) {
        String A0E = AnonymousClass000.A0E("user_reel_medias_db_", str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C475624n.A00);
        C475924q r2 = new C475924q(C476024r.A00, arrayList);
        if (context != null) {
            C242914a A9z = new AnonymousClass14X().A9z(new AnonymousClass14V(context, A0E, r2));
            this.A00 = A9z;
            A9z.Blx(true);
            return;
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }
}
