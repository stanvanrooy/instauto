package p000X;

/* renamed from: X.DU0 */
public abstract class DU0 implements DU5 {
    public long AFI() {
        if (this instanceof DUK) {
            return ((DUK) this).A04;
        }
        if (this instanceof DUL) {
            return ((DUL) this).A02;
        }
        if (this instanceof DUM) {
            return Long.MAX_VALUE;
        }
        throw new UnsupportedOperationException();
    }

    public int AMk() {
        if (this instanceof DU1) {
            return ((DU1) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    public DU5 AQl() {
        if (this instanceof DU1) {
            return ((DU1) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    public DU5 AQp() {
        if (this instanceof DUK) {
            return ((DUK) this).A00;
        }
        if (this instanceof DUL) {
            return ((DUL) this).A00;
        }
        if (this instanceof DUM) {
            return ((DUM) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    public DU5 AQq() {
        if (this instanceof DU2) {
            return ((DU2) this).A00;
        }
        if (this instanceof DUJ) {
            return ((DUJ) this).A00;
        }
        if (this instanceof DUK) {
            return ((DUK) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    public DU5 ASh() {
        if (this instanceof DUK) {
            return ((DUK) this).A02;
        }
        if (this instanceof DUL) {
            return ((DUL) this).A01;
        }
        if (this instanceof DUM) {
            return ((DUM) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    public DU5 ASi() {
        if (this instanceof DU2) {
            return ((DU2) this).A01;
        }
        if (this instanceof DUJ) {
            return ((DUJ) this).A01;
        }
        if (this instanceof DUK) {
            return ((DUK) this).A03;
        }
        throw new UnsupportedOperationException();
    }

    public C30165DTm AZq() {
        if (this instanceof DU1) {
            return ((DU1) this).A03;
        }
        throw new UnsupportedOperationException();
    }

    public long Aaq() {
        if (this instanceof DU2) {
            return Long.MAX_VALUE;
        }
        if (this instanceof DUJ) {
            return ((DUJ) this).A02;
        }
        if (this instanceof DUK) {
            return ((DUK) this).A05;
        }
        throw new UnsupportedOperationException();
    }

    public void Bfa(long j) {
        if (this instanceof DUK) {
            ((DUK) this).A04 = j;
        } else if (this instanceof DUL) {
            ((DUL) this).A02 = j;
        } else if (!(this instanceof DUM)) {
            throw new UnsupportedOperationException();
        }
    }

    public void BjC(DU5 du5) {
        if (this instanceof DUK) {
            ((DUK) this).A00 = du5;
        } else if (this instanceof DUL) {
            ((DUL) this).A00 = du5;
        } else if (!(this instanceof DUM)) {
            throw new UnsupportedOperationException();
        } else {
            ((DUM) this).A00 = du5;
        }
    }

    public void BjD(DU5 du5) {
        if (this instanceof DU2) {
            ((DU2) this).A00 = du5;
        } else if (this instanceof DUJ) {
            ((DUJ) this).A00 = du5;
        } else if (!(this instanceof DUK)) {
            throw new UnsupportedOperationException();
        } else {
            ((DUK) this).A01 = du5;
        }
    }

    public void Bji(DU5 du5) {
        if (this instanceof DUK) {
            ((DUK) this).A02 = du5;
        } else if (this instanceof DUL) {
            ((DUL) this).A01 = du5;
        } else if (!(this instanceof DUM)) {
            throw new UnsupportedOperationException();
        } else {
            ((DUM) this).A01 = du5;
        }
    }

    public void Bjj(DU5 du5) {
        if (this instanceof DU2) {
            ((DU2) this).A01 = du5;
        } else if (this instanceof DUJ) {
            ((DUJ) this).A01 = du5;
        } else if (!(this instanceof DUK)) {
            throw new UnsupportedOperationException();
        } else {
            ((DUK) this).A03 = du5;
        }
    }

    public void Bld(C30165DTm dTm) {
        if (!(this instanceof DU1)) {
            throw new UnsupportedOperationException();
        }
        ((DU1) this).A03 = dTm;
    }

    public void Bly(long j) {
        if (this instanceof DU2) {
            return;
        }
        if (this instanceof DUJ) {
            ((DUJ) this).A02 = j;
        } else if (!(this instanceof DUK)) {
            throw new UnsupportedOperationException();
        } else {
            ((DUK) this).A05 = j;
        }
    }

    public Object getKey() {
        if (this instanceof DU1) {
            return ((DU1) this).A02;
        }
        throw new UnsupportedOperationException();
    }
}
