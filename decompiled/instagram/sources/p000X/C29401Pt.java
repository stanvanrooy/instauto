package p000X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.1Pt  reason: invalid class name and case insensitive filesystem */
public final class C29401Pt {
    public View A00;
    public C43481uU A01;
    public final Context A02;
    public final AnonymousClass0C1 A03;
    public final Queue A04;
    public final Map A05 = new HashMap();

    public static AnonymousClass0PR A00(C29401Pt r7, C43481uU r8) {
        Context contextThemeWrapper;
        AnonymousClass0PR r6 = (AnonymousClass0PR) r7.A05.get(r8);
        if (r6 != null) {
            return r6;
        }
        switch (r8.ordinal()) {
            case 1:
                contextThemeWrapper = new ContextThemeWrapper(r7.A02, 2131886724);
                break;
            case 2:
                contextThemeWrapper = new ContextThemeWrapper(r7.A02, 2131886723);
                break;
            default:
                contextThemeWrapper = r7.A02;
                break;
        }
        AnonymousClass0PR r62 = new AnonymousClass0PR(contextThemeWrapper, ((Boolean) AnonymousClass0L6.A02(r7.A03, AnonymousClass0L7.ADAPTER_LEAK_LAUNCHER, "fix_async_layout_inflater_leak", false, (AnonymousClass04H) null)).booleanValue());
        r7.A05.put(r8, r62);
        return r62;
    }

    public C29401Pt(Context context, AnonymousClass0C1 r3) {
        this.A02 = context;
        this.A03 = r3;
        this.A04 = new LinkedList();
    }
}
