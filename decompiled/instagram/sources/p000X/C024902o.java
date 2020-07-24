package p000X;

import android.os.Build;
import android.os.Process;
import java.io.File;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.02o  reason: invalid class name and case insensitive filesystem */
public final class C024902o {
    public static String A00() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return "yes";
        }
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return "yes";
            }
        } catch (Exception e) {
            AnonymousClass0DB.A0M("ACRA", e, "Failed to find Superuser.pak");
        }
        Map<String, String> map = System.getenv();
        if (map == null) {
            return "no";
        }
        String[] split = map.get("PATH").split(":");
        int length = split.length;
        int i = 0;
        while (i < length) {
            try {
                if (new File(AnonymousClass000.A0J(split[i], "/", "su")).exists()) {
                    return "yes";
                }
                i++;
            } catch (Exception e2) {
                AnonymousClass0DB.A0M("ACRA", e2, "Failed to find su binary in the PATH");
            }
        }
        return "no";
    }

    public static UUID A01() {
        try {
            return UUID.randomUUID();
        } catch (Throwable unused) {
            return UUID.nameUUIDFromBytes(String.format("%s-%s-%s", new Object[]{Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.nanoTime()), Integer.valueOf(Process.myTid())}).getBytes());
        }
    }
}
