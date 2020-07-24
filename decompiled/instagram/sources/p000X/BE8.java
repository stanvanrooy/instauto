package p000X;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.BE8 */
public final class BE8 implements BEH {
    public final int A00;
    public final BEH A01;
    public final BIG A02;
    public final /* synthetic */ BE7 A03;

    public BE8(BE7 be7, int i, BIG big, BEH beh) {
        this.A03 = be7;
        this.A00 = i;
        this.A02 = big;
        this.A01 = beh;
        big.A0F(this);
    }

    public final void Ay4(ConnectionResult connectionResult) {
        String.valueOf(connectionResult);
        BE7 be7 = this.A03;
        BEE bee = new BEE(connectionResult, this.A00);
        if (be7.A02.compareAndSet((Object) null, bee)) {
            AnonymousClass0ZA.A0E(be7.A00, new BEA(be7, bee), 1713486084);
        }
    }
}
