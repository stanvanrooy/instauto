package p000X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BXQ */
public abstract class BXQ implements BXU {
    public final List A00 = new ArrayList();

    public boolean A00(List list, C25731BXb bXb, BXX bxx) {
        if (this instanceof BXM) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((BXU) it.next()).BWt(bXb, bxx)) {
                        break;
                    }
                } else if (!list.isEmpty()) {
                    return false;
                }
            }
            return true;
        } else if (!(this instanceof BXN)) {
            if (this instanceof BXS) {
                return false;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!((BXU) it2.next()).BWt(bXb, bxx)) {
                    return false;
                }
            }
            return true;
        } else if (list == null) {
            return true;
        } else {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((BXU) it3.next()).BWt(bXb, bxx)) {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean BWt(C25731BXb bXb, BXX bxx) {
        if (!(this instanceof BXS)) {
            return A00(this.A00, bXb, bxx);
        }
        return false;
    }

    public List getFilterHandlers() {
        return this.A00;
    }
}
