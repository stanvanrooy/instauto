package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

@JacksonStdImpl
public final class DateDeserializers$CalendarDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$CalendarDeserializer A01 = new DateDeserializers$CalendarDeserializer(GregorianCalendar.class);
    public static final DateDeserializers$CalendarDeserializer A02 = new DateDeserializers$CalendarDeserializer();
    public final Class A00;

    public DateDeserializers$CalendarDeserializer() {
        super(Calendar.class);
        this.A00 = null;
    }

    public DateDeserializers$CalendarDeserializer(DateDeserializers$CalendarDeserializer dateDeserializers$CalendarDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$CalendarDeserializer, dateFormat, str);
        this.A00 = dateDeserializers$CalendarDeserializer.A00;
    }

    public DateDeserializers$CalendarDeserializer(Class cls) {
        super(cls);
        this.A00 = cls;
    }
}
