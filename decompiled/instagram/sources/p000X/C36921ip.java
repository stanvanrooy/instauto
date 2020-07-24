package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1ip  reason: invalid class name and case insensitive filesystem */
public final class C36921ip extends AnonymousClass1SW {
    public final AnonymousClass21R A00;
    public final AnonymousClass21W A01;
    public final AnonymousClass21Y A02;
    public final AnonymousClass21P A03;
    public final AnonymousClass21V A04;
    public final AnonymousClass21T A05;
    public final AnonymousClass21S A06;
    public final AnonymousClass21X A07;
    public final AnonymousClass21Z A08;
    public final AnonymousClass0C1 A09;
    public final Map A0A;

    public final void BI4(View view, int i, Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass1NJ)) {
            return;
        }
        if (i == Constants.A0Y.intValue() || i == Constants.A03.intValue()) {
            AnonymousClass1NJ r6 = (AnonymousClass1NJ) obj;
            if (r6.Aho()) {
                AnonymousClass21T r2 = this.A05;
                boolean A1X = r6.A1X();
                int i2 = C0003R.C0005id.row_feed_photo_imageview;
                if (A1X) {
                    i2 = C0003R.C0005id.collection_main_image;
                }
                IgProgressImageView igProgressImageView = (IgProgressImageView) view.findViewById(i2);
                if (igProgressImageView != null) {
                    r2.A00.put(r6, igProgressImageView);
                }
                AnonymousClass21Z r1 = this.A08;
                if (r6.AiO() && r1.A01) {
                    r1.A00.put(r6, view);
                }
            }
        }
    }

    public C36921ip(Context context, AnonymousClass0C1 r5, C27371Ho r6) {
        HashMap hashMap = new HashMap();
        this.A0A = hashMap;
        this.A09 = r5;
        this.A03 = new AnonymousClass21P(hashMap);
        this.A00 = new AnonymousClass21R(hashMap);
        this.A06 = new AnonymousClass21S(hashMap);
        this.A05 = new AnonymousClass21T(hashMap, r5);
        Map map = this.A0A;
        this.A04 = new AnonymousClass21V(context, map, r5, r6);
        this.A01 = new AnonymousClass21W(map);
        this.A07 = new AnonymousClass21X(map);
        this.A02 = new AnonymousClass21Y(map);
        this.A08 = new AnonymousClass21Z(map, this.A09);
    }

    public final void AqT(C30231Ta r2, AnonymousClass1NJ r3, C37131jA r4) {
        if (r3.Aho()) {
            r2.A00(this.A02);
        }
    }

    public final void AqU(C30231Ta r2, AnonymousClass1NJ r3, C36841ih r4) {
        if (r3.Aho()) {
            r2.A00(this.A05);
            r2.A00(this.A08);
        }
    }

    public final void AqW(C30231Ta r2, AnonymousClass1NJ r3, C36841ih r4) {
        if (r3.Aho()) {
            r2.A00(this.A04);
        }
    }

    public final void AqX(int i, C30231Ta r3, AnonymousClass1NJ r4, C36841ih r5) {
        if (!r4.Aho()) {
            return;
        }
        if (i == Constants.A0N.intValue()) {
            r3.A00(this.A03);
        } else if (i == Constants.A06.intValue()) {
            r3.A00(this.A06);
        } else if (i == Constants.ONE.intValue()) {
            r3.A00(this.A01);
        } else if (i == Constants.A12.intValue()) {
            r3.A00(this.A07);
        } else if (i == Constants.A0B.intValue()) {
            r3.A00(this.A00);
        }
    }
}
