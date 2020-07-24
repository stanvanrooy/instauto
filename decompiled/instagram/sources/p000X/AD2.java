package p000X;

import com.facebook.yoga.YogaNative;

/* renamed from: X.AD2 */
public final class AD2 extends AD1 {
    public final void finalize() {
        try {
            long j = this.A00;
            if (j != 0) {
                this.A00 = 0;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
