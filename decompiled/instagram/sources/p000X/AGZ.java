package p000X;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.facebook.C0003R;

/* renamed from: X.AGZ */
public final class AGZ {
    public int A00 = 2;

    public AGZ(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        if (C06220Of.A01(context, (float) point.y) / C06220Of.A01(context, (float) context.getResources().getDimensionPixelSize(C0003R.dimen.account_row_height_with_padding)) <= 10.0f) {
            this.A00 = 1;
        }
    }
}
