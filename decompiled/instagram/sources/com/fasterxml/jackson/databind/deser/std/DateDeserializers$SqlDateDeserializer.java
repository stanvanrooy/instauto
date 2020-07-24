package com.fasterxml.jackson.databind.deser.std;

import java.sql.Date;
import java.text.DateFormat;

public final class DateDeserializers$SqlDateDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$SqlDateDeserializer A00 = new DateDeserializers$SqlDateDeserializer();

    public DateDeserializers$SqlDateDeserializer() {
        super(Date.class);
    }

    public DateDeserializers$SqlDateDeserializer(DateDeserializers$SqlDateDeserializer dateDeserializers$SqlDateDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$SqlDateDeserializer, dateFormat, str);
    }
}
