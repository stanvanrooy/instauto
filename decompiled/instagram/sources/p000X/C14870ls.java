package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.zstd.ZstdInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.0ls  reason: invalid class name and case insensitive filesystem */
public final class C14870ls implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14650lH A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C14870ls(C14650lH r1, int i, String str, String str2, Integer num, Integer num2) {
        this.A01 = r1;
        this.A00 = i;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = num;
        this.A03 = num2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: android.util.JsonReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.0lx} */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:116|(2:229|230)|(1:232)|233|234|235|236) */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e0, code lost:
        if (android.text.TextUtils.isEmpty(r15) != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fd, code lost:
        if (android.text.TextUtils.isEmpty(r15) != false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x021e, code lost:
        if (r15.intValue() <= 0) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023f, code lost:
        if (android.text.TextUtils.isEmpty(r15) != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025e, code lost:
        if (android.text.TextUtils.isEmpty(r15) != false) goto L_0x0260;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:233:0x051c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:235:0x051d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02ca A[SYNTHETIC, Splitter:B:130:0x02ca] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02cf A[Catch:{ IOException -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d8 A[SYNTHETIC, Splitter:B:138:0x02d8] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03c8 A[SYNTHETIC, Splitter:B:178:0x03c8] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0503 A[SYNTHETIC, Splitter:B:221:0x0503] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0514 A[SYNTHETIC, Splitter:B:229:0x0514] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0519 A[Catch:{ IOException -> 0x051c }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:127:0x02c1=Splitter:B:127:0x02c1, B:123:0x02b6=Splitter:B:123:0x02b6} */
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        AnonymousClass1CA r8;
        JsonReader jsonReader;
        C46051z3 r2;
        String str2;
        File file;
        File file2;
        InputStream r82;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C14770lU r9 = this.A01.A02;
        int i = this.A00;
        String str3 = this.A05;
        String str4 = this.A04;
        Integer num = this.A02;
        Integer num2 = this.A03;
        if (str3 == null || str4 == null) {
            throw new C46051z3("Empty resource name or flavor name");
        }
        C14900lv r0 = new C14900lv();
        r0.A05 = str3;
        r0.A04 = str4;
        r0.A00 = i;
        C14910lx r7 = new C14910lx(r0);
        C14930lz AAe = r9.A03.AAe(r7);
        String A002 = AnonymousClass414.A00(num);
        if (num == Constants.ONE || num == Constants.A0C) {
            A002 = AnonymousClass414.A00(Constants.ZERO);
        }
        switch (num2.intValue()) {
            case 1:
                str = "PREFETCH_CURRENT";
                break;
            case 2:
                str = "PREFETCH_NEXT_OTA";
                break;
            case 3:
                str = "PREFETCH_UNKNOWN";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        AAe.A02.markerStart(28442625, AAe.A01);
        AnonymousClass0Hz withMarker = AAe.A02.withMarker(28442625, AAe.A01);
        withMarker.A04("download_ota_build_number", AAe.A00);
        withMarker.A06("resource_name", AAe.A04);
        withMarker.A06("resource_flavor", AAe.A03);
        withMarker.A06("fallback_option", A002);
        withMarker.A06("fetch_type", str);
        withMarker.Aoj();
        File A012 = r9.A01(i, str3, str4);
        if (A012 != null) {
            AAe.A02.markerEnd(28442625, AAe.A01, 25);
            return new C14970m7(A012);
        }
        C14900lv r4 = r7.A01;
        try {
            AnonymousClass0DB.A0K("DownloadOnDemand", "attempting to fetch resource, name:%s, flavor:%s, build: %d", r4.A05, r4.A04, Integer.valueOf(r4.A00));
            AAe.A02.markerPoint(28442625, AAe.A01, "dod_metadata_critical_path_download_started");
            Context context = r9.A00;
            C14900lv r02 = r7.A01;
            int i2 = r02.A00;
            String str5 = r02.A05;
            String str6 = r02.A04;
            int A022 = C14570l7.A00(context).A02();
            C15910nj A003 = C37981kX.A00("");
            A003.A06("custom_app_id", "124024574287414");
            A003.A06("native_build", Integer.toString(A022));
            A003.A06("resource_name", str5);
            A003.A06("resource_flavor", str6);
            A003.A06("prefer_compressed", Boolean.TRUE.toString());
            if (i2 != 0) {
                A003.A06("ota_build", Integer.toString(i2));
            }
            List<C26151Bw> A042 = A003.A04();
            ArrayList<NameValuePair> arrayList = new ArrayList<>();
            for (C26151Bw r03 : A042) {
                arrayList.add(new BasicNameValuePair(r03.A00, r03.A01));
            }
            String A013 = AnonymousClass1BE.A01("/api/v1/facebook_dod/request_dod_resources/");
            C15910nj r42 = new C15910nj();
            for (NameValuePair nameValuePair : arrayList) {
                r42.A06(nameValuePair.getName(), nameValuePair.getValue());
            }
            AnonymousClass1BZ r1 = new AnonymousClass1BZ();
            r1.A02 = r42.A02(A013);
            r1.A01 = Constants.A0N;
            AnonymousClass1C4 A004 = r1.A00();
            ? r12 = 0;
            try {
                C255919l r22 = new C255919l();
                r22.A05 = Constants.ONE;
                r8 = AnonymousClass1C8.A00().A01(new AnonymousClass1C3(A004, r22.A00()), (C44061vX) null).A00;
                try {
                    jsonReader = new JsonReader(new InputStreamReader(r8.AHT()));
                    try {
                        jsonReader.beginObject();
                        while (true) {
                            if (jsonReader.hasNext()) {
                                if (jsonReader.nextName().equals("resource")) {
                                    C14900lv r23 = new C14900lv();
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        String nextName = jsonReader.nextName();
                                        if (nextName.equals("download_url")) {
                                            String nextString = jsonReader.nextString();
                                            if (nextString != null) {
                                                z5 = true;
                                            }
                                            z5 = false;
                                            if (z5) {
                                                r23.A03 = nextString;
                                            } else {
                                                C14670lJ.A00("download_url");
                                            }
                                        } else if (nextName.equals("compression_format")) {
                                            String nextString2 = jsonReader.nextString();
                                            if (nextString2 != null) {
                                                z4 = true;
                                            }
                                            z4 = false;
                                            if (z4) {
                                                r23.A02 = nextString2;
                                            } else {
                                                C14670lJ.A00("compression_format");
                                            }
                                        } else if (nextName.equals("build_number")) {
                                            Integer valueOf = Integer.valueOf(jsonReader.nextInt());
                                            if (valueOf != null) {
                                                z3 = true;
                                            }
                                            z3 = false;
                                            if (z3) {
                                                r23.A00 = valueOf.intValue();
                                            } else {
                                                C14670lJ.A00("build_number");
                                            }
                                        } else if (nextName.equals("resource_name")) {
                                            String nextString3 = jsonReader.nextString();
                                            if (nextString3 != null) {
                                                z2 = true;
                                            }
                                            z2 = false;
                                            if (z2) {
                                                r23.A05 = nextString3;
                                            } else {
                                                C14670lJ.A00("resource_name");
                                            }
                                        } else if (nextName.equals("resource_flavor")) {
                                            String nextString4 = jsonReader.nextString();
                                            if (nextString4 != null) {
                                                z = true;
                                            }
                                            z = false;
                                            if (z) {
                                                r23.A04 = nextString4;
                                            } else {
                                                C14670lJ.A00("resource_flavor");
                                            }
                                        } else if (nextName.equals("delta_download_url")) {
                                            jsonReader.nextString();
                                        } else if (nextName.equals("uncompressed_file_size")) {
                                            r23.A01 = Integer.valueOf(jsonReader.nextInt()).intValue();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    }
                                    jsonReader.endObject();
                                    C14910lx r04 = new C14910lx(r23);
                                    r04.toString();
                                    r12 = r04;
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                        jsonReader.close();
                        r12 = r12;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (IOException e2) {
                        e = e2;
                        AnonymousClass0DB.A06(C14670lJ.A00, "Http task to get update metadata failed", e);
                        if (jsonReader != null) {
                        }
                        if (r8 != null) {
                        }
                        if (r12 != 0) {
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        try {
                            AnonymousClass0DB.A06(C14670lJ.A00, "Runtime Exception while parsing metadata JSON response", e);
                            if (jsonReader != null) {
                            }
                            if (r8 != null) {
                            }
                            if (r12 != 0) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            r12 = jsonReader;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    jsonReader = null;
                    AnonymousClass0DB.A06(C14670lJ.A00, "Http task to get update metadata failed", e);
                    if (jsonReader != null) {
                        try {
                            jsonReader.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (r8 != null) {
                        r8.close();
                        r12 = r12;
                    }
                    if (r12 != 0) {
                    }
                } catch (RuntimeException e5) {
                    e = e5;
                    jsonReader = null;
                    AnonymousClass0DB.A06(C14670lJ.A00, "Runtime Exception while parsing metadata JSON response", e);
                    if (jsonReader != null) {
                    }
                    if (r8 != null) {
                    }
                    if (r12 != 0) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r12 != 0) {
                        r12.close();
                    }
                    if (r8 != null) {
                        r8.close();
                    }
                    throw th;
                    throw null;
                }
            } catch (IOException e6) {
                e = e6;
                r8 = null;
                jsonReader = null;
                AnonymousClass0DB.A06(C14670lJ.A00, "Http task to get update metadata failed", e);
                if (jsonReader != null) {
                }
                if (r8 != null) {
                }
                if (r12 != 0) {
                }
            } catch (RuntimeException e7) {
                e = e7;
                r8 = null;
                jsonReader = null;
                AnonymousClass0DB.A06(C14670lJ.A00, "Runtime Exception while parsing metadata JSON response", e);
                if (jsonReader != null) {
                }
                if (r8 != null) {
                }
                if (r12 != 0) {
                }
            } catch (Throwable th3) {
                th = th3;
                r8 = null;
                if (r12 != 0) {
                }
                if (r8 != null) {
                }
                throw th;
                throw null;
            }
            r8.close();
            r12 = r12;
            if (r12 != 0) {
                r12.toString();
                AAe.A02.markerPoint(28442625, AAe.A01, "dod_metadata_critical_path_download_succeeded");
                boolean z6 = !TextUtils.isEmpty((CharSequence) null);
                r12.A00 = z6;
                AAe.A02.markerPoint(28442625, AAe.A01, "dod_resource_download_started");
                AnonymousClass0Hz withMarker2 = AAe.A02.withMarker(28442625, AAe.A01);
                withMarker2.A07("is_delta", false);
                withMarker2.A07("is_prefetch", false);
                withMarker2.A07("is_ras_download", r12.A00);
                withMarker2.Aoj();
                try {
                    File A014 = r9.A01.A01("resource");
                    A014.deleteOnExit();
                    if (z6) {
                        str2 = AnonymousClass000.A0E("https://lookaside.facebook.com/ras/v2/?id=", (String) null);
                    } else {
                        str2 = r12.A01.A03;
                    }
                    r9.A02.ACZ(str2, A014);
                    AnonymousClass0Hz withMarker3 = AAe.A02.withMarker(28442625, AAe.A01);
                    withMarker3.A04("download_size", (int) A014.length());
                    withMarker3.Aoj();
                    AAe.A02.markerPoint(28442625, AAe.A01, "dod_resource_download_succeeded");
                    try {
                        C14660lI r72 = r9.A01;
                        String str7 = r12.A01.A02;
                        String str8 = str7;
                        if (str7 == null || NetInfoModule.CONNECTION_TYPE_NONE.equals(str8)) {
                            A014.getAbsolutePath();
                        } else {
                            try {
                                file2 = r72.A01("uncompressedResource");
                                try {
                                    if ("zstd".equals(str8)) {
                                        r82 = new ZstdInputStream(new FileInputStream(A014));
                                    } else if ("gzip".equals(str8)) {
                                        r82 = new GZIPInputStream(new FileInputStream(A014));
                                    } else if ("xz".equals(str8)) {
                                        r82 = new C04780Fy(new FileInputStream(A014));
                                    } else {
                                        throw new C46051z3(AnonymousClass000.A0E("Failed resource download file. Unsupported file format: ", str8));
                                    }
                                    InputStream inputStream = r82;
                                    C14950m5.A02(file2, r82);
                                    C14950m5.A00(r82);
                                    A014 = file2;
                                } catch (C46051z3 e8) {
                                    e = e8;
                                    if (file2 != null) {
                                    }
                                    throw e;
                                }
                            } catch (C46051z3 e9) {
                                e = e9;
                                file2 = null;
                                if (file2 != null) {
                                    if (file2.exists()) {
                                        file2.delete();
                                    }
                                }
                                throw e;
                            }
                        }
                        if (!A014.exists() || A014.length() == 0) {
                            r2 = new C46051z3(Constants.A12, "Failed to store empty file.");
                            AAe.A01(r2);
                            AnonymousClass0DB.A0D("DownloadOnDemand", r2.getMessage());
                            throw r2;
                        }
                        if (C14770lU.A00(r9, A014, r12)) {
                            try {
                                File A005 = C14660lI.A00(r9.A01, r12.A01.A00);
                                C14900lv r05 = r12.A01;
                                file = new File(A005, AnonymousClass000.A0J(r05.A04, "__DELIM__", r05.A05));
                                if (!A014.renameTo(file)) {
                                    file = null;
                                }
                            } catch (IOException unused2) {
                                file = null;
                            }
                            if (file != null) {
                                if (file.exists()) {
                                    C14660lI r10 = r9.A01;
                                    C14900lv r06 = r12.A01;
                                    String str9 = r06.A05;
                                    String str10 = r06.A04;
                                    int[] iArr = {r9.A04.A03(), r12.A01.A00};
                                    File file3 = new File(r10.A01, "resources");
                                    if (file3.exists()) {
                                        C14950m5.A04(file3, (String) null, r10.A00);
                                        File file4 = new File(file3, Integer.toString(r10.A00));
                                        if (file4.exists()) {
                                            C14950m5.A04(file4, AnonymousClass000.A0J(str10, "__DELIM__", str9), iArr);
                                        }
                                    }
                                    AnonymousClass0Hz withMarker4 = AAe.A02.withMarker(28442625, AAe.A01);
                                    withMarker4.A07("is_delta", false);
                                    withMarker4.A07("is_prefetch", false);
                                    withMarker4.Aoj();
                                    AAe.A02.markerEnd(28442625, AAe.A01, 2);
                                    return new C14970m7(file);
                                }
                            }
                            r2 = new C46051z3(Constants.A0u, "Failed to store files.");
                            AAe.A01(r2);
                            AnonymousClass0DB.A0D("DownloadOnDemand", r2.getMessage());
                        } else {
                            r2 = new C46051z3(Constants.A12, "Failed to verify full resource. different file size or checksum");
                            AAe.A01(r2);
                            AnonymousClass0DB.A0D("DownloadOnDemand", r2.getMessage());
                        }
                        throw r2;
                    } catch (IOException e10) {
                        r2 = new C46051z3(Constants.A0N, StringFormatUtil.formatStrLocaleSafe("Uncompress resource failed : %s", (Object) e10.getMessage()));
                        AAe.A01(r2);
                        AnonymousClass0DB.A0D("DownloadOnDemand", r2.getMessage());
                    } catch (Throwable th4) {
                        C14950m5.A00((Closeable) null);
                        throw th4;
                    }
                } catch (IOException e11) {
                    r2 = new C46051z3(Constants.A0C, StringFormatUtil.formatStrLocaleSafe("Full url fetch failed : %s", (Object) e11.getMessage()));
                    AAe.A01(r2);
                    AnonymousClass0DB.A0D("DownloadOnDemand", r2.getMessage());
                }
            } else {
                throw new C46051z3(Constants.A0j, "Metadata response returned null");
            }
        } catch (C46051z3 e12) {
            AAe.A00(e12);
            e12.getMessage();
            throw e12;
        } catch (Exception e13) {
            C46051z3 r3 = new C46051z3(Constants.ONE, StringFormatUtil.formatStrLocaleSafe("Failed download metadata via network. %s", (Object[]) new String[]{e13.getMessage()}));
            AAe.A00(r3);
            r3.getMessage();
            throw r3;
        } catch (C46051z3 e14) {
            AAe.A02.markerEnd(28442625, AAe.A01, 3);
            throw e14;
        }
    }
}
