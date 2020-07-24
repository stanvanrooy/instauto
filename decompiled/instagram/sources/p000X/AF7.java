package p000X;

import com.facebook.C0003R;
import com.instagram.igds.components.bottombutton.IgBottomButtonLayout;

/* renamed from: X.AF7 */
public final class AF7 extends C53592Tk {
    public final /* synthetic */ AnonymousClass1OP A00;
    public final /* synthetic */ AF8 A01;

    public AF7(AF8 af8, AnonymousClass1OP r2) {
        this.A01 = af8;
        this.A00 = r2;
    }

    public final void A02(C43791v5 r3) {
        this.A01.A01.A04.A07(false);
        IgBottomButtonLayout igBottomButtonLayout = this.A01.A01.A01;
        if (igBottomButtonLayout != null) {
            igBottomButtonLayout.setPrimaryButtonEnabled(true);
        }
        AnonymousClass5F9.A00(this.A01.A00, C0003R.string.product_source_network_error);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        this.A01.A01.A04.A07(true);
        C224999mQ.A01(this.A00, (C139175xA) obj);
        IgBottomButtonLayout igBottomButtonLayout = this.A01.A01.A01;
        if (igBottomButtonLayout != null) {
            igBottomButtonLayout.setPrimaryButtonEnabled(true);
        }
    }
}
