package p000X;

import android.os.Parcel;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService$Stub$Proxy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CZZ */
public final class CZZ extends AnonymousClass0O9 {
    public final /* synthetic */ C28000CZk A00;
    public final /* synthetic */ CZW A01;
    public final /* synthetic */ List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CZZ(CZW czw, List list, C28000CZk cZk) {
        super(629, 3, true, false);
        this.A01 = czw;
        this.A02 = list;
        this.A00 = cZk;
    }

    public final void run() {
        C28000CZk cZk;
        ArrayList arrayList = new ArrayList();
        for (C28002CZm cZm : this.A02) {
            try {
                CZW czw = this.A01;
                CZW.A03(czw);
                if (czw.A0B("consume")) {
                    String str = cZm.A02;
                    if (str.equals(C28032CaG.A00(Constants.ZERO))) {
                        String str2 = cZm.A07;
                        String str3 = cZm.A06;
                        if (str2 == null || str2.equals("")) {
                            CZW.A09(AnonymousClass000.A0J("Can't consume ", str3, ". No token."));
                            throw new C28004CZo(-1007, "PurchaseInfo is missing token for sku: " + str3 + " " + cZm);
                        }
                        CZW.A08(AnonymousClass000.A0N("Consuming sku: ", str3, ", token: ", str2));
                        IInAppBillingService$Stub$Proxy iInAppBillingService$Stub$Proxy = czw.A02;
                        String packageName = czw.A01.getPackageName();
                        int A03 = AnonymousClass0Z0.A03(-1819333253);
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                            obtain.writeInt(3);
                            obtain.writeString(packageName);
                            obtain.writeString(str2);
                            iInAppBillingService$Stub$Proxy.A00.transact(5, obtain, obtain2, 0);
                            obtain2.readException();
                            int readInt = obtain2.readInt();
                            obtain2.recycle();
                            obtain.recycle();
                            AnonymousClass0Z0.A0A(-186479546, A03);
                            if (readInt == 0) {
                                CZW.A08(AnonymousClass000.A0E("Successfully consumed sku: ", str3));
                                arrayList.add(new CZV(0, AnonymousClass000.A0E("Successful consume of sku ", cZm.A06)));
                            } else {
                                CZW.A08(AnonymousClass000.A0N("Error consuming consuming sku ", str3, ". ", CZV.A00(readInt)));
                                th = new C28004CZo(readInt, AnonymousClass000.A0E("Error consuming sku ", str3));
                                throw th;
                            }
                        } catch (Throwable th) {
                            th = th;
                            obtain2.recycle();
                            obtain.recycle();
                            AnonymousClass0Z0.A0A(-686668844, A03);
                        }
                    } else {
                        throw new C28004CZo(-1010, AnonymousClass000.A0J("Items of type '", str, "' can't be consumed."));
                    }
                } else {
                    throw new C28004CZo(-1001, "Unable to consume, setup not complete");
                }
            } catch (RemoteException e) {
                throw new C28004CZo(-1001, "Remote exception while consuming. PurchaseInfo: " + cZm, e);
            } catch (C28004CZo e2) {
                arrayList.add(e2.A00);
            }
        }
        CZW.A05(this.A01);
        if (!this.A01.A08 && (cZk = this.A00) != null) {
            cZk.A00(arrayList);
        }
    }
}
