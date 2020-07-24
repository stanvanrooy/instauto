package p000X;

/* renamed from: X.0Vl  reason: invalid class name and case insensitive filesystem */
public final class C08050Vl {
    public AnonymousClass0G5 A00;
    public AnonymousClass0RT A01;
    public AnonymousClass0RS A02;
    public AnonymousClass0RP A03;
    public Integer A04;
    public String A05;
    public boolean A06;
    public final AnonymousClass0VX mAnalyticsSessionHandler;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ID: ");
        sb.append(this.mAnalyticsSessionHandler.AVq());
        sb.append(" Sequence: ");
        AnonymousClass0VX r1 = this.mAnalyticsSessionHandler;
        sb.append(r1.AVk());
        sb.append(" (");
        sb.append(r1.AJI());
        sb.append(" events)\n");
        sb.append("Device ID: ");
        sb.append(C05860Mt.A02.A05(this.A02.A00));
        sb.append(" FB: ");
        sb.append(this.A00.AZi());
        sb.append(" Version: ");
        AnonymousClass0RT r12 = this.A01;
        sb.append(r12.A02);
        sb.append(" Build Number: ");
        sb.append(r12.A00);
        sb.append(" Channel: ");
        Integer num = this.A04;
        if (num != null) {
            str = AnonymousClass0R8.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        return sb.toString();
    }

    public C08050Vl(AnonymousClass0VX r1) {
        this.mAnalyticsSessionHandler = r1;
    }
}
