package p030e;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0361q0;
import androidx.core.content.res.C0502k;
import androidx.core.graphics.drawable.C0520c;
import androidx.vectordrawable.graphics.drawable.C1166c;
import androidx.vectordrawable.graphics.drawable.C1177i;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p030e.C1754b;
import p030e.C1761e;
import p037f.C1895b;
import p037f.C1896c;
import p037f.C1898e;
import p070k.C2340d;
import p070k.C2349h;

/* renamed from: e.a */
public class C1746a extends C1761e implements C0520c {

    /* renamed from: w */
    private static final String f6534w = C1746a.class.getSimpleName();

    /* renamed from: r */
    private C1749c f6535r;

    /* renamed from: s */
    private C1753g f6536s;

    /* renamed from: t */
    private int f6537t;

    /* renamed from: u */
    private int f6538u;

    /* renamed from: v */
    private boolean f6539v;

    /* renamed from: e.a$b */
    private static class C1748b extends C1753g {

        /* renamed from: a */
        private final Animatable f6540a;

        C1748b(Animatable animatable) {
            super();
            this.f6540a = animatable;
        }

        /* renamed from: c */
        public void mo7336c() {
            this.f6540a.start();
        }

        /* renamed from: d */
        public void mo7337d() {
            this.f6540a.stop();
        }
    }

    /* renamed from: e.a$c */
    static class C1749c extends C1761e.C1762a {

        /* renamed from: K */
        C2340d<Long> f6541K;

        /* renamed from: L */
        C2349h<Integer> f6542L;

        C1749c(C1749c cVar, C1746a aVar, Resources resources) {
            super(cVar, aVar, resources);
            C2349h<Integer> hVar;
            if (cVar != null) {
                this.f6541K = cVar.f6541K;
                hVar = cVar.f6542L;
            } else {
                this.f6541K = new C2340d<>();
                hVar = new C2349h<>();
            }
            this.f6542L = hVar;
        }

        /* renamed from: D */
        private static long m8697D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo7338B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo7455z(iArr, drawable);
            this.f6542L.mo8811m(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo7339C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo7394a(drawable);
            long D = m8697D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f6541K.mo8694b(D, Long.valueOf(j2 | j));
            if (z) {
                this.f6541K.mo8694b(m8697D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo7340E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f6542L.mo8808j(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo7341F(int[] iArr) {
            int A = super.mo7454A(iArr);
            return A >= 0 ? A : super.mo7454A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo7342G(int i, int i2) {
            return (int) this.f6541K.mo8699j(m8697D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo7343H(int i, int i2) {
            return (this.f6541K.mo8699j(m8697D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo7344I(int i, int i2) {
            return (this.f6541K.mo8699j(m8697D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C1746a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1746a(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo7347r() {
            this.f6541K = this.f6541K.clone();
            this.f6542L = this.f6542L.clone();
        }
    }

    /* renamed from: e.a$d */
    private static class C1750d extends C1753g {

        /* renamed from: a */
        private final C1166c f6543a;

        C1750d(C1166c cVar) {
            super();
            this.f6543a = cVar;
        }

        /* renamed from: c */
        public void mo7336c() {
            this.f6543a.start();
        }

        /* renamed from: d */
        public void mo7337d() {
            this.f6543a.stop();
        }
    }

    /* renamed from: e.a$e */
    private static class C1751e extends C1753g {

        /* renamed from: a */
        private final ObjectAnimator f6544a;

        /* renamed from: b */
        private final boolean f6545b;

        C1751e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C1752f fVar = new C1752f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            C1895b.m9078a(ofInt, true);
            ofInt.setDuration((long) fVar.mo7350a());
            ofInt.setInterpolator(fVar);
            this.f6545b = z2;
            this.f6544a = ofInt;
        }

        /* renamed from: a */
        public boolean mo7348a() {
            return this.f6545b;
        }

        /* renamed from: b */
        public void mo7349b() {
            this.f6544a.reverse();
        }

        /* renamed from: c */
        public void mo7336c() {
            this.f6544a.start();
        }

        /* renamed from: d */
        public void mo7337d() {
            this.f6544a.cancel();
        }
    }

    /* renamed from: e.a$f */
    private static class C1752f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f6546a;

        /* renamed from: b */
        private int f6547b;

        /* renamed from: c */
        private int f6548c;

        C1752f(AnimationDrawable animationDrawable, boolean z) {
            mo7351b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7350a() {
            return this.f6548c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7351b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f6547b = numberOfFrames;
            int[] iArr = this.f6546a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f6546a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f6546a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f6548c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f6548c)) + 0.5f);
            int i2 = this.f6547b;
            int[] iArr = this.f6546a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f6548c) : 0.0f);
        }
    }

    /* renamed from: e.a$g */
    private static abstract class C1753g {
        private C1753g() {
        }

        /* renamed from: a */
        public boolean mo7348a() {
            return false;
        }

        /* renamed from: b */
        public void mo7349b() {
        }

        /* renamed from: c */
        public abstract void mo7336c();

        /* renamed from: d */
        public abstract void mo7337d();
    }

    public C1746a() {
        this((C1749c) null, (Resources) null);
    }

    C1746a(C1749c cVar, Resources resources) {
        super((C1761e.C1762a) null);
        this.f6537t = -1;
        this.f6538u = -1;
        mo7327h(new C1749c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C1746a m8683m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1746a aVar = new C1746a();
            aVar.mo7333n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m8684o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m8686q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m8687r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m8685p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m8686q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray s = C0502k.m2312s(resources, theme, attributeSet, C1898e.f6861h);
        int resourceId = s.getResourceId(C1898e.f6862i, 0);
        int resourceId2 = s.getResourceId(C1898e.f6863j, -1);
        Drawable j = resourceId2 > 0 ? C0361q0.m1709h().mo1970j(context, resourceId2) : null;
        s.recycle();
        int[] k = mo7453k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("vector") ? C1177i.m5829c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? C1896c.m9079a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j != null) {
            return this.f6535r.mo7338B(k, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m8687r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray s = C0502k.m2312s(resources, theme, attributeSet, C1898e.f6864k);
        int resourceId = s.getResourceId(C1898e.f6867n, -1);
        int resourceId2 = s.getResourceId(C1898e.f6866m, -1);
        int resourceId3 = s.getResourceId(C1898e.f6865l, -1);
        Drawable j = resourceId3 > 0 ? C0361q0.m1709h().mo1970j(context, resourceId3) : null;
        boolean z = s.getBoolean(C1898e.f6868o, false);
        s.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j = xmlPullParser.getName().equals("animated-vector") ? C1166c.m5791b(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? C1896c.m9079a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f6535r.mo7339C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m8688s(int i) {
        int i2;
        int G;
        C1753g gVar;
        C1753g gVar2 = this.f6536s;
        if (gVar2 == null) {
            i2 = mo7355c();
        } else if (i == this.f6537t) {
            return true;
        } else {
            if (i != this.f6538u || !gVar2.mo7348a()) {
                i2 = this.f6537t;
                gVar2.mo7337d();
            } else {
                gVar2.mo7349b();
                this.f6537t = this.f6538u;
                this.f6538u = i;
                return true;
            }
        }
        this.f6536s = null;
        this.f6538u = -1;
        this.f6537t = -1;
        C1749c cVar = this.f6535r;
        int E = cVar.mo7340E(i2);
        int E2 = cVar.mo7340E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo7342G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo7344I(E, E2);
        mo7358g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C1751e((AnimationDrawable) current, cVar.mo7343H(E, E2), I);
        } else if (current instanceof C1166c) {
            gVar = new C1750d((C1166c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C1748b((Animatable) current);
            }
            return false;
        }
        gVar.mo7336c();
        this.f6536s = gVar;
        this.f6538u = i2;
        this.f6537t = i;
        return true;
    }

    /* renamed from: t */
    private void m8689t(TypedArray typedArray) {
        C1749c cVar = this.f6535r;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f6575d |= C1896c.m9080b(typedArray);
        }
        cVar.mo7416x(typedArray.getBoolean(C1898e.f6857d, cVar.f6580i));
        cVar.mo7412t(typedArray.getBoolean(C1898e.f6858e, cVar.f6583l));
        cVar.mo7413u(typedArray.getInt(C1898e.f6859f, cVar.f6563A));
        cVar.mo7414v(typedArray.getInt(C1898e.f6860g, cVar.f6564B));
        setDither(typedArray.getBoolean(C1898e.f6855b, cVar.f6595x));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7327h(C1754b.C1758d dVar) {
        super.mo7327h(dVar);
        if (dVar instanceof C1749c) {
            this.f6535r = (C1749c) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C1753g gVar = this.f6536s;
        if (gVar != null) {
            gVar.mo7337d();
            this.f6536s = null;
            mo7358g(this.f6537t);
            this.f6537t = -1;
            this.f6538u = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1749c mo7329j() {
        return new C1749c(this.f6535r, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f6539v && super.mutate() == this) {
            this.f6535r.mo7347r();
            this.f6539v = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo7333n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray s = C0502k.m2312s(resources, theme, attributeSet, C1898e.f6854a);
        setVisible(s.getBoolean(C1898e.f6856c, true), true);
        m8689t(s);
        mo7371i(resources);
        s.recycle();
        m8684o(context, resources, xmlPullParser, attributeSet, theme);
        m8685p();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f6535r.mo7341F(iArr);
        boolean z = F != mo7355c() && (m8688s(F) || mo7358g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C1753g gVar = this.f6536s;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo7336c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
