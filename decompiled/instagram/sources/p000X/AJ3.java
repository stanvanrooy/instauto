package p000X;

import com.facebook.C0003R;

/* renamed from: X.AJ3 */
public final class AJ3 implements C476824z {
    public final /* synthetic */ C13300iJ A00;
    public final /* synthetic */ C23347AIy A01;
    public final /* synthetic */ AKJ A02;

    public AJ3(C23347AIy aIy, AKJ akj, C13300iJ r3) {
        this.A01 = aIy;
        this.A02 = akj;
        this.A00 = r3;
    }

    public final void onFinish() {
        C23347AIy aIy = this.A01;
        AJ2.A00(aIy, this.A02, aIy.A05.getResources().getString(C0003R.string.live_wave_viewer_success_text, new Object[]{this.A00.AZn()}));
    }
}
