package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p000X.Constants;
import p000X.C06;
import p000X.C13460iZ;
import p000X.C206808uA;
import p000X.C27126Byj;
import p000X.C27148BzD;
import p000X.C35;

public abstract class DateTimeSerializerBase extends StdScalarSerializer implements C35 {
    public final DateFormat A00;
    public final boolean A01;

    public void A0B(Object obj, C13460iZ r5, C06 c06) {
        if (!(this instanceof DateSerializer)) {
            ((CalendarSerializer) this).A0F((Calendar) obj, r5, c06);
            return;
        }
        DateSerializer dateSerializer = (DateSerializer) this;
        Date date = (Date) obj;
        if (dateSerializer.A01) {
            r5.A0Y(date == null ? 0 : date.getTime());
            return;
        }
        DateFormat dateFormat = dateSerializer.A00;
        if (dateFormat != null) {
            synchronized (dateFormat) {
                r5.A0g(dateSerializer.A00.format(date));
            }
            return;
        }
        c06.A0F(date, r5);
    }

    public long A0D(Object obj) {
        if (!(this instanceof DateSerializer)) {
            Calendar calendar = (Calendar) obj;
            if (calendar != null) {
                return calendar.getTimeInMillis();
            }
            return 0;
        }
        Date date = (Date) obj;
        if (date != null) {
            return date.getTime();
        }
        return 0;
    }

    public DateTimeSerializerBase A0E(boolean z, DateFormat dateFormat) {
        return !(this instanceof DateSerializer) ? z ? new CalendarSerializer(true, (DateFormat) null) : new CalendarSerializer(false, dateFormat) : z ? new DateSerializer(true, (DateFormat) null) : new DateSerializer(false, dateFormat);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r2 == p000X.Constants.A0j) goto L_0x0021;
     */
    public final JsonSerializer AAL(C06 c06, C27148BzD bzD) {
        C27126Byj A002;
        boolean z;
        DateFormat dateFormat;
        if (!(bzD == null || (A002 = c06.A05.A01().A00(bzD.APy())) == null)) {
            Integer num = A002.A00;
            if (!(num == Constants.A0Y || num == Constants.A0u)) {
                z = false;
            }
            z = true;
            if (z) {
                return A0E(true, (DateFormat) null);
            }
            TimeZone timeZone = A002.A03;
            String str = A002.A01;
            if (str.length() > 0) {
                Locale locale = A002.A02;
                if (locale == null) {
                    locale = c06.A05.A00.A06;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                if (timeZone == null) {
                    timeZone = c06.A05.A00.A07;
                }
                simpleDateFormat.setTimeZone(timeZone);
                return A0E(false, simpleDateFormat);
            } else if (timeZone != null) {
                DateFormat dateFormat2 = c06.A05.A00.A05;
                if (dateFormat2.getClass() == C206808uA.class) {
                    dateFormat = (DateFormat) C206808uA.A06.clone();
                    if (timeZone != null) {
                        dateFormat.setTimeZone(timeZone);
                    }
                } else {
                    dateFormat = (DateFormat) dateFormat2.clone();
                    dateFormat.setTimeZone(timeZone);
                }
                return A0E(false, dateFormat);
            }
        }
        return this;
    }

    public DateTimeSerializerBase(Class cls, boolean z, DateFormat dateFormat) {
        super(cls);
        this.A01 = z;
        this.A00 = dateFormat;
    }
}
