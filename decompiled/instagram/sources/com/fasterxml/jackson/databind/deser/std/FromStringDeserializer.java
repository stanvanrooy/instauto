package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import java.io.File;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.xml.namespace.QName;
import p000X.AnonymousClass000;
import p000X.C27123ByY;
import p000X.C27125Bya;

public abstract class FromStringDeserializer extends StdScalarDeserializer {
    public Object A0M(String str, C27123ByY byY) {
        return !(this instanceof CoreXMLDeserializers.QNameDeserializer) ? !(this instanceof CoreXMLDeserializers.DurationDeserializer) ? !(this instanceof JdkDeserializers$UUIDDeserializer) ? !(this instanceof JdkDeserializers$URLDeserializer) ? !(this instanceof JdkDeserializers$URIDeserializer) ? !(this instanceof JdkDeserializers$PatternDeserializer) ? !(this instanceof JdkDeserializers$LocaleDeserializer) ? !(this instanceof JdkDeserializers$InetAddressDeserializer) ? !(this instanceof JdkDeserializers$FileDeserializer) ? !(this instanceof JdkDeserializers$CurrencyDeserializer) ? !(this instanceof JdkDeserializers$CharsetDeserializer) ? TimeZone.getTimeZone(str) : Charset.forName(str) : Currency.getInstance(str) : new File(str) : InetAddress.getByName(str) : JdkDeserializers$LocaleDeserializer.A00(str) : Pattern.compile(str) : URI.create(str) : new URL(str) : UUID.fromString(str) : CoreXMLDeserializers.A00.newDuration(str) : QName.valueOf(str);
    }

    public Object A0L(Object obj, C27123ByY byY) {
        throw C27125Bya.A00(byY.A05, AnonymousClass000.A0N("Don't know how to convert embedded Object of type ", obj.getClass().getName(), " into ", this.A00.getName()));
    }

    public FromStringDeserializer(Class cls) {
        super(cls);
    }
}
