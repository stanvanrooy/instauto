package p000X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ce8 */
public final class Ce8 extends C28264Ce5 {
    public final boolean A00;
    public final boolean A01;

    public final void A06(List list, String str) {
        if (!this.A00) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C28277CeJ ceJ = new C28277CeJ();
                ceJ.A05 = "bootstrap";
                ceJ.A03 = str;
                ceJ.A02 = "server_results";
                A03((C28287CeT) it.next(), ceJ);
            }
        }
    }

    public final void A07(List list, String str) {
        if (!this.A00) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C28277CeJ ceJ = new C28277CeJ();
                ceJ.A05 = "client_side_matching";
                ceJ.A03 = str;
                ceJ.A02 = "server_results";
                A03((C28287CeT) it.next(), ceJ);
            }
        }
    }

    public Ce8(boolean z, boolean z2, boolean z3) {
        super(z3);
        this.A00 = z;
        this.A01 = z2;
    }

    public final void A08(List list, String str) {
        String str2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28287CeT ceT = (C28287CeT) it.next();
            C28277CeJ ceJ = new C28277CeJ();
            if (this.A01) {
                str2 = "server";
            } else {
                str2 = "query_cache";
            }
            ceJ.A05 = str2;
            ceJ.A03 = str;
            ceJ.A02 = "server_results";
            A03(ceT, ceJ);
        }
    }
}
