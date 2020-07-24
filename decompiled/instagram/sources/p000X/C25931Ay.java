package p000X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1Ay  reason: invalid class name and case insensitive filesystem */
public final class C25931Ay extends C25941Az {
    public static final AnonymousClass1B1 A05 = new AnonymousClass1B0();
    public boolean A00 = false;
    public final HashMap A01 = new HashMap();
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25931Ay r5 = (C25931Ay) obj;
            if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || !this.A03.equals(r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public final void onCleared() {
        AnonymousClass1AM.A0F(3);
        this.A00 = true;
    }

    public final boolean A00(AnonymousClass1HD r3) {
        if (!this.A02.containsKey(r3.mWho) || !this.A04) {
            return true;
        }
        return this.A00;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A01.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A03.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public C25931Ay(boolean z) {
        this.A04 = z;
    }
}
