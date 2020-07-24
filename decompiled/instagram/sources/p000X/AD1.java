package p000X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.AD1 */
public abstract class AD1 extends A9F {
    public long A00;

    public AD1() {
        long jni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jni_YGConfigNewJNI != 0) {
            this.A00 = jni_YGConfigNewJNI;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }
}
