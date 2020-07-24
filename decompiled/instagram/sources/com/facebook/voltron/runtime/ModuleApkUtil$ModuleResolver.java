package com.facebook.voltron.runtime;

import android.content.Context;
import p000X.AnonymousClass000;

public class ModuleApkUtil$ModuleResolver {
    public static String A00(String str, Context context) {
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            return null;
        }
        String A0J = AnonymousClass000.A0J("split_", str, ".apk");
        for (String str2 : strArr) {
            if (str2.endsWith(A0J)) {
                return str2;
            }
        }
        return null;
    }
}
