package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.e0 */
final /* synthetic */ class C2403e0 {

    /* renamed from: a */
    private static final int f8313a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m11209a() {
        return f8313a;
    }

    /* renamed from: b */
    public static final String m11210b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
