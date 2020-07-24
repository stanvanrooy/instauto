package p000X;

import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.B0r */
public final class B0r implements C22550yc {
    public final /* synthetic */ C25092B0c A00;
    public final /* synthetic */ Set A01;

    public B0r(C25092B0c b0c, Set set) {
        this.A00 = b0c;
        this.A01 = set;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        Set set = this.A01;
        for (List<FbAutofillData> it : (List) obj) {
            for (FbAutofillData A8r : it) {
                FbAutofillData A8r2 = A8r.A8r(set);
                if (A8r2 != null && A8r2.A9c()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        FbAutofillData fbAutofillData = (FbAutofillData) it2.next();
                        if (!fbAutofillData.Ahw(A8r2)) {
                            if (A8r2.Ahw(fbAutofillData)) {
                                break;
                            }
                        } else {
                            arrayList.remove(fbAutofillData);
                            break;
                        }
                    }
                    arrayList.add(A8r2);
                }
            }
        }
        return arrayList;
    }
}
