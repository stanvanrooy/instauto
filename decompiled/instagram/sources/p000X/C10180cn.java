package p000X;

import android.os.Bundle;
import com.facebook.rti.push.service.FbnsService;
import java.util.ArrayList;

/* renamed from: X.0cn  reason: invalid class name and case insensitive filesystem */
public final class C10180cn implements AnonymousClass0X2 {
    public final Bundle ACN(FbnsService fbnsService, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        fbnsService.A0Z(arrayList, arrayList2);
        bundle2.putStringArrayList("valid_compatible_apps", arrayList);
        bundle2.putStringArrayList("enabled_compatible_apps", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        fbnsService.A0Y(arrayList3);
        bundle2.putStringArrayList("registered_apps", arrayList3);
        return bundle2;
    }

    public final void ACQ(FbnsService fbnsService, Bundle bundle) {
        AnonymousClass0DB.A0D("AppsStatisticsFetcher", "not implemented for AppsStatisticsFetcher");
        throw new IllegalArgumentException("not implemented for AppsStatisticsFetcher");
    }
}
