package p000X;

/* renamed from: X.DAT */
public final class DAT implements C29801DAl {
    public DAR A00;
    public C29801DAl A01;
    public final DAV A02;
    public final C29806DAq A03;

    public static void A00(DAT dat) {
        long ASP = dat.A01.ASP();
        DAV dav = dat.A02;
        dav.A01(ASP);
        DAX ASF = dat.A01.ASF();
        if (!ASF.equals(dav.ASF())) {
            dav.BjV(ASF);
            dat.A03.BEV(ASF);
        }
    }

    public final DAX ASF() {
        C29801DAl dAl = this.A01;
        if (dAl != null) {
            return dAl.ASF();
        }
        return this.A02.ASF();
    }

    public final long ASP() {
        boolean z;
        DAR dar = this.A00;
        if (dar == null || dar.AfJ() || (!this.A00.AhB() && this.A00.Ac9())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.A01.ASP();
        }
        return this.A02.ASP();
    }

    public final DAX BjV(DAX dax) {
        C29801DAl dAl = this.A01;
        if (dAl != null) {
            dax = dAl.BjV(dax);
        }
        this.A02.BjV(dax);
        this.A03.BEV(dax);
        return dax;
    }

    public DAT(C29806DAq dAq, BME bme) {
        this.A03 = dAq;
        this.A02 = new DAV(bme);
    }
}
