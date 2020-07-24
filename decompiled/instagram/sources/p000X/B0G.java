package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.B0G */
public final class B0G extends B0J {
    public static B0K A00(Context context, AutofillData autofillData) {
        String str;
        String join;
        int i;
        B0F b0f;
        ArrayList arrayList = new ArrayList();
        for (B0F b0f2 : B0F.values()) {
            if (b0f2.A00(autofillData) != null) {
                arrayList.add(b0f2);
            }
        }
        int i2 = 0;
        if (arrayList.size() == 1) {
            str = ((B0F) arrayList.get(0)).A01(autofillData, context);
            join = ((B0F) arrayList.get(0)).A00(autofillData);
        } else {
            Iterator it = B0J.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                B0F b0f3 = (B0F) it.next();
                if (arrayList.contains(b0f3)) {
                    str = b0f3.A00(autofillData);
                    arrayList.remove(b0f3);
                    break;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            while (i2 < arrayList.size()) {
                B0F b0f4 = (B0F) arrayList.get(i2);
                if (b0f4 == B0F.A03 && (i = i2 + 1) < arrayList.size() && arrayList.get(i) == (b0f = B0F.A05)) {
                    arrayList2.add(AnonymousClass000.A0J(B0F.A03.A00(autofillData), " · ", b0f.A00(autofillData)));
                    i2 += 2;
                } else {
                    arrayList2.add(b0f4.A00(autofillData));
                    i2++;
                }
            }
            join = TextUtils.join("\n", arrayList2);
        }
        Pair create = Pair.create(str, join);
        B0K b0k = new B0K(context);
        b0k.setId(View.generateViewId());
        b0k.setTitle((String) create.first);
        b0k.setSubtitle((String) create.second);
        b0k.setExtraButtonText(context.getResources().getString(C0003R.string.edit));
        return b0k;
    }
}
