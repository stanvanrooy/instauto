package p000X;

import android.media.MediaPlayer;
import android.util.Base64;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.DD0 */
public final class DD0 extends C29841DDc {
    public MediaPlayer A00;

    public DD0(C29840DDb dDb, C29846DDh dDh) {
        super(dDb, dDh);
        C29865DEa[] dEaArr;
        int i = dDh.A0G;
        C29866DEb dEb = dDb.A0C.A01;
        if (dEb == null || (dEaArr = dEb.A01) == null) {
            throw new IllegalArgumentException("no assets/audio in the document");
        }
        C29865DEa dEa = dEaArr[i];
        if (dDb.A04 == null) {
            dDb.A04 = new HashSet();
        }
        dDb.A04.add(this);
        this.A00 = new MediaPlayer();
        try {
            this.A00.setDataSource(AnonymousClass000.A0E("data:audio;base64,", Base64.encodeToString(dEa.A00, 0)));
            this.A00.setOnCompletionListener(new C29839DDa(this));
            this.A00.setOnErrorListener(new DEF(this));
            this.A00.prepare();
        } catch (IOException unused) {
            this.A00 = null;
        }
    }
}
