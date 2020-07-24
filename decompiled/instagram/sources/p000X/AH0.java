package p000X;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.AH0 */
public abstract class AH0 implements C54092Vs {
    public int A00 = C0003R.layout.abc_action_menu_item_layout;
    public Context A01;
    public LayoutInflater A02;
    public C54042Vn A03;
    public C54122Vv A04;
    public C54142Vy A05;
    public int A06 = C0003R.layout.abc_action_menu_layout;
    public Context A07;
    public LayoutInflater A08;

    public void A02(AnonymousClass99I r3, AnonymousClass99H r4) {
        C23296AGw aGw = (C23296AGw) this;
        r4.Adc(r3, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) r4;
        actionMenuItemView.A01 = (ActionMenuView) aGw.A05;
        if (aGw.A04 == null) {
            aGw.A04 = new AHX(aGw);
        }
        actionMenuItemView.A00 = aGw.A04;
    }

    public boolean A03(int i, AnonymousClass99I r3) {
        if (!(this instanceof C23296AGw)) {
            return true;
        }
        return r3.A02();
    }

    public final boolean A90(C54042Vn r2, AnonymousClass99I r3) {
        return false;
    }

    public final boolean ADn(C54042Vn r2, AnonymousClass99I r3) {
        return false;
    }

    public boolean AEZ() {
        ArrayList arrayList;
        int i;
        if (!(this instanceof C23296AGw)) {
            return false;
        }
        C23296AGw aGw = (C23296AGw) this;
        C54042Vn r0 = aGw.A03;
        boolean z = false;
        if (r0 != null) {
            arrayList = r0.A05();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = aGw.A01;
        int i3 = aGw.A00;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aGw.A05;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            AnonymousClass99I r4 = (AnonymousClass99I) arrayList.get(i6);
            int i7 = r4.A05;
            boolean z3 = false;
            if ((i7 & 2) == 2) {
                z3 = true;
            }
            if (z3) {
                i4++;
            } else {
                boolean z4 = true;
                if ((i7 & 1) != 1) {
                    z4 = false;
                }
                if (z4) {
                    i5++;
                } else {
                    z2 = true;
                }
            }
            if (aGw.A08 && r4.isActionViewExpanded()) {
                i2 = 0;
            }
        }
        if (aGw.A0A && (z2 || i5 + i4 > i2)) {
            i2--;
        }
        int i8 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = aGw.A0E;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            AnonymousClass99I r42 = (AnonymousClass99I) arrayList.get(i9);
            int i11 = r42.A05;
            boolean z5 = false;
            if ((i11 & 2) == 2) {
                z5 = true;
            }
            if (z5) {
                View A002 = aGw.A00(r42, (View) null, viewGroup);
                A002.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = A002.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 != 0) {
                    measuredWidth = i10;
                }
                int groupId = r42.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r42.A00(true);
                i10 = measuredWidth;
            } else {
                boolean z6 = true;
                if ((i11 & 1) != 1) {
                    z6 = false;
                }
                if (z6) {
                    int groupId2 = r42.getGroupId();
                    boolean z7 = sparseBooleanArray.get(groupId2);
                    if ((i8 > 0 || z7) && i3 > 0) {
                        z = true;
                    }
                    if (z) {
                        View A003 = aGw.A00(r42, (View) null, viewGroup);
                        A003.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = A003.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        boolean z8 = false;
                        if (i3 + i10 > 0) {
                            z8 = true;
                        }
                        z &= z8;
                    }
                    if (z && groupId2 != 0) {
                        sparseBooleanArray.put(groupId2, true);
                    } else if (z7) {
                        sparseBooleanArray.put(groupId2, false);
                        for (int i12 = 0; i12 < i9; i12++) {
                            AnonymousClass99I r1 = (AnonymousClass99I) arrayList.get(i12);
                            if (r1.getGroupId() == groupId2) {
                                if (r1.A02()) {
                                    i8++;
                                }
                                r1.A00(false);
                            }
                        }
                    }
                    if (z) {
                        i8--;
                    }
                }
                r42.A00(z);
            }
            i9++;
            z = false;
        }
        return true;
    }

    public View A00(AnonymousClass99I r4, View view, ViewGroup viewGroup) {
        AnonymousClass99H r5;
        if (view instanceof AnonymousClass99H) {
            r5 = (AnonymousClass99H) view;
        } else {
            r5 = (AnonymousClass99H) this.A02.inflate(this.A00, viewGroup, false);
        }
        A02(r4, r5);
        return (View) r5;
    }

    public C54142Vy A01(ViewGroup viewGroup) {
        if (this.A05 == null) {
            C54142Vy r1 = (C54142Vy) this.A02.inflate(this.A06, viewGroup, false);
            this.A05 = r1;
            r1.Adb(this.A03);
            Bsm(true);
        }
        return this.A05;
    }

    public void AdP(Context context, C54042Vn r3) {
        this.A01 = context;
        this.A08 = LayoutInflater.from(context);
        this.A03 = r3;
    }

    public void Awx(C54042Vn r2, boolean z) {
        C54122Vv r0 = this.A04;
        if (r0 != null) {
            r0.Awx(r2, z);
        }
    }

    public boolean BPP(AnonymousClass99K r2) {
        C54122Vv r0 = this.A04;
        if (r0 != null) {
            return r0.BDK(r2);
        }
        return false;
    }

    public void Bsm(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.A05;
        if (viewGroup != null) {
            C54042Vn r0 = this.A03;
            int i = 0;
            if (r0 != null) {
                r0.A06();
                ArrayList A052 = this.A03.A05();
                int size = A052.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    AnonymousClass99I r3 = (AnonymousClass99I) A052.get(i3);
                    if (A03(i2, r3)) {
                        View childAt = viewGroup.getChildAt(i2);
                        AnonymousClass99I r02 = null;
                        if (childAt instanceof AnonymousClass99H) {
                            r02 = ((AnonymousClass99H) childAt).getItemData();
                        }
                        View A002 = A00(r3, childAt, viewGroup);
                        if (r3 != r02) {
                            A002.setPressed(false);
                            A002.jumpDrawablesToCurrentState();
                        }
                        if (A002 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) A002.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(A002);
                            }
                            ((ViewGroup) this.A05).addView(A002, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!A04(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public AH0(Context context) {
        this.A07 = context;
        this.A02 = LayoutInflater.from(context);
    }

    public boolean A04(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public final void BgL(C54122Vv r1) {
        this.A04 = r1;
    }
}
