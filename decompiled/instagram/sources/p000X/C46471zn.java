package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1zn  reason: invalid class name and case insensitive filesystem */
public final class C46471zn {
    public static void A01(Collection collection, int i, AnonymousClass0C1 r12, Integer num, AnonymousClass0RN r14, Map map, Context context) {
        AnonymousClass0C1 r7 = r12;
        AnonymousClass1F6 A00 = AnonymousClass1F6.A00(r12);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            Object obj = map.get(reel);
            AnonymousClass0a4.A06(obj);
            C37461jh A002 = A00(reel, i, ((Integer) obj).intValue(), r7, num, r14.getModuleName(), context);
            if (A002 != null) {
                arrayList.add(A002);
            }
        }
        A00.A0B(arrayList, r14.getModuleName());
    }

    public static C37461jh A00(Reel reel, int i, int i2, AnonymousClass0C1 r8, Integer num, String str, Context context) {
        AnonymousClass1NJ r3;
        if (reel.A0l(r8) || (r3 = reel.A0B(r8).A08) == null) {
            return null;
        }
        String id = r3.getId();
        AnonymousClass1GH A0D = AnonymousClass12C.A0c.A0D(r3.A0G(context.getResources().getDimensionPixelSize(C0003R.dimen.tray_item_background_content_width)), str);
        A0D.A0G = true;
        A0D.A0H = false;
        if (!TextUtils.isEmpty(r3.A26)) {
            A0D.A06 = r3.A26;
        }
        return new C37461jh(new C37631jy(id, A0D.A00(), (C37671k2) null), new C37651k0(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), num));
    }
}
