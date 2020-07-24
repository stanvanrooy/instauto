package p000X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.BEK */
public final class BEK {
    public static final B6O A02 = new B6O("SplitInstallInfoProvider");
    public final Context A00;
    public final String A01;

    public BEK(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    private final Bundle A00() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = this.A00.getPackageManager().getApplicationInfo(this.A01, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
            B6O.A01(A02, 3, "App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            B6O.A01(A02, 5, "App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public static final Set A01(BEK bek) {
        HashSet hashSet = new HashSet();
        Bundle A002 = bek.A00();
        if (A002 != null) {
            String string = A002.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                B6O.A01(A02, 3, "App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = null;
            try {
                PackageInfo packageInfo = bek.A00.getPackageManager().getPackageInfo(bek.A01, 0);
                if (packageInfo != null) {
                    strArr = packageInfo.splitNames;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                B6O.A01(A02, 5, "App is not found in PackageManager", new Object[0]);
            }
            if (strArr != null) {
                B6O.A01(A02, 3, "Adding splits from package manager: %s", new Object[]{Arrays.toString(strArr)});
                Collections.addAll(hashSet, strArr);
            } else {
                B6O.A01(A02, 3, "No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            BEP bep = (BEP) BEO.A00.get();
            if (bep != null) {
                hashSet.addAll(bep.mo42679a());
            }
        }
        return hashSet;
    }

    public final AnonymousClass4YH A02() {
        AnonymousClass4YH r4;
        String A002;
        B6O b6o;
        Object[] objArr;
        String str;
        Bundle A003 = A00();
        if (A003 == null) {
            b6o = A02;
            objArr = new Object[0];
            str = "No metadata found in Context.";
        } else {
            int i = A003.getInt("com.android.vending.splits");
            if (i == 0) {
                b6o = A02;
                objArr = new Object[0];
                str = "No metadata found in AndroidManifest.";
            } else {
                try {
                    BEM bem = new BEM(this.A00.getResources().getXml(i));
                    while (bem.A01.next() != 1) {
                        try {
                            if (bem.A01.getEventType() == 2) {
                                if (!bem.A01.getName().equals("splits")) {
                                    BEM.A01(bem);
                                } else {
                                    while (bem.A01.next() != 3) {
                                        if (bem.A01.getEventType() == 2) {
                                            if (!bem.A01.getName().equals("module") || (A002 = BEM.A00(bem, "name")) == null) {
                                                BEM.A01(bem);
                                            } else {
                                                while (bem.A01.next() != 3) {
                                                    if (bem.A01.getEventType() == 2) {
                                                        if (!bem.A01.getName().equals("language")) {
                                                            BEM.A01(bem);
                                                        } else {
                                                            while (bem.A01.next() != 3) {
                                                                if (bem.A01.getEventType() == 2) {
                                                                    if (bem.A01.getName().equals("entry")) {
                                                                        String A004 = BEM.A00(bem, "key");
                                                                        String A005 = BEM.A00(bem, "split");
                                                                        BEM.A01(bem);
                                                                        if (!(A004 == null || A005 == null)) {
                                                                            BEN ben = bem.A00;
                                                                            if (!ben.A00.containsKey(A004)) {
                                                                                ben.A00.put(A004, new HashMap());
                                                                            }
                                                                            ((Map) ben.A00.get(A004)).put(A002, A005);
                                                                        }
                                                                    } else {
                                                                        BEM.A01(bem);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (IOException | IllegalStateException | XmlPullParserException e) {
                            Log.e("SplitInstall", "Error while parsing splits.xml", e);
                            r4 = null;
                        }
                    }
                    BEN ben2 = bem.A00;
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ben2.A00.entrySet()) {
                        hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
                    }
                    r4 = new AnonymousClass4YH(Collections.unmodifiableMap(hashMap));
                    if (r4 == null) {
                        B6O.A01(A02, 5, "Can't parse languages metadata.", new Object[0]);
                    }
                    return r4;
                } catch (Resources.NotFoundException unused) {
                    B6O.A01(A02, 5, "Resource with languages metadata doesn't exist.", new Object[0]);
                    return null;
                }
            }
        }
        B6O.A01(b6o, 5, str, objArr);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r2.contains(".config.") != false) goto L_0x002a;
     */
    public final Set A03() {
        boolean z;
        HashSet hashSet = new HashSet();
        for (String str : A01(this)) {
            if (!str.startsWith("config.")) {
                z = false;
            }
            z = true;
            if (!z) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }
}
