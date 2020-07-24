package p000X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CH4 */
public final class CH4 {
    public final ImageUrl A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final String toString() {
        return "AskQuestionsUiState{showAskQuestionsSheet=" + this.A02 + ", showSubmitQuestion=" + this.A03 + ", avatarUrl='" + this.A00 + '\'' + ", infoLabel='" + this.A01 + '\'' + '}';
    }

    public CH4(boolean z, boolean z2, ImageUrl imageUrl, String str) {
        this.A02 = z;
        this.A03 = z2;
        this.A00 = imageUrl;
        this.A01 = str;
    }
}
