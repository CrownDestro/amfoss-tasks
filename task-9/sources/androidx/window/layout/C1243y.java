package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p041f3.C1924k;

/* renamed from: androidx.window.layout.y */
public final class C1243y implements C1242x {

    /* renamed from: a */
    public static final C1243y f4277a = new C1243y();

    /* renamed from: b */
    private static final String f4278b;

    static {
        String simpleName = C1243y.class.getSimpleName();
        C1924k.m9140f(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f4278b = simpleName;
    }

    private C1243y() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: f */
    private final DisplayCutout m6065f(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, new Object[]{newInstance});
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.w(f4278b, e);
        }
        return null;
    }

    /* renamed from: g */
    private final int m6066g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: i */
    private final void m6067i(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    /* renamed from: a */
    public C1241w mo5068a(Activity activity) {
        C1924k.m9141g(activity, "activity");
        int i = Build.VERSION.SDK_INT;
        return new C1241w(i >= 30 ? C1195b.f4204a.mo4998a(activity) : i >= 29 ? mo5072e(activity) : i >= 28 ? mo5071d(activity) : i >= 24 ? mo5070c(activity) : mo5069b(activity));
    }

    /* renamed from: b */
    public final Rect mo5069b(Activity activity) {
        int i;
        C1924k.m9141g(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        C1924k.m9140f(defaultDisplay, "defaultDisplay");
        Point h = mo5073h(defaultDisplay);
        Rect rect = new Rect();
        int i2 = h.x;
        if (i2 == 0 || (i = h.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i2;
            rect.bottom = i;
        }
        return rect;
    }

    /* renamed from: c */
    public final Rect mo5070c(Activity activity) {
        C1924k.m9141g(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C1194a.f4203a.mo4997a(activity)) {
            C1924k.m9140f(defaultDisplay, "defaultDisplay");
            Point h = mo5073h(defaultDisplay);
            int g = m6066g(activity);
            int i = rect.bottom;
            if (i + g == h.y) {
                rect.bottom = i + g;
            } else {
                int i2 = rect.right;
                if (i2 + g == h.x) {
                    rect.right = i2 + g;
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    /* renamed from: d */
    public final Rect mo5071d(Activity activity) {
        DisplayCutout f;
        Rect rect;
        C1924k.m9141g(activity, "activity");
        Rect rect2 = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C1194a.f4203a.mo4997a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect = (Rect) invoke;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 != null) {
                    rect = (Rect) invoke2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
            rect2.set(rect);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.w(f4278b, e);
            m6067i(activity, rect2);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        C1196c cVar = C1196c.f4205a;
        C1924k.m9140f(defaultDisplay, "currentDisplay");
        cVar.mo4999a(defaultDisplay, point);
        C1194a aVar = C1194a.f4203a;
        if (!aVar.mo4997a(activity)) {
            int g = m6066g(activity);
            int i = rect2.bottom;
            if (i + g == point.y) {
                rect2.bottom = i + g;
            } else {
                int i2 = rect2.right;
                if (i2 + g == point.x) {
                    rect2.right = i2 + g;
                } else if (rect2.left == g) {
                    rect2.left = 0;
                }
            }
        }
        if ((rect2.width() < point.x || rect2.height() < point.y) && !aVar.mo4997a(activity) && (f = m6065f(defaultDisplay)) != null) {
            int i3 = rect2.left;
            C1197d dVar = C1197d.f4206a;
            if (i3 == dVar.mo5001b(f)) {
                rect2.left = 0;
            }
            if (point.x - rect2.right == dVar.mo5002c(f)) {
                rect2.right += dVar.mo5002c(f);
            }
            if (rect2.top == dVar.mo5003d(f)) {
                rect2.top = 0;
            }
            if (point.y - rect2.bottom == dVar.mo5000a(f)) {
                rect2.bottom += dVar.mo5000a(f);
            }
        }
        return rect2;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    /* renamed from: e */
    public final Rect mo5072e(Activity activity) {
        C1924k.m9141g(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.w(f4278b, e);
            return mo5071d(activity);
        }
    }

    /* renamed from: h */
    public final Point mo5073h(Display display) {
        C1924k.m9141g(display, "display");
        Point point = new Point();
        C1196c.f4205a.mo4999a(display, point);
        return point;
    }
}
