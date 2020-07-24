package p000X;

import android.view.View;
import com.instagram.p009ui.widget.proxy.ProxyFrameLayout;
import java.util.Iterator;

/* renamed from: X.1Fd  reason: invalid class name and case insensitive filesystem */
public final class C26751Fd implements View.OnClickListener {
    public final /* synthetic */ ProxyFrameLayout A00;

    public C26751Fd(ProxyFrameLayout proxyFrameLayout) {
        this.A00 = proxyFrameLayout;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1898585963);
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        ProxyFrameLayout proxyFrameLayout = this.A00;
        View.OnClickListener onClickListener = proxyFrameLayout.A00;
        if (onClickListener != null && proxyFrameLayout.A01) {
            onClickListener.onClick(view);
        }
        AnonymousClass0Z0.A0C(-1147576667, A05);
    }
}
