package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest;
import com.facebook.superpack.ditto.DittoPatch;
import java.io.Closeable;

public final class DiscreteFileInputDexIterator extends InputDexIterator {
    public final ResProvider mResProvider;

    public InputDex nextImpl(DexManifest.Dex dex) {
        Closeable open = this.mResProvider.open(dex.assetName);
        try {
            open = null;
            return new InputDex(dex, open);
        } finally {
            C0015Fs.safeClose((Closeable) open);
        }
    }

    public DiscreteFileInputDexIterator(DexManifest dexManifest, DittoPatch dittoPatch, ResProvider resProvider) {
        super(dexManifest, dittoPatch);
        this.mResProvider = resProvider;
    }
}
