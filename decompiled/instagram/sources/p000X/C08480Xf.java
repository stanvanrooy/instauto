package p000X;

import android.net.Uri;
import java.net.URI;
import java.util.Locale;

/* renamed from: X.0Xf  reason: invalid class name and case insensitive filesystem */
public final class C08480Xf {
    public static Uri A01(String str, AnonymousClass0XP r6, boolean z) {
        if (r6 != null) {
            try {
                return A00(str);
            } catch (Exception e) {
                r6.Bbw("UriParser", String.format(Locale.US, "Parse uri %s failed. Fail open: %b", new Object[]{str, Boolean.valueOf(z)}), e);
                if (z) {
                    return Uri.parse(str);
                }
                return null;
            }
        } else {
            throw new IllegalArgumentException("reporter is null");
        }
    }

    public static boolean A02(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007a, code lost:
        if (A02(r3.getFragment(), r2.getFragment()) == false) goto L_0x007c;
     */
    public static Uri A00(String str) {
        boolean z;
        URI create = URI.create(str);
        Uri build = new Uri.Builder().scheme(create.getScheme()).encodedAuthority(create.getRawAuthority()).encodedPath(create.getRawPath()).encodedQuery(create.getRawQuery()).encodedFragment(create.getRawFragment()).build();
        if (A02(create.getScheme(), build.getScheme()) && A02(create.getAuthority(), build.getAuthority()) && A02(create.getPath(), build.getPath()) && A02(create.getQuery(), build.getQuery())) {
            z = true;
        }
        z = false;
        if (z) {
            return build;
        }
        throw new SecurityException(String.format(Locale.US, "java uri not equal to android uri for uri string %s", new Object[]{str}));
    }
}
