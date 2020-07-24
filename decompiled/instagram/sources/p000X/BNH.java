package p000X;

import android.content.pm.Signature;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.BNH */
public final class BNH implements C25584BQq {
    public final /* synthetic */ BOF A00;

    public BNH(BOF bof) {
        this.A00 = bof;
    }

    public final C25521BOf ADg() {
        Signature[] signatureArr = this.A00.A00.getPackageManager().getPackageInfo(this.A00.A00.getPackageName(), 64).signatures;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < signatureArr.length; i++) {
            hashMap.put(Integer.valueOf(i), new C25252BAf(signatureArr[i]));
        }
        return new C25500BNk(SystemClock.elapsedRealtime(), this.A00.A01(), hashMap, Constants.ZERO);
    }
}
