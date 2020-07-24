package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B8H */
public abstract class B8H extends AnonymousClass1BT {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    public boolean A0E(Context context, ComponentInfo componentInfo) {
        Integer num;
        if (!(this instanceof B8J)) {
            B8I b8i = (B8I) this;
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            ApplicationInfo applicationInfo2 = componentInfo.applicationInfo;
            if (applicationInfo == null || applicationInfo2 == null) {
                AnonymousClass0XP r2 = b8i.A00;
                r2.Bbw("ExternalIntentScope", "Null app info, current app: " + applicationInfo + ", target app: " + applicationInfo2, (Throwable) null);
                return false;
            }
            try {
                return !C25221B8j.A06(context, applicationInfo.uid, applicationInfo2.uid);
            } catch (SecurityException e) {
                b8i.A00.Bbw("ExternalIntentScope", AnonymousClass000.A0E("Unexpected exception in verifying signature for: ", componentInfo.packageName), e);
                num = b8i.A08();
                boolean z = false;
                if (num == Constants.A0N) {
                }
                return !z;
            }
        } else {
            B8J b8j = (B8J) this;
            ApplicationInfo applicationInfo3 = componentInfo.applicationInfo;
            if (applicationInfo3 == null) {
                b8j.A00.Bbw("ThirdPartyIntentScope", "Null application info.", (Throwable) null);
                return false;
            }
            try {
                return !b8j.A00.A07(B8Y.A00(applicationInfo3.uid, context), context);
            } catch (SecurityException e2) {
                b8j.A00.Bbw("ThirdPartyIntentScope", AnonymousClass000.A0E("Unexpected exception in checking trusted app for ", componentInfo.packageName), e2);
                num = b8j.A08();
                boolean z2 = false;
                if (num == Constants.A0N) {
                    z2 = true;
                }
                return !z2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r1 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (A08() == p000X.Constants.ONE) goto L_0x005f;
     */
    private Intent A00(Intent intent, Context context, List list) {
        boolean z;
        boolean z2;
        String str;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            if (A0E(context, componentInfo)) {
                ApplicationInfo applicationInfo = componentInfo.applicationInfo;
                if (applicationInfo != null) {
                    boolean equals = "com.android.internal.app.ResolverActivity".equals(applicationInfo.className);
                    z = true;
                }
                z = false;
                if (z) {
                    if (!A09()) {
                        z2 = false;
                    }
                    z2 = true;
                    if (z2) {
                        arrayList.add(componentInfo);
                        str = "Found potentially dangerous resolver but not removing: ";
                    } else {
                        str = "Removed potentially dangerous resolver: ";
                    }
                } else {
                    arrayList.add(componentInfo);
                }
            } else if (A09()) {
                arrayList.add(componentInfo);
                str = "Non-external/third-party component detected, but allowing because of fail-open: ";
            } else {
                str = "Removed non-external/third-party component: ";
            }
            this.A00.Bbw("DifferentKeyIntentScope", AnonymousClass000.A0E(str, AnonymousClass1BT.A02(intent)), (Throwable) null);
        }
        if (arrayList.isEmpty()) {
            this.A00.Bbw("DifferentKeyIntentScope", AnonymousClass000.A0E("No matching different-signature components for: ", AnonymousClass1BT.A02(intent)), (Throwable) null);
            return null;
        }
        if (arrayList.size() != list.size()) {
            if (arrayList.size() > 1) {
                intent = AnonymousClass1BT.A01(AnonymousClass1BT.A05(arrayList, intent));
            } else {
                ComponentInfo componentInfo2 = (ComponentInfo) arrayList.get(0);
                intent.setComponent(new ComponentName(componentInfo2.packageName, componentInfo2.name));
            }
        }
        C23976Aeb.A00(intent, this.A00, A09());
        return intent;
    }

    public final Intent A0B(Intent intent, Context context, String str) {
        throw new UnsupportedOperationException();
    }

    public final Intent A0A(Intent intent, Context context, String str) {
        if (AnonymousClass1BT.A06(intent, context)) {
            return null;
        }
        List A03 = AnonymousClass1BT.A03(intent, context, 65600);
        if (A03.isEmpty()) {
            A03 = AnonymousClass1BT.A03(intent, context, 0);
        }
        return A00(intent, context, A03);
    }

    public final Intent A0C(Intent intent, Context context, String str) {
        if (AnonymousClass1BT.A06(intent, context)) {
            return null;
        }
        List A04 = AnonymousClass1BT.A04(intent, context, 65600);
        if (A04.isEmpty()) {
            A04 = AnonymousClass1BT.A04(intent, context, 0);
        }
        return A00(intent, context, A04);
    }

    public B8H(AnonymousClass0XO r1, AnonymousClass0XP r2, AnonymousClass1BN r3) {
        super(r1, r2, r3);
    }
}
