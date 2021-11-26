package com.github.catvod.spider;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C0260YV;
import com.github.catvod.spider.merge.C0337cw;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class Jpys extends C0260YV {
    /* access modifiers changed from: protected */
    /* renamed from: M4 */
    public void mo2M4(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f567us = jSONObject.optString(C0337cw.m1497us(-82008975906918L));
            this.f562bI = jSONObject.optString(C0337cw.m1497us(-82026155776102L));
            this.f566tC = jSONObject.optJSONObject(C0337cw.m1497us(-82047630612582L));
            this.f558M4 = jSONObject.optJSONObject(C0337cw.m1497us(-82077695383654L));
            this.f565o = Pattern.compile(jSONObject.optString(C0337cw.m1497us(-82107760154726L)));
            this.f553BL = Pattern.compile(jSONObject.optString(C0337cw.m1497us(-82167889696870L)));
            this.f563fv = Pattern.compile(jSONObject.optString(C0337cw.m1497us(-82206544402534L)));
            this.f552B = Pattern.compile(jSONObject.optString(C0337cw.m1497us(-82249494075494L)));
            this.f557K = jSONObject.optString(C0337cw.m1497us(-82292443748454L)).split(C0337cw.m1497us(-82343983356006L));
            this.f560TZ = jSONObject.optString(C0337cw.m1497us(-82356868257894L)).split(C0337cw.m1497us(-82399817930854L));
            this.f555DS = jSONObject.optString(C0337cw.m1497us(-82412702832742L)).split(C0337cw.m1497us(-82447062571110L));
            this.f561W = jSONObject.optString(C0337cw.m1497us(-82459947472998L)).split(C0337cw.m1497us(-82502897145958L));
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: fv */
    public boolean mo5fv(String str, boolean z) {
        if (z) {
            if (str.equals(C0337cw.m1497us(-82515782047846L)) || str.equals(C0337cw.m1497us(-82528666949734L)) || str.equals(C0337cw.m1497us(-82545846818918L)) || str.equals(C0337cw.m1497us(-82558731720806L))) {
                return true;
            }
            return false;
        } else if (str.equals(C0337cw.m1497us(-82571616622694L)) || str.equals(C0337cw.m1497us(-82584501524582L)) || str.equals(C0337cw.m1497us(-82597386426470L)) || str.equals(C0337cw.m1497us(-82610271328358L)) || str.equals(C0337cw.m1497us(-82623156230246L)) || str.equals(C0337cw.m1497us(-82636041132134L)) || str.equals(C0337cw.m1497us(-82653221001318L)) || str.equals(C0337cw.m1497us(-82666105903206L)) || str.equals(C0337cw.m1497us(-82678990805094L))) {
            return false;
        } else {
            return true;
        }
    }
}
