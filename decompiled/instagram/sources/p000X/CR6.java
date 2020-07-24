package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.CR6 */
public final class CR6 {
    public static CRC parseFromJson(C13080hr r4) {
        CRC crc = new CRC();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if (DialogModule.KEY_TITLE.equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                crc.A01 = str;
            } else if ("description".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                crc.A00 = str;
            }
            r4.A0f();
        }
        return crc;
    }
}
