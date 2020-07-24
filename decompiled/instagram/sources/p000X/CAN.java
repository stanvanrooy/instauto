package p000X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.CAN */
public final class CAN extends C256319p {
    public final /* synthetic */ CAM A00;

    public CAN(CAM cam) {
        this.A00 = cam;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        CAO cao;
        int A03 = AnonymousClass0Z0.A03(1215297132);
        super.onScrolled(recyclerView, i, i2);
        CAM cam = this.A00;
        if (cam.A0G.AiO()) {
            C36341ht A0C = cam.A06.A0C();
            if (A0C == C36341ht.PLAYING && !CAM.A01(cam)) {
                this.A00.A06.A0L("scroll");
            } else if ((A0C == C36341ht.IDLE || A0C == C36341ht.PAUSED) && CAM.A01(this.A00)) {
                this.A00.A06.A0F();
            }
        }
        int i4 = 0;
        AnonymousClass1ZK A0O = this.A00.A04.A0O(0);
        if (A0O != null) {
            i4 = A0O.itemView.getTop();
        }
        CAM cam2 = this.A00;
        int i5 = cam2.A0B;
        cam2.A05.A00.setAlpha((((float) (i5 - i4)) / ((float) i5)) * 0.7f);
        if (i4 <= 0) {
            CAM cam3 = this.A00;
            if (!cam3.A07) {
                cam3.A07 = true;
                long currentTimeMillis = System.currentTimeMillis();
                cam3.A01 += currentTimeMillis - cam3.A00;
                cam3.A00 = currentTimeMillis;
            }
            i3 = 4;
            cao = cam3.A05;
        } else {
            CAM.A00(this.A00);
            i3 = 0;
            cao = this.A00.A05;
        }
        View APn = cao.APn();
        if (i3 != APn.getVisibility()) {
            APn.setVisibility(i3);
        }
        AnonymousClass0Z0.A0A(156046553, A03);
    }
}
