package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.mainactivity.MainActivity;
import com.instagram.p009ui.widget.proxy.ProxyFrameLayout;

/* renamed from: X.1Fh  reason: invalid class name and case insensitive filesystem */
public final class C26791Fh implements View.OnClickListener {
    public final /* synthetic */ MainActivity A00;
    public final /* synthetic */ AnonymousClass1DU A01;
    public final /* synthetic */ ProxyFrameLayout A02;

    public C26791Fh(MainActivity mainActivity, AnonymousClass1DU r2, ProxyFrameLayout proxyFrameLayout) {
        this.A00 = mainActivity;
        this.A01 = r2;
        this.A02 = proxyFrameLayout;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(194407685);
        if (this.A00.Aew(this.A01)) {
            AnonymousClass1HD A0L = this.A00.A04.A02.A02.A05().A0L(C0003R.C0005id.layout_container_main);
            if (A0L != null) {
                if (A0L instanceof AnonymousClass1HL) {
                    ((AnonymousClass1HL) A0L).Bel();
                }
                if (A0L instanceof AnonymousClass2Z2) {
                    ((AnonymousClass2Z2) A0L).AE3(false);
                }
            }
        } else {
            this.A00.A01.setSelected(false);
            MainActivity mainActivity = this.A00;
            ProxyFrameLayout proxyFrameLayout = this.A02;
            mainActivity.A01 = proxyFrameLayout;
            proxyFrameLayout.setSelected(true);
            AnonymousClass1DS r0 = this.A00.A04;
            r0.A02.A01(this.A01);
        }
        AnonymousClass0Z0.A0C(2124502377, A05);
    }
}
