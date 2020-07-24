package p000X;

import android.os.Message;
import android.widget.Adapter;

/* renamed from: X.1Qm  reason: invalid class name and case insensitive filesystem */
public final class C29591Qm extends C29571Qk {
    public final /* synthetic */ C29551Qi A00;
    public final /* synthetic */ AnonymousClass1PL A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29591Qm(C29551Qi r2, AnonymousClass1PL r3) {
        super(5);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A03(Adapter adapter, int i) {
        if (i >= 0 && i < this.A01.getCount() && (this.A01.getItem(i) instanceof AnonymousClass1NJ)) {
            AnonymousClass1NJ r7 = (AnonymousClass1NJ) this.A01.getItem(i);
            C36841ih APu = this.A01.APu(r7);
            C29181Ox r5 = this.A00.A02;
            boolean z = APu.A0j;
            boolean A07 = C17050pb.A07(r7, APu.AHt());
            boolean z2 = false;
            if (APu.A0D == C36881il.Translated) {
                z2 = true;
            }
            int A002 = C37091j6.A00(z, A07, z2);
            Message obtainMessage = r5.A07.obtainMessage(2, new C481626w(r7, APu.A0E));
            obtainMessage.arg1 = A002;
            AnonymousClass0ZA.A0D(r5.A07, obtainMessage);
        }
    }

    public final boolean A04(Adapter adapter, int i) {
        Object item = adapter.getItem(i);
        if (!(item instanceof AnonymousClass1NJ) || ((AnonymousClass1NJ) item).A08() <= 0) {
            return false;
        }
        return true;
    }
}
