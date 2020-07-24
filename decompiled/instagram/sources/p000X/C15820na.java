package p000X;

import android.content.Context;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.0na  reason: invalid class name and case insensitive filesystem */
public final class C15820na implements C15830nb {
    public final File A00;
    public final boolean A01;

    public final InputStream BuM(InputStream inputStream) {
        if (this.A01) {
            return new C36081hP(inputStream, this.A00);
        }
        return inputStream;
    }

    public C15820na(Context context, AnonymousClass0C1 r3, boolean z) {
        this.A01 = z;
        this.A00 = C15840nc.A00(context, r3);
    }
}
