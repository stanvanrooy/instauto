package p000X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.AED */
public final class AED {
    public static AEE A00;
    public static final Map A01 = new HashMap(4);
    public static final WeakHashMap A02 = new WeakHashMap();

    public static AnonymousClass1Q7 A00(Context context, Object obj) {
        Map map = (Map) A01.get(context);
        if (map == null) {
            Context context2 = context;
            while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (A02.containsKey(context2)) {
                return null;
            }
            if (A00 == null) {
                A00 = new AEE();
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(A00);
            }
            map = new HashMap();
            A01.put(context, map);
        }
        AnonymousClass1Q7 r1 = (AnonymousClass1Q7) map.get(obj);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass1Q7 r12 = new AnonymousClass1Q7(3);
        map.put(obj.getClass(), r12);
        return r12;
    }
}
