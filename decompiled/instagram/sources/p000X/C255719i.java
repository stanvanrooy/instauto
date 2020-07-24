package p000X;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: X.19i  reason: invalid class name and case insensitive filesystem */
public interface C255719i {
    boolean A2t(Spannable spannable, int i);

    boolean A2u(Spannable spannable, int i, int i2, int i3);

    InputConnection AAb(EditText editText, InputConnection inputConnection, EditorInfo editorInfo);

    KeyListener AAc(EditText editText, KeyListener keyListener);

    Typeface ALz();

    AnonymousClass2FL AWp();

    boolean AfD();

    CharSequence Aon(CharSequence charSequence, int i);
}
