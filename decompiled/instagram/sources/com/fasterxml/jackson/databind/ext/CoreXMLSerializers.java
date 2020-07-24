package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import javax.xml.datatype.XMLGregorianCalendar;
import p000X.C27151BzI;

public final class CoreXMLSerializers extends C27151BzI {

    public final class XMLGregorianCalendarSerializer extends StdSerializer {
        public static final XMLGregorianCalendarSerializer A00 = new XMLGregorianCalendarSerializer();

        public XMLGregorianCalendarSerializer() {
            super(XMLGregorianCalendar.class);
        }
    }
}
