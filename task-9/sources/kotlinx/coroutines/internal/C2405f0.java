package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.f0 */
final /* synthetic */ class C2405f0 {
    /* renamed from: a */
    public static final int m11212a(String str, int i, int i2, int i3) {
        return (int) C2401d0.m11203c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m11213b(String str, long j, long j2, long j3) {
        String d = C2401d0.m11204d(str);
        if (d == null) {
            return j;
        }
        Long k = C2645o.m11979k(d);
        if (k != null) {
            long longValue = k.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m11214c(String str, boolean z) {
        String d = C2401d0.m11204d(str);
        return d != null ? Boolean.parseBoolean(d) : z;
    }

    /* renamed from: d */
    public static /* synthetic */ int m11215d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C2401d0.m11202b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m11216e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C2401d0.m11203c(str, j, j4, j3);
    }
}
