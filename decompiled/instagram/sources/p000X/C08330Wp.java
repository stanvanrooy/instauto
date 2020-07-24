package p000X;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.0Wp  reason: invalid class name and case insensitive filesystem */
public abstract class C08330Wp extends IntentService {
    public C10980eE A00;
    public AnonymousClass0UR A01 = new AnonymousClass0UR(this);

    public abstract void A00();

    public abstract void A01(Intent intent);

    public abstract void A02(String str);

    public abstract void A03(String str, boolean z);

    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction())) {
                    intent.toString();
                    AnonymousClass0UR r0 = this.A01;
                    if (AnonymousClass0TR.A01(r0.A00, AnonymousClass0UR.A00(intent))) {
                        String stringExtra = intent.getStringExtra("receive_type");
                        if (DialogModule.KEY_MESSAGE.equals(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("token");
                            String string = this.A00.A00.getString("token_key", "");
                            intent.getStringExtra("extra_notification_id");
                            if (TextUtils.isEmpty(string) || string.equals(stringExtra2)) {
                                A01(intent);
                            } else {
                                AnonymousClass0DB.A0E("FbnsCallbackHandlerBase", "Dropping unintended message.");
                            }
                        } else if ("registered".equals(stringExtra)) {
                            String stringExtra3 = intent.getStringExtra("data");
                            C11000eG A002 = this.A00.A00();
                            A002.A00.putString("token_key", stringExtra3);
                            A002.A00.apply();
                            A03(stringExtra3, AnonymousClass0UP.A01(AnonymousClass0UR.A00(intent)));
                        } else if ("reg_error".equals(stringExtra)) {
                            A02(intent.getStringExtra("data"));
                        } else if (!"deleted".equals(stringExtra)) {
                            if ("unregistered".equals(stringExtra)) {
                                A00();
                            } else {
                                AnonymousClass0DB.A0D("FbnsCallbackHandlerBase", "Unknown message type");
                            }
                        }
                    }
                }
            } finally {
                C07320Sp.A00(intent);
            }
        }
    }

    public C08330Wp(String str) {
        super(str);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(-483181011);
        this.A00 = new C10960eC(this).A00(Constants.A03);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0Z0.A0B(-860283456, A04);
        return onStartCommand;
    }
}
