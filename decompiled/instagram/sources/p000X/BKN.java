package p000X;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BKN */
public class BKN {
    public List A00(Object obj) {
        if (!(this instanceof BIO)) {
            return Collections.emptyList();
        }
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return new ArrayList(googleSignInOptions.A06);
    }
}
