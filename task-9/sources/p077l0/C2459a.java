package p077l0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l0.a */
public final class C2459a {

    /* renamed from: a */
    private static long f8424a;

    /* renamed from: b */
    private static Method f8425b;

    /* renamed from: c */
    private static Method f8426c;

    /* renamed from: d */
    private static Method f8427d;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m11408a(String str, int i) {
        try {
            if (f8426c == null) {
                C2461c.m11419a(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m11409b(str, i);
    }

    /* renamed from: b */
    private static void m11409b(String str, int i) {
        try {
            if (f8426c == null) {
                f8426c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f8426c.invoke((Object) null, new Object[]{Long.valueOf(f8424a), str, Integer.valueOf(i)});
        } catch (Exception e) {
            m11414g("asyncTraceBegin", e);
        }
    }

    /* renamed from: c */
    public static void m11410c(String str) {
        C2460b.m11417a(str);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static void m11411d(String str, int i) {
        try {
            if (f8427d == null) {
                C2461c.m11420b(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m11412e(str, i);
    }

    /* renamed from: e */
    private static void m11412e(String str, int i) {
        try {
            if (f8427d == null) {
                f8427d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f8427d.invoke((Object) null, new Object[]{Long.valueOf(f8424a), str, Integer.valueOf(i)});
        } catch (Exception e) {
            m11414g("asyncTraceEnd", e);
        }
    }

    /* renamed from: f */
    public static void m11413f() {
        C2460b.m11418b();
    }

    /* renamed from: g */
    private static void m11414g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public static boolean m11415h() {
        try {
            if (f8425b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m11416i();
    }

    /* renamed from: i */
    private static boolean m11416i() {
        try {
            if (f8425b == null) {
                f8424a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f8425b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f8425b.invoke((Object) null, new Object[]{Long.valueOf(f8424a)})).booleanValue();
        } catch (Exception e) {
            m11414g("isTagEnabled", e);
            return false;
        }
    }
}
