package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import p000X.C27152BzJ;

public final class CoreXMLDeserializers extends C27152BzJ {
    public static final DatatypeFactory A00;

    public final class DurationDeserializer extends FromStringDeserializer {
        public static final DurationDeserializer A00 = new DurationDeserializer();

        public DurationDeserializer() {
            super(Duration.class);
        }
    }

    public final class GregorianCalendarDeserializer extends StdScalarDeserializer {
        public static final GregorianCalendarDeserializer A00 = new GregorianCalendarDeserializer();

        public GregorianCalendarDeserializer() {
            super(XMLGregorianCalendar.class);
        }
    }

    public final class QNameDeserializer extends FromStringDeserializer {
        public static final QNameDeserializer A00 = new QNameDeserializer();

        public QNameDeserializer() {
            super(QName.class);
        }
    }

    static {
        try {
            A00 = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
