package p035e4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p041f3.C1920g;
import p041f3.C1924k;
import p127t2.C3184p;
import p134u3.C3299c0;

/* renamed from: e4.e */
public final class C1802e extends C1809h {

    /* renamed from: i */
    public static final C1804b f6638i = new C1804b((C1920g) null);

    /* renamed from: d */
    private final Method f6639d;

    /* renamed from: e */
    private final Method f6640e;

    /* renamed from: f */
    private final Method f6641f;

    /* renamed from: g */
    private final Class<?> f6642g;

    /* renamed from: h */
    private final Class<?> f6643h;

    /* renamed from: e4.e$a */
    private static final class C1803a implements InvocationHandler {

        /* renamed from: a */
        private boolean f6644a;

        /* renamed from: b */
        private String f6645b;

        /* renamed from: c */
        private final List<String> f6646c;

        public C1803a(List<String> list) {
            C1924k.m9142h(list, "protocols");
            this.f6646c = list;
        }

        /* renamed from: a */
        public final String mo7488a() {
            return this.f6645b;
        }

        /* renamed from: b */
        public final boolean mo7489b() {
            return this.f6644a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C1924k.m9142h(obj, "proxy");
            C1924k.m9142h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C1924k.m9136b(name, "supports") && C1924k.m9136b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C1924k.m9136b(name, "unsupported") || !C1924k.m9136b(Void.TYPE, returnType)) {
                if (C1924k.m9136b(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f6646c;
                    }
                }
                if ((C1924k.m9136b(name, "selectProtocol") || C1924k.m9136b(name, "select")) && C1924k.m9136b(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list.get(i);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!this.f6646c.contains(str)) {
                                        if (i == size) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        this.f6645b = str;
                                        return str;
                                    }
                                } else {
                                    throw new C3184p("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = this.f6646c.get(0);
                        this.f6645b = str2;
                        return str2;
                    }
                    throw new C3184p("null cannot be cast to non-null type kotlin.collections.List<*>");
                } else if ((!C1924k.m9136b(name, "protocolSelected") && !C1924k.m9136b(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        this.f6645b = (String) obj4;
                        return null;
                    }
                    throw new C3184p("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                this.f6644a = true;
                return null;
            }
        }
    }

    /* renamed from: e4.e$b */
    public static final class C1804b {
        private C1804b() {
        }

        public /* synthetic */ C1804b(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1809h mo7491a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C1924k.m9137c(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod("remove", new Class[]{SSLSocket.class});
                C1924k.m9137c(method, "putMethod");
                C1924k.m9137c(method2, "getMethod");
                C1924k.m9137c(method3, "removeMethod");
                C1924k.m9137c(cls3, "clientProviderClass");
                C1924k.m9137c(cls4, "serverProviderClass");
                return new C1802e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public C1802e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        C1924k.m9142h(method, "putMethod");
        C1924k.m9142h(method2, "getMethod");
        C1924k.m9142h(method3, "removeMethod");
        C1924k.m9142h(cls, "clientProviderClass");
        C1924k.m9142h(cls2, "serverProviderClass");
        this.f6639d = method;
        this.f6640e = method2;
        this.f6641f = method3;
        this.f6642g = cls;
        this.f6643h = cls2;
    }

    /* renamed from: b */
    public void mo7487b(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        try {
            this.f6641f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    /* renamed from: e */
    public void mo7464e(SSLSocket sSLSocket, String str, List<? extends C3299c0> list) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        C1924k.m9142h(list, "protocols");
        List<String> b = C1809h.f6654c.mo7499b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C1809h.class.getClassLoader(), new Class[]{this.f6642g, this.f6643h}, new C1803a(b));
            this.f6639d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    /* renamed from: h */
    public String mo7465h(SSLSocket sSLSocket) {
        C1924k.m9142h(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f6640e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                C1803a aVar = (C1803a) invocationHandler;
                if (!aVar.mo7489b() && aVar.mo7488a() == null) {
                    C1809h.m8836l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (aVar.mo7489b()) {
                    return null;
                } else {
                    return aVar.mo7488a();
                }
            } else {
                throw new C3184p("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
