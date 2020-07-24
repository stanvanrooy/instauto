package p000X;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.DecelerateInterpolator;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.emitter.PulseEmitter;

/* renamed from: X.1qv  reason: invalid class name and case insensitive filesystem */
public final class C41791qv extends Handler {
    public final /* synthetic */ PulseEmitter A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41791qv(PulseEmitter pulseEmitter, Looper looper) {
        super(looper);
        this.A00 = pulseEmitter;
    }

    public final void handleMessage(Message message) {
        ValueAnimator duration;
        if (message.what != 0) {
            return;
        }
        if (this.A00.isShown()) {
            PulseEmitter pulseEmitter = this.A00;
            if (!pulseEmitter.A03.isEmpty()) {
                duration = (ValueAnimator) pulseEmitter.A03.remove(0);
                duration.setCurrentPlayTime(0);
            } else {
                duration = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f}).setDuration(2000);
                duration.setInterpolator(new DecelerateInterpolator());
                duration.addListener(new C41901r7(pulseEmitter, duration));
                duration.addUpdateListener(new C41911r8(pulseEmitter));
            }
            pulseEmitter.A04.add(duration);
            duration.start();
            AnonymousClass0ZA.A03(this, 0, 800);
            return;
        }
        this.A00.A02();
    }
}
