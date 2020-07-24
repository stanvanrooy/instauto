package p000X;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.23o  reason: invalid class name and case insensitive filesystem */
public final class C473623o {
    public static final ArrayList A03 = new ArrayList();
    public SparseArray A00 = null;
    public WeakReference A01 = null;
    public WeakHashMap A02 = null;

    public static View A00(C473623o r4, View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = r4.A02;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View A002 = A00(r4, viewGroup.getChildAt(childCount), keyEvent);
                    if (A002 != null) {
                        return A002;
                    }
                }
            }
            if (A01(view, keyEvent)) {
                return view;
            }
        }
        return null;
    }

    public static boolean A01(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(C0003R.C0005id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((AnonymousClass4FH) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                return true;
            }
        }
        return false;
    }
}
