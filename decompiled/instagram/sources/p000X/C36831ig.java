package p000X;

import com.facebook.tigon.iface.TigonRequest;

/* renamed from: X.1ig  reason: invalid class name and case insensitive filesystem */
public final class C36831ig {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "POST";
            case 2:
                return "PATCH";
            case 3:
                return TigonRequest.GET;
            case 4:
                return "DELETE";
            default:
                return TigonRequest.HEAD;
        }
    }
}
