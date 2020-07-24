package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.p008ui.views.ReelAvatarWithBadgeView;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.1dx  reason: invalid class name and case insensitive filesystem */
public final class C34071dx implements AnonymousClass1E8 {
    public static final Map A0w;
    public int A00 = -1;
    public int A01;
    public RectF A02;
    public RectF A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public AnonymousClass1EG A09;
    public Reel A0A;
    public C39941no A0B;
    public ReelViewerConfig A0C = ReelViewerConfig.A00();
    public AnonymousClass1OY A0D;
    public AnonymousClass309 A0E;
    public AnonymousClass309 A0F;
    public C64962sK A0G;
    public C35591gc A0H;
    public C66832w7 A0I;
    public C34421ei A0J;
    public C65132sb A0K;
    public C65122sa A0L;
    public Integer A0M = Constants.A0j;
    public Set A0N;
    public boolean A0O;
    public boolean A0P;
    public float A0Q;
    public float A0R;
    public float A0S;
    public float A0T = 1.0f;
    public int A0U = -1;
    public RectF A0V;
    public View A0W;
    public View A0X;
    public View A0Y;
    public Reel A0Z;
    public AnonymousClass30C A0a;
    public C66832w7 A0b;
    public C65132sb A0c;
    public C65122sa A0d;
    public boolean A0e;
    public final int A0f;
    public final int A0g;
    public final Activity A0h;
    public final Context A0i;
    public final View A0j;
    public final ViewGroup A0k;
    public final ViewGroup A0l;
    public final ReelAvatarWithBadgeView A0m;
    public final C34081e0 A0n;
    public final AnonymousClass0C1 A0o;
    public final C13300iJ A0p;
    public final String A0q;
    public final int A0r;
    public final int A0s;
    public final Resources A0t;
    public final View A0u;
    public final C34421ei A0v;

    public final void BOI(AnonymousClass1EG r1) {
    }

    static {
        C13530ig r1 = new C13530ig();
        r1.A01(64);
        r1.A03(MapMakerInternalMap.Strength.A02);
        A0w = r1.A00();
    }

    private int A00(AnonymousClass1WG r6) {
        int i;
        Reel reel;
        Reel reel2 = this.A0Z;
        if (reel2 != null) {
            i = r6.Ad3(reel2);
        } else {
            Reel reel3 = this.A0A;
            if (reel3 != null) {
                i = r6.Ad4(reel3, this.A0B);
            } else {
                i = -1;
            }
        }
        if (i == -1 && (reel = this.A0A) != null) {
            AnonymousClass0C1 r2 = this.A0o;
            if (r2.A06.equals(reel.A0F())) {
                for (Reel Ad3 : C250016x.A01(r2).A05()) {
                    int Ad32 = r6.Ad3(Ad3);
                    if (Ad32 != -1) {
                        return Ad32;
                    }
                }
            }
        }
        return i;
    }

    private View A01() {
        if (this.A0X == null) {
            View A002 = C72713Gp.A00(this.A0i, this.A0l, new AnonymousClass88Y(), (AnonymousClass1PD) null, (C38631la) null);
            this.A0X = A002;
            A002.setBackgroundColor(-16777216);
        }
        return this.A0X;
    }

    private View A02() {
        if (this.A0W == null) {
            View A002 = C158256pK.A00(this.A0i, this.A0l, C52332Oj.A00, (AnonymousClass1PD) null, (C38631la) null, this.A0o);
            this.A0W = A002;
            A002.setBackgroundColor(-16777216);
        }
        return this.A0W;
    }

    private View A03() {
        if (this.A0Y == null) {
            View A002 = C158256pK.A00(this.A0i, this.A0l, C52332Oj.A00, (AnonymousClass1PD) null, (C38631la) null, this.A0o);
            this.A0Y = A002;
            A002.setBackgroundColor(-16777216);
        }
        return this.A0Y;
    }

    private View A04() {
        Reel reel = this.A0A;
        if (reel != null && reel.A0W()) {
            return A01();
        }
        if (reel != null && reel.A0X()) {
            return A02();
        }
        if (reel != null && reel.Aho()) {
            if (this.A07 == null) {
                View A002 = C66362vM.A00(this.A0o, this.A0l, (AnonymousClass1PD) null, (C38631la) null);
                this.A07 = A002;
                A002.setBackgroundColor(-16777216);
            }
            return this.A07;
        } else if (reel == null || !reel.A0c()) {
            return this.A0u;
        } else {
            if (this.A04 == null) {
                View A003 = AnonymousClass9FY.A00(this.A0l, (AnonymousClass1PD) null, (C38631la) null, this.A0o);
                this.A04 = A003;
                A003.setBackgroundColor(-16777216);
            }
            return this.A04;
        }
    }

    private View A05() {
        Reel reel = this.A0A;
        if (reel != null && reel.A0X()) {
            return A03();
        }
        if (reel != null && reel.Aho()) {
            if (this.A08 == null) {
                this.A08 = C66362vM.A00(this.A0o, this.A0l, (AnonymousClass1PD) null, (C38631la) null);
            }
            return this.A08;
        } else if (reel == null || !reel.A0c()) {
            if (this.A06 == null) {
                this.A06 = C34081e0.A00(this.A0i, this.A0l, (AnonymousClass1PD) null, (C38631la) null, this.A0o);
            }
            return this.A06;
        } else {
            if (this.A05 == null) {
                this.A05 = AnonymousClass9FY.A00(this.A0l, (AnonymousClass1PD) null, (C38631la) null, this.A0o);
            }
            return this.A05;
        }
    }

    private View A06() {
        Reel reel = this.A0A;
        if (reel.A0W()) {
            C72723Gt r1 = A08().A0L;
            C941045d r0 = r1.A01;
            if (r0 == null || r0.A00.getVisibility() != 0) {
                return r1.A08;
            }
            return r1.A01.A00;
        } else if (reel.A0X()) {
            return A09().A0R;
        } else {
            if (reel.Aho()) {
                return A0D().A0I;
            }
            return this.A0v.A0h;
        }
    }

    private AnonymousClass30C A08() {
        if (this.A0a == null) {
            this.A0a = (AnonymousClass30C) A01().getTag();
        }
        return this.A0a;
    }

    private C66832w7 A09() {
        if (this.A0b == null) {
            this.A0b = (C66832w7) A02().getTag();
        }
        return this.A0b;
    }

    private C34421ei A0A() {
        if (this.A0J == null) {
            if (this.A06 == null) {
                this.A06 = C34081e0.A00(this.A0i, this.A0l, (AnonymousClass1PD) null, (C38631la) null, this.A0o);
            }
            this.A0J = (C34421ei) this.A06.getTag();
        }
        return this.A0J;
    }

    private C65132sb A0B() {
        if (this.A0c == null) {
            if (this.A04 == null) {
                View A002 = AnonymousClass9FY.A00(this.A0l, (AnonymousClass1PD) null, (C38631la) null, this.A0o);
                this.A04 = A002;
                A002.setBackgroundColor(-16777216);
            }
            this.A0c = (C65132sb) this.A04.getTag();
        }
        return this.A0c;
    }

    private C65132sb A0C() {
        if (this.A0K == null) {
            if (this.A05 == null) {
                this.A05 = AnonymousClass9FY.A00(this.A0l, (AnonymousClass1PD) null, (C38631la) null, this.A0o);
            }
            this.A0K = (C65132sb) this.A05.getTag();
        }
        return this.A0K;
    }

    private C65122sa A0D() {
        if (this.A0d == null) {
            if (this.A07 == null) {
                View A002 = C66362vM.A00(this.A0o, this.A0l, (AnonymousClass1PD) null, (C38631la) null);
                this.A07 = A002;
                A002.setBackgroundColor(-16777216);
            }
            this.A0d = (C65122sa) this.A07.getTag();
        }
        return this.A0d;
    }

    private C65122sa A0E() {
        if (this.A0L == null) {
            if (this.A08 == null) {
                this.A08 = C66362vM.A00(this.A0o, this.A0l, (AnonymousClass1PD) null, (C38631la) null);
            }
            this.A0L = (C65122sa) this.A08.getTag();
        }
        return this.A0L;
    }

    private void A0F() {
        A0K(this.A0Y);
        A0K(this.A06);
        A0K(this.A08);
        A0K(this.A05);
    }

    private void A0G() {
        Reel reel = this.A0A;
        if (reel != null && reel.A0W()) {
            AnonymousClass30C A082 = A08();
            A082.A0L.A00();
            A082.A07 = null;
            A082.A09 = null;
            A082.A08 = null;
            A082.A0K.A05.A04();
            A082.A0F.A04();
            TextView textView = A082.A06;
            if (textView != null) {
                textView.setText("");
            }
        } else if (reel != null && reel.A0X()) {
            A09().A0P();
        } else if (reel != null && reel.Aho()) {
            A0D().A0O();
        } else if (reel == null || !reel.A0c()) {
            this.A0v.A0O();
        } else {
            C65132sb A0B2 = A0B();
            A0B2.A0A = null;
            A0B2.A0C = null;
            A0B2.A0R.setProgress(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0B2.A0B = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0145, code lost:
        if (r6 == p000X.Constants.A0N) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    private void A0H(float f) {
        float A002;
        RectF rectF;
        boolean z;
        boolean z2;
        C64982sM r2;
        C64982sM r22;
        float f2 = f;
        double d = (double) f2;
        float A012 = (float) C27181Gu.A01(d, 0.0d, 1.0d, (double) ((this.A03.width() * 1.0f) / ((float) this.A0k.getWidth())), (double) this.A0Q);
        if (Float.isNaN(A012)) {
            A002 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            A002 = (float) C27181Gu.A00((double) A012, 0.0d, 2.0d);
        }
        float centerX = this.A03.centerX();
        float centerY = (this.A03.centerY() - (((float) this.A01) / 2.0f)) - this.A0l.getTranslationY();
        float A013 = (float) C27181Gu.A01(d, 0.0d, 1.0d, (double) (centerX - (((float) this.A0k.getWidth()) / 2.0f)), (double) this.A0R);
        float A014 = (float) C27181Gu.A01(d, 0.0d, 1.0d, (double) centerY, (double) this.A0S);
        float f3 = this.A0T;
        float f4 = f3 + (f * (1.0f - f3));
        if (this.A0M == Constants.A0Y && A0Q(this.A0D, this.A0A)) {
            Reel reel = this.A0A;
            if (reel == null || !reel.A0X()) {
                z2 = false;
                if (reel == null || !reel.A0W()) {
                    if (reel == null || !reel.Aho()) {
                        if (reel == null || !reel.A0c()) {
                            if (A0A().A06 != null) {
                                r2 = A0A().A06;
                            }
                        } else if (A0C().A0C != null) {
                            r2 = A0C().A0C;
                        }
                        if (r2.A0O) {
                            z2 = true;
                        }
                    } else {
                        r22 = A0E().A04;
                    }
                }
                if (z2) {
                    float f5 = (1.0f - f) * this.A0T;
                    View A052 = A05();
                    A052.setScaleX(A002);
                    A052.setScaleY(A002);
                    A052.setTranslationX(A013);
                    A052.setTranslationY(A014);
                    A052.setAlpha(f5);
                    f4 = f2;
                }
            } else {
                if (this.A0I == null) {
                    this.A0I = (C66832w7) A03().getTag();
                }
                r22 = this.A0I.A03;
            }
            z2 = r22.A0O;
            if (z2) {
            }
        }
        A0I(A002, A013, A014, f4);
        this.A0l.setBackgroundColor(AnonymousClass0OW.A08(0, this.A0U, f2));
        C35591gc r23 = this.A0H;
        if (r23 != null) {
            r23.AbC(f2);
        }
        if (!(this.A02 == null || (rectF = this.A0V) == null)) {
            float A015 = ((float) C27181Gu.A01(d, 0.0d, 1.0d, (double) this.A02.width(), (double) (((float) ((int) rectF.width())) * this.A0Q))) / ((float) this.A0m.getLayoutParams().width);
            if (Float.isNaN(A015)) {
                A015 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            this.A0m.setScaleX(A015);
            this.A0m.setScaleY(A015);
            ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0m;
            float f6 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            reelAvatarWithBadgeView.setPivotX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0m.setPivotY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0m.setTranslationX((float) C27181Gu.A01(d, 0.0d, 1.0d, (double) this.A02.left, (double) this.A0V.left));
            double translationY = (double) (this.A02.top - this.A0l.getTranslationY());
            float f7 = this.A0V.top;
            Integer num = this.A0M;
            if (num != Constants.A0Y) {
                z = false;
            }
            z = true;
            if (z) {
                f6 = this.A0l.getTranslationY();
            }
            this.A0m.setTranslationY((float) C27181Gu.A01(d, 0.0d, 1.0d, translationY, (double) (f7 - f6)));
        }
        AnonymousClass309 r24 = this.A0F;
        if (r24 != null) {
            r24.BGC(f2);
        } else {
            C64962sK r25 = this.A0G;
            if (r25 != null) {
                r25.BGC(f2);
            }
        }
        if (this.A0j.getVisibility() == 0) {
            this.A0j.setAlpha(1.0f - f);
        }
    }

    private void A0J(RectF rectF, RectF rectF2, AnonymousClass309 r10) {
        float f;
        this.A02 = rectF;
        if (rectF2 == null) {
            rectF2 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A01, (float) this.A0k.getWidth(), (float) (this.A01 << 1));
        }
        this.A03 = rectF2;
        this.A0F = r10;
        this.A01 = C34581ey.A00(this.A0i);
        if (rectF != null) {
            f = rectF.height();
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        A0M((C50282Fr) null, (C39941no) null, (int) f, true);
        this.A0M = Constants.A0Y;
        int i = 0;
        this.A0l.setVisibility(0);
        A04().setVisibility(0);
        A04().setAlpha(1.0f);
        if (A0Q(this.A0D, this.A0A)) {
            A05().setVisibility(0);
            A05().setLayerType(2, (Paint) null);
            A05().setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        this.A0j.setVisibility(8);
        this.A0j.setAlpha(1.0f);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0m;
        if (rectF == null) {
            i = 4;
        }
        reelAvatarWithBadgeView.setVisibility(i);
        this.A09.A08(this);
        A0H(1.0f);
        AnonymousClass1EG r3 = this.A09;
        r3.A06 = true;
        r3.A05(1.0d, true);
        this.A09.A07(this);
        this.A09.A04((double) BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A09.A03(0.0d);
        this.A0l.setSystemUiVisibility(1280);
    }

    public static void A0K(View view) {
        if (view != null) {
            view.setVisibility(8);
            view.setLayerType(0, (Paint) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r25 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c4, code lost:
        if (r25 != false) goto L_0x00c6;
     */
    private void A0L(C50282Fr r22, C39941no r23, int i, boolean z) {
        boolean z2;
        boolean z3;
        Reel reel = this.A0A;
        if (reel != null) {
            C50282Fr r5 = r22;
            C39941no r6 = r23;
            if (reel.A0W()) {
                C72713Gp.A04(this.A0o, A08(), r5, r6, new C64982sM(), AnonymousClass2OC.A00, new C06300On("reel_animator"), this.A0D);
                return;
            }
            int i2 = i;
            if (reel.A0X()) {
                AnonymousClass0C1 r3 = this.A0o;
                C66832w7 A092 = A09();
                ReelViewerConfig reelViewerConfig = this.A0C;
                int A032 = r5.A03(this.A0o);
                AnonymousClass1OY r13 = this.A0D;
                if (this.A0P) {
                    z3 = true;
                }
                z3 = false;
                C158256pK.A03(r3, A092, r5, r6, new C64982sM(), reelViewerConfig, A032, i2, AnonymousClass2OC.A00, new C06300On("reel_animator"), r13, z3);
            } else if (reel.Aho()) {
                C65122sa A0D2 = A0D();
                AnonymousClass1OY r1 = this.A0D;
                C50282Fr r12 = r5;
                C39941no r132 = r6;
                C66362vM.A02(A0D2, r12, r132, new C64982sM(), r5.A03(this.A0o), i2, AnonymousClass2OW.A00, AnonymousClass35W.A00, r1, "reel_animator");
            } else if (reel.A0c()) {
                AnonymousClass0C1 r14 = this.A0o;
                AnonymousClass0C1 r11 = r14;
                C39941no r133 = r6;
                AnonymousClass9FY.A01(r11, A0B(), r133, new C64982sM(), AnonymousClass2OU.A00, r5, r5.A03(this.A0o), i2, "reel_animator");
            } else {
                C34081e0 r2 = this.A0n;
                AnonymousClass0C1 r32 = this.A0o;
                C34421ei r4 = this.A0v;
                ReelViewerConfig reelViewerConfig2 = this.A0C;
                AnonymousClass1OY r142 = this.A0D;
                int A033 = r5.A03(r32);
                boolean z4 = r5.A0A.A0x;
                if (this.A0P) {
                    z2 = true;
                }
                z2 = false;
                C34081e0.A02(r2, r32, r4, r5, r6, new C64982sM(), reelViewerConfig2, A033, i2, z4, AnonymousClass2OC.A00, C65002sO.A00, r142, true, z2, new C06300On("reel_animator"), (AnonymousClass1OC) null, (AnonymousClass1NR) null);
            }
        }
    }

    private void A0M(C50282Fr r14, C39941no r15, int i, boolean z) {
        Pair A062;
        Object obj;
        Object obj2;
        RectF rectF = this.A02;
        if (rectF != null) {
            this.A0m.setLayoutParams(new FrameLayout.LayoutParams(Math.round(rectF.width()), Math.round(this.A02.height())));
            ImageUrl A0A2 = this.A0A.A0A();
            if (A0A2 != null) {
                ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0m;
                reelAvatarWithBadgeView.A01.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                reelAvatarWithBadgeView.setSingleAvatarUrlAndVisibility(A0A2, (String) null);
            } else if (!(r14 == null || AnonymousClass48j.A00(this.A0o, r14.A0A) == null || r15 == null || r15.A0D == null)) {
                AnonymousClass0C1 r6 = this.A0o;
                if (z) {
                    List A002 = AnonymousClass48j.A00(r6, r14.A0A);
                    if (A002.size() > 0) {
                        obj = A002.get(0);
                    } else {
                        obj = null;
                    }
                    List A003 = AnonymousClass48j.A00(r6, r14.A0A);
                    if (A003.size() > 1) {
                        obj2 = A003.get(1);
                    } else {
                        obj2 = null;
                    }
                    A062 = new Pair(obj, obj2);
                } else {
                    A062 = r14.A06(r6, r15);
                }
                float f = (float) i;
                float f2 = 0.8125f * f;
                float f3 = f - f2;
                float f4 = f2 / 2.0f;
                this.A0m.A00((ImageUrl) A062.first, (ImageUrl) A062.second, Math.round(f2), Math.round(f3), Math.round(f3 - f4), Math.round(f4 * 1.154f));
            }
            this.A0m.setVisibility(0);
            return;
        }
        this.A0m.setVisibility(4);
    }

    public static void A0O(C34071dx r4, AnonymousClass1WC r5, int i, AnonymousClass1OY r7) {
        String str;
        AnonymousClass309 r1 = r4.A0E;
        Reel reel = r4.A0Z;
        if (reel != null) {
            str = reel.getId();
        } else {
            str = null;
        }
        r1.BEx(i, str);
        C35591gc r12 = (C35591gc) r5.AZ2(r4.A0A);
        if (r12 != null) {
            A0P(r4, r12, r4.A0E, r7);
            return;
        }
        View AWz = r5.AWz();
        if (AWz != null) {
            AWz.getViewTreeObserver().addOnGlobalLayoutListener(new C149056Za(r4, AWz, r5, r7));
        } else {
            A0P(r4, (C35591gc) null, r4.A0E, r7);
        }
    }

    public static void A0P(C34071dx r5, C35591gc r6, AnonymousClass309 r7, AnonymousClass1OY r8) {
        RectF rectF;
        r5.A0H = r6;
        RectF rectF2 = null;
        if (r6 != null) {
            rectF2 = r6.AGQ();
            boolean z = false;
            if (r8 == AnonymousClass1OY.IN_FEED_STORIES_TRAY) {
                z = true;
            }
            if (z) {
                rectF = C06220Of.A0A(((C36021hJ) r5.A0H).A0B);
            } else {
                rectF = new RectF(rectF2);
                rectF.inset(rectF.width() / 2.0f, rectF.height() / 2.0f);
            }
            r5.A0H.AcW();
            r7 = new AnonymousClass30A(r5, r7);
        } else {
            rectF = null;
        }
        r5.A0J(rectF2, rectF, r7);
    }

    private boolean A0Q(AnonymousClass1OY r3, Reel reel) {
        if (!reel.A0l(this.A0o) && !reel.A0W()) {
            boolean z = false;
            if (r3 == AnonymousClass1OY.IN_FEED_STORIES_TRAY) {
                z = true;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A0R() {
        A0U(this.A02, this.A03, new AnonymousClass5LF(this));
    }

    public final void A0S() {
        int i;
        if (this.A0M != Constants.A0C) {
            A0G();
            A04().setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0j.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0k.removeView(this.A0l);
            if (this.A0G != null) {
                this.A0G = null;
            }
            this.A0M = Constants.A0C;
            if (AnonymousClass0PB.A06() && (i = this.A00) != -1) {
                AnonymousClass1X4.A02(this.A0h, i);
                this.A00 = -1;
            }
        }
    }

    public final void A0T() {
        if (this.A0M == Constants.ZERO || A0a()) {
            A04().setLayerType(0, (Paint) null);
            this.A0m.setLayerType(0, (Paint) null);
            this.A0j.setLayerType(0, (Paint) null);
            this.A09.A08(this);
            this.A09.A05(0.0d, true);
            A04().setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0F();
            this.A0k.removeView(this.A0l);
            C64962sK r2 = this.A0G;
            if (r2 != null && this.A0M == Constants.ZERO) {
                r2.AuW();
            }
            this.A0G = null;
            this.A0l.setSystemUiVisibility(1280);
            this.A0M = Constants.A0j;
            Activity activity = this.A0h;
            int i = C34581ey.A00;
            if (i != -1) {
                C27141Gq.A01(activity, i);
                C27141Gq.A01(activity, C34581ey.A00);
            }
        }
    }

    public final void A0U(RectF rectF, RectF rectF2, AnonymousClass309 r3) {
        this.A0E = r3;
        A0J(rectF, rectF2, r3);
    }

    public final void A0V(ListView listView) {
        if (this.A0M == Constants.A0N) {
            A04().setLayerType(2, (Paint) null);
            this.A0m.setLayerType(2, (Paint) null);
            int A002 = A00((AnonymousClass1WG) listView.getAdapter());
            if (A002 < 0) {
                A0J((RectF) null, (RectF) null, (AnonymousClass309) null);
            } else {
                listView.getViewTreeObserver().addOnGlobalLayoutListener(new C28206Cd9(this, listView, A002));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (A0Q(r5, r2) == false) goto L_0x0020;
     */
    public final void A0Y(C50282Fr r28, C39941no r29, Reel reel, Set set, AnonymousClass1OY r32, float f, float f2, float f3, int i, boolean z, boolean z2) {
        float f4;
        float f5;
        RectF rectF;
        C34531et r2;
        LinearLayout linearLayout;
        if (this.A0M == Constants.A0C) {
            C50282Fr r11 = r28;
            Reel reel2 = r11.A0A;
            AnonymousClass1OY r5 = r32;
            if (reel2.A0m(this.A0o)) {
                f4 = 0.2f;
            }
            f4 = 1.0f;
            this.A0T = f4;
            this.A0D = r5;
            this.A0A = r11.A0A;
            this.A0Z = reel;
            HashSet hashSet = new HashSet();
            this.A0N = hashSet;
            hashSet.addAll(set);
            C39941no r4 = r29;
            this.A0B = r4;
            this.A0R = f;
            this.A0S = f2;
            this.A0Q = f3;
            this.A0U = i;
            this.A0O = z;
            this.A0e = z2;
            if (this.A0l.getChildAt(0) != A04()) {
                this.A0l.removeViewAt(0);
                this.A0l.addView(A04(), 0);
            }
            A0L(r11, r4, r11.A04(this.A0o, r4), true);
            this.A0l.setBackgroundColor(this.A0U);
            if (A0Q(r5, this.A0A)) {
                C39941no A0B2 = r11.A0A.A0B(this.A0o);
                if (this.A0l.getChildAt(1) != A05()) {
                    if (this.A0l.getChildAt(1) != this.A0m) {
                        this.A0l.removeViewAt(1);
                    }
                    this.A0l.addView(A05(), 1);
                }
                int A042 = r11.A04(this.A0o, A0B2);
                Reel reel3 = this.A0A;
                if (reel3 != null) {
                    if (reel3.A0X()) {
                        if (this.A0I == null) {
                            this.A0I = (C66832w7) A03().getTag();
                        }
                        C66832w7 r3 = this.A0I;
                        AnonymousClass0C1 r9 = this.A0o;
                        ReelViewerConfig reelViewerConfig = this.A0C;
                        int A032 = r11.A03(r9);
                        AnonymousClass1OY r52 = this.A0D;
                        C158256pK.A03(r9, r3, r11, A0B2, new C64982sM(), reelViewerConfig, A032, A042, AnonymousClass2OC.A00, new C06300On("reel_animator"), r52, false);
                        r3.A0c.setVisibility(4);
                        r3.A0R.setVisibility(4);
                        r3.A0I.setVisibility(4);
                        r2 = r3.A0Y;
                    } else if (reel3.Aho()) {
                        C65122sa A0E2 = A0E();
                        AnonymousClass1OY r53 = this.A0D;
                        C50282Fr r18 = r11;
                        C39941no r19 = A0B2;
                        C66362vM.A02(A0E2, r18, r19, new C64982sM(), r11.A03(this.A0o), A042, AnonymousClass2OW.A00, AnonymousClass35W.A00, r53, "reel_animator");
                        A0E2.A0Q.A00.setVisibility(4);
                        A0E2.A0C.setVisibility(4);
                        A0E2.A0D.setVisibility(4);
                        linearLayout = A0E2.A0S.A05;
                        linearLayout.setVisibility(4);
                    } else if (reel3.A0c()) {
                        C65132sb A0C2 = A0C();
                        AnonymousClass0C1 r33 = this.A0o;
                        AnonymousClass0C1 r17 = r33;
                        C39941no r192 = A0B2;
                        AnonymousClass9FY.A01(r17, A0B(), r192, new C64982sM(), AnonymousClass2OU.A00, r11, r11.A03(this.A0o), A042, "reel_animator");
                        A0C2.A0R.setVisibility(4);
                    } else {
                        C34421ei A0A2 = A0A();
                        C34081e0 r8 = this.A0n;
                        AnonymousClass0C1 r92 = this.A0o;
                        C34421ei A0A3 = A0A();
                        ReelViewerConfig reelViewerConfig2 = this.A0C;
                        AnonymousClass1OY r7 = this.A0D;
                        C34081e0.A02(r8, r92, A0A3, r11, A0B2, new C64982sM(), reelViewerConfig2, r11.A03(this.A0o), A042, AnonymousClass17M.A00(this.A0p, r11.A0B().AZf()), AnonymousClass2OC.A00, C65002sO.A00, r7, true, false, new C06300On("reel_animator"), (AnonymousClass1OC) null, (AnonymousClass1NR) null);
                        A0A2.A11.setVisibility(4);
                        A0A2.A0G.setVisibility(4);
                        A0A2.A0H.setVisibility(4);
                        r2 = A0A2.A0v;
                    }
                    linearLayout = r2.A0l;
                    linearLayout.setVisibility(4);
                }
            } else {
                A0F();
            }
            RectF rectF2 = this.A02;
            if (rectF2 != null) {
                f5 = rectF2.height();
            } else {
                f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            A0M(r11, r4, (int) f5, true);
            this.A0l.setVisibility(0);
            A04().setVisibility(0);
            A04().setAlpha(1.0f);
            this.A0j.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0k.addView(this.A0l);
            this.A0M = Constants.A0N;
            A0I(this.A0Q, this.A0R, this.A0S, 1.0f);
            if (A06() != null) {
                rectF = C06220Of.A0A(A06());
            } else {
                rectF = null;
            }
            this.A0V = rectF;
            RectF rectF3 = this.A03;
            if (rectF3 == null) {
                rectF3 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A01, (float) this.A0k.getWidth(), (float) (this.A01 << 1));
            }
            this.A03 = rectF3;
            A0H(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r1.A06() == false) goto L_0x0038;
     */
    public final void A0Z(AnonymousClass1WC r9, AnonymousClass309 r10, AnonymousClass1OY r11, ReelViewerConfig reelViewerConfig) {
        boolean z;
        if (this.A0M == Constants.A0N) {
            A04().setLayerType(2, (Paint) null);
            this.A0m.setLayerType(2, (Paint) null);
            this.A0E = r10;
            AnonymousClass1WC r4 = r9;
            int A002 = A00(r9.ATt());
            boolean z2 = this.A0e;
            AnonymousClass1OR A003 = AnonymousClass1OR.A00(this.A0o);
            AnonymousClass1OY r6 = r11;
            if (r11 == AnonymousClass1OY.MAIN_FEED_TRAY || r11 == AnonymousClass1OY.IN_FEED_STORIES_TRAY) {
                z = true;
            }
            z = false;
            if (z && z2) {
                A002++;
            }
            View AWz = r9.AWz();
            if (AWz == null) {
                A0P(this, (C35591gc) null, this.A0E, r11);
            } else if (AWz.isLaidOut()) {
                A0O(this, r9, A002, r11);
            } else {
                AWz.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6ZW(this, AWz, r4, A002, r6, reelViewerConfig));
            }
        }
    }

    public final boolean A0a() {
        if (this.A0M == Constants.A0N) {
            return true;
        }
        return false;
    }

    public final boolean A0b() {
        Integer num = this.A0M;
        if (num == Constants.A0C || num == Constants.A0j) {
            return false;
        }
        return true;
    }

    public final void BOH(AnonymousClass1EG r5) {
        int i;
        if (this.A0M == Constants.ZERO) {
            this.A0M = Constants.ONE;
            A04().setLayerType(0, (Paint) null);
            this.A0m.setLayerType(0, (Paint) null);
            this.A0j.setLayerType(0, (Paint) null);
            this.A09.A08(this);
            this.A09.A05(0.0d, true);
            C64962sK r1 = this.A0G;
            if (r1 != null) {
                r1.BK9(this.A0A.getId());
            }
            if (!AnonymousClass0PB.A06() && (i = this.A00) != -1) {
                AnonymousClass1X4.A02(this.A0h, i);
                this.A00 = -1;
            }
        }
        if (this.A0M == Constants.A0Y) {
            boolean z = false;
            A04().setLayerType(0, (Paint) null);
            this.A0m.setLayerType(0, (Paint) null);
            this.A0j.setLayerType(0, (Paint) null);
            AnonymousClass309 r12 = this.A0F;
            if (r12 != null) {
                if (this.A0O && this.A0D.A00()) {
                    z = true;
                }
                r12.B6g(z, this.A0B.A0F);
                this.A0F = null;
            }
            A0G();
            A0F();
            C66832w7 r0 = this.A0I;
            if (r0 != null) {
                r0.A0P();
            }
            C34421ei r02 = this.A0J;
            if (r02 != null) {
                r02.A0O();
            }
            C65122sa r03 = this.A0L;
            if (r03 != null) {
                r03.A0O();
            }
            C65132sb r2 = this.A0K;
            if (r2 != null) {
                r2.A0A = null;
                r2.A0C = null;
                r2.A0R.setProgress(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                r2.A0B = null;
            }
            this.A0l.setVisibility(8);
            this.A0k.removeView(this.A0l);
            this.A0M = Constants.A0j;
        }
    }

    public C34071dx(String str, ViewGroup viewGroup, AnonymousClass0C1 r8, Activity activity) {
        this.A0h = activity;
        this.A0q = str;
        Context context = viewGroup.getContext();
        this.A0i = context;
        this.A0o = r8;
        this.A0p = r8.A06;
        this.A0l = (ViewGroup) LayoutInflater.from(context).inflate(C0003R.layout.layout_reel_viewer_animator, viewGroup, false);
        Resources resources = this.A0i.getResources();
        this.A0t = resources;
        this.A0s = resources.getDimensionPixelSize(C0003R.dimen.reel_attribution_margin_left);
        this.A0g = this.A0t.getDimensionPixelSize(C0003R.dimen.reel_attribution_margin_top);
        TypedArray obtainStyledAttributes = this.A0i.obtainStyledAttributes(2131886123, new int[]{16842997});
        this.A0r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.A0f = (this.A0t.getDimensionPixelSize(C0003R.dimen.iglive_button_height) - this.A0r) >> 1;
        View A002 = C34081e0.A00(this.A0i, this.A0l, (AnonymousClass1PD) null, (C38631la) null, r8);
        this.A0u = A002;
        A002.setBackgroundColor(-16777216);
        this.A0l.addView(this.A0u, 0);
        View inflate = LayoutInflater.from(this.A0i).inflate(C0003R.layout.layout_reel_shadow_gradient, viewGroup, false);
        this.A0j = inflate;
        this.A0l.addView(inflate);
        this.A0l.bringChildToFront(this.A0j);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) this.A0l.findViewById(C0003R.C0005id.animated_profile_picture);
        this.A0m = reelAvatarWithBadgeView;
        reelAvatarWithBadgeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A0v = (C34421ei) this.A0u.getTag();
        this.A0n = new C34081e0(new C35011ff(), new AnonymousClass1I2());
        this.A0k = viewGroup;
        AnonymousClass1EG A003 = AnonymousClass0P2.A00().A00();
        A003.A06(C35031fh.A00);
        this.A09 = A003;
        View decorView = this.A0h.getWindow().getDecorView();
        AnonymousClass1E1.A0c(decorView, new C27211Gx());
        AnonymousClass1E1.A0J(decorView);
    }

    public static C34071dx A07(Activity activity, ViewGroup viewGroup, AnonymousClass0C1 r5) {
        C34071dx r0 = (C34071dx) viewGroup.getTag(C0003R.C0005id.reel_viewer_animator);
        if (r0 != null) {
            return r0;
        }
        String uuid = UUID.randomUUID().toString();
        C34071dx r1 = new C34071dx(uuid, viewGroup, r5, activity);
        viewGroup.setTag(C0003R.C0005id.reel_viewer_animator, r1);
        A0w.put(uuid, r1);
        return r1;
    }

    private void A0I(float f, float f2, float f3, float f4) {
        View A042 = A04();
        A042.setScaleX(f);
        A042.setScaleY(f);
        A042.setTranslationX(f2);
        A042.setTranslationY(f3);
        A042.setAlpha(f4);
        if (this.A0j.getVisibility() == 0) {
            this.A0j.setScaleX(f);
            this.A0j.setScaleY(f);
            this.A0j.setTranslationX(f2);
            this.A0j.setTranslationY(f3);
            this.A0j.setAlpha(1.0f);
        }
    }

    public static void A0N(C34071dx r6, ListView listView, int i, C39941no r9) {
        RectF rectF;
        C121955Kp r0;
        RectF rectF2;
        AnonymousClass5LC r02;
        Object item = listView.getAdapter().getItem(i);
        if (item instanceof AnonymousClass5VK) {
            int A002 = ((AnonymousClass5VK) item).A00(r9);
            if (A002 != -1) {
                View childAt = listView.getChildAt(i - listView.getFirstVisiblePosition());
                if (childAt.getTag() instanceof C124615Vn) {
                    MediaFrameLayout mediaFrameLayout = ((C124615Vn) childAt.getTag()).A01[A002].A08;
                    rectF2 = C06220Of.A0A(mediaFrameLayout);
                    mediaFrameLayout.setVisibility(4);
                    r02 = new AnonymousClass5LC(r6, mediaFrameLayout);
                } else {
                    throw new IllegalArgumentException("no valid holder found in tag of row view");
                }
            } else {
                rectF2 = null;
                r02 = null;
            }
            r6.A0J((RectF) null, rectF2, r02);
            return;
        }
        C35751gs r5 = (C35751gs) listView.getChildAt(i - listView.getFirstVisiblePosition()).getTag();
        RectF rectF3 = null;
        if (r5 != null) {
            rectF3 = C06220Of.A0A(r5.AGS());
            rectF = new RectF(rectF3);
            rectF.inset(rectF.width() / 2.0f, rectF.height() / 2.0f);
            r5.AGS().setVisibility(4);
            r0 = new C121955Kp(r6, r5);
        } else {
            rectF = null;
            r0 = null;
        }
        r6.A0J(rectF3, rectF, r0);
    }

    public final void A0W(Reel reel, int i, RectF rectF, RectF rectF2, C64962sK r16, boolean z, AnonymousClass1OY r18) {
        int i2 = i;
        Reel reel2 = reel;
        RectF rectF3 = rectF;
        RectF rectF4 = rectF2;
        C64962sK r7 = r16;
        A0X(reel2, (List) null, i2, (String) null, rectF3, rectF4, r7, z, r18, Collections.emptySet());
    }

    public final void BOF(AnonymousClass1EG r4) {
        if (A06() != null) {
            View A062 = A06();
            int i = 0;
            if (this.A02 != null) {
                i = 4;
            }
            A062.setVisibility(i);
        }
    }

    public final void BOK(AnonymousClass1EG r4) {
        A0H((float) r4.A00());
    }

    public final void A0X(Reel reel, List list, int i, String str, RectF rectF, RectF rectF2, C64962sK r21, boolean z, AnonymousClass1OY r23, Set set) {
        int i2;
        float f;
        if (!A0b()) {
            Reel reel2 = reel;
            if (reel == null) {
                AnonymousClass0QD.A02("ReelViewerAnimator#animateReveal called with null Reel", "reel must be non-null");
                return;
            }
            C33251cc.A01().A07();
            this.A01 = C34581ey.A00(this.A0i);
            this.A0R = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A0S = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            float f2 = 1.0f;
            this.A0Q = 1.0f;
            AnonymousClass1OY r4 = r23;
            if (reel.A0m(this.A0o) && A0Q(r4, reel)) {
                f2 = 0.2f;
            }
            this.A0T = f2;
            this.A0D = r4;
            this.A0A = reel;
            C50282Fr r8 = new C50282Fr(this.A0o, reel2, -1, false, set);
            this.A0Z = this.A0A;
            int i3 = i;
            if (i3 == -2) {
                String str2 = str;
                if (str != null) {
                    AnonymousClass0C1 r1 = this.A0o;
                    r8.A0G(r1, r8.A05(r1, str2));
                }
            } else if (i3 != -1) {
                r8.A0G(this.A0o, i3);
            }
            r8.A04 = list;
            if (this.A0l.getChildAt(0) != A04()) {
                this.A0l.removeViewAt(0);
                this.A0l.addView(A04(), 0);
            }
            A04().setLayerType(2, (Paint) null);
            this.A0m.setLayerType(2, (Paint) null);
            View view = this.A0j;
            int i4 = 8;
            if (z) {
                i4 = 0;
            }
            view.setVisibility(i4);
            this.A0j.setLayerType(2, (Paint) null);
            this.A0M = Constants.ZERO;
            this.A0l.setVisibility(0);
            A04().setVisibility(4);
            RectF rectF3 = rectF;
            this.A02 = rectF3;
            this.A03 = rectF2;
            this.A0G = r21;
            int i5 = this.A0s;
            if (this.A0A.A0W()) {
                i2 = this.A0f;
            } else {
                i2 = this.A0g;
            }
            int A022 = i2 + C64972sL.A02(this.A0i, r8);
            int i6 = this.A0r;
            this.A0V = new RectF((float) i5, (float) A022, (float) (i5 + i6), (float) (i6 + A022));
            C39941no A082 = r8.A08(this.A0o);
            if (rectF != null) {
                f = rectF3.height();
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            A0M(r8, A082, (int) f, false);
            if (this.A0l.getParent() == null) {
                ViewGroup viewGroup = this.A0k;
                viewGroup.addView(this.A0l, viewGroup.getWidth(), this.A01);
                this.A0l.setTranslationY((float) AnonymousClass0PB.A01());
            }
            A0L(r8, A082, r8.A02, false);
            A0H(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A04().setVisibility(0);
            AnonymousClass1EG r12 = this.A09;
            r12.A06 = true;
            r12.A07(this);
            this.A09.A03(1.0d);
            this.A00 = AnonymousClass1X4.A00(this.A0h);
            if (!AnonymousClass0PB.A06()) {
                this.A0l.setSystemUiVisibility(1284);
                AnonymousClass1X4.A02(this.A0h, C019000b.A00(this.A0i, C0003R.color.transparent));
            } else {
                AnonymousClass1X4.A02(this.A0h, C019000b.A00(this.A0i, C0003R.color.black));
                AnonymousClass1X4.A03(this.A0h, false);
            }
            if (this.A0C.A0B || (C64972sL.A03(this.A0i) && ((Boolean) AnonymousClass0L6.A02(this.A0o, AnonymousClass0L7.STORIES_VIEWER_TALL_ANDROID_CAP_MEDIA, "navigation_bar_black", false, (AnonymousClass04H) null)).booleanValue())) {
                int A002 = C27141Gq.A00(this.A0h);
                if (!(A002 == -1 || A002 == -16777216)) {
                    C34581ey.A00 = A002;
                }
                Activity activity = this.A0h;
                if (C34581ey.A00 != -1) {
                    C27141Gq.A01(activity, -16777216);
                }
            }
        }
    }
}
