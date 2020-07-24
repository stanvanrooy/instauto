package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CCG */
public final class CCG implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ CD3 A01;

    public CCG(FragmentActivity fragmentActivity, CD3 cd3) {
        this.A00 = fragmentActivity;
        this.A01 = cd3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1539835264);
        C16310oO.A00.A02();
        C27410CCd cCd = new C27410CCd();
        C52362Om r2 = new C52362Om(this.A00, this.A01.A0Q);
        r2.A02 = cCd;
        r2.A02();
        AnonymousClass0Z0.A0C(-1723074509, A05);
    }
}
