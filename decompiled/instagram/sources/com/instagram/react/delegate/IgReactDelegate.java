package com.instagram.react.delegate;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import p000X.A3N;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass901;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C227499qb;
import p000X.C227509qc;
import p000X.C227529qe;
import p000X.C227779r7;
import p000X.C227799rA;
import p000X.C227809rC;
import p000X.C227819rD;
import p000X.C227849rH;
import p000X.C227879rK;
import p000X.C227889rL;
import p000X.C228039ra;

public class IgReactDelegate extends C227499qb implements C227799rA {
    public int A00;
    public Bundle A01;
    public C227849rH A02;
    public C227879rK A03;
    public C227809rC A04;
    public C227819rD A05;
    public C06590Pq A06;
    public AnonymousClass901 A07;
    public IgReactExceptionManager A08;
    public C227529qe A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E;
    public FrameLayout mFrameLayout;
    public View mInlineNavBar;
    public View mInlineNavCloseButton;
    public TextView mInlineNavTitle;
    public SpinnerImageView mLoadingIndicator;

    public interface RCTViewEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public static void A00(IgReactDelegate igReactDelegate) {
        if (igReactDelegate.A0D) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = igReactDelegate.A00.getResources().getDimensionPixelOffset(C0003R.dimen.inline_nav_bar_height);
            igReactDelegate.mFrameLayout.addView(igReactDelegate.A03, layoutParams);
            View inflate = LayoutInflater.from(igReactDelegate.A00.getContext()).inflate(C0003R.layout.react_inline_nav_bar, igReactDelegate.mFrameLayout, false);
            igReactDelegate.mInlineNavBar = inflate;
            TextView textView = (TextView) inflate.findViewById(C0003R.C0005id.react_inline_title);
            igReactDelegate.mInlineNavTitle = textView;
            textView.setText(igReactDelegate.A00.mArguments.getString("IgReactFragment.ARGUMENT_TITLE"));
            igReactDelegate.mInlineNavCloseButton = igReactDelegate.mInlineNavBar.findViewById(C0003R.C0005id.react_inline_close_button);
            C227529qe r4 = igReactDelegate.A09;
            if (r4 != null) {
                C227499qb r3 = r4.A00.A00;
                TextView A0A2 = r3.A0A();
                TextView textView2 = A0A2;
                if (!(A0A2 == null || r3.A07() == null)) {
                    textView2.setGravity(17);
                    r4.A00.A00.A0A().setTextColor(-1);
                    ((FrameLayout.LayoutParams) r4.A00.A00.A0A().getLayoutParams()).leftMargin = 0;
                    C227509qc r2 = r4.A00;
                    r2.A00.A0A().setText(r2.getText(C0003R.string.iglive_ssi_banner_title));
                    C227509qc r1 = r4.A00;
                    r1.A00.A0A().setTextSize(0, r1.getResources().getDimension(C0003R.dimen.font_medium));
                    r4.A00.A00.A07().setBackgroundResource(C0003R.C0004drawable.iglive_ssi_banner);
                }
            }
            igReactDelegate.mFrameLayout.addView(igReactDelegate.mInlineNavBar);
        } else {
            igReactDelegate.mFrameLayout.addView(igReactDelegate.A03);
        }
        C227529qe r0 = igReactDelegate.A09;
        if (r0 != null) {
            C227509qc r12 = r0.A00;
            View A082 = r12.A00.A08();
            if (A082 != null) {
                A082.setBackgroundColor(C019000b.A00(r12.getContext(), C0003R.color.white));
            }
        }
    }

    public static void A01(IgReactDelegate igReactDelegate) {
        FrameLayout frameLayout = igReactDelegate.mFrameLayout;
        if (!(frameLayout == null || igReactDelegate.A03 == null)) {
            frameLayout.removeAllViews();
            View inflate = LayoutInflater.from(igReactDelegate.A00.getContext()).inflate(C0003R.layout.react_error_layout, igReactDelegate.mFrameLayout, false);
            inflate.setBackgroundColor(-1);
            igReactDelegate.mFrameLayout.addView(inflate);
            igReactDelegate.A03 = null;
        }
        igReactDelegate.A0A = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    public final boolean AbO(int i, KeyEvent keyEvent) {
        boolean z;
        if (this.A0A || !this.A07.A02().A09.AKB()) {
            return false;
        }
        if (i != 82) {
            C227809rC r6 = this.A04;
            View currentFocus = this.A00.getActivity().getCurrentFocus();
            if (i == 46 && !(currentFocus instanceof EditText)) {
                if (r6.A00) {
                    r6.A00 = false;
                    z = true;
                    if (!z) {
                        return false;
                    }
                } else {
                    r6.A00 = true;
                    AnonymousClass0ZA.A09(new Handler(), new C227779r7(r6), 200, -1542820521);
                }
            }
            z = false;
            if (!z) {
            }
        }
        this.A07.A02();
        return true;
    }

    public final boolean onBackPressed() {
        if (this.A0B || this.A0A) {
            return false;
        }
        C227889rL A022 = this.A07.A02();
        C228039ra.A00();
        A3N a3n = A022.A0E;
        if (a3n == null) {
            AnonymousClass0CH.A07("ReactInstanceManager", "Instance detached from instance manager");
            C228039ra.A00();
            C227819rD r0 = A022.A02;
            if (r0 == null) {
                return true;
            }
            r0.Adu();
            return true;
        }
        DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) a3n.A02(DeviceEventManagerModule.class);
        if (deviceEventManagerModule == null) {
            return true;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    public IgReactDelegate(AnonymousClass1HD r2) {
        super(r2);
    }

    public final void handleException(Exception exc) {
        A01(this);
    }
}
