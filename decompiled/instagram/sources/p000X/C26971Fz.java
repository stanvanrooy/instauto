package p000X;

import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Fz  reason: invalid class name and case insensitive filesystem */
public final class C26971Fz {
    public final C26531Dt A00;
    public final C11200ea A01 = new AnonymousClass1G0(this);
    public final C11200ea A02 = new AnonymousClass1G1(this);
    public final C11200ea A03 = new AnonymousClass1G2(this);
    public final AnonymousClass0C1 A04;

    public static List A00(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            arrayList.add(new C59822iq(i, C0003R.C0004drawable.notification_comment_icon));
        }
        if (i2 > 0) {
            arrayList.add(new C59822iq(i2, C0003R.C0004drawable.notification_like_icon));
        }
        if (i4 > 0) {
            arrayList.add(new C59822iq(i4, C0003R.C0004drawable.notification_people_icon));
        }
        if (i5 > 0) {
            arrayList.add(new C59822iq(i5, C0003R.C0004drawable.notification_story_mention_icon));
        }
        if (i3 > 0) {
            arrayList.add(new C59822iq(i3, C0003R.C0004drawable.notification_tag_icon));
        }
        if (i6 > 0) {
            arrayList.add(new C59822iq(i6, C0003R.C0004drawable.notification_tag_icon));
        }
        if (i7 > 0) {
            arrayList.add(new C59822iq(i7, C0003R.C0004drawable.instagram_shopping_filled_16));
        }
        return arrayList;
    }

    public final void A01() {
        C23300zv A002 = C23300zv.A00(this.A04);
        A002.A03(C33611dC.class, this.A01);
        A002.A03(C33621dD.class, this.A02);
        A002.A03(C33571d8.class, this.A03);
    }

    public final void A02() {
        C23300zv A002 = C23300zv.A00(this.A04);
        A002.A02(C33611dC.class, this.A01);
        A002.A02(C33621dD.class, this.A02);
        A002.A02(C33571d8.class, this.A03);
    }

    public C26971Fz(AnonymousClass0C1 r2, C26531Dt r3) {
        this.A04 = r2;
        this.A00 = r3;
    }
}
