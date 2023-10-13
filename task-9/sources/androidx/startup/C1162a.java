package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071k0.C2350a;
import p071k0.C2351b;
import p071k0.C2352c;
import p077l0.C2459a;

/* renamed from: androidx.startup.a */
public final class C1162a {

    /* renamed from: d */
    private static volatile C1162a f4062d;

    /* renamed from: e */
    private static final Object f4063e = new Object();

    /* renamed from: a */
    final Map<Class<?>, Object> f4064a = new HashMap();

    /* renamed from: b */
    final Set<Class<? extends C2350a<?>>> f4065b = new HashSet();

    /* renamed from: c */
    final Context f4066c;

    C1162a(Context context) {
        this.f4066c = context.getApplicationContext();
    }

    /* renamed from: d */
    private <T> T m5780d(Class<? extends C2350a<?>> cls, Set<Class<?>> set) {
        T t;
        if (C2459a.m11415h()) {
            try {
                C2459a.m11410c(cls.getSimpleName());
            } catch (Throwable th) {
                C2459a.m11413f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f4064a.containsKey(cls)) {
                set.add(cls);
                C2350a aVar = (C2350a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends C2350a<?>>> a = aVar.mo3072a();
                if (!a.isEmpty()) {
                    for (Class next : a) {
                        if (!this.f4064a.containsKey(next)) {
                            m5780d(next, set);
                        }
                    }
                }
                t = aVar.mo3073b(this.f4066c);
                set.remove(cls);
                this.f4064a.put(cls, t);
            } else {
                t = this.f4064a.get(cls);
            }
            C2459a.m11413f();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    /* renamed from: e */
    public static C1162a m5781e(Context context) {
        if (f4062d == null) {
            synchronized (f4063e) {
                if (f4062d == null) {
                    f4062d = new C1162a(context);
                }
            }
        }
        return f4062d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4774a() {
        try {
            C2459a.m11410c("Startup");
            mo4775b(this.f4066c.getPackageManager().getProviderInfo(new ComponentName(this.f4066c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            C2459a.m11413f();
        } catch (PackageManager.NameNotFoundException e) {
            throw new C2352c((Throwable) e);
        } catch (Throwable th) {
            C2459a.m11413f();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4775b(Bundle bundle) {
        String string = this.f4066c.getString(C2351b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (C2350a.class.isAssignableFrom(cls)) {
                            this.f4065b.add(cls);
                        }
                    }
                }
                for (Class<? extends C2350a<?>> d : this.f4065b) {
                    m5780d(d, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new C2352c((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo4776c(Class<? extends C2350a<?>> cls) {
        T t;
        synchronized (f4063e) {
            t = this.f4064a.get(cls);
            if (t == null) {
                t = m5780d(cls, new HashSet());
            }
        }
        return t;
    }

    /* renamed from: f */
    public <T> T mo4777f(Class<? extends C2350a<T>> cls) {
        return mo4776c(cls);
    }

    /* renamed from: g */
    public boolean mo4778g(Class<? extends C2350a<?>> cls) {
        return this.f4065b.contains(cls);
    }
}
