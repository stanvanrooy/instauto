package com.facebook.tigon;

import java.io.IOException;

public class TigonErrorException extends IOException {
    public final TigonError A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    public TigonErrorException(TigonError tigonError) {
        super(r2.toString());
        String str;
        StringBuilder sb = new StringBuilder("TigonError(");
        sb.append("error=");
        int i = tigonError.A00;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Cancel";
        } else if (i == 2) {
            str = "TransientError";
        } else if (i == 3) {
            str = "FatalError";
        } else if (i == 4) {
            str = "InvalidRequest";
        } else if (i != 5) {
            str = "<Unknown>";
        } else {
            str = "RequestNotSupported";
        }
        sb.append(str);
        sb.append(", ");
        sb.append("errorDomain=");
        sb.append(tigonError.A03);
        sb.append(", ");
        sb.append("domainErrorCode=");
        sb.append(tigonError.A01);
        String str2 = tigonError.A02;
        if (str2 != null && !str2.isEmpty()) {
            sb.append(", analyticsDetail=\"");
            sb.append(str2);
            sb.append("\"");
        }
        sb.append(")");
        this.A00 = tigonError;
    }
}
