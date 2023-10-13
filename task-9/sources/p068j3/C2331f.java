package p068j3;

import p041f3.C1924k;
import p068j3.C2324a;

/* renamed from: j3.f */
class C2331f extends C2330e {
    /* renamed from: b */
    public static int m10816b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: c */
    public static long m10817c(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: d */
    public static int m10818d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: e */
    public static long m10819e(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: f */
    public static int m10820f(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: g */
    public static C2324a m10821g(int i, int i2) {
        return C2324a.f8042g.mo8653a(i, i2, -1);
    }

    /* renamed from: h */
    public static C2324a m10822h(C2324a aVar, int i) {
        C1924k.m9141g(aVar, "<this>");
        C2330e.m10815a(i > 0, Integer.valueOf(i));
        C2324a.C2325a aVar2 = C2324a.f8042g;
        int s = aVar.mo8648s();
        int x = aVar.mo8650x();
        if (aVar.mo8651y() <= 0) {
            i = -i;
        }
        return aVar2.mo8653a(s, x, i);
    }

    /* renamed from: i */
    public static C2327c m10823i(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? C2327c.f8050h.mo8659a() : new C2327c(i, i2 - 1);
    }
}
