package com.instagram.comments.controller;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.comments.fragment.CommentThreadFragment;
import com.instagram.p009ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0NT;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1NU;
import p000X.AnonymousClass1R8;
import p000X.AnonymousClass24D;
import p000X.AnonymousClass2EZ;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass46K;
import p000X.AnonymousClass6QI;
import p000X.AnonymousClass6UB;
import p000X.AnonymousClass6UD;
import p000X.C06220Of;
import p000X.editInstagramCommentData;
import p000X.C13150hy;
import p000X.C13300iJ;
import p000X.C14090jk;
import p000X.C16170o9;
import p000X.C16980pU;
import p000X.C17850qu;
import p000X.C22180xy;
import p000X.C27291Hg;
import p000X.C27371Ho;
import p000X.C27651Ir;
import p000X.C28351Lj;
import p000X.instagramComment;
import p000X.C30941Vv;
import p000X.C36451i4;
import p000X.C36651iO;
import p000X.C38991mB;
import p000X.C53642Tq;
import p000X.C66982wP;
import p000X.C67052wW;
import p000X.C67062wX;
import p000X.C67102wc;
import p000X.C67112wd;
import p000X.C67132wf;
import p000X.C67142wg;
import p000X.C67502xM;
import p000X.C67512xN;
import p000X.C67522xO;
import p000X.C67532xP;
import p000X.C67542xQ;
import p000X.C67602xW;
import p000X.C67672xe;
import p000X.C67682xf;
import p000X.C68622zT;
import p000X.C68632zU;
import p000X.C91503xe;

public class CommentComposerController extends C27291Hg implements C36651iO {
    public instagramComment A00;
    public AnonymousClass1NJ A01;
    public C67682xf A02;
    public String A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final C67112wd A0A;
    public final CommentThreadFragment A0B;
    public final CommentThreadFragment A0C;
    public final AnonymousClass1R8 A0D;
    public final editInstagramCommentData A0E = new C67102wc(this);
    public final C27371Ho A0F;
    public final C68632zU A0G;
    public final AnonymousClass0C1 A0H;
    public final C66982wP A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final C67062wX A0L;
    public final C67132wf A0M;
    public final boolean A0N;
    public C67502xM mViewHolder;

    public final void Azh() {
        this.A02 = null;
        this.mViewHolder.A0B.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        AnonymousClass0WN.A01(this.A0H).BsB(this.mViewHolder.A0B);
        if (this.A01 == null || this.mViewHolder.A0B.getText().length() <= 0) {
            AnonymousClass1NJ r2 = this.A01;
            if (r2 != null) {
                C67062wX r1 = this.A0L;
                C13150hy.A02(r2, "media");
                r1.A00.remove(r2.APo());
            }
        } else {
            AnonymousClass1R8 r12 = this.A0D;
            AnonymousClass1NJ r22 = this.A01;
            instagramComment r4 = this.A00;
            String obj = this.mViewHolder.A0B.getText().toString();
            C13150hy.A02(r22, "media");
            C13150hy.A02(obj, "abandonedText");
            C91503xe r3 = new C91503xe(r12.A01.A02("instagram_comment_composer_abandon"));
            r3.A08("m_pk", r22.APo());
            r3.A08("text", obj);
            if (r4 != null) {
                r3.A08("parent_c_pk", r4.AS8());
                C13300iJ AZf = r4.AZf();
                AnonymousClass11J.A00(AZf);
                C13150hy.A01(AZf, "Preconditions.checkNotNull(it.user)");
                r3.A08("parent_ca_pk", AZf.getId());
            }
            r3.A01();
            this.A0L.A01(this.A01, this.A00, this.mViewHolder.A0B.getText().toString());
        }
        CommentComposerControllerLifecycleUtil.cleanupReferences(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (r2 == false) goto L_0x0046;
     */
    public static void A00(CommentComposerController commentComposerController) {
        boolean z;
        Integer num;
        Integer num2;
        CommentComposerController commentComposerController2 = commentComposerController;
        String trim = commentComposerController2.mViewHolder.A0B.getText().toString().trim();
        if (!trim.isEmpty()) {
            instagramComment r3 = commentComposerController2.A00;
            AnonymousClass1NJ r6 = commentComposerController2.A01;
            if (r6 != null) {
                AnonymousClass0C1 r7 = commentComposerController2.A0H;
                editInstagramCommentData r4 = commentComposerController2.A0E;
                r4.elapsedTime = 0;
                int i = r4.numOfDeletes;
                r4.numOfDeletes = 0;
                instagramComment A002 = AnonymousClass6UB.A00(trim, r6, r7, SystemClock.elapsedRealtime() - r4.elapsedTime, i, r3);
                C22180xy r5 = C22180xy.A00;
                AnonymousClass0C1 r42 = commentComposerController2.A0H;
                AnonymousClass1NJ r1 = commentComposerController2.A01;
                if (r1 != null) {
                    boolean Aho = r1.Aho();
                    z = true;
                }
                z = false;
                boolean A032 = r5.A03(r42, z);
                String str = null;
                if (A032) {
                    AnonymousClass2EZ A012 = C16980pU.A00.A01(commentComposerController2.A0H);
                    CommentThreadFragment commentThreadFragment = commentComposerController2.A0C;
                    FragmentActivity activity = commentThreadFragment.getActivity();
                    String str2 = commentComposerController2.A03;
                    Context context = commentThreadFragment.getContext();
                    C27371Ho r13 = commentComposerController2.A0F;
                    String moduleName = r13.getModuleName();
                    String A052 = AnonymousClass0NT.A05(commentComposerController2.A09);
                    AnonymousClass0C1 r62 = commentComposerController2.A0H;
                    boolean z2 = commentComposerController2.A0K;
                    AnonymousClass1NJ r72 = commentComposerController2.A01;
                    if (r72 != null) {
                        str = r72.A21;
                    }
                    int i2 = commentComposerController2.A08;
                    int i3 = commentComposerController2.A07;
                    if (r72 != null) {
                        num2 = r72.A0i();
                    } else {
                        num2 = Constants.A0C;
                    }
                    C17850qu A003 = AnonymousClass6UD.A00(A002, moduleName, A052, r62, z2, str, i2, i3, num2);
                    CommentThreadFragment commentThreadFragment2 = commentComposerController2.A0B;
                    AnonymousClass0C1 r2 = commentComposerController2.A0H;
                    boolean z3 = commentComposerController2.A0K;
                    int i4 = commentComposerController2.A08;
                    int i5 = commentComposerController2.A07;
                    A012.A01(activity, str2, A002, context, r13, A003, commentThreadFragment2, commentThreadFragment2, r2, (long) C22180xy.A00.A00(r2), false, z3, i4, i5, commentComposerController2.A0D);
                } else {
                    AnonymousClass1NJ r10 = commentComposerController2.A01;
                    CommentThreadFragment commentThreadFragment3 = commentComposerController2.A0C;
                    FragmentActivity activity2 = commentThreadFragment3.getActivity();
                    Context context2 = commentThreadFragment3.getContext();
                    C27371Ho r14 = commentComposerController2.A0F;
                    String moduleName2 = r14.getModuleName();
                    String A053 = AnonymousClass0NT.A05(commentComposerController2.A09);
                    AnonymousClass0C1 r73 = commentComposerController2.A0H;
                    boolean z4 = commentComposerController2.A0K;
                    AnonymousClass1NJ r52 = commentComposerController2.A01;
                    if (r52 != null) {
                        str = r52.A21;
                    }
                    int i6 = commentComposerController2.A08;
                    int i7 = commentComposerController2.A07;
                    if (r52 != null) {
                        num = r52.A0i();
                    } else {
                        num = Constants.A0C;
                    }
                    C17850qu A004 = AnonymousClass6UD.A00(A002, moduleName2, A053, r73, z4, str, i6, i7, num);
                    CommentThreadFragment commentThreadFragment4 = commentComposerController2.A0B;
                    AnonymousClass0C1 r53 = commentComposerController2.A0H;
                    CommentThreadFragment commentThreadFragment5 = commentThreadFragment4;
                    AnonymousClass0C1 r19 = r53;
                    AnonymousClass6UB.A01(r10, A002, activity2, context2, r14, A004, commentThreadFragment5, commentThreadFragment4, true, r19, false, commentComposerController2.A0K, commentComposerController2.A08, commentComposerController2.A07);
                }
                if (r3 != null) {
                    if (r3.A07()) {
                        AnonymousClass1NU r22 = commentComposerController2.A01.A3k;
                        if (r22.A00 == null) {
                            r22.A00 = AnonymousClass1NU.A01(r22.A01);
                        }
                        instagramComment A005 = r22.A00.A00(r3.A0T);
                        if (A005 != null) {
                            A005.A0e = true;
                        }
                    } else {
                        r3.A0e = true;
                    }
                }
                if (!commentComposerController2.A04 && !A002.A07() && !C38991mB.A02(A002.commentText).isEmpty() && C16170o9.A00()) {
                    C16170o9.A00.A01(commentComposerController2.A0C.getActivity(), commentComposerController2.A0H, "348828055634303");
                    commentComposerController2.A04 = true;
                }
            }
            commentComposerController2.mViewHolder.A0B.setText("");
            commentComposerController2.A00 = null;
            A01(commentComposerController2);
            commentComposerController2.mViewHolder.A0A.A01();
            C66982wP r12 = commentComposerController2.A0I;
            if (r12 != null) {
                r12.B05(commentComposerController2.mViewHolder.A0A);
            }
        }
    }

    public static void A01(CommentComposerController commentComposerController) {
        boolean z = false;
        if (commentComposerController.mViewHolder != null) {
            z = true;
        }
        if (!z) {
            return;
        }
        if (commentComposerController.A0H.A05.A08()) {
            boolean z2 = false;
            if (commentComposerController.A00 != null) {
                z2 = true;
            }
            int i = C0003R.string.comment_as_hint;
            if (z2) {
                i = C0003R.string.reply_as_hint;
            }
            commentComposerController.mViewHolder.A0B.setHint(commentComposerController.A09.getResources().getString(i, new Object[]{commentComposerController.A0H.A06.AZn()}));
            return;
        }
        ComposerAutoCompleteTextView composerAutoCompleteTextView = commentComposerController.mViewHolder.A0B;
        Resources resources = commentComposerController.A09.getResources();
        boolean z3 = false;
        if (commentComposerController.A00 != null) {
            z3 = true;
        }
        int i2 = C0003R.string.comment_hint;
        if (z3) {
            i2 = C0003R.string.reply_hint;
        }
        composerAutoCompleteTextView.setHint(resources.getString(i2));
    }

    private boolean A02() {
        AnonymousClass1NJ r1 = this.A01;
        if (r1 == null || !r1.A3U || (r1.A0k().longValue() * 1000) + TimeUnit.DAYS.toMillis(1) >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public static void setCommentingDisabled(C67502xM r2, Resources resources) {
        r2.A0B.setHint(resources.getString(C0003R.string.commenting_disabled_hint));
        r2.A0B.setTextAlignment(4);
        r2.A0B.setGravity(1);
        r2.A0B.setFocusable(false);
        r2.A0B.setEnabled(false);
        r2.A0B.setKeyListener((KeyListener) null);
        r2.A03.setVisibility(8);
        r2.A09.setVisibility(8);
        C67602xW r0 = r2.A00;
        if (r0 != null) {
            r0.A01.setVisibility(8);
        }
    }

    public final int A03() {
        if (this.mViewHolder.A01.getVisibility() != 0) {
            return 0;
        }
        int height = this.mViewHolder.A04.getHeight();
        C67602xW r0 = this.mViewHolder.A00;
        if (r0 != null && r0.A01.getVisibility() == 0) {
            height += this.mViewHolder.A00().A02.getHeight();
        }
        int i = height + 2;
        if (this.mViewHolder.A0A.A04) {
            return i + this.A06;
        }
        return i;
    }

    public final void A04() {
        C67502xM r1 = this.mViewHolder;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        if (z) {
            C06220Of.A0E(r1.A0B);
        }
    }

    public final void A05() {
        AnonymousClass1NJ r0 = this.A01;
        if (r0 != null) {
            AnonymousClass0C1 r1 = this.A0H;
            if (C14090jk.A05(r1, r0.A0c(r1))) {
                A04();
                A0A(false);
                return;
            }
        }
        String string = this.A09.getString(C0003R.string.comments_disabled_message, new Object[]{this.A01.A0c(this.A0H).AZn()});
        AnonymousClass2OA r2 = new AnonymousClass2OA(this.A09);
        r2.A07(C0003R.string.comments_disabled_title);
        r2.A0M(string);
        r2.A0A(C0003R.string.f118ok, new AnonymousClass6QI(this));
        r2.A03().show();
    }

    public final void A06() {
        View view;
        C67502xM r1 = this.mViewHolder;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        if (z && (view = r1.A01) != null && view.getVisibility() == 0) {
            this.mViewHolder.A0B.requestFocus();
            ComposerAutoCompleteTextView composerAutoCompleteTextView = this.mViewHolder.A0B;
            composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.getText().length());
            C06220Of.A0H(this.mViewHolder.A0B);
            this.mViewHolder.A0B.sendAccessibilityEvent(DexStore.LOAD_RESULT_PGO);
        }
    }

    public final void A07(instagramComment r6) {
        if (!r6.equals(this.A00)) {
            this.A00 = r6;
            boolean z = false;
            if (this.mViewHolder != null) {
                z = true;
            }
            if (z) {
                this.mViewHolder.A0A.A02(this.A09.getResources().getString(C0003R.string.replying_to_user_format, new Object[]{r6.AZf().AZn()}));
                A01(this);
            }
            boolean z2 = false;
            if (this.mViewHolder != null) {
                z2 = true;
            }
            if (z2) {
                C13300iJ AZf = r6.AZf();
                if (AZf.A0n()) {
                    String AZn = AZf.AZn();
                    A09(String.format(Locale.getDefault(), "@%s ", new Object[]{AZn}));
                }
            }
        }
    }

    public final void A08(AnonymousClass1NJ r11) {
        boolean z;
        Integer num;
        int i;
        Resources resources;
        String string;
        this.A01 = r11;
        C67502xM r1 = this.mViewHolder;
        boolean z2 = false;
        if (r1 != null) {
            z2 = true;
        }
        if (z2) {
            Boolean bool = r11.A16;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                setCommentingDisabled(r1, this.A09.getResources());
            } else {
                if (!this.A0J) {
                    C67112wd r2 = this.A0A;
                    r2.A00 = r1.A00();
                    List A002 = r2.A01.A00();
                    if (A002 == null) {
                        A002 = AnonymousClass24D.A00;
                    }
                    r2.A01(A002, false);
                }
                if (this.A01 != null && this.A02 == null) {
                    Context context = this.A09;
                    AnonymousClass0C1 r4 = this.A0H;
                    CommentThreadFragment commentThreadFragment = this.A0C;
                    C67682xf A003 = C67682xf.A00(context, r4, new C28351Lj(commentThreadFragment.getContext(), AnonymousClass1L8.A00(commentThreadFragment)), C36451i4.A01(this.A01), true, "comment_composer_page", new C67672xe(this.A0C.getActivity(), this.A0H, "comments"));
                    this.A02 = A003;
                    this.mViewHolder.A0B.setAdapter(A003);
                }
                A0C();
                A01(this);
                if (!this.A05) {
                    AnonymousClass0C1 r12 = this.A0H;
                    C13300iJ r22 = r12.A06;
                    if (!(!this.A01.A0c(r12).equals(r22) || r22.A1o == Constants.A0C || (num = r22.A1d) == Constants.ZERO)) {
                        Context context2 = this.A09;
                        switch (num.intValue()) {
                            case 1:
                                resources = context2.getResources();
                                i = C0003R.string.commenting_limited_to_following;
                                break;
                            case 2:
                                resources = context2.getResources();
                                i = C0003R.string.commenting_limited_to_followers;
                                break;
                            case 3:
                                resources = context2.getResources();
                                i = C0003R.string.commenting_limited_to_followers_and_following;
                                break;
                            default:
                                string = "";
                                break;
                        }
                        string = resources.getString(i);
                        C53642Tq.A01(context2, string, 0).show();
                    }
                    this.A05 = true;
                }
            }
            if (A02()) {
                A0A(false);
            }
        }
    }

    public final void A09(String str) {
        this.mViewHolder.A0B.removeTextChangedListener(this.A0E);
        this.mViewHolder.A0B.setText(str);
        this.mViewHolder.A0B.addTextChangedListener(this.A0E);
        A0C();
    }

    public final void A0A(boolean z) {
        View view = this.mViewHolder.A01;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final boolean A0C() {
        TextView textView;
        boolean z;
        if (this.A01 == null || TextUtils.isEmpty(this.mViewHolder.A0B.getText().toString().trim())) {
            textView = this.mViewHolder.A06;
            z = false;
        } else {
            textView = this.mViewHolder.A06;
            z = true;
        }
        textView.setEnabled(z);
        this.mViewHolder.A03.setEnabled(z);
        return z;
    }

    public final void Ayk(View view) {
        C67502xM r1 = new C67502xM(this.A0H, view, this);
        this.mViewHolder = r1;
        r1.A0B.setOnEditorActionListener(new C67512xN(this));
        this.mViewHolder.A0B.setDropDownWidth(C06220Of.A09(this.A09));
        if (this.A0N) {
            this.mViewHolder.A0B.setDropDownAnchor(C0003R.C0005id.bottom_sheet_nav_bar_divider);
            this.mViewHolder.A0B.setDropDownVerticalOffset(0);
        } else {
            this.mViewHolder.A0B.setDropDownAnchor(C0003R.C0005id.action_bar_wrapper);
            this.mViewHolder.A0B.setDropDownVerticalOffset(-C27651Ir.A00(this.A09));
        }
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.mViewHolder.A0B;
        composerAutoCompleteTextView.setAlwaysShowWhenEnoughToFilter(true);
        composerAutoCompleteTextView.setDropDownBackgroundResource(AnonymousClass1BA.A03(this.A09, C0003R.attr.backgroundColorPrimary));
        this.mViewHolder.A0B.setOnItemClickListener(new C67522xO(this));
        AnonymousClass0WN.A01(this.A0H).Ba2(this.mViewHolder.A0B);
        this.mViewHolder.A03.setOnClickListener(new C67532xP(this));
        this.mViewHolder.A0A.A03 = new C67542xQ(this);
        this.A06 = this.A09.getResources().getDimensionPixelSize(C0003R.dimen.comment_input_row_directmention_banner_height);
        this.mViewHolder.A09.A06(this.A0H.A06.ASv(), (AnonymousClass46K) null);
        this.mViewHolder.A09.setGradientSpinnerVisible(false);
        if (A02()) {
            A0A(false);
        }
    }

    public final void B2D(C30941Vv r6, Drawable drawable) {
        boolean z = false;
        if (this.mViewHolder != null) {
            z = true;
        }
        if (z) {
            int A002 = this.A0A.A00(r6);
            this.mViewHolder.A0B.getText().replace(Math.max(this.mViewHolder.A0B.getSelectionStart(), 0), Math.max(this.mViewHolder.A0B.getSelectionEnd(), 0), r6.A02);
            this.A0D.A04(this.A01, r6.A02, A002, this.A00);
        }
    }

    public final void BE0() {
        this.mViewHolder.A0B.removeTextChangedListener(this.A0E);
        this.mViewHolder.A0B.removeTextChangedListener(this.A0M);
        C16980pU.A00.A01(this.A0H).A00();
        super.BE0();
    }

    public CommentComposerController(Context context, AnonymousClass0C1 r8, CommentThreadFragment commentThreadFragment, CommentThreadFragment commentThreadFragment2, C27371Ho r11, AnonymousClass1R8 r12, C66982wP r13, boolean z, int i, int i2, boolean z2, boolean z3) {
        this.A09 = context;
        this.A0H = r8;
        this.A0C = commentThreadFragment;
        this.A0B = commentThreadFragment2;
        this.A0F = r11;
        this.A0I = r13;
        this.A0A = new C67112wd(this, r8);
        this.A0D = r12;
        this.A0K = z;
        this.A08 = i;
        this.A07 = i2;
        this.A0J = z2;
        this.A0N = z3;
        this.A0L = C67052wW.A00(this.A0H);
        String uuid = UUID.randomUUID().toString();
        AnonymousClass0C1 r4 = this.A0H;
        C68632zU A002 = C68622zT.A00(r11, uuid, r4, ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.COMMON_SEARCH_LOGGING, "is_enabled_for_comment_creation", false, (AnonymousClass04H) null)).booleanValue());
        this.A0G = A002;
        this.A0M = new C67132wf(new C67142wg(this), A002);
    }

    public final boolean A0B() {
        AnonymousClass1NJ r1;
        C67502xM r0;
        if (A02() || (r1 = this.A01) == null || r1.A3L || r1.A05 != 0 || (r0 = this.mViewHolder) == null || r0.A01 == null) {
            return true;
        }
        return false;
    }

    public final void BJx() {
        super.BJx();
        this.mViewHolder.A0B.addTextChangedListener(this.A0E);
        this.mViewHolder.A0B.addTextChangedListener(this.A0M);
    }
}
