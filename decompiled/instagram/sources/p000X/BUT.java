package p000X;

import java.io.IOException;

/* renamed from: X.BUT */
public final class BUT {
    public C25676BUq A00;
    public C25672BUm A01;
    public Double A02;
    public Double A03;
    public Float A04;
    public Float A05;
    public Float A06;
    public Float A07;
    public Float A08;
    public Float A09;
    public Float A0A;
    public Float A0B;
    public Float A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;

    public BUT() {
    }

    public BUT(String str, String str2, Double d, Double d2, String str3, String str4, String str5, String str6, String str7, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Integer num, Float f8, Float f9) {
        this.A0G = str;
        if (str2 != null) {
            try {
                C13080hr A0A2 = C12890hY.A00.A0A(str2);
                A0A2.A0p();
                this.A00 = BUW.parseFromJson(A0A2);
            } catch (IOException unused) {
            }
        }
        if (this.A00 == null) {
            this.A00 = new C25676BUq();
        }
        this.A02 = d;
        this.A03 = d2;
        this.A0F = str3;
        this.A0H = str4;
        this.A0I = str5;
        this.A0E = str6;
        if (str7 != null) {
            try {
                C13080hr A0A3 = C12890hY.A00.A0A(str7);
                A0A3.A0p();
                this.A01 = BUX.parseFromJson(A0A3);
            } catch (IOException unused2) {
            }
        }
        this.A08 = f;
        this.A0C = f2;
        this.A09 = f3;
        this.A0A = f4;
        this.A05 = f5;
        this.A07 = f6;
        this.A06 = f7;
        this.A0D = num;
        this.A0B = f8;
        this.A04 = f9;
    }
}
