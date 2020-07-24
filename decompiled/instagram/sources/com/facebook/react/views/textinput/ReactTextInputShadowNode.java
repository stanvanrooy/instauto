package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import p000X.A0G;
import p000X.A0c;
import p000X.A0k;
import p000X.A5P;
import p000X.A8I;
import p000X.A8K;
import p000X.A8M;
import p000X.A8p;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass9AF;
import p000X.C230049z6;
import p000X.C230209zY;
import p000X.C23043A0y;
import p000X.C23053A3d;
import p000X.C23126A8e;
import p000X.C25913Bc3;

public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements A5P {
    public String A00;
    public String A01;
    public int A02;
    public int A03;
    public int A04;
    public EditText A05;
    public AnonymousClass9AF A06;

    public final boolean A0B() {
        return true;
    }

    public final boolean A0C() {
        return true;
    }

    @ReactProp(name = "selection")
    public void setSelection(C23043A0y a0y) {
        this.A03 = -1;
        this.A04 = -1;
        if (a0y != null && a0y.hasKey("start") && a0y.hasKey("end")) {
            this.A04 = a0y.getInt("start");
            this.A03 = a0y.getInt("end");
            A06();
        }
    }

    public final void A09(A8K a8k) {
        A8K a8k2 = a8k;
        super.A09(a8k2);
        if (this.A02 != -1) {
            Spannable A0D = A0D(this, this.A01, false, (A8I) null);
            int i = this.A02;
            boolean z = this.A0J;
            A8M a8m = this.A05;
            C230209zY r5 = new C230209zY(A0D, i, z, a8m.getLayoutPadding(C23126A8e.A00(0)), a8m.getLayoutPadding(C23126A8e.A00(1)), a8m.getLayoutPadding(C23126A8e.A00(2)), a8m.getLayoutPadding(C23126A8e.A00(3)), this.A00, this.A0B, this.A09, this.A04, this.A03);
            a8k2.A0F.add(new A8p(a8k2, ATb(), r5));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    public final long Ap5(A8M a8m, float f, C230049z6 r7, float f2, C230049z6 r9) {
        int i;
        int makeMeasureSpec;
        int i2;
        int i3;
        int makeMeasureSpec2;
        int i4;
        int i5;
        EditText editText = this.A05;
        AnonymousClass0FY.A00(editText);
        AnonymousClass9AF r0 = this.A06;
        if (r0 != null) {
            r0.A00(editText);
        } else {
            editText.setTextSize(0, (float) this.A0E.A02());
            int i6 = this.A0A;
            if (i6 != -1) {
                editText.setLines(i6);
            }
            if (Build.VERSION.SDK_INT >= 23 && editText.getBreakStrategy() != (i = this.A0B)) {
                editText.setBreakStrategy(i);
            }
        }
        editText.setHint(this.A00);
        if (r7 == C230049z6.EXACTLY) {
            i2 = (int) f;
            i3 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
        } else if (r7 == C230049z6.AT_MOST) {
            i2 = (int) f;
            i3 = Process.WAIT_RESULT_TIMEOUT;
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            if (r9 != C230049z6.EXACTLY) {
                i4 = (int) f2;
                i5 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
            } else if (r9 == C230049z6.AT_MOST) {
                i4 = (int) f2;
                i5 = Process.WAIT_RESULT_TIMEOUT;
            } else {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                editText.measure(makeMeasureSpec, makeMeasureSpec2);
                return A0c.A00((float) editText.getMeasuredWidth(), (float) editText.getMeasuredHeight());
            }
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, i5);
            editText.measure(makeMeasureSpec, makeMeasureSpec2);
            return A0c.A00((float) editText.getMeasuredWidth(), (float) editText.getMeasuredHeight());
        }
        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i3);
        if (r9 != C230049z6.EXACTLY) {
        }
        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, i5);
        editText.measure(makeMeasureSpec, makeMeasureSpec2);
        return A0c.A00((float) editText.getMeasuredWidth(), (float) editText.getMeasuredHeight());
    }

    public final void Bih(Object obj) {
        AnonymousClass0FY.A02(obj instanceof AnonymousClass9AF);
        this.A06 = (AnonymousClass9AF) obj;
        ABz();
    }

    @ReactProp(name = "placeholder")
    public void setPlaceholder(String str) {
        this.A00 = str;
        A06();
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.A01 = str;
        if (str != null) {
            int i = this.A04;
            int length = str.length();
            if (i > length) {
                this.A04 = length;
            }
            if (this.A03 > length) {
                this.A03 = length;
            }
        } else {
            this.A04 = -1;
            this.A03 = -1;
        }
        A06();
    }

    public final void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "simple".equals(str)) {
            this.A0B = 0;
        } else if ("highQuality".equals(str)) {
            this.A0B = 1;
        } else if ("balanced".equals(str)) {
            this.A0B = 2;
        } else {
            throw new A0k(AnonymousClass000.A0E("Invalid textBreakStrategy: ", str));
        }
    }

    public final void A07(int i, float f) {
        super.A07(i, f);
        A06();
    }

    public final void BlA(C23053A3d a3d) {
        super.BlA(a3d);
        EditText editText = new EditText(AY1());
        this.A0K.A01(4, (float) editText.getPaddingStart());
        ReactShadowNodeImpl.A04(this);
        this.A0K.A01(1, (float) editText.getPaddingTop());
        ReactShadowNodeImpl.A04(this);
        this.A0K.A01(5, (float) editText.getPaddingEnd());
        ReactShadowNodeImpl.A04(this);
        this.A0K.A01(3, (float) editText.getPaddingBottom());
        ReactShadowNodeImpl.A04(this);
        this.A05 = editText;
        editText.setPadding(0, 0, 0, 0);
        this.A05.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.A02 = i;
    }

    public ReactTextInputShadowNode() {
        this((A0G) null);
    }

    public ReactTextInputShadowNode(A0G a0g) {
        super(a0g);
        this.A02 = -1;
        this.A01 = null;
        this.A00 = null;
        this.A04 = -1;
        this.A03 = -1;
        this.A0B = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        this.A05.setMeasureFunction(this);
    }
}
