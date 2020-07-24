package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C120125Dh;
import p000X.C228479tj;
import p000X.C228489tz;
import p000X.C228589vH;
import p000X.C89583uU;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final ConnectionResult A04 = new ConnectionResult(0);
    public static final Parcelable.Creator CREATOR = new C89583uU();
    public static final int SUCCESS = 0;
    public final int A00;
    public final PendingIntent A01;
    public final String A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ConnectionResult) {
                ConnectionResult connectionResult = (ConnectionResult) obj;
                if (this.A00 != connectionResult.A00 || !C228589vH.A00(this.A01, connectionResult.A01) || !C228589vH.A00(this.A02, connectionResult.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01, this.A02});
    }

    public static String A00(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case C120125Dh.VIEW_TYPE_BANNER:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case C120125Dh.VIEW_TYPE_BADGE:
                        return "CANCELED";
                    case C120125Dh.VIEW_TYPE_LINK:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case C120125Dh.VIEW_TYPE_BRANDING:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean A01() {
        if (this.A00 == 0 || this.A01 == null) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if (this.A00 == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C228489tz r2 = new C228489tz(this);
        r2.A00("statusCode", A00(this.A00));
        r2.A00("resolution", this.A01);
        r2.A00(DialogModule.KEY_MESSAGE, this.A02);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A03);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A09(parcel, 3, this.A01, i, false);
        C228479tj.A0A(parcel, 4, this.A02, false);
        C228479tj.A02(parcel, A002);
    }

    public ConnectionResult(int i) {
        this(1, i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = pendingIntent;
        this.A02 = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, (String) null);
    }
}
