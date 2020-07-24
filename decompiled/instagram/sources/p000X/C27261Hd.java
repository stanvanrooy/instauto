package p000X;

import android.view.View;
import android.view.Window;

/* renamed from: X.1Hd  reason: invalid class name and case insensitive filesystem */
public final class C27261Hd extends AnonymousClass1AK {
    public final /* synthetic */ AnonymousClass1HB A00;

    public C27261Hd(AnonymousClass1HB r1) {
        this.A00 = r1;
    }

    public final View A00(int i) {
        if (this.A00.getActivity().getWindow().getDecorView() != null) {
            return this.A00.getActivity().findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a Activity view");
    }

    public final boolean A01() {
        Window window = this.A00.getActivity().getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }
}
