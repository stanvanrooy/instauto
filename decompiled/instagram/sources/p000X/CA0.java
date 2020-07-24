package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CA0 */
public abstract class CA0 {
    public int A00;
    public final Map A01 = A01();

    public C27351C9w A00() {
        return !(this instanceof C27343C9o) ? !(this instanceof C27347C9s) ? !(this instanceof C27345C9q) ? C27351C9w.ELIGIBILITY : C27351C9w.POST_TIME_FRAME : C27351C9w.POST_TYPE : C27351C9w.STORY_TIME_FRAME;
    }

    public Map A01() {
        HashMap hashMap;
        if (this instanceof C27343C9o) {
            hashMap = new HashMap();
            for (C26811Bsw bsw : C26811Bsw.values()) {
                hashMap.put(Integer.valueOf(bsw.ARC()), bsw.name());
            }
        } else if (this instanceof C27347C9s) {
            hashMap = new HashMap();
            for (C27348C9t c9t : C27348C9t.values()) {
                hashMap.put(Integer.valueOf(c9t.ARC()), c9t.name());
            }
        } else if (!(this instanceof C27345C9q)) {
            hashMap = new HashMap();
            for (C27350C9v c9v : C27350C9v.values()) {
                hashMap.put(Integer.valueOf(c9v.ARC()), c9v.name());
            }
        } else {
            hashMap = new HashMap();
            for (C26810Bsv bsv : C26810Bsv.values()) {
                hashMap.put(Integer.valueOf(bsv.ARC()), bsv.name());
            }
        }
        return hashMap;
    }

    public void A02() {
        if (this instanceof C27343C9o) {
            ((C27343C9o) this).A00 = C26811Bsw.LIFETIME.ARC();
        } else if (this instanceof C27347C9s) {
            ((C27347C9s) this).A00 = C27348C9t.ALL.ARC();
        } else if (!(this instanceof C27345C9q)) {
            ((C27346C9r) this).A00 = C27350C9v.ELIGIBLE.ARC();
        } else {
            ((C27345C9q) this).A00 = C26810Bsv.LIFETIME.ARC();
        }
    }

    public CA0() {
        A02();
    }
}
