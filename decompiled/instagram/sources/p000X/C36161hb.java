package p000X;

import android.view.View;
import com.instagram.p009ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.1hb  reason: invalid class name and case insensitive filesystem */
public final class C36161hb implements View.OnClickListener {
    public final /* synthetic */ C29081On A00;
    public final /* synthetic */ LoadMoreButton A01;
    public final /* synthetic */ AnonymousClass1Ht A02;

    public C36161hb(LoadMoreButton loadMoreButton, C29081On r2, AnonymousClass1Ht r3) {
        this.A01 = loadMoreButton;
        this.A00 = r2;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-197086373);
        this.A01.A00.Aix();
        LoadMoreButton.setViewType(this.A01, this.A00, this.A02);
        AnonymousClass0Z0.A0C(328258499, A05);
    }
}
