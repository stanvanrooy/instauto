package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.vending.billing.IInAppBillingService$Stub$Proxy;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CZW */
public final class CZW {
    public int A00;
    public Context A01;
    public IInAppBillingService$Stub$Proxy A02;
    public C27992CZc A03;
    public String A04 = "";
    public String A05;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public ServiceConnection A0C;
    public final Object A0D = new Object();
    public final CZU A0E;

    public static final void A08(String str) {
        AnonymousClass0DB.A0J("IgIabHelper", "In-app billing debug:  %s", str);
    }

    public static final void A09(String str) {
        AnonymousClass0DB.A0J("IgIabHelper", "In-app billing error:  %s", str);
    }

    public static int A00(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            A08("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            A09("Unexpected type for bundle response code.");
            String name = obj.getClass().getName();
            A09(name);
            throw new RuntimeException(AnonymousClass000.A0E("Unexpected type for bundle response code: ", name));
        }
    }

    /* JADX INFO: finally extract failed */
    public static int A01(CZW czw, C28003CZn cZn, String str) {
        Context context;
        Bundle bundle;
        A08(AnonymousClass000.A0E("Querying owned items, item type: ", str));
        A08(AnonymousClass000.A0E("Package name: ", czw.A01.getPackageName()));
        String str2 = null;
        do {
            A08(AnonymousClass000.A0E("Calling getPurchases with continuation token: ", str2));
            IInAppBillingService$Stub$Proxy iInAppBillingService$Stub$Proxy = czw.A02;
            if (iInAppBillingService$Stub$Proxy == null || (context = czw.A01) == null) {
                A09("Our service and/or our context are null in query purchase. Exiting.");
                return -1008;
            }
            String packageName = context.getPackageName();
            int A032 = AnonymousClass0Z0.A03(-1367925092);
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                obtain.writeInt(3);
                obtain.writeString(packageName);
                obtain.writeString(str);
                obtain.writeString(str2);
                iInAppBillingService$Stub$Proxy.A00.transact(4, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                } else {
                    bundle = null;
                }
                obtain2.recycle();
                obtain.recycle();
                AnonymousClass0Z0.A0A(738594530, A032);
                int A002 = A00(bundle);
                A08(AnonymousClass000.A0E("Owned items response: ", String.valueOf(A002)));
                if (A002 != 0) {
                    A08(AnonymousClass000.A0E("getPurchases() failed: ", CZV.A00(A002)));
                    return A002;
                } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                    A09("Bundle returned from getPurchases() doesn't contain required fields.");
                    return -1002;
                } else {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str3 = stringArrayList2.get(i);
                        A08(AnonymousClass000.A0E("Sku is owned: ", stringArrayList.get(i)));
                        C28002CZm cZm = new C28002CZm(str, str3, stringArrayList3.get(i));
                        if (TextUtils.isEmpty(cZm.A07)) {
                            AnonymousClass0DB.A0K("IgIabHelper", "In-app billing warning: %s", "BUG: empty/null token!");
                            A08(AnonymousClass000.A0E("Purchase data: ", str3));
                        }
                        cZn.A00.put(cZm.A06, cZm);
                    }
                    str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                    A08(AnonymousClass000.A0E("Continuation token: ", str2));
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                AnonymousClass0Z0.A0A(-179806027, A032);
                throw th;
            }
        } while (!TextUtils.isEmpty(str2));
        return 0;
    }

    /* JADX INFO: finally extract failed */
    public static int A02(CZW czw, String str, C28003CZn cZn, List list) {
        Bundle bundle;
        A08("Querying SKU details.");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C28002CZm cZm : cZn.A00.values()) {
            if (cZm.A02.equals(str)) {
                arrayList2.add(cZm.A06);
            }
        }
        arrayList.addAll(arrayList2);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            A08("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size() / 20;
        int size2 = arrayList.size() % 20;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList4 = new ArrayList();
            int i2 = i * 20;
            for (String add : arrayList.subList(i2, i2 + 20)) {
                arrayList4.add(add);
            }
            arrayList3.add(arrayList4);
        }
        if (size2 != 0) {
            ArrayList arrayList5 = new ArrayList();
            int i3 = size * 20;
            for (String add2 : arrayList.subList(i3, size2 + i3)) {
                arrayList5.add(add2);
            }
            arrayList3.add(arrayList5);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", (ArrayList) it2.next());
            IInAppBillingService$Stub$Proxy iInAppBillingService$Stub$Proxy = czw.A02;
            String packageName = czw.A01.getPackageName();
            int A032 = AnonymousClass0Z0.A03(-1434295893);
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                obtain.writeInt(3);
                obtain.writeString(packageName);
                obtain.writeString(str);
                obtain.writeInt(1);
                bundle2.writeToParcel(obtain, 0);
                iInAppBillingService$Stub$Proxy.A00.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                } else {
                    bundle = null;
                }
                obtain2.recycle();
                obtain.recycle();
                AnonymousClass0Z0.A0A(696021133, A032);
                if (!bundle.containsKey("DETAILS_LIST")) {
                    int A002 = A00(bundle);
                    if (A002 != 0) {
                        A08(AnonymousClass000.A0E("getSkuDetails() failed: ", CZV.A00(A002)));
                        return A002;
                    }
                    A09("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return -1002;
                }
                Iterator<String> it3 = bundle.getStringArrayList("DETAILS_LIST").iterator();
                while (it3.hasNext()) {
                    AP5 ap5 = new AP5(it3.next());
                    A08("Got sku details: " + ap5);
                    cZn.A01.put(ap5.A01, ap5);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                AnonymousClass0Z0.A0A(1660450605, A032);
                throw th;
            }
        }
        return 0;
    }

    public static void A03(CZW czw) {
        if (czw.A08) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    public static void A04(CZW czw) {
        synchronized (czw.A0D) {
            if (!czw.A06) {
                A08("Disposing.");
                czw.A09 = false;
                if (czw.A02 != null) {
                    A08("Unbinding from service.");
                    Context context = czw.A01;
                    if (context != null) {
                        AnonymousClass0ZI.A01(context.getApplicationContext(), czw.A0C, 2020644026);
                    }
                }
                czw.A08 = true;
                czw.A01 = null;
                czw.A0C = null;
                czw.A02 = null;
                czw.A03 = null;
            } else {
                throw new C28006CZq(AnonymousClass000.A0J("Can't dispose because an async operation (", czw.A04, ") is in progress."));
            }
        }
    }

    public static void A05(CZW czw) {
        CZU czu = czw.A0E;
        C27998CZi cZi = C27998CZi.ACTION_ASYNC_OPERATION_ENDED;
        String str = czw.A04;
        HashMap hashMap = new HashMap();
        hashMap.put("operation", str);
        hashMap.put("object_id", czw.toString());
        hashMap.put("current_operation", czw.A04);
        czu.A06(cZi, ImmutableMap.A01(hashMap));
        synchronized (czw.A0D) {
            A08(AnonymousClass000.A0E("Ending async operation: ", czw.A04));
            czw.A04 = "";
            czw.A06 = false;
            if (czw.A07) {
                try {
                    A04(czw);
                } catch (C28006CZq e) {
                    A09(e.getMessage());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r3.A02 != null) goto L_0x000d;
     */
    public static void A06(CZW czw, C28033CaH caH) {
        boolean z;
        if (!czw.A08 && czw.A09) {
            z = true;
        }
        z = false;
        if (z) {
            czw.A09 = false;
            czw.A0E.A05(C27998CZi.ACTION_INITIALIZATION_RESTARTED);
            czw.A0A(caH);
            return;
        }
        caH.B6v(new CZV(0, "Set up is still intact"));
    }

    public static void A07(CZW czw, String str) {
        CZU czu = czw.A0E;
        C27998CZi cZi = C27998CZi.ACTION_ASYNC_OPERATION_STARTED;
        HashMap hashMap = new HashMap();
        hashMap.put("operation", str);
        hashMap.put("object_id", czw.toString());
        hashMap.put("current_operation", czw.A04);
        czu.A06(cZi, ImmutableMap.A01(hashMap));
        synchronized (czw.A0D) {
            if (!czw.A06) {
                czw.A04 = str;
                czw.A06 = true;
                A08(AnonymousClass000.A0E("Starting async operation: ", str));
            } else {
                throw new C28006CZq(AnonymousClass000.A0O("Can't start async operation (", str, ") because another async operation (", czw.A04, ") is in progress."));
            }
        }
    }

    public final boolean A0B(String str) {
        StringBuilder sb;
        String str2;
        boolean z = this.A09;
        if (z && this.A02 == null) {
            sb = new StringBuilder("Service disconnected prior to (");
            sb.append(str);
            str2 = ")";
        } else if (z) {
            return true;
        } else {
            sb = new StringBuilder("Illegal state for operation (");
            sb.append(str);
            str2 = "): IAB helper is not set up.";
        }
        sb.append(str2);
        A09(sb.toString());
        return false;
    }

    public CZW(Context context, CZU czu) {
        this.A01 = context;
        this.A0E = czu;
    }

    public final void A0A(C28033CaH caH) {
        A03(this);
        if (!this.A09) {
            A08("Starting in-app billing setup.");
            this.A0C = new C27996CZg(this, caH);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.A01.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                caH.B6v(new CZV(3, "Billing service unavailable on device."));
            } else {
                AnonymousClass0ZI.A02(this.A01.getApplicationContext(), intent, this.A0C, 1, 1844733977);
            }
        } else {
            throw new IllegalStateException("IAB helper is already set up.");
        }
    }
}
