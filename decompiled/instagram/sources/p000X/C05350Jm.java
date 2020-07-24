package p000X;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0Jm  reason: invalid class name and case insensitive filesystem */
public final class C05350Jm extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass0Jc A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ CountDownLatch A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = r0.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r2.hasNext() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6.A01.add((p000X.C05810Mb) r2.next());
     */
    public final void run() {
        AnonymousClass0IY r5 = null;
        try {
            synchronized (this.A00.A01) {
                File fileForReading = this.A00.getFileForReading();
                if (!fileForReading.exists() || !fileForReading.canRead()) {
                    this.A02.countDown();
                    return;
                }
                AnonymousClass0IY r1 = new AnonymousClass0IY(this.A00.A00, C12890hY.A00.A07(fileForReading));
                r1.A0p();
                r5 = r1;
                C05830Md parseFromJson = C05820Mc.parseFromJson(r1);
            }
        } catch (IOException e) {
            try {
                AnonymousClass0QD.A09("JsonFileStoreAdapter", e);
            } catch (Throwable th) {
                if (r5 != null) {
                    try {
                        r5.close();
                    } catch (IOException unused) {
                    }
                }
                this.A02.countDown();
                throw th;
            }
        }
        if (r5 != null) {
            try {
                r5.close();
            } catch (IOException unused2) {
            }
        }
        this.A02.countDown();
        this.A02.countDown();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C05350Jm(AnonymousClass0Jc r5, Set set, CountDownLatch countDownLatch) {
        super(129, 3, false, true);
        this.A00 = r5;
        this.A01 = set;
        this.A02 = countDownLatch;
    }
}
