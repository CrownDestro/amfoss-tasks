package p115r2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Map;
import p063io.flutter.plugins.urllauncher.WebViewActivity;
import p115r2.C3068a;

/* renamed from: r2.h */
final class C3079h implements C3068a.C3070b {

    /* renamed from: a */
    private final Context f9998a;

    /* renamed from: b */
    private final C3080a f9999b;

    /* renamed from: c */
    private Activity f10000c;

    /* renamed from: r2.h$a */
    interface C3080a {
        /* renamed from: a */
        String mo10407a(Intent intent);
    }

    C3079h(Context context) {
        this(context, new C3078g(context));
    }

    C3079h(Context context, C3080a aVar) {
        this.f9998a = context;
        this.f9999b = aVar;
    }

    /* renamed from: f */
    private void m13802f() {
        if (this.f10000c == null) {
            throw new C3068a.C3069a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", (Object) null);
        }
    }

    /* renamed from: g */
    private static Bundle m13803g(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m13804h(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    /* renamed from: a */
    public void mo10396a() {
        this.f9998a.sendBroadcast(new Intent("close action"));
    }

    /* renamed from: b */
    public Boolean mo10397b(String str, Map<String, String> map) {
        m13802f();
        try {
            this.f10000c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", m13803g(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: c */
    public Boolean mo10398c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String a = this.f9999b.mo10407a(intent);
        return a == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(a));
    }

    /* renamed from: d */
    public Boolean mo10399d(String str, C3068a.C3072d dVar) {
        m13802f();
        try {
            this.f10000c.startActivity(WebViewActivity.m10581a(this.f10000c, str, dVar.mo10401c().booleanValue(), dVar.mo10400b().booleanValue(), m13803g(dVar.mo10402d())));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo10408i(Activity activity) {
        this.f10000c = activity;
    }
}
