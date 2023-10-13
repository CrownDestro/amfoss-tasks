package p113r0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* renamed from: r0.a */
final class C3043a {

    @FunctionalInterface
    /* renamed from: r0.a$a */
    interface C3044a {
        /* renamed from: a */
        void mo10370a(boolean z);
    }

    C3043a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10369a(Context context, C3044a aVar, C3045b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.mo10371a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            aVar.mo10370a(true);
        } catch (Exception unused) {
            aVar.mo10370a(false);
        }
    }
}
