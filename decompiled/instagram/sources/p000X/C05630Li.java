package p000X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Li  reason: invalid class name and case insensitive filesystem */
public final class C05630Li {
    public static SharedPreferences A00;
    public static final Set A01;

    static {
        HashSet hashSet = new HashSet(120);
        A01 = hashSet;
        hashSet.add(C05680Ln.AIS);
        Set set = A01;
        set.add(C05680Ln.AIT);
        set.add(AnonymousClass0LZ.A1q);
        set.add(C05680Ln.A3q);
        set.add(C05680Ln.A3s);
        set.add(AnonymousClass0LZ.A1m);
        set.add(AnonymousClass0LZ.A1o);
        set.add(C05680Ln.ADy);
        set.add(AnonymousClass0LZ.A5P);
        set.add(C05680Ln.A0A);
        set.add(C05680Ln.A0B);
        set.add(C05680Ln.ADY);
        set.add(C05680Ln.A14);
        set.add(C05680Ln.A2D);
        set.add(C05680Ln.AMH);
        set.add(C05680Ln.A13);
        set.add(AnonymousClass0LZ.A2A);
        set.add(AnonymousClass0LZ.A5e);
        set.add(AnonymousClass0LZ.ABZ);
        set.add(AnonymousClass0LZ.AF5);
        set.add(AnonymousClass0LZ.A1Y);
        set.add(C05680Ln.A9J);
        set.add(C05680Ln.APO);
        set.add(C05680Ln.APL);
        set.add(C05680Ln.APM);
        set.add(C05680Ln.APN);
        set.add(C05680Ln.APP);
        set.add(AnonymousClass0LZ.AA3);
        set.add(AnonymousClass0LZ.A3b);
        set.add(AnonymousClass0LZ.ABA);
        set.add(C05680Ln.AMI);
        set.add(AnonymousClass0LZ.A2x);
        set.add(C05680Ln.A8i);
        set.add(C05680Ln.A8j);
        set.add(C05680Ln.A21);
        set.add(C05680Ln.A0D);
        set.add(AnonymousClass0LZ.A9o);
        set.add(AnonymousClass0LZ.A9p);
        set.add(AnonymousClass0LZ.AA1);
        set.add(AnonymousClass0LZ.A9q);
        set.add(AnonymousClass0LZ.A9r);
        set.add(AnonymousClass0LZ.A9y);
        set.add(AnonymousClass0LZ.AA0);
        set.add(AnonymousClass0LZ.A9z);
        set.add(C05680Ln.ARu);
        set.add(C05680Ln.ARv);
        set.add(C05680Ln.ARt);
        set.add(C05680Ln.ARs);
        set.add(C05680Ln.Ab6);
        set.add(C05680Ln.AbJ);
        set.add(C05680Ln.AbK);
        set.add(C05680Ln.Ab5);
        set.add(C05680Ln.AbA);
        set.add(C05680Ln.AbB);
        set.add(C05680Ln.Ab4);
        set.add(C05680Ln.Ab8);
        set.add(C05680Ln.Ab7);
        set.add(C05680Ln.Ab9);
        set.add(AnonymousClass0LZ.A9s);
        set.add(AnonymousClass0LZ.A9t);
        set.add(AnonymousClass0LZ.A9u);
        set.add(AnonymousClass0LZ.A9w);
        set.add(AnonymousClass0LZ.A9x);
        set.add(AnonymousClass0LZ.A9v);
        set.add(C05680Ln.AGR);
        set.add(C05680Ln.AGT);
        set.add(C05680Ln.AGQ);
        set.add(C05680Ln.AGU);
        set.add(C05680Ln.A46);
        set.add(C05680Ln.A45);
        set.add(C05680Ln.A47);
        set.add(C05680Ln.A3w);
        set.add(C05680Ln.A41);
        set.add(C05680Ln.A42);
        set.add(C05680Ln.A3x);
        set.add(C05680Ln.A3v);
        set.add(C05680Ln.A3z);
        set.add(C05680Ln.A44);
        set.add(C05680Ln.A40);
        set.add(C05680Ln.A3y);
        set.add(C05680Ln.A43);
        set.add(C05680Ln.A9R);
        set.add(C05680Ln.A9U);
        set.add(C05680Ln.A9T);
        set.add(C05680Ln.A0X);
        set.add(C05680Ln.A8z);
        set.add(C05680Ln.A8y);
        set.add(C05680Ln.AZ8);
        set.add(C05680Ln.AZ7);
        set.add(AnonymousClass0LZ.A2X);
        set.add(AnonymousClass0LZ.A2c);
        set.add(C05680Ln.AaU);
        set.add(C05680Ln.Aam);
        set.add(C05680Ln.Aao);
        set.add(C05680Ln.Aak);
        set.add(C05680Ln.Aal);
        set.add(AnonymousClass0LZ.A4j);
        set.add(C05680Ln.Aa8);
        set.add(C05680Ln.AaA);
        set.add(C05680Ln.Aa7);
    }

    public static String A01(C05580Ld r3) {
        return AnonymousClass000.A0J(r3.A01.A02, "_", r3.A04);
    }

    public static void A02(C05580Ld r5) {
        if (!A01.contains(r5)) {
            throw new IllegalArgumentException(AnonymousClass000.A0N("Experiment is not registered as a pre init experiment: ", r5.A01.A02, " ", r5.A04));
        }
    }

    public static int A00(C05580Ld r3) {
        A02(r3);
        return A00.getInt(A01(r3), ((Integer) r3.A03).intValue());
    }

    public static boolean A03(C05580Ld r3) {
        A02(r3);
        return A00.getBoolean(A01(r3), ((Boolean) r3.A03).booleanValue());
    }
}
