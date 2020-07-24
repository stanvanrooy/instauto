package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.C0003R;

/* renamed from: X.CX5 */
public final class CX5 extends BaseAdapter {
    public CWQ A00;
    public C27944CXg A01;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getCount() {
        return this.A01.A00.A00.size();
    }

    public final Object getItem(int i) {
        return this.A01.A00.A00(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.canvas_media_block, viewGroup, false);
            view.setTag(new C27951CXn(view));
        }
        C27930CWs.A00(view.getContext(), (C27951CXn) view.getTag(), (C27942CXe) this.A01.A00.A00(i), this.A00, "slideshow", this.A01.getId());
        return view;
    }

    public CX5(C27944CXg cXg, CWQ cwq) {
        this.A01 = cXg;
        this.A00 = cwq;
    }
}
