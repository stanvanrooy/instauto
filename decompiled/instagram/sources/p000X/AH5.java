package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.forker.Process;
import java.lang.reflect.Method;

/* renamed from: X.AH5 */
public class AH5 implements AnonymousClass99E {
    public static Method A0Q;
    public static Method A0R;
    public static Method A0S;
    public int A00 = Integer.MAX_VALUE;
    public int A01 = 0;
    public int A02 = -2;
    public int A03;
    public int A04 = -2;
    public Context A05;
    public Rect A06;
    public View A07;
    public AdapterView.OnItemClickListener A08;
    public ListAdapter A09;
    public PopupWindow A0A;
    public C205608r8 A0B;
    public Runnable A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public int A0I = 1002;
    public DataSetObserver A0J;
    public final Handler A0K;
    public final AHR A0L = new AHR(this);
    public final Rect A0M = new Rect();
    public final AHF A0N = new AHF(this);
    public final C23310AHk A0O = new C23310AHk(this);
    public final AHB A0P = new AHB(this);

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                A0R = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                A0S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                A0Q = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C205608r8 A01(Context context, boolean z) {
        if (!(this instanceof AnonymousClass99T)) {
            return new C205608r8(context, z);
        }
        AnonymousClass99Q r0 = new AnonymousClass99Q(context, z);
        r0.A00 = (AnonymousClass99T) this;
        return r0;
    }

    public final void A02(int i) {
        Drawable background = this.A0A.getBackground();
        if (background != null) {
            background.getPadding(this.A0M);
            Rect rect = this.A0M;
            this.A04 = rect.left + rect.right + i;
            return;
        }
        this.A04 = i;
    }

    public final Drawable AGY() {
        return this.A0A.getBackground();
    }

    public final int AZv() {
        if (!this.A0D) {
            return 0;
        }
        return this.A03;
    }

    public final boolean Ahh() {
        return this.A0A.isShowing();
    }

    public void Bff(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A0J;
        if (dataSetObserver == null) {
            this.A0J = new C23307AHh(this);
        } else {
            ListAdapter listAdapter2 = this.A09;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A09 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A0J);
        }
        C205608r8 r1 = this.A0B;
        if (r1 != null) {
            r1.setAdapter(this.A09);
        }
    }

    public final void BgB(Drawable drawable) {
        this.A0A.setBackgroundDrawable(drawable);
    }

    public final void Ble(int i) {
        this.A03 = i;
        this.A0D = true;
    }

    public final void dismiss() {
        this.A0A.dismiss();
        this.A0A.setContentView((View) null);
        this.A0B = null;
        AnonymousClass0ZA.A08(this.A0K, this.A0L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ff  */
    public final void show() {
        int i;
        int i2;
        int makeMeasureSpec;
        int A002;
        int i3;
        C205608r8 r1;
        C205608r8 r0 = this.A0B;
        int i4 = Process.WAIT_RESULT_TIMEOUT;
        boolean z = true;
        if (r0 == null) {
            Context context = this.A05;
            this.A0C = new C23309AHj(this);
            C205608r8 A012 = A01(context, !this.A0E);
            this.A0B = A012;
            A012.setAdapter(this.A09);
            this.A0B.setOnItemClickListener(this.A08);
            this.A0B.setFocusable(true);
            this.A0B.setFocusableInTouchMode(true);
            this.A0B.setOnItemSelectedListener(new C23305AHf(this));
            this.A0B.setOnScrollListener(this.A0N);
            i = 0;
            this.A0A.setContentView(this.A0B);
        } else {
            this.A0A.getContentView();
            i = 0;
        }
        Drawable background = this.A0A.getBackground();
        if (background != null) {
            background.getPadding(this.A0M);
            Rect rect = this.A0M;
            int i5 = rect.top;
            i2 = i5 + rect.bottom;
            if (!this.A0D) {
                this.A03 = -i5;
            }
        } else {
            this.A0M.setEmpty();
            i2 = 0;
        }
        if (this.A0A.getInputMethodMode() != 2) {
            z = false;
        }
        View view = this.A07;
        int i6 = this.A03;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = A0Q;
            if (method != null) {
                try {
                    PopupWindow popupWindow = this.A0A;
                    Object[] objArr = new Object[3];
                    objArr[i] = view;
                    objArr[1] = Integer.valueOf(i6);
                    objArr[2] = Boolean.valueOf(z);
                    i6 = ((Integer) method.invoke(popupWindow, objArr)).intValue();
                } catch (Exception unused) {
                }
            }
            i6 = this.A0A.getMaxAvailableHeight(view, i6);
        } else {
            i6 = this.A0A.getMaxAvailableHeight(view, i6, z);
        }
        if (this.A02 == -1) {
            i3 = i6 + i2;
        } else {
            int i7 = this.A04;
            if (i7 != -2) {
                i4 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
                if (i7 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
                    A002 = this.A0B.A00(makeMeasureSpec, i6 - i);
                    if (A002 > 0) {
                        i += i2 + this.A0B.getPaddingTop() + this.A0B.getPaddingBottom();
                    }
                    i3 = A002 + i;
                }
            }
            int i8 = this.A05.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.A0M;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), i4);
            A002 = this.A0B.A00(makeMeasureSpec, i6 - i);
            if (A002 > 0) {
            }
            i3 = A002 + i;
        }
        boolean z2 = false;
        if (this.A0A.getInputMethodMode() == 2) {
            z2 = true;
        }
        AnonymousClass2WL.A00(this.A0A, this.A0I);
        if (!this.A0A.isShowing()) {
            int i9 = this.A04;
            if (i9 == -1) {
                i9 = -1;
            } else if (i9 == -2) {
                i9 = this.A07.getWidth();
            }
            int i10 = this.A02;
            if (i10 == -1) {
                i3 = -1;
            } else if (i10 != -2) {
                i3 = i10;
            }
            this.A0A.setWidth(i9);
            this.A0A.setHeight(i3);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = A0R;
                if (method2 != null) {
                    try {
                        method2.invoke(this.A0A, new Object[]{true});
                    } catch (Exception unused2) {
                    }
                }
            } else {
                this.A0A.setIsClippedToScreen(true);
            }
            this.A0A.setOutsideTouchable(true);
            this.A0A.setTouchInterceptor(this.A0P);
            if (this.A0G) {
                AnonymousClass2WL.A02(this.A0A, this.A0F);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method3 = A0S;
                if (method3 != null) {
                    try {
                        method3.invoke(this.A0A, new Object[]{this.A06});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.A0A.setEpicenterBounds(this.A06);
            }
            AnonymousClass2WL.A01(this.A0A, this.A07, this.A0H, this.A03, this.A01);
            this.A0B.setSelection(-1);
            if ((!this.A0E || this.A0B.isInTouchMode()) && (r1 = this.A0B) != null) {
                r1.A08 = true;
                r1.requestLayout();
            }
            if (!this.A0E) {
                AnonymousClass0ZA.A0E(this.A0K, this.A0O, -886867497);
            }
        } else if (this.A07.isAttachedToWindow()) {
            int i11 = this.A04;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.A07.getWidth();
            }
            int i12 = this.A02;
            if (i12 == -1) {
                if (!z2) {
                    i3 = -1;
                }
                if (z2) {
                    PopupWindow popupWindow2 = this.A0A;
                    int i13 = 0;
                    if (this.A04 == -1) {
                        i13 = -1;
                    }
                    popupWindow2.setWidth(i13);
                    this.A0A.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.A0A;
                    int i14 = 0;
                    if (this.A04 == -1) {
                        i14 = -1;
                    }
                    popupWindow3.setWidth(i14);
                    this.A0A.setHeight(-1);
                }
            } else if (i12 != -2) {
                i3 = i12;
            }
            this.A0A.setOutsideTouchable(true);
            PopupWindow popupWindow4 = this.A0A;
            View view2 = this.A07;
            int i15 = this.A0H;
            int i16 = this.A03;
            if (i11 < 0) {
                i11 = -1;
            }
            if (i3 < 0) {
                i3 = -1;
            }
            popupWindow4.update(view2, i15, i16, i11, i3);
        }
    }

    public AH5(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A05 = context;
        this.A0K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C26061Bl.A0P, i, i2);
        this.A0H = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A03 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0D = true;
        }
        obtainStyledAttributes.recycle();
        AnonymousClass998 r0 = new AnonymousClass998(context, attributeSet, i, i2);
        this.A0A = r0;
        r0.setInputMethodMode(1);
    }

    public final int AN6() {
        return this.A0H;
    }

    public final ListView AP5() {
        return this.A0B;
    }

    public final void Bhu(int i) {
        this.A0H = i;
    }
}
