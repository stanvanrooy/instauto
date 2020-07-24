package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.A6S */
public final class A6S {
    public static final Point A00 = new Point();
    public static final Point A01 = new Point();
    public static final Point A02 = new Point();

    public static Point A00(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        AnonymousClass0FY.A00(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(A01, A00);
        defaultDisplay.getSize(A02);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(AnonymousClass0C5.$const$string(38), "dimen", "android");
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        Point point = A02;
        if (point.x < point.y) {
            return new Point(A01.x, A00.y + i);
        }
        return new Point(A00.x, A01.y + i);
    }
}
