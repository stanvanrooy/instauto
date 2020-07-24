package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.AH4 */
public final class AH4 extends AH1 implements C54092Vs, PopupWindow.OnDismissListener, View.OnKeyListener, AdapterView.OnItemClickListener {
    public int A00;
    public int A01 = 0;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public PopupWindow.OnDismissListener A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public C54122Vv A09;
    public final int A0A;
    public final Context A0B;
    public final View.OnAttachStateChangeListener A0C = new AHU(this);
    public final ViewTreeObserver.OnGlobalLayoutListener A0D = new AHQ(this);
    public final AnonymousClass99P A0E;
    public final C54042Vn A0F;
    public final AnonymousClass99T A0G;
    public final int A0H;
    public final int A0I;
    public final boolean A0J;

    public final boolean AEZ() {
        return false;
    }

    public final boolean BPP(AnonymousClass99K r14) {
        boolean z;
        AnonymousClass99K r8 = r14;
        if (r14.hasVisibleItems()) {
            AH2 ah2 = new AH2(this.A0B, r8, this.A03, this.A0J, this.A0H, this.A0I);
            ah2.A04(this.A09);
            int size = r14.size();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = r14.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i++;
            }
            ah2.A05 = z2;
            AH1 ah1 = ah2.A03;
            if (ah1 != null) {
                ah1.A08(z2);
            }
            ah2.A02 = this.A05;
            this.A05 = null;
            this.A0F.A0F(false);
            AnonymousClass99T r0 = this.A0G;
            int AN6 = r0.AN6();
            int AZv = r0.AZv();
            if ((Gravity.getAbsoluteGravity(this.A01, this.A02.getLayoutDirection()) & 7) == 5) {
                AN6 += this.A02.getWidth();
            }
            if (ah2.A05()) {
                z = true;
            } else if (ah2.A01 == null) {
                z = false;
            } else {
                AH2.A00(ah2, AN6, AZv, true, true);
                z = true;
            }
            if (z) {
                C54122Vv r02 = this.A09;
                if (r02 != null) {
                    r02.BDK(r14);
                }
                return true;
            }
        }
        return false;
    }

    public final void Bsm(boolean z) {
        this.A06 = false;
        AnonymousClass99P r1 = this.A0E;
        if (r1 != null) {
            AnonymousClass0Z1.A00(r1, 1956355386);
        }
    }

    public final void onDismiss() {
        this.A08 = true;
        this.A0F.close();
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0D);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0C);
        PopupWindow.OnDismissListener onDismissListener = this.A05;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final ListView AP5() {
        return this.A0G.AP5();
    }

    public final boolean Ahh() {
        if (this.A08 || !this.A0G.Ahh()) {
            return false;
        }
        return true;
    }

    public final void Awx(C54042Vn r2, boolean z) {
        if (r2 == this.A0F) {
            dismiss();
            C54122Vv r0 = this.A09;
            if (r0 != null) {
                r0.Awx(r2, z);
            }
        }
    }

    public AH4(Context context, C54042Vn r6, View view, int i, int i2, boolean z) {
        this.A0B = context;
        this.A0F = r6;
        this.A0J = z;
        this.A0E = new AnonymousClass99P(r6, LayoutInflater.from(context), this.A0J, C0003R.layout.abc_popup_menu_item_layout);
        this.A0H = i;
        this.A0I = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels >> 1, resources.getDimensionPixelSize(C0003R.dimen.abc_config_prefDialogWidth));
        this.A02 = view;
        this.A0G = new AnonymousClass99T(this.A0B, this.A0H, this.A0I);
        r6.A0D(this, context);
    }

    public final void dismiss() {
        if (Ahh()) {
            this.A0G.dismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void show() {
        boolean z;
        View view;
        Rect rect;
        if (Ahh()) {
            z = true;
        } else if (this.A08 || (view = this.A02) == null) {
            z = false;
        } else {
            this.A03 = view;
            this.A0G.A0A.setOnDismissListener(this);
            AnonymousClass99T r0 = this.A0G;
            r0.A08 = this;
            r0.A0E = true;
            r0.A0A.setFocusable(true);
            View view2 = this.A03;
            boolean z2 = false;
            if (this.A04 == null) {
                z2 = true;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.A04 = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.A0D);
            }
            view2.addOnAttachStateChangeListener(this.A0C);
            AnonymousClass99T r1 = this.A0G;
            r1.A07 = view2;
            r1.A01 = this.A01;
            if (!this.A06) {
                this.A00 = AH1.A00(this.A0E, this.A0B, this.A0A);
                this.A06 = true;
            }
            this.A0G.A02(this.A00);
            this.A0G.A0A.setInputMethodMode(2);
            AnonymousClass99T r2 = this.A0G;
            Rect rect2 = this.A00;
            Rect rect3 = rect2;
            if (rect2 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            r2.A06 = rect;
            this.A0G.show();
            ListView AP5 = this.A0G.AP5();
            AP5.setOnKeyListener(this);
            if (this.A07 && this.A0F.A05 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.A0B).inflate(C0003R.layout.abc_popup_menu_header_item_layout, AP5, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(this.A0F.A05);
                }
                frameLayout.setEnabled(false);
                AP5.addHeaderView(frameLayout, (Object) null, false);
            }
            this.A0G.Bff(this.A0E);
            this.A0G.show();
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void BgL(C54122Vv r1) {
        this.A09 = r1;
    }
}
