package p000X;

import android.os.AsyncTask;
import java.io.File;

/* renamed from: X.0mW  reason: invalid class name and case insensitive filesystem */
public final class C15210mW {
    public int A00 = 1000;
    public long A01 = 31457280;
    public AnonymousClass0OT A02 = new AnonymousClass0M7(AsyncTask.SERIAL_EXECUTOR);
    public File A03 = C15220mX.A0F;
    public AnonymousClass0IT A04 = null;

    public final C15220mX A00() {
        AnonymousClass18J r7;
        File file = this.A03;
        long j = this.A01;
        int i = this.A00;
        AnonymousClass0OT r6 = this.A02;
        AnonymousClass0IT r0 = this.A04;
        if (r0 != null) {
            r7 = (AnonymousClass18J) r0.get();
        } else {
            r7 = null;
        }
        return new C15220mX(file, j, i, r6, r7);
    }
}
