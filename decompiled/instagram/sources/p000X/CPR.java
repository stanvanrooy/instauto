package p000X;

import android.graphics.PointF;
import android.view.View;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductTag;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CPR */
public final class CPR implements C28168CcW, C27753CPx {
    public final AnonymousClass0C1 A00;
    public final CPm A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public final void A2p(Merchant merchant) {
    }

    public final void A6s(C13300iJ r1) {
    }

    public final void AwG(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void AyN(Merchant merchant) {
    }

    public final void B5A(C13300iJ r1, int i) {
    }

    public final void BFu(Product product) {
    }

    public final void BKc(C13300iJ r1, int i) {
    }

    public final void BUH(C13300iJ r1, int i) {
    }

    public final void BZZ(View view) {
    }

    public final void BbP() {
    }

    public final void Btf() {
    }

    public final void A4g(C13300iJ r4) {
        String AJQ = this.A01.AJQ();
        List list = (List) this.A02.get(AJQ);
        if (list == null) {
            list = new ArrayList();
            this.A02.put(AJQ, list);
        }
        list.add(new PeopleTag(r4, new PointF()));
        AET();
    }

    public final void AET() {
        this.A01.Axf();
    }

    public final void AzR(Product product) {
        ((List) this.A03.get(this.A01.AJQ())).remove(new ProductTag(product));
        this.A01.BQv();
    }

    public final void BIH(C13300iJ r3) {
        ((List) this.A02.get(this.A01.AJQ())).remove(new PeopleTag(r3));
        this.A01.BQv();
    }

    public final void BQu() {
        this.A01.BQu();
    }

    public final boolean BnN(Product product) {
        return !product.A02.A02.equals(this.A00.A04());
    }

    public CPR(AnonymousClass0C1 r2, CPm cPm) {
        this.A00 = r2;
        this.A01 = cPm;
    }
}
