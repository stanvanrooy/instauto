package com.instagram.comments.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.comments.controller.CommentComposerController;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.p004ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.realtimeclient.InAppNotificationDestinations;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RC;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass10N;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1PL;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass1R8;
import p000X.AnonymousClass1RA;
import p000X.AnonymousClass1RD;
import p000X.AnonymousClass1RH;
import p000X.AnonymousClass1RJ;
import p000X.AnonymousClass1S2;
import p000X.AnonymousClass1S3;
import p000X.AnonymousClass1ST;
import p000X.AnonymousClass1SU;
import p000X.AnonymousClass1UR;
import p000X.AnonymousClass1UV;
import p000X.AnonymousClass1VH;
import p000X.AnonymousClass1XL;
import p000X.AnonymousClass1XN;
import p000X.AnonymousClass1YG;
import p000X.AnonymousClass1YI;
import p000X.AnonymousClass26J;
import p000X.AnonymousClass2EZ;
import p000X.AnonymousClass2M8;
import p000X.AnonymousClass2NR;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass2TI;
import p000X.AnonymousClass2xx;
import p000X.AnonymousClass3S7;
import p000X.AnonymousClass4NT;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass6LX;
import p000X.AnonymousClass6M3;
import p000X.AnonymousClass6MA;
import p000X.AnonymousClass6MB;
import p000X.AnonymousClass6MC;
import p000X.AnonymousClass6MD;
import p000X.AnonymousClass6QA;
import p000X.AnonymousClass6UA;
import p000X.AnonymousClass6UE;
import p000X.AnonymousClass6UI;
import p000X.AnonymousClass6UQ;
import p000X.AnonymousClass6UR;
import p000X.AnonymousClass6UT;
import p000X.AnonymousClass6UV;
import p000X.AnonymousClass9IT;
import p000X.AnonymousClass9IU;
import p000X.AnonymousClass9IV;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C109514nh;
import p000X.C11130eT;
import p000X.C11200ea;
import p000X.C119445Am;
import p000X.C12810hQ;
import p000X.C12830hS;
import p000X.C13150hy;
import p000X.C13300iJ;
import p000X.C14090jk;
import p000X.C151536ds;
import p000X.C157426nw;
import p000X.C157736oT;
import p000X.C157786oY;
import p000X.C157846of;
import p000X.C157866oh;
import p000X.C157906ol;
import p000X.C157916om;
import p000X.C157926on;
import p000X.C157966or;
import p000X.C157976os;
import p000X.C157996ou;
import p000X.C15890nh;
import p000X.C16160o8;
import p000X.C16180oA;
import p000X.C16980pU;
import p000X.C17020pY;
import p000X.C17050pb;
import p000X.C17070pd;
import p000X.C17850qu;
import p000X.C18320rf;
import p000X.C215639Rd;
import p000X.C215679Rh;
import p000X.C23300zv;
import p000X.C26301Cs;
import p000X.C26441Dh;
import p000X.C26581Eb;
import p000X.C26701Ew;
import p000X.C27301Hh;
import p000X.C27341Hl;
import p000X.C27361Hn;
import p000X.C27371Ho;
import p000X.C27491Ib;
import p000X.C27511Id;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C28671Ckn;
import p000X.C28991Oe;
import p000X.instagramComment;
import p000X.C29181Ox;
import p000X.C29191Oy;
import p000X.C29631Qq;
import p000X.C29671Qu;
import p000X.C29681Qv;
import p000X.C29791Rg;
import p000X.C29851Rn;
import p000X.C29951Rx;
import p000X.C30541Ug;
import p000X.C30691Uv;
import p000X.C30841Vk;
import p000X.C32711bj;
import p000X.C32991cC;
import p000X.C33051cI;
import p000X.C33451cw;
import p000X.C33831dZ;
import p000X.C34071dx;
import p000X.C36281hn;
import p000X.C36291ho;
import p000X.C36811ie;
import p000X.C36841ih;
import p000X.C37111j8;
import p000X.C37201jH;
import p000X.C51302Kd;
import p000X.C51312Ke;
import p000X.C51322Kf;
import p000X.C51332Kg;
import p000X.C51342Kh;
import p000X.C51352Ki;
import p000X.C51522Kz;
import p000X.C52172Ns;
import p000X.C52502Pb;
import p000X.C53642Tq;
import p000X.C62632o4;
import p000X.C62652o6;
import p000X.C66892wG;
import p000X.C66902wH;
import p000X.C66912wI;
import p000X.C66922wJ;
import p000X.C66932wK;
import p000X.C66942wL;
import p000X.C66952wM;
import p000X.C66962wN;
import p000X.C66972wO;
import p000X.C66982wP;
import p000X.C66992wQ;
import p000X.C67002wR;
import p000X.C67012wS;
import p000X.C67022wT;
import p000X.C67032wU;
import p000X.C67052wW;
import p000X.C67072wY;
import p000X.C67162wi;
import p000X.C67192wl;
import p000X.C67212wn;
import p000X.C67242wq;
import p000X.C67252wr;
import p000X.C67262ws;
import p000X.C67272wt;
import p000X.C67282wu;
import p000X.C67292wv;
import p000X.C67362x2;
import p000X.C67372x3;
import p000X.C67392x5;
import p000X.C67402x6;
import p000X.C67432x9;
import p000X.C67442xA;
import p000X.C67482xK;
import p000X.C67492xL;
import p000X.C67502xM;
import p000X.C67552xR;
import p000X.C67572xT;
import p000X.C67582xU;
import p000X.C67592xV;
import p000X.C67852xw;
import p000X.C67872y1;
import p000X.C67942y9;
import p000X.C67952yA;
import p000X.C67962yB;
import p000X.C68072yO;
import p000X.CYX;

public class CommentThreadFragment extends C27341Hl implements AnonymousClass0RN, C12830hS, C30541Ug, C27361Hn, AnonymousClass1HK, C51302Kd, C51312Ke, AnonymousClass1HL, C51322Kf, AnonymousClass1HM, C51332Kg, AnonymousClass0RC, C28991Oe, C51342Kh, C51352Ki {
    public int A00;
    public int A01;
    public C67242wq A02;
    public CommentComposerController A03;
    public C67372x3 A04;
    public C67362x2 A05;
    public C67402x6 A06;
    public C67162wi A07;
    public AnonymousClass2M8 A08;
    public C67392x5 A09;
    public C67432x9 A0A;
    public C67552xR A0B;
    public C67582xU A0C;
    public AnonymousClass1R8 A0D;
    public C67952yA A0E;
    public C67032wU A0F;
    public AnonymousClass0QT A0G;
    public C36281hn A0H;
    public AnonymousClass1NJ A0I;
    public CYX A0J;
    public AnonymousClass0C1 A0K;
    public Integer A0L = Constants.ZERO;
    public Runnable A0M;
    public String A0N;
    public boolean A0O = true;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R;
    public boolean A0S = false;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X = false;
    public boolean A0Y = false;
    public boolean A0Z;
    public int A0a = -1;
    public int A0b;
    public int A0c = -1;
    public C67212wn A0d;
    public C27511Id A0e;
    public C28051Kf A0f;
    public AnonymousClass2TI A0g;
    public C51312Ke A0h;
    public AnonymousClass1XN A0i;
    public AnonymousClass1I6 A0j;
    public Runnable A0k;
    public String A0l;
    public String A0m;
    public boolean A0n;
    public boolean A0o = false;
    public boolean A0p = false;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public final Handler A0v = new Handler();
    public final C66952wM A0w = new C66952wM(this);
    public final C66932wK A0x = new C66922wJ(this);
    public final AnonymousClass1I1 A0y = new AnonymousClass1I1();
    public final View.OnLayoutChangeListener A0z = new C66902wH(this);
    public final View.OnLayoutChangeListener A10 = new C66912wI(this);
    public final View.OnTouchListener A11 = new C66992wQ(this);
    public final C66942wL A12 = new C66942wL(this);
    public final C11200ea A13 = new C66962wN(this);
    public final AnonymousClass2NR A14 = new AnonymousClass2NR();
    public final C66982wP A15 = new C66972wO(this);
    public View mCommentsContainer;
    public View mRootView;
    public AnonymousClass1YI mScrollingViewProxy;

    public final void AtV() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r3.A0V != false) goto L_0x000f;
     */
    public final void B8g(int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3 = false;
        if (i > 0) {
            z3 = true;
        }
        this.A0U = z3;
        boolean z4 = this.A0R;
        if (!z4) {
            z2 = false;
        }
        z2 = true;
        if (!z2 && isAdded()) {
            C06220Of.A0L(this.mRootView, i);
        } else if (z4) {
            A01(i);
            int i3 = this.A0a;
            if (i3 != -1 && (i2 = this.A0c) != -1) {
                C06220Of.A0L(this.mRootView, Math.min(i3, i2) + i);
            }
        }
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A00() {
        if (!this.A0p || this.A0S) {
            C67072wY A002 = C67052wW.A00(this.A0K).A00(this.A0I);
            if (A002 != null && A002.A00 != null && this.A0N == null && ((Boolean) AnonymousClass0L6.A02(this.A0K, AnonymousClass0L7.INTERACTIONS_DRAFT_COMMENT_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                this.A0N = A002.A00;
            }
            this.A0p = true;
            this.A08.A00.A03();
            AnonymousClass00B.A01.markerPoint(16646145, "COMMENTS_LOAD_START");
            C67032wU.A00(this.A0F, Constants.ZERO, this.A0x, this.A0N, Constants.A0C, this.A0W);
        }
    }

    private void A02(int i) {
        if (!this.A0n && (getRootActivity() instanceof C26301Cs)) {
            ((C26301Cs) getRootActivity()).Bl6(i);
        }
    }

    public static void A03(CommentThreadFragment commentThreadFragment) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) commentThreadFragment.mCommentsContainer.getLayoutParams();
        int A032 = commentThreadFragment.A03.A03();
        if (layoutParams.bottomMargin != A032) {
            layoutParams.bottomMargin = A032;
            commentThreadFragment.mCommentsContainer.setLayoutParams(layoutParams);
        }
    }

    public static void A04(CommentThreadFragment commentThreadFragment) {
        if (!commentThreadFragment.A0R && commentThreadFragment.isAdded()) {
            commentThreadFragment.A02.A0M();
        }
    }

    public static void A07(CommentThreadFragment commentThreadFragment, Integer num, C67952yA r9) {
        int i;
        instagramComment r2;
        commentThreadFragment.A0C.A01();
        A06(commentThreadFragment);
        AnonymousClass1NJ r1 = commentThreadFragment.A0I;
        if (r1.A3L) {
            commentThreadFragment.A03.A05();
        } else if (num == Constants.ZERO) {
            commentThreadFragment.A08.A00.A04();
            AnonymousClass00B.A01.markerPoint(16646145, "COMMENTS_LOAD_COMPLETE");
            commentThreadFragment.A0I.A3k.A0B.A01();
            C67242wq r3 = commentThreadFragment.A02;
            Integer num2 = r9.A00;
            r3.A03 = num2;
            Integer num3 = r9.A01;
            if (num3 != null) {
                commentThreadFragment.A0L = num3;
            }
            boolean z = r9.A04;
            commentThreadFragment.A0Q = z;
            r3.A05 = z;
            r3.A00 = new C67272wt(r9.A02);
            boolean z2 = false;
            if (num2 != Constants.ZERO) {
                z2 = true;
            }
            commentThreadFragment.A0Y = z2;
            if (!commentThreadFragment.A0R && commentThreadFragment.isAdded()) {
                BaseFragmentActivity.A00(AnonymousClass1EW.A03(commentThreadFragment.getActivity()));
            }
            List<C67942y9> list = r9.A03;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C67942y9 r0 : list) {
                    arrayList.add(r0.A00);
                }
                CommentComposerController commentComposerController = commentThreadFragment.A03;
                boolean z3 = false;
                if (commentComposerController.mViewHolder != null) {
                    z3 = true;
                }
                if (z3 && !commentComposerController.A0J) {
                    commentComposerController.A0A.A01(arrayList, true);
                }
            }
            commentThreadFragment.A0P = true;
            AnonymousClass00B.A01.markerEnd(16646145, 2);
            if (commentThreadFragment.mView != null) {
                commentThreadFragment.A02.A0P(commentThreadFragment.A0I);
                if (commentThreadFragment.A0S) {
                    commentThreadFragment.A0S = false;
                    return;
                }
                int A0K2 = commentThreadFragment.A02.A0K(commentThreadFragment.A0N);
                if (A0K2 != -1) {
                    commentThreadFragment.A0B.A08(A0K2);
                }
                Integer num4 = commentThreadFragment.A02.A03;
                Integer num5 = Constants.ZERO;
                if (num4 == num5 && commentThreadFragment.A0L == Constants.A0C) {
                    commentThreadFragment.A0B.A06();
                } else if (A0K2 != -1) {
                    C67552xR r22 = commentThreadFragment.A0B;
                    r22.A03(A0K2, r22.A00, false);
                } else if (commentThreadFragment.A0L == num5) {
                    commentThreadFragment.A0B.A05();
                }
                C67072wY A002 = C67052wW.A00(commentThreadFragment.A0K).A00(commentThreadFragment.A0I);
                if (A002 != null && ((Boolean) AnonymousClass0L6.A02(commentThreadFragment.A0K, AnonymousClass0L7.INTERACTIONS_DRAFT_COMMENT_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    String str = A002.A00;
                    String str2 = str;
                    if (str != null) {
                        C67242wq r4 = commentThreadFragment.A02;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= r4.getCount()) {
                                r2 = null;
                                break;
                            }
                            Object item = r4.getItem(i2);
                            if (item instanceof instagramComment) {
                                r2 = (instagramComment) item;
                                if (str2.equals(r2.AS8())) {
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (r2 != null) {
                            String str3 = commentThreadFragment.A0N;
                            if (str3 != null && str3.equals(r2.AS8())) {
                                commentThreadFragment.A0B.A0A(r2);
                            }
                            commentThreadFragment.A03.A07(r2);
                            CYX cyx = commentThreadFragment.A0J;
                            if (cyx != null) {
                                cyx.A01();
                            }
                        } else {
                            return;
                        }
                    }
                    commentThreadFragment.A03.A09(A002.A01);
                    commentThreadFragment.A03.A06();
                }
            }
        } else if (num != Constants.ONE) {
            commentThreadFragment.A02.A0P(r1);
        } else if (commentThreadFragment.mView != null) {
            AnonymousClass1YI A092 = commentThreadFragment.getScrollingViewProxy();
            int count = commentThreadFragment.A02.getCount();
            int A0J2 = commentThreadFragment.A02.A0J();
            C157846of r6 = new C157846of();
            r6.A01 = count;
            r6.A02 = A0J2;
            r6.A00 = A092.ALs();
            if (A092.AI1(0) != null) {
                i = A092.AI1(0).getTop();
            } else {
                i = 0;
            }
            r6.A03 = i;
            for (int i3 = 0; i3 < A0J2 - r6.A00; i3++) {
                View AI1 = A092.AI1(i3);
                if (AI1 != null) {
                    r6.A03 += AI1.getMeasuredHeight();
                }
            }
            commentThreadFragment.A02.A0P(commentThreadFragment.A0I);
            AnonymousClass1YI A093 = commentThreadFragment.getScrollingViewProxy();
            int count2 = commentThreadFragment.A02.getCount();
            int A0J3 = commentThreadFragment.A02.A0J();
            int i4 = r6.A00;
            int max = (Math.max(i4, A0J3) + count2) - r6.A01;
            int i5 = r6.A02;
            if (i4 < Math.max(i5, A0J3)) {
                max += i5 - A0J3;
            }
            A093.AaK().post(new C157736oT(A093, max, r6));
        }
    }

    public static void A08(CommentThreadFragment commentThreadFragment, boolean z) {
        C67582xU r0;
        if (z && (r0 = commentThreadFragment.A0C) != null) {
            r0.A02();
        }
        AnonymousClass11J.A00(commentThreadFragment.mArguments);
        commentThreadFragment.A08.A01.A03();
        AnonymousClass00B.A01.markerPoint(16646145, "MEDIA_LOAD_START");
        C17850qu A032 = C16160o8.A03(commentThreadFragment.mArguments.getString("CommentThreadFragment.MEDIA_ID"), commentThreadFragment.A0K);
        A032.A00 = new AnonymousClass3S7(commentThreadFragment);
        commentThreadFragment.schedule(A032);
    }

    /* renamed from: A09 */
    public final AnonymousClass1YI getScrollingViewProxy() {
        View view = this.mView;
        if (view != null) {
            if (this.mScrollingViewProxy == null) {
                this.mScrollingViewProxy = (AnonymousClass1YI) AnonymousClass1YG.A00((ViewGroup) view.findViewById(16908298));
            }
            return this.mScrollingViewProxy;
        }
        throw new IllegalStateException("Cannot call getScrollingViewProxy before view is initialized");
    }

    public final void A0A(instagramComment r3) {
        AnonymousClass6UA r1 = (AnonymousClass6UA) C16980pU.A00.A01(this.A0K).A00.get(r3.AS8());
        if (r1 != null && !r1.A00) {
            AnonymousClass0ZA.A08(AnonymousClass2EZ.A01, r1);
            r1.run();
        }
    }

    public final void A0B(instagramComment r11) {
        C67162wi r5 = this.A07;
        AnonymousClass11J.A00(r5);
        AnonymousClass6M3 r7 = new AnonymousClass6M3(this, r11);
        AnonymousClass6MB r6 = new AnonymousClass6MB(this, r11);
        C13300iJ AZf = r11.AZf();
        if (AZf == null) {
            AnonymousClass0QD.A02("RestrictCommentController", "comment user is null.");
            return;
        }
        String AZn = AZf.AZn();
        String string = r5.A02.getString(C0003R.string.restrict_success_dialog_title, new Object[]{AZn});
        String string2 = r5.A02.getString(C0003R.string.restrict_success_dialog_description, new Object[]{AZn});
        String string3 = r5.A02.getString(C0003R.string.restrict_success_dialog_delete_comment_button);
        AnonymousClass2OA r2 = new AnonymousClass2OA(r5.A02);
        r2.A03 = string;
        r2.A0M(string2);
        r2.A0P(string3, r7);
        r2.A09(C0003R.string.restrict_success_dialog_keep_comment_button, (DialogInterface.OnClickListener) null);
        r2.A0F(r6);
        r2.A03().show();
        AnonymousClass6LX.A07(r5.A03, "impression", "restrict_success_dialog", r11, (String) null);
    }

    public final boolean Ago() {
        return this.A0q;
    }

    public final boolean Ahq() {
        return this.A0r;
    }

    public final void AtY(int i, int i2) {
        this.A0a = i;
        if (this.A0c < 0) {
            this.A0c = (int) (((double) C06220Of.A08(getContext())) * (1.0d - ((Double) AnonymousClass0L6.A02(this.A0K, AnonymousClass0L7.COMMENTS_BOTTOM_SHEET_INITIAL_OPENING_RATIO, "comment_view_initial_open_ratio", Double.valueOf(0.9d), (AnonymousClass04H) null)).doubleValue()));
        }
        A01(i2);
        C06220Of.A0L(this.mRootView, Math.min(this.A0c, i) + i2);
    }

    public final void Avk(AnonymousClass1NJ r8, int i, int i2, IgImageView igImageView) {
        boolean z;
        if (AnonymousClass1UR.AD_DESTINATION_DIRECT_MESSAGE.equals(C37201jH.A00(r8, i2, getContext()).A00)) {
            if (getActivity() == null) {
                z = false;
            } else {
                View view = this.mView;
                if (view != null) {
                    C06220Of.A0E(view);
                }
                z = true;
            }
            if (!z) {
                return;
            }
        }
        AnonymousClass0C1 r2 = this.A0K;
        C37111j8 r6 = new C37111j8(r2, r8);
        r6.A00 = i2;
        r6.A01 = i;
        C215679Rh r1 = new C215679Rh(r2, getActivity(), Constants.A0N, this, r6);
        r1.A06 = r8;
        r1.A00 = i2;
        r1.A02 = i;
        r1.A00(r8, r6, igImageView);
        r1.A0D = true;
        new C215639Rd(r1).A02();
    }

    public final void AwG(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        this.A0A.AwG(reel, gradientSpinnerAvatarView);
    }

    public final void AxI(instagramComment r2, boolean z) {
        this.A0A.AxI(r2, z);
    }

    public final void AxK(instagramComment r2) {
        this.A0A.AxK(r2);
    }

    public final void AxP(instagramComment r2) {
        this.A0A.AxP(r2);
    }

    public final void B8u(instagramComment r2, C67872y1 r3, C67592xV r4) {
        this.A0A.B8u(r2, r3, r4);
    }

    public final void B93(instagramComment r2) {
        this.A0A.B93(r2);
    }

    public final void B97(instagramComment r2) {
        this.A0A.B97(r2);
    }

    public final void BEp() {
        this.A0I.A3L = true;
        this.A03.A05();
        A06(this);
    }

    public final void BEr(instagramComment r6) {
        AnonymousClass0ZA.A08(this.A0v, this.A0k);
        AnonymousClass6QA r4 = new AnonymousClass6QA(this, r6);
        this.A0k = r4;
        AnonymousClass0ZA.A09(this.A0v, r4, 500, -1119639083);
    }

    public final void BEs(instagramComment r6, boolean z) {
        if (!this.A0Q) {
            this.A0O = false;
        }
        this.A02.A0P(this.A0I);
        if (!this.A0R) {
            this.A02.A0O(r6);
        }
        this.A0B.A0A(r6);
        if (z) {
            String str = r6.commentText;
            AnonymousClass0C1 r1 = this.A0K;
            String APo = this.A0I.APo();
            C15890nh r2 = new C15890nh(r1);
            r2.A09 = Constants.ONE;
            r2.A0C = "media/comment/check_offensive_comment/";
            r2.A06(C157976os.class, false);
            r2.A09("comment_text", str);
            r2.A09("media_id", APo);
            r2.A0G = true;
            C17850qu A032 = r2.A03();
            A032.A00 = new C157966or(this.A0K, r6, this);
            schedule(A032);
        }
    }

    public final void BEt(String str, instagramComment r7) {
        C157996ou r0 = r7.A0B;
        if (r0 != null) {
            AnonymousClass0QT r2 = this.A0G;
            String str2 = r0.A00;
            boolean z = r0.A01;
            C28671Ckn ckn = new C28671Ckn(r2.A02("instagram_wellbeing_warning_system_success_creation"));
            ckn.A08("source_of_action", "comment_create");
            ckn.A08("text_language", str2);
            ckn.A04("is_offensive", Boolean.valueOf(z));
            ckn.A01();
        }
        if (((C67592xV) this.A02.A0C.get(str)) != null) {
            C67242wq r3 = this.A02;
            r3.A0C.put(r7.AS8(), (C67592xV) r3.A0C.get(str));
        }
        this.A02.A0P(this.A0I);
        A04(this);
    }

    public final void BII() {
        this.A02.A0P(this.A0I);
    }

    public final void BIK() {
        this.A02.A0P(this.A0I);
    }

    public final void BIL(Set set) {
        C23300zv.A00(this.A0K).BXT(new C52502Pb(this.A0I, set));
        this.A05.A06 = null;
        if (isAdded()) {
            this.A02.A0E.A05.clear();
            this.A02.A0P(this.A0I);
            return;
        }
        AnonymousClass1NJ r1 = this.A0I;
        if (r1 != null) {
            r1.A6t(this.A0K);
        }
    }

    public final void BIg(instagramComment r2) {
        this.A0A.BIg(r2);
    }

    public final void BJi(instagramComment r2) {
        this.A0A.BJi(r2);
    }

    public final void BJj(instagramComment r2, Integer num) {
        this.A0A.BJj(r2, num);
    }

    public final void BJl(instagramComment r2) {
        this.A0A.BJl(r2);
    }

    public final void BK7(instagramComment r2) {
        this.A0A.BK7(r2);
    }

    public final void BMI(instagramComment r2) {
        this.A0A.BMI(r2);
    }

    public final void BT6(instagramComment r2) {
        this.A0A.BT6(r2);
    }

    public final void BTz(C13300iJ r2, String str) {
        this.A0A.BTz(r2, str);
    }

    public final C06270Ok BYN() {
        Bundle bundle = this.mArguments;
        C06270Ok A002 = C06270Ok.A00();
        if (bundle.containsKey("hashtag_logger_extras")) {
            A002.A0C((HashMap) bundle.getSerializable("hashtag_logger_extras"));
        }
        this.A14.A02(A002);
        return A002;
    }

    public final Map BYU() {
        AnonymousClass1NJ r1 = this.A0I;
        if (r1 == null || r1.A0c(this.A0K) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MemoryDumpUploadJob.EXTRA_USER_ID, this.A0I.A0c(this.A0K).getId());
        return hashMap;
    }

    public final void Bel() {
        this.A0B.A07();
    }

    public final void BgE(AnonymousClass2TI r3, C51312Ke r4) {
        this.A0g = r3;
        AnonymousClass6MA r1 = new AnonymousClass6MA(this, r4);
        this.A0h = r1;
        C67432x9 r0 = this.A0A;
        if (r0 != null) {
            r0.A03 = r3;
            r0.A04 = r1;
            C67392x5 r02 = r0.A01;
            if (r02 != null) {
                r02.A01 = r3;
                r02.A02 = r1;
            }
        }
        C67162wi r03 = this.A07;
        if (r03 != null) {
            r03.BgE(r3, r1);
        }
        C67392x5 r04 = this.A09;
        if (r04 != null) {
            r04.A01 = r3;
            r04.A02 = r1;
        }
    }

    public final String getModuleName() {
        return this.A0l;
    }

    public final C06590Pq getSession() {
        return this.A0K;
    }

    public final boolean onBackPressed() {
        if (!this.A0T || !this.A04.A05()) {
            return false;
        }
        this.A02.A0M();
        this.A02.A0N();
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        A02(8);
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00e6, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0.A0K, p000X.AnonymousClass0L7.COMMENTS_RECYCLERVIEW_MIGRATION_LAUNCHER, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0450, code lost:
        if (r0.A0V != false) goto L_0x0452;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x04be  */
    public final void onCreate(Bundle bundle) {
        boolean z;
        C29681Qv r4;
        AnonymousClass1NJ r7;
        AnonymousClass1NJ r3;
        C67162wi r8;
        AnonymousClass2TI r32;
        boolean z2;
        boolean z3;
        AnonymousClass2TI r33;
        AnonymousClass2TI r42;
        String A0E2;
        int A022 = AnonymousClass0Z0.A02(-88424746);
        Bundle bundle2 = this.mArguments;
        String string = bundle2.getString("CommentThreadFragment.MEDIA_ID");
        this.A0m = bundle2.getString("CommentThreadFragment.PARENT_MEDIA_ID");
        this.A0K = AnonymousClass0J1.A06(bundle2);
        this.A08 = new AnonymousClass2M8();
        this.A0e = C27491Ib.A00(getActivity());
        this.A08.A0F(getContext(), this, C26441Dh.A00(this.A0K));
        AnonymousClass00B.A01.markerStart(16646145);
        this.A0j = new C67002wR(this, bundle2);
        this.A0I = AnonymousClass1PZ.A00(this.A0K).A02(string);
        this.A00 = bundle2.getInt("CommentThreadFragment.MEDIA_CAROUSEL_INDEX", 0);
        this.A01 = bundle2.getInt("CommentThreadFragment.MEDIA_POSITION_IN_FEED", 0);
        this.A0s = bundle2.getBoolean("CommentThreadFragment.INTENT_EXTRA_MEDIA_IS_CAROUSEL_BUMPED_POST", false);
        C67012wS r1 = new C67012wS(this);
        this.A0r = bundle2.getBoolean("CommentThreadFragment.IS_SPONSORED");
        this.A0q = bundle2.getBoolean("CommentThreadFragment.IS_ORGANIC");
        this.A0L = C67022wT.A00(bundle2.getInt("CommentThreadFragment.SCROLL_BEHAVIOR", 0));
        this.A0W = bundle2.getBoolean("CommentThreadFragment.PERMALINK_ENABLED");
        this.A0t = bundle2.getBoolean("CommentThreadFragment.SHOW_KEYBOARD");
        this.A0n = bundle2.getBoolean("CommentThreadFragment.INTENT_EXTRA_DISALLOW_STICKY_TAB_VISIBILITY_CHANGES");
        this.A0N = bundle2.getString("CommentThreadFragment.TARGET_COMMENT_ID");
        this.A0Z = bundle2.getBoolean("CommentThreadFragment.SHOW_SINGLE_MEDIA_TITLE", false);
        this.A0V = bundle2.getBoolean("CommentThreadFragment.IGTV_DRAWER_MODE", false);
        boolean z4 = bundle2.getBoolean("CommentThreadFragment.BOTTOM_SHEET_MODE", false);
        this.A0R = z4;
        if (!z4) {
            z = true;
        }
        z = false;
        this.A0u = z;
        this.A0o = bundle2.getBoolean("CommentThreadFragment.FORCE_FETCH_MEDIA", false);
        Bundle bundle3 = bundle2.getBundle("CommentThreadFragment.INTENT_EXTRA_ANALYTICS");
        if (bundle3 != null) {
            this.A14.A00(bundle3);
        }
        String string2 = this.mArguments.getString("CommentThreadFragment.ANALYTICS_MODULE");
        if (TextUtils.isEmpty(string2)) {
            String string3 = this.mArguments.getString("CommentThreadFragment.SOURCE_MODULE", (String) null);
            if (this.mArguments.getBoolean("CommentThreadFragment.IS_SELF_MEDIA")) {
                string2 = "self_comments_v2";
            } else {
                string2 = InAppNotificationDestinations.COMMENTS_V2;
            }
            if (!TextUtils.isEmpty(string3)) {
                if (string3.startsWith(string2)) {
                    A0E2 = "";
                } else {
                    A0E2 = AnonymousClass000.A0E(string2, "_");
                }
                this.A0l = AnonymousClass000.A0E(A0E2, string3);
                if (!this.A0R) {
                    r4 = new C151536ds(this, this, this.A0K);
                } else {
                    r4 = new C29671Qu(this, this, this.A0K);
                }
                C29681Qv r43 = r4;
                r43.BkV(this.A0j);
                registerLifecycleListener(r43);
                this.A0D = new AnonymousClass1R8(this, this.A0K, this.A0j);
                AnonymousClass0C1 r9 = this.A0K;
                this.A0G = AnonymousClass0QT.A00(r9, this);
                r7 = this.A0I;
                this.A0F = new C67032wU(this, r9, r7, this.A01, this.A00, this.A0s);
                if (r7 != null) {
                    A00();
                }
                Context context = getContext();
                AnonymousClass0C1 r12 = this.A0K;
                AnonymousClass1R8 r11 = this.A0D;
                C66982wP r10 = this.A15;
                boolean z5 = this.A0s;
                int i = this.A01;
                AnonymousClass0C1 r19 = r12;
                CommentComposerController commentComposerController = new CommentComposerController(context, r19, this, this, this, r11, r10, z5, i, this.A00, bundle2.getBoolean("CommentThreadFragment.HIDE_EMOJI_BAR", false), this.A0R);
                this.A03 = commentComposerController;
                r3 = this.A0I;
                if (r3 != null) {
                    commentComposerController.A08(r3);
                }
                registerLifecycleListener(this.A03);
                if (!C18320rf.A00(this.A0K, false)) {
                    r8 = new C67162wi(getContext(), this.A0K, AnonymousClass1L8.A00(this), this.A0G);
                } else {
                    r8 = null;
                }
                this.A07 = r8;
                if (!(r8 == null || (r42 = this.A0g) == null)) {
                    r8.BgE(r42, this.A0h);
                }
                if (C17050pb.A09(this.A0I, this.A00, getContext(), this.A0K)) {
                    CYX A002 = CYX.A00(getContext());
                    this.A0J = A002;
                    registerLifecycleListener(A002);
                }
                C28051Kf A003 = C28021Kc.A00();
                this.A0f = A003;
                C67192wl r27 = new C67192wl(getContext(), this.A0K, A003, this.A0D, this.A0G);
                Context context2 = getContext();
                AnonymousClass0C1 r82 = this.A0K;
                AnonymousClass1I6 r6 = this.A0j;
                AnonymousClass1ST r14 = new AnonymousClass1ST(r82, this, this.A0f, AnonymousClass1SU.A00(context2, r82, r6, this, new C29951Rx(r82, r6), C17070pd.COMMENTS_VIEW, (AnonymousClass1LO) null));
                this.A0d = new C67212wn(this.A0D, this, this.A0K, this.A0I);
                boolean z6 = bundle2.getBoolean("CommentThreadFragment.USE_SIMPLE_LAYOUT", false);
                Context context3 = getContext();
                AnonymousClass0C1 r92 = this.A0K;
                C67252wr r83 = new C67252wr(this);
                C62632o4 r72 = new C62632o4(getActivity(), r92);
                C67212wn r13 = this.A0d;
                AnonymousClass0C1 r20 = r92;
                C67252wr r21 = r83;
                C67012wS r22 = r1;
                C62632o4 r24 = r72;
                C67212wn r25 = r13;
                C67242wq r17 = new C67242wq(context3, this, r20, r21, r22, this, r24, r25, C29191Oy.A02(r92), r27, this.A0w, new C67262ws(this), this.A12, bundle2.getBoolean("CommentThreadFragment.EXTRA_SHOW_CAPTION", true), this.A01, this.A00, z6);
                this.A02 = r17;
                this.A0d.A00 = r17;
                Integer num = Constants.ONE;
                AnonymousClass0C1 r93 = this.A0K;
                AnonymousClass0L7 r84 = AnonymousClass0L7.AUTO_LOAD_MORE_ON_SCROLL_STATE_IDLE;
                this.A0H = new C36281hn(r17, num, ((Integer) AnonymousClass0L6.A02(r93, r84, "comment_prefetch_window", 1, (AnonymousClass04H) null)).intValue(), r1, ((Boolean) AnonymousClass0L6.A02(this.A0K, r84, "is_enabled_for_comment", false, (AnonymousClass04H) null)).booleanValue());
                AnonymousClass1LO r5 = new AnonymousClass1LO(this, false, getContext(), this.A0K);
                C67242wq r2 = this.A02;
                AnonymousClass1RA r34 = new AnonymousClass1RA(this, (C27301Hh) null, r2, this.A0y);
                AnonymousClass1AM r37 = this.mFragmentManager;
                AnonymousClass0C1 r44 = this.A0K;
                CommentComposerController commentComposerController2 = this.A03;
                String AVo = this.A0j.AVo();
                C28051Kf r15 = this.A0f;
                C67242wq r212 = r2;
                AnonymousClass1RJ r62 = new AnonymousClass1RJ(getContext(), r44, this, r2, AVo);
                AnonymousClass1RJ r85 = r62;
                C29791Rg r94 = new C29791Rg(r44, getActivity(), r2, this);
                r94.A04 = true;
                C29851Rn r73 = new C29851Rn(getActivity(), r44, r2, r85);
                C68072yO r112 = new C68072yO();
                AnonymousClass1S3 r102 = new AnonymousClass1S3(this, this, r2, new AnonymousClass1S2(getContext(), r44, (C27371Ho) this, (AnonymousClass1PL) r2, r5, (AnonymousClass1I6) null));
                AnonymousClass1RD r63 = new AnonymousClass1RD(getActivity(), new AnonymousClass1RH(r44));
                AnonymousClass1UV r132 = r30;
                AnonymousClass1UV r30 = new AnonymousClass1UV(this, r37, (AnonymousClass1I6) null, this, r44, r112);
                AnonymousClass1AM r192 = r37;
                AnonymousClass1S3 r23 = r102;
                C66892wG r172 = new C66892wG(this, r192, this, r212, r62, r23, r34, r94, r73, r44, r5, r63, r30, C29181Ox.A00(getContext(), r44), commentComposerController2, r15, r14);
                C30691Uv r173 = new C30691Uv(getContext(), this, r37, r212, this, r44);
                r173.A09 = r34;
                r173.A0B = r85;
                r173.A01 = r5;
                r173.A04 = r102;
                r173.A0E = r94;
                r173.A05 = r172;
                r173.A0G = r73;
                r173.A0A = r63;
                r173.A0D = r112;
                r173.A06 = r132;
                r173.A0L = true;
                r173.A00 = 23592978;
                AnonymousClass1VH A004 = r173.A00();
                this.A0y.A0E(A004);
                registerLifecycleListener(A004);
                FragmentActivity activity = getActivity();
                Context context4 = getContext();
                AnonymousClass0C1 r64 = this.A0K;
                AnonymousClass1NJ r74 = this.A0I;
                C67242wq r86 = this.A02;
                CommentComposerController commentComposerController3 = this.A03;
                AnonymousClass1R8 r26 = this.A0D;
                this.A05 = new C67362x2(activity, context4, r64, r74, r86, commentComposerController3, this, r26, this.A0R);
                this.A04 = new C67372x3(this, r64, r26);
                AnonymousClass0C1 r65 = this.A0K;
                AnonymousClass1NJ r52 = this.A0I;
                C67242wq r45 = this.A02;
                AnonymousClass0QT r35 = this.A0G;
                this.A09 = new C67392x5(this, r65, this, r52, r45, r35, this.A03, this.A07, this);
                this.A06 = new C67402x6(getContext(), r65, this.A0D);
                r32 = this.A0g;
                if (r32 != null) {
                    C67392x5 r28 = this.A09;
                    C51312Ke r16 = this.A0h;
                    r28.A01 = r32;
                    r28.A02 = r16;
                }
                AnonymousClass0C1 r103 = this.A0K;
                C67242wq r95 = this.A02;
                C67242wq r222 = r95;
                AnonymousClass1NJ r87 = this.A0I;
                AnonymousClass1I6 r75 = this.A0j;
                CommentComposerController commentComposerController4 = this.A03;
                C67162wi r53 = this.A07;
                CYX cyx = this.A0J;
                C67362x2 r36 = this.A05;
                z2 = this.A0R;
                if (!z2) {
                    z3 = false;
                }
                z3 = true;
                C67432x9 r174 = new C67432x9(this, r103, this, this, r222, r95, r87, r75, commentComposerController4, r53, this, cyx, r36, this, this, z3, z2);
                this.A0A = r174;
                r33 = this.A0g;
                if (r33 != null) {
                    C51312Ke r29 = this.A0h;
                    r174.A03 = r33;
                    r174.A04 = r29;
                    C67392x5 r18 = r174.A01;
                    if (r18 != null) {
                        r18.A01 = r33;
                        r18.A02 = r29;
                    }
                }
                registerLifecycleListener(r174);
                AnonymousClass0C1 r210 = this.A0K;
                registerLifecycleListener(new C30841Vk(r210, this.A02, this, this, C29191Oy.A02(r210), this.A0j));
                registerLifecycleListener(new C29631Qq(this.A0K, new C67442xA(this)));
                super.onCreate(bundle);
                AnonymousClass0Z0.A09(1351442508, A022);
            }
        }
        this.A0l = string2;
        if (!this.A0R) {
        }
        C29681Qv r432 = r4;
        r432.BkV(this.A0j);
        registerLifecycleListener(r432);
        this.A0D = new AnonymousClass1R8(this, this.A0K, this.A0j);
        AnonymousClass0C1 r96 = this.A0K;
        this.A0G = AnonymousClass0QT.A00(r96, this);
        r7 = this.A0I;
        this.A0F = new C67032wU(this, r96, r7, this.A01, this.A00, this.A0s);
        if (r7 != null) {
        }
        Context context5 = getContext();
        AnonymousClass0C1 r122 = this.A0K;
        AnonymousClass1R8 r113 = this.A0D;
        C66982wP r104 = this.A15;
        boolean z52 = this.A0s;
        int i2 = this.A01;
        AnonymousClass0C1 r193 = r122;
        CommentComposerController commentComposerController5 = new CommentComposerController(context5, r193, this, this, this, r113, r104, z52, i2, this.A00, bundle2.getBoolean("CommentThreadFragment.HIDE_EMOJI_BAR", false), this.A0R);
        this.A03 = commentComposerController5;
        r3 = this.A0I;
        if (r3 != null) {
        }
        registerLifecycleListener(this.A03);
        if (!C18320rf.A00(this.A0K, false)) {
        }
        this.A07 = r8;
        r8.BgE(r42, this.A0h);
        if (C17050pb.A09(this.A0I, this.A00, getContext(), this.A0K)) {
        }
        C28051Kf A0032 = C28021Kc.A00();
        this.A0f = A0032;
        C67192wl r272 = new C67192wl(getContext(), this.A0K, A0032, this.A0D, this.A0G);
        Context context22 = getContext();
        AnonymousClass0C1 r822 = this.A0K;
        AnonymousClass1I6 r66 = this.A0j;
        AnonymousClass1ST r142 = new AnonymousClass1ST(r822, this, this.A0f, AnonymousClass1SU.A00(context22, r822, r66, this, new C29951Rx(r822, r66), C17070pd.COMMENTS_VIEW, (AnonymousClass1LO) null));
        this.A0d = new C67212wn(this.A0D, this, this.A0K, this.A0I);
        boolean z62 = bundle2.getBoolean("CommentThreadFragment.USE_SIMPLE_LAYOUT", false);
        Context context32 = getContext();
        AnonymousClass0C1 r922 = this.A0K;
        C67252wr r832 = new C67252wr(this);
        C62632o4 r722 = new C62632o4(getActivity(), r922);
        C67212wn r133 = this.A0d;
        AnonymousClass0C1 r202 = r922;
        C67252wr r213 = r832;
        C67012wS r223 = r1;
        C62632o4 r242 = r722;
        C67212wn r252 = r133;
        C67242wq r175 = new C67242wq(context32, this, r202, r213, r223, this, r242, r252, C29191Oy.A02(r922), r272, this.A0w, new C67262ws(this), this.A12, bundle2.getBoolean("CommentThreadFragment.EXTRA_SHOW_CAPTION", true), this.A01, this.A00, z62);
        this.A02 = r175;
        this.A0d.A00 = r175;
        Integer num2 = Constants.ONE;
        AnonymousClass0C1 r932 = this.A0K;
        AnonymousClass0L7 r842 = AnonymousClass0L7.AUTO_LOAD_MORE_ON_SCROLL_STATE_IDLE;
        this.A0H = new C36281hn(r175, num2, ((Integer) AnonymousClass0L6.A02(r932, r842, "comment_prefetch_window", 1, (AnonymousClass04H) null)).intValue(), r1, ((Boolean) AnonymousClass0L6.A02(this.A0K, r842, "is_enabled_for_comment", false, (AnonymousClass04H) null)).booleanValue());
        AnonymousClass1LO r54 = new AnonymousClass1LO(this, false, getContext(), this.A0K);
        C67242wq r211 = this.A02;
        AnonymousClass1RA r342 = new AnonymousClass1RA(this, (C27301Hh) null, r211, this.A0y);
        AnonymousClass1AM r372 = this.mFragmentManager;
        AnonymousClass0C1 r442 = this.A0K;
        CommentComposerController commentComposerController22 = this.A03;
        String AVo2 = this.A0j.AVo();
        C28051Kf r152 = this.A0f;
        C67242wq r2122 = r211;
        AnonymousClass1RJ r622 = new AnonymousClass1RJ(getContext(), r442, this, r211, AVo2);
        AnonymousClass1RJ r852 = r622;
        C29791Rg r942 = new C29791Rg(r442, getActivity(), r211, this);
        r942.A04 = true;
        C29851Rn r732 = new C29851Rn(getActivity(), r442, r211, r852);
        C68072yO r1122 = new C68072yO();
        AnonymousClass1S3 r1022 = new AnonymousClass1S3(this, this, r211, new AnonymousClass1S2(getContext(), r442, (C27371Ho) this, (AnonymousClass1PL) r211, r54, (AnonymousClass1I6) null));
        AnonymousClass1RD r632 = new AnonymousClass1RD(getActivity(), new AnonymousClass1RH(r442));
        AnonymousClass1UV r1322 = r30;
        AnonymousClass1UV r302 = new AnonymousClass1UV(this, r372, (AnonymousClass1I6) null, this, r442, r1122);
        AnonymousClass1AM r1922 = r372;
        AnonymousClass1S3 r232 = r1022;
        C66892wG r1722 = new C66892wG(this, r1922, this, r2122, r622, r232, r342, r942, r732, r442, r54, r632, r302, C29181Ox.A00(getContext(), r442), commentComposerController22, r152, r142);
        C30691Uv r1732 = new C30691Uv(getContext(), this, r372, r2122, this, r442);
        r1732.A09 = r342;
        r1732.A0B = r852;
        r1732.A01 = r54;
        r1732.A04 = r1022;
        r1732.A0E = r942;
        r1732.A05 = r1722;
        r1732.A0G = r732;
        r1732.A0A = r632;
        r1732.A0D = r1122;
        r1732.A06 = r1322;
        r1732.A0L = true;
        r1732.A00 = 23592978;
        AnonymousClass1VH A0042 = r1732.A00();
        this.A0y.A0E(A0042);
        registerLifecycleListener(A0042);
        FragmentActivity activity2 = getActivity();
        Context context42 = getContext();
        AnonymousClass0C1 r642 = this.A0K;
        AnonymousClass1NJ r742 = this.A0I;
        C67242wq r862 = this.A02;
        CommentComposerController commentComposerController32 = this.A03;
        AnonymousClass1R8 r262 = this.A0D;
        this.A05 = new C67362x2(activity2, context42, r642, r742, r862, commentComposerController32, this, r262, this.A0R);
        this.A04 = new C67372x3(this, r642, r262);
        AnonymousClass0C1 r652 = this.A0K;
        AnonymousClass1NJ r522 = this.A0I;
        C67242wq r452 = this.A02;
        AnonymousClass0QT r352 = this.A0G;
        this.A09 = new C67392x5(this, r652, this, r522, r452, r352, this.A03, this.A07, this);
        this.A06 = new C67402x6(getContext(), r652, this.A0D);
        r32 = this.A0g;
        if (r32 != null) {
        }
        AnonymousClass0C1 r1032 = this.A0K;
        C67242wq r952 = this.A02;
        C67242wq r2222 = r952;
        AnonymousClass1NJ r872 = this.A0I;
        AnonymousClass1I6 r752 = this.A0j;
        CommentComposerController commentComposerController42 = this.A03;
        C67162wi r532 = this.A07;
        CYX cyx2 = this.A0J;
        C67362x2 r362 = this.A05;
        z2 = this.A0R;
        if (!z2) {
        }
        z3 = true;
        C67432x9 r1742 = new C67432x9(this, r1032, this, this, r2222, r952, r872, r752, commentComposerController42, r532, this, cyx2, r362, this, this, z3, z2);
        this.A0A = r1742;
        r33 = this.A0g;
        if (r33 != null) {
        }
        registerLifecycleListener(r1742);
        AnonymousClass0C1 r2102 = this.A0K;
        registerLifecycleListener(new C30841Vk(r2102, this.A02, this, this, C29191Oy.A02(r2102), this.A0j));
        registerLifecycleListener(new C29631Qq(this.A0K, new C67442xA(this)));
        super.onCreate(bundle);
        AnonymousClass0Z0.A09(1351442508, A022);
    }

    private void A01(int i) {
        View view;
        View findViewById;
        int A082 = C06220Of.A08(requireContext());
        AnonymousClass1HD r0 = this.mParentFragment;
        if (r0 != null && (view = r0.mView) != null && (findViewById = view.findViewById(C0003R.C0005id.bottom_sheet_nav_bar_divider)) != null) {
            int y = (int) findViewById.getY();
            int A032 = this.A03.A03();
            CommentComposerController commentComposerController = this.A03;
            int i2 = (((A082 - y) - this.A0a) - i) - A032;
            if (i2 < 0) {
                i2 = 0;
            }
            C67502xM r1 = commentComposerController.mViewHolder;
            boolean z = false;
            if (r1 != null) {
                z = true;
            }
            if (z) {
                r1.A0B.setDropDownHeight(i2);
            }
        }
    }

    public static void A05(CommentThreadFragment commentThreadFragment) {
        if (commentThreadFragment.isVisible()) {
            commentThreadFragment.getScrollingViewProxy().setIsLoading(false);
            AnonymousClass1XN r0 = commentThreadFragment.A0i;
            if (r0 != null) {
                r0.setIsLoading(false);
            }
        }
        C26701Ew A002 = C26701Ew.A00(commentThreadFragment.A0K);
        AnonymousClass1NJ r5 = commentThreadFragment.A0I;
        ArrayList<instagramComment> arrayList = new ArrayList<>();
        Iterator it = A002.A05().iterator();
        while (it.hasNext()) {
            String id = r5.getId();
            instagramComment r1 = ((AnonymousClass6UV) it.next()).A03;
            if (id.equals(r1.mediaId)) {
                arrayList.add(r1);
            }
        }
        for (instagramComment r2 : arrayList) {
            r2.A05(commentThreadFragment.A0I);
            if (commentThreadFragment.A0Q) {
                commentThreadFragment.A0I.A3k.A09(r2, true);
            } else {
                commentThreadFragment.A0I.A3k.A09(r2, false);
            }
        }
        commentThreadFragment.A02.A0P(commentThreadFragment.A0I);
        C67032wU r02 = commentThreadFragment.A0F;
        AnonymousClass1NJ r12 = commentThreadFragment.A0I;
        r02.A00 = r12;
        commentThreadFragment.A03.A08(r12);
        C67432x9 r03 = commentThreadFragment.A0A;
        AnonymousClass1NJ r13 = commentThreadFragment.A0I;
        r03.A02 = r13;
        commentThreadFragment.A05.A07 = r13;
        commentThreadFragment.A09.A00 = r13;
        C67212wn r04 = commentThreadFragment.A0d;
        r04.A01 = r13;
        r04.A05.A00 = r13;
        A06(commentThreadFragment);
        String str = commentThreadFragment.A0m;
        if (str != null) {
            commentThreadFragment.A03.A03 = str;
        }
        if (!commentThreadFragment.A0P || commentThreadFragment.A0S) {
            if (commentThreadFragment.A0W) {
                commentThreadFragment.A0C.A02();
            } else {
                commentThreadFragment.A0C.A01();
            }
            commentThreadFragment.A00();
            if (commentThreadFragment.A07 != null && C14090jk.A03(commentThreadFragment.A0K, commentThreadFragment.A0I) && !((Boolean) AnonymousClass0L6.A02(commentThreadFragment.A0K, AnonymousClass0L7.REDUCE_RESTRICT_CALLS_IN_COMMENTS_LAUNCHER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                C67162wi r22 = commentThreadFragment.A07;
                C17850qu A012 = C18320rf.A00.A01(r22.A04);
                A012.A00 = new C109514nh(r22);
                C12810hQ.A02(A012);
                return;
            }
            return;
        }
        commentThreadFragment.A0C.A01();
    }

    public static void A06(CommentThreadFragment commentThreadFragment) {
        C36841ih APu;
        if (commentThreadFragment.isResumed()) {
            AnonymousClass1NJ r1 = commentThreadFragment.A0I;
            if (r1 == null || (APu = commentThreadFragment.A02.APu(r1)) == null || APu.Ai7() || r1.A3L) {
                AnonymousClass1XN r0 = commentThreadFragment.A0i;
                if (r0 == null) {
                    commentThreadFragment.getScrollingViewProxy().AC3();
                } else {
                    r0.AC3();
                }
            } else {
                AnonymousClass1XN r02 = commentThreadFragment.A0i;
                if (r02 == null) {
                    commentThreadFragment.getScrollingViewProxy().AD3();
                } else {
                    r02.AD3();
                }
            }
        }
    }

    public final boolean AhU() {
        if (!isResumed() || !getScrollingViewProxy().AeF()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.equals(com.instagram.realtimeclient.RealtimeProtocol.USERS_BLOCKING) == false) goto L_0x0023;
     */
    public final void BEq(instagramComment r7) {
        boolean z;
        Context context;
        String str;
        List list;
        FragmentActivity activity;
        boolean z2;
        if (getContext() == null || (list = r7.A0Z) == null || list.isEmpty() || (activity = getActivity()) == null) {
            z = false;
        } else {
            String str2 = r7.A0N;
            if (str2 != null) {
                z2 = true;
            }
            z2 = false;
            AnonymousClass2OA A012 = AnonymousClass4NT.A01(getContext(), Boolean.valueOf(z2).booleanValue(), list, this.A0K, activity);
            A012.A08(C0003R.string.mentions_settings_error_dialog_edit_comment, new AnonymousClass6MC(this, r7));
            A012.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
            A012.A03().show();
            z = true;
        }
        if (!z && this.A0R && (context = getContext()) != null) {
            Integer num = r7.A0I;
            if (num == Constants.ZERO) {
                str = getResources().getString(C0003R.string.offline_status_message);
            } else if (num == Constants.ONE) {
                str = r7.A0P;
            } else {
                str = null;
            }
            if (str != null) {
                C53642Tq.A01(context, str, 1).show();
            }
        }
        this.A02.A0P(this.A0I);
    }

    public final void BIJ() {
        if (isAdded()) {
            Context context = getContext();
            AnonymousClass5F9.A03(context, context.getString(C0003R.string.failed_delete_comment), 0);
            this.A05.A06 = null;
            C67242wq r2 = this.A02;
            C67282wu r0 = r2.A0E;
            r0.A02.addAll(r0.A05);
            r2.A0E.A05.clear();
            this.A02.A0P(this.A0I);
            if (this.A0R) {
                this.A02.A0M();
            }
        }
    }

    public final C06270Ok BYO(AnonymousClass1NJ r2) {
        return BYN();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b0, code lost:
        if (r1 != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0244, code lost:
        if (((java.lang.Boolean) r10.A04.getValue()).booleanValue() != false) goto L_0x0246;
     */
    public final void configureActionBar(AnonymousClass1EX r16) {
        String quantityString;
        boolean z;
        boolean z2;
        int i;
        int i2;
        String str;
        boolean z3;
        Context context;
        int i3;
        if (isAdded()) {
            int size = this.A02.A0E.A02.size();
            if (size == 0) {
                if (this.A0Z) {
                    AnonymousClass1NJ r1 = this.A0I;
                    if (r1 != null) {
                        if (!r1.A1V()) {
                            switch (r1.APx().ordinal()) {
                                case 0:
                                    context = getContext();
                                    i3 = C0003R.string.photo;
                                    break;
                                case 1:
                                    context = getContext();
                                    i3 = C0003R.string.video;
                                    break;
                                default:
                                    context = getContext();
                                    i3 = C0003R.string.post_title;
                                    break;
                            }
                        } else {
                            context = getContext();
                            i3 = C0003R.string.promotion;
                        }
                    } else {
                        quantityString = "";
                    }
                } else {
                    context = getContext();
                    i3 = C0003R.string.comments;
                }
                quantityString = context.getString(i3);
            } else {
                quantityString = getContext().getResources().getQuantityString(C0003R.plurals.x_selected, size, new Object[]{Integer.valueOf(size)});
            }
            AnonymousClass1EX r8 = r16;
            r8.setTitle(quantityString);
            r8.Bo6(true);
            r8.BmP(this);
            C67292wv r5 = this.A02.A0E.A02;
            int size2 = r5.size();
            if (size2 == 0) {
                this.A0T = false;
                r8.BmE(C67852xw.A00(Constants.ZERO).A00());
                AnonymousClass1NJ r12 = this.A0I;
                if (r12 != null && C14090jk.A03(this.A0K, r12) && this.A04.A05()) {
                    r8.A4N(Constants.ZERO, new C157866oh(this));
                } else if (this.A0I != null && this.A0Y) {
                    C33831dZ r13 = new C33831dZ();
                    r13.A02 = C0003R.C0004drawable.instagram_direct_outline_24;
                    r13.A01 = C0003R.string.share;
                    r13.A05 = new C67962yB(this);
                    r8.A4J(r13.A00());
                }
            } else {
                this.A0T = true;
                Context context2 = getContext();
                AnonymousClass11J.A00(context2);
                int A002 = C019000b.A00(context2, C0003R.color.white);
                C67372x3 r9 = this.A04;
                AnonymousClass1NJ r14 = this.A0I;
                if (r14 != null && C14090jk.A03(r9.A06, r14) && r5.size() >= 2) {
                    Iterator it = r5.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C13300iJ AZf = ((instagramComment) it.next()).AZf();
                            if (AZf != null && !C14090jk.A06(r9.A06, AZf.getId())) {
                                z = r9.A05();
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                    C157786oY r2 = new C157786oY(this);
                    if (((Boolean) AnonymousClass0L6.A02(this.A0K, AnonymousClass0L7.COMMENT_MANAGEMENT_ADOPTION_LAUNCHER, "bulk_icons_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                        C33831dZ r15 = new C33831dZ();
                        r15.A02 = C0003R.C0004drawable.instagram_circle_x_outline_24;
                        r15.A01 = C0003R.string.comment_management_bulk_block_button_description;
                        r15.A05 = new C157906ol(this, r5, r2);
                        r8.A4J(r15.A00());
                        C33831dZ r17 = new C33831dZ();
                        r17.A02 = C0003R.C0004drawable.instagram_restrict_outline_24;
                        r17.A01 = C0003R.string.comment_management_bulk_restrict_button_description;
                        r17.A05 = new C157916om(this, r5, r2);
                        r8.A4J(r17.A00());
                    } else {
                        View A4O = r8.A4O(Constants.ZERO, new C157926on(this, r5, r2));
                        C67372x3 r92 = this.A04;
                        if (((Boolean) AnonymousClass0L6.A02(r92.A06, AnonymousClass0L7.COMMENT_MANAGEMENT_LAUNCHER, "is_tooltip_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                            C16180oA A003 = C16180oA.A00(r92.A06);
                            boolean z4 = true;
                            boolean z5 = false;
                            if (A003.A00.getInt("bulk_comment_options_nux_countdown", 3) > 0) {
                                z5 = true;
                            }
                            if (A003.A00.getLong("bulk_comment_options_last_shown_time_ms", 0) + C67372x3.A07 >= System.currentTimeMillis()) {
                                z4 = false;
                            }
                            if (z5 && z4) {
                                r92.A01 = new WeakReference(A4O);
                                r92.A00.A01(Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    }
                }
                Iterator it2 = r5.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                    } else if (!AnonymousClass6UE.A05((instagramComment) it2.next(), this.A0I, this.A0K)) {
                        z2 = false;
                    }
                }
                if (z2 && size2 <= 25) {
                    AnonymousClass6UQ r0 = this.A05.A06;
                    if (r0 != null) {
                        boolean z6 = r0.A00;
                        z3 = true;
                    }
                    z3 = false;
                    if (!z3) {
                        r8.A4M(Constants.A0j, A002, new AnonymousClass6UI(this));
                    }
                }
                if (C119445Am.A01(r5, this.A0K)) {
                    r8.A4M(Constants.A0A, A002, new AnonymousClass6MD(this, size2, (instagramComment) this.A02.A0E.A02.iterator().next()));
                }
                C67402x6 r10 = this.A06;
                AnonymousClass1NJ r22 = this.A0I;
                C13150hy.A02(r5, "comments");
                Integer num = Constants.ZERO;
                boolean z7 = true;
                if (r5.size() == 1) {
                    instagramComment r4 = (instagramComment) AnonymousClass10N.A07(r5);
                    if (r22 != null && !r22.Aho() && r22.A0V() != C36811ie.ARCHIVED && C14090jk.A03(r10.A03, r22)) {
                        String A042 = r10.A03.A04();
                        C13300iJ AZf2 = r4.AZf();
                        if (AZf2 != null) {
                            str = AZf2.getId();
                        } else {
                            str = null;
                        }
                        if ((!C13150hy.A05(A042, str)) && !r4.A07()) {
                            boolean z8 = false;
                            if (AnonymousClass26J.Pending == r4.A0A) {
                                z8 = true;
                            }
                            if (!z8) {
                            }
                        }
                    }
                    z7 = false;
                    if (z7) {
                        num = !r4.A0h ? Constants.ONE : Constants.A0C;
                    }
                }
                if (num != Constants.ZERO) {
                    instagramComment r42 = (instagramComment) r5.iterator().next();
                    C33831dZ r23 = new C33831dZ();
                    int intValue = num.intValue();
                    switch (intValue) {
                        case 1:
                            i = C0003R.C0004drawable.instagram_pin_outline_24;
                            break;
                        case 2:
                            i = C0003R.C0004drawable.instagram_pin_filled_24;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    r23.A02 = i;
                    switch (intValue) {
                        case 1:
                            i2 = C0003R.string.pin_comment_description;
                            break;
                        case 2:
                            i2 = C0003R.string.unpin_comment_description;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    r23.A01 = i2;
                    r23.A05 = new C157426nw(this, num, r42);
                    r8.A4J(r23.A00());
                }
                AnonymousClass6UR r52 = new AnonymousClass6UR(this);
                AnonymousClass2xx A004 = C67852xw.A00(Constants.A0C);
                A004.A01(C019000b.A00(getContext(), C0003R.color.blue_5));
                A004.A04 = A002;
                A004.A05 = C019000b.A00(getContext(), C0003R.color.blue_6);
                float[] fArr = new float[3];
                Color.colorToHSV(C019000b.A00(getContext(), C0003R.color.blue_5), fArr);
                fArr[2] = fArr[2] * 0.9f;
                A004.A06 = Color.HSVToColor(fArr);
                A004.A0C = false;
                A004.A0B = r52;
                A004.A03 = C0003R.C0004drawable.instagram_x_outline_24;
                r8.BmE(A004.A00());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r4.A0P == false) goto L_0x0057;
     */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0Z0.A02(1998851982);
        boolean z2 = this.A0u;
        int i = C0003R.layout.layout_comment_thread;
        if (z2) {
            i = C0003R.layout.layout_comment_thread_rv;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.mRootView = inflate.findViewById(C0003R.C0005id.layout_comment_thread_parent);
        this.mCommentsContainer = inflate.findViewById(C0003R.C0005id.layout_comment_thread_content);
        if (this.A0u) {
            ((RecyclerView) inflate.findViewById(16908298)).setLayoutManager(new LinearLayoutManagerCompat());
        } else {
            this.A0i = AnonymousClass1XL.A00(this.A0K, inflate, new C67482xK(this));
        }
        if (!C67492xL.A00(this.A0K).booleanValue()) {
            A02(8);
        }
        if (this.A0I != null) {
            z = false;
        }
        z = true;
        if (z) {
            C62652o6.A00(true, this.mRootView);
        }
        this.A0e.A3j(this);
        AnonymousClass0Z0.A09(-1425764573, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-92905733);
        AnonymousClass1NJ r0 = this.A0I;
        if (r0 != null) {
            r0.A3k.A0B.A01();
        }
        this.A0J = null;
        C67362x2 r5 = this.A05;
        C51522Kz r3 = r5.A08;
        if (r3 != null) {
            C11130eT.A01.BXT(new C33451cw(r3));
            r5.A08 = null;
        }
        AnonymousClass6UQ r02 = r5.A06;
        if (r02 != null) {
            r02.run();
            r5.A06 = null;
        }
        C67402x6 r32 = this.A06;
        C51522Kz r2 = r32.A00;
        if (r2 != null) {
            C11130eT.A01.BXT(new C33451cw(r2));
            r32.A00 = null;
        }
        Runnable runnable = this.A0M;
        if (runnable != null) {
            AnonymousClass0ZA.A08(this.A0v, runnable);
        }
        this.A0y.A0A();
        super.onDestroy();
        AnonymousClass0Z0.A09(936524145, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(913376248);
        getScrollingViewProxy().AaK().removeOnLayoutChangeListener(this.A10);
        getScrollingViewProxy().A8n();
        getScrollingViewProxy().AaK().setOnTouchListener((View.OnTouchListener) null);
        for (instagramComment r0 : this.A02.A0E.A03) {
            r0.A0H = null;
        }
        CommentComposerController commentComposerController = this.A03;
        commentComposerController.mViewHolder.A0B.removeOnLayoutChangeListener(this.A0z);
        this.A0e.BbF(this);
        CommentThreadFragmentLifecycleUtil.cleanupReferences(this);
        if (!C67492xL.A00(this.A0K).booleanValue()) {
            A02(0);
        }
        super.onDestroyView();
        AnonymousClass0Z0.A09(550849139, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0Z0.A02(1376549016);
        super.onDetach();
        AnonymousClass00B.A01.markerEnd(16646145, 22);
        AnonymousClass0Z0.A09(-675351119, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(2058524748);
        C23300zv.A00(this.A0K).A03(C52172Ns.class, this.A13);
        C26581Eb.A00(getActivity(), this.A0b);
        this.A03.A04();
        Runnable runnable = this.A0k;
        if (runnable != null) {
            AnonymousClass0ZA.A08(this.A0v, runnable);
        }
        AnonymousClass1NJ r1 = this.A0I;
        if (r1 != null) {
            r1.A6t(this.A0K);
        }
        super.onPause();
        AnonymousClass0Z0.A09(320234204, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1339506913);
        super.onResume();
        this.A0b = getActivity().getRequestedOrientation();
        C26581Eb.A00(getActivity(), 1);
        if (this.A0t) {
            this.A03.A06();
            this.A0t = false;
        }
        this.A03.A0C();
        if (this.A0X) {
            this.mFragmentManager.A0W();
        }
        C34071dx A0T2 = C17020pY.A00().A0T(getActivity());
        if (A0T2 != null && A0T2.A0a() && A0T2.A0D == AnonymousClass1OY.COMMENTS) {
            A0T2.A0R();
        }
        C23300zv.A00(this.A0K).A02(C52172Ns.class, this.A13);
        AnonymousClass0Z0.A09(1807488776, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(1709396061);
        super.onStart();
        this.A0e.BOP(getActivity());
        if (C67492xL.A00(this.A0K).booleanValue()) {
            A02(8);
        }
        AnonymousClass0Z0.A09(2082237258, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0Z0.A02(507283834);
        super.onStop();
        this.A0e.BP6();
        if (C67492xL.A00(this.A0K).booleanValue()) {
            A02(0);
        }
        AnonymousClass0Z0.A09(-1254922755, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View AaK;
        AnonymousClass1NJ r0;
        super.onViewCreated(view, bundle);
        getScrollingViewProxy().Bfh(this.A02);
        if (this.A0J != null) {
            ViewGroup viewGroup = (ViewGroup) this.mCommentsContainer;
            Context context = getContext();
            AnonymousClass9IU r6 = new AnonymousClass9IU(context, this, this.A0K, this);
            View A002 = AnonymousClass9IU.A00(context, viewGroup);
            r6.A01((AnonymousClass9IV) A002.getTag(), this.A0I, new AnonymousClass9IT(this.A01, this.A00), Constants.A0N);
            viewGroup.addView(A002);
            viewGroup.invalidate();
            this.A0J.A02(A002);
        }
        CommentComposerController commentComposerController = this.A03;
        commentComposerController.mViewHolder.A0B.addOnLayoutChangeListener(this.A0z);
        getScrollingViewProxy().AaK().addOnLayoutChangeListener(this.A10);
        getScrollingViewProxy().A4V(new C36291ho(this));
        getScrollingViewProxy().AaK().setOnTouchListener(this.A11);
        if (this.A0u) {
            getScrollingViewProxy().Bm7(new AnonymousClass6UT(this));
        }
        A06(this);
        EmptyStateView emptyStateView = (EmptyStateView) view.findViewById(C0003R.C0005id.comment_empty_state_view);
        emptyStateView.A0K(new C67572xT(this), AnonymousClass2Oq.ERROR);
        if (this.A0u) {
            AaK = view.findViewById(C0003R.C0005id.refreshable_container);
        } else {
            AaK = getScrollingViewProxy().AaK();
        }
        this.A0C = new C67582xU(AaK, this.mRootView, emptyStateView);
        if (this.A0R) {
            emptyStateView.A0N(getString(C0003R.string.comments_bottomsheet_empty_state_label), AnonymousClass2Oq.EMPTY);
            emptyStateView.A0N(getString(C0003R.string.comments_bottomsheet_empty_state_label), AnonymousClass2Oq.NOT_LOADED);
            emptyStateView.A0F();
            ((ListView) getScrollingViewProxy().AaK()).setEmptyView(emptyStateView);
        }
        this.A0B = new C67552xR(getContext(), getScrollingViewProxy(), this.A02);
        if (this.A0o || (r0 = this.A0I) == null || r0.A1b()) {
            this.A08.A0B("fetch_with_media", true);
            A08(this, true);
        } else {
            this.A08.A01.A02();
            A05(this);
        }
        this.A0f.A04(C32711bj.A00(this), getScrollingViewProxy().AaK());
        C67952yA r1 = this.A0E;
        if (r1 != null) {
            A07(this, Constants.ZERO, r1);
            this.A0E = null;
        }
        C32991cC.A00(this.A0K).A07(view, C33051cI.CHAT_FLYOUT);
    }
}
