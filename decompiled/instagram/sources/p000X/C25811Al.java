package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.1Al  reason: invalid class name and case insensitive filesystem */
public final class C25811Al extends C25821Am {
    public final /* synthetic */ AnonymousClass1AZ A00;

    public final void onContentChanged() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25811Al(AnonymousClass1AZ r1, Window.Callback callback) {
        super(callback);
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0128, code lost:
        if (r1 == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    public final ActionMode A00(ActionMode.Callback callback) {
        AnonymousClass2WG r0;
        boolean z;
        ViewGroup viewGroup;
        Context context;
        AnonymousClass2AR r7;
        AnonymousClass1AZ r2 = this.A00;
        AnonymousClass2WI r3 = new AnonymousClass2WI(r2.A0i, callback);
        AnonymousClass2WG r02 = r2.A0E;
        if (r02 != null) {
            r02.A05();
        }
        AnonymousClass2WK r6 = new AnonymousClass2WK(r2, r3);
        C54062Vp A0D = r2.A0D();
        if (A0D != null) {
            r2.A0E = A0D.A0A(r6);
        }
        if (r2.A0E == null) {
            AnonymousClass23i r03 = r2.A0H;
            if (r03 != null) {
                r03.A00();
            }
            AnonymousClass2WG r04 = r2.A0E;
            if (r04 != null) {
                r04.A05();
            }
            if (!(r6 instanceof AnonymousClass2WK)) {
                r6 = new AnonymousClass2WK(r2, r6);
            }
            C11810fi r1 = r2.A0j;
            if (r1 != null && !r2.A0S) {
                try {
                    r0 = r1.BWN(r6);
                } catch (AbstractMethodError unused) {
                }
                if (r0 == null) {
                    r2.A0E = r0;
                } else {
                    if (r2.A0F == null) {
                        if (r2.A0T) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = r2.A0i.getTheme();
                            theme.resolveAttribute(C0003R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = r2.A0i.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                AnonymousClass2AR r72 = new AnonymousClass2AR(r2.A0i, 0);
                                r72.getTheme().setTo(newTheme);
                                r7 = r72;
                            } else {
                                r7 = r2.A0i;
                            }
                            r2.A0F = new ActionBarContextView(r7, (AttributeSet) null);
                            PopupWindow popupWindow = new PopupWindow(r7, (AttributeSet) null, C0003R.attr.actionModePopupWindowStyle);
                            r2.A06 = popupWindow;
                            AnonymousClass2WL.A00(popupWindow, 2);
                            r2.A06.setContentView(r2.A0F);
                            r2.A06.setWidth(-1);
                            r7.getTheme().resolveAttribute(C0003R.attr.actionBarSize, typedValue, true);
                            r2.A0F.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, r7.getResources().getDisplayMetrics()));
                            r2.A06.setHeight(-2);
                            r2.A0J = new AnonymousClass2WM(r2);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) r2.A04.findViewById(C0003R.C0005id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                C54062Vp A0D2 = r2.A0D();
                                if (A0D2 != null) {
                                    context = A0D2.A09();
                                } else {
                                    context = null;
                                }
                                if (context == null) {
                                    context = r2.A0i;
                                }
                                viewStubCompat.A00 = LayoutInflater.from(context);
                                r2.A0F = (ActionBarContextView) viewStubCompat.A00();
                            }
                        }
                    }
                    if (r2.A0F != null) {
                        AnonymousClass23i r05 = r2.A0H;
                        if (r05 != null) {
                            r05.A00();
                        }
                        ActionBarContextView actionBarContextView = r2.A0F;
                        actionBarContextView.removeAllViews();
                        actionBarContextView.A01 = null;
                        actionBarContextView.A01 = null;
                        ActionBarContextView actionBarContextView2 = r2.A0F;
                        AnonymousClass2WP r73 = new AnonymousClass2WP(actionBarContextView2.getContext(), actionBarContextView2, r6);
                        if (r6.AyX(r73, r73.A00())) {
                            r73.A06();
                            r2.A0F.A06(r73);
                            r2.A0E = r73;
                            if (r2.A0Y && (viewGroup = r2.A04) != null) {
                                boolean isLaidOut = viewGroup.isLaidOut();
                                z = true;
                            }
                            z = false;
                            if (z) {
                                r2.A0F.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                                AnonymousClass23i A0A = AnonymousClass1E1.A0A(r2.A0F);
                                A0A.A01(1.0f);
                                r2.A0H = A0A;
                                A0A.A04(new AnonymousClass2WQ(r2));
                            } else {
                                r2.A0F.setAlpha(1.0f);
                                r2.A0F.setVisibility(0);
                                r2.A0F.sendAccessibilityEvent(32);
                                if (r2.A0F.getParent() instanceof View) {
                                    AnonymousClass1E1.A0J((View) r2.A0F.getParent());
                                }
                            }
                            if (r2.A06 != null) {
                                r2.A05.getDecorView().post(r2.A0J);
                            }
                        } else {
                            r2.A0E = null;
                        }
                    }
                }
                r2.A0E = r2.A0E;
            }
            r0 = null;
            if (r0 == null) {
            }
            r2.A0E = r2.A0E;
        }
        AnonymousClass2WG r06 = r2.A0E;
        if (r06 != null) {
            return r3.A00(r06);
        }
        return null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A00.A0f(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C54042Vn)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C54042Vn r2 = null;
        if (menu instanceof C54042Vn) {
            r2 = (C54042Vn) menu;
        }
        if (i == 0 && r2 == null) {
            return false;
        }
        if (r2 != null) {
            r2.A0C = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (r2 != null) {
            r2.A0C = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C54042Vn r0;
        AnonymousClass1E6 A0a = this.A00.A0a(0);
        if (A0a == null || (r0 = A0a.A0A) == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, r0, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r1 != false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z;
        C54042Vn r0;
        C54042Vn r02;
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            AnonymousClass1AZ r6 = this.A00;
            int keyCode = keyEvent.getKeyCode();
            C54062Vp A0D = r6.A0D();
            if (A0D == null || !A0D.A0J(keyCode, keyEvent)) {
                AnonymousClass1E6 r4 = r6.A0B;
                if (r4 != null) {
                    int keyCode2 = keyEvent.getKeyCode();
                    boolean z2 = false;
                    if (!keyEvent.isSystem() && ((r4.A0D || AnonymousClass1AZ.A06(r6, r4, keyEvent)) && (r02 = r4.A0A) != null)) {
                        z2 = r02.performShortcut(keyCode2, keyEvent, 1);
                    }
                    if (z2) {
                        AnonymousClass1E6 r03 = r6.A0B;
                        if (r03 != null) {
                            r03.A0B = true;
                        }
                    }
                }
                if (r6.A0B == null) {
                    AnonymousClass1E6 A0a = r6.A0a(0);
                    AnonymousClass1AZ.A06(r6, A0a, keyEvent);
                    int keyCode3 = keyEvent.getKeyCode();
                    boolean z3 = false;
                    if (!keyEvent.isSystem() && ((A0a.A0D || AnonymousClass1AZ.A06(r6, A0a, keyEvent)) && (r0 = A0a.A0A) != null)) {
                        z3 = r0.performShortcut(keyCode3, keyEvent, 1);
                    }
                    A0a.A0D = false;
                }
                z = false;
                if (!z) {
                    return true;
                }
                return false;
            }
            z = true;
            if (!z) {
            }
        }
        return true;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        C54062Vp A0D;
        super.onMenuOpened(i, menu);
        AnonymousClass1AZ r1 = this.A00;
        if (i != 108 || (A0D = r1.A0D()) == null) {
            return true;
        }
        A0D.A0D(true);
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        AnonymousClass1AZ r3 = this.A00;
        if (i == 108) {
            C54062Vp A0D = r3.A0D();
            if (A0D != null) {
                A0D.A0D(false);
            }
        } else if (i == 0) {
            AnonymousClass1E6 A0a = r3.A0a(i);
            if (A0a.A0C) {
                r3.A0d(A0a, false);
            }
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.A00.A0P) {
            return A00(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (!this.A00.A0P || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        return A00(callback);
    }
}
