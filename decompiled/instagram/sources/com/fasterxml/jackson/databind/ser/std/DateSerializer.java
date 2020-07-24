package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.text.DateFormat;
import java.util.Date;

@JacksonStdImpl
public final class DateSerializer extends DateTimeSerializerBase {
    public static final DateSerializer A00 = new DateSerializer(false, (DateFormat) null);

    public DateSerializer(boolean z, DateFormat dateFormat) {
        super(Date.class, z, dateFormat);
    }
}
