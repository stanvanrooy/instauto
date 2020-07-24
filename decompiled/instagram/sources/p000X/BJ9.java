package p000X;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* renamed from: X.BJ9 */
public abstract class BJ9 extends BJA implements C25376BGp, C25439BKc {
    public final Account A00;
    public final C25387BHd A01;
    public final Set A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    public BJ9(Context context, Looper looper, int i, C25387BHd bHd, C25437BKa bKa, BEH beh) {
        super(r3, looper, r5, r6, i, r8, r9, bHd.A03);
        Context context2;
        BKC bkc;
        BKJ bkj;
        synchronized (BK8.A01) {
            context2 = context;
            if (BK8.A00 == null) {
                BK8.A00 = new BJC(context.getApplicationContext());
            }
        }
        BK8 bk8 = BK8.A00;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C25437BKa bKa2 = bKa;
        AnonymousClass0a2.A02(bKa2);
        BEH beh2 = beh;
        AnonymousClass0a2.A02(beh2);
        if (bKa == null) {
            bkc = null;
        } else {
            bkc = new BKC(bKa2);
        }
        if (beh == null) {
            bkj = null;
        } else {
            bkj = new BKJ(beh2);
        }
        this.A01 = bHd;
        this.A00 = null;
        Set<Scope> set = bHd.A06;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.A02 = set;
    }
}
