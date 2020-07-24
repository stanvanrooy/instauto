package com.facebook.common.dextricks;

import android.content.Context;
import com.facebook.common.dextricks.DexManifest;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass076;
import p000X.C024102g;

public class DexUnpacker {
    public final Context mAppContext;
    public final DexIteratorFactory mDexIteratorFactory;
    public final ResProvider mResProvider;

    public final class CopiedDexInfo {
        public final DexManifest.Dex dex;
        public final File dexFile;

        public CopiedDexInfo renamedTo(File file) {
            File file2 = this.dexFile;
            File file3 = new File(file, this.dex.makeDexName());
            if (file3.equals(file2)) {
                return this;
            }
            Mlog.safeFmt("Copying unpacked dex file %s to final dest %s", file2.getAbsolutePath(), file3.getAbsolutePath());
            C0015Fs.renameOrThrow(file2, file3);
            return new CopiedDexInfo(this.dex, file3);
        }

        public CopiedDexInfo(DexManifest.Dex dex2, File file) {
            this.dex = dex2;
            this.dexFile = file;
        }
    }

    public class CopyDexIterator implements Iterator, Closeable {
        public final File mDestDir;
        public final InputDexIterator mInputDexIterator;

        public void close() {
            this.mInputDexIterator.close();
        }

        public boolean hasNext() {
            return this.mInputDexIterator.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public CopyDexIterator(InputDexIterator inputDexIterator, File file) {
            this.mInputDexIterator = inputDexIterator;
            this.mDestDir = file;
        }

        public CopiedDexInfo next() {
            InputDex next = this.mInputDexIterator.next();
            try {
                CopiedDexInfo copyDex = DexUnpacker.copyDex(next, this.mDestDir);
                if (next != null) {
                    next.close();
                }
                return copyDex;
            } catch (IOException e) {
                Mlog.m36w(e, "Error unpacking dex%s", next);
                if (next != null) {
                    next.close();
                }
                return null;
            } catch (Throwable th) {
                if (next != null) {
                    next.close();
                }
                throw th;
            }
        }
    }

    public static CopiedDexInfo copyDex(InputDex inputDex, File file) {
        Mlog.safeFmt("Unpacking %s", inputDex);
        File file2 = new File(file, inputDex.dex.makeDexName());
        inputDex.extract(file2);
        Mlog.safeFmt("Unpacked dex file to %s", file2.getAbsolutePath());
        return new CopiedDexInfo(inputDex.dex, file2);
    }

    public CopyDexIterator getCopyDexIterator(DexManifest dexManifest, File file, AnonymousClass076 r8) {
        if (dexManifest == null) {
            Mlog.m35w("Cannot unpack dexes with a null manifest", new Object[0]);
            return null;
        }
        String str = dexManifest.f144id;
        try {
            DexIteratorFactory dexIteratorFactory = this.mDexIteratorFactory;
            if (r8 == null) {
                r8 = C024102g.A00;
            }
            return new CopyDexIterator(dexIteratorFactory.openDexIterator(str, dexManifest, r8, this.mAppContext), file);
        } catch (IOException e) {
            Mlog.m36w(e, "Could not create copy dex iterator", new Object[0]);
            return null;
        }
    }

    public static List copyAllDexes(CopyDexIterator copyDexIterator) {
        if (copyDexIterator != null) {
            ArrayList arrayList = new ArrayList();
            while (copyDexIterator.hasNext()) {
                CopiedDexInfo next = copyDexIterator.next();
                if (next != null) {
                    arrayList.add(next);
                } else {
                    throw new IOException("Could not unpack dex");
                }
            }
            return arrayList;
        }
        throw new IOException("Could not unpack dex since it could not find dexes");
    }

    public static List copyAllDexesAndMove(File file, CopyDexIterator copyDexIterator) {
        if (copyDexIterator != null) {
            ArrayList arrayList = new ArrayList();
            while (copyDexIterator.hasNext()) {
                CopiedDexInfo next = copyDexIterator.next();
                if (next != null) {
                    arrayList.add(next.renamedTo(file));
                } else {
                    throw new IOException("Could not unpack dex");
                }
            }
            return arrayList;
        }
        throw new IOException("Could not unpack dex since it could not find dexes");
    }

    public static AnonymousClass076 getNonNullTracer(AnonymousClass076 r0) {
        if (r0 == null) {
            return C024102g.A00;
        }
        return r0;
    }

    public DexUnpacker(Context context, ResProvider resProvider) {
        this.mAppContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r1 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = move-exception;
     */
    public List copyDexes(DexManifest dexManifest, File file, AnonymousClass076 r5) {
        CopyDexIterator copyDexIterator = getCopyDexIterator(dexManifest, file, r5);
        List copyAllDexes = copyAllDexes(copyDexIterator);
        if (copyDexIterator != null) {
            copyDexIterator.close();
        }
        return copyAllDexes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r1 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r0 = move-exception;
     */
    public List copySecondaryDexes(File file) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, (AnonymousClass076) null);
        List copyAllDexes = copyAllDexes(copySecondaryDexIterator);
        if (copySecondaryDexIterator != null) {
            copySecondaryDexIterator.close();
        }
        return copyAllDexes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r1 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = move-exception;
     */
    public List copySecondaryDexes(File file, AnonymousClass076 r4) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, r4);
        List copyAllDexes = copyAllDexes(copySecondaryDexIterator);
        if (copySecondaryDexIterator != null) {
            copySecondaryDexIterator.close();
        }
        return copyAllDexes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r1 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r0 = move-exception;
     */
    public List copySecondaryDexes(File file, File file2) {
        CopyDexIterator copySecondaryDexIterator = getCopySecondaryDexIterator(file, (AnonymousClass076) null);
        List copyAllDexesAndMove = copyAllDexesAndMove(file2, copySecondaryDexIterator);
        if (copySecondaryDexIterator != null) {
            copySecondaryDexIterator.close();
        }
        return copyAllDexesAndMove;
    }

    public CopyDexIterator getCopySecondaryDexIterator(File file) {
        return getCopySecondaryDexIterator(file, (AnonymousClass076) null);
    }

    public CopyDexIterator getCopySecondaryDexIterator(File file, AnonymousClass076 r6) {
        try {
            return getCopyDexIterator(DexManifest.loadManifestFrom(this.mResProvider, DexStoreUtils.SECONDARY_DEX_MANIFEST, false), file, r6);
        } catch (IOException e) {
            Mlog.m36w(e, "Cannot unpack secondary dexes", new Object[0]);
            return null;
        }
    }
}
