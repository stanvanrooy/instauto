package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest;
import com.facebook.superpack.SuperpackArchive;
import com.facebook.superpack.SuperpackFile;
import com.facebook.superpack.SuperpackFileInputStream;
import com.facebook.superpack.ditto.DittoPatch;
import com.facebook.xzdecoder.XzInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import p000X.AnonymousClass000;
import p000X.AnonymousClass075;
import p000X.AnonymousClass076;
import p000X.AnonymousClass0YR;

public final class SuperpackInputDexIterator extends InputDexIterator {
    public final AnonymousClass0YR mArchiveExtension;
    public final int[] mDexToArchiveMap;
    public final AnonymousClass075 mEvent;
    public final SynchronousQueue[] mFileQueues;
    public int mNextDexIndex;
    public final DittoPatch mPatch;
    public boolean mShuttingDownFlag;
    public final SuperpackArchive mSuperpackArchive;
    public SuperpackFile mSuperpackFileToClose;
    public final Thread[] mThreads;
    public final AnonymousClass076 mTracer;

    public class Builder {
        public AnonymousClass0YR archiveExtension = AnonymousClass0YR.NONE;
        public int[] dexToArchive;
        public DexManifest manifest;
        public DittoPatch patch;
        public ArrayList rawArchives;
        public AnonymousClass076 tracer;

        public Builder addRawArchive(InputStream inputStream) {
            if (inputStream != null) {
                this.rawArchives.add(inputStream);
                return this;
            }
            throw null;
        }

        public Builder assignDexToArchive(int i, int i2) {
            if (i2 < 0 || i2 >= this.rawArchives.size()) {
                throw new IndexOutOfBoundsException();
            }
            this.dexToArchive[i] = i2;
            return this;
        }

        public SuperpackInputDexIterator build() {
            if (this.tracer == null) {
                throw null;
            } else if (this.rawArchives.size() >= 1) {
                return new SuperpackInputDexIterator(this);
            } else {
                throw new IllegalStateException();
            }
        }

        public Builder setTracer(AnonymousClass076 r2) {
            if (r2 != null) {
                this.tracer = r2;
                return this;
            }
            throw null;
        }

        public Builder(DexManifest dexManifest) {
            if (dexManifest != null) {
                this.manifest = dexManifest;
                this.dexToArchive = new int[dexManifest.dexes.length];
                this.tracer = null;
                this.rawArchives = new ArrayList();
                this.archiveExtension = dexManifest.superpackExtension;
                return;
            }
            throw null;
        }

        public Builder setPatch(DittoPatch dittoPatch) {
            this.patch = dittoPatch;
            return this;
        }
    }

    public class UnpackingRunnable implements Runnable {
        public InputStream mInput;
        public SynchronousQueue mOutput;

        public UnpackingRunnable(InputStream inputStream, SynchronousQueue synchronousQueue) {
            this.mInput = inputStream;
            this.mOutput = synchronousQueue;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x002e */
        public void run() {
            try {
                SuperpackArchive superpackArchive = SuperpackInputDexIterator.getSuperpackArchive(SuperpackInputDexIterator.this, this.mInput);
                this.mInput.close();
                while (superpackArchive.hasNext()) {
                    SuperpackFile nextFileFromSpk = SuperpackInputDexIterator.getNextFileFromSpk(SuperpackInputDexIterator.this, superpackArchive);
                    try {
                        this.mOutput.put(nextFileFromSpk);
                    } catch (Throwable th) {
                        nextFileFromSpk.close();
                        throw th;
                    }
                }
                superpackArchive.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e2) {
                if (!SuperpackInputDexIterator.this.mShuttingDownFlag) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable ) {
                throw th;
            }
        }
    }

    private SuperpackFile applyPatch(SuperpackFile superpackFile) {
        DittoPatch dittoPatch = this.mPatch;
        if (dittoPatch == null) {
            return superpackFile;
        }
        synchronized (dittoPatch) {
            throw new IllegalStateException();
        }
    }

    public static Builder builder(DexManifest dexManifest) {
        return new Builder(dexManifest);
    }

    public static String getArchiveExtension(Builder builder) {
        AnonymousClass0YR r3 = builder.manifest.superpackExtension;
        if (r3 == AnonymousClass0YR.NONE || r3 == AnonymousClass0YR.XZ) {
            return ".dex.spk.xz";
        }
        if (r3 == AnonymousClass0YR.ZST) {
            return ".dex.spk.zst";
        }
        throw new RuntimeException("Unknown Superpack Archive Extension " + r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0021 */
    public static SuperpackArchive getSuperpackArchive(SuperpackInputDexIterator superpackInputDexIterator, InputStream inputStream) {
        AnonymousClass0YR r3 = superpackInputDexIterator.mArchiveExtension;
        if (r3 == AnonymousClass0YR.NONE) {
            XzInputStream xzInputStream = new XzInputStream(inputStream);
            SuperpackArchive superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(xzInputStream, "spk"));
            xzInputStream.close();
            return superpackArchive;
        }
        if (r3 == AnonymousClass0YR.XZ) {
            if (inputStream != null) {
                return new SuperpackArchive(SuperpackArchive.readNative(inputStream, "xz"));
            }
        } else if (r3 != AnonymousClass0YR.ZST) {
            throw new RuntimeException("Unknown Superpack Archive Extension " + r3);
        } else if (inputStream != null) {
            return new SuperpackArchive(SuperpackArchive.readNative(inputStream, "zst"));
        }
        throw null;
    }

    private void maybeCloseLastSuperpackFile() {
        SuperpackFile superpackFile = this.mSuperpackFileToClose;
        if (superpackFile != null) {
            superpackFile.close();
            this.mSuperpackFileToClose = null;
        }
    }

    private SuperpackFile nextSuperpackFile() {
        int[] iArr = this.mDexToArchiveMap;
        int i = this.mNextDexIndex;
        this.mNextDexIndex = i + 1;
        int i2 = iArr[i];
        if (i2 == 0) {
            return getNextFileFromSpk(this, this.mSuperpackArchive);
        }
        try {
            return (SuperpackFile) this.mFileQueues[i2 - 1].take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void setLastSuperpackFileToClose(SuperpackFile superpackFile) {
        if (this.mSuperpackFileToClose == null) {
            this.mSuperpackFileToClose = superpackFile;
            return;
        }
        throw new IllegalStateException();
    }

    public void close() {
        if (!this.mShuttingDownFlag) {
            this.mShuttingDownFlag = true;
            maybeCloseLastSuperpackFile();
            try {
                this.mSuperpackArchive.close();
                DittoPatch dittoPatch = this.mPatch;
                if (dittoPatch != null) {
                    dittoPatch.close();
                }
                for (Thread thread : this.mThreads) {
                    thread.interrupt();
                    thread.join();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalStateException("Iterator already closed");
        }
    }

    public static SuperpackFile getNextFileFromSpk(SuperpackInputDexIterator superpackInputDexIterator, SuperpackArchive superpackArchive) {
        return superpackArchive.next();
    }

    public InputDex nextImpl(DexManifest.Dex dex) {
        SuperpackFileInputStream superpackFileInputStream;
        maybeCloseLastSuperpackFile();
        SuperpackFile nextSuperpackFile = nextSuperpackFile();
        if (dex.assetName.equals(nextSuperpackFile.getName())) {
            setLastSuperpackFileToClose(nextSuperpackFile);
            SuperpackFile applyPatch = applyPatch(nextSuperpackFile);
            synchronized (applyPatch) {
                if (applyPatch.mPtr != 0) {
                    superpackFileInputStream = new SuperpackFileInputStream(applyPatch);
                } else {
                    throw new IllegalStateException();
                }
            }
            return new InputDex(dex, superpackFileInputStream);
        }
        throw new RuntimeException(AnonymousClass000.A0N("Wrong dex, expected ", dex.assetName, ", got ", nextSuperpackFile.getName()));
    }

    public SuperpackInputDexIterator(Builder builder) {
        super(builder.manifest, (DittoPatch) null);
        AnonymousClass076 r1 = builder.tracer;
        this.mTracer = r1;
        this.mEvent = r1.A5v(34603017);
        this.mPatch = builder.patch;
        this.mArchiveExtension = builder.archiveExtension;
        try {
            this.mShuttingDownFlag = false;
            this.mNextDexIndex = 0;
            this.mDexToArchiveMap = builder.dexToArchive;
            int size = builder.rawArchives.size() - 1;
            this.mThreads = new Thread[size];
            this.mFileQueues = new SynchronousQueue[size];
            int i = 0;
            while (i < size) {
                this.mFileQueues[i] = new SynchronousQueue();
                int i2 = i + 1;
                this.mThreads[i] = new Thread(new UnpackingRunnable((InputStream) builder.rawArchives.get(i2), this.mFileQueues[i]));
                this.mThreads[i].start();
                i = i2;
            }
            this.mSuperpackArchive = getSuperpackArchive(this, (InputStream) builder.rawArchives.get(0));
        } catch (Throwable th) {
            DittoPatch dittoPatch = this.mPatch;
            if (dittoPatch != null) {
                dittoPatch.close();
            }
            throw th;
        }
    }
}
