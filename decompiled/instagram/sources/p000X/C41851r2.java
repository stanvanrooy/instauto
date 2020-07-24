package p000X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: X.1r2  reason: invalid class name and case insensitive filesystem */
public final class C41851r2 extends AnonymousClass0O9 {
    public final /* synthetic */ C35911h8 A00;
    public final /* synthetic */ C35891h6 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41851r2(C35891h6 r2, C35911h8 r3) {
        super(325);
        this.A01 = r2;
        this.A00 = r3;
    }

    public final void run() {
        C35891h6 r3 = this.A01;
        C35911h8 r6 = this.A00;
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0T();
            if (r6.A01 != null) {
                A05.A0d("timestamps");
                A05.A0T();
                for (Map.Entry entry : r6.A01.entrySet()) {
                    A05.A0d((String) entry.getKey());
                    if (entry.getValue() == null) {
                        A05.A0R();
                    } else {
                        A05.A0Y(((Long) entry.getValue()).longValue());
                    }
                }
                A05.A0Q();
            }
            if (r6.A02 != null) {
                A05.A0d("keys");
                A05.A0S();
                for (String str : r6.A02) {
                    if (str != null) {
                        A05.A0g(str);
                    }
                }
                A05.A0P();
            }
            A05.A0Q();
            A05.close();
            C16180oA.A00(r3.A03).A00.edit().putString("seen_state", stringWriter.toString()).apply();
        } catch (IOException e) {
            AnonymousClass0DB.A05(C35891h6.A06, "failed to save LocalSeenState json", e);
        }
    }
}
