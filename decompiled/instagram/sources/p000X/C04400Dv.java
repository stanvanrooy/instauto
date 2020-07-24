package p000X;

import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: X.0Dv  reason: invalid class name and case insensitive filesystem */
public final class C04400Dv {
    public static String A00() {
        String l = Long.toString(System.currentTimeMillis());
        SecureRandom secureRandom = new SecureRandom();
        return AnonymousClass000.A0J(l, "-", new UUID(secureRandom.nextLong() ^ System.currentTimeMillis(), secureRandom.nextLong()).toString());
    }
}
