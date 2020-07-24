package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.url.UrlHandlerActivity;

/* renamed from: X.0f4  reason: invalid class name and case insensitive filesystem */
public final class C11500f4 implements C11330en {
    public final boolean BdY() {
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        if (r6.equals("recent") == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e7, code lost:
        if (r6.equals("pinned") == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        if (r6.equals("profile_shop") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fd, code lost:
        if (r6.equals("shopping_editorial") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
        if (r6.equals("shipping_and_returns") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        if (r6.equals("product_details_page") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011f, code lost:
        if (r6.equals("product_collection") == false) goto L_0x0013;
     */
    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r20) {
        char c;
        char c2;
        String str;
        Bundle bundle2 = bundle;
        String string = bundle2.getString("SHOPPING_URL_TYPE");
        switch (string.hashCode()) {
            case -1610081298:
                c = 4;
                break;
            case -1310090308:
                c = 0;
                break;
            case 164424138:
                c = 1;
                break;
            case 1154460592:
                c = 2;
                break;
            case 1223863244:
                c = 3;
                break;
            default:
                c = 65535;
                break;
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (c == 0) {
            String string2 = bundle2.getString("entry_point");
            if (string2 == null) {
                string2 = "deep_link";
            }
            String string3 = bundle2.getString("business_user_id");
            String string4 = bundle2.getString("business_username");
            String string5 = bundle2.getString("product_id");
            AnonymousClass0C1 A03 = C05210Iq.A03(r20);
            String string6 = bundle2.getString("deep_link_launch_mode");
            if (!(A03 == null || string6 == null)) {
                AnonymousClass6N6 r5 = new AnonymousClass6N6(C215239Pk.A00(A03).A00);
                int hashCode = string6.hashCode();
                if (hashCode == -988146728) {
                    c2 = 0;
                } else if (hashCode == -934918565) {
                    c2 = 1;
                }
                c2 = 65535;
                if (c2 == 0) {
                    str = "pinned";
                } else if (c2 == 1) {
                    str = "recent";
                }
                AnonymousClass6N7 A00 = AnonymousClass6N6.A00(r5, str);
                if (A00 != null) {
                    string3 = A00.A00;
                    string4 = A00.A01;
                    string5 = A00.A02;
                }
            }
            C213969Km A0R = C17510qM.A00.A0R(fragmentActivity2, string5, string3, string4, C05210Iq.A02(r20), new C140185yz(this, bundle2), string2, (String) null);
            A0R.A0G = true;
            A0R.A03();
            if (fragmentActivity2 instanceof UrlHandlerActivity) {
                fragmentActivity2.finish();
            }
        } else if (c == 1) {
            C17510qM r3 = C17510qM.A00;
            AnonymousClass0C1 A02 = C05210Iq.A02(r20);
            String string7 = bundle2.getString("product_id");
            AnonymousClass0a4.A06(string7);
            String string8 = bundle2.getString("merchant_id");
            AnonymousClass0a4.A06(string8);
            r3.A15(fragmentActivity2, A02, string7, string8);
        } else if (c == 2) {
            String string9 = bundle2.getString("prior_module");
            if (string9 == null) {
                string9 = "deep_link";
            }
            C215649Re A0O = C17510qM.A00.A0O(fragmentActivity2, C05210Iq.A02(r20), (String) null, string9, AnonymousClass9Q3.EDITORIAL);
            A0O.A0G = null;
            String string10 = bundle2.getString("media_id");
            AnonymousClass0a4.A06(string10);
            A0O.A0A = string10;
            String string11 = bundle2.getString("id");
            AnonymousClass0a4.A06(string11);
            A0O.A07 = string11;
            A0O.A0J = true;
            A0O.A0K = true;
            A0O.A0H = true;
            A0O.A00();
        } else if (c == 3) {
            C140195z0 r11 = new C140195z0(this);
            C17510qM r7 = C17510qM.A00;
            AnonymousClass0C1 A022 = C05210Iq.A02(r20);
            String string12 = bundle2.getString("entry_point");
            String string13 = bundle2.getString("merchant_id");
            AnonymousClass0a4.A06(string13);
            String string14 = bundle2.getString("merchant_username");
            AnonymousClass0a4.A06(string14);
            r7.A0U(fragmentActivity2, A022, "deep_link", r11, (String) null, string12, "deep_link", string13, string14).A02();
        } else if (c == 4) {
            C215649Re A0O2 = C17510qM.A00.A0O(fragmentActivity2, C05210Iq.A02(r20), (String) null, "deep_link", AnonymousClass9Q3.PRODUCT_COLLECTION);
            String string15 = bundle2.getString("collection_id");
            AnonymousClass0a4.A06(string15);
            C215709Rk A002 = C215709Rk.A00(bundle2.getString("collection_type"));
            A0O2.A0E = string15;
            A0O2.A04 = A002;
            String string16 = bundle2.getString(DialogModule.KEY_TITLE);
            AnonymousClass0a4.A06(string16);
            A0O2.A0G = string16;
            A0O2.A0K = true;
            A0O2.A00();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r3.equals("product_collection") == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r3.equals("product_details_page") == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r3.equals("product_display_page") == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r3.equals("shipping_and_returns") == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r3.equals("shopping_editorial") == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r3.equals("profile_shop") == false) goto L_0x003a;
     */
    public final Bundle A7i(String str, C06590Pq r18) {
        char c;
        String str2;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!"ig".equalsIgnoreCase(scheme) && !"instagram".equalsIgnoreCase(scheme)) {
            return null;
        }
        Bundle bundle = new Bundle();
        String host = parse.getHost();
        switch (host.hashCode()) {
            case -1610081298:
                c = 5;
                break;
            case -1310090308:
                c = 0;
                break;
            case -1120828100:
                c = 1;
                break;
            case 164424138:
                c = 2;
                break;
            case 1154460592:
                c = 3;
                break;
            case 1223863244:
                c = 4;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            bundle.putString("SHOPPING_URL_TYPE", "product_details_page");
            bundle.putString("product_id", parse.getQueryParameter("product_id"));
            bundle.putString("business_user_id", parse.getQueryParameter("business_user_id"));
            bundle.putString("business_username", parse.getQueryParameter("business_username"));
            bundle.putString("prior_module", parse.getQueryParameter("prior_module"));
            bundle.putString("entry_point", parse.getQueryParameter("entry_point"));
            str2 = "deep_link_launch_mode";
        } else {
            str2 = "merchant_id";
            if (c == 2) {
                bundle.putString("SHOPPING_URL_TYPE", "shipping_and_returns");
                bundle.putString("product_id", parse.getQueryParameter("product_id"));
            } else if (c == 3) {
                bundle.putString("SHOPPING_URL_TYPE", "shopping_editorial");
                bundle.putString("id", parse.getQueryParameter("id"));
                bundle.putString("media_id", parse.getQueryParameter("media_id"));
                bundle.putString("prior_module", parse.getQueryParameter("prior_module"));
                return bundle;
            } else if (c == 4) {
                bundle.putString("SHOPPING_URL_TYPE", "profile_shop");
                bundle.putString(str2, parse.getQueryParameter(str2));
                bundle.putString("merchant_username", parse.getQueryParameter("merchant_username"));
                bundle.putString("entry_point", parse.getQueryParameter("entry_point"));
                return bundle;
            } else if (c != 5) {
                return null;
            } else {
                bundle.putString("SHOPPING_URL_TYPE", "product_collection");
                bundle.putString("collection_id", parse.getQueryParameter("collection_id"));
                bundle.putString("collection_type", parse.getQueryParameter("collection_type"));
                str2 = DialogModule.KEY_TITLE;
            }
        }
        bundle.putString(str2, parse.getQueryParameter(str2));
        return bundle;
    }
}
