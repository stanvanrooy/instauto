package p000X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.permissions.PermissionsModule;
import java.util.ArrayList;

/* renamed from: X.A5Y */
public final class A5Y implements Callback {
    public final /* synthetic */ C2102594w A00;
    public final /* synthetic */ C228259s1 A01;
    public final /* synthetic */ PermissionsModule A02;
    public final /* synthetic */ ArrayList A03;

    public final void invoke(Object... objArr) {
        C228259s1 r1;
        String str;
        int[] iArr = objArr[0];
        C23079A5b a5b = objArr[1];
        for (int i = 0; i < this.A03.size(); i++) {
            String str2 = (String) this.A03.get(i);
            if (iArr.length > 0 && iArr[i] == 0) {
                r1 = this.A01;
                str = "granted";
            } else if (a5b.shouldShowRequestPermissionRationale(str2)) {
                r1 = this.A01;
                str = "denied";
            } else {
                r1 = this.A01;
                str = "never_ask_again";
            }
            r1.putString(str2, str);
        }
        this.A00.resolve(this.A01);
    }

    public A5Y(PermissionsModule permissionsModule, ArrayList arrayList, C228259s1 r3, C2102594w r4) {
        this.A02 = permissionsModule;
        this.A03 = arrayList;
        this.A01 = r3;
        this.A00 = r4;
    }
}
