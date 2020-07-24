package p000X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.ASE */
public final class ASE implements Serializable {
    public final Boolean A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Set A0B;
    public final Set A0C;

    public ASE(ASD asd) {
        this.A07 = asd.A07;
        this.A06 = asd.A06;
        this.A0C = asd.A0C;
        this.A0A = asd.A0A;
        this.A01 = asd.A01;
        this.A03 = asd.A03;
        this.A05 = asd.A05;
        this.A04 = asd.A04;
        this.A0B = asd.A0B;
        this.A00 = asd.A00;
        this.A02 = asd.A02;
        this.A08 = asd.A08;
        this.A09 = asd.A09;
    }
}
