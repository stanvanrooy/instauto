package p000X;

import android.text.TextUtils;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0Sm  reason: invalid class name and case insensitive filesystem */
public final class C07290Sm implements Runnable {
    public C07180Sb A00;
    public final /* synthetic */ C10990eF A01;

    public C07290Sm(C10990eF r1, C07180Sb r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void run() {
        C10990eF r0 = this.A01;
        C07180Sb r3 = this.A00;
        String string = r0.A01.getString(MemoryDumpUploadJob.EXTRA_USER_ID, "");
        if (TextUtils.isEmpty(string)) {
            string = "0";
        }
        r3.A02.put("pk", string);
        C07240Sh r02 = this.A01.A00;
        r02.A07.add(this.A00);
        AnonymousClass0ZA.A02(this.A01.A02, 1);
        if (this.A01.A00.A07.size() >= 50) {
            C10990eF.A00(this.A01);
        } else {
            AnonymousClass0ZA.A03(this.A01.A02, 1, 300000);
        }
    }
}
