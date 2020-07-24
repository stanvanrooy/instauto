package com.fasterxml.jackson.databind.deser.std;

import java.sql.Timestamp;
import java.text.DateFormat;

public final class DateDeserializers$TimestampDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$TimestampDeserializer A00 = new DateDeserializers$TimestampDeserializer();

    public DateDeserializers$TimestampDeserializer() {
        super(Timestamp.class);
    }

    public DateDeserializers$TimestampDeserializer(DateDeserializers$TimestampDeserializer dateDeserializers$TimestampDeserializer, DateFormat dateFormat, String str) {
        super(dateDeserializers$TimestampDeserializer, dateFormat, str);
    }
}
