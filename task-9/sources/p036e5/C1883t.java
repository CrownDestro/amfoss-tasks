package p036e5;

import java.util.Objects;
import javax.annotation.Nullable;
import p134u3.C3313f0;
import p134u3.C3320g0;

/* renamed from: e5.t */
public final class C1883t<T> {

    /* renamed from: a */
    private final C3313f0 f6825a;
    @Nullable

    /* renamed from: b */
    private final T f6826b;
    @Nullable

    /* renamed from: c */
    private final C3320g0 f6827c;

    private C1883t(C3313f0 f0Var, @Nullable T t, @Nullable C3320g0 g0Var) {
        this.f6825a = f0Var;
        this.f6826b = t;
        this.f6827c = g0Var;
    }

    /* renamed from: c */
    public static <T> C1883t<T> m9032c(C3320g0 g0Var, C3313f0 f0Var) {
        Objects.requireNonNull(g0Var, "body == null");
        Objects.requireNonNull(f0Var, "rawResponse == null");
        if (!f0Var.mo10944C()) {
            return new C1883t<>(f0Var, (Object) null, g0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: f */
    public static <T> C1883t<T> m9033f(@Nullable T t, C3313f0 f0Var) {
        Objects.requireNonNull(f0Var, "rawResponse == null");
        if (f0Var.mo10944C()) {
            return new C1883t<>(f0Var, t, (C3320g0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    /* renamed from: a */
    public T mo7579a() {
        return this.f6826b;
    }

    /* renamed from: b */
    public int mo7580b() {
        return this.f6825a.mo10958i();
    }

    /* renamed from: d */
    public boolean mo7581d() {
        return this.f6825a.mo10944C();
    }

    /* renamed from: e */
    public String mo7582e() {
        return this.f6825a.mo10945D();
    }

    public String toString() {
        return this.f6825a.toString();
    }
}
