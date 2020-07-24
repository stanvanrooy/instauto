package p000X;

/* renamed from: X.1nn  reason: invalid class name and case insensitive filesystem */
public final class C39931nn {
    public AnonymousClass1NJ A00;
    public String A01;
    public String A02;
    public String A03 = "unknown";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C39931nn) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C39931nn() {
    }

    public C39931nn(String str, String str2, String str3, AnonymousClass1NJ r5) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = r5;
    }
}
