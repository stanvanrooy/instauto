package p000X;

import java.io.IOException;
import java.io.Writer;

/* renamed from: X.1cm  reason: invalid class name and case insensitive filesystem */
public final class C33351cm extends AnonymousClass0O9 {
    public final String A00;
    public final /* synthetic */ C15250ma A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33351cm(C15250ma r2, String str) {
        super(433);
        this.A01 = r2;
        this.A00 = str;
    }

    public final void run() {
        try {
            Writer writer = this.A01.A01;
            if (writer != null) {
                writer.write(this.A00);
                this.A01.A01.flush();
                C15250ma r2 = this.A01;
                int i = r2.A00 + 1;
                r2.A00 = i;
                if (i > r2.A02) {
                    r2.A04.ADc(new AnonymousClass2CN(r2));
                }
            }
        } catch (IOException unused) {
        }
    }
}
