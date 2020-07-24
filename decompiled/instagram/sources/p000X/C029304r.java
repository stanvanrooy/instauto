package p000X;

import com.facebook.common.classmarkers.DynamicClassMarkerCreation;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.04r  reason: invalid class name and case insensitive filesystem */
public final class C029304r extends C10030cY {
    public static final Set A00;

    static {
        HashSet hashSet = new HashSet();
        A00 = hashSet;
        hashSet.add(31784974);
        Set set = A00;
        set.add(31784962);
        set.add(31784979);
        set.add(17301505);
        set.add(23592961);
    }

    public final AnonymousClass0IF getListenerMarkers() {
        int[] iArr = new int[A00.size()];
        int i = 0;
        for (Integer intValue : A00) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return new AnonymousClass0IF(iArr, (int[]) null);
    }

    public final void onMarkerStart(AnonymousClass0ID r3) {
        if (A00.contains(Integer.valueOf(r3.A04))) {
            DynamicClassMarkerCreation.generateClassLoadMarkerStart(AnonymousClass000.A05("CLM.QplId", r3.A04));
        }
    }

    public final void onMarkerStop(AnonymousClass0ID r3) {
        if (A00.contains(Integer.valueOf(r3.A04))) {
            DynamicClassMarkerCreation.generateClassLoadMarkerEnd(AnonymousClass000.A05("CLM.QplId", r3.A04), AnonymousClass0IU.A00(r3.A0L));
        }
    }
}
