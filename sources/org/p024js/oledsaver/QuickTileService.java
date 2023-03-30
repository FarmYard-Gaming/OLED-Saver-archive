package org.p024js.oledsaver;

import android.preference.PreferenceManager;
import android.service.quicksettings.TileService;
import android.util.Log;
import org.p024js.oledsaver.p031e.C0720i;

/* renamed from: org.js.oledsaver.QuickTileService */
public class QuickTileService extends TileService {

    /* renamed from: a */
    private final String f2329a = "QuickSettingService";

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3307a() {
        if (getQsTile() != null) {
            if (C0720i.m3491b(this)) {
                getQsTile().setState(2);
            } else {
                getQsTile().setState(1);
            }
            getQsTile().updateTile();
        }
    }

    public void onClick() {
        PreferenceManager.getDefaultSharedPreferences(this);
        if (C0720i.m3491b(this)) {
            C0720i.m3489a(this, false);
        } else {
            C0720i.m3489a(this, true);
        }
    }

    public void onStartListening() {
        mo3307a();
    }

    public void onStopListening() {
        Log.d("QuickSettingService", "onStopListening");
    }

    public void onTileAdded() {
        mo3307a();
    }

    public void onTileRemoved() {
    }
}
