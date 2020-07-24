package p000X;

import android.os.Build;
import android.util.Pair;
import com.facebook.common.errorreporting.memory.heapsanitizer.HeapSanitizer;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BSW */
public final class BSW implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C25628BSj A01;
    public final /* synthetic */ BSZ A02;
    public final /* synthetic */ C2095190p A03;

    public BSW(BSZ bsz, int i, C25628BSj bSj, C2095190p r4) {
        this.A02 = bsz;
        this.A00 = i;
        this.A01 = bSj;
        this.A03 = r4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:109|110|111|112|113) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:117|118|119|120|121) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x02c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x02cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x02d2 */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0318 A[SYNTHETIC, Splitter:B:151:0x0318] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0330 A[SYNTHETIC, Splitter:B:157:0x0330] */
    public final void run() {
        C25621BSc A05;
        C25619BSa A002;
        File file;
        File file2;
        File file3;
        String str;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        String str2;
        try {
            this.A01.A01 = true;
            A05 = AnonymousClass184.A00().A05();
            A002 = AnonymousClass184.A00().A09().A00.A00();
            if (A002 != null && !A002.A00) {
                file = null;
                try {
                    file2 = new File(A002.A04);
                    try {
                        if (!file2.exists()) {
                            C25621BSc.A01("DumpNotFound", AnonymousClass000.A0E("File didn't exist - ", A002.A04), (Throwable) null);
                            A002.A00 = true;
                            AnonymousClass184.A00().A09().A00(A002);
                        } else if (!file2.canRead()) {
                            C25621BSc.A01("DumpNotReadable", "File is not readable", (Throwable) null);
                            A002.A00 = true;
                            AnonymousClass184.A00().A09().A00(A002);
                        } else {
                            file3 = new File(AnonymousClass000.A0E(file2.getPath(), ".gz"));
                            if (AnonymousClass184.A00().A04().A02()) {
                                AnonymousClass184 A003 = AnonymousClass184.A00();
                                synchronized (A003) {
                                    try {
                                        if (A003.A00 == null && A003.A0E != null) {
                                            AnonymousClass0ZL.A01("MemoryManager.getHprofFileSanitizer", -1032081470);
                                            A003.A00 = (HeapSanitizer) A003.A0D.get();
                                            AnonymousClass0ZL.A00(1919573225);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                    try {
                                    } catch (Exception e) {
                                        C25621BSc.A01("Sanitization", "Sanitization failed", e);
                                        A002.A00 = true;
                                        AnonymousClass184.A00().A09().A00(A002);
                                    }
                                }
                                String canonicalPath = file2.getCanonicalPath();
                                if (!HeapSanitizer.sInit) {
                                    synchronized (HeapSanitizer.class) {
                                        try {
                                            if (!HeapSanitizer.sInit) {
                                                AnonymousClass0Y1.A08("hprofsanitizer");
                                                HeapSanitizer.sInit = true;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    }
                                }
                                String nativeSanitizeHprof = HeapSanitizer.nativeSanitizeHprof(canonicalPath);
                                if (nativeSanitizeHprof.length() <= 0) {
                                    str = "Success";
                                } else {
                                    throw new IOException(AnonymousClass000.A0E("hprofsanitizer: ", nativeSanitizeHprof));
                                }
                            } else {
                                str = "Disabled";
                            }
                            try {
                                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    gZIPOutputStream.write(bArr, 0, read);
                                }
                                gZIPOutputStream.flush();
                                gZIPOutputStream.close();
                                bufferedOutputStream.close();
                                bufferedInputStream.close();
                                try {
                                    ArrayList<Pair> arrayList = new ArrayList<>();
                                    String str3 = A002.A05;
                                    String $const$string = AnonymousClass0C5.$const$string(231);
                                    arrayList.add(new Pair($const$string, str3));
                                    arrayList.add(new Pair("crash_id", A002.A03));
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("dump_id", A002.A03).put(AnonymousClass0C5.$const$string(218), A002.A02).put("maximum_heap_size", Runtime.getRuntime().maxMemory()).put(AnonymousClass0C5.$const$string(254), A002.A01).put("was_ever_foregrounded", A002.A09).put(AnonymousClass0C5.$const$string(230), A002.A04).put("uid", A002.A08).put($const$string, A002.A05);
                                        str2 = jSONObject.put(C193418Ps.$const$string(83), A05.A02.A05).put(C193418Ps.$const$string(82), A05.A02.A00).put("app", A05.A02.A02).put("app_id", A05.A02.A01).put(AnonymousClass0C5.$const$string(277), A05.A02.A04).put("brand", Build.BRAND).put("model", Build.MODEL).put(AnonymousClass0C5.$const$string(58), Build.VERSION.RELEASE).put("memclass", A05.A02.A03).put("hprof_sanitizer_failure_reason", str).toString();
                                    } catch (JSONException e2) {
                                        C25621BSc.A01("getUploadParams", "Failed to get extras from item", e2);
                                        str2 = "{}";
                                    }
                                    arrayList.add(new Pair(B5B.INTENT_PARAM_EXTRAS, str2));
                                    String str4 = A05.A03;
                                    C486028s r12 = new C486028s();
                                    r12.A07(str4);
                                    r12.A05(Constants.ONE);
                                    String str5 = "";
                                    r12.A06(AnonymousClass000.A0N(str5, "567067343352427", "|", AnonymousClass0C5.$const$string(226)));
                                    r12.A04(AnonymousClass0Jh.class);
                                    r12.A03(file3);
                                    for (Pair pair : arrayList) {
                                        r12.A09((String) pair.first, (String) pair.second);
                                    }
                                    AnonymousClass0Ji r13 = (AnonymousClass0Ji) r12.A02();
                                    C25627BSi bSi = new C25627BSi(r13.isOk(), "Status: " + r13.getStatusCode() + " success: " + r13.A00);
                                    boolean z = bSi.A01;
                                    if (!z) {
                                        String str6 = bSi.A00;
                                        if (str6 != null) {
                                            str5 = "success - " + z + ", message - " + str6;
                                        }
                                        C25621BSc.A01("FailedRequest", str5, (Throwable) null);
                                    }
                                } catch (IOException e3) {
                                    throw e3;
                                } catch (Exception e4) {
                                    throw new RuntimeException(e4);
                                } catch (Exception e5) {
                                    C25621BSc.A01("Upload", "Upload failed", e5);
                                }
                                A002.A00 = true;
                                AnonymousClass184.A00().A09().A00(A002);
                            } catch (Exception e6) {
                                C25621BSc.A01("Gzip", "Gzip Failed", e6);
                                A002.A00 = true;
                                AnonymousClass184.A00().A09().A00(A002);
                            } catch (Throwable ) {
                                throw th;
                            }
                            file2.delete();
                            file3.delete();
                        }
                        file2.delete();
                    } catch (Throwable th3) {
                        th = th3;
                        C25621BSc.A01("uploadProcedure", "Failed uploading file", th);
                        if (th instanceof Error) {
                            A002.A00 = true;
                            AnonymousClass184.A00().A09().A00(A002);
                            if (file2 != null) {
                                file2.delete();
                            }
                            if (file != null) {
                                file.delete();
                            }
                            C191538Gv.A00(A05.A01);
                            this.A03.B8Z(false);
                            BSZ.A00.remove(this.A00);
                            return;
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    file2 = null;
                    C25621BSc.A01("uploadProcedure", "Failed uploading file", th);
                    if (th instanceof Error) {
                    }
                }
            }
        } catch (Throwable th5) {
            try {
                AnonymousClass184.A00().A08().A00("DumpUploadJob", "UncaughtError uploading dump", th5);
            } catch (Throwable th6) {
                this.A03.B8Z(false);
                BSZ.A00.remove(this.A00);
                throw th6;
            }
        }
        C191538Gv.A00(A05.A01);
        this.A03.B8Z(false);
        BSZ.A00.remove(this.A00);
        return;
        try {
        } catch (Throwable th7) {
            bufferedOutputStream.close();
            throw th7;
        }
        try {
        } catch (Throwable th8) {
            bufferedInputStream.close();
            throw th8;
        }
    }
}
