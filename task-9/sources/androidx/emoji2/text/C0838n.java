package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C0612h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.n */
public final class C0838n extends SpannableStringBuilder {

    /* renamed from: d */
    private final Class<?> f2929d;

    /* renamed from: e */
    private final List<C0839a> f2930e = new ArrayList();

    /* renamed from: androidx.emoji2.text.n$a */
    private static class C0839a implements TextWatcher, SpanWatcher {

        /* renamed from: d */
        final Object f2931d;

        /* renamed from: e */
        private final AtomicInteger f2932e = new AtomicInteger(0);

        C0839a(Object obj) {
            this.f2931d = obj;
        }

        /* renamed from: b */
        private boolean m3736b(Object obj) {
            return obj instanceof C0827i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3178a() {
            this.f2932e.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2931d).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2931d).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo3181c() {
            this.f2932e.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2932e.get() <= 0 || !m3736b(obj)) {
                ((SpanWatcher) this.f2931d).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f2932e.get() <= 0 || !m3736b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = i > i2 ? 0 : i;
                    if (i3 > i4) {
                        i6 = i7;
                        i5 = 0;
                    } else {
                        i5 = i3;
                        i6 = i7;
                    }
                } else {
                    i6 = i;
                    i5 = i3;
                }
                ((SpanWatcher) this.f2931d).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f2932e.get() <= 0 || !m3736b(obj)) {
                ((SpanWatcher) this.f2931d).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f2931d).onTextChanged(charSequence, i, i2, i3);
        }
    }

    C0838n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C0612h.m2671h(cls, "watcherClass cannot be null");
        this.f2929d = cls;
    }

    C0838n(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C0612h.m2671h(cls, "watcherClass cannot be null");
        this.f2929d = cls;
    }

    /* renamed from: b */
    private void m3727b() {
        for (int i = 0; i < this.f2930e.size(); i++) {
            this.f2930e.get(i).mo3178a();
        }
    }

    /* renamed from: c */
    public static C0838n m3728c(Class<?> cls, CharSequence charSequence) {
        return new C0838n(cls, charSequence);
    }

    /* renamed from: e */
    private void m3729e() {
        for (int i = 0; i < this.f2930e.size(); i++) {
            this.f2930e.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    private C0839a m3730f(Object obj) {
        for (int i = 0; i < this.f2930e.size(); i++) {
            C0839a aVar = this.f2930e.get(i);
            if (aVar.f2931d == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m3731g(Class<?> cls) {
        return this.f2929d == cls;
    }

    /* renamed from: h */
    private boolean m3732h(Object obj) {
        return obj != null && m3731g(obj.getClass());
    }

    /* renamed from: i */
    private void m3733i() {
        for (int i = 0; i < this.f2930e.size(); i++) {
            this.f2930e.get(i).mo3181c();
        }
    }

    /* renamed from: a */
    public void mo3159a() {
        m3727b();
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* renamed from: d */
    public void mo3164d() {
        m3733i();
        m3729e();
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public int getSpanEnd(Object obj) {
        C0839a f;
        if (m3732h(obj) && (f = m3730f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C0839a f;
        if (m3732h(obj) && (f = m3730f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C0839a f;
        if (m3732h(obj) && (f = m3730f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m3731g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C0839a[] aVarArr = (C0839a[]) super.getSpans(i, i2, C0839a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f2931d;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public int nextSpanTransition(int i, int i2, Class<C0839a> cls) {
        if (cls == null || m3731g(cls)) {
            cls = C0839a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C0839a aVar;
        if (m3732h(obj)) {
            aVar = m3730f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2930e.remove(aVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m3727b();
        super.replace(i, i2, charSequence);
        m3733i();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m3727b();
        super.replace(i, i2, charSequence, i3, i4);
        m3733i();
        return this;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m3732h(obj)) {
            C0839a aVar = new C0839a(obj);
            this.f2930e.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new C0838n(this.f2929d, this, i, i2);
    }
}
