package android.support.p006v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: android.support.v4.app.u */
public final class C0162u {
    /* renamed from: a */
    public static Intent m745a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String b = m748b(activity);
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, b);
        try {
            return m749b((Context) activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b + "' in manifest");
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m746a(Context context, ComponentName componentName) {
        String b = m749b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return m749b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: a */
    public static boolean m747a(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }

    /* renamed from: b */
    public static String m748b(Activity activity) {
        try {
            return m749b((Context) activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public static String m749b(Context context, ComponentName componentName) {
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        return string.charAt(0) == '.' ? context.getPackageName() + string : string;
    }

    /* renamed from: b */
    public static void m750b(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }
}
