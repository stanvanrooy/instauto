package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AH3 */
public final class AH3 extends AH1 implements C54092Vs, PopupWindow.OnDismissListener, View.OnKeyListener {
    public ViewTreeObserver A00;
    public boolean A01;
    public int A02 = 0;
    public int A03;
    public int A04 = 0;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public PopupWindow.OnDismissListener A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C54122Vv A0E;
    public final Handler A0F;
    public final ViewTreeObserver.OnGlobalLayoutListener A0G = new AHC(this);
    public final int A0H;
    public final int A0I;
    public final Context A0J;
    public final AnonymousClass99S A0K = new AHD(this);
    public final List A0L = new ArrayList();
    public final List A0M = new ArrayList();
    public final int A0N;
    public final View.OnAttachStateChangeListener A0O = new AHT(this);
    public final boolean A0P;

    public final boolean AEZ() {
        return false;
    }

    public static void A01(AH3 ah3, C54042Vn r15) {
        C23314AHp aHp;
        View view;
        Rect rect;
        int i;
        int i2;
        int i3;
        int i4;
        MenuItem menuItem;
        AnonymousClass99P r12;
        int i5;
        int firstVisiblePosition;
        LayoutInflater from = LayoutInflater.from(ah3.A0J);
        AnonymousClass99P r7 = new AnonymousClass99P(r15, from, ah3.A0P, C0003R.layout.abc_cascading_menu_item_layout);
        if (!ah3.Ahh() && ah3.A0A) {
            r7.A01 = true;
        } else if (ah3.Ahh()) {
            int size = r15.size();
            boolean z = false;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    break;
                }
                MenuItem item = r15.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i6++;
            }
            r7.A01 = z;
        }
        int A002 = AH1.A00(r7, ah3.A0J, ah3.A0N);
        AnonymousClass99T r8 = new AnonymousClass99T(ah3.A0J, ah3.A0H, ah3.A0I);
        r8.A00 = ah3.A0K;
        r8.A08 = ah3;
        r8.A0A.setOnDismissListener(ah3);
        r8.A07 = ah3.A07;
        r8.A01 = ah3.A02;
        r8.A0E = true;
        r8.A0A.setFocusable(true);
        r8.A0A.setInputMethodMode(2);
        r8.Bff(r7);
        r8.A02(A002);
        r8.A01 = ah3.A02;
        if (ah3.A0M.size() > 0) {
            List list = ah3.A0M;
            aHp = (C23314AHp) list.get(list.size() - 1);
            C54042Vn r3 = aHp.A01;
            int size2 = r3.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = r3.getItem(i7);
                if (menuItem.hasSubMenu() && r15 == menuItem.getSubMenu()) {
                    break;
                }
                i7++;
            }
            if (menuItem != null) {
                ListView AP5 = aHp.A02.AP5();
                ListAdapter adapter = AP5.getAdapter();
                int i8 = 0;
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    r12 = (AnonymousClass99P) headerViewListAdapter.getWrappedAdapter();
                } else {
                    r12 = (AnonymousClass99P) adapter;
                    i5 = 0;
                }
                int count = r12.getCount();
                while (true) {
                    if (i8 < count) {
                        if (menuItem == r12.getItem(i8)) {
                            break;
                        }
                        i8++;
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                if (i8 != -1 && (firstVisiblePosition = (i8 + i5) - AP5.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < AP5.getChildCount()) {
                    view = AP5.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            aHp = null;
            view = null;
        }
        if (view != null) {
            r8.A05();
            r8.A03();
            List list2 = ah3.A0M;
            ListView AP52 = ((C23314AHp) list2.get(list2.size() - 1)).A02.AP5();
            int[] iArr = new int[2];
            AP52.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            ah3.A08.getWindowVisibleDisplayFrame(rect2);
            if (ah3.A03 != 1 ? iArr[0] - A002 >= 0 : iArr[0] + AP52.getWidth() + A002 > rect2.right) {
                i = 0;
            } else {
                i = 1;
            }
            boolean z2 = false;
            if (i == 1) {
                z2 = true;
            }
            ah3.A03 = i;
            if (Build.VERSION.SDK_INT >= 26) {
                r8.A07 = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                ah3.A07.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((ah3.A02 & 7) == 5) {
                    iArr2[0] = iArr2[0] + ah3.A07.getWidth();
                    iArr3[0] = iArr3[0] + view.getWidth();
                }
                i2 = iArr3[0] - iArr2[0];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((ah3.A02 & 5) == 5) {
                if (!z2) {
                    A002 = view.getWidth();
                }
                i4 = i2 + A002;
                r8.Bhu(i4);
                r8.A0G = true;
                r8.A0F = true;
                r8.Ble(i3);
            } else if (z2) {
                A002 = view.getWidth();
                i4 = i2 + A002;
                r8.Bhu(i4);
                r8.A0G = true;
                r8.A0F = true;
                r8.Ble(i3);
            }
            i4 = i2 - A002;
            r8.Bhu(i4);
            r8.A0G = true;
            r8.A0F = true;
            r8.Ble(i3);
        } else {
            if (ah3.A0B) {
                r8.Bhu(ah3.A05);
            }
            if (ah3.A0C) {
                r8.Ble(ah3.A06);
            }
            Rect rect3 = ah3.A00;
            Rect rect4 = rect3;
            if (rect3 != null) {
                rect = new Rect(rect4);
            } else {
                rect = null;
            }
            r8.A06 = rect;
        }
        ah3.A0M.add(new C23314AHp(r8, r15, ah3.A03));
        r8.show();
        ListView AP53 = r8.AP5();
        AP53.setOnKeyListener(ah3);
        if (aHp == null && ah3.A0D && r15.A05 != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0003R.layout.abc_popup_menu_header_item_layout, AP53, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(r15.A05);
            AP53.addHeaderView(frameLayout, (Object) null, false);
            r8.show();
        }
    }

    public final ListView AP5() {
        if (this.A0M.isEmpty()) {
            return null;
        }
        List list = this.A0M;
        return ((C23314AHp) list.get(list.size() - 1)).A02.AP5();
    }

    public final boolean Ahh() {
        if (this.A0M.size() <= 0 || !((C23314AHp) this.A0M.get(0)).A02.Ahh()) {
            return false;
        }
        return true;
    }

    public final void Awx(C54042Vn r6, boolean z) {
        int size = this.A0M.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (r6 == ((C23314AHp) this.A0M.get(i)).A01) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.A0M.size()) {
                ((C23314AHp) this.A0M.get(i2)).A01.A0F(false);
            }
            C23314AHp aHp = (C23314AHp) this.A0M.remove(i);
            aHp.A01.A0C(this);
            if (this.A01) {
                aHp.A02.A04();
                aHp.A02.A0A.setAnimationStyle(0);
            }
            aHp.A02.dismiss();
            int size2 = this.A0M.size();
            if (size2 > 0) {
                this.A03 = ((C23314AHp) this.A0M.get(size2 - 1)).A00;
            } else {
                int i3 = 1;
                if (this.A07.getLayoutDirection() == 1) {
                    i3 = 0;
                }
                this.A03 = i3;
            }
            if (size2 == 0) {
                dismiss();
                C54122Vv r1 = this.A0E;
                if (r1 != null) {
                    r1.Awx(r6, true);
                }
                ViewTreeObserver viewTreeObserver = this.A00;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.A00.removeGlobalOnLayoutListener(this.A0G);
                    }
                    this.A00 = null;
                }
                this.A08.removeOnAttachStateChangeListener(this.A0O);
                this.A09.onDismiss();
            } else if (z) {
                ((C23314AHp) this.A0M.get(0)).A01.A0F(false);
            }
        }
    }

    public final boolean BPP(AnonymousClass99K r5) {
        for (C23314AHp aHp : this.A0M) {
            if (r5 == aHp.A01) {
                aHp.A02.AP5().requestFocus();
                return true;
            }
        }
        if (!r5.hasVisibleItems()) {
            return false;
        }
        A07(r5);
        C54122Vv r0 = this.A0E;
        if (r0 != null) {
            r0.BDK(r5);
        }
        return true;
    }

    public final void Bsm(boolean z) {
        for (C23314AHp aHp : this.A0M) {
            ListAdapter adapter = aHp.A02.AP5().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            AnonymousClass0Z1.A00((AnonymousClass99P) adapter, 1673239182);
        }
    }

    public final void dismiss() {
        int size = this.A0M.size();
        if (size > 0) {
            C23314AHp[] aHpArr = (C23314AHp[]) this.A0M.toArray(new C23314AHp[size]);
            for (int i = size - 1; i >= 0; i--) {
                C23314AHp aHp = aHpArr[i];
                if (aHp.A02.Ahh()) {
                    aHp.A02.dismiss();
                }
            }
        }
    }

    public final void onDismiss() {
        C23314AHp aHp;
        int size = this.A0M.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aHp = null;
                break;
            }
            aHp = (C23314AHp) this.A0M.get(i);
            if (!aHp.A02.Ahh()) {
                break;
            }
            i++;
        }
        if (aHp != null) {
            aHp.A01.A0F(false);
        }
    }

    public AH3(Context context, View view, int i, int i2, boolean z) {
        this.A0J = context;
        this.A07 = view;
        this.A0H = i;
        this.A0I = i2;
        this.A0P = z;
        this.A0A = false;
        this.A03 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.A0N = Math.max(resources.getDisplayMetrics().widthPixels >> 1, resources.getDimensionPixelSize(C0003R.dimen.abc_config_prefDialogWidth));
        this.A0F = new Handler();
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void show() {
        if (!Ahh()) {
            for (C54042Vn A012 : this.A0L) {
                A01(this, A012);
            }
            this.A0L.clear();
            View view = this.A07;
            this.A08 = view;
            if (view != null) {
                boolean z = false;
                if (this.A00 == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.A00 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0G);
                }
                this.A08.addOnAttachStateChangeListener(this.A0O);
            }
        }
    }

    public final void BgL(C54122Vv r1) {
        this.A0E = r1;
    }
}
