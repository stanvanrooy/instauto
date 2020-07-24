package com.facebook.jni;

import java.util.Iterator;

public class IteratorHelper {
    public Object mElement;
    public final Iterator mIterator;

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }

    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }

    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }
}
