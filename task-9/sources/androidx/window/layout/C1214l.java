package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import p027d3.C1737a;
import p034e3.C1769a;
import p041f3.C1924k;
import p041f3.C1925l;
import p041f3.C1933t;
import p074k3.C2385b;
import p127t2.C3172f;

/* renamed from: androidx.window.layout.l */
public final class C1214l {

    /* renamed from: a */
    public static final C1214l f4233a = new C1214l();

    /* renamed from: b */
    private static final C3172f f4234b = C3174h.m14049a(C1219e.f4239e);

    /* renamed from: androidx.window.layout.l$a */
    static final class C1215a extends C1925l implements C1769a<Boolean> {

        /* renamed from: e */
        final /* synthetic */ ClassLoader f4235e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1215a(ClassLoader classLoader) {
            super(0);
            this.f4235e = classLoader;
        }

        /* renamed from: a */
        public final Boolean mo3839c() {
            C1214l lVar = C1214l.f4233a;
            Class d = lVar.m5990l(this.f4235e);
            boolean z = false;
            Method method = d.getMethod("getBounds", new Class[0]);
            Method method2 = d.getMethod("getType", new Class[0]);
            Method method3 = d.getMethod("getState", new Class[0]);
            C1924k.m9140f(method, "getBoundsMethod");
            if (lVar.m5989k(method, C1933t.m9161b(Rect.class)) && lVar.m5992o(method)) {
                C1924k.m9140f(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (lVar.m5989k(method2, C1933t.m9161b(cls)) && lVar.m5992o(method2)) {
                    C1924k.m9140f(method3, "getStateMethod");
                    if (lVar.m5989k(method3, C1933t.m9161b(cls)) && lVar.m5992o(method3)) {
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: androidx.window.layout.l$b */
    static final class C1216b extends C1925l implements C1769a<Boolean> {

        /* renamed from: e */
        final /* synthetic */ ClassLoader f4236e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1216b(ClassLoader classLoader) {
            super(0);
            this.f4236e = classLoader;
        }

        /* renamed from: a */
        public final Boolean mo3839c() {
            C1214l lVar = C1214l.f4233a;
            boolean z = false;
            Method method = lVar.m5997t(this.f4236e).getMethod("getWindowLayoutComponent", new Class[0]);
            Class h = lVar.m5999v(this.f4236e);
            C1924k.m9140f(method, "getWindowLayoutComponentMethod");
            if (lVar.m5992o(method)) {
                C1924k.m9140f(h, "windowLayoutComponentClass");
                if (lVar.m5988j(method, h)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: androidx.window.layout.l$c */
    static final class C1217c extends C1925l implements C1769a<Boolean> {

        /* renamed from: e */
        final /* synthetic */ ClassLoader f4237e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1217c(ClassLoader classLoader) {
            super(0);
            this.f4237e = classLoader;
        }

        /* renamed from: a */
        public final Boolean mo3839c() {
            C1214l lVar = C1214l.f4233a;
            Class h = lVar.m5999v(this.f4237e);
            boolean z = false;
            Method method = h.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, Consumer.class});
            Method method2 = h.getMethod("removeWindowLayoutInfoListener", new Class[]{Consumer.class});
            C1924k.m9140f(method, "addListenerMethod");
            if (lVar.m5992o(method)) {
                C1924k.m9140f(method2, "removeListenerMethod");
                if (lVar.m5992o(method2)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: androidx.window.layout.l$d */
    static final class C1218d extends C1925l implements C1769a<Boolean> {

        /* renamed from: e */
        final /* synthetic */ ClassLoader f4238e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1218d(ClassLoader classLoader) {
            super(0);
            this.f4238e = classLoader;
        }

        /* renamed from: a */
        public final Boolean mo3839c() {
            C1214l lVar = C1214l.f4233a;
            boolean z = false;
            Method declaredMethod = lVar.m5998u(this.f4238e).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class f = lVar.m5997t(this.f4238e);
            C1924k.m9140f(declaredMethod, "getWindowExtensionsMethod");
            C1924k.m9140f(f, "windowExtensionsClass");
            if (lVar.m5988j(declaredMethod, f) && lVar.m5992o(declaredMethod)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: androidx.window.layout.l$e */
    static final class C1219e extends C1925l implements C1769a<WindowLayoutComponent> {

        /* renamed from: e */
        public static final C1219e f4239e = new C1219e();

        C1219e() {
            super(0);
        }

        /* renamed from: a */
        public final WindowLayoutComponent mo3839c() {
            ClassLoader classLoader = C1214l.class.getClassLoader();
            if (classLoader != null && C1214l.f4233a.m5987i(classLoader)) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                }
            }
            WindowLayoutComponent windowLayoutComponent = null;
            return null;
        }
    }

    private C1214l() {
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final boolean m5987i(ClassLoader classLoader) {
        return Build.VERSION.SDK_INT >= 24 && m5995r(classLoader) && m5993p(classLoader) && m5994q(classLoader) && m5991n(classLoader);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m5988j(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final boolean m5989k(Method method, C2385b<?> bVar) {
        return m5988j(method, C1737a.m8630a(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final Class<?> m5990l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    /* renamed from: n */
    private final boolean m5991n(ClassLoader classLoader) {
        return m5996s(new C1215a(classLoader));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m5992o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* renamed from: p */
    private final boolean m5993p(ClassLoader classLoader) {
        return m5996s(new C1216b(classLoader));
    }

    /* renamed from: q */
    private final boolean m5994q(ClassLoader classLoader) {
        return m5996s(new C1217c(classLoader));
    }

    /* renamed from: r */
    private final boolean m5995r(ClassLoader classLoader) {
        return m5996s(new C1218d(classLoader));
    }

    /* renamed from: s */
    private final boolean m5996s(C1769a<Boolean> aVar) {
        try {
            return aVar.mo3839c().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final Class<?> m5997t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final Class<?> m5998u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final Class<?> m5999v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    /* renamed from: m */
    public final WindowLayoutComponent mo5026m() {
        return (WindowLayoutComponent) f4234b.getValue();
    }
}
