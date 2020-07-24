package p000X;

import android.content.Intent;
import org.json.JSONException;

/* renamed from: X.CZX */
public final class CZX extends C27291Hg {
    public final /* synthetic */ AOU A00;

    public CZX(AOU aou) {
        this.A00 = aou;
    }

    public final void Ar3(int i, int i2, Intent intent) {
        int longValue;
        CZV czv;
        CZV czv2;
        C27992CZc cZc;
        C13150hy.A02(intent, "data");
        super.Ar3(i, i2, intent);
        CZW czw = ((C27990CZa) this.A00.A03.getValue()).A02;
        if (i == czw.A00) {
            CZW.A03(czw);
            if (!czw.A0B("handleActivityResult")) {
                C27992CZc cZc2 = czw.A03;
                if (cZc2 != null) {
                    cZc2.A00(new CZV(2, "Unable to handleActivityResult, setup not complete\""), (C28002CZm) null);
                    return;
                }
                return;
            }
            CZW.A05(czw);
            if (intent == null) {
                CZW.A09("Null data in IAB activity result.");
                czv2 = new CZV(-1002, "Null data in IAB result");
                cZc = czw.A03;
                if (cZc == null) {
                    return;
                }
            } else {
                Object obj = intent.getExtras().get("RESPONSE_CODE");
                if (obj == null) {
                    CZW.A09("Intent with no response code, assuming OK (known issue)");
                    longValue = 0;
                } else if (obj instanceof Integer) {
                    longValue = ((Integer) obj).intValue();
                } else if (obj instanceof Long) {
                    longValue = (int) ((Long) obj).longValue();
                } else {
                    CZW.A09("Unexpected type for intent response code.");
                    String name = obj.getClass().getName();
                    CZW.A09(name);
                    throw new RuntimeException(AnonymousClass000.A0E("Unexpected type for intent response code: ", name));
                }
                String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
                String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
                if (i2 == -1 && longValue == 0) {
                    CZW.A08("Successful resultcode from purchase activity.");
                    CZW.A08(AnonymousClass000.A0E("Purchase data: ", stringExtra));
                    CZW.A08(AnonymousClass000.A0E("Data signature: ", stringExtra2));
                    CZW.A08("Extras: " + intent.getExtras());
                    CZW.A08(AnonymousClass000.A0E("Expected item type: ", czw.A05));
                    if (stringExtra == null || stringExtra2 == null) {
                        CZW.A09("BUG: either purchaseData or dataSignature is null.");
                        CZW.A08(AnonymousClass000.A0E("Extras: ", intent.getExtras().toString()));
                        czv = new CZV(-1008, "IAB returned null purchaseData or dataSignature");
                    } else {
                        try {
                            C28002CZm cZm = new C28002CZm(czw.A05, stringExtra, stringExtra2);
                            CZW.A08("Purchase signature successfully verified.");
                            C27992CZc cZc3 = czw.A03;
                            if (cZc3 != null) {
                                cZc3.A00(new CZV(0, "Success"), cZm);
                                return;
                            }
                            return;
                        } catch (JSONException e) {
                            CZW.A09("Failed to parse purchase data.");
                            e.printStackTrace();
                            czv2 = new CZV(-1002, "Failed to parse purchase data.");
                            cZc = czw.A03;
                            if (cZc == null) {
                                return;
                            }
                        }
                    }
                } else if (i2 == -1) {
                    CZW.A08(AnonymousClass000.A0E("Result code was OK but in-app billing response was not OK: ", CZV.A00(longValue)));
                    C27992CZc cZc4 = czw.A03;
                    if (cZc4 != null) {
                        cZc4.A00(new CZV(longValue, "Problem purchashing item."), (C28002CZm) null);
                        return;
                    }
                    return;
                } else if (i2 == 0) {
                    CZW.A08(AnonymousClass000.A0E("Purchase canceled - Response: ", CZV.A00(longValue)));
                    if (longValue < 0 || longValue > 8) {
                        czv = new CZV(-1005, "User canceled.");
                    } else {
                        czv = new CZV(longValue, CZV.A00(longValue));
                    }
                } else {
                    CZW.A09(AnonymousClass000.A0N("Purchase failed. Result code: ", Integer.toString(i2), ". Response: ", CZV.A00(longValue)));
                    czv = new CZV(-1006, "Unknown purchase response.");
                }
                C27992CZc cZc5 = czw.A03;
                if (cZc5 != null) {
                    cZc5.A00(czv, (C28002CZm) null);
                    return;
                }
                return;
            }
            cZc.A00(czv2, (C28002CZm) null);
        }
    }
}
