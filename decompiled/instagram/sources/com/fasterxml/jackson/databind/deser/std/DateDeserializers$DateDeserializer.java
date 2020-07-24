package com.fasterxml.jackson.databind.deser.std;

import java.text.DateFormat;
import java.util.Date;

public final class DateDeserializers$DateDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$DateDeserializer A00 = new DateDeserializers$DateDeserializer();

    public DateDeserializers$DateDeserializer() {
        super(Date.class);
    }

    public DateDeserializers$DateDeserializer(DateDeserializers$DateDeserializer dateDeserializers$DateDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$DateDeserializer, dateFormat, str);
    }
}
