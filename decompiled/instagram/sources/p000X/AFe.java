package p000X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.AFe */
public final class AFe extends C25821Am {
    public final /* synthetic */ AnonymousClass2W4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AFe(AnonymousClass2W4 r1, Window.Callback callback) {
        super(callback);
        this.A00 = r1;
    }

    public final View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(this.A00.A02.getContext());
        }
        return super.onCreatePanelView(i);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            AnonymousClass2W4 r1 = this.A00;
            if (!r1.A00) {
                r1.A02.Biw();
                r1.A00 = true;
            }
        }
        return onPreparePanel;
    }
}
