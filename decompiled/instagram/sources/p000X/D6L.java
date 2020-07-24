package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: X.D6L */
public final class D6L extends C29727D6r implements Handler.Callback {
    public int A00;
    public Format A01;
    public C29769D8w A02;
    public int A03;
    public D8G A04;
    public D6S A05;
    public D6S A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C25996Bdq A0A;
    public final D4V A0B;
    public final D8z A0C;

    public D6L(D4V d4v, Looper looper, C25996Bdq bdq) {
        super(3);
        Handler handler;
        D6U.A01(d4v);
        this.A0B = d4v;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A09 = handler;
        this.A0A = bdq;
        this.A0C = new D8z();
    }

    private void A01() {
        this.A04 = null;
        this.A03 = -1;
        D6S d6s = this.A06;
        if (d6s != null) {
            d6s.release();
            this.A06 = null;
        }
        D6S d6s2 = this.A05;
        if (d6s2 != null) {
            d6s2.release();
            this.A05 = null;
        }
    }

    public final void A0D() {
        this.A01 = null;
        List emptyList = Collections.emptyList();
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.A0B.Ayv(emptyList);
        }
        A01();
        this.A02.release();
        this.A02 = null;
        this.A00 = 0;
    }

    public final void A0I(Format[] formatArr, long j) {
        Format format = formatArr[0];
        this.A01 = format;
        if (this.A02 != null) {
            this.A00 = 1;
        } else {
            this.A02 = this.A0A.AAP(format);
        }
    }

    public final boolean AhB() {
        return true;
    }

    private long A00() {
        int i = this.A03;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        D6S d6s = this.A06;
        if (i < d6s.ALL()) {
            return d6s.ALK(i);
        }
        return Long.MAX_VALUE;
    }

    public final void Bbe(long j, long j2) {
        boolean z;
        if (!this.A08) {
            if (this.A05 == null) {
                C29769D8w d8w = this.A02;
                d8w.Bjb(j);
                try {
                    this.A05 = (D6S) d8w.ABj();
                } catch (D8H e) {
                    throw A0C(e, this.A01);
                }
            }
            if (AWh() == 2) {
                if (this.A06 != null) {
                    long A002 = A00();
                    z = false;
                    while (A002 <= j) {
                        this.A03++;
                        A002 = A00();
                        z = true;
                    }
                } else {
                    z = false;
                }
                D6S d6s = this.A05;
                if (d6s != null) {
                    if (d6s.A02()) {
                        if (!z && A00() == Long.MAX_VALUE) {
                            if (this.A00 == 2) {
                                A01();
                                this.A02.release();
                                this.A02 = null;
                                this.A00 = 0;
                                this.A02 = this.A0A.AAP(this.A01);
                            } else {
                                A01();
                                this.A08 = true;
                            }
                        }
                    } else if (d6s.A01 <= j) {
                        D6S d6s2 = this.A06;
                        if (d6s2 != null) {
                            d6s2.release();
                        }
                        D6S d6s3 = this.A05;
                        this.A06 = d6s3;
                        this.A05 = null;
                        this.A03 = d6s3.AQo(j);
                        z = true;
                    }
                }
                if (z) {
                    List AJC = this.A06.AJC(j);
                    Handler handler = this.A09;
                    if (handler != null) {
                        handler.obtainMessage(0, AJC).sendToTarget();
                    } else {
                        this.A0B.Ayv(AJC);
                    }
                }
                if (this.A00 != 2) {
                    while (!this.A07) {
                        if (this.A04 == null) {
                            D8G d8g = (D8G) this.A02.ABg();
                            this.A04 = d8g;
                            if (d8g == null) {
                                return;
                            }
                        }
                        if (this.A00 == 1) {
                            D8G d8g2 = this.A04;
                            d8g2.A00 = 4;
                            this.A02.BYr(d8g2);
                            this.A04 = null;
                            this.A00 = 2;
                            return;
                        }
                        int A0B2 = A0B(this.A0C, this.A04, false);
                        if (A0B2 == -4) {
                            D8G d8g3 = this.A04;
                            if (d8g3.A02()) {
                                this.A07 = true;
                            } else {
                                d8g3.A00 = this.A0C.A00.A0G;
                                d8g3.A01.flip();
                            }
                            this.A02.BYr(this.A04);
                            this.A04 = null;
                        } else if (A0B2 == -3) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final int Bqt(Format format) {
        if (this.A0A.Bqu(format)) {
            boolean z = false;
            if (format.A0H == null) {
                z = true;
            }
            int i = 2;
            if (z) {
                i = 4;
            }
            return i | 0 | 0;
        } else if ("text".equals(C29735D6z.A04(format.A0S))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.A0B.Ayv((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final void A0G(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.A0B.Ayv(emptyList);
        }
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A01();
            this.A02.release();
            this.A02 = null;
            this.A00 = 0;
            this.A02 = this.A0A.AAP(this.A01);
            return;
        }
        A01();
        this.A02.flush();
    }

    public final boolean AfJ() {
        return this.A08;
    }
}
