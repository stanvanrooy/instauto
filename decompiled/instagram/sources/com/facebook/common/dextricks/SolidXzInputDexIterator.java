package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest;
import com.facebook.superpack.ditto.DittoPatch;
import com.facebook.xzdecoder.XzInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import p000X.AnonymousClass000;
import p000X.AnonymousClass075;
import p000X.AnonymousClass076;

public final class SolidXzInputDexIterator extends InputDexIterator {
    public boolean mConsumingStream;
    public final AnonymousClass075 mEvent;
    public SliceInputStream mLastPartIs;
    public final ResProvider mResProvider;
    public final AnonymousClass076 mTracer;
    public final XzInputStream mXzs;

    public final class SliceInputStream extends InputStream {
        public int mBytesRead = 0;
        public int mBytesToRead;

        public SliceInputStream(int i) {
            this.mBytesToRead = i;
            SolidXzInputDexIterator.this.mConsumingStream = true;
        }

        public int available() {
            return this.mBytesToRead - this.mBytesRead;
        }

        public void close() {
            SolidXzInputDexIterator.this.mConsumingStream = false;
        }

        public int read() {
            if (this.mBytesRead == this.mBytesToRead) {
                return -1;
            }
            int read = SolidXzInputDexIterator.this.mXzs.read();
            if (read != -1) {
                this.mBytesRead++;
                return read;
            }
            throw new RuntimeException("truncated xzs stream");
        }

        public int read(byte[] bArr, int i, int i2) {
            if (i2 > 0 && this.mBytesRead == this.mBytesToRead) {
                return -1;
            }
            int read = SolidXzInputDexIterator.this.mXzs.read(bArr, i, Math.min(i2, this.mBytesToRead - this.mBytesRead));
            if (read > 0) {
                this.mBytesRead += read;
            }
            return read;
        }
    }

    public InputDex nextImpl(DexManifest.Dex dex) {
        if (!this.mConsumingStream) {
            SliceInputStream sliceInputStream = this.mLastPartIs;
            if (sliceInputStream != null) {
                int available = sliceInputStream.available();
                if (available > 0) {
                    C0015Fs.discardFromInputStream(sliceInputStream, (long) available);
                }
                this.mLastPartIs = null;
            }
            SliceInputStream sliceInputStream2 = new SliceInputStream(getJarFileSizeFromMeta(this.mResProvider, AnonymousClass000.A0E(dex.assetName, ".meta")));
            this.mLastPartIs = sliceInputStream2;
            return new InputDex(dex, sliceInputStream2);
        }
        throw new RuntimeException("previous InputDex not closed");
    }

    public SolidXzInputDexIterator(DexManifest dexManifest, DittoPatch dittoPatch, ResProvider resProvider, InputStream inputStream, AnonymousClass076 r6) {
        super(dexManifest, dittoPatch);
        this.mResProvider = resProvider;
        this.mXzs = new XzInputStream(inputStream);
        this.mTracer = r6;
        this.mEvent = r6.A5v(34603012);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0046 */
    private int getJarFileSizeFromMeta(ResProvider resProvider, String str) {
        InputStream open = resProvider.open(str);
        InputStreamReader inputStreamReader = new InputStreamReader(open);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String readLine = bufferedReader.readLine();
        String substring = readLine.substring(0, readLine.indexOf(32));
        int parseInt = Integer.parseInt(substring.substring(substring.indexOf(58) + 1));
        bufferedReader.close();
        inputStreamReader.close();
        if (open != null) {
            open.close();
        }
        return parseInt;
        try {
        } catch (Throwable th) {
            inputStreamReader.close();
            throw th;
        }
        try {
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }

    public void close() {
        super.close();
        C0015Fs.safeClose((Closeable) this.mXzs);
    }
}
