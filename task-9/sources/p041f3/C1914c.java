package p041f3;

import java.io.Serializable;
import p074k3.C2384a;
import p074k3.C2386c;

/* renamed from: f3.c */
public abstract class C1914c implements C2384a, Serializable {

    /* renamed from: j */
    public static final Object f6879j = C1915a.f6886d;

    /* renamed from: d */
    private transient C2384a f6880d;

    /* renamed from: e */
    protected final Object f6881e;

    /* renamed from: f */
    private final Class f6882f;

    /* renamed from: g */
    private final String f6883g;

    /* renamed from: h */
    private final String f6884h;

    /* renamed from: i */
    private final boolean f6885i;

    /* renamed from: f3.c$a */
    private static class C1915a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final C1915a f6886d = new C1915a();

        private C1915a() {
        }
    }

    public C1914c() {
        this(f6879j);
    }

    protected C1914c(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C1914c(Object obj, Class cls, String str, String str2, boolean z) {
        this.f6881e = obj;
        this.f6882f = cls;
        this.f6883g = str;
        this.f6884h = str2;
        this.f6885i = z;
    }

    /* renamed from: a */
    public C2384a mo7649a() {
        C2384a aVar = this.f6880d;
        if (aVar != null) {
            return aVar;
        }
        C2384a b = mo7650b();
        this.f6880d = b;
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C2384a mo7650b();

    /* renamed from: d */
    public Object mo7651d() {
        return this.f6881e;
    }

    /* renamed from: e */
    public String mo7652e() {
        return this.f6883g;
    }

    /* renamed from: g */
    public C2386c mo7653g() {
        Class cls = this.f6882f;
        if (cls == null) {
            return null;
        }
        return this.f6885i ? C1933t.m9162c(cls) : C1933t.m9161b(cls);
    }

    /* renamed from: h */
    public String mo7654h() {
        return this.f6884h;
    }
}
