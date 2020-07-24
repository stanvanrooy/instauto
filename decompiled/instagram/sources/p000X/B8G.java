package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.B8G */
public final class B8G extends AnonymousClass1BT {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if ((r3 & r1) == r1) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (A08() == p000X.Constants.ONE) goto L_0x0047;
     */
    private boolean A07(Intent intent, Context context, ComponentInfo componentInfo, String str) {
        String str2;
        C23463ANk aNk;
        AnonymousClass0XP r1;
        Object[] objArr;
        String jSONObject;
        String str3;
        boolean z;
        int i;
        boolean z2;
        ComponentInfo componentInfo2 = componentInfo;
        String str4 = str;
        if (componentInfo2.exported) {
            if (str == null) {
                return true;
            }
            try {
                int i2 = context.getPackageManager().getPermissionInfo(str4, 0).protectionLevel;
                boolean z3 = false;
                if (Build.VERSION.SDK_INT >= 23) {
                    z3 = true;
                }
                if (z3) {
                    i = B8N.A00();
                } else {
                    i = 3;
                }
                if ((i2 & 2) != 2) {
                    z2 = false;
                }
                z2 = true;
                if (!z2) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                if (!A09()) {
                    z = false;
                }
                z = true;
                if (z) {
                    this.A00.Bbw("AccessibleByAnyAppIntentScope", String.format("Error checking permission for %s/%s but fail-open: exported=%s, permission=%s.", new Object[]{componentInfo2.packageName, componentInfo2.name, Boolean.valueOf(componentInfo2.exported), str}), e);
                    return true;
                }
            }
        }
        if (A09()) {
            try {
                aNk = C23454ANb.A00(intent);
                str2 = null;
            } catch (JSONException e2) {
                str2 = e2.getMessage();
                aNk = null;
            }
            if (aNk == null) {
                r1 = this.A00;
                objArr = new Object[]{componentInfo2.packageName, componentInfo2.name, Boolean.valueOf(componentInfo2.exported), str, context.getPackageName(), str2};
                str3 = "Fail-open: allowing non-public component %s/%s: exported=%s, permission=%s for context package %s with error in intent parser %s";
            } else {
                r1 = this.A00;
                objArr = new Object[6];
                objArr[0] = componentInfo2.packageName;
                objArr[1] = componentInfo2.name;
                objArr[2] = Boolean.valueOf(componentInfo2.exported);
                objArr[3] = str;
                objArr[4] = context.getPackageName();
                JSONObject jSONObject2 = aNk.A01;
                if (jSONObject2 == null) {
                    jSONObject = "";
                } else {
                    jSONObject = jSONObject2.toString();
                }
                objArr[5] = jSONObject;
                str3 = "Fail-open: allowing non-public component %s/%s: exported=%s, permission=%s for context package %s from intent %s";
            }
            r1.Bbw("AccessibleByAnyAppIntentScope", String.format(str3, objArr), (Throwable) null);
            return true;
        }
        return false;
    }

    public final Intent A0B(Intent intent, Context context, String str) {
        throw new UnsupportedOperationException();
    }

    private Intent A00(Intent intent, List list, boolean z) {
        if (list.isEmpty()) {
            this.A00.Bbw("AccessibleByAnyAppIntentScope", "No matching public components.", (Throwable) null);
            return null;
        }
        if (z) {
            if (list.size() > 1) {
                C23976Aeb.A00(intent, this.A00, A09());
                return AnonymousClass1BT.A01(AnonymousClass1BT.A05(list, intent));
            }
            ComponentInfo componentInfo = (ComponentInfo) list.get(0);
            intent.setComponent(new ComponentName(componentInfo.packageName, componentInfo.name));
        }
        C23976Aeb.A00(intent, this.A00, A09());
        return intent;
    }

    public final Intent A0A(Intent intent, Context context, String str) {
        List A03 = AnonymousClass1BT.A03(intent, context, 65600);
        Iterator it = A03.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = (ActivityInfo) it.next();
            if (!A07(intent, context, activityInfo, activityInfo.permission)) {
                z = true;
                it.remove();
            }
        }
        return A00(intent, A03, z);
    }

    public final Intent A0C(Intent intent, Context context, String str) {
        List A04 = AnonymousClass1BT.A04(intent, context, 65600);
        Iterator it = A04.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ServiceInfo serviceInfo = (ServiceInfo) it.next();
            if (!A07(intent, context, serviceInfo, serviceInfo.permission)) {
                z = true;
                it.remove();
            }
        }
        return A00(intent, A04, z);
    }

    public final B8L A0D() {
        return B8L.ACCESSIBLE_BY_ANY_APP;
    }

    public B8G(AnonymousClass0XO r1, AnonymousClass0XP r2, AnonymousClass1BN r3) {
        super(r1, r2, r3);
    }
}
