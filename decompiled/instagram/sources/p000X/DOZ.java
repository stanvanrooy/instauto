package p000X;

import java.util.Locale;

/* renamed from: X.DOZ */
public final class DOZ {
    public final /* synthetic */ C30054DOj A00;

    public DOZ(C30054DOj dOj) {
        this.A00 = dOj;
    }

    public final void A00(byte[] bArr, int i, long j) {
        DPD dpd = this.A00.A04;
        if (dpd != null) {
            dpd.A00();
            C30054DOj dOj = this.A00;
            dOj.A04 = null;
            dOj.A0B.A00("recording_start_audio_finished");
        }
        if (this.A00.A0D) {
            this.A00.A01.A03(bArr, i, j);
            return;
        }
        String.format((Locale) null, "[DROP] Audio sample dropped at %d us", new Object[]{Long.valueOf(j)});
    }
}
