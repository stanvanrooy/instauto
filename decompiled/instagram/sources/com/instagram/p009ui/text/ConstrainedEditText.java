package com.instagram.p009ui.text;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19g;
import p000X.AnonymousClass29T;
import p000X.AnonymousClass3OD;
import p000X.AnonymousClass3OE;
import p000X.AnonymousClass3OG;
import p000X.AnonymousClass7W8;
import p000X.C06220Of;
import p000X.C255719i;
import p000X.C28991Oe;
import p000X.C81993hh;

/* renamed from: com.instagram.ui.text.ConstrainedEditText */
public class ConstrainedEditText extends EditText implements C28991Oe {
    public int A00;
    public int A01;
    public String[] A02;
    public float A03;
    public int A04;
    public boolean A05;
    public final List A06;

    public final void A01(C81993hh r2) {
        this.A06.add(r2);
    }

    public final void B8g(int i, boolean z) {
        if (i > 0) {
            if (!TextUtils.isEmpty(getText())) {
                setSelection(getText().length());
            }
        } else if (i < this.A04) {
            clearFocus();
            for (C81993hh B8e : this.A06) {
                B8e.B8e();
            }
        }
        this.A05 = z;
        this.A04 = i;
        A00(this);
    }

    public static void A00(ConstrainedEditText constrainedEditText) {
        int i;
        float f;
        float f2;
        if (constrainedEditText.isLaidOut() && constrainedEditText.getLayout() != null) {
            int A08 = C06220Of.A08(constrainedEditText.getContext());
            int i2 = constrainedEditText.A01;
            int i3 = (A08 - i2) - constrainedEditText.A00;
            if (constrainedEditText.A05) {
                i = constrainedEditText.A04;
            } else {
                i = 0;
            }
            int i4 = i3 - i;
            constrainedEditText.setY((float) (i2 + ((i4 - constrainedEditText.getHeight()) >> 1)));
            if (constrainedEditText.A03 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = constrainedEditText.getScaleX() / constrainedEditText.A03;
                f2 = constrainedEditText.getScaleY() / constrainedEditText.A03;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float min = Math.min(1.0f, ((float) i4) / ((float) constrainedEditText.getHeight()));
            constrainedEditText.A03 = min;
            constrainedEditText.setScaleX(min * f);
            constrainedEditText.setScaleY(constrainedEditText.A03 * f2);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass19g.A00(getContext()).AAb(this, onCreateInputConnection, editorInfo);
        String[] strArr = this.A02;
        if (strArr == null || strArr.length == 0) {
            return onCreateInputConnection;
        }
        AnonymousClass7W8 r1 = new AnonymousClass7W8(this);
        AnonymousClass3OD.A00(editorInfo, strArr);
        return AnonymousClass3OG.A00(onCreateInputConnection, editorInfo, new AnonymousClass3OE(r1));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0Z0.A06(-86923528);
        super.onMeasure(i, i2);
        if (!TextUtils.isEmpty(getText())) {
            setMeasuredDimension(getMeasuredWidth(), AnonymousClass29T.A01(getLayout()) + getPaddingTop() + getPaddingBottom());
        }
        AnonymousClass0Z0.A0D(-1144488127, A062);
    }

    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.A06 != null) {
            for (int i3 = 0; i3 < this.A06.size(); i3++) {
                ((C81993hh) this.A06.get(i3)).BMA(this, i, i2);
            }
        }
    }

    public void setKeyListener(KeyListener keyListener) {
        AnonymousClass19g.A00(getContext()).AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }

    public void setSupportedContentMimeTypes(String... strArr) {
        this.A02 = strArr;
    }

    public ConstrainedEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public ConstrainedEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConstrainedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new ArrayList();
        this.A03 = -1.0f;
        C255719i A002 = AnonymousClass19g.A00(context);
        KeyListener keyListener = getKeyListener();
        A002.AAc(this, keyListener);
        super.setKeyListener(keyListener);
    }
}
