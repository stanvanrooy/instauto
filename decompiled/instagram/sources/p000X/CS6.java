package p000X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.CS6 */
public final class CS6 extends C256319p {
    public final /* synthetic */ CSA A00;

    public CS6(CSA csa) {
        this.A00 = csa;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0Z0.A03(-1931314020);
        super.onScrollStateChanged(recyclerView, i);
        InlineSearchBox inlineSearchBox = this.A00.A00;
        if (inlineSearchBox != null) {
            inlineSearchBox.A05(i);
        }
        AnonymousClass0Z0.A0A(869082687, A03);
    }
}
