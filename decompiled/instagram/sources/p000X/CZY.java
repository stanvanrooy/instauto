package p000X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService$Stub$Proxy;

/* renamed from: X.CZY */
public final class CZY implements C28033CaH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ C27992CZc A02;
    public final /* synthetic */ CZW A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public CZY(CZW czw, Activity activity, String str, Integer num, int i, C27992CZc cZc, String str2) {
        this.A03 = czw;
        this.A01 = activity;
        this.A06 = str;
        this.A04 = num;
        this.A00 = i;
        this.A02 = cZc;
        this.A05 = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x014a A[Catch:{ CZq -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    public final void B6v(CZV czv) {
        CZV czv2;
        CZV czv3;
        int A032;
        Parcel obtain;
        Parcel obtain2;
        Bundle bundle;
        try {
            CZW czw = this.A03;
            Activity activity = this.A01;
            String str = this.A06;
            String A002 = C28032CaG.A00(this.A04);
            int i = this.A00;
            C27992CZc cZc = this.A02;
            String str2 = this.A05;
            CZW.A03(czw);
            if (czw.A0B("launchPurchaseFlow")) {
                CZW.A07(czw, "launchPurchaseFlow");
                if (!A002.equals(C28032CaG.A00(Constants.ONE)) || czw.A0B) {
                    try {
                        CZW.A08(AnonymousClass000.A0N("Constructing buy intent for ", str, ", item type: ", A002));
                        IInAppBillingService$Stub$Proxy iInAppBillingService$Stub$Proxy = czw.A02;
                        String packageName = czw.A01.getPackageName();
                        A032 = AnonymousClass0Z0.A03(307529843);
                        obtain = Parcel.obtain();
                        obtain2 = Parcel.obtain();
                        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                        obtain.writeInt(3);
                        obtain.writeString(packageName);
                        obtain.writeString(str);
                        obtain.writeString(A002);
                        obtain.writeString(str2);
                        iInAppBillingService$Stub$Proxy.A00.transact(3, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                        } else {
                            bundle = null;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        AnonymousClass0Z0.A0A(-1021642881, A032);
                        int A003 = CZW.A00(bundle);
                        if (A003 != 0) {
                            CZW.A09(AnonymousClass000.A0E("Unable to buy item, Error response: ", CZV.A00(A003)));
                            CZW.A05(czw);
                            CZV czv4 = new CZV(A003, "Unable to buy item");
                            if (cZc != null) {
                                cZc.A00(czv4, (C28002CZm) null);
                                return;
                            }
                            return;
                        }
                        CZW.A08(AnonymousClass000.A0K("Launching buy intent for ", str, ". Request code: ", i));
                        czw.A00 = i;
                        czw.A03 = cZc;
                        czw.A05 = A002;
                        IntentSender intentSender = ((PendingIntent) bundle.getParcelable("BUY_INTENT")).getIntentSender();
                        Intent intent = new Intent();
                        Integer num = 0;
                        int intValue = num.intValue();
                        activity.startIntentSenderForResult(intentSender, i, intent, intValue, intValue, intValue, (Bundle) null);
                        return;
                    } catch (IntentSender.SendIntentException e) {
                        CZW.A09(AnonymousClass000.A0E("SendIntentException while launching purchase flow for sku ", str));
                        e.printStackTrace();
                        CZW.A05(czw);
                        czv3 = new CZV(-1004, "Failed to send intent.");
                        if (cZc == null) {
                            cZc.A00(czv3, (C28002CZm) null);
                            return;
                        }
                        return;
                    } catch (RemoteException e2) {
                        CZW.A09(AnonymousClass000.A0E("RemoteException while launching purchase flow for sku ", str));
                        e2.printStackTrace();
                        CZW.A05(czw);
                        czv3 = new CZV(-1001, "Remote exception while starting purchase flow");
                        if (cZc == null) {
                        }
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        AnonymousClass0Z0.A0A(1662995641, A032);
                        throw th;
                    }
                } else {
                    czv2 = new CZV(-1009, "Subscriptions are not available.");
                    CZW.A05(czw);
                    if (cZc == null) {
                        return;
                    }
                }
            } else if (cZc != null) {
                czv2 = new CZV(2, "Unable to launchPurchaseFlow, setup not complete\"");
            } else {
                return;
            }
            cZc.A00(czv2, (C28002CZm) null);
        } catch (C28006CZq e3) {
            CZW.A09(e3.getMessage());
            this.A02.A00(new CZV(9, e3.getMessage()), (C28002CZm) null);
        }
    }
}
