package p000X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.permissions.PermissionsModule;

/* renamed from: X.A5Z */
public final class A5Z implements Callback {
    public final /* synthetic */ C2102594w A00;
    public final /* synthetic */ PermissionsModule A01;
    public final /* synthetic */ String A02;

    public final void invoke(Object... objArr) {
        C2102594w r1;
        String str;
        int[] iArr = objArr[0];
        if (iArr.length > 0 && iArr[0] == 0) {
            r1 = this.A00;
            str = "granted";
        } else if (objArr[1].shouldShowRequestPermissionRationale(this.A02)) {
            r1 = this.A00;
            str = "denied";
        } else {
            r1 = this.A00;
            str = "never_ask_again";
        }
        r1.resolve(str);
    }

    public A5Z(PermissionsModule permissionsModule, C2102594w r2, String str) {
        this.A01 = permissionsModule;
        this.A00 = r2;
        this.A02 = str;
    }
}
