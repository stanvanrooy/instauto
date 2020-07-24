package p000X;

import android.view.View;
import com.instagram.mainactivity.MainActivity;
import com.instagram.p009ui.widget.proxy.ProxyFrameLayout;

/* renamed from: X.1Fj  reason: invalid class name and case insensitive filesystem */
public final class C26811Fj implements View.OnClickListener {
    public final /* synthetic */ MainActivity A00;
    public final /* synthetic */ ProxyFrameLayout A01;

    public C26811Fj(MainActivity mainActivity, ProxyFrameLayout proxyFrameLayout) {
        this.A00 = mainActivity;
        this.A01 = proxyFrameLayout;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1335886181);
        this.A01.post(new AnonymousClass2Z1(this, this));
        AnonymousClass0Z0.A0C(-529028347, A05);
    }
}
