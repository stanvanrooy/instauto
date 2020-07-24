package p000X;

import java.util.Map;

/* renamed from: X.AT4 */
public final class AT4 implements Runnable {
    public final /* synthetic */ AnonymousClass2WZ A00;
    public final /* synthetic */ Map A01;

    public AT4(AnonymousClass2WZ r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public final void run() {
        this.A00.getActivity().getFragmentManager().beginTransaction().remove(this.A00).commitAllowingStateLoss();
        C51742Ly r1 = this.A00.A00;
        if (r1 != null) {
            r1.BE9(this.A01);
        }
    }
}
