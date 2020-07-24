package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Calendar;

public final class StdKeySerializers$CalendarKeySerializer extends StdSerializer {
    public static final JsonSerializer A00 = new StdKeySerializers$CalendarKeySerializer();

    public StdKeySerializers$CalendarKeySerializer() {
        super(Calendar.class);
    }
}
