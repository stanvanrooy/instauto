package com.instagram.igds.components.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.facebook.C0003R;
import java.util.Calendar;
import p000X.AnonymousClass1EM;
import p000X.C2097492e;

public class IgDatePicker extends LinearLayout {
    public NumberPicker A00;
    public NumberPicker A01;
    public int A02;
    public int A03;
    public int A04;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2D, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, C0003R.layout.date_picker_layout);
        obtainStyledAttributes.recycle();
        inflate(context, resourceId, this);
        this.A01 = (NumberPicker) findViewById(C0003R.C0005id.month_picker);
        this.A00 = (NumberPicker) findViewById(C0003R.C0005id.day_picker);
        this.A01.setWrapSelectorWheel(false);
        this.A00.setWrapSelectorWheel(false);
        this.A01.setMinValue(1);
        this.A01.setMaxValue(12);
        this.A00.setMinValue(1);
        this.A00.setMaxValue(30);
        this.A04 = 0;
        this.A03 = 0;
        this.A02 = Calendar.getInstance().get(1);
    }

    public static void A01(IgDatePicker igDatePicker, int i) {
        int i2;
        if (i != igDatePicker.A01.getMinValue() || (i2 = igDatePicker.A04) == 0) {
            i2 = 1;
            if (i == igDatePicker.A01.getMaxValue() && igDatePicker.A03 != 0) {
                igDatePicker.A00.setMinValue(1);
                igDatePicker.A00.setMaxValue(igDatePicker.A03);
                return;
            }
        }
        igDatePicker.A00.setMinValue(i2);
        igDatePicker.A00.setMaxValue(C2097492e.A00(igDatePicker.A02, i));
    }

    public int getCurrentDayOfMonth() {
        return this.A00.getValue();
    }

    public int getCurrentMonth() {
        return this.A01.getValue();
    }

    public void setMaxDate(Calendar calendar) {
        this.A01.setMaxValue(calendar.get(2));
        this.A03 = calendar.get(5);
    }

    public void setMinDate(Calendar calendar) {
        this.A01.setMinValue(calendar.get(2));
        this.A04 = calendar.get(5);
    }

    public IgDatePicker(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public IgDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public IgDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
