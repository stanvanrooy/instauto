package p000X;

import java.math.BigInteger;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.BLn */
public final class BLn {
    public String A00;
    public BigInteger A01;
    public Date A02;
    public Date A03;
    public X500Principal A04;
    public boolean A05;

    public BLn(String str, BigInteger bigInteger, X500Principal x500Principal, Date date, Date date2, boolean z) {
        this.A00 = str;
        this.A01 = bigInteger;
        this.A04 = x500Principal;
        this.A03 = date;
        this.A02 = date2;
        this.A05 = z;
    }
}
