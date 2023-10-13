package p073k2;

import p063io.flutter.embedding.engine.C2203a;
import p063io.flutter.plugins.GeneratedPluginRegistrant;
import p162z1.C3627b;

/* renamed from: k2.a */
public class C2383a {
    /* renamed from: a */
    public static void m11143a(C2203a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[]{C2203a.class}).invoke((Object) null, new Object[]{aVar});
        } catch (Exception e) {
            C3627b.m16088b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            C3627b.m16089c("GeneratedPluginsRegister", "Received exception while registering", e);
        }
    }
}
