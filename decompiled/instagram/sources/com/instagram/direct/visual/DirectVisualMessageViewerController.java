package com.instagram.direct.visual;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.flipper.core.StateSummary;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.p009ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import com.instagram.p009ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.p009ui.widget.textureview.ScalingTextureView;
import com.instagram.p009ui.widget.volume.VolumeIndicator;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.events.model.EventStickerModel;
import com.instagram.reels.viewer.attribution.CyclingFrameLayout;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0PB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1CF;
import p000X.AnonymousClass1CK;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1F6;
import p000X.AnonymousClass1GK;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1IY;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass1N4;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1S0;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass2M0;
import p000X.AnonymousClass2MA;
import p000X.AnonymousClass2MC;
import p000X.AnonymousClass2OS;
import p000X.AnonymousClass31U;
import p000X.AnonymousClass37Q;
import p000X.AnonymousClass3EF;
import p000X.AnonymousClass3GO;
import p000X.AnonymousClass3JR;
import p000X.AnonymousClass3JW;
import p000X.AnonymousClass3LJ;
import p000X.AnonymousClass3LM;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass41Y;
import p000X.AnonymousClass42H;
import p000X.AnonymousClass48B;
import p000X.AnonymousClass4XI;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass72i;
import p000X.AnonymousClass89W;
import p000X.AnonymousClass8iE;
import p000X.AnonymousClass95G;
import p000X.AnonymousClass9C0;
import p000X.AnonymousClass9C2;
import p000X.AnonymousClass9C7;
import p000X.AnonymousClass9C8;
import p000X.AnonymousClass9C9;
import p000X.AnonymousClass9CC;
import p000X.AnonymousClass9CE;
import p000X.AnonymousClass9CF;
import p000X.AnonymousClass9CI;
import p000X.AnonymousClass9CJ;
import p000X.AnonymousClass9CK;
import p000X.AnonymousClass9CL;
import p000X.AnonymousClass9CM;
import p000X.AnonymousClass9CN;
import p000X.AnonymousClass9CO;
import p000X.AnonymousClass9CP;
import p000X.AnonymousClass9CR;
import p000X.AnonymousClass9CU;
import p000X.AnonymousClass9CV;
import p000X.C019000b;
import p000X.C05000Hl;
import p000X.C06080Nr;
import p000X.C06220Of;
import p000X.C06270Ok;
import p000X.C104594fU;
import p000X.C108644mC;
import p000X.C108744mM;
import p000X.C108754mN;
import p000X.C108764mO;
import p000X.C11200ea;
import p000X.C122995Pc;
import p000X.C123005Pd;
import p000X.C12670hC;
import p000X.C12810hQ;
import p000X.C13300iJ;
import p000X.C13390iS;
import p000X.C14090jk;
import p000X.C15890nh;
import p000X.C15960no;
import p000X.C16180oA;
import p000X.C16670oy;
import p000X.C168767Ir;
import p000X.C17390qA;
import p000X.C17600qV;
import p000X.C17920r1;
import p000X.C1893987c;
import p000X.C1894187e;
import p000X.C1894287f;
import p000X.C18980sj;
import p000X.C19290tE;
import p000X.C200558iF;
import p000X.C20800vh;
import p000X.C211799Bp;
import p000X.C211809Bq;
import p000X.C211819Br;
import p000X.C211829Bs;
import p000X.C211839Bt;
import p000X.C211849Bu;
import p000X.C211859Bv;
import p000X.C211869Bx;
import p000X.C211879By;
import p000X.C211889Bz;
import p000X.C211899Ca;
import p000X.C211919Cc;
import p000X.C23300zv;
import p000X.C249616t;
import p000X.C26571Ea;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C27491Ib;
import p000X.C27511Id;
import p000X.C28261La;
import p000X.C28991Oe;
import p000X.C29291Pi;
import p000X.C33211cY;
import p000X.C34151eA;
import p000X.C34181eD;
import p000X.C34261eN;
import p000X.C34561ew;
import p000X.C34581ey;
import p000X.C34651f5;
import p000X.C34661f6;
import p000X.C34811fL;
import p000X.C34851fP;
import p000X.C35031fh;
import p000X.C35201fy;
import p000X.C37461jh;
import p000X.C37631jy;
import p000X.C37671k2;
import p000X.C39351mm;
import p000X.C39941no;
import p000X.C46361zc;
import p000X.C476524w;
import p000X.C476624x;
import p000X.C52322Oi;
import p000X.C52902Qq;
import p000X.C55012Zv;
import p000X.C55432ad;
import p000X.C56202c6;
import p000X.C58012fA;
import p000X.C58022fB;
import p000X.C58032fC;
import p000X.C59032gv;
import p000X.C60532k3;
import p000X.C64982sM;
import p000X.C65212sj;
import p000X.C65262so;
import p000X.C65302ss;
import p000X.C65312st;
import p000X.C65372sz;
import p000X.C65382t0;
import p000X.C65402t2;
import p000X.C65432t5;
import p000X.C65882uZ;
import p000X.C66112uw;
import p000X.C699234e;
import p000X.C700334p;
import p000X.C706136v;
import p000X.C72133Du;
import p000X.C97524Jk;
import p000X.C97534Jl;
import p000X.C98714On;
import p000X.C99424Rp;
import p000X.C99484Rv;

public class DirectVisualMessageViewerController implements AnonymousClass1HK, AnonymousClass2OS, AnonymousClass2MA, C52322Oi, AnonymousClass2MC, C28991Oe, View.OnKeyListener {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public int A01;
    public int A02 = 3;
    public int A03;
    public int A04;
    public AnonymousClass1LO A05;
    public AnonymousClass37Q A06;
    public C17920r1 A07;
    public AnonymousClass1IY A08;
    public C35201fy A09;
    public CircularImageView A0A;
    public AnonymousClass9C7 A0B;
    public AnonymousClass31U A0C;
    public C108744mM A0D;
    public C211879By A0E;
    public AnonymousClass9CV A0F;
    public AnonymousClass1S0 A0G;
    public C249616t A0H;
    public C27371Ho A0I;
    public AnonymousClass9CM A0J;
    public AnonymousClass3EF A0K;
    public AnonymousClass9CF A0L;
    public C706136v A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P = false;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T = true;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public final int A0X;
    public final RectF A0Y;
    public final FragmentActivity A0Z;
    public final C28261La A0a = new C108644mC(this);
    public final C27341Hl A0b;
    public final C66112uw A0c;
    public final C65882uZ A0d;
    public final AnonymousClass2M0 A0e;
    public final ReelViewerConfig A0f;
    public final C700334p A0g;
    public final AnonymousClass0C1 A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final HashSet A0m = new HashSet();
    public final boolean A0n;
    public final boolean A0o;
    public final AnonymousClass0QT A0p;
    public final C11200ea A0q = new AnonymousClass9C0(this);
    public final C11200ea A0r = new AnonymousClass41Y(this);
    public final C211919Cc A0s;
    public final C122995Pc A0t;
    public final C699234e A0u;
    public final boolean A0v;
    public View mBackgroundDimmer;
    public C26571Ea mBlurImageViewContainerStubHolder;
    public EditText mComposerEditText;
    public TextWatcher mComposerTextWatcher;
    public C211799Bp mContentHolder;
    public View mContentView;
    public View mItemView;
    public C27511Id mKeyboardHeightChangeDetector;
    public C72133Du mPhotoTimerController;
    public SegmentedProgressBar mProgressBar;
    public AnonymousClass9CR mReelViewerShadowAnimator;
    public View mReplyComposerContainer;
    public View mRootView;
    public C26571Ea mSparklerAnimationStubHolder;
    public View mTextSendButton;
    public C26571Ea mThreadsVvmUpsellFooterStubHolder;
    public C211839Bt mVideoPlayer;
    public TouchInterceptorFrameLayout mViewerContainer;
    public View mViewerInfoContainer;
    public VolumeIndicator mVolumeIndicator;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r0 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r6.A0X != 1) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        A09(r6, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        if (r6.A0X != 1) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    public static void A0G(DirectVisualMessageViewerController directVisualMessageViewerController, boolean z) {
        boolean z2;
        int A002;
        int i = 5;
        if (z) {
            i = 1;
        }
        C26571Ea r1 = directVisualMessageViewerController.mSparklerAnimationStubHolder;
        if (r1.A04()) {
            View A012 = r1.A01();
            ((AnimationDrawable) A012.getBackground()).stop();
            C476624x.A08(true, A012);
        }
        C108744mM r0 = directVisualMessageViewerController.A0D;
        boolean z3 = true;
        if (r0.A00 + 1 >= r0.A04.size()) {
            z3 = false;
        }
        if (z3) {
            C108744mM r02 = directVisualMessageViewerController.A0D;
            int i2 = r02.A00;
            int i3 = r02.A01;
            boolean z4 = true;
            if (i2 >= i3 - 1) {
                z4 = false;
            }
        }
        if (!directVisualMessageViewerController.A0P) {
            if (z) {
                z2 = true;
            }
            A06(directVisualMessageViewerController);
            A08(directVisualMessageViewerController, i);
            C108744mM r12 = directVisualMessageViewerController.A0D;
            int i4 = r12.A00;
            C13300iJ r5 = directVisualMessageViewerController.A0h.A06;
            int i5 = i4 + 1;
            while (true) {
                A002 = i5 % r12.A00();
                if (A002 != i4) {
                    C211809Bq A022 = directVisualMessageViewerController.A0D.A02(A002);
                    AnonymousClass0a4.A06(A022);
                    if (directVisualMessageViewerController.A0I(A022, r5)) {
                        directVisualMessageViewerController.A0D.A00 = A002;
                        break;
                    } else {
                        i5 = A002 + 1;
                        r12 = directVisualMessageViewerController.A0D;
                    }
                } else {
                    C211809Bq A013 = directVisualMessageViewerController.A0D.A01();
                    AnonymousClass0a4.A06(A013);
                    if (directVisualMessageViewerController.A0I(A013, r5)) {
                        A002 = directVisualMessageViewerController.A0D.A00;
                    } else {
                        A002 = -1;
                    }
                }
            }
            if (A002 == -1) {
                z2 = true;
            } else {
                A05(directVisualMessageViewerController);
                if (directVisualMessageViewerController.A0D.A02(i4).A0Q) {
                    SegmentedProgressBar segmentedProgressBar = directVisualMessageViewerController.mProgressBar;
                    if (segmentedProgressBar.A0P) {
                        i4 = (segmentedProgressBar.A06 - 1) - i4;
                    }
                    if (segmentedProgressBar.A0M.get(i4) == null) {
                        float f = segmentedProgressBar.A00;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 0.0f});
                        ofFloat.setDuration(250);
                        segmentedProgressBar.A0M.put(i4, Float.valueOf(f));
                        ofFloat.addUpdateListener(new AnonymousClass9CI(segmentedProgressBar, i4));
                        ofFloat.start();
                    }
                }
            }
        } else if (directVisualMessageViewerController.A0F == null) {
            directVisualMessageViewerController.A0F = new AnonymousClass9CV(directVisualMessageViewerController, z);
        }
    }

    public final void A0N() {
        String str;
        this.A0Q = false;
        this.A0E.A00();
        C60532k3.A00(this.A0E, this.mViewerContainer);
        this.A0B.A07 = SystemClock.elapsedRealtime();
        AnonymousClass1X4.A04(this.A0Z.getWindow(), this.A0Z.getWindow().getDecorView(), false);
        if (this.A0O) {
            A0D(this, "resume");
        }
        this.A08.A04(this.A0Z);
        if (this.A09 == null) {
            AnonymousClass1IY r5 = this.A08;
            AnonymousClass0C1 r3 = this.A0h;
            C108744mM r0 = this.A0D;
            this.A09 = r5.A02(new C99484Rv(r3, r0.A02, r0.A01().A0D, this.A0D.A01().A0C));
        }
        if (this.A0D.A00() < this.A0D.A01) {
            C65882uZ A002 = C19290tE.A00(this.A0h);
            DirectThreadKey AOO = this.A0c.AOO();
            C108744mM r1 = this.A0D;
            if (r1.A04.isEmpty()) {
                str = null;
            } else {
                List list = r1.A04;
                str = ((C211809Bq) list.get(list.size() - 1)).A0G;
            }
            List AZS = A002.AZS(AOO, str);
            if (AZS != null) {
                this.A0D.A03(C98714On.A01(this.A0Z, this.A0h, this.A0c, AZS));
            }
        }
        C23300zv A003 = C23300zv.A00(this.A0h);
        A003.A02(AnonymousClass9CU.class, this.A0q);
        A003.A02(C33211cY.class, this.A0r);
        this.mKeyboardHeightChangeDetector.BOP(this.A0Z);
        this.mComposerEditText.addTextChangedListener(this.mComposerTextWatcher);
        this.mComposerEditText.setOnFocusChangeListener(new AnonymousClass9C8(this));
        C16670oy A012 = C16670oy.A01();
        A012.A00.A05(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass3LJ.A01(this.A0h.A04(), this.A0c.AY5(), (String) null));
        this.A0M.A01 = this.A0u;
        AnonymousClass9CF r02 = this.A0L;
        C211919Cc r12 = this.A0s;
        r02.A00 = r12;
        this.A0J.A00 = r12;
        AnonymousClass1F6.A00(this.A0h).A08(this.A0b.getModuleName(), new AnonymousClass72i(), new AnonymousClass3GO(), AnonymousClass1F6.A0C.intValue());
        AnonymousClass1F6.A00(this.A0h).A05();
    }

    public final void B0E() {
    }

    public final void B8g(int i, boolean z) {
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        this.A0S = z2;
        this.A0E.A00.A00 = !z2;
        if (i == 0) {
            this.mComposerEditText.clearFocus();
        }
        C476524w A072 = C476624x.A07(this.mReplyComposerContainer);
        A072.A0N();
        C476524w A0T2 = A072.A0T(true);
        A0T2.A0E((float) (-i));
        A0T2.A0O();
    }

    public final void BCi(String str, boolean z) {
    }

    public final /* bridge */ /* synthetic */ void BGM(Object obj) {
        A0G(this, false);
    }

    public final void BIl(String str, String str2) {
    }

    public final void BMJ() {
    }

    public final void Bas(String str, String str2) {
    }

    public static C211809Bq A00(DirectVisualMessageViewerController directVisualMessageViewerController) {
        return directVisualMessageViewerController.A0D.A01();
    }

    private C476524w A01() {
        C476524w A072 = C476624x.A07(this.mContentView);
        A072.A0N();
        C476524w A0T2 = A072.A0T(true);
        A0T2.A08 = 0;
        A0T2.A07 = 4;
        C476524w A0S2 = A0T2.A0S(C35031fh.A00);
        A0S2.A09 = new AnonymousClass9CL(this);
        return A0S2;
    }

    public static void A02(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C37671k2 r1;
        AnonymousClass1F6 A002 = AnonymousClass1F6.A00(directVisualMessageViewerController.A0h);
        C108744mM r2 = directVisualMessageViewerController.A0D;
        int i = r2.A00 + 1;
        int min = Math.min(i + 2, r2.A00());
        while (i < min) {
            C211809Bq A022 = directVisualMessageViewerController.A0D.A02(i);
            if (A022 != null) {
                if (A022.A0O) {
                    AnonymousClass0C1 r4 = directVisualMessageViewerController.A0h;
                    String str = directVisualMessageViewerController.A0D.A02;
                    String str2 = A022.A0G;
                    AnonymousClass3LM.A00(r4, str, Collections.singletonList(str2), Collections.EMPTY_LIST, new C108754mN(directVisualMessageViewerController, A022, A002, i));
                } else {
                    String moduleName = directVisualMessageViewerController.A0b.getModuleName();
                    String str3 = A022.A0D;
                    if (A022.A01()) {
                        r1 = A022.A00();
                    } else {
                        r1 = null;
                    }
                    A002.A0D(moduleName, new C37461jh(new C37631jy(str3, (AnonymousClass1GK) null, r1), new C108764mO(A022, i)));
                }
                i++;
            } else {
                throw new IndexOutOfBoundsException(AnonymousClass000.A07(StateSummary.$const$string(30), i, ", size is ", directVisualMessageViewerController.A0D.A00()));
            }
        }
        A002.A09.A02();
    }

    public static void A03(DirectVisualMessageViewerController directVisualMessageViewerController) {
        FrameLayout frameLayout = (FrameLayout) directVisualMessageViewerController.mBlurImageViewContainerStubHolder.A01();
        IgImageView igImageView = (IgImageView) frameLayout.findViewById(C0003R.C0005id.direct_visual_message_blur_image_view);
        igImageView.setImageRenderer(AnonymousClass95G.A00);
        ImageUrl imageUrl = directVisualMessageViewerController.A0D.A01().A05;
        if (!C46361zc.A02(imageUrl)) {
            igImageView.setUrl(imageUrl);
        } else {
            igImageView.A04();
        }
        frameLayout.setForeground(new ColorDrawable(C019000b.A00(directVisualMessageViewerController.A0Z, C0003R.color.black_50_transparent)));
        C476524w A072 = C476624x.A07(frameLayout);
        A072.A0C(1.0f);
        C476524w A0T2 = A072.A0T(true);
        A0T2.A08 = 0;
        A0T2.A0O();
    }

    public static void A04(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C26571Ea r1 = directVisualMessageViewerController.mBlurImageViewContainerStubHolder;
        if (r1.A04()) {
            C476524w A072 = C476624x.A07(r1.A01());
            A072.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            C476524w A0T2 = A072.A0T(true);
            A0T2.A07 = 8;
            A0T2.A0O();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0391, code lost:
        if (r1.equals(r5.A03) == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0152, code lost:
        if (r7.A04 == null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ec, code lost:
        if (r5.A04 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025d, code lost:
        if (r1.equals(r5.A03) == false) goto L_0x025f;
     */
    public static void A05(DirectVisualMessageViewerController directVisualMessageViewerController) {
        int i;
        TextView textView;
        String string;
        boolean z;
        boolean z2;
        boolean z3;
        C211829Bs r5;
        AnonymousClass9CK r52;
        AnonymousClass9CK r53;
        Long l;
        boolean z4;
        boolean z5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        DirectVisualMessageViewerController directVisualMessageViewerController2 = directVisualMessageViewerController;
        C211809Bq A012 = directVisualMessageViewerController2.A0D.A01();
        C108744mM r4 = directVisualMessageViewerController2.A0D;
        int i2 = r4.A00;
        if (directVisualMessageViewerController2.A09 == null) {
            directVisualMessageViewerController2.A09 = directVisualMessageViewerController2.A08.A02(new C99484Rv(directVisualMessageViewerController2.A0h, r4.A02, A012.A0D, A012.A0C));
        }
        directVisualMessageViewerController2.A02 = 1;
        AnonymousClass1NJ r6 = A012.A07;
        if (r6 != null && A012.A0N) {
            ExtendedImageUrl A0S2 = r6.A0S(directVisualMessageViewerController2.A0Z);
            directVisualMessageViewerController2.A05.A06(r6, A0S2.getHeight(), A0S2.getWidth());
        }
        if (directVisualMessageViewerController2.A0n) {
            i = directVisualMessageViewerController2.A0D.A00();
        } else {
            i = directVisualMessageViewerController2.A0D.A01;
        }
        directVisualMessageViewerController2.A0B.A06 = i;
        int i3 = 0;
        directVisualMessageViewerController2.mProgressBar.setVisibility(0);
        directVisualMessageViewerController2.mProgressBar.setSegments(i);
        directVisualMessageViewerController2.mProgressBar.A04(i2, A00(directVisualMessageViewerController2).A0Q);
        FragmentActivity fragmentActivity = directVisualMessageViewerController2.A0Z;
        C122995Pc r24 = directVisualMessageViewerController2.A0t;
        C211799Bp r8 = directVisualMessageViewerController2.mContentHolder;
        C108744mM r62 = directVisualMessageViewerController2.A0D;
        AnonymousClass0C1 r54 = directVisualMessageViewerController2.A0h;
        C27341Hl r23 = directVisualMessageViewerController2.A0b;
        r8.A0G.A03();
        r8.A0G.A04(C0003R.C0005id.listener_id_for_direct_visual_message_item_viewer_image_binding);
        r8.A05.setVisibility(0);
        ViewGroup viewGroup = r8.A0F.A00;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = r8.A0H.A01;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        ViewGroup viewGroup3 = r8.A0I.A05;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(8);
        }
        r8.A0L.A00();
        r8.A0K.A05.A02(8);
        if (A012.A0N) {
            AnonymousClass1NJ r9 = A012.A07;
            if (r9 != null) {
                DirectVisualMessageViewerController directVisualMessageViewerController3 = r24.A00;
                directVisualMessageViewerController3.A05.A07(r9, directVisualMessageViewerController3.mContentHolder.A0G);
            }
            r8.A07.setVisibility(8);
            boolean A013 = A012.A01();
            AnonymousClass95G.A00(r8.A0G, A013 ? 1 : 0);
            boolean z6 = false;
            if (A012.A07 != null) {
                z6 = true;
            }
            if (z6) {
                List list = A012.A0K;
                float f = A012.A03;
                C65372sz.A00(r8.A0L, list, f);
                C34851fP r10 = r8.A0I;
                List list2 = list;
                C65402t2.A01(r10, (C39941no) null, A012.A07, list2, r24, f, r54, A012.A0I, (C64982sM) null);
                C65432t5.A00(r54, r8.A0K, r24, list2, A012.A0G, r62.A02, f);
                r8.A0M.A01();
                CyclingFrameLayout cyclingFrameLayout = r8.A0M;
                C34651f5 r102 = r8.A0D;
                C34661f6 r7 = r8.A0H;
                AnonymousClass0C1 r16 = r54;
                if (!C65212sj.A01(A012.A07)) {
                    z4 = false;
                } else {
                    List A002 = C65212sj.A00(fragmentActivity, r54, A012.A0K, r102, r7, (View.OnClickListener) null);
                    if (A002.size() > 1) {
                        cyclingFrameLayout.A02(A002);
                    }
                    z4 = true;
                }
                if (!z4) {
                    C34661f6 r72 = r8.A0H;
                    C34561ew A032 = C65302ss.A03(A012.A0K);
                    if (A032 != null) {
                        C55012Zv.A01(r72, C55012Zv.A00(A032));
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (!z4) {
                    AnonymousClass9CJ r12 = r8.A0F;
                    AnonymousClass9CN r73 = A012.A06;
                    if (!(r73 == null || r73.A03 == null)) {
                        z5 = true;
                    }
                    z5 = false;
                    if (!z5) {
                        z4 = false;
                    } else {
                        if (r12.A00 == null) {
                            ViewGroup viewGroup4 = (ViewGroup) r12.A03.inflate();
                            r12.A00 = viewGroup4;
                            r12.A02 = (IgImageView) viewGroup4.findViewById(C0003R.C0005id.reel_app_attribution_icon);
                            r12.A01 = (TextView) r12.A00.findViewById(C0003R.C0005id.reel_app_attribution_action_text);
                        }
                        AnonymousClass9CN r42 = A012.A06;
                        if (r42 != null) {
                            str = r42.A01;
                        } else {
                            str = null;
                        }
                        if (r42 != null) {
                            str2 = r42.A00;
                        } else {
                            str2 = null;
                        }
                        Context context = r12.A01.getContext();
                        if (!TextUtils.isEmpty(str)) {
                            r12.A02.setUrl(str);
                            r12.A02.setVisibility(0);
                        } else {
                            r12.A02.setVisibility(8);
                        }
                        TextView textView2 = r12.A01;
                        AnonymousClass9CN r43 = A012.A06;
                        if (r43 != null) {
                            str3 = r43.A02;
                        } else {
                            str3 = null;
                        }
                        if (r43 != null) {
                            str4 = r43.A05;
                        } else {
                            str4 = null;
                        }
                        if (r43 != null) {
                            str5 = r43.A04;
                        } else {
                            str5 = null;
                        }
                        textView2.setText(C168767Ir.A00(context, str2, str3, str4, str5));
                        r12.A00.setVisibility(0);
                        z4 = true;
                    }
                }
                AnonymousClass1NJ r103 = A012.A07;
                if (!z4 && C65312st.A00(fragmentActivity, r103)) {
                    C34651f5 r74 = r8.A0C;
                    new C65262so(r16, fragmentActivity, (C39941no) null, r103, r24, r74, r74.A00, r23).A07();
                }
            }
            r8.A0G.A05(C0003R.C0005id.listener_id_for_direct_visual_message_item_viewer_image_binding, new C200558iF(A013, r24, r62, i2, A012));
            r8.A0G.setEnableProgressBar(!A013);
            ImageUrl imageUrl = A012.A05;
            if (imageUrl != null) {
                r8.A0G.setUrl(imageUrl);
            } else {
                r8.A0G.A03();
                AnonymousClass0QD.A01("DirectVisualMessageViewerItemBinder", "DirectVisualMessageViewerItem.getSizedImageUrl() is null.");
            }
            int i4 = 0;
            r8.A0G.setVisibility(0);
            AnonymousClass1CK AYV = AnonymousClass1CF.A00(r54).AYV();
            C26571Ea r75 = r8.A0E;
            if (!AYV.A01(AnonymousClass0C5.$const$string(244))) {
                i4 = 8;
            }
            r75.A02(i4);
        } else {
            r8.A0G.setVisibility(8);
            TextView textView3 = r8.A07;
            boolean A014 = A012.A01();
            int i5 = C0003R.string.direct_photo_no_longer_available;
            if (A014) {
                i5 = C0003R.string.direct_video_no_longer_available;
            }
            textView3.setText(i5);
            r8.A07.setVisibility(0);
        }
        C13300iJ r92 = r54.A06;
        C13300iJ r104 = A012.A09;
        if (r104 == null) {
            r8.A0J.setVisibility(8);
            r8.A09.setVisibility(8);
            r8.A08.setVisibility(8);
        } else {
            r8.A0J.setVisibility(0);
            r8.A0J.setSingleAvatarUrlAndVisibility(r104.ASv(), (String) null);
            r8.A09.setVisibility(0);
            r8.A09.setText(r104.AZn());
            r8.A08.setVisibility(0);
            int size = r62.A05.size();
            if (size == 1 && !r104.getId().equals(r92.getId())) {
                textView = r8.A08;
                string = fragmentActivity.getResources().getString(C0003R.string.direct_expiring_media_to_you);
            } else if (size > 1) {
                textView = r8.A08;
                string = fragmentActivity.getResources().getString(C0003R.string.direct_expiring_media_to_group, new Object[]{r62.A03});
            }
            textView.setText(string);
        }
        r8.A04.setVisibility(4);
        AnonymousClass9CN r55 = A012.A06;
        if (!(r55 == null || r55.A03 == null)) {
            z = true;
        }
        z = false;
        if (z || (l = A012.A0A) == null) {
            r8.A0A.setVisibility(8);
        } else {
            String A022 = C15960no.A02((double) l.longValue(), (double) (System.currentTimeMillis() / 1000));
            r8.A0A.setText(fragmentActivity.getResources().getString(C0003R.string.direct_story_from_archive, new Object[]{A022}));
            r8.A0A.setVisibility(0);
        }
        Long valueOf = Long.valueOf(A012.A04 / 1000000);
        r8.A0B.setText(C15960no.A08(fragmentActivity.getResources(), (double) valueOf.longValue(), Constants.ZERO, false, C29291Pi.MINUTES));
        directVisualMessageViewerController2.mPhotoTimerController.A02();
        C211839Bt r56 = directVisualMessageViewerController2.mVideoPlayer;
        C211799Bp r63 = directVisualMessageViewerController2.mContentHolder;
        if (r56.A05 && (r53 = r56.A03) != null && r63 == r53.A01) {
            z2 = true;
        }
        z2 = false;
        if (!z2) {
            C211839Bt r64 = directVisualMessageViewerController2.mVideoPlayer;
            if (r64.A05 && r64.A04 != null) {
                r64.A05 = false;
                AnonymousClass9CK r44 = r64.A03;
                if (r44 != null) {
                    r44.A01.A06.setVisibility(8);
                    r64.A03.A01.A0G.setVisibility(0);
                    r64.A03.A01.A0N.setProgress(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                r64.A04.A07("scroll", true);
                r64.A03 = null;
                r64.A00 = -1;
                r64.A01 = 0;
            }
        }
        if (!A012.A0N) {
            directVisualMessageViewerController2.mContentHolder.A06.setVisibility(4);
            C06220Of.A0T(directVisualMessageViewerController2.mReplyComposerContainer, 8);
            directVisualMessageViewerController2.mThreadsVvmUpsellFooterStubHolder.A02(8);
            directVisualMessageViewerController2.A02 = 4;
        } else {
            if (A0L(directVisualMessageViewerController2)) {
                C06220Of.A0T(directVisualMessageViewerController2.mReplyComposerContainer, 8);
                ((TextView) AnonymousClass1E1.A07(directVisualMessageViewerController2.mThreadsVvmUpsellFooterStubHolder.A01(), C0003R.C0005id.vvm_upsell_footer_textview)).setText(C0003R.string.threadsapp_vvm_upsell_footer_nux);
                directVisualMessageViewerController2.mThreadsVvmUpsellFooterStubHolder.A02(0);
            } else {
                directVisualMessageViewerController2.mThreadsVvmUpsellFooterStubHolder.A02(8);
                C06220Of.A0T(directVisualMessageViewerController2.mReplyComposerContainer, 0);
            }
            boolean z7 = false;
            if (A012.A08 == MediaType.PHOTO) {
                z7 = true;
            }
            if (z7) {
                directVisualMessageViewerController2.mPhotoTimerController.A04(A012, directVisualMessageViewerController2.mContentHolder.A0G, A012.A0B.longValue() * 1000, directVisualMessageViewerController2.A0O);
            } else if (A012.A01()) {
                C211839Bt r57 = directVisualMessageViewerController2.mVideoPlayer;
                C211799Bp r65 = directVisualMessageViewerController2.mContentHolder;
                if (r57.A05 && (r52 = r57.A03) != null && r65 == r52.A01) {
                    z3 = true;
                }
                z3 = false;
                if (z3) {
                    A0B(directVisualMessageViewerController2, directVisualMessageViewerController2.A0D, i2, A012);
                    C211839Bt r45 = directVisualMessageViewerController2.mVideoPlayer;
                    int i6 = r45.A00;
                    int i7 = -i6;
                    if (!(i6 <= 0 || (r5 = r45.A04) == null || r45.A03 == null)) {
                        r5.A02(Math.max(0, r5.A00() + i7), true);
                    }
                } else {
                    C211799Bp r58 = directVisualMessageViewerController2.mContentHolder;
                    if (!directVisualMessageViewerController2.A0O) {
                        i3 = 4;
                    }
                    r58.A06.setVisibility(i3);
                    directVisualMessageViewerController2.A0C.A02(directVisualMessageViewerController2.A0Z, new C211819Br(directVisualMessageViewerController2, i2), A012, A012.A0G, directVisualMessageViewerController2.A0I, directVisualMessageViewerController2.A0c);
                    if (!directVisualMessageViewerController2.A0O) {
                        directVisualMessageViewerController2.mContentHolder.A06.setVisibility(4);
                    }
                }
            }
        }
        AnonymousClass1F6.A00(directVisualMessageViewerController2.A0h).A0A(A012.A0D, directVisualMessageViewerController2.A0b.getModuleName());
        A02(directVisualMessageViewerController2);
        if (directVisualMessageViewerController2.A0T && !directVisualMessageViewerController2.A0P && !directVisualMessageViewerController2.A0n) {
            if (!directVisualMessageViewerController2.A0c.Abw() || i2 + 3 < directVisualMessageViewerController2.A0D.A00()) {
                C108744mM r3 = directVisualMessageViewerController2.A0D;
                if (i2 == r3.A01 - 1) {
                    AnonymousClass4XI.A00(directVisualMessageViewerController2.A0h).A03(directVisualMessageViewerController2.A0c, (C17920r1) null);
                    return;
                }
                int A003 = r3.A00();
                C108744mM r32 = directVisualMessageViewerController2.A0D;
                if (A003 >= r32.A01 || i2 + 3 < r32.A00()) {
                    return;
                }
            }
            directVisualMessageViewerController2.A0P = true;
            AnonymousClass4XI.A00(directVisualMessageViewerController2.A0h).A03(directVisualMessageViewerController2.A0c, directVisualMessageViewerController2.A07);
        }
    }

    public static void A06(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C211809Bq A012 = directVisualMessageViewerController.A0D.A01();
        if (directVisualMessageViewerController.A02 != 3 && A012.A0N) {
            C35201fy r1 = directVisualMessageViewerController.A09;
            if (r1 != null) {
                directVisualMessageViewerController.A08.A05(r1);
                directVisualMessageViewerController.A09 = null;
            }
            C249616t r12 = directVisualMessageViewerController.A0H;
            if (r12 != null) {
                directVisualMessageViewerController.A0G.A01(r12, -1);
                directVisualMessageViewerController.A0G.A00(directVisualMessageViewerController.A0H, -1);
                directVisualMessageViewerController.A0H = null;
            }
            AnonymousClass1NJ r3 = A012.A07;
            if (r3 != null) {
                directVisualMessageViewerController.A05.A03(directVisualMessageViewerController.A0Z, r3, Constants.A0C);
            }
            directVisualMessageViewerController.A02 = 3;
        }
    }

    public static void A07(DirectVisualMessageViewerController directVisualMessageViewerController) {
        float f;
        float f2;
        float centerX;
        float centerY;
        int i;
        if (directVisualMessageViewerController.mContentHolder != null) {
            RectF rectF = directVisualMessageViewerController.A0Y;
            if (rectF == null) {
                A0F(directVisualMessageViewerController, true);
                if (directVisualMessageViewerController.A0X == 1) {
                    i = directVisualMessageViewerController.mContentView.getHeight();
                } else {
                    i = -directVisualMessageViewerController.mContentView.getHeight();
                }
                C476524w A072 = C476624x.A07(directVisualMessageViewerController.mContentView);
                A072.A0N();
                C476524w A0T2 = A072.A0T(true);
                A0T2.A08 = 0;
                C476524w A0S2 = A0T2.A0S(C35031fh.A00);
                A0S2.A09 = new C211889Bz(directVisualMessageViewerController);
                A0S2.A0K((float) i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                A0S2.A0O();
                return;
            }
            AnonymousClass0a4.A06(rectF);
            C13300iJ r0 = directVisualMessageViewerController.A0D.A01().A09;
            if (r0 == null) {
                directVisualMessageViewerController.A0A.A04();
            } else {
                directVisualMessageViewerController.A0A.setUrl(r0.ASv());
            }
            A0F(directVisualMessageViewerController, true);
            if (directVisualMessageViewerController.A0o) {
                f = directVisualMessageViewerController.A0Y.width() / ((float) directVisualMessageViewerController.A04);
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            if (directVisualMessageViewerController.A0o) {
                f2 = directVisualMessageViewerController.A0Y.height() / ((float) directVisualMessageViewerController.A03);
            } else {
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            if (directVisualMessageViewerController.A0o) {
                centerX = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                centerX = directVisualMessageViewerController.A0Y.centerX();
            }
            if (directVisualMessageViewerController.A0o) {
                centerY = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                centerY = directVisualMessageViewerController.A0Y.centerY();
            }
            C476524w A073 = C476624x.A07(directVisualMessageViewerController.mContentView);
            A073.A0N();
            C476524w A0T3 = A073.A0T(true);
            A0T3.A08 = 0;
            C476524w A0S3 = A0T3.A0S(C35031fh.A00);
            A0S3.A09 = new C211889Bz(directVisualMessageViewerController);
            A0S3.A0L(f, 1.0f, centerX);
            A0S3.A0M(f2, 1.0f, centerY);
            if (directVisualMessageViewerController.A0o) {
                RectF rectF2 = directVisualMessageViewerController.A0Y;
                A0S3.A0J(rectF2.left, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                A0S3.A0K(rectF2.top, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                A0S3.A0A = new C1894187e(directVisualMessageViewerController, (RoundedCornerMediaFrameLayout) directVisualMessageViewerController.mItemView);
            }
            A0S3.A0O();
        }
    }

    public static void A08(DirectVisualMessageViewerController directVisualMessageViewerController, int i) {
        double d;
        double d2;
        C13390iS r8;
        long j;
        DirectVisualMessageViewerController directVisualMessageViewerController2 = directVisualMessageViewerController;
        C211809Bq A002 = A00(directVisualMessageViewerController2);
        String str = A002.A0I;
        C13300iJ r3 = A002.A09;
        if (A0J(directVisualMessageViewerController2)) {
            boolean z = false;
            if (A002.A08 == MediaType.PHOTO) {
                z = true;
            }
            if (z) {
                j = directVisualMessageViewerController2.mPhotoTimerController.A03;
            } else {
                j = directVisualMessageViewerController2.mVideoPlayer.A01;
            }
            d = ((double) j) / 1000.0d;
        } else {
            d = 0.0d;
        }
        if (d > 0.0d) {
            directVisualMessageViewerController2.A0B.A00 += d;
        }
        AnonymousClass0C1 r26 = directVisualMessageViewerController2.A0h;
        C27371Ho r21 = directVisualMessageViewerController2.A0I;
        String str2 = directVisualMessageViewerController2.A0l;
        MediaType mediaType = A002.A08;
        String AY5 = directVisualMessageViewerController2.A0c.AY5();
        String str3 = A002.A0D;
        C108744mM r2 = directVisualMessageViewerController2.A0D;
        int i2 = r2.A00;
        int A003 = r2.A00();
        boolean z2 = false;
        if (A002.A08 == MediaType.PHOTO) {
            z2 = true;
        }
        if (z2) {
            d2 = (double) directVisualMessageViewerController2.mPhotoTimerController.A01;
        } else {
            d2 = (double) directVisualMessageViewerController2.mVideoPlayer.A00;
        }
        double d3 = (double) directVisualMessageViewerController2.A00;
        String str4 = A002.A0J;
        boolean z3 = directVisualMessageViewerController2.A0n;
        if (r3 == null) {
            r8 = null;
        } else {
            r8 = r3.A0M;
        }
        double d4 = d;
        double max = Math.max(Math.min(d2, d2 * d3), 0.0d);
        double max2 = Math.max(Math.min(d2, d2 - max), 0.0d);
        AnonymousClass0P4 A004 = AnonymousClass0P4.A00("direct_story_playback_navigation", r21);
        A004.A0G("m_pk", AnonymousClass000.A0J(str3, "_", str));
        A004.A0G("viewer_session_id", str2);
        A004.A0E("m_t", Integer.valueOf(mediaType.A00));
        A004.A0E("action", Integer.valueOf(i));
        A004.A0E("source", 1);
        A004.A0G("thread_id", AY5);
        A004.A0E("reel_size", Integer.valueOf(A003));
        A004.A0E("reel_position", Integer.valueOf(i2));
        A004.A0C("time_elapsed", Double.valueOf(max / 1000.0d));
        A004.A0C("time_remaining", Double.valueOf(max2 / 1000.0d));
        A004.A0E("is_replay", Integer.valueOf(z3 ? 1 : 0));
        A004.A0G("reply_type", str4);
        A004.A0G(AnonymousClass0C5.$const$string(232), C13300iJ.A02(r8));
        if (d > 0.0d) {
            A004.A0C("pause_duration", Double.valueOf(d4));
        }
        AnonymousClass0WN.A01(r26).BcG(A004);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r3.A07() == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r9.A0b.isResumed() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3.A07() == false) goto L_0x0014;
     */
    public static void A09(DirectVisualMessageViewerController directVisualMessageViewerController, int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z5;
        if (!directVisualMessageViewerController.A0V) {
            directVisualMessageViewerController.A0V = true;
            C56202c6 r3 = directVisualMessageViewerController.A0M.A00;
            if (r3 != null) {
                z2 = true;
            }
            z2 = false;
            if (z2) {
                if (r3 != null) {
                    z5 = true;
                }
                z5 = false;
                if (z5) {
                    r3.A06(false);
                }
            }
            A06(directVisualMessageViewerController);
            A08(directVisualMessageViewerController, i);
            if (directVisualMessageViewerController.mContentHolder != null) {
                z3 = false;
            }
            z3 = true;
            if (z3) {
                directVisualMessageViewerController.A0Z.finish();
                return;
            }
            RectF rectF = directVisualMessageViewerController.A0Y;
            if (rectF == null) {
                A0F(directVisualMessageViewerController, true);
                int height = directVisualMessageViewerController.A0Z.getWindow().getDecorView().getHeight();
                C476524w A012 = directVisualMessageViewerController.A01();
                float f5 = (float) height;
                if (z) {
                    f5 = (float) (-height);
                }
                A012.A0E(f5);
                A012.A0O();
                return;
            }
            AnonymousClass0a4.A06(rectF);
            A0F(directVisualMessageViewerController, true);
            if ("inbox".equals(directVisualMessageViewerController.A0N) || (A00(directVisualMessageViewerController).A0G != null && A00(directVisualMessageViewerController).A0G.equals(directVisualMessageViewerController.A0j))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!directVisualMessageViewerController.A0o || !z4) {
                if (z4) {
                    f = directVisualMessageViewerController.A0Y.centerX();
                    f2 = directVisualMessageViewerController.A0Y.centerY();
                } else {
                    f = (float) (directVisualMessageViewerController.A04 >> 1);
                    f2 = (float) (directVisualMessageViewerController.A03 >> 1);
                }
                f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                f4 = directVisualMessageViewerController.A0Y.width() / ((float) directVisualMessageViewerController.A04);
                f3 = directVisualMessageViewerController.A0Y.height() / ((float) directVisualMessageViewerController.A03);
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            C476524w A013 = directVisualMessageViewerController.A01();
            A013.A0L(1.0f, f4, f);
            A013.A0M(1.0f, f3, f2);
            A013.A0O();
            if (directVisualMessageViewerController.A0o && z4) {
                RectF rectF2 = directVisualMessageViewerController.A0Y;
                A013.A0J(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, rectF2.left);
                A013.A0K(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, rectF2.top);
                A013.A0A = new C1894287f(directVisualMessageViewerController, (RoundedCornerMediaFrameLayout) directVisualMessageViewerController.mItemView);
            }
            A013.A0O();
            C476524w A072 = C476624x.A07(directVisualMessageViewerController.mRootView);
            A072.A0N();
            A072.A0L(directVisualMessageViewerController.mRootView.getScaleX(), 1.0f, -1.0f);
            A072.A0M(directVisualMessageViewerController.mRootView.getScaleY(), 1.0f, -1.0f);
            A072.A0E(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A072.A0T(true).A0S(C35031fh.A00).A0O();
            AnonymousClass9CR r4 = directVisualMessageViewerController.mReelViewerShadowAnimator;
            AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
            A002.A06 = true;
            A002.A05((double) r4.A00, true);
            A002.A07(new AnonymousClass9CC(r4));
            A002.A03(0.0d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r1 == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    public static void A0A(DirectVisualMessageViewerController directVisualMessageViewerController, C211809Bq r4) {
        boolean z;
        boolean z2;
        String str;
        C211839Bt r0 = directVisualMessageViewerController.mVideoPlayer;
        if (r0 != null) {
            C211829Bs r02 = r0.A04;
            if (r02 != null) {
                boolean A082 = r02.A08();
                z = true;
            }
            z = false;
            if (z && r4 != null) {
                C34561ew A032 = C65302ss.A03(r4.A0K);
                if (A032 != null) {
                    boolean z3 = A032.A0R;
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    C34561ew A033 = C65302ss.A03(r4.A0K);
                    if (A033 != null) {
                        str = A033.A0H;
                    } else {
                        str = null;
                    }
                    AnonymousClass5F9.A03(directVisualMessageViewerController.A0Z, str, 0);
                }
            }
        }
    }

    public static void A0B(DirectVisualMessageViewerController directVisualMessageViewerController, C108744mM r13, int i, C211809Bq r15) {
        C13390iS r0;
        View view;
        ViewGroup viewGroup;
        C58012fA AQ7;
        int i2 = i;
        if (i != directVisualMessageViewerController.A0D.A00 || directVisualMessageViewerController.A02 != 1) {
            return;
        }
        if (!directVisualMessageViewerController.A0O) {
            directVisualMessageViewerController.A0U = true;
            return;
        }
        String str = r15.A0G;
        AnonymousClass9C7 r4 = directVisualMessageViewerController.A0B;
        String str2 = r15.A0F;
        if (str2 != null && !r4.A0B.contains(str2)) {
            boolean z = false;
            if (r15.A08 == MediaType.PHOTO) {
                z = true;
            }
            if (z) {
                r4.A02++;
            } else {
                r4.A04++;
            }
            if (r15.A0Q) {
                r4.A05++;
            } else if (r15.A0P) {
                r4.A01++;
            } else {
                r4.A03++;
            }
            r4.A0B.add(str2);
        }
        if (str != null && !directVisualMessageViewerController.A0m.contains(str) && (AQ7 = directVisualMessageViewerController.A0d.AQ7(directVisualMessageViewerController.A0c.AOO(), str)) != null && (!r15.A0P || AQ7.A0g(directVisualMessageViewerController.A0h.A06))) {
            directVisualMessageViewerController.A0m.add(str);
            directVisualMessageViewerController.A0d.BtS(directVisualMessageViewerController.A0c.AOO(), str, directVisualMessageViewerController.A0k, directVisualMessageViewerController.A0n);
            if (!directVisualMessageViewerController.A0n) {
                AnonymousClass0C1 r6 = directVisualMessageViewerController.A0h;
                C17390qA.A00(r6).A0E(new C20800vh(AnonymousClass3JW.A00(r6, C20800vh.class, (String) null), new AnonymousClass3JR(directVisualMessageViewerController.A0c.AOO().A00, AQ7.A0H(), AQ7.A0G())));
            } else {
                AnonymousClass0C1 r62 = directVisualMessageViewerController.A0h;
                C108744mM r02 = directVisualMessageViewerController.A0D;
                String str3 = r02.A02;
                String str4 = r02.A01().A0D;
                String str5 = directVisualMessageViewerController.A0D.A01().A0C;
                C15890nh r2 = new C15890nh(r62);
                r2.A0G = true;
                r2.A09 = Constants.ONE;
                r2.A0E("direct_v2/visual_threads/%s/item_replayed/", str3);
                r2.A09("item_ids", AnonymousClass000.A0J("[", str4, "]"));
                r2.A0A(AnonymousClass0C5.$const$string(370), str5);
                r2.A06(AnonymousClass1N4.class, false);
                C12810hQ.A02(r2.A03());
            }
        }
        String str6 = r15.A0F;
        AnonymousClass9C2 r7 = new AnonymousClass9C2(str6);
        C13300iJ r1 = r15.A09;
        r7.A05 = str6;
        r7.A00 = r15.A08;
        r7.A07 = directVisualMessageViewerController.A0l;
        r7.A03 = Integer.valueOf(i);
        r7.A04 = Integer.valueOf(r13.A00());
        r7.A06 = r13.A02;
        r7.A02 = Boolean.valueOf(directVisualMessageViewerController.A0n);
        if (r1 != null) {
            r0 = r1.A0M;
        } else {
            r0 = C13390iS.FollowStatusUnknown;
        }
        r7.A01 = r0;
        r7.A08 = r15.A0J;
        directVisualMessageViewerController.A0H = r7;
        directVisualMessageViewerController.A0G.A02(r7, i2, -1, (C06270Ok) null, true);
        directVisualMessageViewerController.A0G.A03(directVisualMessageViewerController.A0H, i, C39351mm.A02);
        directVisualMessageViewerController.A0U = false;
        directVisualMessageViewerController.A02 = 2;
        C34151eA A002 = C65382t0.A00(r15.A0K, C34181eD.POLLING);
        if (A002 != null) {
            AnonymousClass9CF r42 = directVisualMessageViewerController.A0L;
            C34261eN A062 = A002.A06();
            boolean z2 = false;
            if (A062 != null && A062.A07 && A062.A00 == null) {
                if (!r42.A05.equals("direct_surface")) {
                    throw new IllegalStateException("surface not implemented");
                } else if (!C16180oA.A00(r42.A04).A00.getBoolean(AnonymousClass40t.$const$string(241), false) && C16180oA.A00(r42.A04).A00.getInt("direct_poll_tooltip_impression_count", 0) < 2) {
                    z2 = true;
                }
            }
            if (z2) {
                AnonymousClass9CF r43 = directVisualMessageViewerController.A0L;
                C34851fP r3 = directVisualMessageViewerController.mContentHolder.A0I;
                C13300iJ r22 = r15.A09;
                if (!(r43.A02 != null || r22 == null || (viewGroup = r3.A05) == null)) {
                    C211849Bu r03 = new C211849Bu(r43, r22, r3);
                    r43.A02 = r03;
                    viewGroup.post(r03);
                }
            }
        }
        C34151eA A003 = C65382t0.A00(r15.A0K, C34181eD.EVENT);
        if (A003 != null) {
            AnonymousClass9CM r44 = directVisualMessageViewerController.A0J;
            EventStickerModel eventStickerModel = A003.A0N;
            boolean z3 = false;
            if (eventStickerModel != null && eventStickerModel.A03 == C123005Pd.INVITED) {
                C13300iJ r04 = eventStickerModel.A04;
                C13300iJ r12 = r04;
                if ((r04 == null || !C14090jk.A05(r44.A03, r12)) && !C16180oA.A00(r44.A03).A00.getBoolean(AnonymousClass40t.$const$string(240), false) && C16180oA.A00(r44.A03).A00.getInt("direct_plan_tooltip_impression_count", 0) < 3) {
                    z3 = true;
                }
            }
            if (z3) {
                AnonymousClass9CM r32 = directVisualMessageViewerController.A0J;
                C34811fL r23 = directVisualMessageViewerController.mContentHolder.A0K;
                if (r32.A01 == null && (view = r23.A00) != null) {
                    C211869Bx r05 = new C211869Bx(r32, r23);
                    r32.A01 = r05;
                    view.post(r05);
                }
            }
        }
    }

    public static void A0C(DirectVisualMessageViewerController directVisualMessageViewerController, String str) {
        C211829Bs r2;
        C211839Bt r3 = directVisualMessageViewerController.mVideoPlayer;
        if (!(r3.A06 || (r2 = r3.A04) == null || r3.A03 == null)) {
            r3.A06 = true;
            r3.A02 = System.currentTimeMillis();
            r2.A03(str);
        }
        directVisualMessageViewerController.mPhotoTimerController.A00();
    }

    public static void A0E(DirectVisualMessageViewerController directVisualMessageViewerController, String str, String str2) {
        C18980sj r1 = C18980sj.A00;
        if (r1 == null || r1.A00() == null) {
            AnonymousClass0QD.A01("DirectVisualMessageViewerFragment", "Profile plugin/fragment factory unavailable");
            return;
        }
        directVisualMessageViewerController.A0Q = true;
        AnonymousClass0C1 r3 = directVisualMessageViewerController.A0h;
        new C59032gv(r3, ModalActivity.class, "profile", r1.A00().A00(C52902Qq.A01(r3, str, str2, directVisualMessageViewerController.A0I.getModuleName()).A03()), directVisualMessageViewerController.A0Z).A06(directVisualMessageViewerController.A0Z);
    }

    public static void A0F(DirectVisualMessageViewerController directVisualMessageViewerController, boolean z) {
        CircularImageView circularImageView = directVisualMessageViewerController.A0A;
        if (circularImageView != null && directVisualMessageViewerController.mContentView != null) {
            int i = 0;
            if (z) {
                i = 2;
            }
            circularImageView.setLayerType(i, (Paint) null);
            directVisualMessageViewerController.mContentView.setLayerType(i, (Paint) null);
        }
    }

    public static void A0H(DirectVisualMessageViewerController directVisualMessageViewerController, boolean z) {
        if (directVisualMessageViewerController.A0W != z) {
            directVisualMessageViewerController.A0W = z;
            C211799Bp r0 = directVisualMessageViewerController.mContentHolder;
            if (r0 != null) {
                C34581ey.A05(r0.A04, z);
            }
        }
    }

    private boolean A0I(C211809Bq r5, C13300iJ r6) {
        C58012fA AQ7;
        if (r5.A0G == null) {
            AQ7 = this.A0d.AQ6(this.A0c.AOO(), C58022fB.EXPIRING_MEDIA, r5.A0C);
        } else {
            AQ7 = this.A0d.AQ7(this.A0c.AOO(), r5.A0G);
        }
        if (AQ7 == null) {
            return false;
        }
        if (!AQ7.A0T() || AQ7.A0g(r6)) {
            return true;
        }
        return false;
    }

    public static boolean A0K(DirectVisualMessageViewerController directVisualMessageViewerController) {
        String str;
        DirectVisualMessageViewerController directVisualMessageViewerController2 = directVisualMessageViewerController;
        String trim = directVisualMessageViewerController2.mComposerEditText.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return false;
        }
        C99424Rp r7 = null;
        AnonymousClass0L7 r10 = AnonymousClass0L7.DIRECT_QUOTED_REPLY_LAUNCHER;
        if (AnonymousClass42H.A00(new C05000Hl(AnonymousClass0C5.$const$string(33), r10, false, (String[]) null, (AnonymousClass04H) null), new C05000Hl("kill_switch", r10, true, (String[]) null, (AnonymousClass04H) null), directVisualMessageViewerController2.A0h).booleanValue()) {
            C108744mM r1 = directVisualMessageViewerController2.A0D;
            AnonymousClass0a4.A06(r1);
            C211809Bq A012 = r1.A01();
            if (!(A012 == null || (str = A012.A0G) == null)) {
                C97524Jk r5 = new C97524Jk(str, A012.A0C, C58022fB.EXPIRING_MEDIA, A012.A0I, "visual_media_viewer");
                AnonymousClass1NJ r11 = A012.A07;
                C55432ad r12 = A012.A01;
                String str2 = A012.A0J;
                int i = A012.A00;
                r5.A02 = C58032fC.A00(r11, r12, str2, i, Integer.valueOf(i), A012.A02);
                r7 = new C99424Rp(r5);
                C97534Jl r2 = new C97534Jl(directVisualMessageViewerController2.A0p.A02(AnonymousClass40t.$const$string(216)));
                r2.A08("action", "visual_media_viewer");
                r2.A01();
            }
        }
        C104594fU.A00(directVisualMessageViewerController2.A0h).A08(directVisualMessageViewerController2.A0c.AOO(), trim, "toast", directVisualMessageViewerController2.A0c.Afp(), r7, (String) null);
        directVisualMessageViewerController2.mComposerEditText.setText("");
        directVisualMessageViewerController2.mComposerEditText.clearFocus();
        C06220Of.A0E(directVisualMessageViewerController2.mComposerEditText);
        return true;
    }

    public static boolean A0L(DirectVisualMessageViewerController directVisualMessageViewerController) {
        C108744mM r0 = directVisualMessageViewerController.A0D;
        if (r0 == null || r0.A01() == null || directVisualMessageViewerController.A0D.A01().A07 == null || !directVisualMessageViewerController.A0D.A01().A07.A1S() || C06080Nr.A09(directVisualMessageViewerController.A0Z) || !((Boolean) AnonymousClass0L6.A02(directVisualMessageViewerController.A0h, AnonymousClass0L7.THREADS_ANDROID_SHOW_VVM_UPSELL, "should_show_in_direct_vmviewer", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final void A0M() {
        String str;
        AnonymousClass9C7 r3 = this.A0B;
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("direct_story_session_summary", this.A0I);
        A002.A0G("viewer_session_id", r3.A0A);
        A002.A0E("photos_consumed", Integer.valueOf(r3.A02));
        A002.A0E("videos_consumed", Integer.valueOf(r3.A04));
        A002.A0I("reel_session_consumption_list", r3.A0B);
        if (r3.A0C) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A002.A0G("is_replay", str);
        A002.A0G("thread_id", r3.A09);
        A002.A0E("reel_size", Integer.valueOf(r3.A06));
        A002.A0C("time_elapsed", Double.valueOf(((double) (SystemClock.elapsedRealtime() - r3.A07)) / 1000.0d));
        A002.A0E("one_view_consumed", Integer.valueOf(r3.A05));
        A002.A0E("replayable_consumed", Integer.valueOf(r3.A03));
        A002.A0E("permanent_consumed", Integer.valueOf(r3.A01));
        A002.A0C("pause_duration", Double.valueOf(r3.A00));
        AnonymousClass0WN.A01(r3.A08).BcG(A002);
        A0C(this, "fragment_paused");
        C35201fy r1 = this.A09;
        if (r1 != null) {
            this.A08.A05(r1);
            this.A09 = null;
        }
        this.A08.A03();
        this.A0C.A01();
        C23300zv A003 = C23300zv.A00(this.A0h);
        A003.A03(AnonymousClass9CU.class, this.A0q);
        A003.A03(C33211cY.class, this.A0r);
        this.mKeyboardHeightChangeDetector.BP6();
        this.A0K.A04(false, true);
        this.mComposerEditText.removeTextChangedListener(this.mComposerTextWatcher);
        this.mComposerEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        if (!this.A0Q) {
            boolean z = true;
            if (this.A0X == 1) {
                z = false;
            }
            A09(this, 9, z);
        }
        this.A0M.A01 = null;
        this.A0L.A00 = null;
        this.A0J.A00 = null;
        AnonymousClass1F6.A00(this.A0h).A07(this.A0b.getModuleName());
        AnonymousClass1F6.A00(this.A0h).A06(this.A0b.getModuleName());
        AnonymousClass1F6.A00(this.A0h).A04();
    }

    public final void A0O() {
        AnonymousClass0PB.A03(this.A0Z.getWindow());
        FragmentActivity fragmentActivity = this.A0Z;
        C108744mM r2 = this.A0D;
        boolean z = this.A0n;
        C27371Ho r4 = this.A0I;
        String str = this.A0l;
        AnonymousClass0C1 r6 = this.A0h;
        this.mVideoPlayer = new C211839Bt(fragmentActivity, this, new AnonymousClass8iE(r2, z, r4, str, r6), r6, this.A0b.getModuleName());
        this.mPhotoTimerController = new C72133Du(this);
        this.mRootView = this.mViewerContainer.findViewById(C0003R.C0005id.direct_visual_message_viewer_root_container);
        this.mContentView = this.mViewerContainer.findViewById(C0003R.C0005id.direct_expiring_media_viewer_content);
        View findViewById = this.mViewerContainer.findViewById(C0003R.C0005id.direct_expiring_media_viewer_container);
        this.mItemView = findViewById;
        ViewStub viewStub = (ViewStub) AnonymousClass1E1.A07(this.mViewerContainer, C0003R.C0005id.direct_media_view_stub);
        viewStub.setLayoutResource(C0003R.layout.layout_media);
        FrameLayout frameLayout = (FrameLayout) viewStub.inflate();
        frameLayout.removeAllViews();
        ViewGroup viewGroup = (ViewGroup) findViewById;
        viewGroup.addView((ViewStub) AnonymousClass1E1.A07(frameLayout, C0003R.C0005id.direct_event_sticker_stub), 0);
        viewGroup.addView((ViewStub) AnonymousClass1E1.A07(frameLayout, C0003R.C0005id.direct_poll_stub), 0);
        viewGroup.addView((ViewStub) AnonymousClass1E1.A07(frameLayout, C0003R.C0005id.direct_music_sticker_stub), 0);
        viewGroup.addView((IgProgressImageView) AnonymousClass1E1.A07(frameLayout, C0003R.C0005id.viewer_image_view), 0);
        viewGroup.addView((ScalingTextureView) AnonymousClass1E1.A07(frameLayout, C0003R.C0005id.viewer_texture_view), 0);
        this.mViewerInfoContainer = this.mContentView.findViewById(C0003R.C0005id.viewer_info_header);
        this.mProgressBar = (SegmentedProgressBar) this.mViewerContainer.findViewById(C0003R.C0005id.reel_viewer_progress_bar);
        this.A0A = (CircularImageView) this.mViewerContainer.findViewById(C0003R.C0005id.profile_transition_view);
        C211799Bp r3 = new C211799Bp(this.A0Z, this.mContentView, this.A0h);
        this.mContentHolder = r3;
        this.mContentView.setTag(r3);
        this.mVolumeIndicator = (VolumeIndicator) this.mViewerContainer.findViewById(C0003R.C0005id.direct_expiring_media_viewer_volume_indicator);
        this.A0B = new AnonymousClass9C7(this.A0h, this.A0l, this.A0n, this.A0c.AY5());
        this.A0C = new AnonymousClass31U(this.A0h);
        this.mThreadsVvmUpsellFooterStubHolder = new C26571Ea((ViewStub) AnonymousClass1E1.A07(this.mViewerContainer, C0003R.C0005id.threads_vvm_upsell_footer_stub));
        View findViewById2 = this.mViewerContainer.findViewById(C0003R.C0005id.direct_visual_message_viewer_composer);
        this.mReplyComposerContainer = findViewById2;
        this.mComposerEditText = (EditText) findViewById2.findViewById(C0003R.C0005id.direct_expiring_media_viewer_composer_edit_text);
        this.mBackgroundDimmer = this.mViewerContainer.findViewById(C0003R.C0005id.background_dimmer);
        this.mComposerEditText.setOnEditorActionListener(new AnonymousClass9CO(this));
        View findViewById3 = this.mReplyComposerContainer.findViewById(C0003R.C0005id.direct_expiring_media_viewer_composer_camera_button);
        if (this.A0v) {
            findViewById3.setVisibility(0);
            findViewById3.setOnClickListener(new AnonymousClass48B(this, findViewById3));
        } else {
            findViewById3.setVisibility(8);
        }
        View findViewById4 = this.mReplyComposerContainer.findViewById(C0003R.C0005id.direct_expiring_media_text_send_button);
        this.mTextSendButton = findViewById4;
        findViewById4.setOnClickListener(new AnonymousClass9CP(this));
        this.mComposerTextWatcher = new AnonymousClass9C9(this);
        C27511Id A002 = C27491Ib.A00(this.A0Z);
        this.mKeyboardHeightChangeDetector = A002;
        A002.A3j(this);
        this.mSparklerAnimationStubHolder = new C26571Ea((ViewStub) this.mViewerContainer.findViewById(C0003R.C0005id.direct_expiring_media_view_once_pause_sparkler_stub));
        this.mBlurImageViewContainerStubHolder = new C26571Ea((ViewStub) this.mViewerContainer.findViewById(C0003R.C0005id.direct_expiring_media_blur_image_stub));
        AnonymousClass0C1 r22 = this.A0h;
        C27341Hl r5 = this.A0b;
        this.A0K = new AnonymousClass3EF(this.A0Z, r22, this.mItemView, this.A0f, r5, AnonymousClass0QT.A00(r22, r5), this.A0g, AnonymousClass1OY.UNKNOWN);
        if (this.A0D.A01 > 0 && this.mContentHolder != null) {
            this.mContentView.setVisibility(4);
            C211809Bq A012 = this.A0D.A01();
            this.mContentHolder.A0G.A04(C0003R.C0005id.direct_visual_message_viewer_fragment_image_view_id);
            if (!A012.A0N) {
                A07(this);
            } else {
                this.mContentHolder.A0G.A05(C0003R.C0005id.direct_visual_message_viewer_fragment_image_view_id, new AnonymousClass9CE(this));
            }
            A05(this);
        }
    }

    public final void B0C() {
        A0D(this, "resume");
    }

    public final /* bridge */ /* synthetic */ void BGO(Object obj) {
        this.mProgressBar.setProgress(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final /* bridge */ /* synthetic */ void BGU(Object obj, float f) {
        this.mProgressBar.setProgress(f);
        this.A00 = f;
    }

    public final boolean onBackPressed() {
        boolean z = true;
        if (this.A0X == 1) {
            z = false;
        }
        A09(this, 8, z);
        return true;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z;
        C211829Bs r1 = this.mVideoPlayer.A04;
        if (r1 != null) {
            C12670hC.A02();
            AnonymousClass11J.A02(!r1.A03);
            C211859Bv r4 = r1.A05;
            boolean z2 = false;
            if (r4.A00 == null || r4.A01 == null || keyEvent.getAction() != 0 || !(i == 25 || i == 24)) {
                z = false;
            } else {
                r4.A02 = true;
                int i2 = -1;
                if (i == 24) {
                    i2 = 1;
                }
                r4.A03.adjustStreamVolume(3, i2, 8);
                int streamVolume = r4.A03.getStreamVolume(3);
                C211899Ca r2 = r4.A04;
                r2.A00.A04.BVc(streamVolume, r4.A03.getStreamMaxVolume(3));
                if (streamVolume > 0) {
                    z2 = true;
                }
                if (r4.A01.A01) {
                    if (!z2) {
                        C17600qV.A01.A00(false);
                        r4.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, i);
                        r4.A03.abandonAudioFocus(r4);
                    }
                } else if (z2) {
                    r4.A01(i);
                }
                z = true;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public DirectVisualMessageViewerController(AnonymousClass0C1 r2, C27341Hl r3, FragmentActivity fragmentActivity, AnonymousClass2M0 r5, ReelViewerConfig reelViewerConfig, C65882uZ r7, C66112uw r8, String str, String str2, String str3, String str4, String str5, C27371Ho r14, RectF rectF, int i, boolean z, boolean z2, boolean z3) {
        this.A0h = r2;
        this.A0b = r3;
        this.A0Z = fragmentActivity;
        this.A0e = r5;
        this.A0f = reelViewerConfig;
        this.A0d = r7;
        this.A0c = r8;
        this.A0i = str;
        this.A0k = str2;
        this.A0j = str3;
        this.A0l = str4;
        this.A0N = str5;
        this.A0I = r14;
        this.A0Y = rectF;
        this.A0X = i;
        this.A0n = z;
        this.A0o = z2;
        this.A0v = z3;
        this.A0g = new C1893987c(this);
        this.A0s = new C211919Cc(this);
        this.A0t = new C122995Pc(this);
        this.A0u = new AnonymousClass89W(this);
        this.A0p = AnonymousClass0QT.A00(r2, r14);
    }

    public static void A0D(DirectVisualMessageViewerController directVisualMessageViewerController, String str) {
        C211829Bs r6;
        boolean z = false;
        if (A00(directVisualMessageViewerController).A08 == MediaType.PHOTO) {
            z = true;
        }
        if (z) {
            directVisualMessageViewerController.mPhotoTimerController.A01();
        } else if (A00(directVisualMessageViewerController).A01()) {
            C211839Bt r7 = directVisualMessageViewerController.mVideoPlayer;
            if (r7.A05 && r7.A06 && (r6 = r7.A04) != null) {
                r7.A06 = false;
                r7.A01 += System.currentTimeMillis() - r7.A02;
                r6.A05(str);
            }
        }
        A04(directVisualMessageViewerController);
    }

    public static boolean A0J(DirectVisualMessageViewerController directVisualMessageViewerController) {
        if (!(!A00(directVisualMessageViewerController).A0Q) || directVisualMessageViewerController.mBackgroundDimmer.getVisibility() == 0) {
            return false;
        }
        return true;
    }

    public final void B1w(boolean z, String str) {
        AnonymousClass1NJ r0;
        CreativeConfig creativeConfig;
        C211809Bq A002 = A00(this);
        if (A002 != null && (r0 = A002.A07) != null && (creativeConfig = r0.A0M) != null) {
            creativeConfig.A01(z);
            this.A06.Bt3(str, z ? 1 : 0);
        }
    }

    public final void B75(Object obj) {
    }

    public final void B76(Object obj) {
    }

    public final void B77(Object obj) {
    }
}
