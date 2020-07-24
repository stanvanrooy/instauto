package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import java.util.List;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass920;

public class AuthData {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(RedactedString redactedString, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9);

    private native boolean nativeEquals(Object obj);

    public native RedactedString getAccessToken();

    public native String getAnalyticsClaim();

    public native String getDeviceID();

    public native String getFacebookUserID();

    public native String getFamilyDeviceID();

    public native String getFirstName();

    public native String getFullName();

    public native String getMachineID();

    public native String getPageAdminUserID();

    public native List getSessionCookies();

    public native String getUsername();

    public native int hashCode();

    public native String toString();

    static {
        AnonymousClass0Y1.A08("msysjniinfranosqlite");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthData)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AuthData(RedactedString redactedString, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9) {
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(str3);
        this.mNativeHolder = initNativeHolder(redactedString, (String) null, str2, str3, str4, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null);
    }

    public AuthData(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
