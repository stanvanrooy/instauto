package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.CX3 */
public final class CX3 {
    public static void A00(C93 c93, C27961CXx cXx, int i) {
        if (i < cXx.A01.size() && cXx.A01.get(i) != null) {
            cXx.A01.remove(i);
        }
        switch (c93.ordinal()) {
            case 1:
                List list = cXx.A01;
                ViewGroup viewGroup = cXx.A00;
                list.add(new C27957CXt(LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.canvas_text_block, viewGroup, false)));
                break;
            case 2:
                List list2 = cXx.A01;
                ViewGroup viewGroup2 = cXx.A00;
                list2.add(new C27951CXn(LayoutInflater.from(viewGroup2.getContext()).inflate(C0003R.layout.canvas_media_block, viewGroup2, false)));
                break;
        }
        if (cXx.A00.getChildAt(i) != null) {
            cXx.A00.removeViewAt(i);
        }
        cXx.A00.addView(((AnonymousClass1ZK) cXx.A01.get(i)).itemView, i);
    }
}
