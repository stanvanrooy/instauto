package com.facebook.common.dextricks;

import android.text.TextUtils;
import com.facebook.forker.C0024Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Y1;
import p000X.C03960Bo;

public class DexOptRunner {
    public final ProcessBuilder mTemplate;
    public final File mTmpDir;
    public File mTmpFbDexOpt = null;

    public class DexOptException extends RuntimeException {
        public final String errout;
        public final int status;

        public DexOptException(int i, String str) {
            super(AnonymousClass000.A0O("dexopt failed with status ", Process.describeStatus(i), ": [", str, "]"));
            this.status = i;
            this.errout = str;
        }
    }

    public void addDexOptOptions(ProcessBuilder processBuilder) {
    }

    public boolean attemptAllocate(int i, long j) {
        return DalvikInternals.attemptAllocate(i, j, -1);
    }

    public void cleanup() {
        if (this.mTmpFbDexOpt != null) {
            try {
                Mlog.safeFmt("Cleaning up temporary fbdexopt", new Object[0]);
                C0015Fs.deleteRecursive(this.mTmpFbDexOpt);
            } catch (IOException unused) {
                Mlog.m35w("Unable to delete temporary fbdexopt", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003e */
    public DexOptRunner(File file) {
        File file2;
        FileOutputStream fileOutputStream;
        this.mTmpDir = file;
        File A01 = AnonymousClass0Y1.A01("fbdexopt");
        if (!A01.canExecute()) {
            file2 = File.createTempFile("fbdexopt", (String) null, file);
            this.mTmpFbDexOpt = file2;
            fileOutputStream = new FileOutputStream(file2);
            FileInputStream fileInputStream = new FileInputStream(A01);
            C03960Bo.A01(fileOutputStream, fileInputStream, Integer.MAX_VALUE);
            fileOutputStream.flush();
            fileInputStream.close();
            fileOutputStream.close();
            file2.setExecutable(true, true);
        } else {
            file2 = A01;
        }
        ProcessBuilder processBuilder = new ProcessBuilder(file2.getAbsolutePath(), new String[0]);
        processBuilder.setenv("LD_LIBRARY_PATH", AnonymousClass0Y1.A02());
        processBuilder.mTmpDir = file;
        this.mTemplate = processBuilder;
        return;
        try {
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
        return C03960Bo.A04(randomAccessFile, inputStream, new byte[DexStore.LOAD_RESULT_PGO]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0104, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0108, code lost:
        throw r0;
     */
    public final void run(InputStream inputStream, int i, String str, RandomAccessFile randomAccessFile, String str2, String[] strArr) {
        String str3;
        Object[] objArr;
        String str4;
        boolean z = false;
        if (randomAccessFile.getFilePointer() == 0) {
            z = true;
        }
        Mlog.assertThat(z, "odex fpos must be 0", new Object[0]);
        boolean z2 = false;
        if (randomAccessFile.length() == 0) {
            z2 = true;
        }
        Mlog.assertThat(z2, "odex must be empty", new Object[0]);
        int fileno = C0024Fd.fileno(randomAccessFile.getFD());
        DalvikInternals.dexOptCreateEmptyHeader(fileno);
        int filePointer = (int) randomAccessFile.getFilePointer();
        if (i > 1) {
            if (DalvikInternals.attemptAllocate(fileno, randomAccessFile.getFilePointer() + ((long) i), -1)) {
                objArr = new Object[]{Integer.valueOf(i)};
                str4 = "allocated more %s bytes for dex content";
            } else {
                objArr = new Object[0];
                str4 = "unable to preallocate on this system";
            }
            Mlog.safeFmt(str4, objArr);
        }
        int copyDexToOdex = copyDexToOdex(inputStream, i, randomAccessFile);
        if (copyDexToOdex != Integer.MAX_VALUE) {
            Mlog.safeFmt("wrote %s bytes to dex %s", Integer.valueOf(copyDexToOdex), str);
            RandomAccessFile openUnlinkedTemporaryFile = C0015Fs.openUnlinkedTemporaryFile(this.mTmpDir);
            ProcessBuilder clone = this.mTemplate.clone();
            int fileno2 = C0024Fd.fileno(openUnlinkedTemporaryFile.getFD());
            int[] iArr = clone.mStreamDispositions;
            iArr[1] = fileno2;
            iArr[2] = -5;
            clone.setFdCloseOnExec(fileno, false);
            addDexOptOptions(clone);
            String[] strArr2 = new String[10];
            strArr2[0] = "--";
            strArr2[1] = Integer.toString(fileno);
            strArr2[2] = str;
            String num = Integer.toString(0);
            strArr2[3] = num;
            strArr2[4] = num;
            strArr2[5] = System.getenv("BOOTCLASSPATH");
            String[] strArr3 = strArr;
            if (strArr == null) {
                str3 = "";
            } else {
                str3 = TextUtils.join(":", strArr3);
            }
            strArr2[6] = str3;
            strArr2[7] = Long.toString((long) filePointer);
            strArr2[8] = Long.toString((long) copyDexToOdex);
            strArr2[9] = str2;
            clone.addArguments(strArr2);
            Process startSubprocess = startSubprocess(clone);
            try {
                waitForDexOpt(startSubprocess, fileno);
                int exitValueEx = startSubprocess.exitValueEx();
                if (exitValueEx == 0) {
                    openUnlinkedTemporaryFile.close();
                    return;
                }
                throw new DexOptException(exitValueEx, C0015Fs.readProgramOutputFile(openUnlinkedTemporaryFile));
            } finally {
                startSubprocess.destroy();
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A0E("refusing to deal with impossibly huge dex file ", str));
        }
    }

    public Process startSubprocess(ProcessBuilder processBuilder) {
        return processBuilder.create();
    }

    public void waitForDexOpt(Process process, int i) {
        process.waitForUninterruptibly();
    }
}
