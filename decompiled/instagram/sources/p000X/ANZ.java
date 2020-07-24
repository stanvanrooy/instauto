package p000X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.ANZ */
public final class ANZ {
    public static final Object A00 = new Object();
    public static final Object A01 = new Object();

    public static Bundle[] A00(C23453ANa[] aNaArr) {
        if (aNaArr == null) {
            return null;
        }
        int length = aNaArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < length; i++) {
            C23453ANa aNa = aNaArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", aNa.A02);
            bundle.putCharSequence("label", aNa.A01);
            bundle.putCharSequenceArray("choices", (CharSequence[]) null);
            bundle.putBoolean("allowFreeFormInput", aNa.A04);
            bundle.putBundle(B5B.INTENT_PARAM_EXTRAS, aNa.A00);
            Set<String> set = aNa.A03;
            if (set != null && !set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (String add : set) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
