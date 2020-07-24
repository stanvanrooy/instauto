package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Pn  reason: invalid class name and case insensitive filesystem */
public class C29341Pn extends C29351Po {
    public AnonymousClass224 A00;
    public final Set A01 = new HashSet();

    public final String A05(Object obj) {
        return ((AnonymousClass1NG) obj).A0X;
    }

    public final void A08() {
        this.A01.clear();
    }

    public final /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass1NJ r0;
        AnonymousClass1NG r4 = (AnonymousClass1NG) obj;
        AnonymousClass1NK r2 = r4.A0G;
        if (r2 instanceof AnonymousClass1NL) {
            this.A01.add(((AnonymousClass1NL) r2).APe());
        }
        AnonymousClass224 r1 = this.A00;
        if (r1 != null) {
            AnonymousClass0a4.A09(C12670hC.A08());
            AnonymousClass1QD r12 = r1.A00.A0U;
            switch (r4.A0H.ordinal()) {
                case 1:
                    r0 = r4.A04();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 31:
                    r12.AXG((C43411uN) r4.A0G);
                    return;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    r12.AW3((C51852Mj) r4.A0G);
                    return;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    r0 = ((C108464lr) r4.A0G).APe();
                    break;
                case 15:
                    r12.AXT((C51892Mn) r4.A0G);
                    return;
                case 16:
                    r0 = ((AnonymousClass1SP) r4.A0G).APe();
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    r12.AWy((C42721t8) r4.A0G);
                    return;
                case 19:
                    r12.AHM(r4.A01);
                    return;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                case 23:
                case 24:
                    r12.ARE((C36311hq) r4.A0G);
                    return;
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    r12.ALF((AnonymousClass1SO) r4.A0G);
                    return;
                case 28:
                    r12.ARD((AnonymousClass5WW) r4.A0G);
                    return;
                case 30:
                    r12.AGs(r4.A0I);
                    return;
                case 32:
                    r12.AMf((AnonymousClass22Q) r4.A0G);
                    return;
                default:
                    return;
            }
            r12.APu(r0);
        }
    }

    public final /* bridge */ /* synthetic */ void A0D(Object obj) {
        AnonymousClass1NK r2 = ((AnonymousClass1NG) obj).A0G;
        if (r2 instanceof AnonymousClass1NL) {
            this.A01.remove(((AnonymousClass1NL) r2).APe());
        }
    }

    public final void A0L(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            super.A0I((AnonymousClass1NG) it.next());
        }
    }

    public final void A0M(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            super.A0E((AnonymousClass1NG) it.next(), i);
            i++;
        }
    }

    public C29341Pn() {
    }

    public C29341Pn(List list) {
        super(list);
    }
}
