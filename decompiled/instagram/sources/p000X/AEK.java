package p000X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.facebook.C0003R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.AEK */
public final class AEK extends AEM implements View.OnClickListener {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public ColorStateList A07;
    public final SearchableInfo A08;
    public final Context A09;
    public final SearchView A0A;
    public final WeakHashMap A0B;
    public final int A0C;

    public static Drawable A00(AEK aek, String str) {
        Uri parse;
        FileNotFoundException th;
        InputStream openInputStream;
        FileNotFoundException fileNotFoundException;
        int i;
        Drawable drawable;
        Drawable drawable2 = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String A0K = AnonymousClass000.A0K("android.resource://", aek.A09.getPackageName(), "/", parseInt);
                Drawable.ConstantState constantState = (Drawable.ConstantState) aek.A0B.get(A0K);
                if (constantState == null) {
                    drawable = null;
                } else {
                    drawable = constantState.newDrawable();
                }
                if (drawable != null) {
                    return drawable;
                }
                Drawable A032 = C019000b.A03(aek.A09, parseInt);
                if (A032 != null) {
                    aek.A0B.put(A0K, A032.getConstantState());
                }
                return A032;
            } catch (NumberFormatException unused) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) aek.A0B.get(str);
                if (constantState2 != null) {
                    drawable2 = constantState2.newDrawable();
                }
                if (drawable2 == null) {
                    parse = Uri.parse(str);
                    drawable2 = null;
                    if ("android.resource".equals(parse.getScheme())) {
                        String authority = parse.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            try {
                                Resources resourcesForApplication = aek.A01.getPackageManager().getResourcesForApplication(authority);
                                List<String> pathSegments = parse.getPathSegments();
                                if (pathSegments != null) {
                                    int size = pathSegments.size();
                                    if (size == 1) {
                                        try {
                                            i = Integer.parseInt(pathSegments.get(0));
                                        } catch (NumberFormatException unused2) {
                                            fileNotFoundException = new FileNotFoundException("Single path segment is not a resource ID: " + parse);
                                            throw fileNotFoundException;
                                        }
                                    } else if (size == 2) {
                                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                                    } else {
                                        fileNotFoundException = new FileNotFoundException("More than two path segments: " + parse);
                                    }
                                    if (i != 0) {
                                        drawable2 = resourcesForApplication.getDrawable(i);
                                    } else {
                                        fileNotFoundException = new FileNotFoundException("No resource found for: " + parse);
                                    }
                                } else {
                                    fileNotFoundException = new FileNotFoundException("No path: " + parse);
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                                fileNotFoundException = new FileNotFoundException("No package found for authority: " + parse);
                            }
                        } else {
                            fileNotFoundException = new FileNotFoundException("No authority: " + parse);
                        }
                        throw fileNotFoundException;
                    }
                    openInputStream = aek.A09.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, (String) null);
                        try {
                            openInputStream.close();
                        } catch (IOException e) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e);
                        }
                        drawable2 = createFromStream;
                    } else {
                        th = new FileNotFoundException("Failed to open " + parse);
                    }
                }
            } catch (Resources.NotFoundException unused4) {
                Log.w("SuggestionsAdapter", AnonymousClass000.A0E("Icon resource not found: ", str));
                return null;
            } catch (Resources.NotFoundException unused5) {
                th = new FileNotFoundException("Resource does not exist: " + parse);
            } catch (FileNotFoundException e2) {
                Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e2.getMessage());
            } catch (Throwable th2) {
                th = th2;
                try {
                    openInputStream.close();
                } catch (IOException e3) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e3);
                }
            }
        }
        return drawable2;
        throw th;
        if (drawable2 != null) {
            aek.A0B.put(str, drawable2.getConstantState());
        }
        return drawable2;
    }

    public static String A01(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public AEK(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.A0X);
        this.A0A = searchView;
        this.A08 = searchableInfo;
        this.A0C = searchView.A0W;
        this.A09 = context;
        this.A0B = weakHashMap;
    }

    public final void A8H(Cursor cursor) {
        try {
            super.A8H(cursor);
            if (cursor != null) {
                this.A04 = cursor.getColumnIndex("suggest_text_1");
                this.A05 = cursor.getColumnIndex("suggest_text_2");
                this.A06 = cursor.getColumnIndex("suggest_text_2_url");
                this.A01 = cursor.getColumnIndex("suggest_icon_1");
                this.A02 = cursor.getColumnIndex("suggest_icon_2");
                this.A00 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final View A04(Context context, Cursor cursor, ViewGroup viewGroup) {
        View A042 = super.A04(context, cursor, viewGroup);
        A042.setTag(new AEP(A042));
        ((ImageView) A042.findViewById(C0003R.C0005id.edit_query)).setImageResource(this.A0C);
        return A042;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A022 = A02(this.A01, this.A02, viewGroup);
            if (A022 != null) {
                ((AEP) A022.getTag()).A03.setText(e.toString());
            }
            return A022;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A042 = A04(this.A01, this.A02, viewGroup);
            if (A042 != null) {
                ((AEP) A042.getTag()).A03.setText(e.toString());
            }
            return A042;
        }
    }

    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor AJh = AJh();
        if (AJh != null) {
            bundle = AJh.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor AJh = AJh();
        if (AJh != null) {
            bundle = AJh.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(1438073736);
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0A.A0I((CharSequence) tag);
        }
        AnonymousClass0Z0.A0C(553628035, A052);
    }
}
