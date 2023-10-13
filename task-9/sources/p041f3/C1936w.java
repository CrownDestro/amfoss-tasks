package p041f3;

import java.util.List;
import p034e3.C1769a;
import p034e3.C1770b;
import p034e3.C1771c;
import p034e3.C1772d;
import p034e3.C1773e;
import p034e3.C1774f;
import p034e3.C1775g;
import p034e3.C1776h;
import p034e3.C1777i;
import p034e3.C1778j;
import p034e3.C1779k;
import p034e3.C1780l;
import p034e3.C1781m;
import p034e3.C1782n;
import p034e3.C1783o;
import p034e3.C1784p;
import p034e3.C1785q;
import p034e3.C1786r;
import p034e3.C1787s;
import p034e3.C1788t;
import p034e3.C1789u;
import p034e3.C1790v;
import p034e3.C1791w;
import p048g3.C1964a;
import p127t2.C3169c;

/* renamed from: f3.w */
public class C1936w {
    /* renamed from: a */
    public static Iterable m9172a(Object obj) {
        if (obj instanceof C1964a) {
            m9181j(obj, "kotlin.collections.MutableIterable");
        }
        return m9175d(obj);
    }

    /* renamed from: b */
    public static List m9173b(Object obj) {
        if (obj instanceof C1964a) {
            m9181j(obj, "kotlin.collections.MutableList");
        }
        return m9176e(obj);
    }

    /* renamed from: c */
    public static Object m9174c(Object obj, int i) {
        if (obj != null && !m9178g(obj, i)) {
            m9181j(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: d */
    public static Iterable m9175d(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m9180i(e);
        }
    }

    /* renamed from: e */
    public static List m9176e(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m9180i(e);
        }
    }

    /* renamed from: f */
    public static int m9177f(Object obj) {
        if (obj instanceof C1921h) {
            return ((C1921h) obj).mo7661f();
        }
        if (obj instanceof C1769a) {
            return 0;
        }
        if (obj instanceof C1780l) {
            return 1;
        }
        if (obj instanceof C1784p) {
            return 2;
        }
        if (obj instanceof C1785q) {
            return 3;
        }
        if (obj instanceof C1786r) {
            return 4;
        }
        if (obj instanceof C1787s) {
            return 5;
        }
        if (obj instanceof C1788t) {
            return 6;
        }
        if (obj instanceof C1789u) {
            return 7;
        }
        if (obj instanceof C1790v) {
            return 8;
        }
        if (obj instanceof C1791w) {
            return 9;
        }
        if (obj instanceof C1770b) {
            return 10;
        }
        if (obj instanceof C1771c) {
            return 11;
        }
        if (obj instanceof C1772d) {
            return 12;
        }
        if (obj instanceof C1773e) {
            return 13;
        }
        if (obj instanceof C1774f) {
            return 14;
        }
        if (obj instanceof C1775g) {
            return 15;
        }
        if (obj instanceof C1776h) {
            return 16;
        }
        if (obj instanceof C1777i) {
            return 17;
        }
        if (obj instanceof C1778j) {
            return 18;
        }
        if (obj instanceof C1779k) {
            return 19;
        }
        if (obj instanceof C1781m) {
            return 20;
        }
        if (obj instanceof C1782n) {
            return 21;
        }
        return obj instanceof C1783o ? 22 : -1;
    }

    /* renamed from: g */
    public static boolean m9178g(Object obj, int i) {
        return (obj instanceof C3169c) && m9177f(obj) == i;
    }

    /* renamed from: h */
    private static <T extends Throwable> T m9179h(T t) {
        return C1924k.m9146l(t, C1936w.class.getName());
    }

    /* renamed from: i */
    public static ClassCastException m9180i(ClassCastException classCastException) {
        throw ((ClassCastException) m9179h(classCastException));
    }

    /* renamed from: j */
    public static void m9181j(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m9182k(name + " cannot be cast to " + str);
    }

    /* renamed from: k */
    public static void m9182k(String str) {
        throw m9180i(new ClassCastException(str));
    }
}
