package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

/* renamed from: X.0mb  reason: invalid class name and case insensitive filesystem */
public final class C15260mb {
    public static final String A06 = System.getProperty("line.separator");
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;

    public C15260mb(String str) {
        String[] split = str.split("@");
        int length = split.length;
        if (length == 6) {
            try {
                this.A04 = split[0];
                this.A00 = Integer.parseInt(split[1]);
                this.A01 = Integer.parseInt(split[2]);
                this.A05 = split[3];
                this.A02 = Long.parseLong(split[4]);
                this.A03 = Long.parseLong(split[5]);
            } catch (NumberFormatException e) {
                throw new IOException(e);
            }
        } else {
            throw new IOException(StringFormatUtil.formatStrLocaleSafe("Malformatted cacheEvent on disk. Found unexpected number of fields %d. For: %s", Integer.valueOf(length), str));
        }
    }

    public C15260mb(String str, int i, int i2, String str2, long j) {
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = str2 == null ? "unknown" : str2;
        this.A02 = j;
        this.A03 = System.currentTimeMillis();
    }
}
