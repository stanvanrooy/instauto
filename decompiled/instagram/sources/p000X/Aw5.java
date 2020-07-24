package p000X;

import android.media.audiofx.AcousticEchoCanceler;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.video.cowatch.interactor.CoWatchVideoPlayer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Aw5 */
public final class Aw5 {
    public static final long A0C = TimeUnit.SECONDS.toMillis(1);
    public C24967AxA A00;
    public C24915AwJ A01;
    public C24177AjR A02;
    public C24972AxF A03;
    public final AnonymousClass0C1 A04;
    public final C24942Awk A05 = new C24942Awk(this);
    public final C24973AxG A06 = new C24973AxG(this);
    public final C24934Awc A07 = new C24934Awc(this);
    public final CoWatchVideoPlayer A08;
    public final C24979AxM A09;
    public final C24922AwQ A0A;
    public final AnonymousClass0RN A0B;

    public static void A00(Aw5 aw5) {
        C24943Awl A002 = C24915AwJ.A00(aw5.A01);
        A002.A03 = aw5.A04.A06;
        A002.A04 = C24898Avx.STOP;
        A002.A06 = Constants.ONE;
        aw5.A0A.A03(A002.A00());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cd, code lost:
        if (r0.A05.equals(r6) == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013e, code lost:
        if (r12.A06 != p000X.Constants.ZERO) goto L_0x0140;
     */
    public static void A01(Aw5 aw5, C24915AwJ awJ) {
        boolean z;
        boolean z2;
        C24160AjA ajA;
        boolean z3 = true;
        switch (awJ.A04.ordinal()) {
            case 0:
                C24915AwJ awJ2 = aw5.A01;
                if (awJ2 != null && awJ2.A04 == C24898Avx.PAUSE && aw5.A04.A06.equals(awJ.A03) && awJ2.A06 == Constants.ONE) {
                    z = true;
                    break;
                }
                z = false;
                if (!z) {
                    if (awJ2 != null && awJ2.A05.equals(awJ.A05)) {
                        z3 = false;
                    }
                    if (z3) {
                        aw5.A04(awJ.A05, (int) awJ.A02, false);
                    } else {
                        C211829Bs r0 = aw5.A08.A01;
                        if (r0 != null) {
                            r0.A03("server_paused_video");
                        }
                        aw5.A08.A00((int) awJ.A02);
                    }
                    C24177AjR ajR = aw5.A02;
                    if (ajR != null) {
                        if (z3) {
                            ajR.A00(awJ.A05, awJ.A03);
                        }
                        C24905Aw7 aw7 = aw5.A02.A00.A07;
                        C24941Awj A012 = C24905Aw7.A01(aw7);
                        A012.A08.setImageDrawable(A012.A03);
                        View view = C24905Aw7.A00(aw7).A04;
                        if (view.getVisibility() == 8) {
                            C24905Aw7.A02(view, true);
                            view.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                            view.animate().alpha(1.0f).setStartDelay(0).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new C24837AuR(aw7, view)).start();
                        }
                    }
                }
            case 1:
                C24956Awy awy = awJ.A05;
                C24915AwJ awJ3 = aw5.A01;
                if (awJ3 != null) {
                    z2 = false;
                    break;
                }
                z2 = true;
                Integer AZH = awJ.A05.AZH();
                Integer num = Constants.A0N;
                boolean z4 = false;
                if (AZH == num) {
                    z4 = true;
                }
                if (z4 && z2) {
                    aw5.A03(awJ);
                    break;
                } else {
                    int i = (int) awJ.A02;
                    if (awJ.A06 != num) {
                        z3 = false;
                    }
                    aw5.A05(awy, i, z2, z3);
                    C24177AjR ajR2 = aw5.A02;
                    if (ajR2 != null) {
                        if (z2) {
                            ajR2.A00(awy, awJ.A03);
                        } else {
                            C24905Aw7 aw72 = ajR2.A00.A07;
                            C24941Awj awj = aw72.A05;
                            if (awj != null) {
                                awj.A08.setImageDrawable(awj.A02);
                            }
                            if (aw72.A04 != null) {
                                C24905Aw7.A02(C24905Aw7.A00(aw72).A04, false);
                            }
                        }
                    }
                }
            case 2:
                aw5.A01 = null;
                A02(aw5, "hide");
                C24177AjR ajR3 = aw5.A02;
                if (ajR3 != null) {
                    C24904Aw6 aw6 = ajR3.A00;
                    if (!(aw6.A00 == null || !aw6.A07.A08() || (ajA = ajR3.A00.A00.A00.A00) == null)) {
                        ajA.A00.A0C.A0E(false);
                        if (ajA.A00.A03.A05()) {
                            ajA.A00.A06.A07();
                        }
                        C24905Aw7.A00(ajA.A00.A01.A03.A07).A06.setOnTouchListener((View.OnTouchListener) null);
                        ajA.A00.A04.A05().Bkj();
                    }
                    C24904Aw6.A04(ajR3.A00, false);
                    ajR3.A00.A07.A03();
                    C24905Aw7 aw73 = ajR3.A00.A07;
                    C24910AwD awD = aw73.A04;
                    if (awD != null) {
                        C24905Aw7.A02(awD.A06, false);
                        aw73.A04.A0O.A03();
                    }
                    aw73.A03();
                    break;
                }
                break;
        }
        aw5.A01 = awJ;
        C24743Ask A002 = aw5.A0A.A00();
        if (A002 != null) {
            long j = awJ.A01;
            if (j != -1) {
                Integer num2 = Constants.A0C;
                String str = awJ.A04.A00;
                String id = awJ.A03.getId();
                C24956Awy awy2 = awJ.A05;
                A002.Amg(num2, str, j, id, awy2.getId(), C24762At4.A00(awy2.AZH()), awy2.ARQ(aw5.A04), false);
            }
        }
    }

    public static void A02(Aw5 aw5, String str) {
        CoWatchVideoPlayer coWatchVideoPlayer = aw5.A08;
        C211829Bs r0 = coWatchVideoPlayer.A01;
        if (r0 != null) {
            r0.A07(str, true);
        }
        coWatchVideoPlayer.A04.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0.A00 != r1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r6 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r0.A05.equals(r4) == false) goto L_0x0034;
     */
    private void A03(C24915AwJ awJ) {
        boolean z;
        boolean z2;
        int A002;
        boolean z3;
        int i;
        C24956Awy awy = awJ.A05;
        boolean z4 = false;
        if (awy.AZH() == Constants.A0N) {
            z4 = true;
        }
        AnonymousClass0a4.A0A(z4);
        AnonymousClass0a4.A0A(awy instanceof C160136sQ);
        C160136sQ r4 = (C160136sQ) awy;
        int i2 = awJ.A00;
        C160136sQ r8 = new C160136sQ(r4.A00.A0P(i2));
        boolean z5 = true;
        AnonymousClass0a4.A0A(true);
        C24915AwJ awJ2 = this.A01;
        if (awJ2 != null) {
            z = false;
        }
        z = true;
        C24915AwJ awJ3 = this.A01;
        if (awJ3 != null) {
            z2 = false;
        }
        z2 = true;
        C211829Bs r0 = this.A08.A01;
        if (r0 == null) {
            A002 = 0;
        } else {
            A002 = r0.A00();
        }
        if (!z2) {
            z3 = false;
        }
        z3 = true;
        if (awJ.A06 != Constants.A0N) {
            z5 = false;
        }
        A05(r8, A002, z3, z5);
        this.A01 = awJ;
        C24177AjR ajR = this.A02;
        if (ajR == null) {
            return;
        }
        if (z) {
            ajR.A00(r4, awJ.A03);
        } else if (z2) {
            C24904Aw6.A03(ajR.A00, r4, awJ.A03);
            C24904Aw6 aw6 = ajR.A00;
            C24915AwJ awJ4 = aw6.A06.A01;
            if (awJ4 != null) {
                i = awJ4.A00;
            } else {
                i = 0;
            }
            C24904Aw6.A02(aw6, i, r4.A00.A07());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0085, code lost:
        if (r0 != false) goto L_0x0087;
     */
    private void A04(C24956Awy awy, int i, boolean z) {
        boolean z2;
        C24956Awy awy2 = awy;
        awy2.getId();
        CoWatchVideoPlayer coWatchVideoPlayer = this.A08;
        MediaFrameLayout mediaFrameLayout = C24905Aw7.A00(this.A03.A00.A07).A0M;
        String moduleName = this.A0B.getModuleName();
        C24963Ax5 ax5 = this.A0A.A00;
        if (ax5.A00 == null) {
            ax5.A00 = new C56902dF(ax5.A01, new C24977AxK(ax5.A03), ax5.A02);
        }
        C56902dF r5 = ax5.A00;
        boolean isAvailable = AcousticEchoCanceler.isAvailable();
        boolean isSpeakerphoneOn = this.A09.A00.isSpeakerphoneOn();
        int i2 = i;
        C45881yj r10 = new C45881yj(awy2, i2);
        C211829Bs r0 = coWatchVideoPlayer.A01;
        boolean z3 = false;
        if (r0 != null || isAvailable || !isSpeakerphoneOn) {
            if (r0 != null) {
                if (r0 != null) {
                    z2 = r0.A08();
                } else {
                    z2 = false;
                }
            }
            z3 = true;
        }
        r10.A01 = z3;
        if (coWatchVideoPlayer.A01 == null) {
            coWatchVideoPlayer.A01 = new C211829Bs(coWatchVideoPlayer.A02, coWatchVideoPlayer.A03, r5, coWatchVideoPlayer);
        }
        coWatchVideoPlayer.A01.A06(awy2.APB(), awy2.AaF(), mediaFrameLayout, -1, r10, i2, true, z, 1.0f, moduleName);
        coWatchVideoPlayer.A04.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    public final void A06() {
        boolean z;
        int i;
        C24915AwJ awJ = this.A01;
        if (awJ != null) {
            boolean z2 = false;
            if (awJ.A05.AZH() == Constants.A0N) {
                z2 = true;
            }
            z = true;
        }
        z = false;
        if (z) {
            if (awJ != null) {
                i = awJ.A00;
            } else {
                i = 0;
            }
            int min = Math.min(i + 1, ((C160136sQ) awJ.A05).A00.A07() - 1);
            C24943Awl A002 = C24915AwJ.A00(this.A01);
            A002.A03 = this.A04.A06;
            A002.A04 = C24898Avx.PLAY;
            A002.A00 = min;
            A002.A06 = Constants.ONE;
            A03(A002.A00());
        }
    }

    public final void A07() {
        boolean z;
        int A002;
        C24915AwJ awJ = this.A01;
        if (awJ != null && C24762At4.A01(awJ.A05.AZH())) {
            C211829Bs r1 = this.A08.A01;
            if (r1 == null) {
                z = false;
            } else {
                z = r1.A02;
            }
            if (!z) {
                C24943Awl A003 = C24915AwJ.A00(awJ);
                A003.A03 = this.A04.A06;
                A003.A04 = C24898Avx.PAUSE;
                if (r1 == null) {
                    A002 = 0;
                } else {
                    A002 = r1.A00();
                }
                A003.A02 = (long) A002;
                A003.A06 = Constants.ONE;
                this.A0A.A03(A003.A00());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    public final void A08() {
        boolean z;
        int i;
        C24915AwJ awJ = this.A01;
        if (awJ != null) {
            boolean z2 = false;
            if (awJ.A05.AZH() == Constants.A0N) {
                z2 = true;
            }
            z = true;
        }
        z = false;
        if (z) {
            if (awJ != null) {
                i = awJ.A00;
            } else {
                i = 0;
            }
            int max = Math.max(i - 1, 0);
            C24943Awl A002 = C24915AwJ.A00(awJ);
            A002.A03 = this.A04.A06;
            A002.A04 = C24898Avx.PLAY;
            A002.A00 = max;
            A002.A06 = Constants.ONE;
            A03(A002.A00());
        }
    }

    public Aw5(AnonymousClass0C1 r2, AnonymousClass0RN r3, CoWatchVideoPlayer coWatchVideoPlayer, C24979AxM axM, C24922AwQ awQ) {
        this.A04 = r2;
        this.A0B = r3;
        this.A08 = coWatchVideoPlayer;
        this.A09 = axM;
        this.A0A = awQ;
    }

    private void A05(C24956Awy awy, int i, boolean z, boolean z2) {
        int A002;
        AnonymousClass0a4.A06(awy);
        AnonymousClass0a4.A06(this.A03);
        if (!C24762At4.A01(awy.AZH())) {
            awy.getId();
            A02(this, "media_mismatch");
            return;
        }
        if (z) {
            A04(awy, i, true);
        } else if (z2) {
            long j = (long) i;
            C211829Bs r0 = this.A08.A01;
            if (r0 == null) {
                A002 = 0;
            } else {
                A002 = r0.A00();
            }
            this.A0A.A00().AkW(j - ((long) A002));
        }
        awy.getId();
        C211829Bs r02 = this.A08.A01;
        if (r02 != null) {
            r02.A05("resume");
        }
        this.A08.A00(i);
    }
}
