package p000X;

import android.view.MenuItem;

/* renamed from: X.AI4 */
public final class AI4 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ AI7 A01;

    public AI4(AI7 ai7, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A01 = ai7;
        this.A00 = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
