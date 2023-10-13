package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
public class C0412c {

    /* renamed from: a */
    private final ConstraintLayout f1712a;

    /* renamed from: b */
    int f1713b = -1;

    /* renamed from: c */
    int f1714c = -1;

    /* renamed from: d */
    private SparseArray<C0413a> f1715d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<C0415d> f1716e = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    static class C0413a {

        /* renamed from: a */
        int f1717a;

        /* renamed from: b */
        ArrayList<C0414b> f1718b = new ArrayList<>();

        /* renamed from: c */
        int f1719c = -1;

        /* renamed from: d */
        C0415d f1720d;

        public C0413a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0427j.f2036d5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0427j.f2043e5) {
                    this.f1717a = obtainStyledAttributes.getResourceId(index, this.f1717a);
                } else if (index == C0427j.f2050f5) {
                    this.f1719c = obtainStyledAttributes.getResourceId(index, this.f1719c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1719c);
                    context.getResources().getResourceName(this.f1719c);
                    if ("layout".equals(resourceTypeName)) {
                        C0415d dVar = new C0415d();
                        this.f1720d = dVar;
                        dVar.mo2258e(context, this.f1719c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2255a(C0414b bVar) {
            this.f1718b.add(bVar);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    static class C0414b {

        /* renamed from: a */
        float f1721a = Float.NaN;

        /* renamed from: b */
        float f1722b = Float.NaN;

        /* renamed from: c */
        float f1723c = Float.NaN;

        /* renamed from: d */
        float f1724d = Float.NaN;

        /* renamed from: e */
        int f1725e = -1;

        /* renamed from: f */
        C0415d f1726f;

        public C0414b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0427j.f2190z5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0427j.f1851A5) {
                    this.f1725e = obtainStyledAttributes.getResourceId(index, this.f1725e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1725e);
                    context.getResources().getResourceName(this.f1725e);
                    if ("layout".equals(resourceTypeName)) {
                        C0415d dVar = new C0415d();
                        this.f1726f = dVar;
                        dVar.mo2258e(context, this.f1725e);
                    }
                } else if (index == C0427j.f1858B5) {
                    this.f1724d = obtainStyledAttributes.getDimension(index, this.f1724d);
                } else if (index == C0427j.f1865C5) {
                    this.f1722b = obtainStyledAttributes.getDimension(index, this.f1722b);
                } else if (index == C0427j.f1872D5) {
                    this.f1723c = obtainStyledAttributes.getDimension(index, this.f1723c);
                } else if (index == C0427j.f1879E5) {
                    this.f1721a = obtainStyledAttributes.getDimension(index, this.f1721a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    C0412c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f1712a = constraintLayout;
        m1949a(context, i);
    }

    /* renamed from: a */
    private void m1949a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0413a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0413a(context, xml);
                            this.f1715d.put(aVar.f1717a, aVar);
                        } else if (c == 3) {
                            C0414b bVar = new C0414b(context, xml);
                            if (aVar != null) {
                                aVar.mo2255a(bVar);
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m1950b(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1950b(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0415d dVar = new C0415d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.mo2263m(context, xmlPullParser);
                this.f1716e.put(i, dVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo2254c(C0423f fVar) {
    }
}
