package p000X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.AEM */
public abstract class AEM extends AEL {
    public int A00;
    public LayoutInflater A01;
    public int A02;

    public View A04(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A01.inflate(this.A02, viewGroup, false);
    }

    public AEM(Context context, int i) {
        super(context);
        this.A00 = i;
        this.A02 = i;
        this.A01 = (LayoutInflater) context.getSystemService(AnonymousClass0C5.$const$string(101));
    }
}
