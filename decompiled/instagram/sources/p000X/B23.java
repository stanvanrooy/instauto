package p000X;

import java.util.Locale;

/* renamed from: X.B23 */
public final class B23 implements B2X {
    public final /* synthetic */ C25115B1l A00;

    public B23(C25115B1l b1l) {
        this.A00 = b1l;
    }

    public final void BDd(AV6 av6) {
        C25124B2a b2a = this.A00.A01;
        av6.A00(String.format(Locale.US, "(function(d, s, id){    var sdkURL = \"%s\";    var js, fjs = d.getElementsByTagName(s)[0];    if (d.getElementById(id) || 'FBExtensions' in window) {return;}    js = d.createElement(s); js.id = id;    js.src = sdkURL;    fjs.parentNode.insertBefore(js, fjs);}(document, 'script', 'facebook-platform-extensions-sdk'));", new Object[]{b2a.A00}));
    }
}
