package p000X;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.10v  reason: invalid class name and case insensitive filesystem */
public class C235510v implements C06570Po {
    public SharedPreferences A00;
    public final C235710x A01;
    public final Map A02;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C235510v(AnonymousClass0C1 r4, C235710x r5) {
        HashMap hashMap = new HashMap();
        SharedPreferences A03 = C14190ju.A01(r4).A03(r5.ASQ());
        this.A01 = r5;
        this.A02 = hashMap;
        this.A00 = A03;
    }

    public static void A01(C235510v r3, Object obj) {
        char lowerCase = Character.toLowerCase(r3.A01.AOC(obj).charAt(0));
        Map map = r3.A02;
        Character valueOf = Character.valueOf(lowerCase);
        if (!map.containsKey(valueOf)) {
            r3.A02.put(valueOf, new HashSet());
        }
        ((Set) r3.A02.get(valueOf)).add(obj);
    }

    public final void A03() {
        this.A02.clear();
        this.A00.edit().clear().apply();
    }

    public final void A04() {
        for (Map.Entry value : this.A00.getAll().entrySet()) {
            try {
                A01(this, value.getValue().toString());
            } catch (IOException unused) {
            }
        }
    }

    public final List A02(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence != null && charSequence.length() > 0) {
            Character valueOf = Character.valueOf(Character.toLowerCase(charSequence.charAt(0)));
            if (this.A02.containsKey(valueOf)) {
                for (Object next : (Set) this.A02.get(valueOf)) {
                    if (this.A01.AOC(next).toLowerCase(Locale.getDefault()).startsWith(charSequence.toString().toLowerCase(Locale.getDefault()))) {
                        arrayList.add(next);
                        if (arrayList.size() == Integer.MAX_VALUE) {
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
