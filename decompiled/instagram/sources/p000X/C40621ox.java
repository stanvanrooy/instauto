package p000X;

import java.util.Locale;
import java.util.Random;

/* renamed from: X.1ox  reason: invalid class name and case insensitive filesystem */
public final class C40621ox {
    public String A00;
    public String A01;

    public static String A00() {
        return String.format(Locale.ROOT, "%X:%03d", new Object[]{Long.valueOf(System.currentTimeMillis()), Integer.valueOf(new Random().nextInt(997))});
    }
}
