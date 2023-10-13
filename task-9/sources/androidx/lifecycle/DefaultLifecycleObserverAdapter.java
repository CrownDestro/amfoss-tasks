package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import p041f3.C1924k;

public final class DefaultLifecycleObserverAdapter implements C1002j {

    /* renamed from: d */
    private final DefaultLifecycleObserver f3339d;

    /* renamed from: e */
    private final C1002j f3340e;

    /* renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    public /* synthetic */ class C0958a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3341a;

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
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.f$a r1 = androidx.lifecycle.C0988f.C0989a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
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
                f3341a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.DefaultLifecycleObserverAdapter.C0958a.<clinit>():void");
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, C1002j jVar) {
        C1924k.m9141g(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f3339d = defaultLifecycleObserver;
        this.f3340e = jVar;
    }

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        C1924k.m9141g(mVar, "source");
        C1924k.m9141g(aVar, "event");
        switch (C0958a.f3341a[aVar.ordinal()]) {
            case 1:
                this.f3339d.mo3079g(mVar);
                break;
            case 2:
                this.f3339d.mo3082p(mVar);
                break;
            case 3:
                this.f3339d.mo3077e(mVar);
                break;
            case 4:
                this.f3339d.mo3080m(mVar);
                break;
            case 5:
                this.f3339d.mo3081n(mVar);
                break;
            case 6:
                this.f3339d.mo3078f(mVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1002j jVar = this.f3340e;
        if (jVar != null) {
            jVar.mo144j(mVar, aVar);
        }
    }
}
