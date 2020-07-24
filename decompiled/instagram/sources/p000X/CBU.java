package p000X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.CBU */
public final class CBU {
    public static void A00(CBV cbv, AnonymousClass0RU r4) {
        if (cbv.A0E) {
            AnonymousClass0P4 A00 = AnonymousClass0P4.A00("ig_client_network_trace", (AnonymousClass0RN) null);
            A00.A0C("bandwidth", Double.valueOf(cbv.A0F));
            A00.A0G(IgReactNavigatorModule.URL, cbv.A0G);
            A00.A0G("client_request_uuid", cbv.A0B);
            A00.A0G(TraceFieldType.HTTPMethod, cbv.A0A);
            A00.A0F("upload_started_ts", Long.valueOf(cbv.A07));
            A00.A0F("bytes_up_expected", Long.valueOf(cbv.A04));
            A00.A0F("upload_finished_ts", Long.valueOf(cbv.A06));
            A00.A0F("download_started_ts", Long.valueOf(cbv.A03));
            A00.A0F("download_finished_ts", Long.valueOf(cbv.A02));
            A00.A0F("bytes_down_expected", Long.valueOf(cbv.A05));
            A00.A0A("did_succeed", Boolean.valueOf(cbv.A0C));
            A00.A0E(TraceFieldType.StatusCode, Integer.valueOf(cbv.A01));
            A00.A0E("request_type_sampling_rate", Integer.valueOf(cbv.A00));
            A00.A0G(TraceFieldType.ContentType, cbv.A08.A00);
            r4.BcG(A00);
        }
    }
}
