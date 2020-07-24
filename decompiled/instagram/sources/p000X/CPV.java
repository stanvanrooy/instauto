package p000X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.facebook.C0003R;

/* renamed from: X.CPV */
public final class CPV {
    public static final AnonymousClass1EA A06 = AnonymousClass1EA.A00(5.0d, 10.0d);
    public View A00;
    public View A01;
    public ImageView A02;
    public C27755CPz A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A05 = new CPY(this);

    public CPV(View view, View view2, C27755CPz cPz) {
        this.A00 = view;
        ImageView imageView = (ImageView) view.findViewById(C0003R.C0005id.type_indicator_icon);
        this.A02 = imageView;
        imageView.setColorFilter(C26771Ff.A00(C019000b.A00(this.A00.getContext(), C0003R.color.igds_primary_icon)));
        this.A01 = view2;
        this.A03 = cPz;
    }
}
