package p019c2;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p063io.flutter.embedding.engine.FlutterJNI;
import p063io.flutter.view.C2301e;
import p121s2.C3112b;
import p121s2.C3115e;
import p162z1.C3623a;
import p162z1.C3627b;

/* renamed from: c2.d */
public class C1297d {

    /* renamed from: a */
    private boolean f4634a;

    /* renamed from: b */
    private C1300c f4635b;

    /* renamed from: c */
    private long f4636c;

    /* renamed from: d */
    private C1295b f4637d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public FlutterJNI f4638e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ExecutorService f4639f;

    /* renamed from: g */
    Future<C1299b> f4640g;

    /* renamed from: c2.d$a */
    class C1298a implements Callable<C1299b> {

        /* renamed from: a */
        final /* synthetic */ Context f4641a;

        C1298a(Context context) {
            this.f4641a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m6195c() {
            C1297d.this.f4638e.prefetchDefaultFontManager();
        }

        /* renamed from: b */
        public C1299b call() {
            C3115e.m13858a("FlutterLoader initTask");
            try {
                C1301e unused = C1297d.this.m6186g(this.f4641a);
                C1297d.this.f4638e.loadLibrary();
                C1297d.this.f4638e.updateRefreshRate();
                C1297d.this.f4639f.execute(new C1296c(this));
                return new C1299b(C3112b.m13856d(this.f4641a), C3112b.m13853a(this.f4641a), C3112b.m13855c(this.f4641a), (C1298a) null);
            } finally {
                C3115e.m13861d();
            }
        }
    }

    /* renamed from: c2.d$b */
    private static class C1299b {

        /* renamed from: a */
        final String f4643a;

        /* renamed from: b */
        final String f4644b;

        /* renamed from: c */
        final String f4645c;

        private C1299b(String str, String str2, String str3) {
            this.f4643a = str;
            this.f4644b = str2;
            this.f4645c = str3;
        }

        /* synthetic */ C1299b(String str, String str2, String str3, C1298a aVar) {
            this(str, str2, str3);
        }
    }

    /* renamed from: c2.d$c */
    public static class C1300c {

        /* renamed from: a */
        private String f4646a;

        /* renamed from: a */
        public String mo5129a() {
            return this.f4646a;
        }
    }

    public C1297d() {
        this(C3623a.m16080e().mo11894d().mo8309a());
    }

    public C1297d(FlutterJNI flutterJNI) {
        this(flutterJNI, C3623a.m16080e().mo11892b());
    }

    public C1297d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f4634a = false;
        this.f4638e = flutterJNI;
        this.f4639f = executorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C1301e m6186g(Context context) {
        return null;
    }

    /* renamed from: i */
    private static boolean m6187i(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    /* renamed from: d */
    public boolean mo5121d() {
        return this.f4637d.f4632g;
    }

    /* renamed from: e */
    public void mo5122e(Context context, String[] strArr) {
        if (!this.f4634a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.f4635b != null) {
                C3115e.m13858a("FlutterLoader#ensureInitializationComplete");
                try {
                    C1299b bVar = this.f4640g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb = new StringBuilder();
                    sb.append("--icu-native-lib-path=");
                    sb.append(this.f4637d.f4631f);
                    String str = File.separator;
                    sb.append(str);
                    sb.append("libflutter.so");
                    arrayList.add(sb.toString());
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--aot-shared-library-name=" + this.f4637d.f4626a);
                    arrayList.add("--aot-shared-library-name=" + this.f4637d.f4631f + str + this.f4637d.f4626a);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--cache-dir-path=");
                    sb2.append(bVar.f4644b);
                    arrayList.add(sb2.toString());
                    if (this.f4637d.f4630e != null) {
                        arrayList.add("--domain-network-policy=" + this.f4637d.f4630e);
                    }
                    if (this.f4635b.mo5129a() != null) {
                        arrayList.add("--log-tag=" + this.f4635b.mo5129a());
                    }
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                    if (i == 0) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        double d = (double) memoryInfo.totalMem;
                        Double.isNaN(d);
                        i = (int) ((d / 1000000.0d) / 2.0d);
                    }
                    arrayList.add("--old-gen-heap-size=" + i);
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null && bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                        arrayList.add("--enable-impeller");
                    }
                    String str2 = m6187i(bundle) ? "true" : "false";
                    arrayList.add("--leak-vm=" + str2);
                    this.f4638e.init(context, (String[]) arrayList.toArray(new String[0]), (String) null, bVar.f4643a, bVar.f4644b, SystemClock.uptimeMillis() - this.f4636c);
                    this.f4634a = true;
                    C3115e.m13861d();
                } catch (Exception e) {
                    C3627b.m16089c("FlutterLoader", "Flutter initialization failed.", e);
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    C3115e.m13861d();
                    throw th;
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        }
    }

    /* renamed from: f */
    public String mo5123f() {
        return this.f4637d.f4629d;
    }

    /* renamed from: h */
    public boolean mo5124h() {
        return this.f4634a;
    }

    /* renamed from: j */
    public void mo5125j(Context context) {
        mo5126k(context, new C1300c());
    }

    /* renamed from: k */
    public void mo5126k(Context context, C1300c cVar) {
        if (this.f4635b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C3115e.m13858a("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f4635b = cVar;
                    this.f4636c = SystemClock.uptimeMillis();
                    this.f4637d = C1294a.m6179e(applicationContext);
                    C2301e.m10761f((DisplayManager) applicationContext.getSystemService("display"), this.f4638e).mo8620g();
                    this.f4640g = this.f4639f.submit(new C1298a(applicationContext));
                } finally {
                    C3115e.m13861d();
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        }
    }
}
