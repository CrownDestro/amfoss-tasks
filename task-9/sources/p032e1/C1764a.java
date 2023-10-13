package p032e1;

/* renamed from: e1.a */
public final class C1764a {
    /* renamed from: a */
    public static float m8768a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m8769b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m8771d(m8768a(f, f2, f3, f4), m8768a(f, f2, f5, f4), m8768a(f, f2, f5, f6), m8768a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m8770c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m8771d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
