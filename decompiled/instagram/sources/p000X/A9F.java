package p000X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.A9F */
public abstract class A9F {
    public void A00(float f) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(((AD1) this).A00, f);
    }

    public void A01(boolean z) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(((AD1) this).A00, z);
    }

    public void A02(boolean z) {
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(((AD1) this).A00, z);
    }
}
