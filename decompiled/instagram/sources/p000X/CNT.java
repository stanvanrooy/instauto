package p000X;

import com.instagram.tagging.activity.TaggingActivity;

/* renamed from: X.CNT */
public abstract class CNT implements C27021Ge {
    public final /* synthetic */ TaggingActivity A00;

    public CNT(TaggingActivity taggingActivity) {
        this.A00 = taggingActivity;
    }

    public final /* bridge */ /* synthetic */ boolean A2J(Object obj) {
        String str;
        CNS cns = (CNS) obj;
        if (cns.A00 != C27671CMp.A01 || (str = cns.A01) == null) {
            return false;
        }
        if (this.A00.A0I.containsKey(str) || this.A00.A0J.contains(cns.A01)) {
            return true;
        }
        return false;
    }
}
