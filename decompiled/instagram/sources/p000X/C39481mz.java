package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1mz  reason: invalid class name and case insensitive filesystem */
public final class C39481mz {
    public static Drawable A00(Context context, List list, int i, boolean z, Integer num, boolean z2, boolean z3, Float f, Integer num2, Integer num3) {
        int intValue;
        int intValue2;
        int i2;
        float f2;
        C39491n0 r5;
        Context context2 = context;
        if (num2 == null) {
            intValue = (int) C06220Of.A03(context, 2);
        } else {
            intValue = num2.intValue();
        }
        if (num3 == null) {
            intValue2 = 3;
        } else {
            intValue2 = num3.intValue();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            List list2 = list;
            i2 = i;
            if (i3 >= Math.min(intValue2, list2.size())) {
                break;
            }
            ImageUrl imageUrl = (ImageUrl) list2.get(i3);
            if (z2) {
                r5 = new C39491n0(i2, 1, AnonymousClass1BA.A01(context, C0003R.attr.avatarInnerStroke), intValue, AnonymousClass1BA.A01(context, C0003R.attr.backgroundColorPrimary), 0, z3, imageUrl);
            } else {
                r5 = new C39491n0(i2, intValue, 0, 0, imageUrl);
            }
            arrayList.add(r5);
            i3++;
        }
        if (f != null) {
            f2 = f.floatValue();
        } else {
            f2 = 0.4f;
        }
        return new C39511n2(context2, arrayList, i2, f2, z, num);
    }
}
