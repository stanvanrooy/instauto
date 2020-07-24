package p000X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0003R;
import java.net.HttpCookie;
import java.util.List;
import java.util.Map;

/* renamed from: X.1j0  reason: invalid class name and case insensitive filesystem */
public final class C37031j0 {
    public static void A01(C06590Pq r15, C28691Ms r16, String str) {
        String A05;
        AnonymousClass0C1 r0;
        String value;
        C18280rb r02;
        Float f;
        C28691Ms r1 = r16;
        List<AnonymousClass40I> list = r1.mSystemMessages;
        C06590Pq r11 = r15;
        if (list != null) {
            for (AnonymousClass40I r8 : list) {
                synchronized (C253618m.class) {
                    String str2 = r8.A01;
                    C253518l r5 = (C253518l) C253618m.A00.get(str2);
                    if (r5 != null) {
                        C05760Lv r3 = C05760Lv.A01;
                        String A0E = AnonymousClass000.A0E("system_message_", str2);
                        if (r3.A00.contains(A0E)) {
                            f = Float.valueOf(r3.A00.getFloat(A0E, -1.0f));
                        } else {
                            f = null;
                        }
                        Float f2 = r8.A00;
                        if (f == null || f.floatValue() < f2.floatValue()) {
                            r3.A00.edit().putFloat(AnonymousClass000.A0E("system_message_", str2), f2.floatValue()).apply();
                            r5.accept(r15);
                        }
                    }
                }
            }
        }
        if (!r1.isOk() && !r15.Abj()) {
            if (r15.AgN() && !C05210Iq.A02(r15).A02) {
                return;
            }
            if (r1.isFeedbackRequired() && (r02 = C18280rb.A00) != null) {
                r02.A01(new C33201cX(r15.getToken(), r1.mFeedbackTitle, r1.mFeedbackMessage, r1.mFeedbackAppealLabel, r1.mFeedbackAction, r1.mFeedbackIgnoreLabel, r1.mFeedbackUrl));
            } else if (r1.isLoginRequired()) {
                HttpCookie A01 = AnonymousClass1BD.A01(r15, "sessionid");
                if (A01 == null) {
                    value = null;
                } else {
                    value = A01.getValue();
                }
                C16140o6.A00.A00(r11, "login_required_response_from_server", r1.mErrorTitle, r1.mErrorBody, r1.mLogoutReason, value, str);
            } else if (r1.isCheckpointRequired()) {
                C139215xF r2 = r1.mCheckpoint;
                if (r2 == null) {
                    String str3 = r1.mCheckpointUrl;
                    if (TextUtils.isEmpty(str3)) {
                        AnonymousClass0QD.A01("checkpoint", "Checkpoint is required but none was provided.");
                        return;
                    }
                    r2 = new C139215xF(str3, !r1.mLockCheckpointDialog);
                }
                C139205xE A00 = C17970r6.A00(r15);
                if (A00 != null) {
                    Context context = StoredPreferences.A00;
                    synchronized (A00) {
                        if (!A00.A00 && !A00.A02) {
                            C06590Pq r12 = A00.A04;
                            if (r12.AgN()) {
                                r0 = C05210Iq.A02(r12);
                            } else {
                                r0 = null;
                            }
                            if (r0 != null) {
                                C23300zv.A00(r0).BXT(new C31051Wg());
                            }
                            if (r2.A06) {
                                A00.A00 = true;
                                C138915w3 r9 = new C138915w3(A00, context, r2);
                                C138925w4.A02 = r2.A01;
                                C138925w4.A03 = Uri.parse(r2.A00).getQueryParameter("challenge_node_id");
                                String str4 = r2.A00;
                                int indexOf = str4.indexOf("challenge/");
                                if (indexOf >= 0) {
                                    String[] split = str4.substring(indexOf).split("/");
                                    if (split.length >= 3) {
                                        C138925w4.A01 = split[1];
                                        C138925w4.A00 = split[2];
                                    }
                                }
                                C138925w4.A00(context, A00.A04, "challenge/", Constants.A0N, r9, (Map) null);
                            } else {
                                C139205xE.A00(A00, context, r2);
                            }
                        }
                    }
                }
            } else if (r1.isConsentRequired()) {
                C30762DjK djK = r1.mConsentData;
                if (djK != null) {
                    C139205xE A002 = C17970r6.A00(r15);
                    if (A002 != null) {
                        Context context2 = StoredPreferences.A00;
                        synchronized (A002) {
                            if (A002.A01 && !A002.A00 && !A002.A03 && (A05 = C05210Iq.A05(A002.A04)) != null && C05210Iq.A02(A002.A04).A05.Ady(A05)) {
                                Bundle bundle = new Bundle();
                                bundle.putString("ConsentFragment.param.headline", djK.A02);
                                bundle.putString("ConsentFragment.param.content", djK.A01);
                                bundle.putString("ConsentFragment.param.button.text", djK.A00);
                                A002.A03 = true;
                                C138885w0 A012 = C16960pS.A00.A01(Constants.ONE, bundle);
                                A012.A02 = 335544320;
                                A012.A03 = A002.A04.getToken();
                                A012.A00(context2);
                            }
                        }
                        return;
                    }
                    return;
                }
                AnonymousClass0QD.A01("consent", "consent data is required but none was provided.");
            }
        }
    }

    public static String A00(Context context, C43791v5 r3) {
        String str;
        if (r3.A03()) {
            str = ((C28691Ms) r3.A00).getErrorMessage();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return context.getString(C0003R.string.network_error);
    }
}
