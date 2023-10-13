package p041f3;

/* renamed from: f3.m */
public final class C1926m implements C1916d {

    /* renamed from: a */
    private final Class<?> f6898a;

    /* renamed from: b */
    private final String f6899b;

    public C1926m(Class<?> cls, String str) {
        C1924k.m9141g(cls, "jClass");
        C1924k.m9141g(str, "moduleName");
        this.f6898a = cls;
        this.f6899b = str;
    }

    /* renamed from: b */
    public Class<?> mo7655b() {
        return this.f6898a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1926m) && C1924k.m9136b(mo7655b(), ((C1926m) obj).mo7655b());
    }

    public int hashCode() {
        return mo7655b().hashCode();
    }

    public String toString() {
        return mo7655b().toString() + " (Kotlin reflection is not available)";
    }
}
