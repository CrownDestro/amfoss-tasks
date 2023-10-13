package p036e5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p036e5.C1819c;
import p036e5.C1828f;

/* renamed from: e5.q */
class C1876q {

    /* renamed from: c */
    private static final C1876q f6770c = m8994e();

    /* renamed from: a */
    private final boolean f6771a;
    @Nullable

    /* renamed from: b */
    private final Constructor<MethodHandles.Lookup> f6772b;

    /* renamed from: e5.q$a */
    static final class C1877a extends C1876q {

        /* renamed from: e5.q$a$a */
        static final class C1878a implements Executor {

            /* renamed from: d */
            private final Handler f6773d = new Handler(Looper.getMainLooper());

            C1878a() {
            }

            public void execute(Runnable runnable) {
                this.f6773d.post(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1877a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        /* renamed from: b */
        public Executor mo7557b() {
            return new C1878a();
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: g */
        public Object mo7560g(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return C1876q.super.mo7560g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    C1876q(boolean z) {
        this.f6771a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f6772b = constructor;
    }

    /* renamed from: e */
    private static C1876q m8994e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new C1877a() : new C1876q(true);
    }

    /* renamed from: f */
    static C1876q m8995f() {
        return f6770c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<? extends C1819c.C1820a> mo7556a(@Nullable Executor executor) {
        C1830g gVar = new C1830g(executor);
        if (!this.f6771a) {
            return Collections.singletonList(gVar);
        }
        return Arrays.asList(new C1819c.C1820a[]{C1822e.f6662a, gVar});
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public Executor mo7557b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<? extends C1828f.C1829a> mo7558c() {
        return this.f6771a ? Collections.singletonList(C1856o.f6723a) : Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo7559d() {
        return this.f6771a ? 1 : 0;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    @IgnoreJRERequirement
    /* renamed from: g */
    public Object mo7560g(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f6772b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* access modifiers changed from: package-private */
    @IgnoreJRERequirement
    /* renamed from: h */
    public boolean mo7561h(Method method) {
        return this.f6771a && method.isDefault();
    }
}
