package p000X;

/* renamed from: X.CNH */
public final class CNH implements AnonymousClass662 {
    public final /* synthetic */ CNB A00;

    public final void onSearchCleared(String str) {
    }

    public CNH(CNB cnb) {
        this.A00 = cnb;
    }

    public final void onSearchTextChanged(String str) {
        Integer num;
        CP8 cp8 = this.A00.A03;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        if (!cp8.A01.equals(str2) || cp8.A03.isEmpty()) {
            num = Constants.ZERO;
        } else {
            num = Constants.A0Y;
        }
        cp8.A00 = num;
        cp8.A01 = str2;
        cp8.notifyDataSetChanged();
        C27726COu cOu = this.A00.A06;
        if (str == null) {
            str = "";
        }
        cOu.A04(str);
    }
}
