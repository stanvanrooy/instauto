package p000X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.1dN  reason: invalid class name and case insensitive filesystem */
public final class C33711dN implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass1EW A00;
    public final /* synthetic */ WeakReference A01;

    public C33711dN(AnonymousClass1EW r1, WeakReference weakReference) {
        this.A00 = r1;
        this.A01 = weakReference;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-898372509);
        AnonymousClass1HL r0 = (AnonymousClass1HL) this.A01.get();
        if (r0 != null) {
            r0.Bel();
        } else {
            this.A00.A06.setOnClickListener((View.OnClickListener) null);
        }
        AnonymousClass0Z0.A0C(-819593392, A05);
    }
}
