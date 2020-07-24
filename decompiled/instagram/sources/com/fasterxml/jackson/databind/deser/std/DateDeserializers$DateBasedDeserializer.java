package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p000X.AnonymousClass000;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C206808uA;
import p000X.C27105Bxz;
import p000X.C27123ByY;
import p000X.C27126Byj;
import p000X.C27148BzD;

public abstract class DateDeserializers$DateBasedDeserializer extends StdScalarDeserializer implements C27105Bxz {
    public final String A00;
    public final DateFormat A01;

    public DateDeserializers$DateBasedDeserializer A0L(DateFormat dateFormat, String str) {
        return !(this instanceof DateDeserializers$TimestampDeserializer) ? !(this instanceof DateDeserializers$SqlDateDeserializer) ? !(this instanceof DateDeserializers$DateDeserializer) ? new DateDeserializers$CalendarDeserializer((DateDeserializers$CalendarDeserializer) this, dateFormat, str) : new DateDeserializers$DateDeserializer((DateDeserializers$DateDeserializer) this, dateFormat, str) : new DateDeserializers$SqlDateDeserializer((DateDeserializers$SqlDateDeserializer) this, dateFormat, str) : new DateDeserializers$TimestampDeserializer((DateDeserializers$TimestampDeserializer) this, dateFormat, str);
    }

    public final Date A0I(C13080hr r10, C27123ByY byY) {
        Date parse;
        if (this.A01 == null || r10.A0g() != C13120hv.VALUE_STRING) {
            return super.A0I(r10, byY);
        }
        String trim = r10.A0t().trim();
        if (trim.length() == 0) {
            return (Date) A05();
        }
        synchronized (this.A01) {
            try {
                parse = this.A01.parse(trim);
            } catch (ParseException e) {
                throw new IllegalArgumentException(AnonymousClass000.A0P("Failed to parse Date value '", trim, "' (format: \"", this.A00, "\"): ", e.getMessage()));
            }
        }
        return parse;
    }

    public JsonDeserializer AAK(C27123ByY byY, C27148BzD bzD) {
        C27126Byj A002;
        DateFormat dateFormat;
        if (!(bzD == null || (A002 = byY.A00.A01().A00(bzD.APy())) == null)) {
            TimeZone timeZone = A002.A03;
            String str = A002.A01;
            if (str.length() > 0) {
                Locale locale = A002.A02;
                if (locale == null) {
                    locale = byY.A00.A00.A06;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                if (timeZone == null) {
                    timeZone = byY.A00.A00.A07;
                }
                simpleDateFormat.setTimeZone(timeZone);
                return A0L(simpleDateFormat, str);
            } else if (timeZone != null) {
                DateFormat dateFormat2 = byY.A00.A00.A05;
                if (dateFormat2.getClass() == C206808uA.class) {
                    if (timeZone == null) {
                        timeZone = C206808uA.A0A;
                    }
                    dateFormat = new C206808uA(timeZone);
                } else {
                    dateFormat = (DateFormat) dateFormat2.clone();
                    dateFormat.setTimeZone(timeZone);
                }
                return A0L(dateFormat, str);
            }
        }
        return this;
    }

    public DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer dateDeserializers$DateBasedDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$DateBasedDeserializer.A00);
        this.A01 = dateFormat;
        this.A00 = str;
    }

    public DateDeserializers$DateBasedDeserializer(Class cls) {
        super(cls);
        this.A01 = null;
        this.A00 = null;
    }
}
