package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView;
import com.facebook.browser.lite.chrome.widgets.menu.MenuItemTextView;
import java.util.ArrayList;

/* renamed from: X.AUV */
public final class AUV extends BaseAdapter implements ListAdapter {
    public final ArrayList A00;
    public final Context A01;
    public final AUS A02;
    public final boolean A03;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final Object getItem(int i) {
        return this.A00.get(i);
    }

    public AUV(ArrayList arrayList, Context context, AUS aus, boolean z) {
        this.A00 = arrayList;
        this.A01 = context;
        this.A02 = aus;
        this.A03 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r2.equals("navigation") == false) goto L_0x001b;
     */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        char c;
        MenuItemNavigationView menuItemNavigationView;
        MenuItemTextView menuItemTextView;
        C23611ATs aTs = (C23611ATs) getItem(i);
        String str = aTs.A01;
        int i2 = 0;
        if (str.hashCode() == 1862666772) {
            c = 0;
        }
        c = 65535;
        if (c != 0) {
            if (!(view instanceof MenuItemTextView)) {
                LayoutInflater from = LayoutInflater.from(this.A01);
                boolean z = this.A03;
                int i3 = C0003R.layout.ig_iab_menu_item;
                if (z) {
                    i3 = C0003R.layout.browser_lite_menu_item;
                }
                menuItemTextView = (MenuItemTextView) from.inflate(i3, viewGroup, false);
            } else {
                menuItemTextView = (MenuItemTextView) view;
            }
            AUS aus = this.A02;
            boolean z2 = true;
            if (this.A00.get(getCount() - 1) != aTs) {
                z2 = false;
            }
            boolean z3 = !z2;
            if (aTs != null) {
                TextView textView = (TextView) menuItemTextView.findViewById(C0003R.C0005id.title_textview);
                textView.setText(aTs.A02);
                int i4 = aTs.A00;
                int i5 = 0;
                if (i4 > 0) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(i4, 0, 0, 0);
                }
                menuItemTextView.setOnClickListener(new AUU(menuItemTextView, aus, aTs));
                if (menuItemTextView.findViewById(C0003R.C0005id.menu_divider) != null) {
                    View findViewById = menuItemTextView.findViewById(C0003R.C0005id.menu_divider);
                    if (!z3) {
                        i5 = 8;
                    }
                    findViewById.setVisibility(i5);
                }
            }
            return menuItemTextView;
        }
        if (!(view instanceof MenuItemNavigationView)) {
            LayoutInflater from2 = LayoutInflater.from(this.A01);
            boolean z4 = this.A03;
            int i6 = C0003R.layout.ig_iab_menu_nav;
            if (z4) {
                i6 = C0003R.layout.browser_lite_menu_nav;
            }
            menuItemNavigationView = (MenuItemNavigationView) from2.inflate(i6, viewGroup, false);
        } else {
            menuItemNavigationView = (MenuItemNavigationView) view;
        }
        AUS aus2 = this.A02;
        boolean z5 = true;
        if (this.A00.get(getCount() - 1) != aTs) {
            z5 = false;
        }
        boolean z6 = !z5;
        ArrayList arrayList = aTs.A03;
        C23611ATs aTs2 = (C23611ATs) arrayList.get(0);
        ImageButton imageButton = (ImageButton) menuItemNavigationView.findViewById(C0003R.C0005id.go_back);
        imageButton.setEnabled(aTs2.A04);
        if (aTs2.A04) {
            imageButton.setOnClickListener(new AUT(menuItemNavigationView, aus2, aTs2));
        }
        C23611ATs aTs3 = (C23611ATs) arrayList.get(1);
        ImageButton imageButton2 = (ImageButton) menuItemNavigationView.findViewById(C0003R.C0005id.go_forward);
        imageButton2.setEnabled(aTs3.A04);
        if (aTs3.A04) {
            imageButton2.setOnClickListener(new AUT(menuItemNavigationView, aus2, aTs3));
        }
        View findViewById2 = menuItemNavigationView.findViewById(C0003R.C0005id.menu_divider);
        if (!z6) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
        return menuItemNavigationView;
    }
}
