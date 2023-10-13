package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.C0591c;
import java.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.p */
class C0841p implements Spannable {

    /* renamed from: d */
    private boolean f2934d = false;

    /* renamed from: e */
    private Spannable f2935e;

    /* renamed from: androidx.emoji2.text.p$a */
    private static class C0842a {
        /* renamed from: a */
        static IntStream m3743a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        static IntStream m3744b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: androidx.emoji2.text.p$b */
    static class C0843b {
        C0843b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3201a(CharSequence charSequence) {
            return charSequence instanceof C0591c;
        }
    }

    /* renamed from: androidx.emoji2.text.p$c */
    static class C0844c extends C0843b {
        C0844c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3201a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof C0591c);
        }
    }

    C0841p(Spannable spannable) {
        this.f2935e = spannable;
    }

    C0841p(CharSequence charSequence) {
        this.f2935e = new SpannableString(charSequence);
    }

    /* renamed from: a */
    private void m3740a() {
        Spannable spannable = this.f2935e;
        if (!this.f2934d && m3741c().mo3201a(spannable)) {
            this.f2935e = new SpannableString(spannable);
        }
        this.f2934d = true;
    }

    /* renamed from: c */
    static C0843b m3741c() {
        return Build.VERSION.SDK_INT < 28 ? new C0843b() : new C0844c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Spannable mo3187b() {
        return this.f2935e;
    }

    public char charAt(int i) {
        return this.f2935e.charAt(i);
    }

    public IntStream chars() {
        return C0842a.m3743a(this.f2935e);
    }

    public IntStream codePoints() {
        return C0842a.m3744b(this.f2935e);
    }

    public int getSpanEnd(Object obj) {
        return this.f2935e.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2935e.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2935e.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f2935e.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2935e.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2935e.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        m3740a();
        this.f2935e.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        m3740a();
        this.f2935e.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2935e.subSequence(i, i2);
    }

    public String toString() {
        return this.f2935e.toString();
    }
}
