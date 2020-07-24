package p000X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1pe  reason: invalid class name and case insensitive filesystem */
public final class C41031pe extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r2.getParentFile().getCanonicalPath().equals(r3.getCanonicalPath()) != false) goto L_0x0041;
     */
    public final void A00() {
        File file;
        boolean z;
        AnonymousClass0C1 r5 = this.A00.A07;
        C11110eR r4 = C11070eN.A00;
        if (r4 != null) {
            Context context = r4.A00;
            if (!TextUtils.isEmpty("com.facebook.loom.config.file")) {
                String A02 = AnonymousClass070.A02("com.facebook.loom.config.file");
                if (!TextUtils.isEmpty(A02)) {
                    try {
                        File cacheDir = context.getCacheDir();
                        file = new File(cacheDir, A02);
                        if (file.exists()) {
                        }
                    } catch (IOException unused) {
                        file = null;
                    }
                }
            }
            file = null;
            if (file != null) {
                AnonymousClass0b8 r1 = new AnonymousClass0b8(r4.A00);
                r1.A00 = file;
                r1.A02 = Constants.ONE;
                C09640bk.A00().A05(r1);
                return;
            }
            File file2 = new File(r4.A00.getFilesDir(), "profilo");
            File file3 = new File(file2, "ProfiloInitFileConfig.json.bak");
            if (file3.exists()) {
                z = file3.renameTo(new File(file2, "ProfiloInitFileConfig.json"));
            } else {
                z = false;
            }
            boolean z2 = true;
            if (z) {
                if (System.currentTimeMillis() - C05760Lv.A01.A00.getLong("loom_config_last_sync_timestamp", 0) <= C11110eR.A02) {
                    z2 = false;
                }
            }
            if (z2) {
                File file4 = r4.A01;
                C15890nh r6 = new C15890nh(r5);
                r6.A09 = Constants.A0N;
                r6.A0C = "loom/fetch_config/";
                r6.A06 = new C16070nz(AnonymousClass1N4.class, C12890hY.A00, new C22970zK(file4), false);
                C17850qu A03 = r6.A03();
                A03.A00 = new C483227n(r4);
                C12810hQ.A02(A03);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41031pe(C37531jo r3) {
        super("syncProfiloConfig", 362);
        this.A00 = r3;
    }
}
