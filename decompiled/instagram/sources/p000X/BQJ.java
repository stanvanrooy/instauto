package p000X;

import java.util.Map;

/* renamed from: X.BQJ */
public final class BQJ implements BR9 {
    public AnonymousClass0RN A00;
    public AnonymousClass0QT A01;
    public AnonymousClass0C1 A02;

    public final void A00(String str, String str2, Map map, String str3, String str4, String str5, String str6) {
        C25570BQc bQc = new C25570BQc(this.A01.A02("bd_operation_event"));
        if (bQc.A0B()) {
            bQc.A08("component", "Java");
            bQc.A08("level", str);
            bQc.A08("operation", str2);
            bQc.A0A("operation_info", map);
            bQc.A08("bd_session_id", str3);
            bQc.A08(AnonymousClass40t.$const$string(230), str4);
            bQc.A08("exception_stack_trace", str5);
            bQc.A08("exception_type", str6);
            bQc.A01();
        }
    }

    public final void BtQ(Object obj) {
        try {
            AnonymousClass0C1 r2 = (AnonymousClass0C1) obj;
            this.A02 = r2;
            this.A01 = AnonymousClass0QT.A00(r2, this.A00);
        } catch (ClassCastException e) {
            C54802Yz.A00(e);
        }
    }

    public BQJ(AnonymousClass0C1 r2, AnonymousClass0RN r3) {
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = AnonymousClass0QT.A00(r2, r3);
    }
}
