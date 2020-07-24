package p000X;

import java.util.List;

/* renamed from: X.0Vz  reason: invalid class name and case insensitive filesystem */
public final class C08190Vz {
    public String A00;
    public final AnonymousClass0W0 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final String toString() {
        return "{clientIdentifier='" + this.A02 + "'" + ", willTopic='" + this.A05 + "'" + ", willMessage='" + this.A04 + "'" + ", userName='" + this.A01 + "'" + ", phpOverride='" + this.A00 + "'" + '}';
    }

    public C08190Vz(String str, AnonymousClass0W0 r3, String str2, List list) {
        this.A02 = str;
        this.A06 = list;
        this.A05 = null;
        this.A04 = null;
        this.A01 = r3;
        this.A03 = str2;
    }

    public C08190Vz(String str, String str2, String str3, AnonymousClass0W0 r4, String str4, List list) {
        this.A02 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = r4;
        this.A03 = str4;
        this.A06 = list;
    }
}
