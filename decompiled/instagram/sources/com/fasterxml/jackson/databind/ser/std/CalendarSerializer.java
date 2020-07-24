package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.text.DateFormat;
import java.util.Calendar;
import p000X.C06;
import p000X.C13460iZ;

@JacksonStdImpl
public final class CalendarSerializer extends DateTimeSerializerBase {
    public static final CalendarSerializer A00 = new CalendarSerializer(false, (DateFormat) null);

    public CalendarSerializer(boolean z, DateFormat dateFormat) {
        super(Calendar.class, z, dateFormat);
    }

    public final void A0F(Calendar calendar, C13460iZ r4, C06 c06) {
        long timeInMillis;
        if (this.A01) {
            if (calendar == null) {
                timeInMillis = 0;
            } else {
                timeInMillis = calendar.getTimeInMillis();
            }
            r4.A0Y(timeInMillis);
            return;
        }
        DateFormat dateFormat = this.A00;
        if (dateFormat != null) {
            synchronized (dateFormat) {
                r4.A0g(this.A00.format(calendar));
            }
            return;
        }
        c06.A0F(calendar.getTime(), r4);
    }
}
