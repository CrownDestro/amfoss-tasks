package p036e5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p036e5.C1858p;
import p050g5.C1966a;
import p050g5.C1967b;
import p050g5.C1968c;
import p050g5.C1969d;
import p050g5.C1970e;
import p050g5.C1971f;
import p050g5.C1972g;
import p050g5.C1973h;
import p050g5.C1974i;
import p050g5.C1975j;
import p050g5.C1976k;
import p050g5.C1977l;
import p050g5.C1978m;
import p050g5.C1979n;
import p050g5.C1980o;
import p050g5.C1981p;
import p050g5.C1982q;
import p050g5.C1983r;
import p050g5.C1984s;
import p050g5.C1985t;
import p050g5.C1986u;
import p050g5.C1987v;
import p050g5.C1989x;
import p050g5.C1990y;
import p134u3.C3280a0;
import p134u3.C3304d0;
import p134u3.C3359w;
import p134u3.C3362x;
import p134u3.C3368z;
import p145w2.C3443d;

/* renamed from: e5.s */
final class C1881s {

    /* renamed from: a */
    private final Method f6789a;

    /* renamed from: b */
    private final C3362x f6790b;

    /* renamed from: c */
    final String f6791c;
    @Nullable

    /* renamed from: d */
    private final String f6792d;
    @Nullable

    /* renamed from: e */
    private final C3359w f6793e;
    @Nullable

    /* renamed from: f */
    private final C3368z f6794f;

    /* renamed from: g */
    private final boolean f6795g;

    /* renamed from: h */
    private final boolean f6796h;

    /* renamed from: i */
    private final boolean f6797i;

    /* renamed from: j */
    private final C1858p<?>[] f6798j;

    /* renamed from: k */
    final boolean f6799k;

    /* renamed from: e5.s$a */
    static final class C1882a {

        /* renamed from: x */
        private static final Pattern f6800x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f6801y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final C1884u f6802a;

        /* renamed from: b */
        final Method f6803b;

        /* renamed from: c */
        final Annotation[] f6804c;

        /* renamed from: d */
        final Annotation[][] f6805d;

        /* renamed from: e */
        final Type[] f6806e;

        /* renamed from: f */
        boolean f6807f;

        /* renamed from: g */
        boolean f6808g;

        /* renamed from: h */
        boolean f6809h;

        /* renamed from: i */
        boolean f6810i;

        /* renamed from: j */
        boolean f6811j;

        /* renamed from: k */
        boolean f6812k;

        /* renamed from: l */
        boolean f6813l;

        /* renamed from: m */
        boolean f6814m;
        @Nullable

        /* renamed from: n */
        String f6815n;

        /* renamed from: o */
        boolean f6816o;

        /* renamed from: p */
        boolean f6817p;

        /* renamed from: q */
        boolean f6818q;
        @Nullable

        /* renamed from: r */
        String f6819r;
        @Nullable

        /* renamed from: s */
        C3359w f6820s;
        @Nullable

        /* renamed from: t */
        C3368z f6821t;
        @Nullable

        /* renamed from: u */
        Set<String> f6822u;
        @Nullable

        /* renamed from: v */
        C1858p<?>[] f6823v;

        /* renamed from: w */
        boolean f6824w;

        C1882a(C1884u uVar, Method method) {
            this.f6802a = uVar;
            this.f6803b = method;
            this.f6804c = method.getAnnotations();
            this.f6806e = method.getGenericParameterTypes();
            this.f6805d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private static Class<?> m9022a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: c */
        private C3359w m9023c(String[] strArr) {
            C3359w.C3360a aVar = new C3359w.C3360a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C1890y.m9069m(this.f6803b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f6821t = C3368z.m14895d(trim);
                    } catch (IllegalArgumentException e) {
                        throw C1890y.m9070n(this.f6803b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo11112a(substring, trim);
                }
            }
            return aVar.mo11116e();
        }

        /* renamed from: d */
        private void m9024d(String str, String str2, boolean z) {
            String str3 = this.f6815n;
            if (str3 == null) {
                this.f6815n = str;
                this.f6816o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f6800x.matcher(substring).find()) {
                            throw C1890y.m9069m(this.f6803b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f6819r = str2;
                    this.f6822u = m9028h(str2);
                    return;
                }
                return;
            }
            throw C1890y.m9069m(this.f6803b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        private void m9025e(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof C1967b) {
                value = ((C1967b) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof C1971f) {
                value = ((C1971f) annotation).value();
                str = "GET";
            } else if (annotation instanceof C1972g) {
                value = ((C1972g) annotation).value();
                str = "HEAD";
            } else {
                if (annotation instanceof C1979n) {
                    value2 = ((C1979n) annotation).value();
                    str2 = "PATCH";
                } else if (annotation instanceof C1980o) {
                    value2 = ((C1980o) annotation).value();
                    str2 = "POST";
                } else if (annotation instanceof C1981p) {
                    value2 = ((C1981p) annotation).value();
                    str2 = "PUT";
                } else if (annotation instanceof C1978m) {
                    value = ((C1978m) annotation).value();
                    str = "OPTIONS";
                } else if (annotation instanceof C1973h) {
                    C1973h hVar = (C1973h) annotation;
                    m9024d(hVar.method(), hVar.path(), hVar.hasBody());
                    return;
                } else if (annotation instanceof C1976k) {
                    String[] value3 = ((C1976k) annotation).value();
                    if (value3.length != 0) {
                        this.f6820s = m9023c(value3);
                        return;
                    }
                    throw C1890y.m9069m(this.f6803b, "@Headers annotation is empty.", new Object[0]);
                } else if (annotation instanceof C1977l) {
                    if (!this.f6817p) {
                        this.f6818q = true;
                        return;
                    }
                    throw C1890y.m9069m(this.f6803b, "Only one encoding annotation is allowed.", new Object[0]);
                } else if (!(annotation instanceof C1970e)) {
                    return;
                } else {
                    if (!this.f6818q) {
                        this.f6817p = true;
                        return;
                    }
                    throw C1890y.m9069m(this.f6803b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                m9024d(str2, value2, true);
                return;
            }
            m9024d(str, value, false);
        }

        @Nullable
        /* renamed from: f */
        private C1858p<?> m9026f(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            C1858p<?> pVar;
            if (annotationArr != null) {
                pVar = null;
                for (Annotation g : annotationArr) {
                    C1858p<?> g2 = m9027g(i, type, annotationArr, g);
                    if (g2 != null) {
                        if (pVar == null) {
                            pVar = g2;
                        } else {
                            throw C1890y.m9071o(this.f6803b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                pVar = null;
            }
            if (pVar != null) {
                return pVar;
            }
            if (z) {
                try {
                    if (C1890y.m9064h(type) == C3443d.class) {
                        this.f6824w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C1890y.m9071o(this.f6803b, i, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        /* renamed from: g */
        private C1858p<?> m9027g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<C3280a0.C3283c> cls2 = C3280a0.C3283c.class;
            if (annotation instanceof C1990y) {
                m9030j(i, type);
                if (this.f6814m) {
                    throw C1890y.m9071o(this.f6803b, i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f6810i) {
                    throw C1890y.m9071o(this.f6803b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f6811j) {
                    throw C1890y.m9071o(this.f6803b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f6812k) {
                    throw C1890y.m9071o(this.f6803b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f6813l) {
                    throw C1890y.m9071o(this.f6803b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f6819r == null) {
                    this.f6814m = true;
                    if (type == C3362x.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C1858p.C1874p(this.f6803b, i);
                    }
                    throw C1890y.m9071o(this.f6803b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw C1890y.m9071o(this.f6803b, i, "@Url cannot be used with @%s URL", this.f6815n);
                }
            } else if (annotation instanceof C1984s) {
                m9030j(i, type);
                if (this.f6811j) {
                    throw C1890y.m9071o(this.f6803b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f6812k) {
                    throw C1890y.m9071o(this.f6803b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f6813l) {
                    throw C1890y.m9071o(this.f6803b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f6814m) {
                    throw C1890y.m9071o(this.f6803b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f6819r != null) {
                    this.f6810i = true;
                    C1984s sVar = (C1984s) annotation;
                    String value = sVar.value();
                    m9029i(i, value);
                    return new C1858p.C1869k(this.f6803b, i, value, this.f6802a.mo7592i(type, annotationArr), sVar.encoded());
                } else {
                    throw C1890y.m9071o(this.f6803b, i, "@Path can only be used with relative url on @%s", this.f6815n);
                }
            } else if (annotation instanceof C1985t) {
                m9030j(i, type);
                C1985t tVar = (C1985t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h = C1890y.m9064h(type);
                this.f6811j = true;
                if (Iterable.class.isAssignableFrom(h)) {
                    if (type instanceof ParameterizedType) {
                        return new C1858p.C1870l(value2, this.f6802a.mo7592i(C1890y.m9063g(0, (ParameterizedType) type), annotationArr), encoded).mo7548c();
                    }
                    throw C1890y.m9071o(this.f6803b, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h.isArray()) {
                    return new C1858p.C1870l(value2, this.f6802a.mo7592i(type, annotationArr), encoded);
                } else {
                    return new C1858p.C1870l(value2, this.f6802a.mo7592i(m9022a(h.getComponentType()), annotationArr), encoded).mo7547b();
                }
            } else if (annotation instanceof C1987v) {
                m9030j(i, type);
                boolean encoded2 = ((C1987v) annotation).encoded();
                Class<?> h2 = C1890y.m9064h(type);
                this.f6812k = true;
                if (Iterable.class.isAssignableFrom(h2)) {
                    if (type instanceof ParameterizedType) {
                        return new C1858p.C1872n(this.f6802a.mo7592i(C1890y.m9063g(0, (ParameterizedType) type), annotationArr), encoded2).mo7548c();
                    }
                    throw C1890y.m9071o(this.f6803b, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h2.isArray()) {
                    return new C1858p.C1872n(this.f6802a.mo7592i(type, annotationArr), encoded2);
                } else {
                    return new C1858p.C1872n(this.f6802a.mo7592i(m9022a(h2.getComponentType()), annotationArr), encoded2).mo7547b();
                }
            } else if (annotation instanceof C1986u) {
                m9030j(i, type);
                Class<?> h3 = C1890y.m9064h(type);
                this.f6813l = true;
                if (Map.class.isAssignableFrom(h3)) {
                    Type i2 = C1890y.m9065i(type, h3, Map.class);
                    if (i2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i2;
                        Type g = C1890y.m9063g(0, parameterizedType);
                        if (cls == g) {
                            return new C1858p.C1871m(this.f6803b, i, this.f6802a.mo7592i(C1890y.m9063g(1, parameterizedType), annotationArr), ((C1986u) annotation).encoded());
                        }
                        throw C1890y.m9071o(this.f6803b, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
                    }
                    throw C1890y.m9071o(this.f6803b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C1890y.m9071o(this.f6803b, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C1974i) {
                m9030j(i, type);
                String value3 = ((C1974i) annotation).value();
                Class<?> h4 = C1890y.m9064h(type);
                if (Iterable.class.isAssignableFrom(h4)) {
                    if (type instanceof ParameterizedType) {
                        return new C1858p.C1864f(value3, this.f6802a.mo7592i(C1890y.m9063g(0, (ParameterizedType) type), annotationArr)).mo7548c();
                    }
                    throw C1890y.m9071o(this.f6803b, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h4.isArray()) {
                    return new C1858p.C1864f(value3, this.f6802a.mo7592i(type, annotationArr));
                } else {
                    return new C1858p.C1864f(value3, this.f6802a.mo7592i(m9022a(h4.getComponentType()), annotationArr)).mo7547b();
                }
            } else if (annotation instanceof C1975j) {
                if (type == C3359w.class) {
                    return new C1858p.C1866h(this.f6803b, i);
                }
                m9030j(i, type);
                Class<?> h5 = C1890y.m9064h(type);
                if (Map.class.isAssignableFrom(h5)) {
                    Type i3 = C1890y.m9065i(type, h5, Map.class);
                    if (i3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                        Type g2 = C1890y.m9063g(0, parameterizedType2);
                        if (cls == g2) {
                            return new C1858p.C1865g(this.f6803b, i, this.f6802a.mo7592i(C1890y.m9063g(1, parameterizedType2), annotationArr));
                        }
                        throw C1890y.m9071o(this.f6803b, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                    }
                    throw C1890y.m9071o(this.f6803b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C1890y.m9071o(this.f6803b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C1968c) {
                m9030j(i, type);
                if (this.f6817p) {
                    C1968c cVar = (C1968c) annotation;
                    String value4 = cVar.value();
                    boolean encoded3 = cVar.encoded();
                    this.f6807f = true;
                    Class<?> h6 = C1890y.m9064h(type);
                    if (Iterable.class.isAssignableFrom(h6)) {
                        if (type instanceof ParameterizedType) {
                            return new C1858p.C1862d(value4, this.f6802a.mo7592i(C1890y.m9063g(0, (ParameterizedType) type), annotationArr), encoded3).mo7548c();
                        }
                        throw C1890y.m9071o(this.f6803b, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h6.isArray()) {
                        return new C1858p.C1862d(value4, this.f6802a.mo7592i(type, annotationArr), encoded3);
                    } else {
                        return new C1858p.C1862d(value4, this.f6802a.mo7592i(m9022a(h6.getComponentType()), annotationArr), encoded3).mo7547b();
                    }
                } else {
                    throw C1890y.m9071o(this.f6803b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C1969d) {
                m9030j(i, type);
                if (this.f6817p) {
                    Class<?> h7 = C1890y.m9064h(type);
                    if (Map.class.isAssignableFrom(h7)) {
                        Type i4 = C1890y.m9065i(type, h7, Map.class);
                        if (i4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                            Type g3 = C1890y.m9063g(0, parameterizedType3);
                            if (cls == g3) {
                                C1828f i5 = this.f6802a.mo7592i(C1890y.m9063g(1, parameterizedType3), annotationArr);
                                this.f6807f = true;
                                return new C1858p.C1863e(this.f6803b, i, i5, ((C1969d) annotation).encoded());
                            }
                            throw C1890y.m9071o(this.f6803b, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                        }
                        throw C1890y.m9071o(this.f6803b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C1890y.m9071o(this.f6803b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw C1890y.m9071o(this.f6803b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C1982q) {
                m9030j(i, type);
                if (this.f6818q) {
                    C1982q qVar = (C1982q) annotation;
                    this.f6808g = true;
                    String value5 = qVar.value();
                    Class<?> h8 = C1890y.m9064h(type);
                    if (!value5.isEmpty()) {
                        C3359w z = C3359w.m14804z("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                        if (Iterable.class.isAssignableFrom(h8)) {
                            if (type instanceof ParameterizedType) {
                                Type g4 = C1890y.m9063g(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(C1890y.m9064h(g4))) {
                                    return new C1858p.C1867i(this.f6803b, i, z, this.f6802a.mo7590g(g4, annotationArr, this.f6804c)).mo7548c();
                                }
                                throw C1890y.m9071o(this.f6803b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw C1890y.m9071o(this.f6803b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h8.isArray()) {
                            Class<?> a = m9022a(h8.getComponentType());
                            if (!cls2.isAssignableFrom(a)) {
                                return new C1858p.C1867i(this.f6803b, i, z, this.f6802a.mo7590g(a, annotationArr, this.f6804c)).mo7547b();
                            }
                            throw C1890y.m9071o(this.f6803b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(h8)) {
                            return new C1858p.C1867i(this.f6803b, i, z, this.f6802a.mo7590g(type, annotationArr, this.f6804c));
                        } else {
                            throw C1890y.m9071o(this.f6803b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(h8)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw C1890y.m9071o(this.f6803b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(C1890y.m9064h(C1890y.m9063g(0, (ParameterizedType) type)))) {
                            return C1858p.C1873o.f6766a.mo7548c();
                        } else {
                            throw C1890y.m9071o(this.f6803b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (h8.isArray()) {
                        if (cls2.isAssignableFrom(h8.getComponentType())) {
                            return C1858p.C1873o.f6766a.mo7547b();
                        }
                        throw C1890y.m9071o(this.f6803b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(h8)) {
                        return C1858p.C1873o.f6766a;
                    } else {
                        throw C1890y.m9071o(this.f6803b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw C1890y.m9071o(this.f6803b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof C1983r) {
                m9030j(i, type);
                if (this.f6818q) {
                    this.f6808g = true;
                    Class<?> h9 = C1890y.m9064h(type);
                    if (Map.class.isAssignableFrom(h9)) {
                        Type i6 = C1890y.m9065i(type, h9, Map.class);
                        if (i6 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i6;
                            Type g5 = C1890y.m9063g(0, parameterizedType4);
                            if (cls == g5) {
                                Type g6 = C1890y.m9063g(1, parameterizedType4);
                                if (!cls2.isAssignableFrom(C1890y.m9064h(g6))) {
                                    return new C1858p.C1868j(this.f6803b, i, this.f6802a.mo7590g(g6, annotationArr, this.f6804c), ((C1983r) annotation).encoding());
                                }
                                throw C1890y.m9071o(this.f6803b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw C1890y.m9071o(this.f6803b, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
                        }
                        throw C1890y.m9071o(this.f6803b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C1890y.m9071o(this.f6803b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw C1890y.m9071o(this.f6803b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C1966a) {
                m9030j(i, type);
                if (this.f6817p || this.f6818q) {
                    throw C1890y.m9071o(this.f6803b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f6809h) {
                    try {
                        C1828f g7 = this.f6802a.mo7590g(type, annotationArr, this.f6804c);
                        this.f6809h = true;
                        return new C1858p.C1861c(this.f6803b, i, g7);
                    } catch (RuntimeException e) {
                        throw C1890y.m9072p(this.f6803b, e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw C1890y.m9071o(this.f6803b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (!(annotation instanceof C1989x)) {
                return null;
            } else {
                m9030j(i, type);
                Class<?> h10 = C1890y.m9064h(type);
                int i7 = i - 1;
                while (i7 >= 0) {
                    C1858p<?> pVar = this.f6823v[i7];
                    if (!(pVar instanceof C1858p.C1875q) || !((C1858p.C1875q) pVar).f6769a.equals(h10)) {
                        i7--;
                    } else {
                        throw C1890y.m9071o(this.f6803b, i, "@Tag type " + h10.getName() + " is duplicate of parameter #" + (i7 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new C1858p.C1875q(h10);
            }
        }

        /* renamed from: h */
        static Set<String> m9028h(String str) {
            Matcher matcher = f6800x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: i */
        private void m9029i(int i, String str) {
            if (!f6801y.matcher(str).matches()) {
                throw C1890y.m9071o(this.f6803b, i, "@Path parameter name must match %s. Found: %s", f6800x.pattern(), str);
            } else if (!this.f6822u.contains(str)) {
                throw C1890y.m9071o(this.f6803b, i, "URL \"%s\" does not contain \"{%s}\".", this.f6819r, str);
            }
        }

        /* renamed from: j */
        private void m9030j(int i, Type type) {
            if (C1890y.m9066j(type)) {
                throw C1890y.m9071o(this.f6803b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1881s mo7578b() {
            for (Annotation e : this.f6804c) {
                m9025e(e);
            }
            if (this.f6815n != null) {
                if (!this.f6816o) {
                    if (this.f6818q) {
                        throw C1890y.m9069m(this.f6803b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f6817p) {
                        throw C1890y.m9069m(this.f6803b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f6805d.length;
                this.f6823v = new C1858p[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    C1858p<?>[] pVarArr = this.f6823v;
                    Type type = this.f6806e[i2];
                    Annotation[] annotationArr = this.f6805d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    pVarArr[i2] = m9026f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f6819r != null || this.f6814m) {
                    boolean z2 = this.f6817p;
                    if (!z2 && !this.f6818q && !this.f6816o && this.f6809h) {
                        throw C1890y.m9069m(this.f6803b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !this.f6807f) {
                        throw C1890y.m9069m(this.f6803b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f6818q || this.f6808g) {
                        return new C1881s(this);
                    } else {
                        throw C1890y.m9069m(this.f6803b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw C1890y.m9069m(this.f6803b, "Missing either @%s URL or @Url parameter.", this.f6815n);
                }
            } else {
                throw C1890y.m9069m(this.f6803b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    C1881s(C1882a aVar) {
        this.f6789a = aVar.f6803b;
        this.f6790b = aVar.f6802a.f6830c;
        this.f6791c = aVar.f6815n;
        this.f6792d = aVar.f6819r;
        this.f6793e = aVar.f6820s;
        this.f6794f = aVar.f6821t;
        this.f6795g = aVar.f6816o;
        this.f6796h = aVar.f6817p;
        this.f6797i = aVar.f6818q;
        this.f6798j = aVar.f6823v;
        this.f6799k = aVar.f6824w;
    }

    /* renamed from: b */
    static C1881s m9020b(C1884u uVar, Method method) {
        return new C1882a(uVar, method).mo7578b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3304d0 mo7577a(Object[] objArr) {
        C1858p<?>[] pVarArr = this.f6798j;
        int length = objArr.length;
        if (length == pVarArr.length) {
            C1879r rVar = new C1879r(this.f6791c, this.f6790b, this.f6792d, this.f6793e, this.f6794f, this.f6795g, this.f6796h, this.f6797i);
            if (this.f6799k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                pVarArr[i].mo7546a(rVar, objArr[i]);
            }
            return rVar.mo7571k().mo10929h(C1841l.class, new C1841l(this.f6789a, arrayList)).mo10923b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + pVarArr.length + ")");
    }
}
