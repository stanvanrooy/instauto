package p000X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.CNK */
public final class CNK extends C256319p {
    public final /* synthetic */ CNB A00;

    public CNK(CNB cnb) {
        this.A00 = cnb;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0Z0.A03(1280916817);
        super.onScrollStateChanged(recyclerView, i);
        InlineSearchBox inlineSearchBox = this.A00.A01;
        if (inlineSearchBox != null) {
            inlineSearchBox.A05(i);
        }
        AnonymousClass0Z0.A0A(-2126632351, A03);
    }
}
