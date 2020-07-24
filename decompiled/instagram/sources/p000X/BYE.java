package p000X;

/* renamed from: X.BYE */
public final class BYE extends C17920r1 {
    public final /* synthetic */ BYK A00;

    public BYE(BYK byk) {
        this.A00 = byk;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(1013135992);
        super.onFail(r3);
        this.A00.A03.A00();
        AnonymousClass0Z0.A0A(1038442055, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Integer num;
        Integer num2;
        int A03 = AnonymousClass0Z0.A03(-489216457);
        BYL byl = (BYL) obj;
        int A032 = AnonymousClass0Z0.A03(-278192019);
        C16180oA r8 = this.A00.A01;
        String str = byl.A01;
        Integer[] A002 = Constants.ZERO(2);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = Constants.ONE;
                break;
            }
            num = A002[i];
            if (BYM.A00(num).equals(str)) {
                break;
            }
            i++;
        }
        r8.A00.edit().putString("direct_message_reachability_one_to_one", BYM.A00(num)).apply();
        C16180oA r82 = this.A00.A01;
        String str2 = byl.A00;
        Integer[] A003 = Constants.ZERO(2);
        int length2 = A003.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                num2 = Constants.ONE;
                break;
            }
            num2 = A003[i2];
            if (BYM.A00(num2).equals(str2)) {
                break;
            }
            i2++;
        }
        r82.A00.edit().putString("direct_message_reachability_group_add", BYM.A00(num2)).apply();
        this.A00.A03.A00();
        AnonymousClass0Z0.A0A(-367100765, A032);
        AnonymousClass0Z0.A0A(1101814084, A03);
    }
}
