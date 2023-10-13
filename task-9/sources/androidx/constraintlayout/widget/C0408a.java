package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
public class C0408a {

    /* renamed from: a */
    String f1688a;

    /* renamed from: b */
    private C0410b f1689b;

    /* renamed from: c */
    private int f1690c;

    /* renamed from: d */
    private float f1691d;

    /* renamed from: e */
    private String f1692e;

    /* renamed from: f */
    boolean f1693f;

    /* renamed from: g */
    private int f1694g;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    static /* synthetic */ class C0409a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1695a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.C0408a.C0410b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1695a = r0
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0408a.C0410b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1695a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0408a.C0410b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1695a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0408a.C0410b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1695a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0408a.C0410b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1695a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0408a.C0410b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1695a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0408a.C0410b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1695a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.C0408a.C0410b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0408a.C0409a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    public enum C0410b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0408a(C0408a aVar, Object obj) {
        this.f1688a = aVar.f1688a;
        this.f1689b = aVar.f1689b;
        mo2241d(obj);
    }

    public C0408a(String str, C0410b bVar, Object obj) {
        this.f1688a = str;
        this.f1689b = bVar;
        mo2241d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0408a> m1932a(HashMap<String, C0408a> hashMap, View view) {
        C0408a aVar;
        HashMap<String, C0408a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0408a aVar2 = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    aVar = new C0408a(aVar2, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor()));
                } else {
                    aVar = new C0408a(aVar2, cls.getMethod("getMap" + next, new Class[0]).invoke(view, new Object[0]));
                }
                hashMap2.put(next, aVar);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m1933b(Context context, XmlPullParser xmlPullParser, HashMap<String, C0408a> hashMap) {
        C0410b bVar;
        Object string;
        int integer;
        C0410b bVar2;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0427j.f2013a3);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0410b bVar3 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0427j.f2020b3) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0427j.f2027c3) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar3 = C0410b.BOOLEAN_TYPE;
            } else {
                if (index == C0427j.f2041e3) {
                    bVar = C0410b.COLOR_TYPE;
                } else if (index == C0427j.f2034d3) {
                    bVar = C0410b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C0427j.f2069i3) {
                        bVar2 = C0410b.DIMENSION_TYPE;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C0427j.f2048f3) {
                        bVar2 = C0410b.DIMENSION_TYPE;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == C0427j.f2055g3) {
                        bVar2 = C0410b.FLOAT_TYPE;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == C0427j.f2062h3) {
                        bVar = C0410b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        bVar3 = bVar;
                        obj = obj2;
                    } else if (index == C0427j.f2076j3) {
                        bVar = C0410b.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        bVar3 = bVar;
                        obj = obj22;
                    }
                    string = Float.valueOf(f);
                    Object obj222 = string;
                    bVar3 = bVar;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                bVar3 = bVar;
                obj = obj2222;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C0408a(str, bVar3, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m1934c(View view, HashMap<String, C0408a> hashMap) {
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0408a aVar = hashMap.get(next);
            String str = "set" + next;
            try {
                switch (C0409a.f1695a[aVar.f1689b.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f1694g)});
                        break;
                    case 2:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1694g);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f1690c)});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f1691d)});
                        break;
                    case 5:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f1692e});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f1693f)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f1691d)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e2) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void mo2241d(Object obj) {
        switch (C0409a.f1695a[this.f1689b.ordinal()]) {
            case 1:
            case 2:
                this.f1694g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f1690c = ((Integer) obj).intValue();
                return;
            case 4:
            case 7:
                this.f1691d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f1692e = (String) obj;
                return;
            case 6:
                this.f1693f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
