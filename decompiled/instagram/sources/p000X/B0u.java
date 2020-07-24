package p000X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.business.instantexperiences.p028ui.InstantExperiencesSaveAutofillDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.B0u */
public final class B0u implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IGInstantExperiencesParameters A01;
    public final /* synthetic */ C25104B0w A02;
    public final /* synthetic */ List A03;

    public B0u(C25104B0w b0w, View view, List list, IGInstantExperiencesParameters iGInstantExperiencesParameters) {
        this.A02 = b0w;
        this.A00 = view;
        this.A03 = list;
        this.A01 = iGInstantExperiencesParameters;
    }

    public final void run() {
        if (this.A02.A00 == null) {
            ViewStub viewStub = (ViewStub) this.A00.findViewById(C0003R.C0005id.instant_experiences_save_autofill_dialog);
            viewStub.setLayoutResource(C0003R.layout.instant_experiences_autofill_save_dialog);
            this.A02.A00 = (InstantExperiencesSaveAutofillDialog) viewStub.inflate();
        }
        List<FbAutofillData> list = this.A03;
        HashSet hashSet = new HashSet();
        for (FbAutofillData AGO : list) {
            hashSet.addAll(AGO.AGO().keySet());
        }
        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
        Arrays.sort(strArr);
        String join = TextUtils.join(",", strArr);
        InstantExperiencesSaveAutofillDialog instantExperiencesSaveAutofillDialog = this.A02.A00;
        C25106B0y b0y = new C25106B0y(this, join);
        List<FbAutofillData> list2 = this.A03;
        ArrayList arrayList = new ArrayList(list2.size());
        for (FbAutofillData fbAutofillData : list2) {
            arrayList.add(((BrowserExtensionsAutofillData) fbAutofillData).A03());
        }
        instantExperiencesSaveAutofillDialog.setDetailItems(arrayList);
        instantExperiencesSaveAutofillDialog.A02 = b0y;
        this.A02.A02.A01(true);
        C25116B1m.A01(this.A02.A03).A05(this.A01, Constants.A0G, new B19(this, join));
    }
}
