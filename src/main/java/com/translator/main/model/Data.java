
package com.translator.main.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "auto",
    "af",
    "sq",
    "am",
    "ar",
    "hy",
    "az",
    "eu",
    "be",
    "bn",
    "bs",
    "bg",
    "ca",
    "ceb",
    "ny",
    "zh-CN",
    "zh-TW",
    "co",
    "hr",
    "cs",
    "da",
    "nl",
    "en",
    "eo",
    "et",
    "tl",
    "fi",
    "fr",
    "fy",
    "gl",
    "ka",
    "de",
    "el",
    "gu",
    "ht",
    "ha",
    "haw",
    "he",
    "iw",
    "hi",
    "hmn",
    "hu",
    "is",
    "ig",
    "id",
    "ga",
    "it",
    "ja",
    "jw",
    "kn",
    "kk",
    "km",
    "ko",
    "ku",
    "ky",
    "lo",
    "la",
    "lv",
    "lt",
    "lb",
    "mk",
    "mg",
    "ms",
    "ml",
    "mt",
    "mi",
    "mr",
    "mn",
    "my",
    "ne",
    "no",
    "ps",
    "fa",
    "pl",
    "pt",
    "pa",
    "ro",
    "ru",
    "sm",
    "gd",
    "sr",
    "st",
    "sn",
    "sd",
    "si",
    "sk",
    "sl",
    "so",
    "es",
    "su",
    "sw",
    "sv",
    "tg",
    "ta",
    "te",
    "th",
    "tr",
    "uk",
    "ur",
    "uz",
    "vi",
    "cy",
    "xh",
    "yi",
    "yo",
    "zu"
})
public class Data {

    @JsonProperty("auto")
    private String auto;
    @JsonProperty("af")
    private String af;
    @JsonProperty("sq")
    private String sq;
    @JsonProperty("am")
    private String am;
    @JsonProperty("ar")
    private String ar;
    @JsonProperty("hy")
    private String hy;
    @JsonProperty("az")
    private String az;
    @JsonProperty("eu")
    private String eu;
    @JsonProperty("be")
    private String be;
    @JsonProperty("bn")
    private String bn;
    @JsonProperty("bs")
    private String bs;
    @JsonProperty("bg")
    private String bg;
    @JsonProperty("ca")
    private String ca;
    @JsonProperty("ceb")
    private String ceb;
    @JsonProperty("ny")
    private String ny;
    @JsonProperty("zh-CN")
    private String zhCN;
    @JsonProperty("zh-TW")
    private String zhTW;
    @JsonProperty("co")
    private String co;
    @JsonProperty("hr")
    private String hr;
    @JsonProperty("cs")
    private String cs;
    @JsonProperty("da")
    private String da;
    @JsonProperty("nl")
    private String nl;
    @JsonProperty("en")
    private String en;
    @JsonProperty("eo")
    private String eo;
    @JsonProperty("et")
    private String et;
    @JsonProperty("tl")
    private String tl;
    @JsonProperty("fi")
    private String fi;
    @JsonProperty("fr")
    private String fr;
    @JsonProperty("fy")
    private String fy;
    @JsonProperty("gl")
    private String gl;
    @JsonProperty("ka")
    private String ka;
    @JsonProperty("de")
    private String de;
    @JsonProperty("el")
    private String el;
    @JsonProperty("gu")
    private String gu;
    @JsonProperty("ht")
    private String ht;
    @JsonProperty("ha")
    private String ha;
    @JsonProperty("haw")
    private String haw;
    @JsonProperty("he")
    private String he;
    @JsonProperty("iw")
    private String iw;
    @JsonProperty("hi")
    private String hi;
    @JsonProperty("hmn")
    private String hmn;
    @JsonProperty("hu")
    private String hu;
    @JsonProperty("is")
    private String is;
    @JsonProperty("ig")
    private String ig;
    @JsonProperty("id")
    private String id;
    @JsonProperty("ga")
    private String ga;
    @JsonProperty("it")
    private String it;
    @JsonProperty("ja")
    private String ja;
    @JsonProperty("jw")
    private String jw;
    @JsonProperty("kn")
    private String kn;
    @JsonProperty("kk")
    private String kk;
    @JsonProperty("km")
    private String km;
    @JsonProperty("ko")
    private String ko;
    @JsonProperty("ku")
    private String ku;
    @JsonProperty("ky")
    private String ky;
    @JsonProperty("lo")
    private String lo;
    @JsonProperty("la")
    private String la;
    @JsonProperty("lv")
    private String lv;
    @JsonProperty("lt")
    private String lt;
    @JsonProperty("lb")
    private String lb;
    @JsonProperty("mk")
    private String mk;
    @JsonProperty("mg")
    private String mg;
    @JsonProperty("ms")
    private String ms;
    @JsonProperty("ml")
    private String ml;
    @JsonProperty("mt")
    private String mt;
    @JsonProperty("mi")
    private String mi;
    @JsonProperty("mr")
    private String mr;
    @JsonProperty("mn")
    private String mn;
    @JsonProperty("my")
    private String my;
    @JsonProperty("ne")
    private String ne;
    @JsonProperty("no")
    private String no;
    @JsonProperty("ps")
    private String ps;
    @JsonProperty("fa")
    private String fa;
    @JsonProperty("pl")
    private String pl;
    @JsonProperty("pt")
    private String pt;
    @JsonProperty("pa")
    private String pa;
    @JsonProperty("ro")
    private String ro;
    @JsonProperty("ru")
    private String ru;
    @JsonProperty("sm")
    private String sm;
    @JsonProperty("gd")
    private String gd;
    @JsonProperty("sr")
    private String sr;
    @JsonProperty("st")
    private String st;
    @JsonProperty("sn")
    private String sn;
    @JsonProperty("sd")
    private String sd;
    @JsonProperty("si")
    private String si;
    @JsonProperty("sk")
    private String sk;
    @JsonProperty("sl")
    private String sl;
    @JsonProperty("so")
    private String so;
    @JsonProperty("es")
    private String es;
    @JsonProperty("su")
    private String su;
    @JsonProperty("sw")
    private String sw;
    @JsonProperty("sv")
    private String sv;
    @JsonProperty("tg")
    private String tg;
    @JsonProperty("ta")
    private String ta;
    @JsonProperty("te")
    private String te;
    @JsonProperty("th")
    private String th;
    @JsonProperty("tr")
    private String tr;
    @JsonProperty("uk")
    private String uk;
    @JsonProperty("ur")
    private String ur;
    @JsonProperty("uz")
    private String uz;
    @JsonProperty("vi")
    private String vi;
    @JsonProperty("cy")
    private String cy;
    @JsonProperty("xh")
    private String xh;
    @JsonProperty("yi")
    private String yi;
    @JsonProperty("yo")
    private String yo;
    @JsonProperty("zu")
    private String zu;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("auto")
    public String getAuto() {
        return auto;
    }

    @JsonProperty("auto")
    public void setAuto(String auto) {
        this.auto = auto;
    }

    @JsonProperty("af")
    public String getAf() {
        return af;
    }

    @JsonProperty("af")
    public void setAf(String af) {
        this.af = af;
    }

    @JsonProperty("sq")
    public String getSq() {
        return sq;
    }

    @JsonProperty("sq")
    public void setSq(String sq) {
        this.sq = sq;
    }

    @JsonProperty("am")
    public String getAm() {
        return am;
    }

    @JsonProperty("am")
    public void setAm(String am) {
        this.am = am;
    }

    @JsonProperty("ar")
    public String getAr() {
        return ar;
    }

    @JsonProperty("ar")
    public void setAr(String ar) {
        this.ar = ar;
    }

    @JsonProperty("hy")
    public String getHy() {
        return hy;
    }

    @JsonProperty("hy")
    public void setHy(String hy) {
        this.hy = hy;
    }

    @JsonProperty("az")
    public String getAz() {
        return az;
    }

    @JsonProperty("az")
    public void setAz(String az) {
        this.az = az;
    }

    @JsonProperty("eu")
    public String getEu() {
        return eu;
    }

    @JsonProperty("eu")
    public void setEu(String eu) {
        this.eu = eu;
    }

    @JsonProperty("be")
    public String getBe() {
        return be;
    }

    @JsonProperty("be")
    public void setBe(String be) {
        this.be = be;
    }

    @JsonProperty("bn")
    public String getBn() {
        return bn;
    }

    @JsonProperty("bn")
    public void setBn(String bn) {
        this.bn = bn;
    }

    @JsonProperty("bs")
    public String getBs() {
        return bs;
    }

    @JsonProperty("bs")
    public void setBs(String bs) {
        this.bs = bs;
    }

    @JsonProperty("bg")
    public String getBg() {
        return bg;
    }

    @JsonProperty("bg")
    public void setBg(String bg) {
        this.bg = bg;
    }

    @JsonProperty("ca")
    public String getCa() {
        return ca;
    }

    @JsonProperty("ca")
    public void setCa(String ca) {
        this.ca = ca;
    }

    @JsonProperty("ceb")
    public String getCeb() {
        return ceb;
    }

    @JsonProperty("ceb")
    public void setCeb(String ceb) {
        this.ceb = ceb;
    }

    @JsonProperty("ny")
    public String getNy() {
        return ny;
    }

    @JsonProperty("ny")
    public void setNy(String ny) {
        this.ny = ny;
    }

    @JsonProperty("zh-CN")
    public String getZhCN() {
        return zhCN;
    }

    @JsonProperty("zh-CN")
    public void setZhCN(String zhCN) {
        this.zhCN = zhCN;
    }

    @JsonProperty("zh-TW")
    public String getZhTW() {
        return zhTW;
    }

    @JsonProperty("zh-TW")
    public void setZhTW(String zhTW) {
        this.zhTW = zhTW;
    }

    @JsonProperty("co")
    public String getCo() {
        return co;
    }

    @JsonProperty("co")
    public void setCo(String co) {
        this.co = co;
    }

    @JsonProperty("hr")
    public String getHr() {
        return hr;
    }

    @JsonProperty("hr")
    public void setHr(String hr) {
        this.hr = hr;
    }

    @JsonProperty("cs")
    public String getCs() {
        return cs;
    }

    @JsonProperty("cs")
    public void setCs(String cs) {
        this.cs = cs;
    }

    @JsonProperty("da")
    public String getDa() {
        return da;
    }

    @JsonProperty("da")
    public void setDa(String da) {
        this.da = da;
    }

    @JsonProperty("nl")
    public String getNl() {
        return nl;
    }

    @JsonProperty("nl")
    public void setNl(String nl) {
        this.nl = nl;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonProperty("eo")
    public String getEo() {
        return eo;
    }

    @JsonProperty("eo")
    public void setEo(String eo) {
        this.eo = eo;
    }

    @JsonProperty("et")
    public String getEt() {
        return et;
    }

    @JsonProperty("et")
    public void setEt(String et) {
        this.et = et;
    }

    @JsonProperty("tl")
    public String getTl() {
        return tl;
    }

    @JsonProperty("tl")
    public void setTl(String tl) {
        this.tl = tl;
    }

    @JsonProperty("fi")
    public String getFi() {
        return fi;
    }

    @JsonProperty("fi")
    public void setFi(String fi) {
        this.fi = fi;
    }

    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    @JsonProperty("fy")
    public String getFy() {
        return fy;
    }

    @JsonProperty("fy")
    public void setFy(String fy) {
        this.fy = fy;
    }

    @JsonProperty("gl")
    public String getGl() {
        return gl;
    }

    @JsonProperty("gl")
    public void setGl(String gl) {
        this.gl = gl;
    }

    @JsonProperty("ka")
    public String getKa() {
        return ka;
    }

    @JsonProperty("ka")
    public void setKa(String ka) {
        this.ka = ka;
    }

    @JsonProperty("de")
    public String getDe() {
        return de;
    }

    @JsonProperty("de")
    public void setDe(String de) {
        this.de = de;
    }

    @JsonProperty("el")
    public String getEl() {
        return el;
    }

    @JsonProperty("el")
    public void setEl(String el) {
        this.el = el;
    }

    @JsonProperty("gu")
    public String getGu() {
        return gu;
    }

    @JsonProperty("gu")
    public void setGu(String gu) {
        this.gu = gu;
    }

    @JsonProperty("ht")
    public String getHt() {
        return ht;
    }

    @JsonProperty("ht")
    public void setHt(String ht) {
        this.ht = ht;
    }

    @JsonProperty("ha")
    public String getHa() {
        return ha;
    }

    @JsonProperty("ha")
    public void setHa(String ha) {
        this.ha = ha;
    }

    @JsonProperty("haw")
    public String getHaw() {
        return haw;
    }

    @JsonProperty("haw")
    public void setHaw(String haw) {
        this.haw = haw;
    }

    @JsonProperty("he")
    public String getHe() {
        return he;
    }

    @JsonProperty("he")
    public void setHe(String he) {
        this.he = he;
    }

    @JsonProperty("iw")
    public String getIw() {
        return iw;
    }

    @JsonProperty("iw")
    public void setIw(String iw) {
        this.iw = iw;
    }

    @JsonProperty("hi")
    public String getHi() {
        return hi;
    }

    @JsonProperty("hi")
    public void setHi(String hi) {
        this.hi = hi;
    }

    @JsonProperty("hmn")
    public String getHmn() {
        return hmn;
    }

    @JsonProperty("hmn")
    public void setHmn(String hmn) {
        this.hmn = hmn;
    }

    @JsonProperty("hu")
    public String getHu() {
        return hu;
    }

    @JsonProperty("hu")
    public void setHu(String hu) {
        this.hu = hu;
    }

    @JsonProperty("is")
    public String getIs() {
        return is;
    }

    @JsonProperty("is")
    public void setIs(String is) {
        this.is = is;
    }

    @JsonProperty("ig")
    public String getIg() {
        return ig;
    }

    @JsonProperty("ig")
    public void setIg(String ig) {
        this.ig = ig;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("ga")
    public String getGa() {
        return ga;
    }

    @JsonProperty("ga")
    public void setGa(String ga) {
        this.ga = ga;
    }

    @JsonProperty("it")
    public String getIt() {
        return it;
    }

    @JsonProperty("it")
    public void setIt(String it) {
        this.it = it;
    }

    @JsonProperty("ja")
    public String getJa() {
        return ja;
    }

    @JsonProperty("ja")
    public void setJa(String ja) {
        this.ja = ja;
    }

    @JsonProperty("jw")
    public String getJw() {
        return jw;
    }

    @JsonProperty("jw")
    public void setJw(String jw) {
        this.jw = jw;
    }

    @JsonProperty("kn")
    public String getKn() {
        return kn;
    }

    @JsonProperty("kn")
    public void setKn(String kn) {
        this.kn = kn;
    }

    @JsonProperty("kk")
    public String getKk() {
        return kk;
    }

    @JsonProperty("kk")
    public void setKk(String kk) {
        this.kk = kk;
    }

    @JsonProperty("km")
    public String getKm() {
        return km;
    }

    @JsonProperty("km")
    public void setKm(String km) {
        this.km = km;
    }

    @JsonProperty("ko")
    public String getKo() {
        return ko;
    }

    @JsonProperty("ko")
    public void setKo(String ko) {
        this.ko = ko;
    }

    @JsonProperty("ku")
    public String getKu() {
        return ku;
    }

    @JsonProperty("ku")
    public void setKu(String ku) {
        this.ku = ku;
    }

    @JsonProperty("ky")
    public String getKy() {
        return ky;
    }

    @JsonProperty("ky")
    public void setKy(String ky) {
        this.ky = ky;
    }

    @JsonProperty("lo")
    public String getLo() {
        return lo;
    }

    @JsonProperty("lo")
    public void setLo(String lo) {
        this.lo = lo;
    }

    @JsonProperty("la")
    public String getLa() {
        return la;
    }

    @JsonProperty("la")
    public void setLa(String la) {
        this.la = la;
    }

    @JsonProperty("lv")
    public String getLv() {
        return lv;
    }

    @JsonProperty("lv")
    public void setLv(String lv) {
        this.lv = lv;
    }

    @JsonProperty("lt")
    public String getLt() {
        return lt;
    }

    @JsonProperty("lt")
    public void setLt(String lt) {
        this.lt = lt;
    }

    @JsonProperty("lb")
    public String getLb() {
        return lb;
    }

    @JsonProperty("lb")
    public void setLb(String lb) {
        this.lb = lb;
    }

    @JsonProperty("mk")
    public String getMk() {
        return mk;
    }

    @JsonProperty("mk")
    public void setMk(String mk) {
        this.mk = mk;
    }

    @JsonProperty("mg")
    public String getMg() {
        return mg;
    }

    @JsonProperty("mg")
    public void setMg(String mg) {
        this.mg = mg;
    }

    @JsonProperty("ms")
    public String getMs() {
        return ms;
    }

    @JsonProperty("ms")
    public void setMs(String ms) {
        this.ms = ms;
    }

    @JsonProperty("ml")
    public String getMl() {
        return ml;
    }

    @JsonProperty("ml")
    public void setMl(String ml) {
        this.ml = ml;
    }

    @JsonProperty("mt")
    public String getMt() {
        return mt;
    }

    @JsonProperty("mt")
    public void setMt(String mt) {
        this.mt = mt;
    }

    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    @JsonProperty("mr")
    public String getMr() {
        return mr;
    }

    @JsonProperty("mr")
    public void setMr(String mr) {
        this.mr = mr;
    }

    @JsonProperty("mn")
    public String getMn() {
        return mn;
    }

    @JsonProperty("mn")
    public void setMn(String mn) {
        this.mn = mn;
    }

    @JsonProperty("my")
    public String getMy() {
        return my;
    }

    @JsonProperty("my")
    public void setMy(String my) {
        this.my = my;
    }

    @JsonProperty("ne")
    public String getNe() {
        return ne;
    }

    @JsonProperty("ne")
    public void setNe(String ne) {
        this.ne = ne;
    }

    @JsonProperty("no")
    public String getNo() {
        return no;
    }

    @JsonProperty("no")
    public void setNo(String no) {
        this.no = no;
    }

    @JsonProperty("ps")
    public String getPs() {
        return ps;
    }

    @JsonProperty("ps")
    public void setPs(String ps) {
        this.ps = ps;
    }

    @JsonProperty("fa")
    public String getFa() {
        return fa;
    }

    @JsonProperty("fa")
    public void setFa(String fa) {
        this.fa = fa;
    }

    @JsonProperty("pl")
    public String getPl() {
        return pl;
    }

    @JsonProperty("pl")
    public void setPl(String pl) {
        this.pl = pl;
    }

    @JsonProperty("pt")
    public String getPt() {
        return pt;
    }

    @JsonProperty("pt")
    public void setPt(String pt) {
        this.pt = pt;
    }

    @JsonProperty("pa")
    public String getPa() {
        return pa;
    }

    @JsonProperty("pa")
    public void setPa(String pa) {
        this.pa = pa;
    }

    @JsonProperty("ro")
    public String getRo() {
        return ro;
    }

    @JsonProperty("ro")
    public void setRo(String ro) {
        this.ro = ro;
    }

    @JsonProperty("ru")
    public String getRu() {
        return ru;
    }

    @JsonProperty("ru")
    public void setRu(String ru) {
        this.ru = ru;
    }

    @JsonProperty("sm")
    public String getSm() {
        return sm;
    }

    @JsonProperty("sm")
    public void setSm(String sm) {
        this.sm = sm;
    }

    @JsonProperty("gd")
    public String getGd() {
        return gd;
    }

    @JsonProperty("gd")
    public void setGd(String gd) {
        this.gd = gd;
    }

    @JsonProperty("sr")
    public String getSr() {
        return sr;
    }

    @JsonProperty("sr")
    public void setSr(String sr) {
        this.sr = sr;
    }

    @JsonProperty("st")
    public String getSt() {
        return st;
    }

    @JsonProperty("st")
    public void setSt(String st) {
        this.st = st;
    }

    @JsonProperty("sn")
    public String getSn() {
        return sn;
    }

    @JsonProperty("sn")
    public void setSn(String sn) {
        this.sn = sn;
    }

    @JsonProperty("sd")
    public String getSd() {
        return sd;
    }

    @JsonProperty("sd")
    public void setSd(String sd) {
        this.sd = sd;
    }

    @JsonProperty("si")
    public String getSi() {
        return si;
    }

    @JsonProperty("si")
    public void setSi(String si) {
        this.si = si;
    }

    @JsonProperty("sk")
    public String getSk() {
        return sk;
    }

    @JsonProperty("sk")
    public void setSk(String sk) {
        this.sk = sk;
    }

    @JsonProperty("sl")
    public String getSl() {
        return sl;
    }

    @JsonProperty("sl")
    public void setSl(String sl) {
        this.sl = sl;
    }

    @JsonProperty("so")
    public String getSo() {
        return so;
    }

    @JsonProperty("so")
    public void setSo(String so) {
        this.so = so;
    }

    @JsonProperty("es")
    public String getEs() {
        return es;
    }

    @JsonProperty("es")
    public void setEs(String es) {
        this.es = es;
    }

    @JsonProperty("su")
    public String getSu() {
        return su;
    }

    @JsonProperty("su")
    public void setSu(String su) {
        this.su = su;
    }

    @JsonProperty("sw")
    public String getSw() {
        return sw;
    }

    @JsonProperty("sw")
    public void setSw(String sw) {
        this.sw = sw;
    }

    @JsonProperty("sv")
    public String getSv() {
        return sv;
    }

    @JsonProperty("sv")
    public void setSv(String sv) {
        this.sv = sv;
    }

    @JsonProperty("tg")
    public String getTg() {
        return tg;
    }

    @JsonProperty("tg")
    public void setTg(String tg) {
        this.tg = tg;
    }

    @JsonProperty("ta")
    public String getTa() {
        return ta;
    }

    @JsonProperty("ta")
    public void setTa(String ta) {
        this.ta = ta;
    }

    @JsonProperty("te")
    public String getTe() {
        return te;
    }

    @JsonProperty("te")
    public void setTe(String te) {
        this.te = te;
    }

    @JsonProperty("th")
    public String getTh() {
        return th;
    }

    @JsonProperty("th")
    public void setTh(String th) {
        this.th = th;
    }

    @JsonProperty("tr")
    public String getTr() {
        return tr;
    }

    @JsonProperty("tr")
    public void setTr(String tr) {
        this.tr = tr;
    }

    @JsonProperty("uk")
    public String getUk() {
        return uk;
    }

    @JsonProperty("uk")
    public void setUk(String uk) {
        this.uk = uk;
    }

    @JsonProperty("ur")
    public String getUr() {
        return ur;
    }

    @JsonProperty("ur")
    public void setUr(String ur) {
        this.ur = ur;
    }

    @JsonProperty("uz")
    public String getUz() {
        return uz;
    }

    @JsonProperty("uz")
    public void setUz(String uz) {
        this.uz = uz;
    }

    @JsonProperty("vi")
    public String getVi() {
        return vi;
    }

    @JsonProperty("vi")
    public void setVi(String vi) {
        this.vi = vi;
    }

    @JsonProperty("cy")
    public String getCy() {
        return cy;
    }

    @JsonProperty("cy")
    public void setCy(String cy) {
        this.cy = cy;
    }

    @JsonProperty("xh")
    public String getXh() {
        return xh;
    }

    @JsonProperty("xh")
    public void setXh(String xh) {
        this.xh = xh;
    }

    @JsonProperty("yi")
    public String getYi() {
        return yi;
    }

    @JsonProperty("yi")
    public void setYi(String yi) {
        this.yi = yi;
    }

    @JsonProperty("yo")
    public String getYo() {
        return yo;
    }

    @JsonProperty("yo")
    public void setYo(String yo) {
        this.yo = yo;
    }

    @JsonProperty("zu")
    public String getZu() {
        return zu;
    }

    @JsonProperty("zu")
    public void setZu(String zu) {
        this.zu = zu;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Data{" +
                "auto='" + auto + '\'' +
                ", af='" + af + '\'' +
                ", sq='" + sq + '\'' +
                ", am='" + am + '\'' +
                ", ar='" + ar + '\'' +
                ", hy='" + hy + '\'' +
                ", az='" + az + '\'' +
                ", eu='" + eu + '\'' +
                ", be='" + be + '\'' +
                ", bn='" + bn + '\'' +
                ", bs='" + bs + '\'' +
                ", bg='" + bg + '\'' +
                ", ca='" + ca + '\'' +
                ", ceb='" + ceb + '\'' +
                ", ny='" + ny + '\'' +
                ", zhCN='" + zhCN + '\'' +
                ", zhTW='" + zhTW + '\'' +
                ", co='" + co + '\'' +
                ", hr='" + hr + '\'' +
                ", cs='" + cs + '\'' +
                ", da='" + da + '\'' +
                ", nl='" + nl + '\'' +
                ", en='" + en + '\'' +
                ", eo='" + eo + '\'' +
                ", et='" + et + '\'' +
                ", tl='" + tl + '\'' +
                ", fi='" + fi + '\'' +
                ", fr='" + fr + '\'' +
                ", fy='" + fy + '\'' +
                ", gl='" + gl + '\'' +
                ", ka='" + ka + '\'' +
                ", de='" + de + '\'' +
                ", el='" + el + '\'' +
                ", gu='" + gu + '\'' +
                ", ht='" + ht + '\'' +
                ", ha='" + ha + '\'' +
                ", haw='" + haw + '\'' +
                ", he='" + he + '\'' +
                ", iw='" + iw + '\'' +
                ", hi='" + hi + '\'' +
                ", hmn='" + hmn + '\'' +
                ", hu='" + hu + '\'' +
                ", is='" + is + '\'' +
                ", ig='" + ig + '\'' +
                ", id='" + id + '\'' +
                ", ga='" + ga + '\'' +
                ", it='" + it + '\'' +
                ", ja='" + ja + '\'' +
                ", jw='" + jw + '\'' +
                ", kn='" + kn + '\'' +
                ", kk='" + kk + '\'' +
                ", km='" + km + '\'' +
                ", ko='" + ko + '\'' +
                ", ku='" + ku + '\'' +
                ", ky='" + ky + '\'' +
                ", lo='" + lo + '\'' +
                ", la='" + la + '\'' +
                ", lv='" + lv + '\'' +
                ", lt='" + lt + '\'' +
                ", lb='" + lb + '\'' +
                ", mk='" + mk + '\'' +
                ", mg='" + mg + '\'' +
                ", ms='" + ms + '\'' +
                ", ml='" + ml + '\'' +
                ", mt='" + mt + '\'' +
                ", mi='" + mi + '\'' +
                ", mr='" + mr + '\'' +
                ", mn='" + mn + '\'' +
                ", my='" + my + '\'' +
                ", ne='" + ne + '\'' +
                ", no='" + no + '\'' +
                ", ps='" + ps + '\'' +
                ", fa='" + fa + '\'' +
                ", pl='" + pl + '\'' +
                ", pt='" + pt + '\'' +
                ", pa='" + pa + '\'' +
                ", ro='" + ro + '\'' +
                ", ru='" + ru + '\'' +
                ", sm='" + sm + '\'' +
                ", gd='" + gd + '\'' +
                ", sr='" + sr + '\'' +
                ", st='" + st + '\'' +
                ", sn='" + sn + '\'' +
                ", sd='" + sd + '\'' +
                ", si='" + si + '\'' +
                ", sk='" + sk + '\'' +
                ", sl='" + sl + '\'' +
                ", so='" + so + '\'' +
                ", es='" + es + '\'' +
                ", su='" + su + '\'' +
                ", sw='" + sw + '\'' +
                ", sv='" + sv + '\'' +
                ", tg='" + tg + '\'' +
                ", ta='" + ta + '\'' +
                ", te='" + te + '\'' +
                ", th='" + th + '\'' +
                ", tr='" + tr + '\'' +
                ", uk='" + uk + '\'' +
                ", ur='" + ur + '\'' +
                ", uz='" + uz + '\'' +
                ", vi='" + vi + '\'' +
                ", cy='" + cy + '\'' +
                ", xh='" + xh + '\'' +
                ", yi='" + yi + '\'' +
                ", yo='" + yo + '\'' +
                ", zu='" + zu + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
