package p000X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.16r  reason: invalid class name and case insensitive filesystem */
public final class C249516r {
    public LinkedHashMap A00 = new LinkedHashMap();
    public final List A01 = new ArrayList();
    public final boolean A02;

    public final Collection A00() {
        if (this.A02) {
            return this.A00.values();
        }
        return this.A01;
    }

    public final List A01() {
        if (this.A02) {
            return new ArrayList(this.A00.values());
        }
        return new ArrayList(this.A01);
    }

    public final void A02(Reel reel) {
        if (this.A02) {
            this.A00.put(reel.getId(), reel);
        } else {
            this.A01.add(reel);
        }
    }

    public final void A03(Collection collection) {
        if (this.A02) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                this.A00.put(reel.getId(), reel);
            }
            return;
        }
        this.A01.addAll(collection);
    }

    public final void A04(Comparator comparator) {
        if (this.A02) {
            ArrayList arrayList = new ArrayList(this.A00.values());
            Collections.sort(arrayList, comparator);
            this.A00.clear();
            A03(arrayList);
            return;
        }
        Collections.sort(this.A01, comparator);
    }

    public final void A05(List list) {
        if (this.A02) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.A00.values());
            this.A00.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Reel reel = (Reel) it.next();
                this.A00.put(reel.getId(), reel);
            }
            return;
        }
        this.A01.addAll(0, list);
    }

    public final void A06(List list) {
        if (this.A02) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A00.remove(((Reel) it.next()).getId());
            }
            return;
        }
        this.A01.removeAll(list);
    }

    public C249516r(boolean z) {
        this.A02 = z;
    }
}
