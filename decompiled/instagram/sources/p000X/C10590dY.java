package p000X;

/* renamed from: X.0dY  reason: invalid class name and case insensitive filesystem */
public final class C10590dY implements C05060Hw {
    public final /* synthetic */ StringBuilder A00;

    public C10590dY(StringBuilder sb) {
        this.A00 = sb;
    }

    public final void Btm(long j, long j2, int i, String str, AnonymousClass0I7 r9, AnonymousClass0SN r10) {
        StringBuilder sb = this.A00;
        sb.append("<p:");
        sb.append(str);
        if (r9 != null) {
            sb.append('=');
            sb.append(r9);
        }
        StringBuilder sb2 = this.A00;
        sb2.append(' ');
        sb2.append(j);
        sb2.append("[ms]>");
    }
}
