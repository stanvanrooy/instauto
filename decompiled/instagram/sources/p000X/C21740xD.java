package p000X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.0xD  reason: invalid class name and case insensitive filesystem */
public final class C21740xD implements C17120pi {
    public final void BfU(C13460iZ r4, Object obj) {
        C21730xC r5 = (C21730xC) obj;
        r4.A0T();
        r4.A0I(RealtimeProtocol.USERS_IS_MESSAGING_ONLY_BLOCKING, r5.A04);
        String str = r5.A03;
        if (str != null) {
            r4.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str);
        }
        String str2 = r5.A01;
        if (str2 != null) {
            r4.A0H("logging_follow_status", str2);
        }
        if (r5.A00 != null) {
            r4.A0d("analytics_params");
            C105374gl r2 = r5.A00;
            r4.A0T();
            String str3 = r2.A02;
            if (str3 != null) {
                r4.A0H("module_name", str3);
            }
            String str4 = r2.A01;
            if (str4 != null) {
                r4.A0H("click_point", str4);
            }
            String str5 = r2.A03;
            if (str5 != null) {
                r4.A0H("thread_id", str5);
            }
            r4.A0F("interop_user_type", r2.A00);
            r4.A0Q();
        }
        String str6 = r5.A02;
        if (str6 != null) {
            r4.A0H(TraceFieldType.RequestID, str6);
        }
        AnonymousClass3LW.A00(r4, r5);
        r4.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99724St.parseFromJson(r2);
    }
}
