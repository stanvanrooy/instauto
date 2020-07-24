package p000X;

import android.content.pm.ComponentInfo;
import java.util.List;

/* renamed from: X.B8O */
public final class B8O {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;

    public B8O(String str, String str2, String str3, List list, List list2, List list3, List list4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
        this.A05 = list2;
        this.A04 = list3;
        this.A06 = list4;
    }

    public static ComponentInfo[] A00(B8O b8o, List list) {
        ComponentInfo[] componentInfoArr = new ComponentInfo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ComponentInfo componentInfo = new ComponentInfo();
            componentInfoArr[i] = componentInfo;
            componentInfo.packageName = b8o.A00;
            componentInfo.name = (String) list.get(i);
        }
        return componentInfoArr;
    }
}
