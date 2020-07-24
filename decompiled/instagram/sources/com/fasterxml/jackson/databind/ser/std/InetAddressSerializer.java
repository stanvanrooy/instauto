package com.fasterxml.jackson.databind.ser.std;

import java.net.InetAddress;
import p000X.C13460iZ;

public final class InetAddressSerializer extends StdScalarSerializer {
    public static final InetAddressSerializer A00 = new InetAddressSerializer();

    public InetAddressSerializer() {
        super(InetAddress.class);
    }

    public static final void A00(InetAddress inetAddress, C13460iZ r3) {
        String trim = inetAddress.toString().trim();
        int indexOf = trim.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                trim = trim.substring(1);
            } else {
                trim = trim.substring(0, indexOf);
            }
        }
        r3.A0g(trim);
    }
}
