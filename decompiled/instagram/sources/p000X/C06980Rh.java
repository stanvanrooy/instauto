package p000X;

import java.io.File;

/* renamed from: X.0Rh  reason: invalid class name and case insensitive filesystem */
public final class C06980Rh implements C04360Dq {
    public final /* synthetic */ AnonymousClass0EV A00;
    public final /* synthetic */ boolean A01;

    public C06980Rh(AnonymousClass0EV r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void BDB(C04530Ei r6, C04440Dz r7) {
        File file;
        if (r7 == null) {
            AnonymousClass0DB.A0E("lacrima", "category is null, cannot assemble report");
            return;
        }
        C04700Ez r4 = (C04700Ez) this.A00.A03().get();
        String str = this.A00.A01().A04;
        AnonymousClass0ZL.A01("processCurrentSession", 1350327514);
        try {
            synchronized (C04700Ez.A07) {
                File[] A02 = r4.A02.A02(str);
                int length = A02.length - 1;
                if (length >= 0) {
                    File file2 = A02[length];
                    if (length > 0) {
                        file = A02[length - 1];
                    } else {
                        file = null;
                    }
                    r4.A02(file2, file, r7);
                }
            }
            AnonymousClass0ZL.A00(-1481600502);
            if (this.A01) {
                AnonymousClass0EV r1 = this.A00;
                if (r1.A08 == null) {
                    r1.A08 = new C032506f(r1);
                }
                ((AnonymousClass0F7) r1.A08.get()).A01(r7);
            }
        } catch (Throwable th) {
            AnonymousClass0ZL.A00(-1769843556);
            throw th;
        }
    }
}
