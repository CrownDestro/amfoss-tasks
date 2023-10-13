package p068j3;

import p041f3.C1920g;
import p048g3.C1964a;
import p133u2.C3277y;
import p163z2.C3631c;

/* renamed from: j3.a */
public class C2324a implements Iterable<Integer>, C1964a {

    /* renamed from: g */
    public static final C2325a f8042g = new C2325a((C1920g) null);

    /* renamed from: d */
    private final int f8043d;

    /* renamed from: e */
    private final int f8044e;

    /* renamed from: f */
    private final int f8045f;

    /* renamed from: j3.a$a */
    public static final class C2325a {
        private C2325a() {
        }

        public /* synthetic */ C2325a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2324a mo8653a(int i, int i2, int i3) {
            return new C2324a(i, i2, i3);
        }
    }

    public C2324a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f8043d = i;
            this.f8044e = C3631c.m16098b(i, i2, i3);
            this.f8045f = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2324a) {
            if (!isEmpty() || !((C2324a) obj).isEmpty()) {
                C2324a aVar = (C2324a) obj;
                if (!(this.f8043d == aVar.f8043d && this.f8044e == aVar.f8044e && this.f8045f == aVar.f8045f)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8043d * 31) + this.f8044e) * 31) + this.f8045f;
    }

    public boolean isEmpty() {
        if (this.f8045f > 0) {
            if (this.f8043d > this.f8044e) {
                return true;
            }
        } else if (this.f8043d < this.f8044e) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final int mo8648s() {
        return this.f8043d;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f8045f > 0) {
            sb = new StringBuilder();
            sb.append(this.f8043d);
            sb.append("..");
            sb.append(this.f8044e);
            sb.append(" step ");
            i = this.f8045f;
        } else {
            sb = new StringBuilder();
            sb.append(this.f8043d);
            sb.append(" downTo ");
            sb.append(this.f8044e);
            sb.append(" step ");
            i = -this.f8045f;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: x */
    public final int mo8650x() {
        return this.f8044e;
    }

    /* renamed from: y */
    public final int mo8651y() {
        return this.f8045f;
    }

    /* renamed from: z */
    public C3277y iterator() {
        return new C2326b(this.f8043d, this.f8044e, this.f8045f);
    }
}
