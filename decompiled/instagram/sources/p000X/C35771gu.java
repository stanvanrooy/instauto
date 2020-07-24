package p000X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import java.util.List;

/* renamed from: X.1gu  reason: invalid class name and case insensitive filesystem */
public final class C35771gu {
    public static void A00(Context context, AnonymousClass0C1 r15, C35581gb r16, C31581Yw r17, int i, C31581Yw r19, AnonymousClass1OX r20, List list, AnonymousClass0RN r22, boolean z, boolean z2, AnonymousClass1I2 r25) {
        C35581gb r4 = r16;
        int i2 = i;
        C31581Yw r7 = r17;
        AnonymousClass0C1 r5 = r15;
        boolean z3 = z2;
        AnonymousClass0C1 r12 = r15;
        C35601gd r13 = r4.A01;
        C31581Yw r14 = r7;
        int i3 = i2;
        C35781gv.A00(context, r12, r13, r14, i3, r20, list, z3);
        C35831h0.A01(r5, r4.A00, r7, i2, z, z3, r19, r22, r25);
        AnonymousClass0L7 r3 = AnonymousClass0L7.STORIES_TRAY_PROTOTYPES;
        if (((Boolean) AnonymousClass0L6.A02(r5, r3, "enable_multi_row", false, (AnonymousClass04H) null)).booleanValue()) {
            C35741gr r1 = r4.A00;
            GradientSpinner gradientSpinner = r1.A06.A0F;
            View AGS = r1.AGS();
            int intValue = ((Integer) AnonymousClass0L6.A02(r5, r3, "avatar_size", 56, (AnonymousClass04H) null)).intValue();
            float floatValue = new Float(((double) intValue) * 1.15d).floatValue();
            Context context2 = gradientSpinner.getContext();
            int applyDimension = (int) TypedValue.applyDimension(1, floatValue, context2.getResources().getDisplayMetrics());
            C06220Of.A0V(gradientSpinner, applyDimension, applyDimension);
            gradientSpinner.getContext();
            int applyDimension2 = (int) TypedValue.applyDimension(1, (float) intValue, context2.getResources().getDisplayMetrics());
            C06220Of.A0V(AGS, applyDimension2, applyDimension2);
        }
    }
}
