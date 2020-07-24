package p000X;

import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.TraceEventType;
import java.util.Map;

/* renamed from: X.1Ck  reason: invalid class name and case insensitive filesystem */
public final class C26261Ck implements C15000mA {
    public final C14820ln A00;
    public final C26241Ch A01;

    public final void BJN(C15920nk r7, RequestStats requestStats, String str) {
        if (this.A01.A01) {
            Map flowTimeData = requestStats.getFlowTimeData();
            flowTimeData.put("request_status", str);
            flowTimeData.put("weight", String.valueOf(C26241Ch.A02));
            C14820ln r5 = this.A00;
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("mobile_http_flow", C14820ln.A01);
            for (Map.Entry entry : flowTimeData.entrySet()) {
                A002.A0G((String) entry.getKey(), (String) entry.getValue());
            }
            ((AnonymousClass0RU) r5.A00.get()).BcG(A002);
        }
        if (this.A01.A00) {
            Map certificateVerificationData = requestStats.getCertificateVerificationData();
            certificateVerificationData.put("weight", String.valueOf(5000));
            C14820ln r4 = this.A00;
            AnonymousClass0P4 A003 = AnonymousClass0P4.A00(TraceEventType.CertVerification, C14820ln.A01);
            for (Map.Entry entry2 : certificateVerificationData.entrySet()) {
                A003.A0G((String) entry2.getKey(), (String) entry2.getValue());
            }
            ((AnonymousClass0RU) r4.A00.get()).BcG(A003);
        }
    }

    public C26261Ck(C26241Ch r1, C14820ln r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
