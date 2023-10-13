package p101p0;

import java.util.Objects;
import p034e3.C1780l;
import p041f3.C1924k;
import p101p0.C2910f;
import p127t2.C3176j;

/* renamed from: p0.d */
final class C2907d<T> extends C2910f<T> {

    /* renamed from: b */
    private final T f9638b;

    /* renamed from: c */
    private final String f9639c;

    /* renamed from: d */
    private final String f9640d;

    /* renamed from: e */
    private final C2909e f9641e;

    /* renamed from: f */
    private final C2910f.C2912b f9642f;

    /* renamed from: g */
    private final C2917i f9643g;

    /* renamed from: p0.d$a */
    public /* synthetic */ class C2908a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9644a;

        static {
            int[] iArr = new int[C2910f.C2912b.values().length];
            iArr[C2910f.C2912b.STRICT.ordinal()] = 1;
            iArr[C2910f.C2912b.LOG.ordinal()] = 2;
            iArr[C2910f.C2912b.QUIET.ordinal()] = 3;
            f9644a = iArr;
        }
    }

    public C2907d(T t, String str, String str2, C2909e eVar, C2910f.C2912b bVar) {
        C1924k.m9141g(t, "value");
        C1924k.m9141g(str, "tag");
        C1924k.m9141g(str2, "message");
        C1924k.m9141g(eVar, "logger");
        C1924k.m9141g(bVar, "verificationMode");
        this.f9638b = t;
        this.f9639c = str;
        this.f9640d = str2;
        this.f9641e = eVar;
        this.f9642f = bVar;
        C2917i iVar = new C2917i(mo10079b(t, str2));
        StackTraceElement[] stackTrace = iVar.getStackTrace();
        C1924k.m9140f(stackTrace, "stackTrace");
        Object[] array = C3257h.m14320k(stackTrace, 2).toArray(new StackTraceElement[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        iVar.setStackTrace((StackTraceElement[]) array);
        this.f9643g = iVar;
    }

    /* renamed from: a */
    public T mo10077a() {
        int i = C2908a.f9644a[this.f9642f.ordinal()];
        if (i == 1) {
            throw this.f9643g;
        } else if (i == 2) {
            this.f9641e.mo10066a(this.f9639c, mo10079b(this.f9638b, this.f9640d));
            return null;
        } else if (i == 3) {
            return null;
        } else {
            throw new C3176j();
        }
    }

    /* renamed from: c */
    public C2910f<T> mo10078c(String str, C1780l<? super T, Boolean> lVar) {
        C1924k.m9141g(str, "message");
        C1924k.m9141g(lVar, "condition");
        return this;
    }
}
