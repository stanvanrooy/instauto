package p000X;

import android.view.View;
import com.instagram.mainactivity.MainActivity;

/* renamed from: X.1Fi  reason: invalid class name and case insensitive filesystem */
public final class C26801Fi implements View.OnClickListener {
    public final /* synthetic */ MainActivity A00;
    public final /* synthetic */ AnonymousClass1DU A01;

    public C26801Fi(MainActivity mainActivity, AnonymousClass1DU r2) {
        this.A00 = mainActivity;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1098660385);
        String str = AnonymousClass1BC.A02.A00;
        if (!this.A00.Aew(this.A01) || this.A00.A05().A0I() > 0 || (str != null && !str.equals(this.A01.A02))) {
            C26441Dh.A00(this.A00.A06).A03(this.A00, this.A01.A03);
        }
        AnonymousClass0Z0.A0C(-933675368, A05);
    }
}
