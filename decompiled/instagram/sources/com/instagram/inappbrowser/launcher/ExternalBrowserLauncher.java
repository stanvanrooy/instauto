package com.instagram.inappbrowser.launcher;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.facebook.common.dextricks.DexStore;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0QV;
import p000X.AnonymousClass0XM;
import p000X.AnonymousClass0XS;
import p000X.AnonymousClass0ZI;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1BP;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass2WV;
import p000X.AnonymousClass2ZY;
import p000X.C05370Ke;
import p000X.C08480Xf;
import p000X.C11130eT;
import p000X.C25025AyJ;
import p000X.C25027AyL;
import p000X.C25028AyM;
import p000X.C25029AyN;
import p000X.C25034AyS;
import p000X.C25035AyT;
import p000X.C25038AyW;
import p000X.C25039AyX;
import p000X.C25040AyY;
import p000X.C25041AyZ;
import p000X.C25062Ayw;
import p000X.C33491d0;

public final class ExternalBrowserLauncher {
    public final Context A00;
    public final PackageManager A01;
    public final AnonymousClass0C1 A02;
    public final List A03 = new ArrayList();
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public static boolean A00(ExternalBrowserLauncher externalBrowserLauncher, Uri uri, C25040AyY ayY, AnonymousClass2WV r13, C25027AyL ayL) {
        AnonymousClass1BP r3;
        Resources resources = externalBrowserLauncher.A00.getResources();
        Intent intent = new Intent("android.intent.action.VIEW");
        IBinder iBinder = null;
        ArrayList arrayList = null;
        if (ayL != null) {
            intent.setPackage(ayL.A00.getPackageName());
        }
        Bundle bundle = new Bundle();
        if (ayL != null) {
            iBinder = ayL.A01.asBinder();
        }
        bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
        intent.putExtras(bundle);
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        Bundle A002 = new C25028AyM(ActivityOptions.makeCustomAnimation(externalBrowserLauncher.A00, C0003R.anim.modal_slide_up_enter, C0003R.anim.modal_empty_animation)).A00();
        intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", new C25028AyM(ActivityOptions.makeCustomAnimation(externalBrowserLauncher.A00, C0003R.anim.modal_empty_animation, C0003R.anim.modal_slide_down_exit)).A00());
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        if (r13 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(AnonymousClass0C5.$const$string(66), "start_website_report");
            bundle2.putString(AnonymousClass0C5.$const$string(67), resources.getString(C0003R.string.in_app_browser_menu_item_report_website));
            bundle2.putString("media_id", r13.A00());
            bundle2.putString(IgReactNavigatorModule.URL, uri.toString());
            bundle2.putBoolean(AnonymousClass0C5.$const$string(88), true);
            bundle2.putBundle("tracking", new Bundle(r13.A00));
            AnonymousClass0XS r2 = new AnonymousClass0XS();
            Intent putExtra = new Intent(externalBrowserLauncher.A00.getApplicationContext(), TransparentBackgroundModalActivity.class).putExtra("fragment_name", AnonymousClass0C5.$const$string(65)).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle2);
            putExtra.setFlags(268435456);
            r2.A04(putExtra, externalBrowserLauncher.A00.getClassLoader());
            PendingIntent A012 = r2.A01(externalBrowserLauncher.A00, 0, 0);
            String string = resources.getString(C0003R.string.in_app_browser_menu_item_report_website);
            arrayList = new ArrayList();
            Bundle bundle3 = new Bundle();
            bundle3.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
            bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", A012);
            arrayList.add(bundle3);
        }
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        C25035AyT ayT = new C25035AyT(intent, A002);
        ayT.A00.setPackage(ayY.A01);
        ayT.A00.setData(uri);
        ayT.A00.addCategory("android.intent.category.BROWSABLE");
        if (ayL != null) {
            C11130eT.A01.BXT(new C33491d0(ayT.A00));
            AnonymousClass0XM r4 = AnonymousClass1BH.A00;
            synchronized (r4) {
                if (r4.A00 == null) {
                    r4.A00 = new AnonymousClass1BP(AnonymousClass0XM.A03(r4), r4.A0G);
                }
                r3 = r4.A00;
            }
            return r3.A05(ayT.A00, ayT.A01, externalBrowserLauncher.A00);
        }
        Intent intent2 = ayT.A00;
        Bundle bundle4 = ayT.A01;
        Context context = externalBrowserLauncher.A00;
        C11130eT.A01.BXT(new C33491d0(intent2));
        return AnonymousClass1BH.A00.A06().A05(intent2, bundle4, context);
    }

    public final boolean A01(String str, String str2, String str3) {
        Uri A002;
        ArrayList<C25040AyY> arrayList;
        String str4;
        int indexOf;
        String str5;
        boolean z = false;
        if (this.A08 && this.A01 != null && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2))) {
            if (!TextUtils.isEmpty(str)) {
                A002 = C08480Xf.A00(str);
            } else {
                A002 = C08480Xf.A00(str2);
            }
            PackageManager packageManager = this.A01;
            if (packageManager == null) {
                arrayList = new ArrayList<>();
            } else {
                String str6 = null;
                if (packageManager != null) {
                    Intent addCategory = new Intent("android.intent.action.VIEW", A002).addCategory("android.intent.category.BROWSABLE");
                    Intent addCategory2 = new Intent("android.intent.action.VIEW", A002.buildUpon().scheme("http").build()).addCategory("android.intent.category.BROWSABLE");
                    ResolveInfo resolveActivity = this.A01.resolveActivity(addCategory, DexStore.LOAD_RESULT_PGO_ATTEMPTED);
                    if (!(resolveActivity == null && (resolveActivity = this.A01.resolveActivity(addCategory2, DexStore.LOAD_RESULT_PGO_ATTEMPTED)) == null)) {
                        str6 = resolveActivity.activityInfo.packageName;
                    }
                }
                List<ResolveInfo> queryIntentActivities = this.A01.queryIntentActivities(new Intent("android.intent.action.VIEW", A002).addCategory("android.intent.category.BROWSABLE"), DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
                arrayList = new ArrayList<>();
                for (ResolveInfo next : queryIntentActivities) {
                    String str7 = next.activityInfo.packageName;
                    boolean equals = str7.equals(str6);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str7);
                    PackageManager packageManager2 = this.A00.getPackageManager();
                    new Intent("android.intent.action.VIEW", Uri.parse("http://"));
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str4 = null;
                            break;
                        }
                        str4 = (String) it.next();
                        intent.setPackage(str4);
                        if (packageManager2.resolveService(intent, 0) != null) {
                            break;
                        }
                    }
                    boolean z2 = !TextUtils.isEmpty(str4);
                    if (this.A04.indexOf(next.activityInfo.packageName) == -1) {
                        indexOf = Integer.MAX_VALUE;
                    } else {
                        indexOf = this.A04.indexOf(next.activityInfo.packageName);
                    }
                    arrayList.add(new C25040AyY(str7, equals, z2, indexOf, this.A03.contains(next.activityInfo.packageName)));
                }
            }
            C25040AyY ayY = null;
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new C25038AyW(this));
                if (this.A05) {
                    C25034AyS ayS = new C25034AyS(this);
                    ArrayList arrayList3 = new ArrayList();
                    for (C25040AyY ayY2 : arrayList) {
                        if (ayS.test(ayY2)) {
                            arrayList3.add(ayY2);
                        }
                    }
                    arrayList = arrayList3;
                }
                C25039AyX ayX = new C25039AyX(this);
                ArrayList arrayList4 = new ArrayList();
                for (C25040AyY ayY3 : arrayList) {
                    if (ayX.test(ayY3)) {
                        arrayList4.add(ayY3);
                    }
                }
                Collections.sort(arrayList4, new C25041AyZ(this));
                if (arrayList4.size() > 0) {
                    ayY = (C25040AyY) arrayList4.get(0);
                }
            }
            if (ayY != null) {
                if (this.A07 || this.A05) {
                    z = true;
                }
                if (!z || !ayY.A04) {
                    return AnonymousClass1BH.A0D(new Intent("android.intent.action.VIEW", A002).setPackage(ayY.A01).addCategory("android.intent.category.BROWSABLE"), this.A00);
                }
                AnonymousClass2WV r7 = new AnonymousClass2WV();
                r7.A00.putString("TrackingInfo.ARG_MEDIA_ID", str3);
                if (!this.A06) {
                    return A00(this, A002, ayY, r7, (C25027AyL) null);
                }
                String uuid = AnonymousClass2ZY.A00().toString();
                AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(this.A02).A02(r7.A00());
                if (A022 != null) {
                    str5 = A022.AYw();
                } else {
                    str5 = null;
                }
                AnonymousClass0QT A012 = AnonymousClass0QT.A01(this.A02, new C25029AyN(this, r7), AnonymousClass0QV.A06);
                C25062Ayw ayw = new C25062Ayw(A012.A02("iab_launch"));
                ayw.A08("iab_session_id", uuid);
                ayw.A08("initial_url", A002.toString());
                ayw.A05("user_click_ts", Double.valueOf((double) C05370Ke.A00.now()));
                ayw.A05("event_ts", Double.valueOf((double) C05370Ke.A00.now()));
                ayw.A08("tracking_token", str5);
                ayw.A01();
                C25025AyJ ayJ = new C25025AyJ(this, A012, uuid, A002, str5, ayY, r7);
                Context context = this.A00;
                String str8 = ayY.A01;
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str8)) {
                    intent2.setPackage(str8);
                }
                return AnonymousClass0ZI.A02(context, intent2, ayJ, 33, -1565218131);
            }
        }
        return false;
    }

    public ExternalBrowserLauncher(Context context, AnonymousClass0C1 r7) {
        this.A00 = context;
        this.A01 = context.getPackageManager();
        this.A02 = r7;
        AnonymousClass0L7 r3 = AnonymousClass0L7.OPEN_REDIRECT_URL_IN_EXTERNAL_BROWSER;
        this.A08 = ((Boolean) AnonymousClass0L6.A02(r7, r3, "enable_external_browser_for_ad_click", false, (AnonymousClass04H) null)).booleanValue();
        this.A07 = ((Boolean) AnonymousClass0L6.A02(r7, r3, "prefer_custom_tabs", false, (AnonymousClass04H) null)).booleanValue();
        this.A05 = ((Boolean) AnonymousClass0L6.A02(r7, r3, "force_custom_tabs", false, (AnonymousClass04H) null)).booleanValue();
        this.A06 = ((Boolean) AnonymousClass0L6.A02(r7, r3, "enable_callbacks", false, (AnonymousClass04H) null)).booleanValue();
        String str = (String) AnonymousClass0L6.A02(r7, r3, "browser_preference_order", "", (AnonymousClass04H) null);
        String str2 = (String) AnonymousClass0L6.A02(r7, r3, "browser_blacklist", "", (AnonymousClass04H) null);
        if (!TextUtils.isEmpty(str2)) {
            this.A03.addAll(Arrays.asList(str2.split(",")));
        }
        this.A04 = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            this.A04.addAll(Arrays.asList(str.split(",")));
        }
    }
}
