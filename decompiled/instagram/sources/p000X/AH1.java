package p000X;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: X.AH1 */
public abstract class AH1 implements C54092Vs, AnonymousClass99E, AdapterView.OnItemClickListener {
    public Rect A00;

    public static int A00(ListAdapter listAdapter, Context context, int i) {
        FrameLayout frameLayout = null;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public void A02(int i) {
        if (!(this instanceof AH4)) {
            AH3 ah3 = (AH3) this;
            if (ah3.A04 != i) {
                ah3.A04 = i;
                ah3.A02 = Gravity.getAbsoluteGravity(i, ah3.A07.getLayoutDirection());
                return;
            }
            return;
        }
        ((AH4) this).A01 = i;
    }

    public void A03(int i) {
        if (!(this instanceof AH4)) {
            AH3 ah3 = (AH3) this;
            ah3.A0B = true;
            ah3.A05 = i;
            return;
        }
        ((AH4) this).A0G.Bhu(i);
    }

    public void A04(int i) {
        if (!(this instanceof AH4)) {
            AH3 ah3 = (AH3) this;
            ah3.A0C = true;
            ah3.A06 = i;
            return;
        }
        ((AH4) this).A0G.Ble(i);
    }

    public void A05(View view) {
        if (!(this instanceof AH4)) {
            AH3 ah3 = (AH3) this;
            if (ah3.A07 != view) {
                ah3.A07 = view;
                ah3.A02 = Gravity.getAbsoluteGravity(ah3.A04, view.getLayoutDirection());
                return;
            }
            return;
        }
        ((AH4) this).A02 = view;
    }

    public void A06(PopupWindow.OnDismissListener onDismissListener) {
        if (!(this instanceof AH4)) {
            ((AH3) this).A09 = onDismissListener;
        } else {
            ((AH4) this).A05 = onDismissListener;
        }
    }

    public void A07(C54042Vn r3) {
        if (!(this instanceof AH4)) {
            AH3 ah3 = (AH3) this;
            r3.A0D(ah3, ah3.A0J);
            if (ah3.Ahh()) {
                AH3.A01(ah3, r3);
            } else {
                ah3.A0L.add(r3);
            }
        }
    }

    public void A08(boolean z) {
        if (!(this instanceof AH4)) {
            ((AH3) this).A0A = z;
        } else {
            ((AH4) this).A0E.A01 = z;
        }
    }

    public void A09(boolean z) {
        if (!(this instanceof AH4)) {
            ((AH3) this).A0D = z;
        } else {
            ((AH4) this).A07 = z;
        }
    }

    public boolean A0A() {
        return !(this instanceof AH3);
    }

    public final boolean A90(C54042Vn r2, AnonymousClass99I r3) {
        return false;
    }

    public final boolean ADn(C54042Vn r2, AnonymousClass99I r3) {
        return false;
    }

    public final void AdP(Context context, C54042Vn r2) {
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        ListAdapter listAdapter2 = listAdapter;
        if (listAdapter instanceof HeaderViewListAdapter) {
            listAdapter2 = ((HeaderViewListAdapter) listAdapter2).getWrappedAdapter();
        }
        C54042Vn r3 = ((AnonymousClass99P) listAdapter2).A00;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        int i2 = 4;
        if (A0A()) {
            i2 = 0;
        }
        r3.A0K(menuItem, this, i2);
    }
}
