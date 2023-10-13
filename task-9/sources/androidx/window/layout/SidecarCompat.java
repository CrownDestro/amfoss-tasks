package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.C1200g;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p041f3.C1920g;
import p041f3.C1924k;
import p101p0.C2910f;
import p101p0.C2914h;
import p127t2.C3187s;

public final class SidecarCompat implements C1200g {

    /* renamed from: f */
    public static final C1190a f4184f = new C1190a((C1920g) null);

    /* renamed from: a */
    private final SidecarInterface f4185a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1220m f4186b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<IBinder, Activity> f4187c;

    /* renamed from: d */
    private final Map<Activity, ComponentCallbacks> f4188d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1200g.C1201a f4189e;

    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a */
        private final C1220m f4190a;

        /* renamed from: b */
        private final SidecarInterface.SidecarCallback f4191b;

        /* renamed from: c */
        private final ReentrantLock f4192c = new ReentrantLock();

        /* renamed from: d */
        private SidecarDeviceState f4193d;

        /* renamed from: e */
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f4194e = new WeakHashMap<>();

        public DistinctSidecarElementCallback(C1220m mVar, SidecarInterface.SidecarCallback sidecarCallback) {
            C1924k.m9141g(mVar, "sidecarAdapter");
            C1924k.m9141g(sidecarCallback, "callbackInterface");
            this.f4190a = mVar;
            this.f4191b = sidecarCallback;
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            C1924k.m9141g(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f4192c;
            reentrantLock.lock();
            try {
                if (!this.f4190a.mo5032a(this.f4193d, sidecarDeviceState)) {
                    this.f4193d = sidecarDeviceState;
                    this.f4191b.onDeviceStateChanged(sidecarDeviceState);
                    C3187s sVar = C3187s.f10561a;
                    reentrantLock.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            C1924k.m9141g(iBinder, "token");
            C1924k.m9141g(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.f4192c) {
                if (!this.f4190a.mo5033d(this.f4194e.get(iBinder), sidecarWindowLayoutInfo)) {
                    SidecarWindowLayoutInfo put = this.f4194e.put(iBinder, sidecarWindowLayoutInfo);
                    this.f4191b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            }
        }
    }

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a */
        final /* synthetic */ SidecarCompat f4195a;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            C1924k.m9141g(sidecarCompat, "this$0");
            this.f4195a = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface g;
            C1924k.m9141g(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = this.f4195a.f4187c.values();
            SidecarCompat sidecarCompat = this.f4195a;
            for (Activity activity : values) {
                IBinder a = SidecarCompat.f4184f.mo4989a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (!(a == null || (g = sidecarCompat.mo4981g()) == null)) {
                    sidecarWindowLayoutInfo = g.getWindowLayoutInfo(a);
                }
                C1200g.C1201a d = sidecarCompat.f4189e;
                if (d != null) {
                    d.mo4992a(activity, sidecarCompat.f4186b.mo5034e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            C1924k.m9141g(iBinder, "windowToken");
            C1924k.m9141g(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f4195a.f4187c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            C1220m e = this.f4195a.f4186b;
            SidecarInterface g = this.f4195a.mo4981g();
            SidecarDeviceState deviceState = g == null ? null : g.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            C1240v e2 = e.mo5034e(sidecarWindowLayoutInfo, deviceState);
            C1200g.C1201a d = this.f4195a.f4189e;
            if (d != null) {
                d.mo4992a(activity, e2);
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$a */
    public static final class C1190a {
        private C1190a() {
        }

        public /* synthetic */ C1190a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final IBinder mo4989a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        /* renamed from: b */
        public final SidecarInterface mo4990b(Context context) {
            C1924k.m9141g(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        /* renamed from: c */
        public final C2914h mo4991c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    return C2914h.f9654i.mo10090b(apiVersion);
                }
                return null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$b */
    private static final class C1191b implements C1200g.C1201a {

        /* renamed from: a */
        private final C1200g.C1201a f4196a;

        /* renamed from: b */
        private final ReentrantLock f4197b = new ReentrantLock();

        /* renamed from: c */
        private final WeakHashMap<Activity, C1240v> f4198c = new WeakHashMap<>();

        public C1191b(C1200g.C1201a aVar) {
            C1924k.m9141g(aVar, "callbackInterface");
            this.f4196a = aVar;
        }

        /* renamed from: a */
        public void mo4992a(Activity activity, C1240v vVar) {
            C1924k.m9141g(activity, "activity");
            C1924k.m9141g(vVar, "newLayout");
            ReentrantLock reentrantLock = this.f4197b;
            reentrantLock.lock();
            try {
                if (!C1924k.m9136b(vVar, this.f4198c.get(activity))) {
                    C1240v put = this.f4198c.put(activity, vVar);
                    reentrantLock.unlock();
                    this.f4196a.mo4992a(activity, vVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$c */
    private static final class C1192c implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        private final SidecarCompat f4199d;

        /* renamed from: e */
        private final WeakReference<Activity> f4200e;

        public C1192c(SidecarCompat sidecarCompat, Activity activity) {
            C1924k.m9141g(sidecarCompat, "sidecarCompat");
            C1924k.m9141g(activity, "activity");
            this.f4199d = sidecarCompat;
            this.f4200e = new WeakReference<>(activity);
        }

        public void onViewAttachedToWindow(View view) {
            C1924k.m9141g(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f4200e.get();
            IBinder a = SidecarCompat.f4184f.mo4989a(activity);
            if (activity != null && a != null) {
                this.f4199d.mo4983i(a, activity);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            C1924k.m9141g(view, "view");
        }
    }

    /* renamed from: androidx.window.layout.SidecarCompat$d */
    public static final class C1193d implements ComponentCallbacks {

        /* renamed from: d */
        final /* synthetic */ SidecarCompat f4201d;

        /* renamed from: e */
        final /* synthetic */ Activity f4202e;

        C1193d(SidecarCompat sidecarCompat, Activity activity) {
            this.f4201d = sidecarCompat;
            this.f4202e = activity;
        }

        public void onConfigurationChanged(Configuration configuration) {
            C1924k.m9141g(configuration, "newConfig");
            C1200g.C1201a d = this.f4201d.f4189e;
            if (d != null) {
                Activity activity = this.f4202e;
                d.mo4992a(activity, this.f4201d.mo4982h(activity));
            }
        }

        public void onLowMemory() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f4184f.mo4990b(context), new C1220m((C2910f.C2912b) null, 1, (C1920g) null));
        C1924k.m9141g(context, "context");
    }

    public SidecarCompat(SidecarInterface sidecarInterface, C1220m mVar) {
        C1924k.m9141g(mVar, "sidecarAdapter");
        this.f4185a = sidecarInterface;
        this.f4186b = mVar;
        this.f4187c = new LinkedHashMap();
        this.f4188d = new LinkedHashMap();
    }

    /* renamed from: j */
    private final void m5936j(Activity activity) {
        if (this.f4188d.get(activity) == null) {
            C1193d dVar = new C1193d(this, activity);
            this.f4188d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    /* renamed from: k */
    private final void m5937k(Activity activity) {
        activity.unregisterComponentCallbacks(this.f4188d.get(activity));
        this.f4188d.remove(activity);
    }

    /* renamed from: a */
    public void mo4978a(C1200g.C1201a aVar) {
        C1924k.m9141g(aVar, "extensionCallback");
        this.f4189e = new C1191b(aVar);
        SidecarInterface sidecarInterface = this.f4185a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f4186b, new TranslatingCallback(this)));
        }
    }

    /* renamed from: b */
    public void mo4979b(Activity activity) {
        SidecarInterface sidecarInterface;
        C1924k.m9141g(activity, "activity");
        IBinder a = f4184f.mo4989a(activity);
        if (a != null) {
            SidecarInterface sidecarInterface2 = this.f4185a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(a);
            }
            m5937k(activity);
            boolean z = this.f4187c.size() == 1;
            this.f4187c.remove(a);
            if (z && (sidecarInterface = this.f4185a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    /* renamed from: c */
    public void mo4980c(Activity activity) {
        C1924k.m9141g(activity, "activity");
        IBinder a = f4184f.mo4989a(activity);
        if (a != null) {
            mo4983i(a, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new C1192c(this, activity));
    }

    /* renamed from: g */
    public final SidecarInterface mo4981g() {
        return this.f4185a;
    }

    /* renamed from: h */
    public final C1240v mo4982h(Activity activity) {
        C1924k.m9141g(activity, "activity");
        IBinder a = f4184f.mo4989a(activity);
        if (a == null) {
            return new C1240v(C3263l.m14369f());
        }
        SidecarInterface sidecarInterface = this.f4185a;
        SidecarDeviceState sidecarDeviceState = null;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(a);
        C1220m mVar = this.f4186b;
        SidecarInterface sidecarInterface2 = this.f4185a;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return mVar.mo5034e(windowLayoutInfo, sidecarDeviceState);
    }

    /* renamed from: i */
    public final void mo4983i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        C1924k.m9141g(iBinder, "windowToken");
        C1924k.m9141g(activity, "activity");
        this.f4187c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f4185a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f4187c.size() == 1 && (sidecarInterface = this.f4185a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C1200g.C1201a aVar = this.f4189e;
        if (aVar != null) {
            aVar.mo4992a(activity, mo4982h(activity));
        }
        m5936j(activity);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:58|59|60|61|69|70|71|72|73|(2:75|(2:77|96)(2:78|79))(2:80|81)) */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0112 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0080 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0141 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0152 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016a A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0176 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0182 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4984l() {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            androidx.window.sidecar.SidecarInterface r2 = r8.f4185a     // Catch:{ all -> 0x019a }
            r3 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r3
            goto L_0x001c
        L_0x0009:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0010
            goto L_0x0007
        L_0x0010:
            java.lang.String r4 = "setSidecarCallback"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r6 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x001c:
            if (r2 != 0) goto L_0x0020
            r2 = r3
            goto L_0x0024
        L_0x0020:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x0024:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r4 = p041f3.C1924k.m9136b(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x018e
            androidx.window.sidecar.SidecarInterface r2 = r8.f4185a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            r2.getDeviceState()     // Catch:{ all -> 0x019a }
        L_0x0034:
            androidx.window.sidecar.SidecarInterface r2 = r8.f4185a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r2.onDeviceStateListenersChanged(r0)     // Catch:{ all -> 0x019a }
        L_0x003c:
            androidx.window.sidecar.SidecarInterface r2 = r8.f4185a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0042
        L_0x0040:
            r2 = r3
            goto L_0x0055
        L_0x0042:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0049
            goto L_0x0040
        L_0x0049:
            java.lang.String r4 = "getWindowLayoutInfo"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x0055:
            if (r2 != 0) goto L_0x0059
            r2 = r3
            goto L_0x005d
        L_0x0059:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x005d:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r4 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r4 = p041f3.C1924k.m9136b(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0182
            androidx.window.sidecar.SidecarInterface r2 = r8.f4185a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x006b
        L_0x0069:
            r2 = r3
            goto L_0x007e
        L_0x006b:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0072
            goto L_0x0069
        L_0x0072:
            java.lang.String r4 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x007e:
            if (r2 != 0) goto L_0x0082
            r2 = r3
            goto L_0x0086
        L_0x0082:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x0086:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r4 = p041f3.C1924k.m9136b(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0176
            androidx.window.sidecar.SidecarInterface r2 = r8.f4185a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0094
        L_0x0092:
            r2 = r3
            goto L_0x00a7
        L_0x0094:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x009b
            goto L_0x0092
        L_0x009b:
            java.lang.String r4 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x00a7:
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            java.lang.Class r3 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x00ae:
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r2 = p041f3.C1924k.m9136b(r3, r2)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x016a
            androidx.window.sidecar.SidecarDeviceState r2 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x019a }
            r2.<init>()     // Catch:{ all -> 0x019a }
            r3 = 3
            r2.posture = r3     // Catch:{ NoSuchFieldError -> 0x00bf }
            goto L_0x00f2
        L_0x00bf:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "setPosture"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x019a }
            r6[r1] = r7     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x019a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x019a }
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            r4.invoke(r2, r5)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "getPosture"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object r2 = r4.invoke(r2, r5)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x0162
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x019a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x019a }
            if (r2 != r3) goto L_0x015a
        L_0x00f2:
            androidx.window.sidecar.SidecarDisplayFeature r2 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x019a }
            r2.<init>()     // Catch:{ all -> 0x019a }
            android.graphics.Rect r3 = r2.getRect()     // Catch:{ all -> 0x019a }
            java.lang.String r4 = "displayFeature.rect"
            p041f3.C1924k.m9140f(r3, r4)     // Catch:{ all -> 0x019a }
            r2.setRect(r3)     // Catch:{ all -> 0x019a }
            r2.getType()     // Catch:{ all -> 0x019a }
            r2.setType(r0)     // Catch:{ all -> 0x019a }
            androidx.window.sidecar.SidecarWindowLayoutInfo r3 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x019a }
            r3.<init>()     // Catch:{ all -> 0x019a }
            java.util.List r1 = r3.displayFeatures     // Catch:{ NoSuchFieldError -> 0x0112 }
            goto L_0x019b
        L_0x0112:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x019a }
            r4.<init>()     // Catch:{ all -> 0x019a }
            r4.add(r2)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "setDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r6[r1] = r7     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x019a }
            r5[r1] = r4     // Catch:{ all -> 0x019a }
            r2.invoke(r3, r5)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "getDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x0152
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x019a }
            boolean r2 = p041f3.C1924k.m9136b(r4, r2)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x014a
            goto L_0x019b
        L_0x014a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Invalid display feature getter/setter"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0152:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x015a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Invalid device posture getter/setter"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0162:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x016a:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r2 = p041f3.C1924k.m9147m(r2, r3)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0176:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r2 = p041f3.C1924k.m9147m(r3, r2)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0182:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r2 = p041f3.C1924k.m9147m(r3, r2)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x018e:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r2 = p041f3.C1924k.m9147m(r3, r2)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r0 = 0
        L_0x019b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.mo4984l():boolean");
    }
}
