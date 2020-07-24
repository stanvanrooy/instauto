package p000X;

import com.instagram.model.shopping.Product;

/* renamed from: X.CRT */
public final class CRT extends C17920r1 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ CRP A02;
    public final /* synthetic */ C27702CNw A03;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0Z0.A03(-909239507);
        int A033 = AnonymousClass0Z0.A03(1815001739);
        this.A02.A01.BPb(this.A01, this.A03, (C28691Ms) obj, this.A00, System.currentTimeMillis());
        AnonymousClass0Z0.A0A(1794056996, A033);
        AnonymousClass0Z0.A0A(804877049, A032);
    }

    public CRT(CRP crp, Product product, C27702CNw cNw, long j) {
        this.A02 = crp;
        this.A01 = product;
        this.A03 = cNw;
        this.A00 = j;
    }

    public final void onFail(C43791v5 r11) {
        int A032 = AnonymousClass0Z0.A03(806660574);
        this.A02.A01.B3m(this.A01, this.A03, r11.A01, this.A00, System.currentTimeMillis());
        AnonymousClass0Z0.A0A(263003399, A032);
    }
}
