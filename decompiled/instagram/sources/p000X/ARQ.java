package p000X;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewStub;
import android.widget.RelativeLayout;

/* renamed from: X.ARQ */
public final class ARQ {
    public ViewStub A00;
    public ViewStub A01;
    public ARt A02;
    public ARt A03;
    public ASB A04;
    public ATp A05;

    public final void A00(int i, String str) {
        this.A00.setLayoutResource(i);
        ARt aRt = (ARt) this.A00.inflate();
        this.A02 = aRt;
        aRt.setControllers(this.A04, this.A05);
        aRt.AdS();
        ARt aRt2 = this.A02;
        if (!(aRt2 == null || str == null)) {
            char c = 65535;
            if (str.hashCode() == 92046178 && str.equals("watch_and_browse")) {
                c = 0;
            }
            if (c == 0) {
                ((RelativeLayout) aRt2).setBackground(new ColorDrawable(-16777216));
            }
        }
        ((RelativeLayout) this.A02).bringToFront();
    }
}
