package p000X;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0jc  reason: invalid class name and case insensitive filesystem */
public final class C14010jc {
    public static C14010jc A05;
    public final AnonymousClass0RU A00;
    public final C13990ja A01;
    public final String A02;
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final boolean A04;

    public C14010jc(boolean z, C13990ja r4, AnonymousClass0RU r5) {
        this.A04 = z;
        this.A01 = r4;
        this.A02 = "Instagram";
        this.A00 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = android.net.Uri.parse(r0);
     */
    public final String A00(AnonymousClass1CW r7) {
        Uri parse;
        String host;
        StringBuilder sb;
        String str;
        int indexOf;
        String str2 = r7.A0G;
        String str3 = r7.A0H;
        String str4 = "null";
        if (!(str3 == null || (host = parse.getHost()) == null)) {
            str4 = "ak.instagram.com";
            if (host.endsWith(str4)) {
                String lastPathSegment = parse.getLastPathSegment();
                if (!(lastPathSegment == null || (indexOf = lastPathSegment.indexOf(46)) == -1)) {
                    str4 = AnonymousClass000.A0E("ak.instagram.com:", lastPathSegment.substring(indexOf + 1));
                }
            } else {
                String path = parse.getPath();
                if (path != null) {
                    if (path.contains("upload/photo")) {
                        sb = new StringBuilder();
                        sb.append(host);
                        str = ":upload_photo";
                    } else if (path.contains("feed/timeline")) {
                        sb = new StringBuilder();
                        sb.append(host);
                        str = ":feed_fetch";
                    } else if (path.contains("transcode/v1")) {
                        str4 = "transcode_server";
                    }
                    sb.append(str);
                    str4 = sb.toString();
                }
                str4 = host;
            }
        }
        return AnonymousClass000.A0J(str2, ", ", str4);
    }
}
