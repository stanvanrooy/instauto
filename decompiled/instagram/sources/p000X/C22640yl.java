package p000X;

import java.io.IOException;
import java.util.Map;

/* renamed from: X.0yl  reason: invalid class name and case insensitive filesystem */
public final class C22640yl implements C17860qv {
    public final /* synthetic */ C22560yd A00;

    public final String getName() {
        return "EncryptedSharedPrefs_readFromDiskAsync";
    }

    public final int getRunnableId() {
        return 232;
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C22640yl(C22560yd r1) {
        this.A00 = r1;
    }

    public final void run() {
        try {
            C22560yd r0 = this.A00;
            Map BZ1 = r0.A00.BZ1(r0.A03);
            synchronized (this.A00.A06) {
                this.A00.A02 = BZ1;
            }
        } catch (IOException e) {
            try {
                AnonymousClass0QD.A09("EncryptedSharedPrefs_readFromDisk_error", e);
            } catch (Throwable th) {
                this.A00.A08.countDown();
                throw th;
            }
        }
        this.A00.A08.countDown();
    }
}
