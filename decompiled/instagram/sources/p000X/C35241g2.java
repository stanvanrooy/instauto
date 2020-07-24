package p000X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1g2  reason: invalid class name and case insensitive filesystem */
public final class C35241g2 implements AnonymousClass12J {
    public boolean A00 = false;
    public final List A01;

    public C35241g2(Reel reel) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        arrayList.add(reel);
    }

    public C35241g2(Reel reel, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        arrayList.add(reel);
        this.A00 = true;
    }

    public C35241g2(List list) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        arrayList.addAll(list);
        this.A01.addAll(list);
    }
}
