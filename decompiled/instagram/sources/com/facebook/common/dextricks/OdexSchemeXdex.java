package com.facebook.common.dextricks;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexOptRunner;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.OdexSchemeTurbo;
import com.facebook.common.dextricks.Prio;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.forker.C0024Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import p000X.C03960Bo;

public final class OdexSchemeXdex extends OdexSchemeTurbo {
    public final DexManifest.Dex[] mDexes;

    public final class DexToOptimize implements Closeable {
        public final int dexNr;
        public final ReentrantLockFile.Lock signalLock;

        public String toString() {
            return String.format("DexToOptimize(dexNr=%d)", new Object[]{Integer.valueOf(this.dexNr)});
        }

        public void close() {
            this.signalLock.close();
        }

        public DexToOptimize(int i, ReentrantLockFile.Lock lock) {
            this.dexNr = i;
            this.signalLock = lock;
        }
    }

    public final class PoliteDexOptRunner extends DexOptRunner {
        public final byte[] mBuffer = new byte[DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED];
        public final DexStore.OptimizationSession mOptimizationSession;

        public void addDexOptOptions(ProcessBuilder processBuilder) {
            processBuilder.mArgv.add("-n");
            OdexSchemeTurbo.addConfiguredDexOptOptions(this.mOptimizationSession.dexStoreConfig, processBuilder);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            r0 = move-exception;
         */
        public Process startSubprocess(ProcessBuilder processBuilder) {
            Prio.With with = new Prio.With();
            Process create = processBuilder.create();
            with.close();
            return create;
        }

        public void waitForDexOpt(Process process, int i) {
            this.mOptimizationSession.waitForAndManageProcess(process, (DexStore.ExternalProcessProgressListener) null);
        }

        public PoliteDexOptRunner(DexStore.OptimizationSession optimizationSession, File file) {
            super(file);
            this.mOptimizationSession = optimizationSession;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
            throw r0;
         */
        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            int fileno = C0024Fd.fileno(randomAccessFile.getFD());
            Prio.With with = new Prio.With();
            int i2 = 0;
            while (true) {
                byte[] bArr = this.mBuffer;
                int A02 = C03960Bo.A02(inputStream, bArr, bArr.length);
                if (A02 != -1) {
                    randomAccessFile.write(this.mBuffer, 0, A02);
                    i2 += A02;
                    this.mOptimizationSession.checkShouldStop();
                    DalvikInternals.fdatasync(fileno, -1);
                    C0015Fs.tryDiscardPageCache(fileno);
                } else {
                    with.close();
                    return i2;
                }
            }
        }
    }

    public OdexSchemeXdex(DexManifest.Dex[] dexArr) {
        super(1, dexArr);
        this.mDexes = dexArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r2 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        throw r0;
     */
    private DexToOptimize findDexToOptimize(DexStore dexStore, long j) {
        for (int i = 0; i < this.mDexes.length; i++) {
            if (((16 << i) & j) == 0) {
                ReentrantLockFile open = ReentrantLockFile.open(new File(dexStore.root, this.expectedFiles[(i << 1) + 0]));
                ReentrantLockFile.Lock tryAcquire = open.tryAcquire(0);
                open.close();
                if (tryAcquire != null) {
                    try {
                        return new DexToOptimize(i, tryAcquire);
                    } catch (Throwable th) {
                        tryAcquire.close();
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public String getSchemeName() {
        return "OdexSchemeXdex";
    }

    private boolean isFileCorruptionException(DexOptRunner.DexOptException dexOptException) {
        String str;
        if (dexOptException.status != 1 || (str = dexOptException.errout) == null) {
            return false;
        }
        int indexOf = str.indexOf("E/dalvikvm: ERROR: bad checksum");
        if (indexOf == 0 || (indexOf > 0 && str.charAt(indexOf - 1) == 10)) {
            return true;
        }
        return false;
    }

    private PartialInputStream openDexInsideOdex(FileInputStream fileInputStream) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        FileChannel channel = fileInputStream.getChannel();
        channel.position(8);
        allocate.order(ByteOrder.nativeOrder());
        if (channel.read(allocate) == 8) {
            boolean z = false;
            allocate.position(0);
            int i = allocate.getInt();
            int i2 = allocate.getInt();
            Mlog.safeFmt("dexOffset:%s dexLength:%s", Integer.valueOf(i), Integer.valueOf(i2));
            boolean z2 = false;
            if (i <= 0) {
                z2 = true;
            }
            if (i2 <= 0) {
                z = true;
            }
            if (!z && !z2) {
                channel.position((long) i);
                return new PartialInputStream(fileInputStream, i2);
            }
        }
        throw new IllegalArgumentException("invalid odex file");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:39|40|41|42|43) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|51) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x010d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0114 */
    private void optimize1(DexStore dexStore, File file, DexStore.OptimizationSession optimizationSession, DexStore.OptimizationSession.Job job, DexOptRunner dexOptRunner, DexToOptimize dexToOptimize, File[] fileArr, byte[] bArr) {
        DexStore.OptimizationSession.Job job2 = job;
        job2.startOptimizing();
        String[] strArr = this.expectedFiles;
        DexToOptimize dexToOptimize2 = dexToOptimize;
        int i = dexToOptimize2.dexNr << 1;
        String str = strArr[i + 0];
        String str2 = strArr[i + 1];
        File file2 = new File(file, str2);
        DexStore dexStore2 = dexStore;
        File file3 = new File(dexStore2.root, str);
        File file4 = new File(dexStore2.root, str2);
        Mlog.safeFmt("[opt] started optimizing %s -> %s", file3, file4);
        int length = fileArr.length;
        String[] strArr2 = new String[(((length / 2) + (this.expectedFiles.length / 2)) - 1)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            strArr2[i3] = fileArr[i2].getPath();
            i2 += 2;
            i3++;
        }
        int i4 = 0;
        while (true) {
            String[] strArr3 = this.expectedFiles;
            if (i4 >= strArr3.length) {
                break;
            }
            if ((i4 >> 1) != dexToOptimize2.dexNr) {
                strArr2[i3] = new File(dexStore2.root, strArr3[i4]).getPath();
                i3++;
            }
            i4 += 2;
        }
        boolean z = false;
        if (i3 == strArr2.length) {
            z = true;
        }
        Mlog.assertThat(z, "accounted for all dex files", new Object[0]);
        FileInputStream fileInputStream = new FileInputStream(file4);
        PartialInputStream openDexInsideOdex = openDexInsideOdex(fileInputStream);
        int available = openDexInsideOdex.available();
        if (available <= 1) {
            available = -1;
        }
        Mlog.safeFmt("[opt] size hint for %s: %s", file4, Integer.valueOf(available));
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            dexOptRunner.run(openDexInsideOdex, available, str, randomAccessFile, "xdex", strArr2);
            int fileno = C0024Fd.fileno(randomAccessFile.getFD());
            DalvikInternals.replaceOdexDepBlock(fileno, bArr);
            DalvikInternals.fsync(fileno, optimizationSession.config.prio.ioPriority);
            C0015Fs.tryDiscardPageCache(fileno);
            randomAccessFile.close();
            openDexInsideOdex.close();
            fileInputStream.close();
            long startCommitting = job2.startCommitting(0) | (16 << dexToOptimize2.dexNr);
            Mlog.safeFmt("[opt] started commit", new Object[0]);
            C0015Fs.renameOrThrow(file2, file4);
            job2.finishCommit(startCommitting);
            Mlog.safeFmt("[opt] finished commit", new Object[0]);
            return;
        } catch (Throwable th) {
            C0015Fs.deleteRecursive(file2);
            throw th;
        }
        try {
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
        try {
        } catch (Throwable th3) {
            openDexInsideOdex.close();
            throw th3;
        }
    }

    public OdexScheme.NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        boolean z = true;
        long length = (long) ((1 << this.mDexes.length) - 1);
        long j2 = j >> 4;
        Mlog.safeFmt("expectedDexBits:0x%08x actualDexBits:0x%08x", Long.valueOf(length), Long.valueOf(j2));
        if (length == j2) {
            z = false;
        }
        return OdexScheme.NeedOptimizationState.shouldOptimize(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00ac */
    public void optimize(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession) {
        DexOptRunner dexOptRunner;
        DexToOptimize findDexToOptimize;
        DexStore dexStore2 = dexStore;
        File[] dependencyOdexFiles = dexStore2.getDependencyOdexFiles();
        byte[] readOdexDepBlock = DalvikInternals.readOdexDepBlock(dexStore2.getOdexCachePath());
        DexStore.TmpDir makeTemporaryDirectory = dexStore2.makeTemporaryDirectory("dexopt");
        Mlog.safeFmt("[opt] opened tmpDir %s", makeTemporaryDirectory.directory);
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        boolean z = false;
        if ((optimizationSession2.config.flags & 1) != 0) {
            z = true;
        }
        if (z) {
            dexOptRunner = new PoliteDexOptRunner(optimizationSession2, makeTemporaryDirectory.directory);
        } else {
            dexOptRunner = new OdexSchemeTurbo.TurboDexOptRunner(optimizationSession2.dexStoreConfig, makeTemporaryDirectory.directory);
        }
        boolean z2 = false;
        do {
            Mlog.safeFmt("[opt] starting optimization pass; creating job", new Object[0]);
            DexStore.OptimizationSession.Job job = new DexStore.OptimizationSession.Job();
            Mlog.safeFmt("[opt] opened job", new Object[0]);
            if (!z2) {
                prepareTmpDirForXdex(dependencyOdexFiles, dexStore2, makeTemporaryDirectory.directory);
                z2 = true;
            }
            findDexToOptimize = findDexToOptimize(dexStore2, job.initialStatus);
            Mlog.safeFmt("[opt] dto %s", findDexToOptimize);
            if (findDexToOptimize != null) {
                try {
                    optimize1(dexStore2, makeTemporaryDirectory.directory, optimizationSession2, job, dexOptRunner, findDexToOptimize, dependencyOdexFiles, readOdexDepBlock);
                } catch (DexOptRunner.DexOptException e) {
                    if (C0015Fs.isKernelPageCacheFlushIsBroken || !isFileCorruptionException(e)) {
                        throw e;
                    }
                    Mlog.m35w("detected odex file corruption: trying again with kernel workaround", new Object[0]);
                    C0015Fs.isKernelPageCacheFlushIsBroken = true;
                } catch (Throwable th) {
                    findDexToOptimize.close();
                    throw th;
                }
                findDexToOptimize.close();
            }
            job.close();
        } while (findDexToOptimize != null);
        dexOptRunner.cleanup();
        Mlog.safeFmt("[opt] optimization complete", new Object[0]);
        makeTemporaryDirectory.close();
        return;
        try {
        } catch (Throwable th2) {
            if (makeTemporaryDirectory != null) {
                try {
                    makeTemporaryDirectory.close();
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }

    private void makeFakeCacheSymlink(File file, File file2, File file3) {
        String str;
        if (!file2.exists()) {
            throw new IllegalStateException("expected file to exist: " + file2);
        } else if (file3.exists()) {
            if (file2.getPath().endsWith(".jar")) {
                str = "classes.dex";
            } else {
                str = null;
            }
            File dexOptGenerateCacheFileName = C0015Fs.dexOptGenerateCacheFileName(file, file2, str);
            Mlog.safeFmt("[opt] symlink %s -> %s", dexOptGenerateCacheFileName, file3);
            C0015Fs.symlink(file3, dexOptGenerateCacheFileName);
        } else {
            throw new IllegalStateException("expected file to exist: " + file3);
        }
    }

    private void prepareTmpDirForXdex(File[] fileArr, DexStore dexStore, File file) {
        int i;
        String str;
        File findSystemDalvikCache = C0015Fs.findSystemDalvikCache();
        File file2 = new File(file, "dalvik-cache");
        C0015Fs.mkdirOrThrow(file2);
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        simpleStringSplitter.setString(System.getenv("BOOTCLASSPATH"));
        Iterator<String> it = simpleStringSplitter.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.length() != 0) {
                if (next.endsWith(".jar")) {
                    str = "classes.dex";
                } else {
                    str = null;
                }
                File file3 = new File(next);
                File dexOptGenerateCacheFileName = C0015Fs.dexOptGenerateCacheFileName(file2, file3, str);
                File dexOptGenerateCacheFileName2 = C0015Fs.dexOptGenerateCacheFileName(findSystemDalvikCache, file3, str);
                Mlog.safeFmt("[opt] symlink %s -> %s", dexOptGenerateCacheFileName, dexOptGenerateCacheFileName2);
                C0015Fs.symlink(dexOptGenerateCacheFileName2, dexOptGenerateCacheFileName);
            }
        }
        for (int i2 = 0; i2 < fileArr.length; i2 += 2) {
            makeFakeCacheSymlink(file2, fileArr[i2], fileArr[i2 + 1]);
        }
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i < strArr.length) {
                makeFakeCacheSymlink(file2, new File(dexStore.root, strArr[i]), new File(dexStore.root, this.expectedFiles[i + 1]));
                i += 2;
            } else {
                return;
            }
        }
    }
}
