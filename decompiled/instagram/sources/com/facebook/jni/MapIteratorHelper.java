package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;

public class MapIteratorHelper {
    public final Iterator mIterator;
    public Object mKey;
    public Object mValue;

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) this.mIterator.next();
            this.mKey = entry.getKey();
            this.mValue = entry.getValue();
            return true;
        }
        this.mKey = null;
        this.mValue = null;
        return false;
    }

    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }
}
