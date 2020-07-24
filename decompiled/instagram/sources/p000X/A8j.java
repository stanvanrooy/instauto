package p000X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Set;

/* renamed from: X.A8j */
public final class A8j {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ A83 A03;
    public final /* synthetic */ ViewGroupManager A04;
    public final /* synthetic */ Set A05;

    public A8j(A83 a83, ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i) {
        this.A03 = a83;
        this.A04 = viewGroupManager;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A05 = set;
        this.A00 = i;
    }

    public final void A00() {
        C228039ra.A00();
        this.A04.removeView(this.A02, this.A01);
        this.A03.A08(this.A01);
        this.A05.remove(Integer.valueOf(this.A01.getId()));
        if (this.A05.isEmpty()) {
            this.A03.A01.remove(Integer.valueOf(this.A00));
        }
    }
}
