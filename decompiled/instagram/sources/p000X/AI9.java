package p000X;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: X.AI9 */
public abstract class AI9 {
    public AnonymousClass00N A00;
    public AnonymousClass00N A01;
    public final Context A02;

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof AI8)) {
            return menuItem;
        }
        AI8 ai8 = (AI8) menuItem;
        if (this.A00 == null) {
            this.A00 = new AnonymousClass00N();
        }
        MenuItem menuItem2 = (MenuItem) this.A00.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        AI7 ai7 = new AI7(this.A02, ai8);
        this.A00.put(ai8, ai7);
        return ai7;
    }

    public final SubMenu A01(SubMenu subMenu) {
        if (!(subMenu instanceof AIF)) {
            return subMenu;
        }
        AIF aif = (AIF) subMenu;
        if (this.A01 == null) {
            this.A01 = new AnonymousClass00N();
        }
        SubMenu subMenu2 = (SubMenu) this.A01.get(aif);
        if (subMenu2 != null) {
            return subMenu2;
        }
        AI5 ai5 = new AI5(this.A02, aif);
        this.A01.put(aif, ai5);
        return ai5;
    }

    public AI9(Context context) {
        this.A02 = context;
    }
}
