package com.instagram.p009ui.widget.fixedtabbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.text.TitleTextView;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass3DM;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass3DO;
import p000X.AnonymousClass3DQ;
import p000X.C019000b;
import p000X.C06400Ox;
import p000X.C44611wS;

/* renamed from: com.instagram.ui.widget.fixedtabbar.FixedTabBar */
public class FixedTabBar extends FrameLayout implements C44611wS {
    public float A00;
    public int A01;
    public LayoutInflater A02;
    public LinearLayout A03;
    public AnonymousClass3DM A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09 = 0;
    public FixedTabBarIndicator A0A;
    public Integer A0B;
    public boolean A0C;
    public boolean A0D;

    public final void onPageSelected(int i) {
    }

    private void A00() {
        Integer num;
        if (this.A09 == 0 && (num = this.A0B) != null) {
            float f = this.A00;
            boolean z = false;
            if (f - ((float) ((int) f)) != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                z = true;
            }
            if (!z) {
                A02(num.intValue());
                this.A0B = null;
            }
        }
    }

    public final void A02(int i) {
        int i2;
        if (this.A07) {
            i2 = (this.A05.size() - 1) - i;
        } else {
            i2 = i;
        }
        for (int i3 = 0; i3 < this.A05.size(); i3++) {
            View view = (View) this.A05.get(i3);
            boolean z = false;
            if (i3 == i2) {
                z = true;
            }
            view.setSelected(z);
        }
        if (this.A09 == 0) {
            FixedTabBarIndicator fixedTabBarIndicator = this.A0A;
            fixedTabBarIndicator.A00 = i;
            int i4 = ((AnonymousClass3DN) fixedTabBarIndicator.A01.get(i)).A02;
            if (i4 == -1) {
                i4 = AnonymousClass1BA.A03(fixedTabBarIndicator.getContext(), C0003R.attr.textColorSelected);
            }
            fixedTabBarIndicator.A05.setColor(C019000b.A00(fixedTabBarIndicator.getContext(), i4));
            if (fixedTabBarIndicator.A02) {
                fixedTabBarIndicator.A00(i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            } else {
                fixedTabBarIndicator.post(new AnonymousClass3DQ(fixedTabBarIndicator));
            }
        } else {
            this.A0B = Integer.valueOf(i);
        }
    }

    public final void onPageScrollStateChanged(int i) {
        this.A09 = i;
        A00();
    }

    public final void onPageScrolled(int i, float f, int i2) {
        this.A00 = f;
        this.A0A.A00(i, f);
        A00();
    }

    public void setIndicatorEnabled(boolean z) {
        FixedTabBarIndicator fixedTabBarIndicator = this.A0A;
        int i = 4;
        if (z) {
            i = 0;
        }
        fixedTabBarIndicator.setVisibility(i);
    }

    private void A01(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.A02 = from;
        from.inflate(C0003R.layout.fixed_tabbar_layout, this);
        this.A03 = (LinearLayout) findViewById(C0003R.C0005id.fixed_tabbar_tabs_container);
        this.A0A = (FixedTabBarIndicator) findViewById(C0003R.C0005id.selected_tab_indicator);
        this.A0C = true;
        this.A07 = C06400Ox.A02(getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r6.A06 != false) goto L_0x0022;
     */
    public final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (this.A08 || this.A06) {
            if (this.A03.getMeasuredWidth() / this.A05.size() > this.A01) {
                z = false;
            }
            z = true;
            if (this.A0C || z != this.A0D) {
                this.A0C = false;
                this.A0D = z;
                for (View view : this.A05) {
                    View findViewById = view.findViewById(C0003R.C0005id.tab_button_name_text);
                    int i3 = 8;
                    int i4 = 0;
                    if (z) {
                        i4 = 8;
                    }
                    findViewById.setVisibility(i4);
                    View findViewById2 = view.findViewById(C0003R.C0005id.tab_button_fallback_icon);
                    if (z) {
                        i3 = 0;
                    }
                    findViewById2.setVisibility(i3);
                }
                super.onMeasure(i, i2);
            }
        }
    }

    public void setDelegate(AnonymousClass3DM r1) {
        this.A04 = r1;
    }

    public void setForceIconFallbackTabs(boolean z) {
        this.A06 = z;
    }

    public void setMaybeUseIconFallbackTabs(boolean z) {
        this.A08 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r0 != false) goto L_0x002f;
     */
    public void setTabs(List list) {
        int i;
        TitleTextView titleTextView;
        String str;
        String str2;
        int size = list.size();
        boolean z = false;
        if (size > 2) {
            z = true;
        }
        this.A03.removeAllViews();
        this.A05 = new ArrayList(size);
        this.A01 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass3DN r6 = (AnonymousClass3DN) list.get(i2);
            View view = r6.A06;
            if (view == null) {
                if (!this.A08) {
                    boolean z2 = this.A06;
                    i = C0003R.layout.fixed_tabbar_button;
                }
                i = C0003R.layout.tabbar_button_with_fallback_icon;
                view = this.A02.inflate(i, this.A03, false);
                if (this.A08 || this.A06) {
                    titleTextView = (TitleTextView) view.findViewById(C0003R.C0005id.tab_button_name_text);
                    Context context = getContext();
                    int i3 = r6.A04;
                    if (i3 != -1) {
                        str = context.getString(i3);
                    } else {
                        str = r6.A07;
                        if (str == null) {
                            str = "";
                        }
                    }
                    titleTextView.setText(str);
                    titleTextView.measure(0, 0);
                    if (this.A01 < titleTextView.getMeasuredWidth()) {
                        this.A01 = titleTextView.getMeasuredWidth();
                    }
                    Drawable drawable = r6.A05;
                    if (drawable == null) {
                        getContext();
                        drawable = C019000b.A03(context, r6.A01);
                    }
                    ((ImageView) view.findViewById(C0003R.C0005id.tab_button_fallback_icon)).setImageDrawable(drawable);
                } else {
                    titleTextView = (TitleTextView) view;
                    Context context2 = getContext();
                    int i4 = r6.A04;
                    if (i4 != -1) {
                        str2 = context2.getString(i4);
                    } else {
                        str2 = r6.A07;
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                    titleTextView.setText(str2);
                }
                titleTextView.setIsCapitalized(r6.A08);
                if (z) {
                    titleTextView.setTextSize(0, getResources().getDimension(C0003R.dimen.font_medium));
                }
                int i5 = r6.A03;
                if (i5 != -1) {
                    titleTextView.setTextColor(C019000b.A02(titleTextView.getContext(), i5));
                }
                view.setOnClickListener(new AnonymousClass3DO(this, i2));
                int i6 = r6.A00;
                if (i6 != -1) {
                    view.setBackground(C019000b.A03(getContext(), i6));
                }
            }
            this.A05.add(view);
            this.A03.addView(view);
        }
        this.A0A.setTabs(list);
        this.A0A.requestLayout();
    }

    public FixedTabBar(Context context) {
        super(context);
        A01(context);
    }

    public FixedTabBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context);
    }

    public FixedTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context);
    }
}
