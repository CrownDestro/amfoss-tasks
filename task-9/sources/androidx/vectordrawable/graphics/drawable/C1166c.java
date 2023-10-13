package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.C0502k;
import androidx.core.graphics.drawable.C0515a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p070k.C2335a;

/* renamed from: androidx.vectordrawable.graphics.drawable.c */
public class C1166c extends C1176h implements Animatable {

    /* renamed from: e */
    private C1169c f4081e;

    /* renamed from: f */
    private Context f4082f;

    /* renamed from: g */
    private ArgbEvaluator f4083g;

    /* renamed from: h */
    C1170d f4084h;

    /* renamed from: i */
    private Animator.AnimatorListener f4085i;

    /* renamed from: j */
    ArrayList<C1164b> f4086j;

    /* renamed from: k */
    final Drawable.Callback f4087k;

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    class C1167a implements Drawable.Callback {
        C1167a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1166c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1166c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1166c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    class C1168b extends AnimatorListenerAdapter {
        C1168b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C1166c.this.f4086j);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1164b) arrayList.get(i)).mo4780b(C1166c.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C1166c.this.f4086j);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1164b) arrayList.get(i)).mo4781c(C1166c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    private static class C1169c extends Drawable.ConstantState {

        /* renamed from: a */
        int f4090a;

        /* renamed from: b */
        C1177i f4091b;

        /* renamed from: c */
        AnimatorSet f4092c;

        /* renamed from: d */
        ArrayList<Animator> f4093d;

        /* renamed from: e */
        C2335a<Animator, String> f4094e;

        public C1169c(Context context, C1169c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f4090a = cVar.f4090a;
                C1177i iVar = cVar.f4091b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f4091b = (C1177i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C1177i iVar2 = (C1177i) this.f4091b.mutate();
                    this.f4091b = iVar2;
                    iVar2.setCallback(callback);
                    this.f4091b.setBounds(cVar.f4091b.getBounds());
                    this.f4091b.mo4853h(false);
                }
                ArrayList<Animator> arrayList = cVar.f4093d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4093d = new ArrayList<>(size);
                    this.f4094e = new C2335a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.f4093d.get(i);
                        Animator clone = animator.clone();
                        String str = cVar.f4094e.get(animator);
                        clone.setTarget(this.f4091b.mo4844d(str));
                        this.f4093d.add(clone);
                        this.f4094e.put(clone, str);
                    }
                    mo4830a();
                }
            }
        }

        /* renamed from: a */
        public void mo4830a() {
            if (this.f4092c == null) {
                this.f4092c = new AnimatorSet();
            }
            this.f4092c.playTogether(this.f4093d);
        }

        public int getChangingConfigurations() {
            return this.f4090a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$d */
    private static class C1170d extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4095a;

        public C1170d(Drawable.ConstantState constantState) {
            this.f4095a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4095a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4095a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1166c cVar = new C1166c();
            Drawable newDrawable = this.f4095a.newDrawable();
            cVar.f4100d = newDrawable;
            newDrawable.setCallback(cVar.f4087k);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1166c cVar = new C1166c();
            Drawable newDrawable = this.f4095a.newDrawable(resources);
            cVar.f4100d = newDrawable;
            newDrawable.setCallback(cVar.f4087k);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1166c cVar = new C1166c();
            Drawable newDrawable = this.f4095a.newDrawable(resources, theme);
            cVar.f4100d = newDrawable;
            newDrawable.setCallback(cVar.f4087k);
            return cVar;
        }
    }

    C1166c() {
        this((Context) null, (C1169c) null, (Resources) null);
    }

    private C1166c(Context context) {
        this(context, (C1169c) null, (Resources) null);
    }

    private C1166c(Context context, C1169c cVar, Resources resources) {
        this.f4083g = null;
        this.f4085i = null;
        this.f4086j = null;
        C1167a aVar = new C1167a();
        this.f4087k = aVar;
        this.f4082f = context;
        if (cVar != null) {
            this.f4081e = cVar;
        } else {
            this.f4081e = new C1169c(context, cVar, aVar, resources);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[Catch:{ IOException | XmlPullParserException -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056 A[Catch:{ IOException | XmlPullParserException -> 0x005e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.C1166c m5790a(android.content.Context r6, int r7) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "AnimatedVDCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0030
            androidx.vectordrawable.graphics.drawable.c r0 = new androidx.vectordrawable.graphics.drawable.c
            r0.<init>(r6)
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.C0490h.m2267e(r1, r7, r6)
            r0.f4100d = r6
            android.graphics.drawable.Drawable$Callback r7 = r0.f4087k
            r6.setCallback(r7)
            androidx.vectordrawable.graphics.drawable.c$d r6 = new androidx.vectordrawable.graphics.drawable.c$d
            android.graphics.drawable.Drawable r7 = r0.f4100d
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f4084h = r6
            return r0
        L_0x0030:
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.XmlResourceParser r7 = r2.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
        L_0x003c:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            r4 = 2
            if (r3 == r4) goto L_0x0047
            r5 = 1
            if (r3 == r5) goto L_0x0047
            goto L_0x003c
        L_0x0047:
            if (r3 != r4) goto L_0x0056
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            android.content.res.Resources$Theme r4 = r6.getTheme()     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            androidx.vectordrawable.graphics.drawable.c r6 = m5791b(r6, r3, r7, r2, r4)     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            return r6
        L_0x0056:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
            throw r6     // Catch:{ XmlPullParserException -> 0x0060, IOException -> 0x005e }
        L_0x005e:
            r6 = move-exception
            goto L_0x0061
        L_0x0060:
            r6 = move-exception
        L_0x0061:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1166c.m5790a(android.content.Context, int):androidx.vectordrawable.graphics.drawable.c");
    }

    /* renamed from: b */
    public static C1166c m5791b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1166c cVar = new C1166c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: d */
    private static void m5792d(AnimatedVectorDrawable animatedVectorDrawable, C1164b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.mo4779a());
    }

    /* renamed from: e */
    private void m5793e() {
        Animator.AnimatorListener animatorListener = this.f4085i;
        if (animatorListener != null) {
            this.f4081e.f4092c.removeListener(animatorListener);
            this.f4085i = null;
        }
    }

    /* renamed from: f */
    private void m5794f(String str, Animator animator) {
        animator.setTarget(this.f4081e.f4091b.mo4844d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m5795g(animator);
        }
        C1169c cVar = this.f4081e;
        if (cVar.f4093d == null) {
            cVar.f4093d = new ArrayList<>();
            this.f4081e.f4094e = new C2335a<>();
        }
        this.f4081e.f4093d.add(animator);
        this.f4081e.f4094e.put(animator, str);
    }

    /* renamed from: g */
    private void m5795g(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m5795g(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4083g == null) {
                    this.f4083g = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4083g);
            }
        }
    }

    /* renamed from: i */
    private static boolean m5796i(AnimatedVectorDrawable animatedVectorDrawable, C1164b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.mo4779a());
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2360a(drawable, theme);
        }
    }

    /* renamed from: c */
    public void mo4785c(C1164b bVar) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            m5792d((AnimatedVectorDrawable) drawable, bVar);
        } else if (bVar != null) {
            if (this.f4086j == null) {
                this.f4086j = new ArrayList<>();
            }
            if (!this.f4086j.contains(bVar)) {
                this.f4086j.add(bVar);
                if (this.f4085i == null) {
                    this.f4085i = new C1168b();
                }
                this.f4081e.f4092c.addListener(this.f4085i);
            }
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            return C0515a.m2361b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4081e.f4091b.draw(canvas);
        if (this.f4081e.f4092c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4100d;
        return drawable != null ? C0515a.m2363d(drawable) : this.f4081e.f4091b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4081e.f4090a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4100d;
        return drawable != null ? C0515a.m2364e(drawable) : this.f4081e.f4091b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4100d == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1170d(this.f4100d.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4081e.f4091b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4081e.f4091b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.getOpacity() : this.f4081e.f4091b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public boolean mo4802h(C1164b bVar) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            m5796i((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<C1164b> arrayList = this.f4086j;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(bVar);
        if (this.f4086j.size() == 0) {
            m5793e();
        }
        return remove;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2366g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0502k.m2312s(resources, theme, attributeSet, C1163a.f4071e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1177i b = C1177i.m5828b(resources, resourceId, theme);
                        b.mo4853h(false);
                        b.setCallback(this.f4087k);
                        C1177i iVar = this.f4081e.f4091b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.f4081e.f4091b = b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C1163a.f4072f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4082f;
                        if (context != null) {
                            m5794f(string, C1172e.m5810i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f4081e.mo4830a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4100d;
        return drawable != null ? C0515a.m2367h(drawable) : this.f4081e.f4091b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f4100d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4081e.f4092c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.isStateful() : this.f4081e.f4091b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4081e.f4091b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.setLevel(i) : this.f4081e.f4091b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4100d;
        return drawable != null ? drawable.setState(iArr) : this.f4081e.f4091b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4081e.f4091b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2369j(drawable, z);
        } else {
            this.f4081e.f4091b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4081e.f4091b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2373n(drawable, i);
        } else {
            this.f4081e.f4091b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2374o(drawable, colorStateList);
        } else {
            this.f4081e.f4091b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            C0515a.m2375p(drawable, mode);
        } else {
            this.f4081e.f4091b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f4081e.f4091b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f4081e.f4092c.isStarted()) {
            this.f4081e.f4092c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f4100d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4081e.f4092c.end();
        }
    }
}
