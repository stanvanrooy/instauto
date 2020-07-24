package p000X;

import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.1aB  reason: invalid class name and case insensitive filesystem */
public final class C31891aB implements C31901aC {
    public final /* synthetic */ IgProgressImageView A00;

    public C31891aB(IgProgressImageView igProgressImageView) {
        this.A00 = igProgressImageView;
    }

    public final void BGN(int i) {
        IgProgressImageView igProgressImageView;
        Integer num;
        IgProgressImageView igProgressImageView2 = this.A00;
        AnonymousClass0jO r1 = igProgressImageView2.A0G;
        synchronized (r1) {
            AnonymousClass1ZB r0 = (AnonymousClass1ZB) r1.A03.get(igProgressImageView2);
            if (r0 != null) {
                r0.A00 = i;
            }
        }
        if (i < 4) {
            igProgressImageView = this.A00;
            num = Constants.ZERO;
        } else {
            igProgressImageView = this.A00;
            num = Constants.ONE;
        }
        IgProgressImageView.A01(igProgressImageView, num);
        for (int i2 = 0; i2 < this.A00.A0F.size(); i2++) {
            ((C38621lZ) this.A00.A0F.valueAt(i2)).BGN(i);
        }
    }
}
