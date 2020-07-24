package p000X;

import com.facebook.react.modules.core.TimingModule;

/* renamed from: X.AG8 */
public final class AG8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AG6 A01;

    public AG8(AG6 ag6, int i) {
        this.A01 = ag6;
        this.A00 = i;
    }

    public final void run() {
        for (TimingModule onHeadlessJsTaskFinish : this.A01.A05) {
            onHeadlessJsTaskFinish.onHeadlessJsTaskFinish(this.A00);
        }
    }
}
