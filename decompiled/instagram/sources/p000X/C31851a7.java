package p000X;

import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.1a7  reason: invalid class name and case insensitive filesystem */
public final class C31851a7 implements C31861a8 {
    public final /* synthetic */ IgProgressImageView A00;

    public C31851a7(IgProgressImageView igProgressImageView) {
        this.A00 = igProgressImageView;
    }

    public final void BGD(int i) {
        if (this.A00.A01.isIndeterminate()) {
            this.A00.setProgressBarIndeterminate(false);
        }
        this.A00.A01.setProgress(i);
    }
}
