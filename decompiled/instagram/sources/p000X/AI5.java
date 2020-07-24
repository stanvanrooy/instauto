package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.AI5 */
public final class AI5 extends AI6 implements SubMenu {
    public final AIF A00;

    public final void clearHeader() {
        this.A00.clearHeader();
    }

    public final MenuItem getItem() {
        return A00(this.A00.getItem());
    }

    public final SubMenu setHeaderView(View view) {
        this.A00.setHeaderView(view);
        return this;
    }

    public AI5(Context context, AIF aif) {
        super(context, aif);
        this.A00 = aif;
    }

    public final SubMenu setHeaderIcon(int i) {
        this.A00.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.A00.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.A00.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.A00.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.A00.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.A00.setIcon(drawable);
        return this;
    }
}
