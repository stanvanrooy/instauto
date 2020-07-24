package p000X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.1a9  reason: invalid class name and case insensitive filesystem */
public final class C31871a9 implements C31881aA {
    public final /* synthetic */ IgProgressImageView A00;

    public C31871a9(IgProgressImageView igProgressImageView) {
        this.A00 = igProgressImageView;
    }

    public final void B3v() {
        IgProgressImageView igProgressImageView = this.A00;
        igProgressImageView.A0G.A03(igProgressImageView, AnonymousClass1ZA.ContentIsNotAvailable);
        IgProgressImageView igProgressImageView2 = this.A00;
        if (!igProgressImageView2.A07) {
            IgProgressImageView.A01(igProgressImageView2, Constants.A0N);
        }
        SparseArray clone = this.A00.A0E.clone();
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            ((C38591lW) clone.valueAt(i)).B9O(new C37371jY((Bitmap) null, (String) null, (String) null));
        }
    }

    public final void B9O(C37371jY r5) {
        IgProgressImageView igProgressImageView = this.A00;
        igProgressImageView.A0G.A03(igProgressImageView, AnonymousClass1ZA.ShowingData);
        IgProgressImageView.A01(this.A00, Constants.A0C);
        SparseArray clone = this.A00.A0E.clone();
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            ((C38591lW) clone.valueAt(i)).B9O(r5);
        }
    }
}
