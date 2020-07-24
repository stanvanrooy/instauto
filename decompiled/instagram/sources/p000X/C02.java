package p000X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.C02 */
public final class C02 extends C3U implements C12910ha, Serializable {
    public static final C0L A0B = C0w.A00(C59382hU.class);
    public static final C12950he A0C = new C12940hd();
    public static final C27179Bzx A0D;
    public static final C27128Byr A0E;
    public static final C23 A0F;
    public static final C27198C1i A0G;
    public C27190C0p A00;
    public C27191C0q A01;
    public C27157BzU A02;
    public C05 A03;
    public C2H A04;
    public C27173Bzl A05;
    public C2G A06;
    public final C12900hZ A07 = new C33(this);
    public final C12 A08;
    public final HashMap A09 = new HashMap();
    public final ConcurrentHashMap A0A = new ConcurrentHashMap(64, 0.6f, 2);

    static {
        C0C c0c = C0C.A00;
        A0F = c0c;
        C27197C1d c1d = new C27197C1d();
        A0D = c1d;
        C10 c10 = C10.A05;
        A0G = c10;
        A0E = new C27128Byr(c0c, c1d, c10, C27173Bzl.A04, C206808uA.A05, Locale.getDefault(), TimeZone.getTimeZone("GMT"), C25930Bch.A01);
    }

    public final JsonDeserializer A01(C27123ByY byY, C0L c0l) {
        JsonDeserializer jsonDeserializer = (JsonDeserializer) this.A0A.get(c0l);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer A072 = byY.A07(c0l);
        if (A072 != null) {
            this.A0A.put(c0l, A072);
            return A072;
        }
        throw new C27125Bya("Can not find a deserializer for type " + c0l);
    }

    public C02() {
        C27187C0l c0l = new C27187C0l();
        this.A06 = c0l;
        this.A08 = new C12();
        this.A05 = C27173Bzl.A04;
        C27128Byr byr = A0E;
        this.A01 = new C27191C0q(byr, c0l, this.A09);
        this.A00 = new C27190C0p(byr, this.A06, this.A09);
        this.A03 = new C2X();
        this.A02 = new C27158BzV(C27169Bzh.A00);
        this.A04 = C27171Bzj.A00;
    }

    public final AnonymousClass4UF Btl() {
        return C3N.A00;
    }
}
