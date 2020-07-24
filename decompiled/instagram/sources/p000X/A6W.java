package p000X;

import android.content.DialogInterface;
import com.facebook.react.views.modal.ReactModalHostManager;

/* renamed from: X.A6W */
public final class A6W implements C23087A6a {
    public final /* synthetic */ A9C A00;
    public final /* synthetic */ ReactModalHostManager A01;
    public final /* synthetic */ A6P A02;

    public A6W(ReactModalHostManager reactModalHostManager, A9C a9c, A6P a6p) {
        this.A01 = reactModalHostManager;
        this.A00 = a9c;
        this.A02 = a6p;
    }

    public final void BIu(DialogInterface dialogInterface) {
        this.A00.ACG(new A6X(this.A02.getId()));
    }
}
