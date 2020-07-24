package p000X;

import android.text.TextUtils;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.1Gy  reason: invalid class name and case insensitive filesystem */
public final class C27221Gy {
    public static void A01(AnonymousClass0C1 r7, C88243s6 r8) {
        try {
            C16180oA A00 = C16180oA.A00(r7);
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0T();
            Integer num = r8.A04;
            if (num != null) {
                A05.A0H("media_type", C89203tp.A01(num));
            }
            String str = r8.A05;
            if (str != null) {
                A05.A0H("media_json", str);
            }
            A05.A0F("recovery_count", r8.A00);
            A05.A0G("date_taken", r8.A01);
            A05.A0Q();
            A05.close();
            A00.A00.edit().putString("captured_media_recovery_info", stringWriter.toString()).apply();
            C16180oA.A00(r7).A00.edit().putBoolean("has_ever_captured_media_for_recovery", true).apply();
        } catch (IOException e) {
            AnonymousClass0QD.A07("CapturedMediaRecoveryUtil", "Failed to save recovery info", e);
        }
    }

    public static C88243s6 A00(AnonymousClass0C1 r3) {
        String string = C16180oA.A00(r3).A00.getString("captured_media_recovery_info", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                C13080hr A0A = C12890hY.A00.A0A(string);
                A0A.A0p();
                return C100594Wi.parseFromJson(A0A);
            } catch (IOException e) {
                AnonymousClass0QD.A07("CapturedMediaRecoveryUtil", "Failed to retrieve captured media recovery info", e);
            }
        }
        return null;
    }

    public static void A02(AnonymousClass0C1 r1, C88603sg r2, C87033q4 r3) {
        C88603sg r0;
        if (r3.A02() == null && !r2.A0T) {
            C88243s6 A00 = A00(r1);
            if (A00 == null || (r0 = A00.A02) == null || !r0.equals(r2)) {
                A01(r1, new C88243s6(r2));
            }
        }
    }

    public static boolean A03(C88243s6 r6) {
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        if (!(!TextUtils.isEmpty(r6.A05)) || r6.A01 < currentTimeMillis) {
            return false;
        }
        return true;
    }
}
