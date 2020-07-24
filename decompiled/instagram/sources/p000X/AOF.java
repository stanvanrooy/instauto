package p000X;

import android.view.View;

/* renamed from: X.AOF */
public final class AOF implements View.OnClickListener {
    public final /* synthetic */ C23474ANw A00;

    public AOF(C23474ANw aNw) {
        this.A00 = aNw;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1573023752);
        C23467ANo aNo = this.A00.A03;
        if (aNo != null) {
            C23470ANr aNr = aNo.A05;
            aNr.A05(Constants.A0u);
            String str = aNr.A0B;
            C15890nh r3 = new C15890nh(aNr.A0Z);
            r3.A09 = Constants.ONE;
            r3.A0E("/live/%s/resume_broadcast_after_content_match/", str);
            r3.A06(AnonymousClass1N4.class, true);
            r3.A0G = true;
            C12810hQ.A02(r3.A03());
        }
        AnonymousClass0Z0.A0C(-1769439958, A05);
    }
}
