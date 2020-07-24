package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexStore;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a2;
import p000X.AnonymousClass1L8;
import p000X.C229369xj;
import p000X.C229389xl;
import p000X.C229399xm;
import p000X.C229409xn;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    private final void A00(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        A05 = false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        RuntimeException runtimeException;
        if (!this.A03) {
            setResult(0);
            if (i == 40962) {
                Intent intent2 = intent;
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent2.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.A00) != null) {
                        C229389xl A002 = C229389xl.A00(this);
                        GoogleSignInOptions googleSignInOptions = this.A02.A00;
                        synchronized (A002) {
                            C229369xj r4 = A002.A02;
                            AnonymousClass0a2.A02(googleSignInAccount);
                            AnonymousClass0a2.A02(googleSignInOptions);
                            C229369xj.A04(r4, "defaultGoogleSignInAccount", googleSignInAccount.A07);
                            AnonymousClass0a2.A02(googleSignInAccount);
                            AnonymousClass0a2.A02(googleSignInOptions);
                            String str = googleSignInAccount.A07;
                            String A022 = C229369xj.A02("googleSignInAccount", str);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                String str2 = googleSignInAccount.A02;
                                String str3 = str2;
                                if (str2 != null) {
                                    jSONObject.put("id", str3);
                                }
                                String str4 = googleSignInAccount.A03;
                                String str5 = str4;
                                if (str4 != null) {
                                    jSONObject.put("tokenId", str5);
                                }
                                String str6 = googleSignInAccount.A04;
                                String str7 = str6;
                                if (str6 != null) {
                                    jSONObject.put(IgReactPurchaseExperienceBridgeModule.EMAIL, str7);
                                }
                                String str8 = googleSignInAccount.A05;
                                String str9 = str8;
                                if (str8 != null) {
                                    jSONObject.put("displayName", str9);
                                }
                                String str10 = googleSignInAccount.A08;
                                String str11 = str10;
                                if (str10 != null) {
                                    jSONObject.put("givenName", str11);
                                }
                                String str12 = googleSignInAccount.A09;
                                String str13 = str12;
                                if (str12 != null) {
                                    jSONObject.put("familyName", str13);
                                }
                                Uri uri = googleSignInAccount.A01;
                                if (uri != null) {
                                    jSONObject.put("photoUrl", uri.toString());
                                }
                                String str14 = googleSignInAccount.A06;
                                String str15 = str14;
                                if (str14 != null) {
                                    jSONObject.put("serverAuthCode", str15);
                                }
                                jSONObject.put("expirationTime", googleSignInAccount.A00);
                                jSONObject.put("obfuscatedIdentifier", googleSignInAccount.A07);
                                JSONArray jSONArray = new JSONArray();
                                List list = googleSignInAccount.A0A;
                                Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                                Arrays.sort(scopeArr, C229409xn.A00);
                                for (Scope scope : scopeArr) {
                                    jSONArray.put(scope.A00);
                                }
                                jSONObject.put("grantedScopes", jSONArray);
                                jSONObject.remove("serverAuthCode");
                                C229369xj.A04(r4, A022, jSONObject.toString());
                                String A023 = C229369xj.A02("googleSignInOptions", str);
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    JSONArray jSONArray2 = new JSONArray();
                                    Collections.sort(googleSignInOptions.A06, GoogleSignInOptions.A0A);
                                    ArrayList arrayList = googleSignInOptions.A06;
                                    int size = arrayList.size();
                                    int i3 = 0;
                                    while (i3 < size) {
                                        Object obj = arrayList.get(i3);
                                        i3++;
                                        jSONArray2.put(((Scope) obj).A00);
                                    }
                                    jSONObject2.put("scopes", jSONArray2);
                                    Account account = googleSignInOptions.A00;
                                    if (account != null) {
                                        jSONObject2.put("accountName", account.name);
                                    }
                                    jSONObject2.put("idTokenRequested", googleSignInOptions.A04);
                                    jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.A07);
                                    jSONObject2.put("serverAuthRequested", googleSignInOptions.A08);
                                    if (!TextUtils.isEmpty(googleSignInOptions.A01)) {
                                        jSONObject2.put("serverClientId", googleSignInOptions.A01);
                                    }
                                    if (!TextUtils.isEmpty(googleSignInOptions.A02)) {
                                        jSONObject2.put("hostedDomain", googleSignInOptions.A02);
                                    }
                                    C229369xj.A04(r4, A023, jSONObject2.toString());
                                    A002.A00 = googleSignInAccount;
                                    A002.A01 = googleSignInOptions;
                                } catch (JSONException e) {
                                    runtimeException = new RuntimeException(e);
                                    throw runtimeException;
                                }
                            } catch (JSONException e2) {
                                runtimeException = new RuntimeException(e2);
                                throw runtimeException;
                            }
                        }
                        intent2.removeExtra("signInAccount");
                        intent2.putExtra("googleSignInAccount", googleSignInAccount);
                        this.A04 = true;
                        this.A00 = i2;
                        this.A01 = intent2;
                        AnonymousClass1L8.A00(this).A03(0, (Bundle) null, new C229399xm(this));
                        A05 = false;
                        return;
                    } else if (intent2.hasExtra("errorCode")) {
                        int intExtra = intent2.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        A00(intExtra);
                        return;
                    }
                }
                A00(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = AnonymousClass0Z0.A00(-1639906415);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            A00(12500);
            i = -1030414423;
        } else {
            boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
            if (equals || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra(DexStore.CONFIG_FILENAME).getParcelable(DexStore.CONFIG_FILENAME);
                this.A02 = signInConfiguration;
                if (signInConfiguration == null) {
                    Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                    setResult(0);
                    finish();
                    i = -1680183990;
                } else {
                    boolean z = false;
                    if (bundle == null) {
                        z = true;
                    }
                    if (!z) {
                        boolean z2 = bundle.getBoolean("signingInGoogleApiClients");
                        this.A04 = z2;
                        if (z2) {
                            this.A00 = bundle.getInt("signInResultCode");
                            this.A01 = (Intent) bundle.getParcelable("signInResultData");
                            AnonymousClass1L8.A00(this).A03(0, (Bundle) null, new C229399xm(this));
                            A05 = false;
                        }
                        i = -541711958;
                    } else if (A05) {
                        setResult(0);
                        A00(12502);
                        i = -1174643578;
                    } else {
                        A05 = true;
                        Intent intent2 = new Intent(action);
                        if (equals) {
                            intent2.setPackage("com.google.android.gms");
                        } else {
                            intent2.setPackage(getPackageName());
                        }
                        intent2.putExtra(DexStore.CONFIG_FILENAME, this.A02);
                        try {
                            startActivityForResult(intent2, 40962);
                            i = -1314743039;
                        } catch (ActivityNotFoundException unused) {
                            this.A03 = true;
                            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                            A00(17);
                            AnonymousClass0Z0.A07(1417466859, A002);
                            return;
                        }
                    }
                }
            } else {
                String valueOf = String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    str = "Unknown action: ".concat(valueOf);
                } else {
                    str = new String("Unknown action: ");
                }
                Log.e("AuthSignInClient", str);
                finish();
                i = -677715940;
            }
        }
        AnonymousClass0Z0.A07(i, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}
