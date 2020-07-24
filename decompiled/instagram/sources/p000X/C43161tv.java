package p000X;

import android.content.Context;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1tv  reason: invalid class name and case insensitive filesystem */
public final class C43161tv {
    public int A00;
    public Context A01;
    public AnonymousClass0RN A02;
    public AnonymousClass0C1 A03;
    public Integer A04;
    public List A05 = new ArrayList();
    public List A06 = new ArrayList();
    public Map A07 = new HashMap();

    public C43161tv(AnonymousClass0C1 r6, C42721t8 r7, Integer num, Context context, AnonymousClass0RN r10, int i, int i2) {
        List A0K;
        List list;
        this.A03 = r6;
        this.A04 = num;
        this.A01 = context;
        this.A02 = r10;
        this.A00 = i;
        ReelStore A0Q = C17020pY.A00().A0Q(this.A03);
        List list2 = r7.A05;
        if (list2 != null) {
            A0K = A0Q.A0L(list2, r7.getId());
        } else {
            A0K = A0Q.A0K(r7.getId());
        }
        List subList = A0K.subList(0, Math.min(i2, A0K.size()));
        for (int i3 = 0; i3 < subList.size(); i3++) {
            Reel reel = (Reel) subList.get(i3);
            if (reel.A0i(this.A03)) {
                list = this.A05;
            } else {
                list = this.A06;
            }
            list.add(reel);
            this.A07.put(reel, Integer.valueOf(i3));
        }
    }
}
