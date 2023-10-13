package p086m3;

import java.io.Serializable;
import java.util.regex.Pattern;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: m3.f */
public final class C2633f implements Serializable {

    /* renamed from: e */
    public static final C2634a f8867e = new C2634a((C1920g) null);

    /* renamed from: d */
    private final Pattern f8868d;

    /* renamed from: m3.f$a */
    public static final class C2634a {
        private C2634a() {
        }

        public /* synthetic */ C2634a(C1920g gVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2633f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p041f3.C1924k.m9141g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            p041f3.C1924k.m9140f(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086m3.C2633f.<init>(java.lang.String):void");
    }

    public C2633f(Pattern pattern) {
        C1924k.m9141g(pattern, "nativePattern");
        this.f8868d = pattern;
    }

    /* renamed from: a */
    public final boolean mo9325a(CharSequence charSequence) {
        C1924k.m9141g(charSequence, "input");
        return this.f8868d.matcher(charSequence).matches();
    }

    /* renamed from: b */
    public final String mo9326b(CharSequence charSequence, String str) {
        C1924k.m9141g(charSequence, "input");
        C1924k.m9141g(str, "replacement");
        String replaceAll = this.f8868d.matcher(charSequence).replaceAll(str);
        C1924k.m9140f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f8868d.toString();
        C1924k.m9140f(pattern, "nativePattern.toString()");
        return pattern;
    }
}
