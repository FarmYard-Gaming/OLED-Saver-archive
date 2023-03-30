package android.support.p018v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p006v4.p007a.C0068a;
import android.support.p006v4.widget.C0348k;
import android.support.p018v7.p019a.C0353a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.ao */
class C0568ao extends C0348k implements View.OnClickListener {

    /* renamed from: j */
    private final SearchManager f2052j = ((SearchManager) this.f967d.getSystemService("search"));

    /* renamed from: k */
    private final SearchView f2053k;

    /* renamed from: l */
    private final SearchableInfo f2054l;

    /* renamed from: m */
    private final Context f2055m;

    /* renamed from: n */
    private final WeakHashMap<String, Drawable.ConstantState> f2056n;

    /* renamed from: o */
    private final int f2057o;

    /* renamed from: p */
    private boolean f2058p = false;

    /* renamed from: q */
    private int f2059q = 1;

    /* renamed from: r */
    private ColorStateList f2060r;

    /* renamed from: s */
    private int f2061s = -1;

    /* renamed from: t */
    private int f2062t = -1;

    /* renamed from: u */
    private int f2063u = -1;

    /* renamed from: v */
    private int f2064v = -1;

    /* renamed from: w */
    private int f2065w = -1;

    /* renamed from: x */
    private int f2066x = -1;

    /* renamed from: android.support.v7.widget.ao$a */
    private static final class C0569a {

        /* renamed from: a */
        public final TextView f2067a;

        /* renamed from: b */
        public final TextView f2068b;

        /* renamed from: c */
        public final ImageView f2069c;

        /* renamed from: d */
        public final ImageView f2070d;

        /* renamed from: e */
        public final ImageView f2071e;

        public C0569a(View view) {
            this.f2067a = (TextView) view.findViewById(16908308);
            this.f2068b = (TextView) view.findViewById(16908309);
            this.f2069c = (ImageView) view.findViewById(16908295);
            this.f2070d = (ImageView) view.findViewById(16908296);
            this.f2071e = (ImageView) view.findViewById(C0353a.C0359f.edit_query);
        }
    }

    public C0568ao(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f2053k = searchView;
        this.f2054l = searchableInfo;
        this.f2057o = searchView.getSuggestionCommitIconResId();
        this.f2055m = context;
        this.f2056n = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m2784a(ComponentName componentName) {
        Drawable.ConstantState constantState = null;
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f2056n.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f2056n.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f2055m.getResources());
        }
        Drawable b = m2791b(componentName);
        if (b != null) {
            constantState = b.getConstantState();
        }
        this.f2056n.put(flattenToShortString, constantState);
        return b;
    }

    /* renamed from: a */
    private Drawable m2785a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2055m.getPackageName() + "/" + parseInt;
            Drawable b = m2793b(str2);
            if (b != null) {
                return b;
            }
            Drawable a = C0068a.m208a(this.f2055m, parseInt);
            m2790a(str2, a);
            return a;
        } catch (NumberFormatException e) {
            Drawable b2 = m2793b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable b3 = m2792b(Uri.parse(str));
            m2790a(str, b3);
            return b3;
        } catch (Resources.NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: a */
    private static String m2786a(Cursor cursor, int i) {
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

    /* renamed from: a */
    public static String m2787a(Cursor cursor, String str) {
        return m2786a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m2788a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m2789a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m2790a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2056n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m2791b(ComponentName componentName) {
        PackageManager packageManager = this.f967d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m2792b(Uri uri) {
        InputStream openInputStream;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                return mo2943a(uri);
            }
            openInputStream = this.f2055m.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, (String) null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (IOException e) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                return createFromStream;
            }
        } catch (Resources.NotFoundException e2) {
            throw new FileNotFoundException("Resource does not exist: " + uri);
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (IOException e4) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
            }
            throw th;
        }
    }

    /* renamed from: b */
    private Drawable m2793b(String str) {
        Drawable.ConstantState constantState = this.f2056n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: b */
    private CharSequence m2794b(CharSequence charSequence) {
        if (this.f2060r == null) {
            TypedValue typedValue = new TypedValue();
            this.f967d.getTheme().resolveAttribute(C0353a.C0354a.textColorSearchUrl, typedValue, true);
            this.f2060r = this.f967d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f2060r, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    private void m2795d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: e */
    private Drawable m2796e(Cursor cursor) {
        if (this.f2064v == -1) {
            return null;
        }
        Drawable a = m2785a(cursor.getString(this.f2064v));
        return a == null ? m2798g(cursor) : a;
    }

    /* renamed from: f */
    private Drawable m2797f(Cursor cursor) {
        if (this.f2065w == -1) {
            return null;
        }
        return m2785a(cursor.getString(this.f2065w));
    }

    /* renamed from: g */
    private Drawable m2798g(Cursor cursor) {
        Drawable a = m2784a(this.f2054l.getSearchActivity());
        return a != null ? a : this.f967d.getPackageManager().getDefaultActivityIcon();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo2942a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f967d.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr, (String) null);
    }

    /* renamed from: a */
    public Cursor mo1467a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2053k.getVisibility() != 0 || this.f2053k.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor a = mo2942a(this.f2054l, charSequence2, 50);
            if (a != null) {
                a.getCount();
                return a;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo2943a(Uri uri) {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f967d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: a */
    public View mo1468a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo1468a(context, cursor, viewGroup);
        a.setTag(new C0569a(a));
        ((ImageView) a.findViewById(C0353a.C0359f.edit_query)).setImageResource(this.f2057o);
        return a;
    }

    /* renamed from: a */
    public void mo2944a(int i) {
        this.f2059q = i;
    }

    /* renamed from: a */
    public void mo1470a(Cursor cursor) {
        if (this.f2058p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1470a(cursor);
            if (cursor != null) {
                this.f2061s = cursor.getColumnIndex("suggest_text_1");
                this.f2062t = cursor.getColumnIndex("suggest_text_2");
                this.f2063u = cursor.getColumnIndex("suggest_text_2_url");
                this.f2064v = cursor.getColumnIndex("suggest_icon_1");
                this.f2065w = cursor.getColumnIndex("suggest_icon_2");
                this.f2066x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public void mo1471a(View view, Context context, Cursor cursor) {
        C0569a aVar = (C0569a) view.getTag();
        int i = this.f2066x != -1 ? cursor.getInt(this.f2066x) : 0;
        if (aVar.f2067a != null) {
            m2789a(aVar.f2067a, (CharSequence) m2786a(cursor, this.f2061s));
        }
        if (aVar.f2068b != null) {
            String a = m2786a(cursor, this.f2063u);
            CharSequence b = a != null ? m2794b((CharSequence) a) : m2786a(cursor, this.f2062t);
            if (TextUtils.isEmpty(b)) {
                if (aVar.f2067a != null) {
                    aVar.f2067a.setSingleLine(false);
                    aVar.f2067a.setMaxLines(2);
                }
            } else if (aVar.f2067a != null) {
                aVar.f2067a.setSingleLine(true);
                aVar.f2067a.setMaxLines(1);
            }
            m2789a(aVar.f2068b, b);
        }
        if (aVar.f2069c != null) {
            m2788a(aVar.f2069c, m2796e(cursor), 4);
        }
        if (aVar.f2070d != null) {
            m2788a(aVar.f2070d, m2797f(cursor), 8);
        }
        if (this.f2059q == 2 || (this.f2059q == 1 && (i & 1) != 0)) {
            aVar.f2071e.setVisibility(0);
            aVar.f2071e.setTag(aVar.f2067a.getText());
            aVar.f2071e.setOnClickListener(this);
            return;
        }
        aVar.f2071e.setVisibility(8);
    }

    /* renamed from: c */
    public CharSequence mo1475c(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m2787a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f2054l.shouldRewriteQueryFromData() && (a2 = m2787a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f2054l.shouldRewriteQueryFromText() || (a = m2787a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo1473b(this.f967d, this.f966c, viewGroup);
            if (b != null) {
                ((C0569a) b.getTag()).f2067a.setText(e.toString());
            }
            return b;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo1468a(this.f967d, this.f966c, viewGroup);
            if (a != null) {
                ((C0569a) a.getTag()).f2067a.setText(e.toString());
            }
            return a;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2795d(mo1466a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2795d(mo1466a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2053k.mo2521a((CharSequence) tag);
        }
    }
}
