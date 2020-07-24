package p000X;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: X.BIN */
public final class BIN implements C25388BHf {
    public final /* synthetic */ BIG A00;
    public final /* synthetic */ BK9 A01;
    public final /* synthetic */ BIW A02;
    public final /* synthetic */ boolean A03;

    public BIN(BIW biw, BK9 bk9, boolean z, BIG big) {
        this.A02 = biw;
        this.A01 = bk9;
        this.A03 = z;
        this.A00 = big;
    }

    public final /* synthetic */ void BJo(C138515vO r4) {
        Status status = (Status) r4;
        C229369xj A002 = C229369xj.A00(this.A02.A06);
        String $const$string = C193418Ps.$const$string(96);
        String A012 = C229369xj.A01(A002, $const$string);
        C229369xj.A03(A002, $const$string);
        if (!TextUtils.isEmpty(A012)) {
            C229369xj.A03(A002, C229369xj.A02(C193418Ps.$const$string(107), A012));
            C229369xj.A03(A002, C229369xj.A02(C193418Ps.$const$string(108), A012));
        }
        if (status.A01() && this.A02.A0I()) {
            BIW biw = this.A02;
            biw.A0B();
            biw.A0A();
        }
        this.A01.A09(status);
        if (this.A03) {
            this.A00.A0B();
        }
    }
}
