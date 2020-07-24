package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collection;
import p000X.C0L;
import p000X.C27148BzD;
import p000X.C27204C1t;

public final class CollectionSerializer extends AsArraySerializerBase {
    public CollectionSerializer(C0L c0l, boolean z, C27204C1t c1t, C27148BzD bzD, JsonSerializer jsonSerializer) {
        super(Collection.class, c0l, z, c1t, bzD, jsonSerializer);
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, C27148BzD bzD, C27204C1t c1t, JsonSerializer jsonSerializer) {
        super(collectionSerializer, bzD, c1t, jsonSerializer);
    }
}
