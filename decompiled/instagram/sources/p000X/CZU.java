package p000X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CZU */
public final class CZU implements C06570Po {
    public static final C35071fl A04 = C35051fj.A06;
    public long A00;
    public final C22800z1 A01;
    public final Random A02;
    public final AnonymousClass0C1 A03;

    public final void A06(C27998CZi cZi, ImmutableMap immutableMap) {
        C131265jN A002 = C131265jN.A00();
        if (immutableMap != null) {
            C239512q A0I = immutableMap.entrySet().iterator();
            while (A0I.hasNext()) {
                Map.Entry entry = (Map.Entry) A0I.next();
                A002.A02((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.A01.A5L(A04, this.A00, cZi.A00, (String) null, A002);
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static ImmutableMap A00(ImmutableList immutableList) {
        HashMap hashMap = new HashMap();
        if (immutableList != null) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < immutableList.size(); i++) {
                try {
                    jSONObject.put(String.valueOf(i), immutableList.get(i));
                } catch (JSONException e) {
                    AnonymousClass0DB.A0G("DCP", "Failed writing Purchase Error to JSON", e);
                }
            }
            hashMap.put("purchase_errors", jSONObject.toString());
        }
        return ImmutableMap.A01(hashMap);
    }

    public static ImmutableMap A01(CZV czv) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", czv.A01);
        hashMap.put("play_store_response_code", String.valueOf(czv.A00));
        return ImmutableMap.A01(hashMap);
    }

    public static ImmutableMap A02(C28003CZn cZn) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(cZn.A00.values());
        hashMap.put("item_count", AnonymousClass000.A05("", arrayList.size()));
        for (int i = 0; i < arrayList.size(); i++) {
            C28002CZm cZm = (C28002CZm) arrayList.get(i);
            hashMap.put(AnonymousClass000.A06("item_", i, "_sku"), cZm.A06);
            hashMap.put(AnonymousClass000.A06("item_", i, "_orderId"), cZm.A03);
        }
        return ImmutableMap.A01(hashMap);
    }

    public static ImmutableMap A03(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        return ImmutableMap.A01(hashMap);
    }

    public static ImmutableMap A04(Throwable th) {
        HashMap hashMap = new HashMap();
        if (th != null) {
            hashMap.put("reason", th.getMessage());
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            hashMap.put("exception_trace", stringWriter.toString());
        }
        return ImmutableMap.A01(hashMap);
    }

    public final void A05(C27998CZi cZi) {
        this.A01.A5H(A04, this.A00, cZi.A00);
    }

    public CZU(AnonymousClass0C1 r3) {
        Random random = new Random();
        this.A02 = random;
        this.A00 = random.nextLong();
        this.A03 = r3;
        this.A01 = C22760yx.A00(r3).A00;
    }
}
