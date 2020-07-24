package p000X;

import com.instagram.tagging.widget.MediaTagHintsLayout;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1aj  reason: invalid class name and case insensitive filesystem */
public final class C32181aj implements AnonymousClass1RO {
    public int A00 = -1;
    public C36841ih A01;
    public final AnonymousClass0C1 A02;
    public final MediaTagHintsLayout A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r5.A03 != null) goto L_0x0043;
     */
    public static void A00(C32181aj r6) {
        boolean z;
        C36841ih r1 = r6.A01;
        if (r1 != null && !r1.A04(r6.A00).A06 && r6.A01.A04(r6.A00).A01 == Constants.ONE && !MediaTagHintsLayout.A02(r6.A01, r6.A00)) {
            MediaTagHintsLayout mediaTagHintsLayout = r6.A03;
            MediaTagHintsLayout.A01(mediaTagHintsLayout);
            MediaTagHintsLayout.A00(mediaTagHintsLayout);
            MediaTagHintsLayout mediaTagHintsLayout2 = r6.A03;
            C36841ih r3 = r6.A01;
            int i = r6.A00;
            if (!MediaTagHintsLayout.A02(r3, i)) {
                if (mediaTagHintsLayout2.A04 == null) {
                    z = true;
                }
                z = false;
                AnonymousClass0a4.A09(z);
                AnonymousClass99Y r4 = new AnonymousClass99Y(mediaTagHintsLayout2, r3, i);
                mediaTagHintsLayout2.A04 = r4;
                AnonymousClass0ZA.A09(mediaTagHintsLayout2.A05, r4, (long) mediaTagHintsLayout2.A01, 1205037730);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r5.A0v != false) goto L_0x0019;
     */
    public final void BB7(C36841ih r5, int i) {
        C36841ih r3 = this.A01;
        if (r5 == r3) {
            if (i != 17) {
                if (i == 18) {
                    if (r5.A0s) {
                        return;
                    }
                } else if (i == 16) {
                    if (r5.A0B != C32501bN.IDLE) {
                        C38731lk.A00(r3, this, true);
                        return;
                    }
                } else if (i != 10) {
                    return;
                }
                MediaTagHintsLayout mediaTagHintsLayout = this.A03;
                MediaTagHintsLayout.A01(mediaTagHintsLayout);
                MediaTagHintsLayout.A00(mediaTagHintsLayout);
                this.A03.A03(r5.A04(this.A00), false);
                return;
            } else if (!r5.A11) {
                return;
            }
            A00(this);
        }
    }

    public C32181aj(AnonymousClass0C1 r2, MediaTagHintsLayout mediaTagHintsLayout) {
        this.A02 = r2;
        this.A03 = mediaTagHintsLayout;
        mediaTagHintsLayout.A02 = r2;
        mediaTagHintsLayout.A01 = 1000;
        mediaTagHintsLayout.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
    }
}
