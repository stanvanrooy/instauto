package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest;
import com.facebook.superpack.ditto.DittoPatch;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

public abstract class InputDexIterator implements Iterator, Closeable {
    public int mDexPos = 0;
    public final DexManifest.Dex[] mDexes;
    public DittoPatch mPatch;

    public abstract InputDex nextImpl(DexManifest.Dex dex);

    public void close() {
        DittoPatch dittoPatch = this.mPatch;
        if (dittoPatch != null) {
            dittoPatch.close();
        }
    }

    public final boolean hasNext() {
        if (this.mDexPos < this.mDexes.length) {
            return true;
        }
        return false;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public InputDexIterator(DexManifest dexManifest, DittoPatch dittoPatch) {
        this.mDexes = dexManifest.dexes;
        this.mPatch = dittoPatch;
    }

    public final InputDex next() {
        try {
            DexManifest.Dex[] dexArr = this.mDexes;
            int i = this.mDexPos;
            this.mDexPos = i + 1;
            InputDex nextImpl = nextImpl(dexArr[i]);
            DittoPatch dittoPatch = this.mPatch;
            if (dittoPatch != null) {
                nextImpl.patch(dittoPatch);
            }
            return nextImpl;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
