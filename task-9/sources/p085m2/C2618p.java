package p085m2;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0008a;
import p063io.flutter.plugin.editing.C2228e;
import p091n2.C2685e;
import p091n2.C2689i;
import p162z1.C3627b;

/* renamed from: m2.p */
public class C2618p {

    /* renamed from: a */
    public final C2689i f8801a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2625f f8802b;

    /* renamed from: c */
    final C2689i.C2693c f8803c;

    /* renamed from: m2.p$a */
    class C2619a implements C2689i.C2693c {
        C2619a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
            r2.mo9291b((java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            return;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo7778l(p091n2.C2688h r18, p091n2.C2689i.C2694d r19) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r3 = "data"
                m2.p r4 = p085m2.C2618p.this
                m2.p$f r4 = r4.f8802b
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                java.lang.String r4 = r0.f9001a
                java.lang.Object r0 = r0.f9002b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Received '"
                r5.append(r6)
                r5.append(r4)
                java.lang.String r6 = "' message."
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "TextInputChannel"
                p162z1.C3627b.m16092f(r6, r5)
                r4.hashCode()
                r5 = -1
                int r6 = r4.hashCode()
                r7 = 1
                r8 = 0
                switch(r6) {
                    case -1779068172: goto L_0x00a8;
                    case -1015421462: goto L_0x009d;
                    case -37561188: goto L_0x0092;
                    case 270476819: goto L_0x0087;
                    case 270803918: goto L_0x007c;
                    case 649192816: goto L_0x0071;
                    case 1204752139: goto L_0x0066;
                    case 1727570905: goto L_0x005b;
                    case 1904427655: goto L_0x004d;
                    case 2113369584: goto L_0x003f;
                    default: goto L_0x003d;
                }
            L_0x003d:
                goto L_0x00b2
            L_0x003f:
                java.lang.String r6 = "TextInput.requestAutofill"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0049
                goto L_0x00b2
            L_0x0049:
                r5 = 9
                goto L_0x00b2
            L_0x004d:
                java.lang.String r6 = "TextInput.clearClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0057
                goto L_0x00b2
            L_0x0057:
                r5 = 8
                goto L_0x00b2
            L_0x005b:
                java.lang.String r6 = "TextInput.finishAutofillContext"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0064
                goto L_0x00b2
            L_0x0064:
                r5 = 7
                goto L_0x00b2
            L_0x0066:
                java.lang.String r6 = "TextInput.setEditableSizeAndTransform"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x006f
                goto L_0x00b2
            L_0x006f:
                r5 = 6
                goto L_0x00b2
            L_0x0071:
                java.lang.String r6 = "TextInput.sendAppPrivateCommand"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x007a
                goto L_0x00b2
            L_0x007a:
                r5 = 5
                goto L_0x00b2
            L_0x007c:
                java.lang.String r6 = "TextInput.show"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0085
                goto L_0x00b2
            L_0x0085:
                r5 = 4
                goto L_0x00b2
            L_0x0087:
                java.lang.String r6 = "TextInput.hide"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0090
                goto L_0x00b2
            L_0x0090:
                r5 = 3
                goto L_0x00b2
            L_0x0092:
                java.lang.String r6 = "TextInput.setClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x009b
                goto L_0x00b2
            L_0x009b:
                r5 = 2
                goto L_0x00b2
            L_0x009d:
                java.lang.String r6 = "TextInput.setEditingState"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x00a6
                goto L_0x00b2
            L_0x00a6:
                r5 = 1
                goto L_0x00b2
            L_0x00a8:
                java.lang.String r6 = "TextInput.setPlatformViewClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x00b1
                goto L_0x00b2
            L_0x00b1:
                r5 = 0
            L_0x00b2:
                java.lang.String r4 = "error"
                r6 = 0
                switch(r5) {
                    case 0: goto L_0x0190;
                    case 1: goto L_0x017d;
                    case 2: goto L_0x0157;
                    case 3: goto L_0x014d;
                    case 4: goto L_0x0140;
                    case 5: goto L_0x0114;
                    case 6: goto L_0x00e3;
                    case 7: goto L_0x00d3;
                    case 8: goto L_0x00c8;
                    case 9: goto L_0x00bd;
                    default: goto L_0x00b8;
                }
            L_0x00b8:
                r19.mo9292c()
                goto L_0x01b1
            L_0x00bd:
                m2.p r0 = p085m2.C2618p.this
                m2.p$f r0 = r0.f8802b
                r0.mo8462h()
                goto L_0x0149
            L_0x00c8:
                m2.p r0 = p085m2.C2618p.this
                m2.p$f r0 = r0.f8802b
                r0.mo8457c()
                goto L_0x0149
            L_0x00d3:
                m2.p r3 = p085m2.C2618p.this
                m2.p$f r3 = r3.f8802b
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r3.mo8463i(r0)
                goto L_0x0149
            L_0x00e3:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "width"
                double r10 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "height"
                double r12 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "transform"
                org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x01ab }
                r3 = 16
                double[] r14 = new double[r3]     // Catch:{ JSONException -> 0x01ab }
            L_0x00fb:
                if (r8 >= r3) goto L_0x0106
                double r15 = r0.getDouble(r8)     // Catch:{ JSONException -> 0x01ab }
                r14[r8] = r15     // Catch:{ JSONException -> 0x01ab }
                int r8 = r8 + 1
                goto L_0x00fb
            L_0x0106:
                m2.p r0 = p085m2.C2618p.this     // Catch:{ JSONException -> 0x01ab }
                m2.p$f r9 = r0.f8802b     // Catch:{ JSONException -> 0x01ab }
                r9.mo8460f(r10, r12, r14)     // Catch:{ JSONException -> 0x01ab }
                r2.mo9291b(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0114:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r5 = "action"
                java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x01ab }
                if (r0 == 0) goto L_0x0131
                boolean r7 = r0.isEmpty()     // Catch:{ JSONException -> 0x01ab }
                if (r7 != 0) goto L_0x0131
                android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x01ab }
                r7.<init>()     // Catch:{ JSONException -> 0x01ab }
                r7.putString(r3, r0)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x0132
            L_0x0131:
                r7 = r6
            L_0x0132:
                m2.p r0 = p085m2.C2618p.this     // Catch:{ JSONException -> 0x01ab }
                m2.p$f r0 = r0.f8802b     // Catch:{ JSONException -> 0x01ab }
                r0.mo8456b(r5, r7)     // Catch:{ JSONException -> 0x01ab }
                r2.mo9291b(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0140:
                m2.p r0 = p085m2.C2618p.this
                m2.p$f r0 = r0.f8802b
                r0.mo8455a()
            L_0x0149:
                r2.mo9291b(r6)
                goto L_0x01b1
            L_0x014d:
                m2.p r0 = p085m2.C2618p.this
                m2.p$f r0 = r0.f8802b
                r0.mo8464j()
                goto L_0x0149
            L_0x0157:
                org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                int r3 = r0.getInt(r8)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                m2.p r5 = p085m2.C2618p.this     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                m2.p$f r5 = r5.f8802b     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                m2.p$b r0 = p085m2.C2618p.C2620b.m11898a(r0)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                r5.mo8458d(r3, r0)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                r2.mo9291b(r6)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                goto L_0x01b1
            L_0x0172:
                r0 = move-exception
                goto L_0x0175
            L_0x0174:
                r0 = move-exception
            L_0x0175:
                java.lang.String r0 = r0.getMessage()
            L_0x0179:
                r2.mo9290a(r4, r0, r6)
                goto L_0x01b1
            L_0x017d:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                m2.p r3 = p085m2.C2618p.this     // Catch:{ JSONException -> 0x01ab }
                m2.p$f r3 = r3.f8802b     // Catch:{ JSONException -> 0x01ab }
                m2.p$e r0 = p085m2.C2618p.C2624e.m11904a(r0)     // Catch:{ JSONException -> 0x01ab }
                r3.mo8461g(r0)     // Catch:{ JSONException -> 0x01ab }
                r2.mo9291b(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0190:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "platformViewId"
                int r3 = r0.getInt(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r5 = "usesVirtualDisplay"
                boolean r0 = r0.optBoolean(r5, r8)     // Catch:{ JSONException -> 0x01ab }
                m2.p r5 = p085m2.C2618p.this     // Catch:{ JSONException -> 0x01ab }
                m2.p$f r5 = r5.f8802b     // Catch:{ JSONException -> 0x01ab }
                r5.mo8459e(r3, r0)     // Catch:{ JSONException -> 0x01ab }
                r2.mo9291b(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x01ab:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                goto L_0x0179
            L_0x01b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p085m2.C2618p.C2619a.mo7778l(n2.h, n2.i$d):void");
        }
    }

    /* renamed from: m2.p$b */
    public static class C2620b {

        /* renamed from: a */
        public final boolean f8805a;

        /* renamed from: b */
        public final boolean f8806b;

        /* renamed from: c */
        public final boolean f8807c;

        /* renamed from: d */
        public final boolean f8808d;

        /* renamed from: e */
        public final boolean f8809e;

        /* renamed from: f */
        public final C2623d f8810f;

        /* renamed from: g */
        public final C2622c f8811g;

        /* renamed from: h */
        public final Integer f8812h;

        /* renamed from: i */
        public final String f8813i;

        /* renamed from: j */
        public final C2621a f8814j;

        /* renamed from: k */
        public final String[] f8815k;

        /* renamed from: l */
        public final C2620b[] f8816l;

        /* renamed from: m2.p$b$a */
        public static class C2621a {

            /* renamed from: a */
            public final String f8817a;

            /* renamed from: b */
            public final String[] f8818b;

            /* renamed from: c */
            public final C2624e f8819c;

            /* renamed from: d */
            public final String f8820d;

            public C2621a(String str, String[] strArr, String str2, C2624e eVar) {
                this.f8817a = str;
                this.f8818b = strArr;
                this.f8820d = str2;
                this.f8819c = eVar;
            }

            /* renamed from: a */
            public static C2621a m11900a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = m11901b(jSONArray.getString(i));
                }
                return new C2621a(string, strArr, string2, C2624e.m11904a(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
                if (r0.equals("familyName") == false) goto L_0x002d;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String m11901b(java.lang.String r16) {
                /*
                    r0 = r16
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    r16.hashCode()
                    int r3 = r16.hashCode()
                    java.lang.String r4 = "postalCode"
                    java.lang.String r5 = "postalAddress"
                    java.lang.String r6 = "password"
                    java.lang.String r7 = "newUsername"
                    java.lang.String r8 = "username"
                    java.lang.String r9 = "creditCardExpirationYear"
                    java.lang.String r10 = "creditCardExpirationDate"
                    java.lang.String r11 = "creditCardNumber"
                    java.lang.String r12 = "gender"
                    java.lang.String r13 = "creditCardExpirationDay"
                    java.lang.String r14 = "creditCardSecurityCode"
                    java.lang.String r15 = "newPassword"
                    java.lang.String r1 = "creditCardExpirationMonth"
                    switch(r3) {
                        case -2058889126: goto L_0x01e3;
                        case -1917283616: goto L_0x01d7;
                        case -1844815832: goto L_0x01cd;
                        case -1825589953: goto L_0x01c1;
                        case -1821235109: goto L_0x01b7;
                        case -1757573738: goto L_0x01ad;
                        case -1682373820: goto L_0x01a3;
                        case -1658955742: goto L_0x0197;
                        case -1567118045: goto L_0x018a;
                        case -1476752575: goto L_0x017c;
                        case -1413737489: goto L_0x016e;
                        case -1377792129: goto L_0x0160;
                        case -1249512767: goto L_0x0154;
                        case -1186060294: goto L_0x0146;
                        case -1151034798: goto L_0x013a;
                        case -835992323: goto L_0x012c;
                        case -818219584: goto L_0x011e;
                        case -747304516: goto L_0x0110;
                        case -613980922: goto L_0x0104;
                        case -613352043: goto L_0x00f8;
                        case -549230602: goto L_0x00ea;
                        case -265713450: goto L_0x00de;
                        case 3373707: goto L_0x00d0;
                        case 96619420: goto L_0x00c2;
                        case 253202685: goto L_0x00b4;
                        case 588174851: goto L_0x00a6;
                        case 798554127: goto L_0x009d;
                        case 892233837: goto L_0x0090;
                        case 991032982: goto L_0x0085;
                        case 1069376125: goto L_0x0078;
                        case 1216985755: goto L_0x006d;
                        case 1469046696: goto L_0x0060;
                        case 1662667945: goto L_0x0055;
                        case 1921869058: goto L_0x0048;
                        case 2011152728: goto L_0x003d;
                        case 2011773919: goto L_0x0030;
                        default: goto L_0x002d;
                    }
                L_0x002d:
                    r2 = -1
                    goto L_0x01ee
                L_0x0030:
                    java.lang.String r2 = "birthdayDay"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0039
                    goto L_0x002d
                L_0x0039:
                    r2 = 35
                    goto L_0x01ee
                L_0x003d:
                    boolean r2 = r0.equals(r4)
                    if (r2 != 0) goto L_0x0044
                    goto L_0x002d
                L_0x0044:
                    r2 = 34
                    goto L_0x01ee
                L_0x0048:
                    java.lang.String r2 = "postalAddressExtended"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0051
                    goto L_0x002d
                L_0x0051:
                    r2 = 33
                    goto L_0x01ee
                L_0x0055:
                    boolean r2 = r0.equals(r5)
                    if (r2 != 0) goto L_0x005c
                    goto L_0x002d
                L_0x005c:
                    r2 = 32
                    goto L_0x01ee
                L_0x0060:
                    java.lang.String r2 = "givenName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0069
                    goto L_0x002d
                L_0x0069:
                    r2 = 31
                    goto L_0x01ee
                L_0x006d:
                    boolean r2 = r0.equals(r6)
                    if (r2 != 0) goto L_0x0074
                    goto L_0x002d
                L_0x0074:
                    r2 = 30
                    goto L_0x01ee
                L_0x0078:
                    java.lang.String r2 = "birthday"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0081
                    goto L_0x002d
                L_0x0081:
                    r2 = 29
                    goto L_0x01ee
                L_0x0085:
                    boolean r2 = r0.equals(r7)
                    if (r2 != 0) goto L_0x008c
                    goto L_0x002d
                L_0x008c:
                    r2 = 28
                    goto L_0x01ee
                L_0x0090:
                    java.lang.String r2 = "telephoneNumber"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0099
                    goto L_0x002d
                L_0x0099:
                    r2 = 27
                    goto L_0x01ee
                L_0x009d:
                    java.lang.String r3 = "familyName"
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L_0x01ee
                    goto L_0x002d
                L_0x00a6:
                    java.lang.String r2 = "birthdayMonth"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00b0
                    goto L_0x002d
                L_0x00b0:
                    r2 = 25
                    goto L_0x01ee
                L_0x00b4:
                    java.lang.String r2 = "addressState"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00be
                    goto L_0x002d
                L_0x00be:
                    r2 = 24
                    goto L_0x01ee
                L_0x00c2:
                    java.lang.String r2 = "email"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00cc
                    goto L_0x002d
                L_0x00cc:
                    r2 = 23
                    goto L_0x01ee
                L_0x00d0:
                    java.lang.String r2 = "name"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00da
                    goto L_0x002d
                L_0x00da:
                    r2 = 22
                    goto L_0x01ee
                L_0x00de:
                    boolean r2 = r0.equals(r8)
                    if (r2 != 0) goto L_0x00e6
                    goto L_0x002d
                L_0x00e6:
                    r2 = 21
                    goto L_0x01ee
                L_0x00ea:
                    java.lang.String r2 = "telephoneNumberCountryCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00f4
                    goto L_0x002d
                L_0x00f4:
                    r2 = 20
                    goto L_0x01ee
                L_0x00f8:
                    boolean r2 = r0.equals(r9)
                    if (r2 != 0) goto L_0x0100
                    goto L_0x002d
                L_0x0100:
                    r2 = 19
                    goto L_0x01ee
                L_0x0104:
                    boolean r2 = r0.equals(r10)
                    if (r2 != 0) goto L_0x010c
                    goto L_0x002d
                L_0x010c:
                    r2 = 18
                    goto L_0x01ee
                L_0x0110:
                    java.lang.String r2 = "nameSuffix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x011a
                    goto L_0x002d
                L_0x011a:
                    r2 = 17
                    goto L_0x01ee
                L_0x011e:
                    java.lang.String r2 = "middleName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0128
                    goto L_0x002d
                L_0x0128:
                    r2 = 16
                    goto L_0x01ee
                L_0x012c:
                    java.lang.String r2 = "namePrefix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0136
                    goto L_0x002d
                L_0x0136:
                    r2 = 15
                    goto L_0x01ee
                L_0x013a:
                    boolean r2 = r0.equals(r11)
                    if (r2 != 0) goto L_0x0142
                    goto L_0x002d
                L_0x0142:
                    r2 = 14
                    goto L_0x01ee
                L_0x0146:
                    java.lang.String r2 = "postalAddressExtendedPostalCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0150
                    goto L_0x002d
                L_0x0150:
                    r2 = 13
                    goto L_0x01ee
                L_0x0154:
                    boolean r2 = r0.equals(r12)
                    if (r2 != 0) goto L_0x015c
                    goto L_0x002d
                L_0x015c:
                    r2 = 12
                    goto L_0x01ee
                L_0x0160:
                    java.lang.String r2 = "addressCity"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x016a
                    goto L_0x002d
                L_0x016a:
                    r2 = 11
                    goto L_0x01ee
                L_0x016e:
                    java.lang.String r2 = "middleInitial"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0178
                    goto L_0x002d
                L_0x0178:
                    r2 = 10
                    goto L_0x01ee
                L_0x017c:
                    java.lang.String r2 = "countryName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0186
                    goto L_0x002d
                L_0x0186:
                    r2 = 9
                    goto L_0x01ee
                L_0x018a:
                    java.lang.String r2 = "telephoneNumberDevice"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0194
                    goto L_0x002d
                L_0x0194:
                    r2 = 8
                    goto L_0x01ee
                L_0x0197:
                    java.lang.String r2 = "fullStreetAddress"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01a1
                    goto L_0x002d
                L_0x01a1:
                    r2 = 7
                    goto L_0x01ee
                L_0x01a3:
                    boolean r2 = r0.equals(r13)
                    if (r2 != 0) goto L_0x01ab
                    goto L_0x002d
                L_0x01ab:
                    r2 = 6
                    goto L_0x01ee
                L_0x01ad:
                    boolean r2 = r0.equals(r14)
                    if (r2 != 0) goto L_0x01b5
                    goto L_0x002d
                L_0x01b5:
                    r2 = 5
                    goto L_0x01ee
                L_0x01b7:
                    boolean r2 = r0.equals(r15)
                    if (r2 != 0) goto L_0x01bf
                    goto L_0x002d
                L_0x01bf:
                    r2 = 4
                    goto L_0x01ee
                L_0x01c1:
                    java.lang.String r2 = "telephoneNumberNational"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01cb
                    goto L_0x002d
                L_0x01cb:
                    r2 = 3
                    goto L_0x01ee
                L_0x01cd:
                    boolean r2 = r0.equals(r1)
                    if (r2 != 0) goto L_0x01d5
                    goto L_0x002d
                L_0x01d5:
                    r2 = 2
                    goto L_0x01ee
                L_0x01d7:
                    java.lang.String r2 = "oneTimeCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01e1
                    goto L_0x002d
                L_0x01e1:
                    r2 = 1
                    goto L_0x01ee
                L_0x01e3:
                    java.lang.String r2 = "birthdayYear"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01ed
                    goto L_0x002d
                L_0x01ed:
                    r2 = 0
                L_0x01ee:
                    switch(r2) {
                        case 0: goto L_0x0241;
                        case 1: goto L_0x023e;
                        case 2: goto L_0x023d;
                        case 3: goto L_0x023a;
                        case 4: goto L_0x0239;
                        case 5: goto L_0x0238;
                        case 6: goto L_0x0237;
                        case 7: goto L_0x0234;
                        case 8: goto L_0x0231;
                        case 9: goto L_0x022e;
                        case 10: goto L_0x022b;
                        case 11: goto L_0x0228;
                        case 12: goto L_0x0227;
                        case 13: goto L_0x0224;
                        case 14: goto L_0x0223;
                        case 15: goto L_0x0220;
                        case 16: goto L_0x021d;
                        case 17: goto L_0x021a;
                        case 18: goto L_0x0219;
                        case 19: goto L_0x0218;
                        case 20: goto L_0x0215;
                        case 21: goto L_0x0214;
                        case 22: goto L_0x0211;
                        case 23: goto L_0x020e;
                        case 24: goto L_0x020b;
                        case 25: goto L_0x0208;
                        case 26: goto L_0x0205;
                        case 27: goto L_0x0202;
                        case 28: goto L_0x0201;
                        case 29: goto L_0x01fe;
                        case 30: goto L_0x01fd;
                        case 31: goto L_0x01fa;
                        case 32: goto L_0x01f9;
                        case 33: goto L_0x01f6;
                        case 34: goto L_0x01f5;
                        case 35: goto L_0x01f2;
                        default: goto L_0x01f1;
                    }
                L_0x01f1:
                    return r0
                L_0x01f2:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01f5:
                    return r4
                L_0x01f6:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01f9:
                    return r5
                L_0x01fa:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01fd:
                    return r6
                L_0x01fe:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x0201:
                    return r7
                L_0x0202:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x0205:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x0208:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x020b:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x020e:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x0211:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x0214:
                    return r8
                L_0x0215:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x0218:
                    return r9
                L_0x0219:
                    return r10
                L_0x021a:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x021d:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x0220:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x0223:
                    return r11
                L_0x0224:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x0227:
                    return r12
                L_0x0228:
                    java.lang.String r0 = "addressLocality"
                    return r0
                L_0x022b:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x022e:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x0231:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x0234:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x0237:
                    return r13
                L_0x0238:
                    return r14
                L_0x0239:
                    return r15
                L_0x023a:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x023d:
                    return r1
                L_0x023e:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x0241:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p085m2.C2618p.C2620b.C2621a.m11901b(java.lang.String):java.lang.String");
            }
        }

        public C2620b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C2623d dVar, C2622c cVar, Integer num, String str, C2621a aVar, String[] strArr, C2620b[] bVarArr) {
            this.f8805a = z;
            this.f8806b = z2;
            this.f8807c = z3;
            this.f8808d = z4;
            this.f8809e = z5;
            this.f8810f = dVar;
            this.f8811g = cVar;
            this.f8812h = num;
            this.f8813i = str;
            this.f8814j = aVar;
            this.f8815k = strArr;
            this.f8816l = bVarArr;
        }

        /* renamed from: a */
        public static C2620b m11898a(JSONObject jSONObject) {
            C2620b[] bVarArr;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                C2621a aVar = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("fields");
                    int length = jSONArray.length();
                    C2620b[] bVarArr2 = new C2620b[length];
                    for (int i = 0; i < length; i++) {
                        bVarArr2[i] = m11898a(jSONArray.getJSONObject(i));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b = m11899b(string);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray2 = jSONObject2.isNull("contentCommitMimeTypes") ? null : jSONObject2.getJSONArray("contentCommitMimeTypes");
                if (jSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList.add(jSONArray2.optString(i2));
                    }
                }
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                C2623d a = C2623d.m11903a(jSONObject2.getString("textCapitalization"));
                C2622c a2 = C2622c.m11902a(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    aVar = C2621a.m11900a(jSONObject2.getJSONObject("autofill"));
                }
                return new C2620b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, a, a2, b, string2, aVar, (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Integer m11899b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L_0x0075;
                    case -737377923: goto L_0x006c;
                    case -737089298: goto L_0x0061;
                    case -737080013: goto L_0x0056;
                    case -736940669: goto L_0x004b;
                    case 469250275: goto L_0x0040;
                    case 1241689507: goto L_0x0035;
                    case 1539450297: goto L_0x002a;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r7 = -1
                goto L_0x007f
            L_0x001e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r7 = 8
                goto L_0x007f
            L_0x002a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0033
                goto L_0x001b
            L_0x0033:
                r7 = 7
                goto L_0x007f
            L_0x0035:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x003e
                goto L_0x001b
            L_0x003e:
                r7 = 6
                goto L_0x007f
            L_0x0040:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0049
                goto L_0x001b
            L_0x0049:
                r7 = 5
                goto L_0x007f
            L_0x004b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0054
                goto L_0x001b
            L_0x0054:
                r7 = 4
                goto L_0x007f
            L_0x0056:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x005f
                goto L_0x001b
            L_0x005f:
                r7 = 3
                goto L_0x007f
            L_0x0061:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x006a
                goto L_0x001b
            L_0x006a:
                r7 = 2
                goto L_0x007f
            L_0x006c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x0075:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007e
                goto L_0x001b
            L_0x007e:
                r7 = 0
            L_0x007f:
                switch(r7) {
                    case 0: goto L_0x00a3;
                    case 1: goto L_0x009e;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0098;
                    case 4: goto L_0x0093;
                    case 5: goto L_0x008e;
                    case 6: goto L_0x0089;
                    case 7: goto L_0x0088;
                    case 8: goto L_0x0083;
                    default: goto L_0x0082;
                }
            L_0x0082:
                return r10
            L_0x0083:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x0088:
                return r8
            L_0x0089:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L_0x008e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x0093:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0098:
                return r8
            L_0x0099:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x009e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x00a3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p085m2.C2618p.C2620b.m11899b(java.lang.String):java.lang.Integer");
        }
    }

    /* renamed from: m2.p$c */
    public static class C2622c {

        /* renamed from: a */
        public final C2626g f8821a;

        /* renamed from: b */
        public final boolean f8822b;

        /* renamed from: c */
        public final boolean f8823c;

        public C2622c(C2626g gVar, boolean z, boolean z2) {
            this.f8821a = gVar;
            this.f8822b = z;
            this.f8823c = z2;
        }

        /* renamed from: a */
        public static C2622c m11902a(JSONObject jSONObject) {
            return new C2622c(C2626g.m11917a(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* renamed from: m2.p$d */
    public enum C2623d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: d */
        private final String f8829d;

        private C2623d(String str) {
            this.f8829d = str;
        }

        /* renamed from: a */
        static C2623d m11903a(String str) {
            for (C2623d dVar : values()) {
                if (dVar.f8829d.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* renamed from: m2.p$e */
    public static class C2624e {

        /* renamed from: a */
        public final String f8830a;

        /* renamed from: b */
        public final int f8831b;

        /* renamed from: c */
        public final int f8832c;

        /* renamed from: d */
        public final int f8833d;

        /* renamed from: e */
        public final int f8834e;

        public C2624e(String str, int i, int i2, int i3, int i4) {
            if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
            } else if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            } else if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
            } else if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
            } else if (i2 <= str.length()) {
                this.f8830a = str;
                this.f8831b = i;
                this.f8832c = i2;
                this.f8833d = i3;
                this.f8834e = i4;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
            }
        }

        /* renamed from: a */
        public static C2624e m11904a(JSONObject jSONObject) {
            return new C2624e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        /* renamed from: b */
        public boolean mo9317b() {
            int i = this.f8833d;
            return i >= 0 && this.f8834e > i;
        }

        /* renamed from: c */
        public boolean mo9318c() {
            return this.f8831b >= 0;
        }
    }

    /* renamed from: m2.p$f */
    public interface C2625f {
        /* renamed from: a */
        void mo8455a();

        /* renamed from: b */
        void mo8456b(String str, Bundle bundle);

        /* renamed from: c */
        void mo8457c();

        /* renamed from: d */
        void mo8458d(int i, C2620b bVar);

        /* renamed from: e */
        void mo8459e(int i, boolean z);

        /* renamed from: f */
        void mo8460f(double d, double d2, double[] dArr);

        /* renamed from: g */
        void mo8461g(C2624e eVar);

        /* renamed from: h */
        void mo8462h();

        /* renamed from: i */
        void mo8463i(boolean z);

        /* renamed from: j */
        void mo8464j();
    }

    /* renamed from: m2.p$g */
    public enum C2626g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        

        /* renamed from: d */
        private final String f8847d;

        private C2626g(String str) {
            this.f8847d = str;
        }

        /* renamed from: a */
        static C2626g m11917a(String str) {
            for (C2626g gVar : values()) {
                if (gVar.f8847d.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public C2618p(C0008a aVar) {
        C2619a aVar2 = new C2619a();
        this.f8803c = aVar2;
        C2689i iVar = new C2689i(aVar, "flutter/textinput", C2685e.f9000a);
        this.f8801a = iVar;
        iVar.mo9434e(aVar2);
    }

    /* renamed from: c */
    private static HashMap<Object, Object> m11880c(ArrayList<C2228e> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<C2228e> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo8440b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    /* renamed from: d */
    private static HashMap<Object, Object> m11881d(String str, int i, int i2, int i3, int i4) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    /* renamed from: b */
    public void mo9302b(int i, Map<String, Object> map) {
        C3627b.m16092f("TextInputChannel", "Sending 'commitContent' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(i), "TextInputAction.commitContent", map}));
    }

    /* renamed from: e */
    public void mo9303e(int i) {
        C3627b.m16092f("TextInputChannel", "Sending 'done' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.done"}));
    }

    /* renamed from: f */
    public void mo9304f(int i) {
        C3627b.m16092f("TextInputChannel", "Sending 'go' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.go"}));
    }

    /* renamed from: g */
    public void mo9305g(int i) {
        C3627b.m16092f("TextInputChannel", "Sending 'newline' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.newline"}));
    }

    /* renamed from: h */
    public void mo9306h(int i) {
        C3627b.m16092f("TextInputChannel", "Sending 'next' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.next"}));
    }

    /* renamed from: i */
    public void mo9307i(int i, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f8801a.mo9432c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap}));
    }

    /* renamed from: j */
    public void mo9308j(int i) {
        C3627b.m16092f("TextInputChannel", "Sending 'previous' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.previous"}));
    }

    /* renamed from: k */
    public void mo9309k() {
        this.f8801a.mo9432c("TextInputClient.requestExistingInputState", (Object) null);
    }

    /* renamed from: l */
    public void mo9310l(int i) {
        C3627b.m16092f("TextInputChannel", "Sending 'search' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.search"}));
    }

    /* renamed from: m */
    public void mo9311m(int i) {
        C3627b.m16092f("TextInputChannel", "Sending 'send' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.send"}));
    }

    /* renamed from: n */
    public void mo9312n(C2625f fVar) {
        this.f8802b = fVar;
    }

    /* renamed from: o */
    public void mo9313o(int i) {
        C3627b.m16092f("TextInputChannel", "Sending 'unspecified' message.");
        this.f8801a.mo9432c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.unspecified"}));
    }

    /* renamed from: p */
    public void mo9314p(int i, String str, int i2, int i3, int i4, int i5) {
        C3627b.m16092f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        HashMap<Object, Object> d = m11881d(str, i2, i3, i4, i5);
        this.f8801a.mo9432c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i), d}));
    }

    /* renamed from: q */
    public void mo9315q(int i, ArrayList<C2228e> arrayList) {
        C3627b.m16092f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap<Object, Object> c = m11880c(arrayList);
        this.f8801a.mo9432c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i), c}));
    }

    /* renamed from: r */
    public void mo9316r(int i, HashMap<String, C2624e> hashMap) {
        C3627b.m16092f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            C2624e eVar = (C2624e) next.getValue();
            hashMap2.put((String) next.getKey(), m11881d(eVar.f8830a, eVar.f8831b, eVar.f8832c, -1, -1));
        }
        this.f8801a.mo9432c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap2}));
    }
}
