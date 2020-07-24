package p000X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.HashMap;

/* renamed from: X.1vm  reason: invalid class name and case insensitive filesystem */
public final class C44211vm extends C17920r1 {
    public AnonymousClass0PL A00;
    public int A01;
    public long A02;
    public String A03;
    public final /* synthetic */ C13770jC A04;

    public C44211vm(C13770jC r1, AnonymousClass0PL r2, String str, long j, int i) {
        this.A04 = r1;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = j;
        this.A01 = i;
    }

    public final void onFail(C43791v5 r6) {
        int A032 = AnonymousClass0Z0.A03(-1890243810);
        if (r6.A03()) {
            AnonymousClass0QD.A01(C13770jC.A02.getName(), AnonymousClass000.A0E("Configurations synchronization failed! message: ", ((C44301vv) r6.A00).getErrorMessage()));
        }
        C150416c3.A01(this.A03, this.A02);
        C13740j9.A00("LauncherSyncPrefs").A0B(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, (long) this.A01);
        this.A00.A01(C33641dF.FAILURE);
        AnonymousClass0Z0.A0A(-1791480701, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        C33641dF r0;
        int A032 = AnonymousClass0Z0.A03(740186444);
        int A033 = AnonymousClass0Z0.A03(-1535305408);
        C13790jE r2 = this.A04.A01;
        HashMap hashMap = ((C44301vv) obj).A00;
        synchronized (r2) {
            if (C13790jE.A01(hashMap, r2.A00.A00)) {
                r2.A00.A00 = hashMap;
                C13790jE.A00(r2, r2.A01);
                z = true;
            } else {
                z = false;
            }
        }
        AnonymousClass0PL r1 = this.A00;
        if (z) {
            r0 = C33641dF.SUCCESS_DID_UPDATE;
        } else {
            r0 = C33641dF.SUCCESS_DID_NOT_UPDATE;
        }
        r1.A01(r0);
        AnonymousClass0Z0.A0A(-467159884, A033);
        AnonymousClass0Z0.A0A(-1595812130, A032);
    }
}
