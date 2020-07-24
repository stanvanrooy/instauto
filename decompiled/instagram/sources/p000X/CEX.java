package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.CEX */
public final class CEX {
    public static CGJ parseFromJson(C13080hr r4) {
        Integer num;
        CGJ cgj = new CGJ();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("coupon_status".equals(A0i)) {
                String A0r = r4.A0r();
                if (A0r.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                    num = Constants.ZERO;
                } else if (A0r.equals("HAS_ENROLLED")) {
                    num = Constants.ONE;
                } else if (A0r.equals("HAS_FAILED")) {
                    num = Constants.A0C;
                } else {
                    throw new IllegalArgumentException(A0r);
                }
                cgj.A00 = num;
            } else {
                String str = null;
                if ("formatted_value".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cgj.A03 = str;
                } else if ("expiry_date".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cgj.A02 = str;
                } else if ("product".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r4.A0t();
                    }
                } else if ("enroll_error_reason".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        str = r4.A0t();
                    }
                    cgj.A01 = str;
                }
            }
            r4.A0f();
        }
        return cgj;
    }
}
