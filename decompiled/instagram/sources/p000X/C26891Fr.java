package p000X;

import android.view.View;
import com.instagram.mainactivity.MainActivity;
import com.instagram.model.creation.MediaCaptureConfig;

/* renamed from: X.1Fr  reason: invalid class name and case insensitive filesystem */
public final class C26891Fr implements View.OnClickListener {
    public final /* synthetic */ MainActivity A00;

    public C26891Fr(MainActivity mainActivity) {
        this.A00 = mainActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003b, code lost:
        if (r0 != false) goto L_0x003d;
     */
    public final void onClick(View view) {
        boolean z;
        int A05 = AnonymousClass0Z0.A05(761385735);
        this.A00.A03.A00(Constants.A0j);
        AnonymousClass0C1 r4 = this.A00.A06;
        if (!((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.FS_CREATION_FLOW_TWEAKS, "remove_feed_camera", false, (AnonymousClass04H) null)).booleanValue()) {
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.FS_NEW_GALLERY, "old_gallery_remove_camera", false, (AnonymousClass04H) null)).booleanValue();
            z = false;
        }
        z = true;
        Integer num = Constants.ZERO;
        C31161Wr r1 = new C31161Wr(num);
        boolean z2 = !z;
        r1.A03 = z2;
        r1.A04 = z2;
        MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(r1);
        if (z) {
            this.A00.AHp().BqD(num, mediaCaptureConfig, Constants.A14);
        } else {
            this.A00.AHp().BpQ(num, mediaCaptureConfig, Constants.A14);
        }
        AnonymousClass0Z0.A0C(-1699291993, A05);
    }
}
