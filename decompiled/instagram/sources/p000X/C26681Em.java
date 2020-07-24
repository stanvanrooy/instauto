package p000X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.io.StringWriter;

/* renamed from: X.1Em  reason: invalid class name and case insensitive filesystem */
public final class C26681Em implements C26651Ei {
    public final Object BWp(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return C26841Fm.parseFromJson(A0A);
    }

    public final String BfT(Object obj) {
        C26851Fn r8 = (C26851Fn) obj;
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        if (r8.A00 != null) {
            A05.A0d("pending_follows");
            A05.A0S();
            for (C43651uq r3 : r8.A00) {
                if (r3 != null) {
                    A05.A0T();
                    A05.A0G("creation_time", r3.A00);
                    String str = r3.A03;
                    if (str != null) {
                        A05.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str);
                    }
                    String str2 = r3.A02;
                    if (str2 != null) {
                        A05.A0H("request_verb", str2);
                    }
                    String str3 = r3.A01;
                    if (str3 != null) {
                        A05.A0H("radio_type", str3);
                    }
                    A05.A0Q();
                }
            }
            A05.A0P();
        }
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }
}
