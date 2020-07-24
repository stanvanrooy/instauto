package p000X;

import java.util.Map;

/* renamed from: X.DPJ */
public final class DPJ implements C88443sQ {
    public final /* synthetic */ DPG A00;

    public DPJ(DPG dpg) {
        this.A00 = dpg;
    }

    public final void B2h(Exception exc, Map map) {
        this.A00.A01.release();
        this.A00.A01.A0B.A02("start_recording_audio_failed", exc, "high");
        this.A00.A00.B2m(exc);
    }

    public final void onSuccess() {
        this.A00.A00.onSuccess();
    }
}
