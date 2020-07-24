package p000X;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Comparator;

/* renamed from: X.A69 */
public final class A69 implements Comparator {
    public final /* synthetic */ A60 A00;

    public A69(A60 a60) {
        this.A00 = a60;
    }

    public final int compare(Object obj, Object obj2) {
        View view = (View) obj2;
        Integer viewZIndex = ViewGroupManager.getViewZIndex((View) obj);
        if (viewZIndex == null) {
            viewZIndex = 0;
        }
        Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view);
        if (viewZIndex2 == null) {
            viewZIndex2 = 0;
        }
        return viewZIndex.intValue() - viewZIndex2.intValue();
    }
}
