package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: androidx.lifecycle.f */
public abstract class C0988f {

    /* renamed from: a */
    private AtomicReference<Object> f3417a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.f$a */
    public enum C0989a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0990a Companion = null;

        /* renamed from: androidx.lifecycle.f$a$a */
        public static final class C0990a {

            /* renamed from: androidx.lifecycle.f$a$a$a */
            public /* synthetic */ class C0991a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f3418a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        androidx.lifecycle.f$b[] r0 = androidx.lifecycle.C0988f.C0993b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        f3418a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0988f.C0989a.C0990a.C0991a.<clinit>():void");
                }
            }

            private C0990a() {
            }

            public /* synthetic */ C0990a(C1920g gVar) {
                this();
            }

            /* renamed from: a */
            public final C0989a mo3779a(C0993b bVar) {
                C1924k.m9141g(bVar, "state");
                int i = C0991a.f3418a[bVar.ordinal()];
                if (i == 1) {
                    return C0989a.ON_DESTROY;
                }
                if (i == 2) {
                    return C0989a.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return C0989a.ON_PAUSE;
            }

            /* renamed from: b */
            public final C0989a mo3780b(C0993b bVar) {
                C1924k.m9141g(bVar, "state");
                int i = C0991a.f3418a[bVar.ordinal()];
                if (i == 1) {
                    return C0989a.ON_START;
                }
                if (i == 2) {
                    return C0989a.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return C0989a.ON_CREATE;
            }

            /* renamed from: c */
            public final C0989a mo3781c(C0993b bVar) {
                C1924k.m9141g(bVar, "state");
                int i = C0991a.f3418a[bVar.ordinal()];
                if (i == 1) {
                    return C0989a.ON_CREATE;
                }
                if (i == 2) {
                    return C0989a.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return C0989a.ON_RESUME;
            }
        }

        /* renamed from: androidx.lifecycle.f$a$b */
        public /* synthetic */ class C0992b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f3419a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.f$a[] r0 = androidx.lifecycle.C0988f.C0989a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f3419a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0988f.C0989a.C0992b.<clinit>():void");
            }
        }

        static {
            Companion = new C0990a((C1920g) null);
        }

        /* renamed from: b */
        public final C0993b mo3778b() {
            switch (C0992b.f3419a[ordinal()]) {
                case 1:
                case 2:
                    return C0993b.CREATED;
                case 3:
                case 4:
                    return C0993b.STARTED;
                case 5:
                    return C0993b.RESUMED;
                case 6:
                    return C0993b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.f$b */
    public enum C0993b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: b */
        public final boolean mo3782b(C0993b bVar) {
            C1924k.m9141g(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo3774a(C1004l lVar);

    /* renamed from: b */
    public abstract C0993b mo3775b();

    /* renamed from: c */
    public final AtomicReference<Object> mo3776c() {
        return this.f3417a;
    }

    /* renamed from: d */
    public abstract void mo3777d(C1004l lVar);
}
