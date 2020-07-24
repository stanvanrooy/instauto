package p000X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.uimanager.ReactShadowNode;

/* renamed from: X.A8q */
public final class A8q {
    public final SparseArray A00 = new SparseArray();
    public final SparseBooleanArray A01 = new SparseBooleanArray();
    public final A95 A02 = new A95();

    public final ReactShadowNode A00(int i) {
        this.A02.A00();
        return (ReactShadowNode) this.A00.get(i);
    }
}
