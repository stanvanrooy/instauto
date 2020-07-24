package p000X;

import java.util.List;

/* renamed from: X.CHO */
public final class CHO extends C17920r1 {
    public final /* synthetic */ List A00;
    public final /* synthetic */ CHR A01;

    public CHO(CHR chr, List list) {
        this.A01 = chr;
        this.A00 = list;
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(1117827245);
        super.onFail(r4);
        this.A01.A01.A02(this.A00);
        CHR.A00(this.A01);
        CHR.A01(this.A01);
        AnonymousClass0Z0.A0A(597412984, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-700606672);
        int A032 = AnonymousClass0Z0.A03(-681044183);
        super.onSuccess((C28691Ms) obj);
        CHR.A02(this.A01);
        AnonymousClass0Z0.A0A(751163020, A032);
        AnonymousClass0Z0.A0A(1839213106, A03);
    }
}
