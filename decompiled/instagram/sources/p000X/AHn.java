package p000X;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.AHn */
public final class AHn implements AI0 {
    public final /* synthetic */ Toolbar A00;

    public AHn(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        AI1 ai1 = this.A00.A03;
        if (ai1 != null) {
            return ai1.onMenuItemClick(menuItem);
        }
        return false;
    }
}
