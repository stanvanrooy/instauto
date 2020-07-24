package p000X;

import com.instagram.tagging.activity.TaggingActivity;

/* renamed from: X.CPZ */
public final class CPZ implements C161986vg {
    public final /* synthetic */ TaggingActivity A00;

    public final void AvE() {
    }

    public final void AvG() {
    }

    public CPZ(TaggingActivity taggingActivity) {
        this.A00 = taggingActivity;
    }

    public final void AvA(C161306uQ r2) {
        this.A00.A04.A03();
    }

    public final void AvF(C161306uQ r2) {
        this.A00.A04.A03();
    }

    public final void Bpu() {
        TaggingActivity taggingActivity = this.A00;
        boolean z = false;
        if (C27665CMj.A01(taggingActivity.A03) != null) {
            z = true;
        }
        if (!z) {
            C17510qM.A00.A1G(taggingActivity, taggingActivity.A03, false, taggingActivity.getModuleName(), (String) null, (String) null, 1002, (AnonymousClass1HD) null, taggingActivity);
            return;
        }
        TaggingActivity.A0E(taggingActivity, C27738CPh.PRODUCT, true);
    }
}
