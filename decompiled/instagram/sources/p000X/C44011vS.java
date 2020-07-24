package p000X;

import android.net.LocalSocket;
import android.net.Uri;
import com.facebook.common.dextricks.DexStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.video.player.hero.IgHttpConnectionForProxy;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1vS  reason: invalid class name and case insensitive filesystem */
public final class C44011vS implements Runnable {
    public final /* synthetic */ LocalSocket A00;
    public final /* synthetic */ C40311oS A01;

    public C44011vS(C40311oS r1, LocalSocket localSocket) {
        this.A01 = r1;
        this.A00 = localSocket;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fe, code lost:
        if (r5 != null) goto L_0x0301;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x0316 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b0 A[SYNTHETIC, Splitter:B:101:0x02b0] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b7 A[LOOP:1: B:106:0x02b7->B:172:0x02b7, LOOP_START, SYNTHETIC, Splitter:B:106:0x02b7] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02fb A[SYNTHETIC, Splitter:B:132:0x02fb] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x030e A[SYNTHETIC, Splitter:B:145:0x030e] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0313 A[SYNTHETIC, Splitter:B:149:0x0313] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b4 A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011d A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132 A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015b A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016d A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0186 A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019b A[Catch:{ IOException -> 0x0317 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d8 A[Catch:{ IOException -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e0 A[Catch:{ IOException -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ec A[ADDED_TO_REGION, Catch:{ IOException -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f1 A[Catch:{ IOException -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f2 A[Catch:{ IOException -> 0x02e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0273 A[Catch:{ IOException -> 0x02e4 }, LOOP:0: B:96:0x026d->B:98:0x0273, LOOP_END] */
    public final void run() {
        int i;
        HashMap hashMap;
        int i2;
        Integer num;
        C255919l r12;
        C44181vj r9;
        LocalSocket localSocket;
        String str;
        InputStream inputStream;
        DataOutputStream dataOutputStream;
        int i3;
        int i4;
        HashMap hashMap2;
        int AWl;
        long j;
        String str2;
        String str3;
        String str4;
        synchronized (this.A01.A00.A02) {
            try {
                this.A01.A00.A03.add(this.A00);
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        C40311oS r1 = this.A01;
        C40121o7 r11 = r1.A00;
        LocalSocket localSocket2 = this.A00;
        IgHttpConnectionForProxy igHttpConnectionForProxy = r1.A02;
        C40431oe.A01("LocalSocketVideoProxy", "Handling local socket request", new Object[0]);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(localSocket2.getInputStream(), "US-ASCII"));
            C40121o7.A01(bufferedReader, hashMap3);
            C40121o7.A01(bufferedReader, hashMap4);
            C40121o7.A01(bufferedReader, hashMap5);
            String str5 = (String) hashMap3.get("Range");
            String str6 = (String) hashMap3.get("Uri");
            if (str6 == null) {
                AnonymousClass0QD.A02("videoproxy_no_url", "");
                C40121o7.A03(str6, localSocket2);
            } else {
                boolean z = true;
                if (Uri.parse(str6).getAuthority() == null) {
                    z = false;
                }
                if (z) {
                    String str7 = "Priority";
                    if (hashMap3.containsKey(str7)) {
                        try {
                            str4 = str7;
                            int parseInt = Integer.parseInt((String) hashMap3.get(str7));
                            str4 = parseInt;
                            i = parseInt;
                        } catch (NumberFormatException unused) {
                            C40431oe.A02("LocalSocketVideoProxy", AnonymousClass000.A0E("Failed to parse priority ", (String) hashMap3.get(str4)), new Object[0]);
                        }
                        C44021vT r3 = new C44021vT(r11, localSocket2, str6);
                        hashMap = hashMap4;
                        hashMap4.putAll(hashMap5);
                        int i5 = -1;
                        if (str5 != null) {
                            C40431oe.A02("com.instagram.video.player.hero.IgHttpConnectionForProxy", "Range request shouldn't be empty!", new Object[0]);
                        } else if (!str5.equals("unspecified")) {
                            String[] split = str5.substring(6).split("-");
                            try {
                                int parseInt2 = Integer.parseInt(split[0]);
                                if (split.length > 1) {
                                    i5 = Integer.parseInt(split[1]);
                                }
                                i2 = i5;
                                i5 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                C40431oe.A02("com.instagram.video.player.hero.IgHttpConnectionForProxy", "Failed to parse request range %s for url: %s", str5, str6);
                                i2 = -1;
                            }
                            if (Uri.parse(str6).getAuthority() == null) {
                                AnonymousClass0QD.A02("video_proxy_invalid_url", str6);
                            }
                            if (!(i == 0 || i == 1)) {
                                AnonymousClass0QD.A02("video_proxy_priority", AnonymousClass000.A05("Invalid priority ", i));
                            }
                            AnonymousClass18O BWk = igHttpConnectionForProxy.A01.BWk(str6);
                            if (i == 0) {
                                num = Constants.A0C;
                            } else {
                                num = Constants.ONE;
                            }
                            r12 = new C255919l();
                            r12.A03 = C15920nk.Video;
                            r12.A05 = num;
                            if (hashMap3.containsKey("play_origin")) {
                                r12.A09 = (String) hashMap3.get("play_origin");
                            }
                            if (hashMap.containsKey("video_stream_type") && hashMap.containsKey(TraceFieldType.VideoId)) {
                                str2 = (String) hashMap.get(TraceFieldType.VideoId);
                                str3 = (String) hashMap.get("video_stream_type");
                                if (!(str2 == null || str3 == null)) {
                                    C44031vU r92 = new C44031vU(str2, str3);
                                    if (hashMap3.containsKey("etd_ms")) {
                                        r92.A00 = Integer.valueOf(Integer.parseInt((String) hashMap3.get("etd_ms")));
                                    }
                                    if (hashMap.containsKey("video_request_type")) {
                                        r92.A02 = (String) hashMap.get("video_request_type");
                                    }
                                    r12.A04 = r92;
                                }
                            }
                            C256019m A002 = r12.A00();
                            C44041vV r93 = null;
                            if (hashMap.containsKey(TraceFieldType.VideoId)) {
                                r93 = new C44041vV(igHttpConnectionForProxy, (String) hashMap.get(TraceFieldType.VideoId), A002);
                            }
                            r9 = new C44181vj(i5, i2, C256819v.A00.A05(BWk, (long) i5, (long) i2, A002, hashMap, r93));
                            C40121o7 r18 = r3.A01;
                            localSocket = r3.A00;
                            str = r3.A02;
                            byte[] bArr = new byte[4096];
                            inputStream = null;
                            dataOutputStream = new DataOutputStream(localSocket.getOutputStream());
                            try {
                                i3 = r9.A01;
                                if (i3 == -1) {
                                    i3 = 0;
                                }
                                i4 = r9.A00;
                                if (i4 == -1) {
                                    i4 = Integer.MAX_VALUE;
                                }
                                hashMap2 = new HashMap();
                                if (i3 == 0 || i4 != Integer.MAX_VALUE) {
                                    if (i4 == Integer.MAX_VALUE) {
                                        j = r9.A02.AMM() - 1;
                                    } else {
                                        j = (long) i4;
                                    }
                                    hashMap2.put("Content-Range", String.format((Locale) null, "bytes %d-%d/%d", new Object[]{Integer.valueOf(i3), Long.valueOf(j), Long.valueOf(r9.A02.AMM())}));
                                    hashMap2.put("Content-Length", Long.toString(r9.A02.getContentLength()));
                                } else {
                                    hashMap2.put("Accept-Ranges", "bytes");
                                    hashMap2.put("Content-Length", Long.toString(r9.A02.getContentLength()));
                                }
                                AWl = r9.A02.AWl();
                                if (AWl < 200 || AWl > 299) {
                                    hashMap2.put("status-code", Integer.toString(AWl));
                                }
                                StringBuilder sb = new StringBuilder();
                                for (Map.Entry entry : hashMap2.entrySet()) {
                                    sb.append((String) entry.getKey());
                                    sb.append(": ");
                                    sb.append((String) entry.getValue());
                                    sb.append("\r\n");
                                }
                                byte[] bytes = sb.toString().getBytes();
                                dataOutputStream.writeInt(bytes.length);
                                dataOutputStream.write(bytes);
                                dataOutputStream.flush();
                                inputStream = r9.A02.ANj();
                                if (inputStream == null) {
                                    C40121o7.A03(str, localSocket);
                                    try {
                                        r9.close();
                                    } catch (IOException unused3) {
                                    }
                                    try {
                                        dataOutputStream.close();
                                    } catch (IOException unused4) {
                                    }
                                } else {
                                    while (true) {
                                        int read = inputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        dataOutputStream.write(bArr, 0, read);
                                        int i6 = r18.A00;
                                        if (i6 != -1) {
                                            try {
                                                Thread.sleep((long) (DexStore.LOAD_RESULT_PGO / i6));
                                            } catch (InterruptedException e) {
                                                C40431oe.A05("LocalSocketVideoProxy", e, "%s", e.getMessage());
                                            }
                                        }
                                    }
                                    dataOutputStream.flush();
                                    C40121o7.A03(str, localSocket);
                                    try {
                                        r9.close();
                                    } catch (IOException unused5) {
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused6) {
                                        }
                                    }
                                }
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    C40121o7.A02(e);
                                    r9.A02.abort();
                                    C40121o7.A03(str, localSocket);
                                    r9.close();
                                    if (inputStream != null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    C40121o7.A03(str, localSocket);
                                    try {
                                        r9.close();
                                    } catch (IOException unused7) {
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused8) {
                                        }
                                    }
                                    if (dataOutputStream != null) {
                                        dataOutputStream.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        i5 = -1;
                        i2 = -1;
                        if (Uri.parse(str6).getAuthority() == null) {
                        }
                        AnonymousClass0QD.A02("video_proxy_priority", AnonymousClass000.A05("Invalid priority ", i));
                        AnonymousClass18O BWk2 = igHttpConnectionForProxy.A01.BWk(str6);
                        if (i == 0) {
                        }
                        r12 = new C255919l();
                        r12.A03 = C15920nk.Video;
                        r12.A05 = num;
                        if (hashMap3.containsKey("play_origin")) {
                        }
                        str2 = (String) hashMap.get(TraceFieldType.VideoId);
                        str3 = (String) hashMap.get("video_stream_type");
                        C44031vU r922 = new C44031vU(str2, str3);
                        if (hashMap3.containsKey("etd_ms")) {
                        }
                        if (hashMap.containsKey("video_request_type")) {
                        }
                        r12.A04 = r922;
                        C256019m A0022 = r12.A00();
                        C44041vV r932 = null;
                        if (hashMap.containsKey(TraceFieldType.VideoId)) {
                        }
                        r9 = new C44181vj(i5, i2, C256819v.A00.A05(BWk2, (long) i5, (long) i2, A0022, hashMap, r932));
                        C40121o7 r182 = r3.A01;
                        localSocket = r3.A00;
                        str = r3.A02;
                        byte[] bArr2 = new byte[4096];
                        inputStream = null;
                        try {
                            dataOutputStream = new DataOutputStream(localSocket.getOutputStream());
                            i3 = r9.A01;
                            if (i3 == -1) {
                            }
                            i4 = r9.A00;
                            if (i4 == -1) {
                            }
                            hashMap2 = new HashMap();
                            if (i3 == 0) {
                            }
                            if (i4 == Integer.MAX_VALUE) {
                            }
                            hashMap2.put("Content-Range", String.format((Locale) null, "bytes %d-%d/%d", new Object[]{Integer.valueOf(i3), Long.valueOf(j), Long.valueOf(r9.A02.AMM())}));
                            hashMap2.put("Content-Length", Long.toString(r9.A02.getContentLength()));
                            AWl = r9.A02.AWl();
                            hashMap2.put("status-code", Integer.toString(AWl));
                            StringBuilder sb2 = new StringBuilder();
                            while (r13.hasNext()) {
                            }
                            byte[] bytes2 = sb2.toString().getBytes();
                            dataOutputStream.writeInt(bytes2.length);
                            dataOutputStream.write(bytes2);
                            dataOutputStream.flush();
                            inputStream = r9.A02.ANj();
                            if (inputStream == null) {
                            }
                        } catch (IOException e3) {
                            e = e3;
                            dataOutputStream = null;
                            C40121o7.A02(e);
                            r9.A02.abort();
                            C40121o7.A03(str, localSocket);
                            r9.close();
                            if (inputStream != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            dataOutputStream = null;
                            C40121o7.A03(str, localSocket);
                            r9.close();
                            if (inputStream != null) {
                            }
                            if (dataOutputStream != null) {
                            }
                            throw th;
                        }
                    }
                    i = -1;
                    try {
                        C44021vT r32 = new C44021vT(r11, localSocket2, str6);
                        hashMap = hashMap4;
                        hashMap4.putAll(hashMap5);
                        int i52 = -1;
                        if (str5 != null) {
                        }
                        i52 = -1;
                        i2 = -1;
                        if (Uri.parse(str6).getAuthority() == null) {
                        }
                        AnonymousClass0QD.A02("video_proxy_priority", AnonymousClass000.A05("Invalid priority ", i));
                        AnonymousClass18O BWk22 = igHttpConnectionForProxy.A01.BWk(str6);
                        if (i == 0) {
                        }
                        r12 = new C255919l();
                        r12.A03 = C15920nk.Video;
                        r12.A05 = num;
                        if (hashMap3.containsKey("play_origin")) {
                        }
                        str2 = (String) hashMap.get(TraceFieldType.VideoId);
                        str3 = (String) hashMap.get("video_stream_type");
                        C44031vU r9222 = new C44031vU(str2, str3);
                        if (hashMap3.containsKey("etd_ms")) {
                        }
                        if (hashMap.containsKey("video_request_type")) {
                        }
                        r12.A04 = r9222;
                        C256019m A00222 = r12.A00();
                        C44041vV r9322 = null;
                        if (hashMap.containsKey(TraceFieldType.VideoId)) {
                        }
                        r9 = new C44181vj(i52, i2, C256819v.A00.A05(BWk22, (long) i52, (long) i2, A00222, hashMap, r9322));
                        C40121o7 r1822 = r32.A01;
                        localSocket = r32.A00;
                        str = r32.A02;
                        byte[] bArr22 = new byte[4096];
                        inputStream = null;
                        dataOutputStream = new DataOutputStream(localSocket.getOutputStream());
                        i3 = r9.A01;
                        if (i3 == -1) {
                        }
                        i4 = r9.A00;
                        if (i4 == -1) {
                        }
                        hashMap2 = new HashMap();
                        if (i3 == 0) {
                        }
                        if (i4 == Integer.MAX_VALUE) {
                        }
                        hashMap2.put("Content-Range", String.format((Locale) null, "bytes %d-%d/%d", new Object[]{Integer.valueOf(i3), Long.valueOf(j), Long.valueOf(r9.A02.AMM())}));
                        hashMap2.put("Content-Length", Long.toString(r9.A02.getContentLength()));
                        AWl = r9.A02.AWl();
                        hashMap2.put("status-code", Integer.toString(AWl));
                        StringBuilder sb22 = new StringBuilder();
                        while (r13.hasNext()) {
                        }
                        byte[] bytes22 = sb22.toString().getBytes();
                        dataOutputStream.writeInt(bytes22.length);
                        dataOutputStream.write(bytes22);
                        dataOutputStream.flush();
                        inputStream = r9.A02.ANj();
                        if (inputStream == null) {
                        }
                    } catch (IOException e4) {
                        C40121o7.A02(e4);
                        C40121o7.A03(str6, localSocket2);
                    }
                }
            }
        } catch (IOException e5) {
            C40431oe.A05("LocalSocketVideoProxy", e5, "Error parsing request", new Object[0]);
            C40121o7.A03((String) null, localSocket2);
        }
        synchronized (this.A01.A00.A02) {
            try {
                this.A01.A00.A03.remove(this.A00);
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }
}
