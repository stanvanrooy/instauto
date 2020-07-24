package p000X;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0lu  reason: invalid class name and case insensitive filesystem */
public final class C14890lu {
    public final Context A00;
    public final Resources A01;
    public volatile C14440kc A02;

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = new C14440kc();
            try {
                File dir = this.A00.getDir("restricks", 0);
                C038108o r8 = new C038108o();
                r8.A02 = "unpackLayoutBundle";
                r8.A00 = this.A00;
                r8.A01 = dir;
                r8.A04.add(new AnonymousClass05U("layouts.bin.sha256", "layouts.bin.sha256"));
                r8.A04.add(new AnonymousClass08I("layouts.bin.xz", "layouts.bin"));
                r8.A00().A03();
                this.A02.A0A(new C15140mP(this.A01, new File(dir, "layouts.bin")));
            } catch (IOException e) {
                new File(this.A00.getDir("restricks", 0), "layouts.bin.sha256").delete();
                throw new RuntimeException("Unable to initialize mBundledLayoutLoader", e);
            } catch (Throwable th) {
                this.A02.A0B(th);
                throw th;
            }
        }
    }

    public C14890lu(Context context, Resources resources) {
        this.A00 = context;
        this.A01 = resources;
    }
}
