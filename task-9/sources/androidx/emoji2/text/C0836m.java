package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.p008os.C0560k;
import androidx.core.util.C0612h;
import java.nio.ByteBuffer;
import p154y.C3550b;

/* renamed from: androidx.emoji2.text.m */
public final class C0836m {

    /* renamed from: a */
    private final C3550b f2923a;

    /* renamed from: b */
    private final char[] f2924b;

    /* renamed from: c */
    private final C0837a f2925c = new C0837a(1024);

    /* renamed from: d */
    private final Typeface f2926d;

    /* renamed from: androidx.emoji2.text.m$a */
    static class C0837a {

        /* renamed from: a */
        private final SparseArray<C0837a> f2927a;

        /* renamed from: b */
        private C0823g f2928b;

        private C0837a() {
            this(1);
        }

        C0837a(int i) {
            this.f2927a = new SparseArray<>(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0837a mo3156a(int i) {
            SparseArray<C0837a> sparseArray = this.f2927a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C0823g mo3157b() {
            return this.f2928b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3158c(C0823g gVar, int i, int i2) {
            C0837a a = mo3156a(gVar.mo3118b(i));
            if (a == null) {
                a = new C0837a();
                this.f2927a.put(gVar.mo3118b(i), a);
            }
            if (i2 > i) {
                a.mo3158c(gVar, i + 1, i2);
            } else {
                a.f2928b = gVar;
            }
        }
    }

    private C0836m(Typeface typeface, C3550b bVar) {
        this.f2926d = typeface;
        this.f2923a = bVar;
        this.f2924b = new char[(bVar.mo11624k() * 2)];
        m3716a(bVar);
    }

    /* renamed from: a */
    private void m3716a(C3550b bVar) {
        int k = bVar.mo11624k();
        for (int i = 0; i < k; i++) {
            C0823g gVar = new C0823g(this, i);
            Character.toChars(gVar.mo3122f(), this.f2924b, i * 2);
            mo3155h(gVar);
        }
    }

    /* renamed from: b */
    public static C0836m m3717b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            C0560k.m2546a("EmojiCompat.MetadataRepo.create");
            return new C0836m(typeface, C0832l.m3704b(byteBuffer));
        } finally {
            C0560k.m2547b();
        }
    }

    /* renamed from: c */
    public char[] mo3150c() {
        return this.f2924b;
    }

    /* renamed from: d */
    public C3550b mo3151d() {
        return this.f2923a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3152e() {
        return this.f2923a.mo11625l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0837a mo3153f() {
        return this.f2925c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Typeface mo3154g() {
        return this.f2926d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3155h(C0823g gVar) {
        C0612h.m2671h(gVar, "emoji metadata cannot be null");
        C0612h.m2665b(gVar.mo3119c() > 0, "invalid metadata codepoint length");
        this.f2925c.mo3158c(gVar, 0, gVar.mo3119c() - 1);
    }
}
