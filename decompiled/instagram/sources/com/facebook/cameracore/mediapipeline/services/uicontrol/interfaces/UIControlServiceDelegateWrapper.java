package com.facebook.cameracore.mediapipeline.services.uicontrol.interfaces;

import android.os.Handler;
import android.os.Looper;
import com.facebook.native_bridge.NativeDataPromise;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass3CC;
import p000X.AnonymousClass3CE;
import p000X.AnonymousClass3CG;
import p000X.AnonymousClass3CI;
import p000X.C30639Dgo;
import p000X.C30640Dgp;
import p000X.C30641Dgq;
import p000X.C30642Dgr;
import p000X.C30643Dgs;
import p000X.C30644Dgt;
import p000X.C30646Dgv;
import p000X.C30647Dgw;
import p000X.C30648Dgx;
import p000X.C30649Dgy;

public class UIControlServiceDelegateWrapper {
    public final AnonymousClass3CC mEditTextDelegate;
    public final String mEffectId;
    public final Handler mHandler = new Handler(Looper.getMainLooper());
    public final AnonymousClass3CG mPickerDelegate;
    public NativeDataPromise mPromise;
    public final AnonymousClass3CE mRawTextInputDelegate;
    public final AnonymousClass3CI mSliderDelegate;

    public void configurePicker(PickerConfiguration pickerConfiguration) {
        AnonymousClass0ZA.A0E(this.mHandler, new C30649Dgy(this, pickerConfiguration), 1526782717);
    }

    public void enterRawTextEditMode(String str, RawEditableTextListener rawEditableTextListener) {
        AnonymousClass0ZA.A0E(this.mHandler, new C30642Dgr(this, str, rawEditableTextListener), -1040561494);
    }

    public void enterTextEditMode(String str, boolean z, NativeDataPromise nativeDataPromise) {
        this.mPromise = nativeDataPromise;
        AnonymousClass0ZA.A0E(this.mHandler, new C30644Dgt(this, str, z), -808687524);
    }

    public void exitRawTextEditMode() {
        AnonymousClass0ZA.A0E(this.mHandler, new C30643Dgs(this), -854464457);
    }

    public void hidePicker() {
        AnonymousClass0ZA.A0E(this.mHandler, new C30646Dgv(this), 686148521);
    }

    public void hideSlider() {
        AnonymousClass0ZA.A0E(this.mHandler, new C30641Dgq(this), -1895422288);
    }

    public void setPickerSelectedIndex(int i) {
        AnonymousClass0ZA.A0E(this.mHandler, new C30647Dgw(this, i), -544205596);
    }

    public void setSliderValue(float f) {
        AnonymousClass0ZA.A0E(this.mHandler, new C30639Dgo(this, f), 325175459);
    }

    public void showPicker(OnPickerItemSelectedListener onPickerItemSelectedListener) {
        AnonymousClass0ZA.A0E(this.mHandler, new C30648Dgx(this, onPickerItemSelectedListener), -330680982);
    }

    public void showSlider(OnAdjustableValueChangedListener onAdjustableValueChangedListener) {
        AnonymousClass0ZA.A0E(this.mHandler, new C30640Dgp(this, onAdjustableValueChangedListener), -682287867);
    }

    public UIControlServiceDelegateWrapper(String str, AnonymousClass3CG r4, AnonymousClass3CC r5, AnonymousClass3CE r6, AnonymousClass3CI r7) {
        this.mEffectId = str;
        this.mPickerDelegate = r4;
        this.mEditTextDelegate = r5;
        this.mRawTextInputDelegate = r6;
        this.mSliderDelegate = r7;
    }
}
