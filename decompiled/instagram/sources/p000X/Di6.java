package p000X;

/* renamed from: X.Di6 */
public final class Di6 implements C40371oY, C30705Dht {
    public final C102374bQ A00;
    public final AnonymousClass3MV A01;
    public final String A02;
    public final C98404Mz A03;

    /* renamed from: equals */
    public final boolean Aep(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Di6)) {
            return false;
        }
        Di6 di6 = (Di6) obj;
        return C13150hy.A05(this.A02, di6.A02) && C13150hy.A05(this.A01, di6.A01) && C13150hy.A05(this.A00, di6.A00) && C13150hy.A05(AIv(), di6.AIv());
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AnonymousClass3MV r0 = this.A01;
        int hashCode2 = (hashCode + (r0 != null ? r0.hashCode() : 0)) * 31;
        C102374bQ r02 = this.A00;
        int hashCode3 = (hashCode2 + (r02 != null ? r02.hashCode() : 0)) * 31;
        C98404Mz AIv = AIv();
        if (AIv != null) {
            i = AIv.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "LiveViewerInviteWithTextMessageViewModel(id=" + this.A02 + ", replyContentViewModel=" + this.A01 + ", contextContentViewModel=" + this.A00 + ", contextReplyMessageDecorationsViewModel=" + AIv() + ")";
    }

    public Di6(String str, AnonymousClass3MV r3, C102374bQ r4, C98404Mz r5) {
        C13150hy.A02(str, "id");
        C13150hy.A02(r3, "replyContentViewModel");
        C13150hy.A02(r5, "contextReplyMessageDecorationsViewModel");
        this.A02 = str;
        this.A01 = r3;
        this.A00 = r4;
        this.A03 = r5;
    }

    public final /* bridge */ /* synthetic */ C74433Nw AIt() {
        return this.A00;
    }

    public final C98404Mz AIv() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C74433Nw AUG() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }
}
