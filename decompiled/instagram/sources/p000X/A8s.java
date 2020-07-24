package p000X;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.A8s */
public final class A8s implements PopupMenu.OnDismissListener, PopupMenu.OnMenuItemClickListener {
    public boolean A00 = false;
    public final Callback A01;

    public final void onDismiss(PopupMenu popupMenu) {
        if (!this.A00) {
            this.A01.invoke(DialogModule.ACTION_DISMISSED);
            this.A00 = true;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.A00) {
            return false;
        }
        this.A01.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
        this.A00 = true;
        return true;
    }

    public A8s(Callback callback) {
        this.A01 = callback;
    }
}
