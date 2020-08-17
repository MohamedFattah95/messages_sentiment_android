package com.mohamedfattah95.messages_sentiment.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LocationResponse {

    /**
     * documentation : https://opencagedata.com/api
     * licenses : [{"name":"see attribution guide","url":"https://opencagedata.com/credits"}]
     * rate : {"limit":2500,"remaining":2485,"reset":1597708800}
     * results : [{"annotations":{"DMS":{"lat":"41° 0' 49.82400'' N","lng":"28° 56' 58.77600'' E"},"MGRS":"35TPF6393942124","Maidenhead":"KN41la33xh","Mercator":{"x":3222661.41,"y":4986336.325},"OSM":{"note_url":"https://www.openstreetmap.org/note/new#map=17/41.01384/28.94966&layers=N","url":"https://www.openstreetmap.org/?mlat=41.01384&mlon=28.94966#map=17/41.01384/28.94966"},"UN_M49":{"regions":{"ASIA":"142","TR":"792","WESTERN_ASIA":"145","WORLD":"001"},"statistical_groupings":["LEDC"]},"callingcode":90,"currency":{"alternate_symbols":["TL"],"decimal_mark":",","html_entity":"&#8378;","iso_code":"TRY","iso_numeric":"949","name":"Turkish Lira","smallest_denomination":1,"subunit":"kuruş","subunit_to_unit":100,"symbol":"\u20ba","symbol_first":1,"thousands_separator":"."},"flag":"🇹🇷","geohash":"sxk96f26zvzj6h9g48y9","qibla":151.56,"roadinfo":{"drive_on":"right","speed_in":"km/h"},"sun":{"rise":{"apparent":1597634220,"astronomical":1597628040,"civil":1597632480,"nautical":1597630320},"set":{"apparent":1597683480,"astronomical":1597689660,"civil":1597685280,"nautical":1597687380}},"timezone":{"name":"Europe/Istanbul","now_in_dst":0,"offset_sec":10800,"offset_string":"+0300","short_name":"+03"},"what3words":{"words":"drift.resold.pack"}},"bounds":{"northeast":{"lat":41.205338,"lng":29.411833},"southwest":{"lat":40.784084,"lng":28.488001}},"components":{"ISO_3166-1_alpha-2":"TR","ISO_3166-1_alpha-3":"TUR","_category":"place","_type":"city","continent":"Europe","country":"Turkey","country_code":"tr","state":"Istanbul","town":"Istanbul"},"confidence":1,"formatted":"Istanbul, Turkey","geometry":{"lat":41.01384,"lng":28.94966}}]
     * status : {"code":200,"message":"OK"}
     * stay_informed : {"blog":"https://blog.opencagedata.com","twitter":"https://twitter.com/OpenCage"}
     * thanks : For using an OpenCage API
     * timestamp : {"created_http":"Mon, 17 Aug 2020 00:13:53 GMT","created_unix":1597623233}
     * total_results : 1
     */

    @SerializedName("documentation")
    private String documentation;
    @SerializedName("rate")
    private RateBean rate;
    @SerializedName("status")
    private StatusBean status;
    @SerializedName("stay_informed")
    private StayInformedBean stayInformed;
    @SerializedName("thanks")
    private String thanks;
    @SerializedName("timestamp")
    private TimestampBean timestamp;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("licenses")
    private List<LicensesBean> licenses;
    @SerializedName("results")
    private List<ResultsBean> results;

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public RateBean getRate() {
        return rate;
    }

    public void setRate(RateBean rate) {
        this.rate = rate;
    }

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public StayInformedBean getStayInformed() {
        return stayInformed;
    }

    public void setStayInformed(StayInformedBean stayInformed) {
        this.stayInformed = stayInformed;
    }

    public String getThanks() {
        return thanks;
    }

    public void setThanks(String thanks) {
        this.thanks = thanks;
    }

    public TimestampBean getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(TimestampBean timestamp) {
        this.timestamp = timestamp;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<LicensesBean> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<LicensesBean> licenses) {
        this.licenses = licenses;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class RateBean {
        /**
         * limit : 2500
         * remaining : 2485
         * reset : 1597708800
         */

        @SerializedName("limit")
        private int limit;
        @SerializedName("remaining")
        private int remaining;
        @SerializedName("reset")
        private int reset;

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getRemaining() {
            return remaining;
        }

        public void setRemaining(int remaining) {
            this.remaining = remaining;
        }

        public int getReset() {
            return reset;
        }

        public void setReset(int reset) {
            this.reset = reset;
        }
    }

    public static class StatusBean {
        /**
         * code : 200
         * message : OK
         */

        @SerializedName("code")
        private int code;
        @SerializedName("message")
        private String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class StayInformedBean {
        /**
         * blog : https://blog.opencagedata.com
         * twitter : https://twitter.com/OpenCage
         */

        @SerializedName("blog")
        private String blog;
        @SerializedName("twitter")
        private String twitter;

        public String getBlog() {
            return blog;
        }

        public void setBlog(String blog) {
            this.blog = blog;
        }

        public String getTwitter() {
            return twitter;
        }

        public void setTwitter(String twitter) {
            this.twitter = twitter;
        }
    }

    public static class TimestampBean {
        /**
         * created_http : Mon, 17 Aug 2020 00:13:53 GMT
         * created_unix : 1597623233
         */

        @SerializedName("created_http")
        private String createdHttp;
        @SerializedName("created_unix")
        private int createdUnix;

        public String getCreatedHttp() {
            return createdHttp;
        }

        public void setCreatedHttp(String createdHttp) {
            this.createdHttp = createdHttp;
        }

        public int getCreatedUnix() {
            return createdUnix;
        }

        public void setCreatedUnix(int createdUnix) {
            this.createdUnix = createdUnix;
        }
    }

    public static class LicensesBean {
        /**
         * name : see attribution guide
         * url : https://opencagedata.com/credits
         */

        @SerializedName("name")
        private String name;
        @SerializedName("url")
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class ResultsBean {
        /**
         * annotations : {"DMS":{"lat":"41° 0' 49.82400'' N","lng":"28° 56' 58.77600'' E"},"MGRS":"35TPF6393942124","Maidenhead":"KN41la33xh","Mercator":{"x":3222661.41,"y":4986336.325},"OSM":{"note_url":"https://www.openstreetmap.org/note/new#map=17/41.01384/28.94966&layers=N","url":"https://www.openstreetmap.org/?mlat=41.01384&mlon=28.94966#map=17/41.01384/28.94966"},"UN_M49":{"regions":{"ASIA":"142","TR":"792","WESTERN_ASIA":"145","WORLD":"001"},"statistical_groupings":["LEDC"]},"callingcode":90,"currency":{"alternate_symbols":["TL"],"decimal_mark":",","html_entity":"&#8378;","iso_code":"TRY","iso_numeric":"949","name":"Turkish Lira","smallest_denomination":1,"subunit":"kuruş","subunit_to_unit":100,"symbol":"\u20ba","symbol_first":1,"thousands_separator":"."},"flag":"🇹🇷","geohash":"sxk96f26zvzj6h9g48y9","qibla":151.56,"roadinfo":{"drive_on":"right","speed_in":"km/h"},"sun":{"rise":{"apparent":1597634220,"astronomical":1597628040,"civil":1597632480,"nautical":1597630320},"set":{"apparent":1597683480,"astronomical":1597689660,"civil":1597685280,"nautical":1597687380}},"timezone":{"name":"Europe/Istanbul","now_in_dst":0,"offset_sec":10800,"offset_string":"+0300","short_name":"+03"},"what3words":{"words":"drift.resold.pack"}}
         * bounds : {"northeast":{"lat":41.205338,"lng":29.411833},"southwest":{"lat":40.784084,"lng":28.488001}}
         * components : {"ISO_3166-1_alpha-2":"TR","ISO_3166-1_alpha-3":"TUR","_category":"place","_type":"city","continent":"Europe","country":"Turkey","country_code":"tr","state":"Istanbul","town":"Istanbul"}
         * confidence : 1
         * formatted : Istanbul, Turkey
         * geometry : {"lat":41.01384,"lng":28.94966}
         */

        @SerializedName("annotations")
        private AnnotationsBean annotations;
        @SerializedName("bounds")
        private BoundsBean bounds;
        @SerializedName("components")
        private ComponentsBean components;
        @SerializedName("confidence")
        private int confidence;
        @SerializedName("formatted")
        private String formatted;
        @SerializedName("geometry")
        private GeometryBean geometry;

        public AnnotationsBean getAnnotations() {
            return annotations;
        }

        public void setAnnotations(AnnotationsBean annotations) {
            this.annotations = annotations;
        }

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public ComponentsBean getComponents() {
            return components;
        }

        public void setComponents(ComponentsBean components) {
            this.components = components;
        }

        public int getConfidence() {
            return confidence;
        }

        public void setConfidence(int confidence) {
            this.confidence = confidence;
        }

        public String getFormatted() {
            return formatted;
        }

        public void setFormatted(String formatted) {
            this.formatted = formatted;
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public static class AnnotationsBean {
            /**
             * DMS : {"lat":"41° 0' 49.82400'' N","lng":"28° 56' 58.77600'' E"}
             * MGRS : 35TPF6393942124
             * Maidenhead : KN41la33xh
             * Mercator : {"x":3222661.41,"y":4986336.325}
             * OSM : {"note_url":"https://www.openstreetmap.org/note/new#map=17/41.01384/28.94966&layers=N","url":"https://www.openstreetmap.org/?mlat=41.01384&mlon=28.94966#map=17/41.01384/28.94966"}
             * UN_M49 : {"regions":{"ASIA":"142","TR":"792","WESTERN_ASIA":"145","WORLD":"001"},"statistical_groupings":["LEDC"]}
             * callingcode : 90
             * currency : {"alternate_symbols":["TL"],"decimal_mark":",","html_entity":"&#8378;","iso_code":"TRY","iso_numeric":"949","name":"Turkish Lira","smallest_denomination":1,"subunit":"kuruş","subunit_to_unit":100,"symbol":"\u20ba","symbol_first":1,"thousands_separator":"."}
             * flag : 🇹🇷
             * geohash : sxk96f26zvzj6h9g48y9
             * qibla : 151.56
             * roadinfo : {"drive_on":"right","speed_in":"km/h"}
             * sun : {"rise":{"apparent":1597634220,"astronomical":1597628040,"civil":1597632480,"nautical":1597630320},"set":{"apparent":1597683480,"astronomical":1597689660,"civil":1597685280,"nautical":1597687380}}
             * timezone : {"name":"Europe/Istanbul","now_in_dst":0,"offset_sec":10800,"offset_string":"+0300","short_name":"+03"}
             * what3words : {"words":"drift.resold.pack"}
             */

            @SerializedName("DMS")
            private DMSBean DMS;
            @SerializedName("MGRS")
            private String MGRS;
            @SerializedName("Maidenhead")
            private String Maidenhead;
            @SerializedName("Mercator")
            private MercatorBean Mercator;
            @SerializedName("OSM")
            private OSMBean OSM;
            @SerializedName("UN_M49")
            private UNM49Bean UNM49;
            @SerializedName("callingcode")
            private int callingcode;
            @SerializedName("currency")
            private CurrencyBean currency;
            @SerializedName("flag")
            private String flag;
            @SerializedName("geohash")
            private String geohash;
            @SerializedName("qibla")
            private double qibla;
            @SerializedName("roadinfo")
            private RoadinfoBean roadinfo;
            @SerializedName("sun")
            private SunBean sun;
            @SerializedName("timezone")
            private TimezoneBean timezone;
            @SerializedName("what3words")
            private What3wordsBean what3words;

            public DMSBean getDMS() {
                return DMS;
            }

            public void setDMS(DMSBean DMS) {
                this.DMS = DMS;
            }

            public String getMGRS() {
                return MGRS;
            }

            public void setMGRS(String MGRS) {
                this.MGRS = MGRS;
            }

            public String getMaidenhead() {
                return Maidenhead;
            }

            public void setMaidenhead(String Maidenhead) {
                this.Maidenhead = Maidenhead;
            }

            public MercatorBean getMercator() {
                return Mercator;
            }

            public void setMercator(MercatorBean Mercator) {
                this.Mercator = Mercator;
            }

            public OSMBean getOSM() {
                return OSM;
            }

            public void setOSM(OSMBean OSM) {
                this.OSM = OSM;
            }

            public UNM49Bean getUNM49() {
                return UNM49;
            }

            public void setUNM49(UNM49Bean UNM49) {
                this.UNM49 = UNM49;
            }

            public int getCallingcode() {
                return callingcode;
            }

            public void setCallingcode(int callingcode) {
                this.callingcode = callingcode;
            }

            public CurrencyBean getCurrency() {
                return currency;
            }

            public void setCurrency(CurrencyBean currency) {
                this.currency = currency;
            }

            public String getFlag() {
                return flag;
            }

            public void setFlag(String flag) {
                this.flag = flag;
            }

            public String getGeohash() {
                return geohash;
            }

            public void setGeohash(String geohash) {
                this.geohash = geohash;
            }

            public double getQibla() {
                return qibla;
            }

            public void setQibla(double qibla) {
                this.qibla = qibla;
            }

            public RoadinfoBean getRoadinfo() {
                return roadinfo;
            }

            public void setRoadinfo(RoadinfoBean roadinfo) {
                this.roadinfo = roadinfo;
            }

            public SunBean getSun() {
                return sun;
            }

            public void setSun(SunBean sun) {
                this.sun = sun;
            }

            public TimezoneBean getTimezone() {
                return timezone;
            }

            public void setTimezone(TimezoneBean timezone) {
                this.timezone = timezone;
            }

            public What3wordsBean getWhat3words() {
                return what3words;
            }

            public void setWhat3words(What3wordsBean what3words) {
                this.what3words = what3words;
            }

            public static class DMSBean {
                /**
                 * lat : 41° 0' 49.82400'' N
                 * lng : 28° 56' 58.77600'' E
                 */

                @SerializedName("lat")
                private String lat;
                @SerializedName("lng")
                private String lng;

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLng() {
                    return lng;
                }

                public void setLng(String lng) {
                    this.lng = lng;
                }
            }

            public static class MercatorBean {
                /**
                 * x : 3222661.41
                 * y : 4986336.325
                 */

                @SerializedName("x")
                private double x;
                @SerializedName("y")
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }

            public static class OSMBean {
                /**
                 * note_url : https://www.openstreetmap.org/note/new#map=17/41.01384/28.94966&layers=N
                 * url : https://www.openstreetmap.org/?mlat=41.01384&mlon=28.94966#map=17/41.01384/28.94966
                 */

                @SerializedName("note_url")
                private String noteUrl;
                @SerializedName("url")
                private String url;

                public String getNoteUrl() {
                    return noteUrl;
                }

                public void setNoteUrl(String noteUrl) {
                    this.noteUrl = noteUrl;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class UNM49Bean {
                /**
                 * regions : {"ASIA":"142","TR":"792","WESTERN_ASIA":"145","WORLD":"001"}
                 * statistical_groupings : ["LEDC"]
                 */

                @SerializedName("regions")
                private RegionsBean regions;
                @SerializedName("statistical_groupings")
                private List<String> statisticalGroupings;

                public RegionsBean getRegions() {
                    return regions;
                }

                public void setRegions(RegionsBean regions) {
                    this.regions = regions;
                }

                public List<String> getStatisticalGroupings() {
                    return statisticalGroupings;
                }

                public void setStatisticalGroupings(List<String> statisticalGroupings) {
                    this.statisticalGroupings = statisticalGroupings;
                }

                public static class RegionsBean {
                    /**
                     * ASIA : 142
                     * TR : 792
                     * WESTERN_ASIA : 145
                     * WORLD : 001
                     */

                    @SerializedName("ASIA")
                    private String ASIA;
                    @SerializedName("TR")
                    private String TR;
                    @SerializedName("WESTERN_ASIA")
                    private String WESTERNASIA;
                    @SerializedName("WORLD")
                    private String WORLD;

                    public String getASIA() {
                        return ASIA;
                    }

                    public void setASIA(String ASIA) {
                        this.ASIA = ASIA;
                    }

                    public String getTR() {
                        return TR;
                    }

                    public void setTR(String TR) {
                        this.TR = TR;
                    }

                    public String getWESTERNASIA() {
                        return WESTERNASIA;
                    }

                    public void setWESTERNASIA(String WESTERNASIA) {
                        this.WESTERNASIA = WESTERNASIA;
                    }

                    public String getWORLD() {
                        return WORLD;
                    }

                    public void setWORLD(String WORLD) {
                        this.WORLD = WORLD;
                    }
                }
            }

            public static class CurrencyBean {
                /**
                 * alternate_symbols : ["TL"]
                 * decimal_mark : ,
                 * html_entity : &#8378;
                 * iso_code : TRY
                 * iso_numeric : 949
                 * name : Turkish Lira
                 * smallest_denomination : 1
                 * subunit : kuruş
                 * subunit_to_unit : 100
                 * symbol : ₺
                 * symbol_first : 1
                 * thousands_separator : .
                 */

                @SerializedName("decimal_mark")
                private String decimalMark;
                @SerializedName("html_entity")
                private String htmlEntity;
                @SerializedName("iso_code")
                private String isoCode;
                @SerializedName("iso_numeric")
                private String isoNumeric;
                @SerializedName("name")
                private String name;
                @SerializedName("smallest_denomination")
                private int smallestDenomination;
                @SerializedName("subunit")
                private String subunit;
                @SerializedName("subunit_to_unit")
                private int subunitToUnit;
                @SerializedName("symbol")
                private String symbol;
                @SerializedName("symbol_first")
                private int symbolFirst;
                @SerializedName("thousands_separator")
                private String thousandsSeparator;
                @SerializedName("alternate_symbols")
                private List<String> alternateSymbols;

                public String getDecimalMark() {
                    return decimalMark;
                }

                public void setDecimalMark(String decimalMark) {
                    this.decimalMark = decimalMark;
                }

                public String getHtmlEntity() {
                    return htmlEntity;
                }

                public void setHtmlEntity(String htmlEntity) {
                    this.htmlEntity = htmlEntity;
                }

                public String getIsoCode() {
                    return isoCode;
                }

                public void setIsoCode(String isoCode) {
                    this.isoCode = isoCode;
                }

                public String getIsoNumeric() {
                    return isoNumeric;
                }

                public void setIsoNumeric(String isoNumeric) {
                    this.isoNumeric = isoNumeric;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getSmallestDenomination() {
                    return smallestDenomination;
                }

                public void setSmallestDenomination(int smallestDenomination) {
                    this.smallestDenomination = smallestDenomination;
                }

                public String getSubunit() {
                    return subunit;
                }

                public void setSubunit(String subunit) {
                    this.subunit = subunit;
                }

                public int getSubunitToUnit() {
                    return subunitToUnit;
                }

                public void setSubunitToUnit(int subunitToUnit) {
                    this.subunitToUnit = subunitToUnit;
                }

                public String getSymbol() {
                    return symbol;
                }

                public void setSymbol(String symbol) {
                    this.symbol = symbol;
                }

                public int getSymbolFirst() {
                    return symbolFirst;
                }

                public void setSymbolFirst(int symbolFirst) {
                    this.symbolFirst = symbolFirst;
                }

                public String getThousandsSeparator() {
                    return thousandsSeparator;
                }

                public void setThousandsSeparator(String thousandsSeparator) {
                    this.thousandsSeparator = thousandsSeparator;
                }

                public List<String> getAlternateSymbols() {
                    return alternateSymbols;
                }

                public void setAlternateSymbols(List<String> alternateSymbols) {
                    this.alternateSymbols = alternateSymbols;
                }
            }

            public static class RoadinfoBean {
                /**
                 * drive_on : right
                 * speed_in : km/h
                 */

                @SerializedName("drive_on")
                private String driveOn;
                @SerializedName("speed_in")
                private String speedIn;

                public String getDriveOn() {
                    return driveOn;
                }

                public void setDriveOn(String driveOn) {
                    this.driveOn = driveOn;
                }

                public String getSpeedIn() {
                    return speedIn;
                }

                public void setSpeedIn(String speedIn) {
                    this.speedIn = speedIn;
                }
            }

            public static class SunBean {
                /**
                 * rise : {"apparent":1597634220,"astronomical":1597628040,"civil":1597632480,"nautical":1597630320}
                 * set : {"apparent":1597683480,"astronomical":1597689660,"civil":1597685280,"nautical":1597687380}
                 */

                @SerializedName("rise")
                private RiseBean rise;
                @SerializedName("set")
                private SetBean set;

                public RiseBean getRise() {
                    return rise;
                }

                public void setRise(RiseBean rise) {
                    this.rise = rise;
                }

                public SetBean getSet() {
                    return set;
                }

                public void setSet(SetBean set) {
                    this.set = set;
                }

                public static class RiseBean {
                    /**
                     * apparent : 1597634220
                     * astronomical : 1597628040
                     * civil : 1597632480
                     * nautical : 1597630320
                     */

                    @SerializedName("apparent")
                    private int apparent;
                    @SerializedName("astronomical")
                    private int astronomical;
                    @SerializedName("civil")
                    private int civil;
                    @SerializedName("nautical")
                    private int nautical;

                    public int getApparent() {
                        return apparent;
                    }

                    public void setApparent(int apparent) {
                        this.apparent = apparent;
                    }

                    public int getAstronomical() {
                        return astronomical;
                    }

                    public void setAstronomical(int astronomical) {
                        this.astronomical = astronomical;
                    }

                    public int getCivil() {
                        return civil;
                    }

                    public void setCivil(int civil) {
                        this.civil = civil;
                    }

                    public int getNautical() {
                        return nautical;
                    }

                    public void setNautical(int nautical) {
                        this.nautical = nautical;
                    }
                }

                public static class SetBean {
                    /**
                     * apparent : 1597683480
                     * astronomical : 1597689660
                     * civil : 1597685280
                     * nautical : 1597687380
                     */

                    @SerializedName("apparent")
                    private int apparent;
                    @SerializedName("astronomical")
                    private int astronomical;
                    @SerializedName("civil")
                    private int civil;
                    @SerializedName("nautical")
                    private int nautical;

                    public int getApparent() {
                        return apparent;
                    }

                    public void setApparent(int apparent) {
                        this.apparent = apparent;
                    }

                    public int getAstronomical() {
                        return astronomical;
                    }

                    public void setAstronomical(int astronomical) {
                        this.astronomical = astronomical;
                    }

                    public int getCivil() {
                        return civil;
                    }

                    public void setCivil(int civil) {
                        this.civil = civil;
                    }

                    public int getNautical() {
                        return nautical;
                    }

                    public void setNautical(int nautical) {
                        this.nautical = nautical;
                    }
                }
            }

            public static class TimezoneBean {
                /**
                 * name : Europe/Istanbul
                 * now_in_dst : 0
                 * offset_sec : 10800
                 * offset_string : +0300
                 * short_name : +03
                 */

                @SerializedName("name")
                private String name;
                @SerializedName("now_in_dst")
                private int nowInDst;
                @SerializedName("offset_sec")
                private int offsetSec;
                @SerializedName("offset_string")
                private String offsetString;
                @SerializedName("short_name")
                private String shortName;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getNowInDst() {
                    return nowInDst;
                }

                public void setNowInDst(int nowInDst) {
                    this.nowInDst = nowInDst;
                }

                public int getOffsetSec() {
                    return offsetSec;
                }

                public void setOffsetSec(int offsetSec) {
                    this.offsetSec = offsetSec;
                }

                public String getOffsetString() {
                    return offsetString;
                }

                public void setOffsetString(String offsetString) {
                    this.offsetString = offsetString;
                }

                public String getShortName() {
                    return shortName;
                }

                public void setShortName(String shortName) {
                    this.shortName = shortName;
                }
            }

            public static class What3wordsBean {
                /**
                 * words : drift.resold.pack
                 */

                @SerializedName("words")
                private String words;

                public String getWords() {
                    return words;
                }

                public void setWords(String words) {
                    this.words = words;
                }
            }
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":41.205338,"lng":29.411833}
             * southwest : {"lat":40.784084,"lng":28.488001}
             */

            @SerializedName("northeast")
            private NortheastBean northeast;
            @SerializedName("southwest")
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 41.205338
                 * lng : 29.411833
                 */

                @SerializedName("lat")
                private double lat;
                @SerializedName("lng")
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 40.784084
                 * lng : 28.488001
                 */

                @SerializedName("lat")
                private double lat;
                @SerializedName("lng")
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class ComponentsBean {
            /**
             * ISO_3166-1_alpha-2 : TR
             * ISO_3166-1_alpha-3 : TUR
             * _category : place
             * _type : city
             * continent : Europe
             * country : Turkey
             * country_code : tr
             * state : Istanbul
             * town : Istanbul
             */

            @SerializedName("ISO_3166-1_alpha-2")
            private String ISO31661Alpha2;
            @SerializedName("ISO_3166-1_alpha-3")
            private String ISO31661Alpha3;
            @SerializedName("_category")
            private String category;
            @SerializedName("_type")
            private String type;
            @SerializedName("continent")
            private String continent;
            @SerializedName("country")
            private String country;
            @SerializedName("country_code")
            private String countryCode;
            @SerializedName("state")
            private String state;
            @SerializedName("town")
            private String town;

            public String getISO31661Alpha2() {
                return ISO31661Alpha2;
            }

            public void setISO31661Alpha2(String ISO31661Alpha2) {
                this.ISO31661Alpha2 = ISO31661Alpha2;
            }

            public String getISO31661Alpha3() {
                return ISO31661Alpha3;
            }

            public void setISO31661Alpha3(String ISO31661Alpha3) {
                this.ISO31661Alpha3 = ISO31661Alpha3;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getContinent() {
                return continent;
            }

            public void setContinent(String continent) {
                this.continent = continent;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getCountryCode() {
                return countryCode;
            }

            public void setCountryCode(String countryCode) {
                this.countryCode = countryCode;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getTown() {
                return town;
            }

            public void setTown(String town) {
                this.town = town;
            }
        }

        public static class GeometryBean {
            /**
             * lat : 41.01384
             * lng : 28.94966
             */

            @SerializedName("lat")
            private double lat;
            @SerializedName("lng")
            private double lng;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }
        }
    }
}
