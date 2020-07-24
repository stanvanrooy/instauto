package com.instagram.igtv.viewer.bottomsheet;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass5F4;
import p000X.AnonymousClass6ID;
import p000X.C164306zb;
import p000X.C27341Hl;
import p000X.C58442fx;

public final class MediaOptionsDialog {
    public DialogInterface.OnDismissListener A00;
    public final C58442fx A01;
    public final AnonymousClass6ID A02;
    public final AnonymousClass0C1 A03;
    public final Activity A04;
    public final C27341Hl A05;

    public static Dialog A00(MediaOptionsDialog mediaOptionsDialog, CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener) {
        mediaOptionsDialog.A00 = onDismissListener;
        AnonymousClass5F4 r2 = new AnonymousClass5F4(mediaOptionsDialog.A04);
        r2.A03(mediaOptionsDialog.A05);
        r2.A0A(charSequenceArr, onClickListener);
        r2.A08(true);
        r2.A09(true);
        r2.A0A.setOnShowListener(onShowListener);
        r2.A0A.setOnDismissListener(new C164306zb(mediaOptionsDialog));
        return r2.A00();
    }

    public MediaOptionsDialog(Activity activity, C27341Hl r2, C58442fx r3, AnonymousClass0C1 r4, AnonymousClass6ID r5) {
        this.A04 = activity;
        this.A05 = r2;
        this.A02 = r5;
        this.A01 = r3;
        this.A03 = r4;
    }
}
