package p000X;

import android.widget.FrameLayout;
import com.instagram.canvas.view.widget.RichTextView;

/* renamed from: X.CX6 */
public final class CX6 {
    public static void A00(C27957CXt cXt, CXH cxh, boolean z) {
        int i;
        int i2;
        cXt.A01.setText(cxh.A01);
        cXt.A01.setTextDescriptor(cxh.AXu());
        if (z) {
            cXt.A01.setMinLines(2);
        }
        CY6.A02(cXt.A00, cxh.AX8().A01);
        cXt.A00.setBackgroundColor(cxh.AX8().A00);
        RichTextView richTextView = cXt.A01;
        switch (cxh.AX8().A02.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 5;
                break;
            default:
                i = 3;
                break;
        }
        richTextView.setGravity(i);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cXt.A01.getLayoutParams();
        switch (cxh.AX8().A02.intValue()) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 5;
                break;
            default:
                i2 = 3;
                break;
        }
        layoutParams.gravity = i2;
    }
}
