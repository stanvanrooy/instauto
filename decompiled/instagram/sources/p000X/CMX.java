package p000X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.CMX */
public final class CMX extends AnonymousClass1ZK {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;

    public CMX(View view) {
        super(view);
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.title);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.subtitle);
        this.A00 = (ImageView) view.findViewById(C0003R.C0005id.image);
    }
}
