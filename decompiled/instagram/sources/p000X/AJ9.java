package p000X;

import java.util.Iterator;

/* renamed from: X.AJ9 */
public final class AJ9 implements C476824z {
    public final /* synthetic */ C476524w A00;
    public final /* synthetic */ AJ1 A01;

    public AJ9(AJ1 aj1, C476524w r2) {
        this.A01 = aj1;
        this.A00 = r2;
    }

    public final void onFinish() {
        AKB.A00(this.A01.A01).setVisibility(8);
        C23346AIx aIx = this.A01.A01.A0L.A07;
        Iterator it = aIx.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AKX akx = (AKX) it.next();
            if (akx.AP6() == Constants.A0C && C14090jk.A06(aIx.A03, akx.AZf().getId())) {
                ((AKJ) akx).A00 = 0;
                int indexOf = aIx.A04.indexOf(akx);
                if (indexOf != -1) {
                    aIx.notifyItemChanged(C23346AIx.A00(aIx, indexOf));
                }
            }
        }
        AKB akb = this.A01.A01;
        AnonymousClass0C1 r5 = akb.A0I;
        C27341Hl r1 = akb.A0F;
        String str = akb.A08;
        String str2 = akb.A07;
        String id = akb.A0J.getId();
        AJH ajh = new AJH(AnonymousClass0QT.A00(r5, r1).A02("ig_live_wave_impression"));
        ajh.A08("a_pk", id);
        ajh.A08("m_pk", str);
        ajh.A08("b_pk", str2);
        ajh.A01();
        this.A01.A01.A0A.remove(this.A00);
    }
}
