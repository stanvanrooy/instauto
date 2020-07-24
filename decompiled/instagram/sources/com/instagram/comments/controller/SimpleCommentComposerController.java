package com.instagram.comments.controller;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.List;
import java.util.Locale;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0NT;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1R8;
import p000X.AnonymousClass24D;
import p000X.AnonymousClass46K;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass6PL;
import p000X.AnonymousClass6PM;
import p000X.AnonymousClass6PN;
import p000X.AnonymousClass6PP;
import p000X.AnonymousClass6UB;
import p000X.AnonymousClass6UD;
import p000X.C06220Of;
import p000X.editInstagramCommentData;
import p000X.C27291Hg;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C27651Ir;
import p000X.C28351Lj;
import p000X.instagramComment;
import p000X.C30941Vv;
import p000X.C36451i4;
import p000X.C36651iO;
import p000X.C51322Kf;
import p000X.C51332Kg;
import p000X.C67112wd;
import p000X.C67502xM;
import p000X.C67672xe;
import p000X.C67682xf;

public class SimpleCommentComposerController extends C27291Hg implements C36651iO {
    public int A00;
    public AnonymousClass1NJ A01;
    public C67112wd A02;
    public final View.OnLayoutChangeListener A03 = new AnonymousClass6PP(this);
    public final int A04;
    public final int A05;
    public final Context A06;
    public final C27341Hl A07;
    public final AnonymousClass1R8 A08;
    public final C51332Kg A09;
    public final editInstagramCommentData A0A = new AnonymousClass6PN(this);
    public final instagramComment A0B;
    public final C27371Ho A0C;
    public final AnonymousClass0C1 A0D;
    public final boolean A0E;
    public final String A0F;
    public final boolean A0G;
    public C67502xM mViewHolder;

    public static void A00(SimpleCommentComposerController simpleCommentComposerController) {
        int height;
        C67502xM r1 = simpleCommentComposerController.mViewHolder;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        if (z && (height = simpleCommentComposerController.A00 - r1.A01.getHeight()) > 0) {
            simpleCommentComposerController.mViewHolder.A0B.setDropDownCustomHeight(height);
        }
    }

    public static void A01(SimpleCommentComposerController simpleCommentComposerController) {
        String str;
        String str2;
        Integer num;
        SimpleCommentComposerController simpleCommentComposerController2 = simpleCommentComposerController;
        C67502xM r1 = simpleCommentComposerController2.mViewHolder;
        if (r1 != null) {
            str = r1.A0B.getText().toString();
        } else {
            str = "";
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return;
        }
        if (simpleCommentComposerController2.A01 == null) {
            Context context = simpleCommentComposerController2.A06;
            AnonymousClass5F9.A02(context, context.getResources().getString(C0003R.string.error));
            return;
        }
        simpleCommentComposerController2.mViewHolder.A0B.setText("");
        AnonymousClass1NJ r5 = simpleCommentComposerController2.A01;
        AnonymousClass0C1 r6 = simpleCommentComposerController2.A0D;
        editInstagramCommentData r3 = simpleCommentComposerController2.A0A;
        r3.elapsedTime = 0;
        int i = r3.numOfDeletes;
        r3.numOfDeletes = 0;
        instagramComment A002 = AnonymousClass6UB.A00(trim, r5, r6, SystemClock.elapsedRealtime() - r3.elapsedTime, i, simpleCommentComposerController2.A0B);
        AnonymousClass1NJ r7 = simpleCommentComposerController2.A01;
        FragmentActivity activity = simpleCommentComposerController2.A07.getActivity();
        Context context2 = simpleCommentComposerController2.A06;
        C27371Ho r11 = simpleCommentComposerController2.A0C;
        String moduleName = r11.getModuleName();
        String A052 = AnonymousClass0NT.A05(simpleCommentComposerController2.A06);
        AnonymousClass0C1 r62 = simpleCommentComposerController2.A0D;
        boolean z = simpleCommentComposerController2.A0E;
        AnonymousClass1NJ r4 = simpleCommentComposerController2.A01;
        if (r4 != null) {
            str2 = r4.A21;
        } else {
            str2 = null;
        }
        int i2 = simpleCommentComposerController2.A05;
        int i3 = simpleCommentComposerController2.A04;
        if (r4 != null) {
            num = r4.A0i();
        } else {
            num = Constants.A0C;
        }
        AnonymousClass6UB.A01(r7, A002, activity, context2, r11, AnonymousClass6UD.A00(A002, moduleName, A052, r62, z, str2, i2, i3, num), simpleCommentComposerController2.A09, (C51322Kf) null, true, simpleCommentComposerController2.A0D, true, simpleCommentComposerController2.A0E, simpleCommentComposerController2.A05, simpleCommentComposerController2.A04);
    }

    public static void A02(SimpleCommentComposerController simpleCommentComposerController) {
        C67502xM r0 = simpleCommentComposerController.mViewHolder;
        if (r0 != null) {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = r0.A0B;
            Context context = simpleCommentComposerController.A06;
            composerAutoCompleteTextView.setAdapter(C67682xf.A00(context, simpleCommentComposerController.A0D, new C28351Lj(context, AnonymousClass1L8.A00(simpleCommentComposerController.A07)), C36451i4.A01(simpleCommentComposerController.A01), true, "comment_composer_page", (C67672xe) null));
        }
    }

    public final boolean A03() {
        String str;
        TextView textView;
        boolean z;
        C67502xM r0 = this.mViewHolder;
        if (r0 != null) {
            str = r0.A0B.getText().toString();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str.trim())) {
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
        C67502xM r1 = new C67502xM(this.A0D, view, this);
        this.mViewHolder = r1;
        r1.A0B.setOnEditorActionListener(new AnonymousClass6PL(this));
        this.mViewHolder.A0B.setText(this.A0F);
        this.mViewHolder.A0B.setDropDownWidth(C06220Of.A09(this.A06));
        this.mViewHolder.A0B.setDropDownVerticalOffset(-C27651Ir.A00(this.A06));
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.mViewHolder.A0B;
        composerAutoCompleteTextView.setAlwaysShowWhenEnoughToFilter(true);
        composerAutoCompleteTextView.setDropDownBackgroundResource(AnonymousClass1BA.A03(this.A06, C0003R.attr.backgroundColorPrimary));
        AnonymousClass0WN.A01(this.A0D).Ba2(this.mViewHolder.A0B);
        this.mViewHolder.A03.setOnClickListener(new AnonymousClass6PM(this));
        this.mViewHolder.A09.A06(this.A0D.A06.ASv(), (AnonymousClass46K) null);
        this.mViewHolder.A09.setGradientSpinnerVisible(false);
        this.A02 = new C67112wd(this, this.A0D);
        this.mViewHolder.A0B.setDropDownAnchor(C0003R.C0005id.action_bar_wrapper);
        this.mViewHolder.A01.addOnLayoutChangeListener(this.A03);
    }

    public final void Azh() {
        this.mViewHolder.A01.removeOnLayoutChangeListener(this.A03);
        this.mViewHolder.A0B.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        AnonymousClass0WN.A01(this.A0D).BsB(this.mViewHolder.A0B);
        this.mViewHolder = null;
    }

    public final void B2D(C30941Vv r6, Drawable drawable) {
        boolean z = false;
        if (this.mViewHolder != null) {
            z = true;
        }
        if (z) {
            int A002 = this.A02.A00(r6);
            this.mViewHolder.A0B.getText().replace(Math.max(this.mViewHolder.A0B.getSelectionStart(), 0), Math.max(this.mViewHolder.A0B.getSelectionEnd(), 0), r6.A02);
            AnonymousClass1NJ r3 = this.A01;
            if (r3 != null) {
                this.A08.A04(r3, r6.A02, A002, (instagramComment) null);
            }
        }
    }

    public final void BE0() {
        this.mViewHolder.A0B.removeTextChangedListener(this.A0A);
        super.BE0();
    }

    public final void BVf(View view, Bundle bundle) {
        ComposerAutoCompleteTextView composerAutoCompleteTextView;
        String string;
        if (this.A01 != null) {
            A02(this);
        }
        if (this.A0D.A05.A08()) {
            composerAutoCompleteTextView = this.mViewHolder.A0B;
            string = this.A06.getResources().getString(C0003R.string.comment_as_hint, new Object[]{this.A0D.A06.AZn()});
        } else {
            composerAutoCompleteTextView = this.mViewHolder.A0B;
            string = this.A06.getResources().getString(C0003R.string.comment_hint);
        }
        composerAutoCompleteTextView.setHint(string);
        C67112wd r1 = this.A02;
        r1.A00 = this.mViewHolder.A00();
        List A002 = r1.A01.A00();
        if (A002 == null) {
            A002 = AnonymousClass24D.A00;
        }
        r1.A01(A002, false);
        A03();
        boolean z = this.A0G;
        C67502xM r12 = this.mViewHolder;
        boolean z2 = false;
        if (r12 != null) {
            z2 = true;
        }
        if (z2) {
            r12.A0B.requestFocus();
            ComposerAutoCompleteTextView composerAutoCompleteTextView2 = this.mViewHolder.A0B;
            composerAutoCompleteTextView2.setSelection(composerAutoCompleteTextView2.getText().length());
            if (z) {
                C06220Of.A0H(this.mViewHolder.A0B);
            } else {
                C06220Of.A0G(this.mViewHolder.A0B);
            }
        }
        if (this.A0B != null) {
            this.mViewHolder.A0A.A01.setVisibility(8);
            this.mViewHolder.A0A.A02(this.A06.getResources().getString(C0003R.string.replying_to_user_format, new Object[]{this.A0B.AZf().AZn()}));
            String AZn = this.A0B.AZf().AZn();
            String format = String.format(Locale.getDefault(), "@%s ", new Object[]{AZn});
            this.mViewHolder.A0B.removeTextChangedListener(this.A0A);
            this.mViewHolder.A0B.setText("");
            this.mViewHolder.A0B.append(format);
            this.mViewHolder.A0B.addTextChangedListener(this.A0A);
        }
    }

    public SimpleCommentComposerController(Context context, AnonymousClass0C1 r3, C27341Hl r4, C51332Kg r5, C27371Ho r6, AnonymousClass1R8 r7, String str, instagramComment r9, boolean z, boolean z2, int i, int i2) {
        this.A06 = context;
        this.A0D = r3;
        this.A07 = r4;
        this.A09 = r5;
        this.A0C = r6;
        this.A08 = r7;
        this.A0F = str;
        this.A0B = r9;
        this.A0G = z;
        this.A0E = z2;
        this.A05 = i;
        this.A04 = i2;
    }

    public final void BJx() {
        super.BJx();
        this.mViewHolder.A0B.addTextChangedListener(this.A0A);
    }
}
