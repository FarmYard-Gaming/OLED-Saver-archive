package org.p024js.oledsaver;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.SwitchPreference;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import org.p024js.oledsaver.activity.ModelOffsetActivity;
import org.p024js.oledsaver.activity.WizardActivity;
import org.p024js.oledsaver.p031e.C0720i;
import org.p024js.oledsaver.p031e.C0725l;
import org.p024js.oledsaver.view.p033a.C0752c;
import org.p024js.oledsaver.view.p033a.C0755e;
import org.p024js.oledsaver.view.p033a.C0758f;
import org.p024js.oledsaver.view.p033a.C0762h;

/* renamed from: org.js.oledsaver.e */
public class C0706e extends PreferenceFragment implements Observer {

    /* renamed from: a */
    private final String f2594a = getClass().getSimpleName();

    /* renamed from: b */
    private SwitchPreference f2595b;

    /* renamed from: c */
    private Preference f2596c;

    /* renamed from: d */
    private Preference f2597d;

    /* renamed from: e */
    private Preference f2598e;

    /* renamed from: f */
    private Preference f2599f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Context f2600g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0666b f2601h;

    /* renamed from: i */
    private boolean f2602i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ListView f2603j;

    /* renamed from: k */
    private Map<Integer, Integer> f2604k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public View f2605l;

    /* renamed from: a */
    private void m3452a(float f) {
        if (Float.compare(f, -1.0f) == 0) {
            this.f2596c.setTitle(getResources().getString(R.string.lux) + ": n/a");
        } else {
            this.f2596c.setTitle(getResources().getString(R.string.lux) + ": " + f);
        }
    }

    /* renamed from: a */
    private void m3453a(int i) {
        this.f2597d.setTitle(getResources().getString(R.string.brightness) + ": " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3510a() {
        if (this.f2604k == null) {
            this.f2604k = new LinkedHashMap();
        }
        this.f2604k.clear();
        this.f2604k.put(0, Integer.valueOf(R.string.help_text_service));
        this.f2604k.put(3, Integer.valueOf(R.string.help_text_pixel_filter));
        this.f2604k.put(4, Integer.valueOf(R.string.help_text_min_brightness));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3511a(View view) {
        if (this.f2604k.entrySet().iterator().hasNext()) {
            Map.Entry next = this.f2604k.entrySet().iterator().next();
            this.f2604k.remove(next.getKey());
            int i = -1;
            if (((Integer) next.getKey()).intValue() == 0) {
                i = R.drawable.notification_sample;
            }
            mo3512a(this.f2603j.getChildAt(((Integer) next.getKey()).intValue()), getResources().getString(((Integer) next.getValue()).intValue()), view, ((Integer) next.getKey()).intValue() < this.f2603j.getChildCount() / 2, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3512a(View view, String str, final View view2, boolean z, int i) {
        if (view != null) {
            C0758f fVar = new C0758f();
            fVar.mo3597a(view).mo3596a(200).mo3601b(30).mo3603c(0).mo3600a(false).mo3602b(false);
            fVar.mo3599a((C0758f.C0759a) new C0758f.C0759a() {
                /* renamed from: a */
                public void mo3524a() {
                }

                /* renamed from: b */
                public void mo3525b() {
                    C0706e.this.mo3511a(view2);
                }
            });
            fVar.mo3598a((C0752c) new C0762h(str, z, i));
            C0755e a = fVar.mo3595a();
            a.mo3585a(true);
            a.mo3582a(getActivity(), view2);
        }
    }

    /* renamed from: b */
    public void mo3513b() {
        if (this.f2605l != null) {
            mo3510a();
            mo3511a(this.f2605l);
        }
    }

    public void onAttach(Activity activity) {
        Log.d(this.f2594a, "on attach");
        super.onAttach(activity);
        this.f2600g = activity.getApplicationContext();
        PreferenceManager.setDefaultValues(this.f2600g, R.xml.preferences, false);
        this.f2601h = C0666b.m3223a(getActivity().getApplicationContext());
        this.f2601h.mo3388b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences);
        this.f2595b = (SwitchPreference) findPreference("serviceEnabled");
        this.f2596c = findPreference("lux");
        this.f2598e = findPreference("brightnessCorrection");
        this.f2597d = findPreference("brightness");
        this.f2598e.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference) {
                if (C0720i.m3491b(C0706e.this.f2600g)) {
                    Intent intent = new Intent();
                    intent.setClass(C0706e.this.f2600g, ModelOffsetActivity.class);
                    C0706e.this.startActivity(intent);
                    return true;
                }
                C0725l.m3505a(C0706e.this.f2600g, C0706e.this.getString(R.string.brightness_correction_notify));
                return true;
            }
        });
        this.f2599f = findPreference("miniumScreenBrightness");
        this.f2599f.setTitle(getResources().getString(R.string.minimum_screen_brightness) + ":" + this.f2601h.mo3402g());
        this.f2599f.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                preference.setTitle(C0706e.this.getResources().getString(R.string.minimum_screen_brightness) + ":" + Integer.valueOf(String.valueOf(obj)).intValue());
                return true;
            }
        });
        this.f2595b.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public boolean onPreferenceChange(Preference preference, Object obj) {
                C0720i.m3489a(C0706e.this.getActivity(), ((Boolean) obj).booleanValue());
                return true;
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null) {
            onCreateView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    ViewTreeObserver viewTreeObserver = onCreateView.getViewTreeObserver();
                    ListView unused = C0706e.this.f2603j = (ListView) onCreateView.findViewById(16908298);
                    try {
                        View unused2 = C0706e.this.f2605l = (View) C0706e.this.f2603j.getParent().getParent().getParent().getParent();
                    } catch (Exception e) {
                        View unused3 = C0706e.this.f2605l = null;
                    }
                    if (C0706e.this.f2601h == null) {
                        C0666b unused4 = C0706e.this.f2601h = C0666b.m3223a(C0706e.this.getActivity().getApplicationContext());
                    }
                    if (C0706e.this.f2601h.mo3394c()) {
                        C0706e.this.f2601h.mo3395d();
                        Intent intent = new Intent();
                        intent.setClass(C0706e.this.getActivity(), WizardActivity.class);
                        C0706e.this.startActivity(intent);
                    }
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            });
        }
        return onCreateView;
    }

    public void onPause() {
        Log.d(this.f2594a, "on pause");
        if (this.f2601h != null) {
            this.f2601h.deleteObserver(this);
        }
        super.onPause();
    }

    public void onResume() {
        Log.d(this.f2594a, "on resume");
        super.onResume();
        if (this.f2601h != null) {
            this.f2602i = false;
            this.f2601h.addObserver(this);
            update(this.f2601h, (Object) null);
            this.f2602i = true;
        }
    }

    public void update(Observable observable, Object obj) {
        if (obj == null) {
            Log.d(this.f2594a, "update UI fragment: all fields");
            m3452a(this.f2601h.mo3412p());
            m3453a(this.f2601h.mo3410o());
            boolean b = C0720i.m3491b(this.f2600g);
            if (b != this.f2595b.isChecked()) {
                this.f2595b.setChecked(b);
                return;
            }
            return;
        }
        String str = (String) obj;
        Log.d(this.f2594a, "update fragment: " + str);
        if ("serviceEnabled".equals(str)) {
            boolean b2 = C0720i.m3491b(this.f2600g);
            if (b2 != this.f2595b.isChecked()) {
                this.f2595b.setChecked(b2);
            }
        } else if ("userAdjustment".equals(str)) {
        } else {
            if ("lux".equals(str)) {
                m3452a(this.f2601h.mo3412p());
                m3453a(this.f2601h.mo3410o());
            } else if ("brightness".equals(str)) {
                m3453a(this.f2601h.mo3410o());
            }
        }
    }
}
