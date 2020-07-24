package p000X;

import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.C0003R;

/* renamed from: X.1fG  reason: invalid class name and case insensitive filesystem */
public final class C34761fG {
    public ViewGroup A00;
    public ImageView A01;
    public final C26571Ea A02;

    public final ImageView A00() {
        ImageView imageView = this.A01;
        if (imageView == null) {
            C13150hy.A03("stickerView");
        }
        return imageView;
    }

    public C34761fG(C26571Ea r3) {
        C13150hy.A02(r3, "viewStubHolder");
        this.A02 = r3;
        ViewStub viewStub = r3.A00;
        if (viewStub == null) {
            C13150hy.A00();
        }
        C13150hy.A01(viewStub, "this.viewStubHolder.viewStub!!");
        viewStub.setLayoutResource(C0003R.layout.reel_hmu_sticker);
        this.A02.A03(new C34771fH(this));
    }
}
