package p000X;

import android.view.View;
import com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity;

/* renamed from: X.B3v */
public final class B3v implements View.OnClickListener {
    public final /* synthetic */ WaitingForStringsActivity A00;

    public B3v(WaitingForStringsActivity waitingForStringsActivity) {
        this.A00 = waitingForStringsActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(931905359);
        C25166B3y b3y = new C25166B3y(this.A00.A03.A01.A02("fbresources_use_english"));
        if (b3y.A0B()) {
            b3y.A01();
        }
        C14330kH r2 = this.A00.A04;
        r2.A03.A01.set(true);
        r2.A06.set((Object) null);
        r2.A03();
        WaitingForStringsActivity.A01(this.A00);
        AnonymousClass0Z0.A0C(-863912443, A05);
    }
}
