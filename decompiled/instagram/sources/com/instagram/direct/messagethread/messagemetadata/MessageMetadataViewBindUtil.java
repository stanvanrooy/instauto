package com.instagram.direct.messagethread.messagemetadata;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass3NX;
import p000X.AnonymousClass3O1;
import p000X.AnonymousClass3O6;
import p000X.AnonymousClass4I5;
import p000X.AnonymousClass4IJ;
import p000X.C019000b;
import p000X.C06400Ox;
import p000X.C26571Ea;
import p000X.C26771Ff;

public final class MessageMetadataViewBindUtil {
    public static void A00(AnonymousClass3NX r8, String str, AnonymousClass3O1 r10, AnonymousClass3O1 r11, int i, boolean z, String str2, AnonymousClass4I5 r15) {
        AnonymousClass4IJ r4;
        float f;
        if (z) {
            r4 = new AnonymousClass4IJ(r15, str2);
        } else {
            r4 = null;
        }
        TextView textView = r8.A09;
        Context context = textView.getContext();
        Drawable A03 = C019000b.A03(context, r10.A01.intValue());
        A03.mutate();
        A03.setColorFilter(C26771Ff.A00(i));
        if (C06400Ox.A02(context)) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A03, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(A03, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(C0003R.dimen.direct_row_message_send_state_icon_text_gap));
        boolean z2 = r8.A05;
        C26571Ea r6 = r8.A02;
        C26571Ea r7 = r8.A03;
        if (r11.A02.intValue() != 0 || z2) {
            r6.A02(8);
            r7.A02(8);
        } else {
            ImageView imageView = (ImageView) r6.A01();
            Drawable A032 = C019000b.A03(imageView.getContext(), r11.A01.intValue());
            if (r11.A04) {
                A032.setAutoMirrored(true);
            }
            A032.mutate();
            A032.setColorFilter(C26771Ff.A00(i));
            if (r11.A03) {
                r7.A02(0);
                imageView.setImageDrawable((Drawable) null);
                r6.A02(8);
            } else {
                imageView.setImageDrawable(A032);
                imageView.setRotation(r11.A00);
                imageView.setOnClickListener(r4);
                r6.A02(0);
                r7.A02(8);
            }
        }
        r8.A00 = r11.A00;
        if (!r11.A03) {
            boolean z3 = false;
            if (r11.A02.intValue() == 0) {
                z3 = true;
            }
            Context context2 = r8.A09.getContext();
            if (z3) {
                Resources resources = context2.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.direct_row_message_action_icon_width) - resources.getDimensionPixelSize(C0003R.dimen.direct_row_message_common_padding);
                if (!C06400Ox.A02(context2)) {
                    dimensionPixelSize = -dimensionPixelSize;
                }
                f = (float) dimensionPixelSize;
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            r8.A01 = f;
            float f2 = f * (1.0f - r8.A0A.A01);
            AnonymousClass3O6 r0 = r8.A04;
            if (r0 != null) {
                r0.BWR(f2);
            }
        }
        r8.A09.setText(str);
        r8.A09.setTextColor(i);
    }
}
