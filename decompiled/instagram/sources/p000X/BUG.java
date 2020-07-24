package p000X;

import com.instagram.contacts.ccu.intf.CCUWorkerService;

/* renamed from: X.BUG */
public final class BUG implements DND {
    public final /* synthetic */ CCUWorkerService A00;

    public BUG(CCUWorkerService cCUWorkerService) {
        this.A00 = cCUWorkerService;
    }

    public final void onFinish() {
        this.A00.stopSelf();
    }
}
