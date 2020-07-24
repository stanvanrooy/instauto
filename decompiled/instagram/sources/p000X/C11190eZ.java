package p000X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0eZ  reason: invalid class name and case insensitive filesystem */
public final class C11190eZ implements C11200ea {
    public final /* synthetic */ Context A00;

    public C11190eZ(Context context) {
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        List asList;
        boolean z;
        int A03 = AnonymousClass0Z0.A03(574962461);
        int A032 = AnonymousClass0Z0.A03(-1676622684);
        C09640bk A002 = C09640bk.A00();
        synchronized (A002) {
            A002.A05(new AnonymousClass0b4());
            AnonymousClass0H6 r8 = A002.A02;
            ArrayList<File> arrayList = new ArrayList<>();
            arrayList.addAll(AnonymousClass0H6.A00(r8.A05, AnonymousClass0H6.A08));
            arrayList.addAll(AnonymousClass0H6.A00(r8.A05, AnonymousClass0H6.A07));
            arrayList.addAll(AnonymousClass0H6.A00(r8.A06, AnonymousClass0H6.A08));
            arrayList.addAll(AnonymousClass0H6.A00(r8.A06, AnonymousClass0H6.A07));
            File[] listFiles = r8.A03.listFiles();
            if (listFiles == null) {
                asList = Collections.EMPTY_LIST;
            } else {
                asList = Arrays.asList(listFiles);
            }
            arrayList.addAll(asList);
            z = true;
            for (File file : arrayList) {
                if (file.exists() && !file.delete()) {
                    z = false;
                    r8.A02.A02++;
                }
            }
        }
        C09640bk A003 = C09640bk.A00();
        synchronized (A003) {
            A003.A06((AnonymousClass0GV) null);
        }
        if (!z) {
            AnonymousClass0QD.A01("IgProfiloInitializer", "Fail to clean up profilo traces and configuration during logout");
        }
        AnonymousClass0Z0.A0A(1427224539, A032);
        AnonymousClass0Z0.A0A(-1811807671, A03);
    }
}
