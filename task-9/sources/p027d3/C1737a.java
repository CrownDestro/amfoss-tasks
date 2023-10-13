package p027d3;

import p041f3.C1916d;
import p041f3.C1924k;
import p074k3.C2385b;

/* renamed from: d3.a */
public final class C1737a {
    /* renamed from: a */
    public static final <T> Class<T> m8630a(C2385b<T> bVar) {
        C1924k.m9141g(bVar, "<this>");
        Class<?> b = ((C1916d) bVar).mo7655b();
        C1924k.m9139e(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b;
    }

    /* renamed from: b */
    public static final <T> Class<T> m8631b(C2385b<T> bVar) {
        C1924k.m9141g(bVar, "<this>");
        Class b = ((C1916d) bVar).mo7655b();
        if (!b.isPrimitive()) {
            C1924k.m9139e(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b;
        }
        String name = b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b = Short.class;
                    break;
                }
                break;
        }
        C1924k.m9139e(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b;
    }
}
