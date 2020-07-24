package p000X;

import java.util.HashMap;
import java.util.Set;

/* renamed from: X.1vs  reason: invalid class name and case insensitive filesystem */
public final class C44271vs extends C44281vt {
    public final /* synthetic */ C44261vr A00;
    public final /* synthetic */ HashMap A01;
    public final /* synthetic */ Set A02;

    public final int getRunnableId() {
        return 233;
    }

    public C44271vs(C44261vr r1, HashMap hashMap, Set set) {
        this.A00 = r1;
        this.A01 = hashMap;
        this.A02 = set;
    }

    public final void A01(Exception exc) {
        AnonymousClass0QD.A09("EncryptedSharedPrefs_apply_failed_write_to_disk", exc);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Set set = this.A02;
            AnonymousClass0a4.A06(set);
            if (!set.isEmpty()) {
                C44261vr.A00(this.A00, this.A02);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C22560yd r0 = this.A00.A02;
        return Boolean.valueOf(r0.A00.Buf(r0.A03, this.A01));
    }
}
