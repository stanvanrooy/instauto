package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.B3P */
public final class B3P extends C29121Or {
    public final boolean A00;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public B3P(boolean z) {
        this.A00 = z;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(7889590);
        if (i == 0) {
            B3R b3r = (B3R) view.getTag();
            B3K b3k = (B3K) obj;
            b3r.A01.setText(b3k.A01);
            b3r.A00.setEnabled(b3k.A03);
            b3r.A00.setSelected(b3k.A03);
            AnonymousClass0Z0.A0A(-167453006, A03);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
        AnonymousClass0Z0.A0A(187582686, A03);
        throw illegalStateException;
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(482523542);
        if (i == 0) {
            Context context = viewGroup.getContext();
            boolean z = this.A00;
            View inflate = LayoutInflater.from(context).inflate(C0003R.layout.answer_row, viewGroup, false);
            B3R b3r = new B3R();
            b3r.A01 = (TextView) inflate.findViewById(C0003R.C0005id.text);
            ImageView imageView = (ImageView) inflate.findViewById(C0003R.C0005id.check);
            b3r.A00 = imageView;
            if (z) {
                imageView.setEnabled(false);
            }
            inflate.setTag(b3r);
            AnonymousClass0Z0.A0A(-311734117, A03);
            return inflate;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported view type");
        AnonymousClass0Z0.A0A(1248673214, A03);
        throw illegalStateException;
    }
}
