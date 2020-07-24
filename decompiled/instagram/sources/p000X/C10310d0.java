package p000X;

import java.io.DataOutputStream;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0d0  reason: invalid class name and case insensitive filesystem */
public final class C10310d0 implements AnonymousClass0WZ {
    public final byte[] convertForegroundStateWithSubscriptionToThriftPayload(Long l, Boolean bool, Integer num, List list, List list2) {
        return null;
    }

    public final List getConnectSubscribeTopics(List list) {
        return list;
    }

    public final int handleConnectMessage(DataOutputStream dataOutputStream, C10350dA r17) {
        byte[] bArr;
        byte[] bArr2;
        String str;
        byte[] bArr3;
        byte[] bArr4;
        String str2;
        int i;
        C10350dA r0 = r17;
        AnonymousClass0W2 r4 = r0.A00;
        AnonymousClass0W1 A03 = r0.A03();
        C08190Vz A02 = r0.A02();
        byte[] A032 = AnonymousClass0WT.A03(A02.A02);
        int length = A032.length;
        int i2 = length + 2 + 0;
        String str3 = A02.A05;
        if (str3 != null) {
            bArr = AnonymousClass0WT.A03(str3);
        } else {
            bArr = new byte[0];
        }
        String str4 = A02.A04;
        if (str4 != null) {
            bArr2 = AnonymousClass0WT.A03(str4);
        } else {
            bArr2 = new byte[0];
        }
        if (A03.A06) {
            i2 = i2 + bArr.length + 2 + bArr2.length + 2;
        }
        AnonymousClass0W0 r5 = A02.A01;
        if (r5 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(C08160Vw.A00(Constants.ZERO), r5.A0C);
                jSONObject.putOpt(C08160Vw.A00(Constants.A0C), r5.A0J);
                jSONObject.putOpt(C08160Vw.A00(Constants.A0N), r5.A08);
                jSONObject.putOpt(C08160Vw.A00(Constants.A05), r5.A0B);
                jSONObject.putOpt(C08160Vw.A00(Constants.A03), r5.A07);
                jSONObject.putOpt(C08160Vw.A00(Constants.A04), r5.A06);
                jSONObject.putOpt(C08160Vw.A00(Constants.A12), r5.A02);
                jSONObject.putOpt(C08160Vw.A00(Constants.A0u), r5.A04);
                jSONObject.putOpt(C08160Vw.A00(Constants.A15), r5.A0H);
                jSONObject.putOpt(C08160Vw.A00(Constants.A02), r5.A0I);
                jSONObject.putOpt(C08160Vw.A00(Constants.A14), r5.A03);
                jSONObject.putOpt(C08160Vw.A00(Constants.A0Y), r5.A0A);
                String A00 = C08160Vw.A00(Constants.A0j);
                int i3 = r5.A00;
                if (1 == i3) {
                    str2 = "jz";
                } else if (2 == i3) {
                    str2 = "jzo";
                } else {
                    str2 = null;
                }
                jSONObject.putOpt(A00, str2);
                jSONObject.putOpt(C08160Vw.A00(Constants.A07), r5.A0E);
                jSONObject.putOpt(C08160Vw.A00(Constants.A08), r5.A0D);
                if (r5.A0K != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (String put : r5.A0K) {
                        jSONArray.put(put);
                    }
                    jSONObject.put(C08160Vw.A00(Constants.A06), jSONArray);
                }
                jSONObject.put(C08160Vw.A00(Constants.A0B), r5.A0F);
                jSONObject.putOpt(C08160Vw.A00(Constants.A0A), r5.A0G);
                jSONObject.putOpt(C08160Vw.A00(Constants.A0I), r5.A05);
                if (r5.A0L != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : r5.A0L.entrySet()) {
                        jSONObject2.putOpt((String) entry.getKey(), entry.getValue());
                    }
                    jSONObject.putOpt(C08160Vw.A00(Constants.A0J), jSONObject2);
                }
                Long l = r5.A09;
                if (l != null) {
                    jSONObject.putOpt(C08160Vw.A00(Constants.A0H), l);
                }
                C09230au r52 = r5.A01;
                if (r52 != null) {
                    String A002 = C08160Vw.A00(Constants.A0K);
                    if (r52 == null) {
                        i = 0;
                    } else {
                        i = r52.getValue();
                    }
                    jSONObject.putOpt(A002, Integer.valueOf(i));
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            bArr3 = AnonymousClass0WT.A03(str);
        } else {
            bArr3 = new byte[0];
        }
        if (A03.A05) {
            i2 += bArr3.length + 2;
        }
        String str5 = A02.A03;
        if (str5 != null) {
            bArr4 = AnonymousClass0WT.A03(str5);
        } else {
            bArr4 = new byte[0];
        }
        if (A03.A04) {
            i2 += bArr4.length + 2;
        }
        int i4 = 12 + i2;
        int A01 = AnonymousClass0WT.A01(r4);
        DataOutputStream dataOutputStream2 = dataOutputStream;
        dataOutputStream2.writeByte(A01);
        int A022 = 1 + AnonymousClass0WT.A02(dataOutputStream2, i4);
        dataOutputStream2.writeByte(0);
        dataOutputStream2.writeByte(6);
        dataOutputStream2.writeByte(77);
        dataOutputStream2.writeByte(81);
        dataOutputStream2.writeByte(73);
        dataOutputStream2.writeByte(115);
        dataOutputStream2.writeByte(100);
        dataOutputStream2.writeByte(112);
        dataOutputStream2.write(A03.A01);
        dataOutputStream2.write(AnonymousClass0WT.A00(A03));
        dataOutputStream2.writeShort(A03.A00);
        dataOutputStream2.writeShort(length);
        dataOutputStream2.write(A032, 0, length);
        if (A03.A06) {
            int length2 = bArr.length;
            dataOutputStream2.writeShort(length2);
            dataOutputStream2.write(bArr, 0, length2);
            int length3 = bArr2.length;
            dataOutputStream2.writeShort(length3);
            dataOutputStream2.write(bArr2, 0, length3);
        }
        if (A03.A05) {
            int length4 = bArr3.length;
            dataOutputStream2.writeShort(length4);
            dataOutputStream2.write(bArr3, 0, length4);
        }
        if (A03.A04) {
            int length5 = bArr4.length;
            dataOutputStream2.writeShort(length5);
            dataOutputStream2.write(bArr4, 0, length5);
        }
        dataOutputStream2.flush();
        return A022 + i4;
    }
}
