package p036e5;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import p134u3.C3280a0;
import p134u3.C3308e0;
import p134u3.C3359w;

/* renamed from: e5.p */
abstract class C1858p<T> {

    /* renamed from: e5.p$a */
    class C1859a extends C1858p<Iterable<T>> {
        C1859a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7546a(C1879r rVar, @Nullable Iterable<T> iterable) {
            if (iterable != null) {
                for (T a : iterable) {
                    C1858p.this.mo7546a(rVar, a);
                }
            }
        }
    }

    /* renamed from: e5.p$b */
    class C1860b extends C1858p<Object> {
        C1860b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C1858p.this.mo7546a(rVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: e5.p$c */
    static final class C1861c<T> extends C1858p<T> {

        /* renamed from: a */
        private final Method f6727a;

        /* renamed from: b */
        private final int f6728b;

        /* renamed from: c */
        private final C1828f<T, C3308e0> f6729c;

        C1861c(Method method, int i, C1828f<T, C3308e0> fVar) {
            this.f6727a = method;
            this.f6728b = i;
            this.f6729c = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable T t) {
            if (t != null) {
                try {
                    rVar.mo7572l(this.f6729c.mo7505a(t));
                } catch (IOException e) {
                    Method method = this.f6727a;
                    int i = this.f6728b;
                    throw C1890y.m9072p(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw C1890y.m9071o(this.f6727a, this.f6728b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: e5.p$d */
    static final class C1862d<T> extends C1858p<T> {

        /* renamed from: a */
        private final String f6730a;

        /* renamed from: b */
        private final C1828f<T, String> f6731b;

        /* renamed from: c */
        private final boolean f6732c;

        C1862d(String str, C1828f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f6730a = str;
            this.f6731b = fVar;
            this.f6732c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable T t) {
            String a;
            if (t != null && (a = this.f6731b.mo7505a(t)) != null) {
                rVar.mo7563a(this.f6730a, a, this.f6732c);
            }
        }
    }

    /* renamed from: e5.p$e */
    static final class C1863e<T> extends C1858p<Map<String, T>> {

        /* renamed from: a */
        private final Method f6733a;

        /* renamed from: b */
        private final int f6734b;

        /* renamed from: c */
        private final C1828f<T, String> f6735c;

        /* renamed from: d */
        private final boolean f6736d;

        C1863e(Method method, int i, C1828f<T, String> fVar, boolean z) {
            this.f6733a = method;
            this.f6734b = i;
            this.f6735c = fVar;
            this.f6736d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7546a(C1879r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f6735c.mo7505a(value);
                            if (a != null) {
                                rVar.mo7563a(str, a, this.f6736d);
                            } else {
                                Method method = this.f6733a;
                                int i = this.f6734b;
                                throw C1890y.m9071o(method, i, "Field map value '" + value + "' converted to null by " + this.f6735c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f6733a;
                            int i2 = this.f6734b;
                            throw C1890y.m9071o(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C1890y.m9071o(this.f6733a, this.f6734b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C1890y.m9071o(this.f6733a, this.f6734b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: e5.p$f */
    static final class C1864f<T> extends C1858p<T> {

        /* renamed from: a */
        private final String f6737a;

        /* renamed from: b */
        private final C1828f<T, String> f6738b;

        C1864f(String str, C1828f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f6737a = str;
            this.f6738b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable T t) {
            String a;
            if (t != null && (a = this.f6738b.mo7505a(t)) != null) {
                rVar.mo7564b(this.f6737a, a);
            }
        }
    }

    /* renamed from: e5.p$g */
    static final class C1865g<T> extends C1858p<Map<String, T>> {

        /* renamed from: a */
        private final Method f6739a;

        /* renamed from: b */
        private final int f6740b;

        /* renamed from: c */
        private final C1828f<T, String> f6741c;

        C1865g(Method method, int i, C1828f<T, String> fVar) {
            this.f6739a = method;
            this.f6740b = i;
            this.f6741c = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7546a(C1879r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            rVar.mo7564b(str, this.f6741c.mo7505a(value));
                        } else {
                            Method method = this.f6739a;
                            int i = this.f6740b;
                            throw C1890y.m9071o(method, i, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C1890y.m9071o(this.f6739a, this.f6740b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C1890y.m9071o(this.f6739a, this.f6740b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: e5.p$h */
    static final class C1866h extends C1858p<C3359w> {

        /* renamed from: a */
        private final Method f6742a;

        /* renamed from: b */
        private final int f6743b;

        C1866h(Method method, int i) {
            this.f6742a = method;
            this.f6743b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7546a(C1879r rVar, @Nullable C3359w wVar) {
            if (wVar != null) {
                rVar.mo7565c(wVar);
                return;
            }
            throw C1890y.m9071o(this.f6742a, this.f6743b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: e5.p$i */
    static final class C1867i<T> extends C1858p<T> {

        /* renamed from: a */
        private final Method f6744a;

        /* renamed from: b */
        private final int f6745b;

        /* renamed from: c */
        private final C3359w f6746c;

        /* renamed from: d */
        private final C1828f<T, C3308e0> f6747d;

        C1867i(Method method, int i, C3359w wVar, C1828f<T, C3308e0> fVar) {
            this.f6744a = method;
            this.f6745b = i;
            this.f6746c = wVar;
            this.f6747d = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable T t) {
            if (t != null) {
                try {
                    rVar.mo7566d(this.f6746c, this.f6747d.mo7505a(t));
                } catch (IOException e) {
                    Method method = this.f6744a;
                    int i = this.f6745b;
                    throw C1890y.m9071o(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: e5.p$j */
    static final class C1868j<T> extends C1858p<Map<String, T>> {

        /* renamed from: a */
        private final Method f6748a;

        /* renamed from: b */
        private final int f6749b;

        /* renamed from: c */
        private final C1828f<T, C3308e0> f6750c;

        /* renamed from: d */
        private final String f6751d;

        C1868j(Method method, int i, C1828f<T, C3308e0> fVar, String str) {
            this.f6748a = method;
            this.f6749b = i;
            this.f6750c = fVar;
            this.f6751d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7546a(C1879r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            rVar.mo7566d(C3359w.m14804z("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f6751d), this.f6750c.mo7505a(value));
                        } else {
                            Method method = this.f6748a;
                            int i = this.f6749b;
                            throw C1890y.m9071o(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C1890y.m9071o(this.f6748a, this.f6749b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C1890y.m9071o(this.f6748a, this.f6749b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: e5.p$k */
    static final class C1869k<T> extends C1858p<T> {

        /* renamed from: a */
        private final Method f6752a;

        /* renamed from: b */
        private final int f6753b;

        /* renamed from: c */
        private final String f6754c;

        /* renamed from: d */
        private final C1828f<T, String> f6755d;

        /* renamed from: e */
        private final boolean f6756e;

        C1869k(Method method, int i, String str, C1828f<T, String> fVar, boolean z) {
            this.f6752a = method;
            this.f6753b = i;
            Objects.requireNonNull(str, "name == null");
            this.f6754c = str;
            this.f6755d = fVar;
            this.f6756e = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable T t) {
            if (t != null) {
                rVar.mo7568f(this.f6754c, this.f6755d.mo7505a(t), this.f6756e);
                return;
            }
            Method method = this.f6752a;
            int i = this.f6753b;
            throw C1890y.m9071o(method, i, "Path parameter \"" + this.f6754c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: e5.p$l */
    static final class C1870l<T> extends C1858p<T> {

        /* renamed from: a */
        private final String f6757a;

        /* renamed from: b */
        private final C1828f<T, String> f6758b;

        /* renamed from: c */
        private final boolean f6759c;

        C1870l(String str, C1828f<T, String> fVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f6757a = str;
            this.f6758b = fVar;
            this.f6759c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable T t) {
            String a;
            if (t != null && (a = this.f6758b.mo7505a(t)) != null) {
                rVar.mo7569g(this.f6757a, a, this.f6759c);
            }
        }
    }

    /* renamed from: e5.p$m */
    static final class C1871m<T> extends C1858p<Map<String, T>> {

        /* renamed from: a */
        private final Method f6760a;

        /* renamed from: b */
        private final int f6761b;

        /* renamed from: c */
        private final C1828f<T, String> f6762c;

        /* renamed from: d */
        private final boolean f6763d;

        C1871m(Method method, int i, C1828f<T, String> fVar, boolean z) {
            this.f6760a = method;
            this.f6761b = i;
            this.f6762c = fVar;
            this.f6763d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7546a(C1879r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f6762c.mo7505a(value);
                            if (a != null) {
                                rVar.mo7569g(str, a, this.f6763d);
                            } else {
                                Method method = this.f6760a;
                                int i = this.f6761b;
                                throw C1890y.m9071o(method, i, "Query map value '" + value + "' converted to null by " + this.f6762c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f6760a;
                            int i2 = this.f6761b;
                            throw C1890y.m9071o(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C1890y.m9071o(this.f6760a, this.f6761b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C1890y.m9071o(this.f6760a, this.f6761b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: e5.p$n */
    static final class C1872n<T> extends C1858p<T> {

        /* renamed from: a */
        private final C1828f<T, String> f6764a;

        /* renamed from: b */
        private final boolean f6765b;

        C1872n(C1828f<T, String> fVar, boolean z) {
            this.f6764a = fVar;
            this.f6765b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable T t) {
            if (t != null) {
                rVar.mo7569g(this.f6764a.mo7505a(t), (String) null, this.f6765b);
            }
        }
    }

    /* renamed from: e5.p$o */
    static final class C1873o extends C1858p<C3280a0.C3283c> {

        /* renamed from: a */
        static final C1873o f6766a = new C1873o();

        private C1873o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7546a(C1879r rVar, @Nullable C3280a0.C3283c cVar) {
            if (cVar != null) {
                rVar.mo7567e(cVar);
            }
        }
    }

    /* renamed from: e5.p$p */
    static final class C1874p extends C1858p<Object> {

        /* renamed from: a */
        private final Method f6767a;

        /* renamed from: b */
        private final int f6768b;

        C1874p(Method method, int i) {
            this.f6767a = method;
            this.f6768b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable Object obj) {
            if (obj != null) {
                rVar.mo7573m(obj);
                return;
            }
            throw C1890y.m9071o(this.f6767a, this.f6768b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: e5.p$q */
    static final class C1875q<T> extends C1858p<T> {

        /* renamed from: a */
        final Class<T> f6769a;

        C1875q(Class<T> cls) {
            this.f6769a = cls;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7546a(C1879r rVar, @Nullable T t) {
            rVar.mo7570h(this.f6769a, t);
        }
    }

    C1858p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo7546a(C1879r rVar, @Nullable T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1858p<Object> mo7547b() {
        return new C1860b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C1858p<Iterable<T>> mo7548c() {
        return new C1859a();
    }
}
