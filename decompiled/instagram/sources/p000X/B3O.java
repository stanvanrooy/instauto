package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.B3O */
public final class B3O extends C29121Or {
    public B3N A00;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public B3O(B3N b3n) {
        this.A00 = b3n;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(1744485476);
        if (i == 0) {
            B3I b3i = (B3I) obj;
            int i2 = 0;
            for (int i3 = 0; i3 < b3i.A04.size(); i3++) {
                if (((B3K) b3i.A04.get(i3)).A03) {
                    i2++;
                }
            }
            Context context = view.getContext();
            B3S b3s = (B3S) view.getTag();
            boolean z = false;
            if (i2 > 0) {
                z = true;
            }
            B3N b3n = this.A00;
            ((TextView) b3s.A00.findViewById(C0003R.C0005id.button_multi_select_next)).setText(context.getString(C0003R.string.next).toUpperCase());
            b3s.A00.setEnabled(z);
            ((TextView) b3s.A00.findViewById(C0003R.C0005id.button_multi_select_next)).setOnClickListener(new B3L(b3n));
            AnonymousClass0Z0.A0A(2062890344, A03);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
        AnonymousClass0Z0.A0A(-70605271, A03);
        throw illegalStateException;
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(1418851760);
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0003R.layout.answers_footer, viewGroup, false);
            inflate.setTag(new B3S(inflate));
            AnonymousClass0Z0.A0A(785749397, A03);
            return inflate;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
        AnonymousClass0Z0.A0A(1832828184, A03);
        throw illegalStateException;
    }
}
