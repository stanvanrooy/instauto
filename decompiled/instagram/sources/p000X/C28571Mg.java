package p000X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Mg  reason: invalid class name and case insensitive filesystem */
public enum C28571Mg {
    NETWORK("n"),
    CACHED("c"),
    LOCAL("l");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C28571Mg(String str) {
        this.A00 = str;
    }

    public static String A00(Set set) {
        String str;
        if (set.isEmpty()) {
            return "None";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            switch (((C28571Mg) it.next()).ordinal()) {
                case 0:
                    str = "Network";
                    break;
                case 1:
                    str = "Cached";
                    break;
                case 2:
                    str = "Local";
                    break;
            }
            sb.append(str);
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
