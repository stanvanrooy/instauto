package p000X;

import android.view.MenuItem;

/* renamed from: X.AIE */
public final class AIE implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ AI7 A01;

    public AIE(AI7 ai7, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A01 = ai7;
        this.A00 = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
