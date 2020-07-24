package com.instagram.debug.memorydump;

import android.content.Context;
import android.os.StatFs;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import p000X.AnonymousClass000;
import p000X.C06360Ot;

public class MemoryDumpFileManager {
    public static final int BUFFER_SIZE_BYTES = 8192;
    public static final String DUMP_GENERIC_PATTERN = "dump_%s_([0-9]*_[^_]*)\\.hprof.*";
    public static final Pattern FILENAME_PATTERN = Pattern.compile("dump_[a-z]*_([0-9]*_[^_]*)\\.hprof.*");
    public static final int FREE_SPACE_MEMORY_MULTIPLIER = 3;
    public static final String HPROF_DIR = "hprof";
    public static final Class TAG = MemoryDumpFileManager.class;
    public final Context mApplicationContext;
    public String mUserId;

    private String getInternalCacheDirectory() {
        return this.mApplicationContext.getCacheDir().getPath();
    }

    public File[] findDumps(String str) {
        return new File(str).listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return MemoryDumpFileManager.FILENAME_PATTERN.matcher(str).matches();
            }
        });
    }

    public void gzipFile(File file, File file2) {
        GZIPOutputStream gZIPOutputStream;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.flush();
                        gZIPOutputStream.close();
                        bufferedOutputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } finally {
            bufferedInputStream.close();
        }
    }

    public MemoryDumpFileManager(Context context, String str) {
        this.mApplicationContext = context.getApplicationContext();
        this.mUserId = str;
    }

    public static MemoryDumpType parseDumpType(String str) {
        for (MemoryDumpType memoryDumpType : MemoryDumpType.values()) {
            if (Pattern.compile(C06360Ot.formatString(DUMP_GENERIC_PATTERN, memoryDumpType.getPatternPrefix())).matcher(str).matches()) {
                return memoryDumpType;
            }
        }
        return MemoryDumpType.CRASH;
    }

    public String getHprofDirectory() {
        return AnonymousClass000.A0O(getInternalCacheDirectory(), "/", "hprof", "_", this.mUserId);
    }

    public boolean hasFreeSpace() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        StatFs statFs = new StatFs(getInternalCacheDirectory());
        if (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() > maxMemory * 3) {
            return true;
        }
        return false;
    }

    public boolean hasFreeSpaceDebugMode() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        StatFs statFs = new StatFs(getInternalCacheDirectory());
        if (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() > maxMemory) {
            return true;
        }
        return false;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }
}
