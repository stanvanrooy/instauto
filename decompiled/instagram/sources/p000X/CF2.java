package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CF2 */
public final class CF2 extends AnonymousClass4UW {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C27434CDc A01;
    public final /* synthetic */ CD3 A02;
    public final /* synthetic */ AnonymousClass0C1 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CF2(C27434CDc cDc, int i, CD3 cd3, String str, FragmentActivity fragmentActivity, AnonymousClass0C1 r6, String str2) {
        super(i);
        this.A01 = cDc;
        this.A02 = cd3;
        this.A04 = str;
        this.A00 = fragmentActivity;
        this.A03 = r6;
        this.A05 = str2;
    }

    public final void onClick(View view) {
        CCZ.A07(this.A02, this.A01.A01, this.A04);
        AnonymousClass2UC r4 = new AnonymousClass2UC(this.A00, this.A03, this.A05, AnonymousClass2UD.PROMOTE);
        r4.A04(AnonymousClass0C5.$const$string(281));
        r4.A01();
    }
}
