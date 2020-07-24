package p000X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BYA */
public final class BYA extends C101214Yy implements AnonymousClass1HM {
    public AnonymousClass0C1 A00;
    public final List A01 = new ArrayList();

    public final String getModuleName() {
        return "theme_settings";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.display_theme_title);
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(636374232);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A06(this.mArguments);
        this.A01.add(BYC.A05);
        this.A01.add(BYC.A04);
        if (Build.VERSION.SDK_INT >= 28) {
            this.A01.add(BYC.A03);
        }
        AnonymousClass0Z0.A09(1181591263, A02);
    }

    public final void onResume() {
        BYC byc;
        String str;
        int A02 = AnonymousClass0Z0.A02(-1369524570);
        super.onResume();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BYC byc2 : this.A01) {
            arrayList2.add(new C120245Dw(byc2.A00, getString(byc2.A02)));
        }
        int i = C05760Lv.A01.A00.getInt("dark_mode_toggle_setting", -1);
        Iterator it = this.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                BYC byc3 = (BYC) it.next();
                if (byc3.A01 == i) {
                    str = byc3.A00;
                    break;
                }
            } else {
                if (C17440qF.A00(getContext())) {
                    byc = BYC.A04;
                } else {
                    byc = BYC.A05;
                }
                str = byc.A00;
            }
        }
        arrayList.add(new C120235Dv(arrayList2, str, new BYB(this)));
        setItems(arrayList);
        AnonymousClass0Z0.A09(1050388200, A02);
    }
}
