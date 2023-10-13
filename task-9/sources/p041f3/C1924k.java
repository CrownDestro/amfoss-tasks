package p041f3;

import java.util.Arrays;
import p127t2.C3171e;
import p127t2.C3186r;

/* renamed from: f3.k */
public class C1924k {
    private C1924k() {
    }

    /* renamed from: a */
    public static boolean m9135a(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    /* renamed from: b */
    public static boolean m9136b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static void m9137c(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m9145k(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: d */
    public static void m9138d(Object obj) {
        if (obj == null) {
            m9148n();
        }
    }

    /* renamed from: e */
    public static void m9139e(Object obj, String str) {
        if (obj == null) {
            m9149o(str);
        }
    }

    /* renamed from: f */
    public static void m9140f(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m9145k(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: g */
    public static void m9141g(Object obj, String str) {
        if (obj == null) {
            m9152r(str);
        }
    }

    /* renamed from: h */
    public static void m9142h(Object obj, String str) {
        if (obj == null) {
            m9151q(str);
        }
    }

    /* renamed from: i */
    public static int m9143i(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: j */
    private static String m9144j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C1924k.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: k */
    private static <T extends Throwable> T m9145k(T t) {
        return m9146l(t, C1924k.class.getName());
    }

    /* renamed from: l */
    static <T extends Throwable> T m9146l(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: m */
    public static String m9147m(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: n */
    public static void m9148n() {
        throw ((NullPointerException) m9145k(new NullPointerException()));
    }

    /* renamed from: o */
    public static void m9149o(String str) {
        throw ((NullPointerException) m9145k(new NullPointerException(str)));
    }

    /* renamed from: p */
    public static void m9150p() {
        throw ((C3171e) m9145k(new C3171e()));
    }

    /* renamed from: q */
    private static void m9151q(String str) {
        throw ((IllegalArgumentException) m9145k(new IllegalArgumentException(m9144j(str))));
    }

    /* renamed from: r */
    private static void m9152r(String str) {
        throw ((NullPointerException) m9145k(new NullPointerException(m9144j(str))));
    }

    /* renamed from: s */
    public static void m9153s(String str) {
        throw ((C3186r) m9145k(new C3186r(str)));
    }

    /* renamed from: t */
    public static void m9154t(String str) {
        m9153s("lateinit property " + str + " has not been initialized");
    }
}
