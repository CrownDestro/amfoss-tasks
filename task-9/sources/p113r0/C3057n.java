package p113r0;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.C0443b;
import androidx.core.app.C0462h;
import androidx.core.content.C0469a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p091n2.C2696k;
import p091n2.C2699n;

/* renamed from: r0.n */
final class C3057n implements C2696k, C2699n {

    /* renamed from: d */
    private C3059b f9975d;

    /* renamed from: e */
    private Activity f9976e;

    /* renamed from: f */
    private Map<Integer, Integer> f9977f;

    /* renamed from: g */
    private boolean f9978g = false;

    @FunctionalInterface
    /* renamed from: r0.n$a */
    interface C3058a {
        /* renamed from: a */
        void mo10372a(int i);
    }

    @FunctionalInterface
    /* renamed from: r0.n$b */
    interface C3059b {
        /* renamed from: a */
        void mo10373a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    /* renamed from: r0.n$c */
    interface C3060c {
        /* renamed from: a */
        void mo10374a(boolean z);
    }

    C3057n() {
    }

    /* renamed from: b */
    private int m13734b(Context context) {
        List<String> b = C3061o.m13747b(context, 21);
        if (!(b == null || b.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    /* renamed from: c */
    private int m13735c(Context context) {
        return Build.VERSION.SDK_INT < 33 ? C0462h.m2157b(context).mo2440a() ? 1 : 0 : context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? 1 : 0;
    }

    /* renamed from: e */
    private int m13736e(int i, Context context) {
        if (i == 17) {
            return m13735c(context);
        }
        if (i == 21) {
            return m13734b(context);
        }
        if ((i == 30 || i == 28 || i == 29) && Build.VERSION.SDK_INT < 31) {
            return m13734b(context);
        }
        List<String> b = C3061o.m13747b(context, i);
        if (b == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i);
            return 1;
        } else if (b.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + b + i);
            if (i == 16 && Build.VERSION.SDK_INT < 23) {
                return 2;
            }
            if (i != 22 || Build.VERSION.SDK_INT >= 30) {
                return Build.VERSION.SDK_INT < 23 ? 1 : 0;
            }
            return 2;
        } else {
            boolean z = context.getApplicationInfo().targetSdkVersion >= 23;
            for (String next : b) {
                if (z) {
                    if (i == 16) {
                        String packageName = context.getPackageName();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (Build.VERSION.SDK_INT >= 23) {
                            return (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) ? 0 : 1;
                        }
                        return 2;
                    } else if (i == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            return 2;
                        }
                        return Environment.isExternalStorageManager() ? 1 : 0;
                    } else if (i == 23 && Build.VERSION.SDK_INT >= 23) {
                        return Settings.canDrawOverlays(context) ? 1 : 0;
                    } else {
                        if (i == 24 && Build.VERSION.SDK_INT >= 26) {
                            return context.getPackageManager().canRequestPackageInstalls() ? 1 : 0;
                        }
                        if (i == 27 && Build.VERSION.SDK_INT >= 23) {
                            return ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0;
                        }
                        if (i == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                return ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms() ? 1 : 0;
                            }
                            return 1;
                        } else if (C0469a.m2171a(context, next) != 0) {
                            return 0;
                        }
                    }
                }
            }
            return 1;
        }
    }

    /* renamed from: f */
    private void m13737f(String str, int i) {
        String packageName = this.f9976e.getPackageName();
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setData(Uri.parse("package:" + packageName));
        this.f9976e.startActivityForResult(intent, i);
    }

    /* renamed from: g */
    private void m13738g(String str, int i) {
        this.f9976e.startActivityForResult(new Intent(str), i);
    }

    /* renamed from: a */
    public boolean mo7770a(int i, int i2, Intent intent) {
        if (i != 209 && i != 210 && i != 211 && i != 212 && i != 213) {
            return false;
        }
        boolean z = i2 == -1;
        int i3 = 23;
        if (i == 209) {
            i3 = 16;
        } else if (i == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            z = Environment.isExternalStorageManager();
            i3 = 22;
        } else if (i == 211) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            z = Settings.canDrawOverlays(this.f9976e);
        } else if (i == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            z = this.f9976e.getPackageManager().canRequestPackageInstalls();
            i3 = 24;
        } else if (i != 213 || Build.VERSION.SDK_INT < 23) {
            return false;
        } else {
            z = ((NotificationManager) this.f9976e.getSystemService("notification")).isNotificationPolicyAccessGranted();
            i3 = 27;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(i3), Integer.valueOf(z ? 1 : 0));
        this.f9975d.mo10373a(hashMap);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10377d(int i, Context context, C3058a aVar) {
        aVar.mo10372a(m13736e(i, context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10378h(List<Integer> list, Activity activity, C3059b bVar, C3045b bVar2) {
        int i;
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2;
        int i2;
        int i3;
        String str;
        String str2;
        if (this.f9978g) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        } else {
            this.f9975d = bVar;
            this.f9976e = activity;
            this.f9977f = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = list.iterator();
            while (true) {
                int i4 = 1;
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                if (m13736e(next.intValue(), activity) != 1) {
                    List<String> b = C3061o.m13747b(activity, next.intValue());
                    if (b != null && !b.isEmpty()) {
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 23 && next.intValue() == 16) {
                            i3 = 209;
                            str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                        } else if (i5 >= 30 && next.intValue() == 22) {
                            i3 = 210;
                            str = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                        } else if (i5 >= 23 && next.intValue() == 23) {
                            i3 = 211;
                            str = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                        } else if (i5 >= 26 && next.intValue() == 24) {
                            i3 = 212;
                            str = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                        } else if (i5 < 23 || next.intValue() != 27) {
                            arrayList.addAll(b);
                        } else {
                            m13738g("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                        }
                        m13737f(str, i3);
                    } else if (!this.f9977f.containsKey(next)) {
                        i4 = 2;
                        if (next.intValue() != 16 || Build.VERSION.SDK_INT >= 23) {
                            map = this.f9977f;
                            i = 0;
                        } else {
                            map = this.f9977f;
                            i = 2;
                        }
                        map.put(next, i);
                        if (next.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                            map2 = this.f9977f;
                            i2 = 0;
                            map2.put(next, i2);
                        }
                    }
                } else if (this.f9977f.containsKey(next)) {
                }
                map2 = this.f9977f;
                i2 = Integer.valueOf(i4);
                map2.put(next, i2);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (arrayList.size() > 0) {
                this.f9978g = true;
                C0443b.m2115k(activity, strArr, 24);
                return;
            }
            this.f9978g = false;
            if (this.f9977f.size() > 0) {
                bVar.mo10373a(this.f9977f);
                return;
            }
            return;
        }
        bVar2.mo10371a("PermissionHandler.PermissionManager", str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo10379i(int i, Activity activity, C3060c cVar, C3045b bVar) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.mo10371a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> b = C3061o.m13747b(activity, i);
        if (b == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i);
            cVar.mo10374a(false);
        } else if (b.isEmpty()) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + i + " no need to show request rationale");
            cVar.mo10374a(false);
        } else {
            cVar.mo10374a(C0443b.m2116l(activity, b.get(0)));
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        Map<Integer, Integer> map;
        int i3;
        Map<Integer, Integer> map2;
        int valueOf;
        if (i != 24) {
            this.f9978g = false;
            return false;
        } else if (this.f9977f == null) {
            return false;
        } else {
            for (int i4 = 0; i4 < strArr.length; i4++) {
                String str = strArr[i4];
                int f = C3061o.m13751f(str);
                if (f != 20) {
                    int i5 = iArr[i4];
                    if (f == 7) {
                        if (!this.f9977f.containsKey(7)) {
                            this.f9977f.put(7, Integer.valueOf(C3061o.m13752g(this.f9976e, str, i5)));
                        }
                        if (!this.f9977f.containsKey(14)) {
                            map2 = this.f9977f;
                            valueOf = 14;
                        }
                        C3061o.m13753h(this.f9976e, f);
                    } else {
                        if (f == 4) {
                            i3 = C3061o.m13752g(this.f9976e, str, i5);
                            if (!this.f9977f.containsKey(4)) {
                                map = this.f9977f;
                                i2 = 4;
                            }
                            C3061o.m13753h(this.f9976e, f);
                        } else if (f == 3) {
                            i3 = C3061o.m13752g(this.f9976e, str, i5);
                            if (Build.VERSION.SDK_INT < 29 && !this.f9977f.containsKey(4)) {
                                this.f9977f.put(4, Integer.valueOf(i3));
                            }
                            if (!this.f9977f.containsKey(5)) {
                                this.f9977f.put(5, Integer.valueOf(i3));
                            }
                            map = this.f9977f;
                            i2 = Integer.valueOf(f);
                        } else {
                            if (!this.f9977f.containsKey(Integer.valueOf(f))) {
                                map2 = this.f9977f;
                                valueOf = Integer.valueOf(f);
                            }
                            C3061o.m13753h(this.f9976e, f);
                        }
                        map.put(i2, Integer.valueOf(i3));
                        C3061o.m13753h(this.f9976e, f);
                    }
                    map2.put(valueOf, Integer.valueOf(C3061o.m13752g(this.f9976e, str, i5)));
                    C3061o.m13753h(this.f9976e, f);
                }
            }
            this.f9975d.mo10373a(this.f9977f);
            this.f9978g = false;
            return true;
        }
    }
}
