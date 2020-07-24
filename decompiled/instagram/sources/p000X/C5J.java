package p000X;

import com.facebook.smartcapture.view.HelpButton;

/* renamed from: X.C5J */
public final class C5J implements Runnable {
    public final /* synthetic */ C4n A00;

    public C5J(C4n c4n) {
        this.A00 = c4n;
    }

    public final void run() {
        C4n c4n = this.A00;
        HelpButton helpButton = c4n.A0C;
        if (!helpButton.A00 && !c4n.A0E) {
            helpButton.setExpanded(true);
        }
    }
}
