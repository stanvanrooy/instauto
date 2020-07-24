package com.google.p013ar.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.ar.core.SessionCreateJniHelper */
public class SessionCreateJniHelper {
    public static boolean checkApkSignature(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 64);
            Signature signature = new Signature("308203c7308202afa003020102021500dc286b43b4ea12039958a00a6655eb84720e46c9300d06092a864886f70d01010b05003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3137303830343136353333375a170d3437303830343136353333375a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820122300d06092a864886f70d01010105000382010f003082010a02820101008998646f47fc333db09644c303104ed183e904e351152aa66a603b77f63389d45d6fcffae3c94fadf1f28038e265d697fea347327f9081a7f0b9074d5b148db5bf357c611a77f87f844a15068818bdcd5b21d187e93fa2551676170eedce04a150c35ec0a791eef507fa9b406573c36f6f207764842e5677e35a281a422659e91e26eb4fecfb053b5c936d0976c37f8757adb57a37953da5844ea350695854d343a61ad341b63a1c425d22855af7ebfee018e1736cee98536be5b9947f288e2a26f99eb9f91b5de93fecc513019d2e90f12b38610d1f02eaa81deca4ce91c19cbce36d6c3025ce2432b3d178616beafaf437c08451bc469c6bc6f4517a714a5b0203010001a350304e300c0603551d13040530030101ff301d0603551d0e0416041419a864c0f2618c67c803a23da909bc70521f269b301f0603551d2304183016801419a864c0f2618c67c803a23da909bc70521f269b300d06092a864886f70d01010b050003820101005403fc56fdefc440376a0337815002b96a15bffc2fe42de6c58f52fae4d80652e3704455b885409eef81ffbb4c44dba104b6b8e24c9e2e0e7a04338ee73baa5b71bfb4488f8e04bef3d0eaf7d43aa42b03b278c33cc1f0dd3802571624baa161d851fab37db4bc92b9094b6885dff62b400ecd81f069d56a1be1db46d8198c50c9628cdb6e38686ef640fd386775f50376f957e24ea45ed1942968f20c82f189607fdb22f11cfdfd0760a77a60ceb3416cfb3f48f13f9f83f3834a01001750a7c78bc1fd81f0b53a7c41dcba9f5a0118259d083c32bb9ebb84d645d6f6b9c31923d8ab70e7f0a25940ecc9f4945144419f86e8c421d3b99774f4b8f3d09262e7");
            for (Signature signature2 : packageInfo.signatures) {
                if (signature2.equals(signature)) {
                    return true;
                }
                String charsString = signature.toCharsString();
                String charsString2 = signature2.toCharsString();
                StringBuilder sb = new StringBuilder(String.valueOf(charsString).length() + 39 + String.valueOf(charsString2).length());
                sb.append("Signature mismatch.  Expected '");
                sb.append(charsString);
                sb.append("' got '");
                sb.append(charsString2);
                sb.append("'");
                Log.w("ARCore-SessionCreateJniHelper", sb.toString());
            }
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.ar.core.disable_security_check", false);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public static int getMinApkVersion(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                return bundle.getInt("com.google.ar.core.min_apk_version");
            }
            throw new RuntimeException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Could not load application package metadata", e);
        }
    }

    public static int getArCoreApkVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.ar.core", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ARCore-SessionCreateJniHelper", "Could not load application package metadata", e);
            return -1;
        }
    }
}
