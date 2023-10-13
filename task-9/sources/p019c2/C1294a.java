package p019c2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: c2.a */
public final class C1294a {

    /* renamed from: a */
    public static final String f4622a;

    /* renamed from: b */
    public static final String f4623b;

    /* renamed from: c */
    public static final String f4624c;

    /* renamed from: d */
    public static final String f4625d;

    static {
        Class<C1297d> cls = C1297d.class;
        f4622a = cls.getName() + '.' + "aot-shared-library-name";
        f4623b = cls.getName() + '.' + "vm-snapshot-data";
        f4624c = cls.getName() + '.' + "isolate-snapshot-data";
        f4625d = cls.getName() + '.' + "flutter-assets-dir";
    }

    /* renamed from: a */
    private static ApplicationInfo m6175a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static boolean m6176b(Bundle bundle, String str, boolean z) {
        return bundle == null ? z : bundle.getBoolean(str, z);
    }

    /* renamed from: c */
    private static String m6177c(ApplicationInfo applicationInfo, Context context) {
        int i;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2 && xml.getName().equals("domain-config")) {
                    m6181g(xml, jSONArray, false);
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m6178d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, (String) null);
    }

    /* renamed from: e */
    public static C1295b m6179e(Context context) {
        ApplicationInfo a = m6175a(context);
        return new C1295b(m6178d(a.metaData, f4622a), m6178d(a.metaData, f4623b), m6178d(a.metaData, f4624c), m6178d(a.metaData, f4625d), m6177c(a, context), a.nativeLibraryDir, m6176b(a.metaData, "io.flutter.automatically-register-plugins", true));
    }

    /* renamed from: f */
    private static void m6180f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() == 4) {
            String trim = xmlResourceParser.getText().trim();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(trim);
            jSONArray2.put(attributeBooleanValue);
            jSONArray2.put(z);
            jSONArray.put(jSONArray2);
            xmlResourceParser.next();
            if (xmlResourceParser.getEventType() != 3) {
                throw new IllegalStateException("Expected end of domain tag");
            }
            return;
        }
        throw new IllegalStateException("Expected text");
    }

    /* renamed from: g */
    private static void m6181g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    m6180f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    m6181g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    m6182h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    /* renamed from: h */
    private static void m6182h(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType != 3 || xmlResourceParser.getName() != name) {
                eventType = xmlResourceParser.next();
            } else {
                return;
            }
        }
    }
}
