package p000X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.0Ld  reason: invalid class name and case insensitive filesystem */
public abstract class C05580Ld {
    public final AnonymousClass04H A00;
    public final AnonymousClass0L7 A01;
    public final Class A02;
    public final Object A03;
    public final String A04;
    public final String[] A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C05580Ld r5 = (C05580Ld) obj;
            if (!C06360Ot.A0D(this.A04, r5.A04) || !Objects.equals(this.A01, r5.A01) || !Objects.equals(this.A03, r5.A03) || !Objects.equals(this.A02, r5.A02) || !Arrays.equals(this.A05, r5.A05) || !Objects.equals(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A04, this.A01});
    }

    public Object castStringToParameter(String str) {
        return C05560Lb.castStringToParameter(str, this.A03);
    }

    public C05580Ld(String str, AnonymousClass0L7 r3, Object obj, String[] strArr, AnonymousClass04H r6) {
        this.A04 = str;
        this.A01 = r3;
        this.A03 = obj;
        this.A02 = obj.getClass();
        this.A05 = strArr;
        this.A00 = r6;
    }
}
