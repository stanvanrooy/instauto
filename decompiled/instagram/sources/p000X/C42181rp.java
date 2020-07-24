package p000X;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import java.util.ArrayList;

/* renamed from: X.1rp  reason: invalid class name and case insensitive filesystem */
public abstract class C42181rp {
    public static void A00(Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
    }

    public static void A01(Context context) {
        Resources resources = context.getResources();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        ArrayList<AnonymousClass6J8> arrayList2 = new ArrayList<>();
        arrayList2.add(AnonymousClass6J8.CAMERA);
        arrayList2.add(AnonymousClass6J8.POST);
        arrayList2.add(AnonymousClass6J8.ACTIVITY);
        arrayList2.add(AnonymousClass6J8.DIRECT);
        for (AnonymousClass6J8 r2 : arrayList2) {
            arrayList.add(new ShortcutInfo.Builder(context, r2.A03).setIcon(Icon.createWithResource(context, r2.A00)).setIntent(r2.A02).setShortLabel(resources.getString(r2.A01)).build());
        }
        shortcutManager.setDynamicShortcuts(arrayList);
    }
}
