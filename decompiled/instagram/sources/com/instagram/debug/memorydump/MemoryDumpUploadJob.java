package com.instagram.debug.memorydump;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import java.io.File;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass40t;
import p000X.B5B;
import p000X.C05750Lu;
import p000X.C06360Ot;
import p000X.C06630Pu;
import p000X.C12810hQ;
import p000X.C17850qu;
import p000X.C17860qv;
import p000X.C17920r1;
import p000X.C2095190p;
import p000X.C24842AuX;
import p000X.C486028s;

public class MemoryDumpUploadJob extends C24842AuX {
    public static final String EXTRA_FILE_PATH = "dump_file_path";
    public static final String EXTRA_USER_ID = "user_id";
    public static final Class TAG = MemoryDumpUploadJob.class;
    public final ActivityManager mActivityManager;
    public final Context mContext;
    public final SharedPreferences mSharedPrefMap = C05750Lu.A00(MemoryDumpCreator.LEAK_SHARED_PREF_NAME);

    public boolean onStopJob(int i) {
        return false;
    }

    private void clearOutOldDumps(MemoryDumpFileManager memoryDumpFileManager) {
        File[] findDumps = memoryDumpFileManager.findDumps(this.mContext.getCacheDir().getPath());
        if (findDumps != null && (r2 = findDumps.length) > 0) {
            for (File file : findDumps) {
                file.delete();
                removeEntry(this, getCrashId(file.getName()));
            }
        }
    }

    private String getCrashId(String str) {
        Matcher matcher = MemoryDumpFileManager.FILENAME_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return "";
    }

    private String getExtras(String str, String str2, MemoryDumpType memoryDumpType) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_version_code", C06630Pu.A00(this.mContext));
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("memclass", this.mActivityManager.getMemoryClass());
            jSONObject.put("model", Build.MODEL);
            jSONObject.put(AnonymousClass0C5.$const$string(58), Build.VERSION.RELEASE);
            jSONObject.put("app_version_name", C06630Pu.A01(this.mContext));
            jSONObject.put("app", "Instagram");
            jSONObject.put(AnonymousClass0C5.$const$string(277), "Main Process");
            jSONObject.put("uid", str2);
            if (memoryDumpType == MemoryDumpType.CRASH) {
                str3 = "java.lang.OutOfMemoryError";
            } else if (memoryDumpType == MemoryDumpType.LEAK) {
                str3 = AnonymousClass000.A0E("IG_Leak:", retrieveMapEntry(str));
            } else if (memoryDumpType == MemoryDumpType.DAILY) {
                str3 = "daily";
            } else {
                str3 = "unknown";
                AnonymousClass0QD.A02(TAG.getSimpleName(), "unknown dump cause");
            }
            jSONObject.put(AnonymousClass0C5.$const$string(218), str3);
            return jSONObject.toString();
        } catch (JSONException e) {
            return C06360Ot.A05(AnonymousClass40t.$const$string(311), e.getMessage());
        }
    }

    public static void removeEntry(MemoryDumpUploadJob memoryDumpUploadJob, String str) {
        memoryDumpUploadJob.mSharedPrefMap.edit().remove(str).apply();
    }

    private String retrieveMapEntry(String str) {
        return this.mSharedPrefMap.getString(str, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    public void doWork(String str, String str2) {
        MemoryDumpFileManager memoryDumpFileManager = new MemoryDumpFileManager(this.mContext, str);
        clearOutOldDumps(memoryDumpFileManager);
        File file = new File(str2);
        if (file.exists()) {
            File file2 = null;
            try {
                File file3 = new File(C06360Ot.formatString("%s.gz", file.getPath()));
                try {
                    System.currentTimeMillis();
                    memoryDumpFileManager.gzipFile(file, file3);
                    System.currentTimeMillis();
                    MemoryDumpType parseDumpType = MemoryDumpFileManager.parseDumpType(file.getName());
                    final String crashId = getCrashId(file.getName());
                    C486028s r5 = new C486028s();
                    r5.A05 = "app/hprof";
                    r5.A03 = C06360Ot.formatString("%s|%s", "567067343352427", AnonymousClass0C5.$const$string(226));
                    r5.A02 = Constants.ONE;
                    r5.A09(AnonymousClass0C5.$const$string(231), "5");
                    r5.A09("crash_id", crashId);
                    r5.A09(B5B.INTENT_PARAM_EXTRAS, getExtras(crashId, str, parseDumpType));
                    r5.A08("file", file3, "application/octet-stream");
                    r5.A04(MemoryDumpUploadResponse__JsonHelper.class);
                    C17850qu A01 = r5.A01();
                    A01.A00 = new C17920r1() {
                        public void onFinish() {
                            int A03 = AnonymousClass0Z0.A03(127922012);
                            super.onFinish();
                            MemoryDumpUploadJob.removeEntry(MemoryDumpUploadJob.this, crashId);
                            AnonymousClass0Z0.A0A(1374482778, A03);
                        }
                    };
                    C12810hQ.A01(A01);
                    file.delete();
                    file3.delete();
                } catch (Exception e) {
                    e = e;
                    file2 = file3;
                    try {
                        AnonymousClass0DB.A06(TAG, "Error uploading hprof file: ", e);
                        file.delete();
                        if (file2 == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        file3 = file2;
                        file.delete();
                        if (file3 != null) {
                            file3.delete();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    file.delete();
                    if (file3 != null) {
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                AnonymousClass0DB.A06(TAG, "Error uploading hprof file: ", e);
                file.delete();
                if (file2 == null) {
                    file2.delete();
                }
            }
        }
    }

    public boolean onStartJob(int i, Bundle bundle, final C2095190p r8) {
        final String string = bundle.getString(EXTRA_USER_ID);
        final String string2 = bundle.getString(EXTRA_FILE_PATH);
        AnonymousClass0a4.A06(string);
        AnonymousClass0a4.A06(string2);
        C12810hQ.A03(new C17860qv() {
            public String getName() {
                return "MemoryDump";
            }

            public int getRunnableId() {
                return 225;
            }

            public void onStart() {
            }

            public void onFinish() {
                r8.B8Z(false);
            }

            public void run() {
                MemoryDumpUploadJob.this.doWork(string, string2);
            }
        }, 225, 5, true, false);
        return true;
    }

    public MemoryDumpUploadJob(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mActivityManager = (ActivityManager) applicationContext.getSystemService("activity");
    }
}
