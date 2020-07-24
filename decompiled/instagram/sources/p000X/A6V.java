package p000X;

import android.content.DialogInterface;
import com.facebook.react.views.modal.ReactModalHostManager;

/* renamed from: X.A6V */
public final class A6V implements DialogInterface.OnShowListener {
    public final /* synthetic */ A9C A00;
    public final /* synthetic */ ReactModalHostManager A01;
    public final /* synthetic */ A6P A02;

    public A6V(ReactModalHostManager reactModalHostManager, A9C a9c, A6P a6p) {
        this.A01 = reactModalHostManager;
        this.A00 = a9c;
        this.A02 = a6p;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.A00.ACG(new A6Y(this.A02.getId()));
    }
}
