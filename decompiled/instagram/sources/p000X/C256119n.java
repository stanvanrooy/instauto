package p000X;

import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: X.19n  reason: invalid class name and case insensitive filesystem */
public final class C256119n {
    public static boolean A00 = true;
    public static Field A01;

    static {
        String str;
        String str2;
        try {
            Field declaredField = AdapterView.class.getDeclaredField("mDataChanged");
            A01 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "failed_to_get_data_changed_list_view_sdk_29";
                str2 = "AdapterView.mDataChanged is no longer accessible on target SDK 29 + Android 10";
            } else {
                str = "failed_to_get_data_changed_list_view";
                str2 = "unable to find mDataChanged field on AdapterView";
            }
            AnonymousClass0QD.A01(str, str2);
        }
    }

    public static void A00(AbsListView absListView, int i, int i2, int i3) {
        long j;
        if (i >= 0) {
            int i4 = 0;
            while (absListView.getFirstVisiblePosition() != i && i4 < 10) {
                Handler handler = absListView.getHandler();
                C948648z r3 = new C948648z(absListView, i, i2);
                if (i4 == 0) {
                    j = 0;
                } else {
                    j = (long) i3;
                }
                AnonymousClass0ZA.A09(handler, r3, j, 498033983);
                i4++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    public static boolean A04(AdapterView adapterView) {
        Boolean bool;
        Field field;
        if (A00 && (field = A01) != null) {
            try {
                bool = (Boolean) field.get(adapterView);
            } catch (IllegalAccessException unused) {
            }
            if (bool == null || !bool.booleanValue()) {
                return true;
            }
            return false;
        }
        bool = null;
        if (bool == null || !bool.booleanValue()) {
        }
    }

    public static void A01(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
            int i = 0;
            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                if (i2 == 0) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(makeMeasureSpec, -2));
                }
                view.measure(makeMeasureSpec, 0);
                i += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.setLayoutParams(layoutParams);
        }
    }

    public static boolean A02(AbsListView absListView) {
        if (absListView.getChildCount() != 0) {
            int count = ((ListAdapter) absListView.getAdapter()).getCount() - 1;
            int childCount = absListView.getChildCount() - 1;
            int height = absListView.getHeight() - absListView.getPaddingBottom();
            if (absListView.getLastVisiblePosition() != count || absListView.getChildAt(childCount).getBottom() > height) {
                return false;
            }
        }
        return true;
    }

    public static boolean A03(AbsListView absListView) {
        if (absListView.getChildCount() == 0 || (absListView.getFirstVisiblePosition() == 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
            return true;
        }
        return false;
    }
}
