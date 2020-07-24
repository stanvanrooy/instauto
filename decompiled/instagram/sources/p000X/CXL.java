package p000X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CXL */
public final class CXL extends C92 {
    public CYV A00;
    public List A01;
    public List A02;
    public final CXE A03 = new CXE();

    public CXL(CXZ cxz) {
        super(cxz.A06, cxz.A09, new CY4(cxz.A03, cxz.A0F), cxz.A00);
        String str;
        for (C27946CXi cXi : cxz.A0E) {
            Integer num = cXi.A03;
            if (num == Constants.ONE) {
                CXE cxe = this.A03;
                cxe.A00.add(new CXH(new CXN(cXi, cxz.A00)));
            } else if (num == Constants.A0C) {
                CXE cxe2 = this.A03;
                cxe2.A00.add(new C27942CXe(new CXQ(cXi, cxz.A00)));
                this.A01 = CYI.A02(cXi.A05);
                String str2 = cXi.A04;
                this.A00 = new CYV(str2);
                this.A02 = str2;
            }
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = cxz.A0E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = ((C27946CXi) it.next()).A04;
                if (TextUtils.isEmpty(str3)) {
                    str = null;
                    continue;
                } else {
                    str = new JSONObject(str3).getString("pid");
                    continue;
                }
                if (str != null) {
                    arrayList.add(str);
                    break;
                }
            }
            this.A02 = arrayList;
        } catch (JSONException unused) {
        }
    }
}
