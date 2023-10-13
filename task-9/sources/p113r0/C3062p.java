package p113r0;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.List;

/* renamed from: r0.p */
final class C3062p {

    @FunctionalInterface
    /* renamed from: r0.p$a */
    interface C3063a {
        /* renamed from: a */
        void mo10375a(int i);
    }

    C3062p() {
    }

    /* renamed from: b */
    private List<ResolveInfo> m13754b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
    }

    /* renamed from: c */
    private boolean m13755c(Context context) {
        return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }

    /* renamed from: d */
    private boolean m13756d(Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return m13757e(context);
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }

    /* renamed from: e */
    private static boolean m13757e(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10380a(int i, Context context, C3063a aVar, C3045b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.mo10371a("PermissionHandler.ServiceManager", "Android context cannot be null.");
        } else if (i == 3 || i == 4 || i == 5) {
            aVar.mo10375a(m13756d(context) ? 1 : 0);
        } else if (i == 21) {
            aVar.mo10375a(m13755c(context) ? 1 : 0);
        } else {
            int i2 = 1;
            if (i == 8) {
                PackageManager packageManager = context.getPackageManager();
                if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                    aVar.mo10375a(2);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                    aVar.mo10375a(2);
                } else if (m13754b(packageManager).isEmpty()) {
                    aVar.mo10375a(2);
                } else if (telephonyManager.getSimState() != 5) {
                    aVar.mo10375a(0);
                } else {
                    aVar.mo10375a(1);
                }
            } else if (i == 16) {
                if (Build.VERSION.SDK_INT < 23) {
                    i2 = 2;
                }
                aVar.mo10375a(i2);
            } else {
                aVar.mo10375a(2);
            }
        }
    }
}
