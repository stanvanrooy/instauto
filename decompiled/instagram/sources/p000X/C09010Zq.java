package p000X;

import android.os.Process;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.0Zq  reason: invalid class name and case insensitive filesystem */
public final class C09010Zq extends AnonymousClass0O9 {
    public final /* synthetic */ C08940Zi A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09010Zq(C08940Zi r2) {
        super(13);
        this.A00 = r2;
    }

    public final void run() {
        if (C05630Li.A03(new C05000Hl("enabled", AnonymousClass0L7.MPROTECT_CODE, false, (String[]) null, (AnonymousClass04H) null))) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            Process.setThreadPriority(-14);
            DalvikInternals.mprotectExecCode();
            C08940Zi.A00();
            C08940Zi r2 = this.A00;
            if (C05630Li.A03(new C05000Hl("madv_after_startup", AnonymousClass0L7.MPROTECT_CODE, (Object) null, (String[]) null, (AnonymousClass04H) null))) {
                AnonymousClass0Q7.A03().A0B(new C08970Zl(r2));
            }
            Process.setThreadPriority(threadPriority);
        }
    }
}
