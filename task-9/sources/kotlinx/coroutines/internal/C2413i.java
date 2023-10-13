package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import p041f3.C1924k;

/* renamed from: kotlinx.coroutines.internal.i */
public final class C2413i {

    /* renamed from: a */
    public static final C2413i f8330a = new C2413i();

    private C2413i() {
    }

    /* renamed from: a */
    private final <S> S m11255a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final <S> List<S> m11256b(Class<S> cls, ClassLoader classLoader) {
        try {
            return mo8981d(cls, classLoader);
        } catch (Throwable unused) {
            return C3271t.m14398M(ServiceLoader.load(cls, classLoader));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        p020c3.C1302a.m6198a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        p127t2.C3168b.m14046a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        p020c3.C1302a.m6198a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        throw r1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m11257e(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = p086m3.C2646p.m11982B(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x005d
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = p086m3.C2647q.m12041t0(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = p086m3.C2647q.m12046y0(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = p086m3.C2647q.m12041t0(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0051 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0051 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0051 }
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0051 }
            r6.<init>(r2)     // Catch:{ all -> 0x0051 }
            kotlinx.coroutines.internal.i r0 = f8330a     // Catch:{ all -> 0x004a }
            java.util.List r0 = r0.m11258f(r6)     // Catch:{ all -> 0x004a }
            p020c3.C1302a.m6198a(r6, r4)     // Catch:{ all -> 0x0051 }
            r1.close()     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0048:
            r6 = move-exception
            throw r6
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r2 = move-exception
            p020c3.C1302a.m6198a(r6, r0)     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x0058:
            r0 = move-exception
            p127t2.C3168b.m14046a(r6, r0)
            throw r6
        L_0x005d:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.i r6 = f8330a     // Catch:{ all -> 0x0075 }
            java.util.List r6 = r6.m11258f(r0)     // Catch:{ all -> 0x0075 }
            p020c3.C1302a.m6198a(r0, r4)
            return r6
        L_0x0075:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            p020c3.C1302a.m6198a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2413i.m11257e(java.net.URL):java.util.List");
    }

    /* renamed from: f */
    private final List<String> m11258f(BufferedReader bufferedReader) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C3271t.m14398M(linkedHashSet);
            }
            String obj = C2647q.m11997A0(C2647q.m12047z0(readLine, "#", (String) null, 2, (Object) null)).toString();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                if (obj.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    /* renamed from: c */
    public final List<C2431s> mo8980c() {
        C2431s sVar;
        Class<C2431s> cls = C2431s.class;
        if (!C2415j.m11265a()) {
            return m11256b(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            C2431s sVar2 = null;
            try {
                sVar = cls.cast(Class.forName("o3.a", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                sVar = null;
            }
            if (sVar != null) {
                arrayList.add(sVar);
            }
            try {
                sVar2 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (sVar2 == null) {
                return arrayList;
            }
            arrayList.add(sVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return m11256b(cls, cls.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> mo8981d(Class<S> cls, ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        C1924k.m9140f(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (T e : list) {
            boolean unused = C3268q.m14379p(arrayList, f8330a.m11257e(e));
        }
        Set<String> P = C3271t.m14401P(arrayList);
        if (!P.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C3264m.m14377n(P, 10));
            for (String a : P) {
                arrayList2.add(f8330a.m11255a(a, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
