package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.DGh */
public final class DGh {
    public static DHN parseFromJson(C13080hr r3) {
        Integer num;
        DHN dhn = new DHN();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("user_has_pin".equals(A0i)) {
                dhn.A01 = r3.A0O();
            } else if ("validation_needed".equals(A0i)) {
                dhn.A02 = r3.A0O();
            } else if ("fbpay_pin_creation_flow_type".equals(A0i)) {
                String A0r = r3.A0r();
                if (A0r != null && !A0r.isEmpty()) {
                    if (A0r.equalsIgnoreCase("MANDATORY")) {
                        num = Constants.ONE;
                    } else if (A0r.equalsIgnoreCase("OPTIONAL")) {
                        num = Constants.A0C;
                    } else if (A0r.equalsIgnoreCase("BACKLOADED")) {
                        num = Constants.A0N;
                    } else if (A0r.equalsIgnoreCase(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                        num = Constants.A0Y;
                    }
                    dhn.A00 = num;
                }
                num = Constants.ZERO;
                dhn.A00 = num;
            }
            r3.A0f();
        }
        return dhn;
    }
}
