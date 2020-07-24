package p000X;

import android.view.View;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.B0t */
public final class B0t implements View.OnClickListener {
    public final /* synthetic */ C25107B0z A00;

    public B0t(C25107B0z b0z) {
        this.A00 = b0z;
    }

    public final void onClick(View view) {
        String str;
        BrowserExtensionsAutofillData browserExtensionsAutofillData;
        int A05 = AnonymousClass0Z0.A05(1456324736);
        C25106B0y b0y = this.A00.A02;
        if (b0y != null) {
            B0u b0u = b0y.A01;
            C25103B0q b0q = b0u.A02.A01;
            for (FbAutofillData fbAutofillData : b0u.A03) {
                C25091B0b b0b = b0q.A02;
                BrowserExtensionsAutofillData browserExtensionsAutofillData2 = (BrowserExtensionsAutofillData) fbAutofillData;
                List arrayList = new ArrayList();
                if (browserExtensionsAutofillData2 instanceof NameAutofillData) {
                    arrayList = b0b.A02();
                    str = "ix_autofill_name";
                } else if (browserExtensionsAutofillData2 instanceof TelephoneAutofillData) {
                    arrayList = b0b.A03();
                    str = "ix_autofill_phone";
                } else if (browserExtensionsAutofillData2 instanceof AddressAutofillData) {
                    arrayList = b0b.A00();
                    str = "ix_autofill_address";
                } else if (browserExtensionsAutofillData2 instanceof EmailAutofillData) {
                    arrayList = b0b.A01();
                    str = "ix_autofill_email";
                } else {
                    str = null;
                }
                if (str != null) {
                    ArrayList<BrowserExtensionsAutofillData> arrayList2 = new ArrayList<>();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            browserExtensionsAutofillData = null;
                            break;
                        }
                        browserExtensionsAutofillData = (BrowserExtensionsAutofillData) it.next();
                        if (browserExtensionsAutofillData.Ahw(browserExtensionsAutofillData2)) {
                            break;
                        }
                    }
                    if (browserExtensionsAutofillData != null) {
                        arrayList.remove(browserExtensionsAutofillData);
                    }
                    arrayList2.add(browserExtensionsAutofillData2);
                    arrayList2.addAll(arrayList);
                    JSONArray jSONArray = new JSONArray();
                    for (BrowserExtensionsAutofillData A052 : arrayList2) {
                        try {
                            jSONArray.put(A052.A05());
                        } catch (JSONException e) {
                            AnonymousClass0DB.A0G("IgAutofillDataStore", e.toString(), e);
                        }
                    }
                    C16180oA r0 = b0b.A00;
                    r0.A00.edit().putString(str, jSONArray.toString()).apply();
                }
            }
            b0y.A01.A02.A02.A01(false);
            C25116B1m.A01(b0y.A01.A02.A03).A05(b0y.A01.A01, Constants.A0I, new B16(b0y));
        }
        AnonymousClass0Z0.A0C(-153174813, A05);
    }
}
