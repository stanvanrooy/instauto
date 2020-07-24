package p000X;

import java.util.List;

/* renamed from: X.1Ww  reason: invalid class name and case insensitive filesystem */
public final class C31191Ww extends C17920r1 {
    public long A00 = System.currentTimeMillis();
    public final /* synthetic */ C27581Ik A01;
    public final /* synthetic */ AnonymousClass1OR A02;
    public final /* synthetic */ boolean A03;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int A032 = AnonymousClass0Z0.A03(1444633868);
        C33901dg r6 = (C33901dg) obj;
        int A033 = AnonymousClass0Z0.A03(1592395521);
        if (!this.A03 || !this.A02.A0F.get()) {
            if (this.A03 && (list = r6.A08) != null && list.isEmpty()) {
                this.A01.A0B("CACHED_STORIES_TRAY_FAILED", "empty");
            }
            AnonymousClass1OR.A02(this.A02, r6, this.A03, this.A00, Constants.ZERO);
            AnonymousClass1OR r5 = this.A02;
            boolean z = this.A03;
            C27581Ik r1 = this.A01;
            if (z) {
                r1.A0A("STORIES_LOAD_FROM_DISK_FINISHED");
                r1.A0A("CACHED_STORIES_TRAY_END");
            } else {
                r1.A0D(true);
                C37531jo.A00(StoredPreferences.A00, r5.A0E).A03(true);
            }
            AnonymousClass0Z0.A0A(1675965591, A033);
        } else {
            this.A01.A0B("CACHED_STORIES_TRAY_FAILED", "cancel");
            AnonymousClass0Z0.A0A(1443881659, A033);
        }
        AnonymousClass0Z0.A0A(-575791759, A032);
    }

    public C31191Ww(AnonymousClass1OR r3, boolean z, C27581Ik r5) {
        this.A02 = r3;
        this.A03 = z;
        this.A01 = r5;
    }

    public final void onFail(C43791v5 r11) {
        int A032 = AnonymousClass0Z0.A03(-1109818451);
        if (!this.A03) {
            this.A01.A0D(false);
            C37531jo.A00(StoredPreferences.A00, this.A02.A0E).A03(false);
        }
        AnonymousClass1OR.A01(this.A02, r11, this.A03, this.A00, Constants.ZERO);
        AnonymousClass0Z0.A0A(1959687557, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0Z0.A03(1450951947);
        if (!this.A03) {
            this.A02.A0A = false;
        }
        AnonymousClass0Z0.A0A(1193373521, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r1 == false) goto L_0x001f;
     */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        boolean z;
        int A032 = AnonymousClass0Z0.A03(2013794416);
        int A033 = AnonymousClass0Z0.A03(1332588463);
        if (!this.A03) {
            AnonymousClass0h8 r0 = C12600h4.A00().A00;
            if (r0 != null) {
                boolean z2 = r0.A08;
                z = true;
            }
            z = false;
            if (!z) {
                C12600h4.A02(C12600h4.A00(), "STORIES_REQUEST_END");
            }
            this.A02.A0F.set(true);
        }
        AnonymousClass0Z0.A0A(-1829541264, A033);
        AnonymousClass0Z0.A0A(-44340305, A032);
    }
}
