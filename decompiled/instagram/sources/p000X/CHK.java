package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.modal.ModalActivity;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CHK */
public final class CHK implements View.OnClickListener {
    public final /* synthetic */ C27271C6e A00;
    public final /* synthetic */ List A01;

    public CHK(C27271C6e c6e, List list) {
        this.A00 = c6e;
        this.A01 = list;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1880341928);
        C6X c6x = this.A00.A00;
        c6x.A03.A0A = true;
        List list = this.A01;
        C51512Ky r1 = new C51512Ky();
        r1.A00 = 3500;
        r1.A09 = c6x.getString(C0003R.string.close_friends_v2_remove_all_snack_bar);
        r1.A08 = c6x.getString(C0003R.string.undo);
        r1.A05 = new CHL(c6x, list);
        r1.A0B = true;
        c6x.A09 = r1.A00();
        ((ModalActivity) c6x.getActivity()).A0Q().A08(c6x.A09);
        CHP chp = this.A00.A00.A04;
        List list2 = this.A01;
        chp.A06.A01();
        CHR chr = chp.A07;
        C25007Axz axz = chr.A00;
        C17850qu A02 = C25007Axz.A02(axz.A01, axz.A00, Constants.ONE, Collections.EMPTY_LIST, AnonymousClass17A.A01(list2, new CHM(chr)));
        A02.A00 = new CHO(chr, list2);
        CHR.A04(chr, A02);
        CHP.A01(chp);
        AnonymousClass0Z0.A0C(-1064180170, A05);
    }
}
