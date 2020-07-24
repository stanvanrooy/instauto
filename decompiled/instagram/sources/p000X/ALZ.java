package p000X;

import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.IgCallModel;

/* renamed from: X.ALZ */
public final class ALZ implements C64582ri {
    public static final ALZ A00 = new ALZ();

    public final Object apply(Object obj) {
        String str;
        IgCallModel igCallModel;
        EngineModel engineModel = ((C208028wF) obj).A00;
        Integer num = null;
        if (engineModel == null || (igCallModel = engineModel.callModel) == null) {
            str = null;
        } else {
            str = igCallModel.instagramVideoCallId;
        }
        if (engineModel != null) {
            num = Integer.valueOf(engineModel.state);
        }
        return new C235010q(str, num);
    }
}
