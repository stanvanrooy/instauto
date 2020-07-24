package p000X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgButton;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.CR4 */
public final class CR4 extends AnonymousClass2MK {
    public final C27371Ho A00;
    public final CRB A01;

    public final AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new CR7(layoutInflater.inflate(C0003R.layout.publishing_collection_row, viewGroup, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r6.Aei(r5) == false) goto L_0x0071;
     */
    public final /* bridge */ /* synthetic */ void A04(C40371oY r12, AnonymousClass1ZK r13) {
        boolean z;
        AnonymousClass96C r0;
        CR8 cr8 = (CR8) r12;
        CR7 cr7 = (CR7) r13;
        CRB crb = this.A01;
        C27371Ho r10 = this.A00;
        C27702CNw cNw = cr8.A01;
        int i = cr8.A00;
        boolean z2 = cr8.A02;
        boolean z3 = cr8.A03;
        CR3 cr3 = cNw.A00.A00;
        AnonymousClass0a4.A06(cr3);
        ProductCollectionTile productCollectionTile = cr3.A00;
        CRA cra = cr3.A01;
        cr7.A01.setText(productCollectionTile.A07);
        cr7.A00.setText(cra.A02);
        AnonymousClass9TY.A00(productCollectionTile.A01, cr7.A03, r10, true);
        if (z3) {
            cr7.A04.setText(i);
            IgButton igButton = cr7.A04;
            if (z2) {
                r0 = AnonymousClass96C.LABEL_EMPHASIZED;
            } else {
                r0 = AnonymousClass96C.LABEL;
            }
            igButton.setStyle(r0);
            cr7.itemView.setBackground((Drawable) null);
        } else {
            View view = cr7.itemView;
            view.setBackgroundResource(AnonymousClass1BA.A03(view.getContext(), C0003R.attr.backgroundDrawable));
        }
        IgButton igButton2 = cr7.A04;
        int i2 = 8;
        int i3 = 8;
        if (z3) {
            i3 = 0;
        }
        igButton2.setVisibility(i3);
        IgSimpleImageView igSimpleImageView = cr7.A02;
        if (!crb.Aei(cNw)) {
            i2 = 0;
        }
        igSimpleImageView.setVisibility(i2);
        CRC crc = cra.A00;
        boolean z4 = false;
        if (crc == null) {
            z4 = true;
        }
        if (z4 || z3) {
            z = true;
        }
        z = false;
        View[] viewArr = {cr7.A03, cr7.A01, cr7.A00, cr7.A02};
        for (int i4 = 0; i4 < 4; i4++) {
            View view2 = viewArr[i4];
            float f = 0.3f;
            if (z) {
                f = 1.0f;
            }
            view2.setAlpha(f);
        }
        cr7.A04.setEnabled(z4);
        CR9 cr9 = new CR9(crb, productCollectionTile, cNw);
        if (!z3 || !z4) {
            cr7.itemView.setOnClickListener(cr9);
        } else {
            cr7.A04.setOnClickListener(cr9);
        }
    }

    public CR4(C27371Ho r1, CRB crb) {
        this.A00 = r1;
        this.A01 = crb;
    }

    public final Class A02() {
        return CR8.class;
    }
}
