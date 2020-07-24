package com.instagram.p009ui.widget.textview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.base.IgSimpleAutoCompleteTextView;
import java.lang.reflect.InvocationTargetException;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass3OD;
import p000X.AnonymousClass3OE;
import p000X.AnonymousClass3OG;
import p000X.C06340Or;
import p000X.C67472xJ;
import p000X.C67842xv;
import p000X.C950249p;
import p000X.C97464Je;

/* renamed from: com.instagram.ui.widget.textview.IgAutoCompleteTextView */
public class IgAutoCompleteTextView extends IgSimpleAutoCompleteTextView {
    public float A00;
    public int A01;
    public String A02;
    public int A03 = 2;
    public AnonymousClass1HK A04;
    public C97464Je A05;
    public boolean A06;
    public String[] A07;
    public final C67472xJ A08 = C67472xJ.MENTION_AND_HASHTAG;
    public final boolean A09 = C950249p.A00().booleanValue();

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass1HK r0;
        if (i != 4 || (r0 = this.A04) == null || !r0.onBackPressed()) {
            return super.onKeyPreIme(i, keyEvent);
        }
        return true;
    }

    private void A00() {
        String str = Build.MODEL;
        if (!str.equalsIgnoreCase("DROID3") && !str.equalsIgnoreCase("DROID4") && !str.equalsIgnoreCase("DROID BIONIC")) {
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            this.A01 = getResources().getDimensionPixelSize(C0003R.dimen.autocomplete_list_item_height);
            setRawInputType(getInputType() & -65537);
        }
    }

    public final boolean enoughToFilter() {
        return C67842xv.A03(this, this.A08, this.A03);
    }

    public String getCurrentTagOrUserName() {
        return C67842xv.A01(this, this.A08);
    }

    public int getMinNumToFilter() {
        return this.A03;
    }

    public String getMostRecentlyReplacedUserOrHashtagString() {
        return this.A02;
    }

    public C67472xJ getSupportedLinks() {
        return this.A08;
    }

    public final void onFilterComplete(int i) {
        super.onFilterComplete(Math.max(i, this.A06 ? 1 : 0));
        if (this.A00 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            float f = this.A00;
            if (((float) getAdapter().getCount()) <= f) {
                setDropDownHeight(-2);
            } else {
                setDropDownHeight((int) (f * ((float) this.A01)));
            }
        }
    }

    public final void performFiltering(CharSequence charSequence, int i) {
        super.performFiltering(C67842xv.A01(this, this.A08), i);
    }

    public void setInputContentInfoListener(String[] strArr, C97464Je r2) {
        this.A07 = strArr;
        this.A05 = r2;
    }

    public final void dismissDropDown() {
        super.dismissDropDown();
        if (this.A09) {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE}).invoke(this, new Object[]{true});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C97464Je r3;
        String[] strArr;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null || (r3 = this.A05) == null || (strArr = this.A07) == null || strArr.length <= 0) {
            return onCreateInputConnection;
        }
        AnonymousClass3OD.A00(editorInfo, strArr);
        return AnonymousClass3OG.A00(onCreateInputConnection, editorInfo, new AnonymousClass3OE(r3));
    }

    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            if (!C06340Or.A04(this, getText())) {
                throw e;
            }
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A062 = AnonymousClass0Z0.A06(1170619059);
        super.onFocusChanged(z, i, rect);
        if (this.A06 && z && enoughToFilter() && getWindowVisibility() == 0) {
            showDropDown();
        }
        AnonymousClass0Z0.A0D(-1284095498, A062);
    }

    public final void replaceText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.A02 = C67842xv.A01(this, this.A08);
            C67842xv.A00(this, charSequence, this.A08, false);
        }
    }

    public void setAlwaysShowWhenEnoughToFilter(boolean z) {
        this.A06 = z;
    }

    public void setBackHandler(AnonymousClass1HK r1) {
        this.A04 = r1;
    }

    public void setDropDownCustomHeight(int i) {
        setDropDownHeight(i);
    }

    public void setMinNumToFilter(int i) {
        this.A03 = i;
    }

    public IgAutoCompleteTextView(Context context) {
        super(context);
        A00();
    }

    public IgAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public IgAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
