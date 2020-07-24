package com.facebook.common.dextricks;

import android.os.Build;
import android.util.Log;
import com.facebook.forker.C0024Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000X.AnonymousClass000;

public abstract class LogcatReader {
    public static final int DEFAULT_WAIT_TIME = 10000;
    public static final int GROUP_IDX_PID = 4;
    public static final int GROUP_IDX_TAG = 5;
    public static final int GROUP_IDX_TIMESTAMP = 1;
    public static final int GROUP_IDX_YEAR = 3;
    public static final Pattern LOGCAT_INFO_PARSER = Pattern.compile("^(((\\d{4})-)?\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3})\\s+(\\d+)\\s+\\d+\\s\\w\\s(\\w+)\\s:.*");
    public static final boolean MUST_PARSE_PID;
    public static final String TAG = "LogcatReader";
    public final String mTag;
    public final File mTmpDir;

    public static boolean shouldProcess(int i, String str, String str2) {
        if (str2 != null) {
            if (!MUST_PARSE_PID) {
                return true;
            }
            Matcher matcher = LOGCAT_INFO_PARSER.matcher(str2);
            if (matcher == null || !matcher.matches()) {
                String.format("Logcat line is not in the expected form. Line: %s", new Object[]{str2});
                return false;
            }
            String group = matcher.group(4);
            if (matcher.group(5).equals(str)) {
                try {
                    if (Integer.parseInt(group) == i) {
                        return true;
                    }
                } catch (NumberFormatException e) {
                    Log.w(TAG, String.format("Could not process line since %s is not a number", new Object[]{group}), e);
                    return false;
                }
            }
        }
        return false;
    }

    public abstract void processLine(String str);

    public abstract void reset();

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 24) {
            z = true;
        }
        MUST_PARSE_PID = z;
    }

    public LogcatReader(String str, File file) {
        this.mTag = str;
        this.mTmpDir = file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    private boolean readAndParseProcessFile(int i, RandomAccessFile randomAccessFile) {
        BufferedReader bufferedReader;
        String readProgramOutputFile = C0015Fs.readProgramOutputFile(randomAccessFile);
        boolean z = false;
        if (readProgramOutputFile == null) {
            Log.w(TAG, "Cannot find logcat file to parse");
            return false;
        }
        try {
            bufferedReader = new BufferedReader(new StringReader(readProgramOutputFile));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (shouldProcess(i, this.mTag, readLine)) {
                        processLine(readLine);
                    }
                    z = true;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
            if (!z) {
                Log.w(TAG, AnonymousClass000.A0E("Could not read out any logs. \n Read: ", readProgramOutputFile));
            }
            bufferedReader.close();
            return true;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            if (bufferedReader != null) {
            }
            throw th;
        }
    }

    public final boolean readAndParseProcess(int i) {
        return readAndParseProcess(i, 10000);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.facebook.forker.Process} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.facebook.forker.Process} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0104  */
    public final boolean readAndParseProcess(int i, int i2) {
        String str;
        Process process;
        Process process2;
        int i3;
        reset();
        ProcessBuilder processBuilder = new ProcessBuilder("/system/bin/logcat", "-v", "threadtime");
        processBuilder.mArgv.add("-d");
        if (!MUST_PARSE_PID) {
            str = AnonymousClass000.A05("--pid=", i);
        } else {
            str = "-s";
        }
        processBuilder.mArgv.add(str);
        processBuilder.mArgv.add(String.format("%s:V", new Object[]{this.mTag}));
        Process process3 = null;
        try {
            RandomAccessFile openUnlinkedTemporaryFile = C0015Fs.openUnlinkedTemporaryFile(this.mTmpDir);
            try {
                processBuilder.mStreamDispositions[1] = C0024Fd.fileno(openUnlinkedTemporaryFile.getFD());
                String.format("Start executing logcat process: %s", new Object[]{processBuilder.toString()});
                process3 = processBuilder.create();
                long currentTimeMillis = System.currentTimeMillis();
                String.format("Start waiting for logcat %s process parsing", new Object[]{this.mTag});
                int i4 = i2;
                if (i2 > 0) {
                    i3 = process3.waitFor(i4, 4);
                } else {
                    i3 = process3.waitFor();
                }
                boolean z = false;
                if (i3 == Integer.MIN_VALUE) {
                    z = true;
                }
                Object[] objArr = new Object[4];
                objArr[0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                objArr[1] = this.mTag;
                objArr[2] = Integer.valueOf(i3);
                objArr[3] = z ? "Timed out" : "Did not timeout";
                String.format("Finished waiting (%d ms) for logcat %s process parsing . Status %d - %s", objArr);
                if (z) {
                    Log.w(TAG, String.format("Failed to run logcat for %s because we timed out", new Object[]{this.mTag}));
                    C0015Fs.safeClose((Closeable) openUnlinkedTemporaryFile);
                    if (process3 != null) {
                        process3.destroy();
                        return false;
                    }
                    return false;
                }
                boolean readAndParseProcessFile = readAndParseProcessFile(i, openUnlinkedTemporaryFile);
                C0015Fs.safeClose((Closeable) openUnlinkedTemporaryFile);
                if (process3 != null) {
                    process3.destroy();
                }
                return readAndParseProcessFile;
            } catch (IOException | InterruptedException e) {
                e = e;
                process2 = process3;
                process3 = openUnlinkedTemporaryFile;
                try {
                    Log.w(TAG, String.format("Failed to run logcat for tag %s", new Object[]{this.mTag}), e);
                    C0015Fs.safeClose((Closeable) process3);
                    if (process2 != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    process = process3;
                    process3 = process2;
                    C0015Fs.safeClose((Closeable) process);
                    if (process3 != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                process = openUnlinkedTemporaryFile;
                C0015Fs.safeClose((Closeable) process);
                if (process3 != null) {
                }
                throw th;
            }
        } catch (IOException | InterruptedException e2) {
            e = e2;
            process2 = null;
            Log.w(TAG, String.format("Failed to run logcat for tag %s", new Object[]{this.mTag}), e);
            C0015Fs.safeClose((Closeable) process3);
            if (process2 != null) {
                process2.destroy();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            process = null;
            C0015Fs.safeClose((Closeable) process);
            if (process3 != null) {
                process3.destroy();
            }
            throw th;
        }
    }
}
