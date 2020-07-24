package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.p009ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.1qx  reason: invalid class name and case insensitive filesystem */
public final class C41801qx extends Handler {
    public final /* synthetic */ PulsingMultiImageView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41801qx(PulsingMultiImageView pulsingMultiImageView, Looper looper) {
        super(looper);
        this.A00 = pulsingMultiImageView;
    }

    public final void handleMessage(Message message) {
        if (!this.A00.isShown()) {
            this.A00.A0B();
            return;
        }
        int i = message.what;
        if (i == 0) {
            float floatValue = ((Float) this.A00.A06.getAnimatedValue()).floatValue();
            this.A00.A06.end();
            this.A00.A07.setCurrentPlayTime((long) Math.round((1.0f - floatValue) * 400.0f));
            this.A00.A07.start();
        } else if (i == 1) {
            this.A00.A07.reverse();
        }
    }
}
