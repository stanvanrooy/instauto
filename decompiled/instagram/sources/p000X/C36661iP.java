package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1iP  reason: invalid class name and case insensitive filesystem */
public final class C36661iP {
    public static View A00(Context context, boolean z, int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (z) {
            AnonymousClass1X6.A00(layoutParams, context.getResources().getDimensionPixelSize(C0003R.dimen.asset_picker_emoji_cell_margin));
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(C0003R.layout.emoji_row_item, (ViewGroup) null);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setTag(new C36611iK(frameLayout, i));
        return frameLayout;
    }

    public static void A01(C36611iK r11, AnonymousClass0C1 r12, C30941Vv r13, C36651iO r14, boolean z) {
        int i;
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("EmojiGridRowItemViewBinder.bindView", -891773709);
        }
        C36611iK r6 = r11;
        try {
            Resources resources = r11.A09.getContext().getResources();
            r11.A08.A02();
            C30941Vv r9 = r13;
            int i2 = r13.A00;
            if (i2 < 0) {
                i = -1;
            } else {
                i = i2 % 6;
            }
            r11.A02.setTranslate(((float) (-i)) * ((float) resources.getDimensionPixelSize(C0003R.dimen.emoji_icon_size)), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            ViewGroup.LayoutParams layoutParams = r11.A09.getLayoutParams();
            int i3 = r11.A07;
            layoutParams.width = i3;
            layoutParams.height = i3;
            r11.A09.setLayoutParams(layoutParams);
            Matrix matrix = r11.A02;
            float f = r11.A01;
            matrix.postScale(f, f);
            r11.A04.setVisibility(8);
            if (i < 0) {
                r11.A09.setImageMatrix((Matrix) null);
                r11.A09.setScaleType(ImageView.ScaleType.FIT_CENTER);
                r11.A09.setUrl(C30941Vv.A03(r13.A01, r13.A02));
            } else {
                r11.A09.setImageMatrix(r11.A02);
                r11.A09.setScaleType(ImageView.ScaleType.MATRIX);
                r11.A09.setUrl(C36671iQ.A00(r13, r11.A06));
            }
            r11.A09.setContentDescription(r13.A02);
            r11.A09.setFocusable(true);
            r11.A09.setVisibility(0);
            boolean z2 = z;
            if (!z || !C36621iL.A01(r13)) {
                r6.A05.setVisibility(8);
            } else {
                r6.A05.setVisibility(0);
            }
            Context context = r6.A09.getContext();
            r6.A00 = new C36691iS(r6, context.getResources(), context, r9, r14, z2, r12);
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(125900618);
            }
        }
    }
}
