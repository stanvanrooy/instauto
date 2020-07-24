package p000X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.1Gh  reason: invalid class name and case insensitive filesystem */
public final class C27051Gh implements C11200ea {
    public final /* synthetic */ C27001Gc A00;

    public C27051Gh(C27001Gc r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Resources resources;
        int i;
        String string;
        int A03 = AnonymousClass0Z0.A03(1753638764);
        C33221cZ r13 = (C33221cZ) obj;
        int A032 = AnonymousClass0Z0.A03(2064770390);
        C27001Gc.A00(this.A00);
        if (((Boolean) C05640Lj.A01(AnonymousClass0L7.SIGN_IN_HELP_ONLY_ONE_ACCOUNT_FAMILY, "single_account_recovery", false)).booleanValue()) {
            Context context = this.A00.A01;
            String AZn = r13.A00.AZn();
            List list = r13.A01;
            List list2 = r13.A02;
            int size = list.size() + list2.size() + 1;
            String[] strArr = new String[size];
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                strArr[i2] = (String) list.get(i3);
                i2++;
            }
            for (int i4 = 0; i4 < list2.size(); i4++) {
                strArr[i2] = (String) list2.get(i4);
                i2++;
            }
            strArr[i2] = AZn;
            if (size != 2) {
                if (size == 3) {
                    resources = context.getResources();
                    i = C0003R.string.child_accounts_logged_in_two_children;
                } else if (size == 4) {
                    resources = context.getResources();
                    i = C0003R.string.child_accounts_logged_in_three_children;
                } else if (size != 5) {
                    string = "";
                } else {
                    resources = context.getResources();
                    i = C0003R.string.child_accounts_logged_in_four_children;
                }
                string = resources.getString(i, strArr);
            } else {
                resources = context.getResources();
                i = C0003R.string.child_accounts_logged_in_one_child;
                string = resources.getString(i, strArr);
            }
            C53642Tq.A01(context, string, 1).show();
        }
        AnonymousClass0Z0.A0A(1194501173, A032);
        AnonymousClass0Z0.A0A(-1875332477, A03);
    }
}
