package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* renamed from: X.C0Z */
public final class C0Z extends C27176Bzt {
    public final C27176Bzt A00;
    public final C27176Bzt A01;
    public final String A02;
    public final boolean A03;

    public C0Z(C27176Bzt bzt, String str, C27176Bzt bzt2, C27225C3o c3o, boolean z) {
        super(bzt.A07, bzt.AZA(), bzt.A04, bzt.A06, c3o, bzt.A08);
        this.A02 = str;
        this.A01 = bzt;
        this.A00 = bzt2;
        this.A03 = z;
    }

    public C0Z(C0Z c0z, JsonDeserializer jsonDeserializer) {
        super((C27176Bzt) c0z, jsonDeserializer);
        this.A02 = c0z.A02;
        this.A03 = c0z.A03;
        this.A01 = c0z.A01;
        this.A00 = c0z.A00;
    }

    public C0Z(C0Z c0z, String str) {
        super((C27176Bzt) c0z, str);
        this.A02 = c0z.A02;
        this.A03 = c0z.A03;
        this.A01 = c0z.A01;
        this.A00 = c0z.A00;
    }
}
