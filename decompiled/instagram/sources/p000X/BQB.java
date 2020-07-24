package p000X;

import android.content.Context;
import java.security.spec.InvalidParameterSpecException;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.BQB */
public final class BQB {
    public final int A00;
    public final Context A01;
    public final BQH A02;
    public final C25578BQk A03;
    public final BQS A04;
    public final BQT A05;
    public final BQA A06;
    public final BQU A07;

    public final synchronized void A00(Integer num, BQK bqk, String str, AWC awc) {
        C25571BQd bQd;
        String str2;
        int length;
        if (bqk != BQK.BENIGN_IGNORE) {
            BQT bqt = this.A05;
            bqt.A01(bqk, bqt.A00);
            if (num == Constants.ONE) {
                BQU bqu = this.A07;
                bqu.A01(bqk, bqu.A00);
                if (str != null) {
                    BQR bqr = this.A02.A0A;
                    if (bqr != null) {
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        String A022 = BQC.A02();
                        int i = this.A00;
                        int i2 = bqk.A00;
                        JSONObject jSONObject = new JSONObject();
                        Map map = BQL.A00().A00;
                        if (map != null && !map.isEmpty()) {
                            try {
                                for (Integer num2 : map.keySet()) {
                                    List<C25521BOf> A012 = ((BQM) map.get(num2)).A01();
                                    JSONArray jSONArray = new JSONArray();
                                    for (C25521BOf A023 : A012) {
                                        jSONArray.put(A023.A02());
                                    }
                                    jSONObject.put(num2.toString(), jSONArray);
                                }
                            } catch (Throwable th) {
                                C54802Yz.A00(th);
                            }
                        }
                        if (awc.ordinal() != 1) {
                            bQd = new C25571BQd(bqr.A00.A02("bd_mobile_signals"));
                        } else {
                            bQd = new C25571BQd(bqr.A00.A03("bd_mobile_signals", AnonymousClass0QV.A06));
                        }
                        if (bQd.A0B()) {
                            bQd.A08("asid", A022);
                            bQd.A08("bid", str);
                            bQd.A06("ct", Integer.valueOf(i));
                            bQd.A06("rt", Integer.valueOf(i2));
                            bQd.A06("set", Integer.valueOf(currentTimeMillis));
                            String jSONObject2 = jSONObject.toString();
                            try {
                                String[] split = str.split("\\|");
                                if (split == null || (length = split.length) == 0) {
                                    throw new IllegalArgumentException("Null BD Session Id");
                                }
                                String str3 = split[length - 1];
                                if (str3.length() == 16) {
                                    str2 = BHY.A00(jSONObject2, str3);
                                    bQd.A08("sjd", str2);
                                    bQd.A01();
                                } else {
                                    throw new InvalidParameterSpecException("Invalid Length");
                                }
                            } catch (Throwable th2) {
                                C54802Yz.A00(th2);
                                str2 = "{}";
                            }
                        }
                    }
                    BQC.A04(this.A02, C25582BQo.A00(Constants.A0C), str);
                }
            }
        }
    }

    public BQB(Context context, BQH bqh, BQK bqk) {
        C25518BOc bOc = new C25518BOc(context, new C25519BOd(new C25579BQl(context, bqh)), bqh, bqk);
        this.A01 = context;
        this.A05 = bOc.A03;
        this.A07 = bOc.A04;
        BQS bqs = bOc.A02;
        this.A04 = bqs;
        this.A00 = bOc.A00;
        this.A02 = bqh;
        C25578BQk bQk = new C25578BQk();
        this.A03 = bQk;
        bQk.A00.add(bqs);
        BQA bqa = bOc.A06;
        this.A06 = bqa;
        bqa.A02(Constants.ONE);
        this.A06.A02(Constants.ZERO);
    }
}
