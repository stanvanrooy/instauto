package p000X;

import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.Product;
import java.util.ArrayList;

/* renamed from: X.1as  reason: invalid class name and case insensitive filesystem */
public final class C32271as implements AnonymousClass1RO {
    public Runnable A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View A03;
    public AnonymousClass1NJ A04;
    public C95524Bo A05;
    public C100364Vl A06;
    public C36841ih A07;
    public AnonymousClass0C1 A08;
    public Boolean A09;
    public Boolean A0A;
    public final Handler A0B = new Handler();
    public final ViewStub A0C;

    public static void A00(C32271as r1, int i) {
        View A002;
        if (r1.A03 != null) {
            Boolean bool = r1.A0A;
            AnonymousClass0a4.A06(bool);
            if (bool.booleanValue()) {
                C100364Vl r12 = r1.A06;
                if (i != 8 || r12.A03 != null) {
                    A002 = C100364Vl.A00(r12);
                } else {
                    return;
                }
            } else {
                C95524Bo r13 = r1.A05;
                if (i != 8 || r13.A01 != null) {
                    A002 = C95524Bo.A00(r13);
                } else {
                    return;
                }
            }
            A002.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r1 == false) goto L_0x007c;
     */
    public final void BB7(C36841ih r10, int i) {
        int i2;
        boolean z;
        if (i == 9 && !this.A07.A0c) {
            if (this.A03 == null) {
                this.A03 = this.A0C.inflate();
            }
            Boolean bool = (Boolean) AnonymousClass0L6.A02(this.A08, AnonymousClass0L7.SAVE_TO_COLLECTIONS_FLOW, "is_media_save_upsell_redesign_enabled", false, AnonymousClass0LY.A03);
            this.A0A = bool;
            if (bool.booleanValue()) {
                if (this.A06 == null) {
                    this.A06 = new C100364Vl((ViewStub) this.A03.findViewById(C0003R.C0005id.row_feed_cta_redesign), this.A01, this.A02);
                }
                ArrayList A072 = C52952Qw.A07(this.A08, this.A04.A0x());
                if (!A072.isEmpty()) {
                    this.A09 = (Boolean) AnonymousClass0L6.A02(this.A08, AnonymousClass0L7.SAVE_TO_COLLECTIONS_FLOW, "is_product_save_upsell_redesign_enabled", false, AnonymousClass0LY.A03);
                }
                C100364Vl r4 = this.A06;
                AnonymousClass1NJ r3 = this.A04;
                Boolean bool2 = this.A09;
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    z = true;
                }
                z = false;
                C100364Vl.A00(r4);
                if (!z || A072.isEmpty()) {
                    r4.A09 = r3.A0F();
                    r4.A07 = null;
                    r4.A08 = null;
                    r4.A06.setText(C0003R.string.save_to_collection_title);
                    r4.A05.setVisibility(8);
                    r4.A04.setText(C0003R.string.save_to_collection_upsell);
                } else {
                    r4.A09 = C100364Vl.A01(A072, 0);
                    r4.A07 = C100364Vl.A01(A072, 1);
                    r4.A08 = C100364Vl.A01(A072, 2);
                    r4.A06.setText(((Product) A072.get(0)).A0I);
                    if (A072.size() > 1) {
                        int size = A072.size() - 1;
                        r4.A05.setText(r4.A03.getContext().getResources().getQuantityString(C0003R.plurals.save_to_wish_list_more_items, size, new Object[]{Integer.valueOf(size)}));
                    } else {
                        r4.A05.setText(C52952Qw.A01((Product) A072.get(0), r4.A03.getContext(), Integer.valueOf(C0003R.style.ProductPriceColorForTags), Integer.valueOf(C0003R.style.ProductPriceColor)));
                    }
                    r4.A05.setVisibility(0);
                    r4.A04.setText(C0003R.string.save_to_wish_list);
                }
            } else if (this.A05 == null) {
                C95524Bo r32 = new C95524Bo((ViewStub) this.A03.findViewById(C0003R.C0005id.row_feed_cta_legacy), this.A01, this.A02);
                this.A05 = r32;
                C95524Bo.A00(r32);
            }
            View view = this.A03;
            A00(this, 0);
            this.A07.A0c = true;
            C476524w A0T = C476624x.A07(view).A0T(true);
            Boolean bool3 = this.A0A;
            AnonymousClass0a4.A06(bool3);
            if (bool3.booleanValue()) {
                i2 = this.A06.A00;
            } else {
                i2 = this.A05.A00;
            }
            A0T.A0K((float) i2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0T.A09 = new AnonymousClass422(this);
            A0T.A0O();
            C100364Vl r42 = this.A06;
            if (r42 != null) {
                ImageUrl imageUrl = r42.A09;
                if (imageUrl != null) {
                    r42.A0C.setUrl(imageUrl);
                }
                ImageUrl imageUrl2 = r42.A07;
                if (imageUrl2 != null) {
                    r42.A0A.setUrl(imageUrl2);
                    r42.A01.setVisibility(0);
                } else {
                    r42.A01.setVisibility(8);
                }
                ImageUrl imageUrl3 = r42.A08;
                if (imageUrl3 != null) {
                    r42.A0B.setUrl(imageUrl3);
                    r42.A02.setVisibility(0);
                    return;
                }
                r42.A02.setVisibility(8);
            }
        }
    }

    public C32271as(ViewStub viewStub) {
        this.A0C = viewStub;
    }
}
