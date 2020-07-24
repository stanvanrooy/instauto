package p000X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.AD0 */
public final class AD0 extends YogaNodeJNIBase {
    public final void finalize() {
        try {
            long j = this.mNativePointer;
            if (j != 0) {
                this.mNativePointer = 0;
                YogaNative.jni_YGNodeFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }

    public AD0() {
        super(YogaNative.jni_YGNodeNewJNI());
    }

    public AD0(A9F a9f) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(((AD1) a9f).A00));
    }
}
