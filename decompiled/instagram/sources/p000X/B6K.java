package p000X;

import com.instagram.util.offline.BackgroundWifiPrefetcherWorkerService;

/* renamed from: X.B6K */
public final class B6K implements C150446c6 {
    public final /* synthetic */ AnonymousClass0C1 A00;
    public final /* synthetic */ BackgroundWifiPrefetcherWorkerService A01;

    public B6K(BackgroundWifiPrefetcherWorkerService backgroundWifiPrefetcherWorkerService, AnonymousClass0C1 r2) {
        this.A01 = backgroundWifiPrefetcherWorkerService;
        this.A00 = r2;
    }

    public final void B4r() {
        C150326bu.A02(this.A00);
        this.A01.stopSelf();
    }
}
