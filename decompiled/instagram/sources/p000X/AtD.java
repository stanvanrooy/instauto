package p000X;

import android.graphics.Bitmap;
import com.instagram.common.p004ui.blur.BlurUtil;
import com.instagram.common.p004ui.widget.imageview.IgImageView;

/* renamed from: X.AtD */
public final class AtD implements C31881aA {
    public final /* synthetic */ AtA A00;

    public AtD(AtA atA) {
        this.A00 = atA;
    }

    public final void B3v() {
        ((IgImageView) this.A00.A02.getValue()).setImageBitmap((Bitmap) null);
    }

    public final void B9O(C37371jY r5) {
        Bitmap bitmap;
        C13150hy.A02(r5, "info");
        AtA atA = this.A00;
        Bitmap bitmap2 = r5.A00;
        IgImageView igImageView = (IgImageView) atA.A02.getValue();
        if (bitmap2 != null) {
            bitmap = BlurUtil.blur(bitmap2, 0.1f, 3);
        } else {
            bitmap = null;
        }
        igImageView.setImageBitmap(bitmap);
    }
}
