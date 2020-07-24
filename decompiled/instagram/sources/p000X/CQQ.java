package p000X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.CQQ */
public final class CQQ extends C256319p {
    public final /* synthetic */ CQF A00;

    public CQQ(CQF cqf) {
        this.A00 = cqf;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0Z0.A03(1759615354);
        C13150hy.A02(recyclerView, AnonymousClass40t.$const$string(284));
        super.onScrollStateChanged(recyclerView, i);
        InlineSearchBox inlineSearchBox = this.A00.A02;
        if (inlineSearchBox == null) {
            C13150hy.A03("inlineSearchBox");
        }
        inlineSearchBox.A05(i);
        AnonymousClass0Z0.A0A(1580924582, A03);
    }
}
