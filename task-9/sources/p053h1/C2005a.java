package p053h1;

import android.graphics.Typeface;

/* renamed from: h1.a */
public final class C2005a extends C2013f {

    /* renamed from: a */
    private final Typeface f7068a;

    /* renamed from: b */
    private final C2006a f7069b;

    /* renamed from: c */
    private boolean f7070c;

    /* renamed from: h1.a$a */
    public interface C2006a {
        /* renamed from: a */
        void mo6430a(Typeface typeface);
    }

    public C2005a(C2006a aVar, Typeface typeface) {
        this.f7068a = typeface;
        this.f7069b = aVar;
    }

    /* renamed from: d */
    private void m9255d(Typeface typeface) {
        if (!this.f7070c) {
            this.f7069b.mo6430a(typeface);
        }
    }

    /* renamed from: a */
    public void mo5873a(int i) {
        m9255d(this.f7068a);
    }

    /* renamed from: b */
    public void mo5874b(Typeface typeface, boolean z) {
        m9255d(typeface);
    }

    /* renamed from: c */
    public void mo7742c() {
        this.f7070c = true;
    }
}
