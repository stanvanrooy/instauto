package p000X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.1pq  reason: invalid class name and case insensitive filesystem */
public final class C41151pq extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41151pq(C37531jo r3) {
        super("mprotectCode", 372);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r5 = this.A00;
        if (((Boolean) AnonymousClass0L6.A02(r5.A07, AnonymousClass0L7.MPROTECT_CODE, "enabled_after_startup", false, (AnonymousClass04H) null)).booleanValue()) {
            DalvikInternals.mprotectExecCode();
            AnonymousClass0Q7.A03().A0B(new C55082a2(r5));
        }
    }
}
