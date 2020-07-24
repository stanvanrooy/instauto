package p000X;

import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.BNF */
public final class BNF extends BOA {
    public final ContentResolver A00;
    public final DisplayMetrics A01;
    public final Display A02;
    public final WindowManager A03;

    public BNF(Context context, BQH bqh) {
        super(context, bqh);
        Display display;
        this.A01 = context.getResources().getDisplayMetrics();
        this.A00 = context.getContentResolver();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.A03 = windowManager;
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        } else {
            display = null;
        }
        this.A02 = display;
    }
}
