package com.instagram.igds.components.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.facebook.C0003R;
import java.util.Calendar;
import p000X.AnonymousClass1EM;

public class IgTimePicker extends LinearLayout {
    public NumberPicker A00;
    public NumberPicker A01;
    public NumberPicker A02;
    public NumberPicker A03;
    public Calendar A04;
    public boolean A05;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2T, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, C0003R.layout.time_picker_layout);
        obtainStyledAttributes.recycle();
        inflate(context, resourceId, this);
        this.A01 = (NumberPicker) findViewById(C0003R.C0005id.date_picker);
        this.A02 = (NumberPicker) findViewById(C0003R.C0005id.hour_picker);
        this.A03 = (NumberPicker) findViewById(C0003R.C0005id.minute_picker);
        this.A00 = (NumberPicker) findViewById(C0003R.C0005id.ampm_picker);
        this.A01.setWrapSelectorWheel(false);
        this.A01.setMinValue(0);
        this.A01.setMaxValue(365);
        this.A00.setWrapSelectorWheel(false);
        this.A04 = Calendar.getInstance();
        this.A05 = DateFormat.is24HourFormat(context);
    }

    public int getNumberOfDaysInPickerRange() {
        return (this.A01.getMaxValue() - this.A01.getMinValue()) + 1;
    }

    public Calendar getSelectedDate() {
        Calendar calendar = (Calendar) this.A04.clone();
        calendar.add(5, this.A01.getValue());
        return calendar;
    }

    public int getSelectedHourOfDay() {
        if (this.A05) {
            return this.A02.getValue();
        }
        return (this.A02.getValue() % 12) + (this.A00.getValue() * 12);
    }

    public int getSelectedMinute() {
        return this.A03.getValue() * 5;
    }

    public Calendar getSelectedTime() {
        Calendar calendar = (Calendar) this.A04.clone();
        calendar.add(5, this.A01.getValue());
        calendar.set(11, getSelectedHourOfDay());
        calendar.set(12, getSelectedMinute());
        return calendar;
    }

    public void setDatePeriod(int i) {
        this.A01.setMaxValue(i - 1);
    }

    public final void A01(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        this.A01.setValue(Math.round(((float) (instance.getTimeInMillis() - this.A04.getTimeInMillis())) / 8.64E7f));
    }

    public void setIs24HourView(boolean z) {
        this.A05 = z;
    }

    public IgTimePicker(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public IgTimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public IgTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
