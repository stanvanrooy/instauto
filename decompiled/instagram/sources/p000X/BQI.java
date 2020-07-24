package p000X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BQI */
public final class BQI {
    public final BQH A00;
    public final Map A01;
    public final AtomicBoolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0142, code lost:
        p000X.C54802Yz.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void A00(C25521BOf bOf, Integer num) {
        C25527BOl bOl;
        int i;
        C25521BOf bOf2;
        int i2;
        if (this.A02.get()) {
            switch (num.intValue()) {
                case 0:
                    bOl = (C25527BOl) this.A01.get(10800);
                    break;
                case 1:
                    bOl = (C25527BOl) this.A01.get(10810);
                    break;
                case 3:
                    bOl = (C25527BOl) this.A01.get(10812);
                    break;
                case 4:
                    bOl = (C25527BOl) this.A01.get(10813);
                    break;
                case 5:
                    bOl = (C25527BOl) this.A01.get(10814);
                    break;
                case 6:
                    bOl = (C25527BOl) this.A01.get(10815);
                    break;
                case 7:
                    bOl = (C25527BOl) this.A01.get(10816);
                    break;
                case 8:
                    bOl = (C25527BOl) this.A01.get(10817);
                    break;
                case 9:
                    bOl = (C25527BOl) this.A01.get(10818);
                    break;
                case 10:
                    bOl = (C25527BOl) this.A01.get(10819);
                    break;
                case C120125Dh.VIEW_TYPE_BANNER:
                    bOl = (C25527BOl) this.A01.get(10820);
                    break;
                default:
                    return;
            }
            if (bOl != null) {
                synchronized (this) {
                    int i3 = bOl.A00;
                    Map map = BQL.A00().A00;
                    Integer valueOf = Integer.valueOf(i3);
                    if (map.containsKey(valueOf)) {
                        BQM bqm = (BQM) map.get(valueOf);
                        if (bqm != null) {
                            bOf2 = (C25521BOf) bqm.A00();
                        } else {
                            bOf2 = null;
                        }
                        if (bqm == null) {
                            if (this.A00.A00(i3) != null) {
                                i2 = this.A00.A00(i3).intValue();
                            } else {
                                i2 = this.A00.A00;
                            }
                            bqm = new BQM(i2);
                        }
                        if (!bOf.A05(bOf2, bOl.A02)) {
                            bqm.A02(bOf);
                            BQL.A00().A01(i3, bqm, bOf.A01());
                        }
                    } else {
                        if (this.A00.A00(i3) != null) {
                            i = this.A00.A00(i3).intValue();
                        } else {
                            i = this.A00.A00;
                        }
                        BQM bqm2 = new BQM(i);
                        bqm2.A02(bOf);
                        BQL.A00().A01(i3, bqm2, bOf.A01());
                    }
                }
            }
        }
    }

    public BQI(BQH bqh, Map map) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.A02 = atomicBoolean;
        this.A00 = bqh;
        this.A01 = map;
        atomicBoolean.compareAndSet(false, true);
    }
}
