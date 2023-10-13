package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p094o.C2830e;
import p094o.C2838i;

/* renamed from: androidx.constraintlayout.widget.b */
public abstract class C0411b extends View {

    /* renamed from: d */
    protected int[] f1704d = new int[32];

    /* renamed from: e */
    protected int f1705e;

    /* renamed from: f */
    protected Context f1706f;

    /* renamed from: g */
    protected C2838i f1707g;

    /* renamed from: h */
    protected boolean f1708h = false;

    /* renamed from: i */
    protected String f1709i;

    /* renamed from: j */
    private View[] f1710j = null;

    /* renamed from: k */
    private HashMap<Integer, String> f1711k = new HashMap<>();

    public C0411b(Context context) {
        super(context);
        this.f1706f = context;
        mo2166g((AttributeSet) null);
    }

    public C0411b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1706f = context;
        mo2166g(attributeSet);
    }

    /* renamed from: a */
    private void m1936a(String str) {
        if (str != null && str.length() != 0 && this.f1706f != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int f = m1939f(trim);
            if (f != 0) {
                this.f1711k.put(Integer.valueOf(f), trim);
                m1937b(f);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: b */
    private void m1937b(int i) {
        if (i != getId()) {
            int i2 = this.f1705e + 1;
            int[] iArr = this.f1704d;
            if (i2 > iArr.length) {
                this.f1704d = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1704d;
            int i3 = this.f1705e;
            iArr2[i3] = i;
            this.f1705e = i3 + 1;
        }
    }

    /* renamed from: e */
    private int m1938e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1706f.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    private int m1939f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f = constraintLayout.mo2203f(0, str);
            if (f instanceof Integer) {
                i = ((Integer) f).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m1938e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0426i.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f1706f.getResources().getIdentifier(str, "id", this.f1706f.getPackageName()) : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2242c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo2243d((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2243d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f1705e; i++) {
            View h = constraintLayout.mo2213h(this.f1704d[i]);
            if (h != null) {
                h.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    h.setTranslationZ(h.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2166g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0427j.f2011a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0427j.f2144t1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1709i = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1704d, this.f1705e);
    }

    /* renamed from: h */
    public void mo2167h(C2830e eVar, boolean z) {
    }

    /* renamed from: i */
    public void mo2245i(ConstraintLayout constraintLayout) {
    }

    /* renamed from: j */
    public void mo2246j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void mo2247k(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f1711k.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2248l(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f1709i
            r5.setIds(r0)
        L_0x000b:
            o.i r0 = r5.f1707g
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo9795b()
            r0 = 0
        L_0x0014:
            int r1 = r5.f1705e
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f1704d
            r1 = r1[r0]
            android.view.View r2 = r6.mo2213h(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f1711k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.m1938e(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f1704d
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f1711k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.mo2213h(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            o.i r1 = r5.f1707g
            o.e r2 = r6.mo2214i(r2)
            r1.mo9794a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            o.i r0 = r5.f1707g
            o.f r6 = r6.f1590f
            r0.mo9796c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0411b.mo2248l(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* renamed from: m */
    public void mo2249m() {
        if (this.f1707g != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0405b) {
                ((ConstraintLayout.C0405b) layoutParams).f1665n0 = (C2830e) this.f1707g;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1709i;
        if (str != null) {
            setIds(str);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1708h) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f1709i = str;
        if (str != null) {
            int i = 0;
            this.f1705e = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1936a(str.substring(i));
                    return;
                } else {
                    m1936a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1709i = null;
        this.f1705e = 0;
        for (int b : iArr) {
            m1937b(b);
        }
    }
}
