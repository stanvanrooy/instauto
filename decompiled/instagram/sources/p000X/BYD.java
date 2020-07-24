package p000X;

import android.os.Bundle;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.BYD */
public final class BYD extends C101214Yy implements AnonymousClass1HM {
    public AnonymousClass0C1 A00;
    public BYK A01;

    public final String getModuleName() {
        return "direct_messages_options";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void A00() {
        int i;
        AnonymousClass1HD r2;
        int i2;
        int i3;
        AnonymousClass1HD r22;
        int i4;
        ArrayList arrayList = new ArrayList();
        BYK byk = this.A01;
        arrayList.add(new AnonymousClass2NW((CharSequence) byk.A00.getString(C0003R.string.messaging_controls_one_on_one_title)));
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : Constants.ZERO(2)) {
            String A002 = BYM.A00(num);
            AnonymousClass1HD r3 = byk.A00;
            int intValue = num.intValue();
            if (1 != intValue) {
                i3 = C0003R.string.messaging_controls_reachable_to_everyone;
            } else {
                i3 = C0003R.string.messaging_controls_reachable_to_following;
            }
            String string = r3.getString(i3);
            if (intValue != 1) {
                r22 = byk.A00;
                i4 = C0003R.string.messaging_controls_one_on_one_everyone_subtext;
            } else {
                r22 = byk.A00;
                i4 = C0003R.string.messaging_controls_one_on_one_following_subtext;
            }
            arrayList2.add(new C120245Dw(A002, string, r22.getString(i4)));
        }
        arrayList.add(new C120235Dv(arrayList2, byk.A01.A00.getString("direct_message_reachability_one_to_one", BYM.A00(Constants.ZERO)), new BYF(byk)));
        arrayList.add(new AnonymousClass4FF());
        arrayList.add(new AnonymousClass2NW((CharSequence) byk.A00.getString(C0003R.string.messaging_controls_group_adds_title)));
        ArrayList arrayList3 = new ArrayList();
        for (Integer num2 : Constants.ZERO(2)) {
            String A003 = BYM.A00(num2);
            AnonymousClass1HD r32 = byk.A00;
            int intValue2 = num2.intValue();
            if (1 != intValue2) {
                i = C0003R.string.messaging_controls_reachable_to_everyone;
            } else {
                i = C0003R.string.messaging_controls_reachable_to_following;
            }
            String string2 = r32.getString(i);
            if (intValue2 != 1) {
                r2 = byk.A00;
                i2 = C0003R.string.messaging_controls_group_adds_everyone_subtext;
            } else {
                r2 = byk.A00;
                i2 = C0003R.string.messaging_controls_group_adds_following_subtext;
            }
            arrayList3.add(new C120245Dw(A003, string2, r2.getString(i2)));
        }
        arrayList.add(new C120235Dv(arrayList3, byk.A01.A00.getString("direct_message_reachability_group_add", BYM.A00(Constants.ZERO)), new BYG(byk)));
        setItems(arrayList);
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.setTitle(getString(C0003R.string.messaging_settings_title));
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(552568240);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A06(this.mArguments);
        this.A01 = new BYK(this, this);
        AnonymousClass0Z0.A09(337507673, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0Z0.A02(528301823);
        super.onResume();
        BYK byk = this.A01;
        C15890nh r2 = new C15890nh(byk.A02);
        r2.A09 = Constants.A0N;
        r2.A0C = "users/get_message_settings/";
        r2.A06(BYJ.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = new BYE(byk);
        byk.A03.schedule(A03);
        AnonymousClass0Z0.A09(1501436199, A02);
    }
}
