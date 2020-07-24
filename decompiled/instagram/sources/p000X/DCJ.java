package p000X;

/* renamed from: X.DCJ */
public final class DCJ implements C29646D3d {
    public int A00 = 1;
    public boolean A01;
    public final /* synthetic */ DCE A02;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0060, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00af, code lost:
        r9.A00 = r11;
        r9.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0003, B:24:0x0034] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00a1=Splitter:B:53:0x00a1, B:33:0x005e=Splitter:B:33:0x005e} */
    public final void BEY(boolean z, int i) {
        if (i != 4) {
            if (this.A01 && !z) {
                this.A02.A01(Constants.ZERO);
            }
            if (z) {
                if (i == 2 && this.A00 == 3) {
                    DCE dce = this.A02;
                    synchronized (dce) {
                        dce.A02 = true;
                        DCK dck = dce.A04;
                        long ACp = dck.A0A.A06.ACp();
                        dck.A03 = ACp;
                        if (dck.A08 && dck.A02 <= 0) {
                            dck.A02 = ACp;
                        }
                        DCF dcf = dce.A01;
                        if (dcf != null) {
                            dcf.A0L = dcf.A0e.A06.ACp();
                        }
                    }
                } else if (i == 3 && this.A00 == 2) {
                    DCE dce2 = this.A02;
                    synchronized (dce2) {
                        try {
                            if (dce2.A02) {
                                dce2.A02 = false;
                                DCK dck2 = dce2.A04;
                                int ACp2 = (int) (dck2.A0A.A06.ACp() - dck2.A03);
                                dck2.A00 = ACp2;
                                if (dck2.A08) {
                                    dck2.A01 += ACp2;
                                }
                                DCF dcf2 = dce2.A01;
                                if (dcf2 != null) {
                                    dcf2.A0I += (int) (dcf2.A0e.A06.ACp() - dcf2.A0L);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
            }
        } else if (this.A00 != 4) {
            DCE dce3 = this.A02;
            synchronized (dce3) {
                try {
                    dce3.A04.A00();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            this.A02.A01(Constants.ONE);
        }
        this.A00 = i;
        this.A01 = z;
    }

    public final void BWF(C29634D2r d2r, String str) {
    }

    public DCJ(DCE dce) {
        this.A02 = dce;
    }

    public final void BEW(C29634D2r d2r, D3Z d3z) {
        DCE dce = this.A02;
        d3z.getMessage();
        synchronized (dce) {
            dce.A04.A00();
        }
    }
}
