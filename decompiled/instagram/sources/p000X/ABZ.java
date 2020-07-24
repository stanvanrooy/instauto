package p000X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.ABZ */
public final class ABZ {
    public static C228259s1 A00(int i, String str) {
        C228259s1 A03 = C23041A0r.A03();
        A03.putInt("code", i);
        if (str != null) {
            A03.putString(DialogModule.KEY_MESSAGE, str);
        }
        A03.putInt(AnonymousClass0C5.$const$string(170), 1);
        A03.putInt("POSITION_UNAVAILABLE", 2);
        A03.putInt("TIMEOUT", 3);
        return A03;
    }
}
