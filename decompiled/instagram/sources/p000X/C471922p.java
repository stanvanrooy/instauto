package p000X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.22p  reason: invalid class name and case insensitive filesystem */
public final class C471922p implements AnonymousClass22L {
    public final /* synthetic */ AnonymousClass1LV A00;

    public final void B4u(boolean z) {
    }

    public C471922p(AnonymousClass1LV r1) {
        this.A00 = r1;
    }

    public final List AqQ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1NG r2 = (AnonymousClass1NG) it.next();
            if (r2.A0H == C29261Pf.MEDIA) {
                AnonymousClass1NJ A04 = r2.A04();
                if (!A04.Aho()) {
                    arrayList.add(A04.getId());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C28381Lm r4 = this.A00.A0B;
            C482827j r3 = new C482827j(this);
            C15890nh r22 = new C15890nh(r4.A00);
            r22.A09 = Constants.A0N;
            r22.A0C = "feed/invalidate_privacy_violating_media/";
            r22.A06(C482927k.class, false);
            r22.A09("media_ids", TextUtils.join(",", arrayList));
            C17850qu A03 = r22.A03();
            A03.A00 = new C483027l(r4, r3);
            C12810hQ.A02(A03);
        }
        return Collections.emptyList();
    }
}
