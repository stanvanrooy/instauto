package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.AI7 */
public final class AI7 extends AI9 implements MenuItem {
    public Method A00;
    public final AI8 A01;

    public final boolean collapseActionView() {
        return this.A01.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.A01.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        AnonymousClass99L AXH = this.A01.AXH();
        if (AXH instanceof AIA) {
            return ((AIA) AXH).A00;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.A01.getActionView();
        if (actionView instanceof AID) {
            return (View) ((AID) actionView).A00;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.A01.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.A01.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.A01.getContentDescription();
    }

    public final int getGroupId() {
        return this.A01.getGroupId();
    }

    public final Drawable getIcon() {
        return this.A01.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.A01.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.A01.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.A01.getIntent();
    }

    public final int getItemId() {
        return this.A01.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.A01.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.A01.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.A01.getNumericShortcut();
    }

    public final int getOrder() {
        return this.A01.getOrder();
    }

    public final SubMenu getSubMenu() {
        return A01(this.A01.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.A01.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.A01.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.A01.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.A01.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.A01.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.A01.isCheckable();
    }

    public final boolean isChecked() {
        return this.A01.isChecked();
    }

    public final boolean isEnabled() {
        return this.A01.isEnabled();
    }

    public final boolean isVisible() {
        return this.A01.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        AIB aib = new AIB(this, this.A02, actionProvider);
        AI8 ai8 = this.A01;
        if (actionProvider == null) {
            aib = null;
        }
        ai8.Bkw(aib);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.A01.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.A01.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.A01.Bgh(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.A01.setEnabled(z);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A01.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A01.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.A01.setIntent(intent);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        AI4 ai4;
        AI8 ai8 = this.A01;
        if (onActionExpandListener != null) {
            ai4 = new AI4(this, onActionExpandListener);
        } else {
            ai4 = null;
        }
        ai8.setOnActionExpandListener(ai4);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        AIE aie;
        AI8 ai8 = this.A01;
        if (onMenuItemClickListener != null) {
            aie = new AIE(this, onMenuItemClickListener);
        } else {
            aie = null;
        }
        ai8.setOnMenuItemClickListener(aie);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.A01.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.A01.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A01.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.A01.BlK(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.A01.setVisible(z);
    }

    public AI7(Context context, AI8 ai8) {
        super(context);
        if (ai8 != null) {
            this.A01 = ai8;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem setActionView(int i) {
        this.A01.setActionView(i);
        View actionView = this.A01.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.A01.setActionView((View) new AID(actionView));
        }
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new AID(view);
        }
        this.A01.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.A01.setAlphabeticShortcut(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.A01.setAlphabeticShortcut(c, i);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.A01.setNumericShortcut(c);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.A01.setNumericShortcut(c, i);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.A01.setShortcut(c, c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01.setShortcut(c, c2, i, i2);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.A01.setTitle(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.A01.setTitle(charSequence);
        return this;
    }
}
