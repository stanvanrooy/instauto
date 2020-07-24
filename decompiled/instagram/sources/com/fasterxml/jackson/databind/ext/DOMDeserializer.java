package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import p000X.AnonymousClass000;
import p000X.C27123ByY;

public abstract class DOMDeserializer extends FromStringDeserializer {
    public static final DocumentBuilderFactory A00;

    public final class DocumentDeserializer extends DOMDeserializer {
        public DocumentDeserializer() {
            super(Document.class);
        }
    }

    public final class NodeDeserializer extends DOMDeserializer {
        public NodeDeserializer() {
            super(Node.class);
        }
    }

    public Object A0M(String str, C27123ByY byY) {
        boolean z = this instanceof NodeDeserializer;
        return A00(str);
    }

    public static final Document A00(String str) {
        try {
            return A00.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e) {
            throw new IllegalArgumentException(AnonymousClass000.A0E("Failed to parse JSON String as XML: ", e.getMessage()), e);
        }
    }

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        A00 = newInstance;
        newInstance.setNamespaceAware(true);
    }

    public DOMDeserializer(Class cls) {
        super(cls);
    }
}
