package jp.ac.aiit.pbl.disaster.weather;

import java.util.Arrays;
import java.util.HashMap;

    public enum PrefecturalForecastRegion {
    SOUYACHIHO(11000, "宗谷地方"),
    KAMIKAWA_RUMOICHIHO(12000, "上川・留萌地方"),
    KAMIKAWACHIHO(12010, "上川地方"),
    RUMOICHIHO(12020, "留萌地方"),
    ABASIRI_KITAMI_MOMBETSUCHIHO(13000, "網走・北見・紋別地方"),
    NEMUROCHIHO(14010, "根室地方"),
    KUSHIROCHIHO(14020, "釧路地方"),
    TOKACHICHIHO(14030, "十勝地方"),
    KUSHIRO_NEMUROCHIHO(14100, "釧路・根室地方"),
    IBURI_HIDAKACHIHO(15000, "胆振・日高地方"),
    IBURICHIHO(15010, "胆振地方"),
    HIDAKACHIHO(15020, "日高地方"),
    ISHIKARI_SORACHI_SHIRIBESHICHIHO(16000, "石狩・空知・後志地方"),
    ISHIKARICHIHO(16010, "石狩地方"),
    SORACHICHIHO(16020, "空知地方"),
    SHIRIBESHICHIHO(16030, "後志地方"),
    ISHIKARI_SORACHICHIHO(16100, "石狩・空知地方"),
    OSHIMA_HIYAMACHIHO(17000, "渡島・檜山地方"),
    OSHIMACHIHO(17010, "渡島地方"),
    HIYAMACHIHO(17020, "檜山地方"),
    AOMORIKEN(20000, "青森県"),
    IWATEKEN(30000, "岩手県"),
    MIYAGIKEN(40000, "宮城県"),
    AKITAKEN(50000, "秋田県"),
    YAMAGATAKEN(60000, "山形県"),
    FUKUSHIMAKEN(70000, "福島県"),
    IBARAKIKEN(80000, "茨城県"),
    TOCHIGIKEN(90000, "栃木県"),
    GUNMAKEN(100000, "群馬県"),
    SAITAMAKEN(110000, "埼玉県"),
    CHIBAKEN(120000, "千葉県"),
    TOKYOTO(130000, "東京都"),
    TOKYOCHIHO(130010, "東京地方"),
    IZUISLANDS_HOKUBU(130020, "伊豆諸島北部"),
    IZUISLANDS_NANBU(130030, "伊豆諸島南部"),
    KANAGAWAKEN(140000, "神奈川県"),
    NIIGATAKEN(150000, "新潟県"),
    TOYAMAKEN(160000, "富山県"),
    ISHIKAWAKEN(170000, "石川県"),
    FUKUIKEN(180000, "福井県"),
    YAMANASHIKEN(190000, "山梨県"),
    NAGANOKEN(200000, "長野県"),
    GIFUKEN(210000, "岐阜県"),
    SHIZUOKAKEN(220000, "静岡県"),
    AICHIKEN(230000, "愛知県"),
    MIEKEN(240000, "三重県"),
    SHIGAKEN(250000, "滋賀県"),
    KYOTOHU(260000, "京都府"),
    OSAKAHU(270000, "大阪府"),
    HYOGOKEN(280000, "兵庫県"),
    NARAKEN(290000, "奈良県"),
    WAKAYAMAKEN(300000, "和歌山県"),
    TOTTORIKEN(310000, "鳥取県"),
    SHIMANEKEN(320000, "島根県"),
    OKAYAMAKEN(330000, "岡山県"),
    HIROSHIMAKEN(340000, "広島県"),
    YAMAGUCHIKEN(350000, "山口県"),
    TOKUSHIMAKEN(360000, "徳島県"),
    KAGAWAKEN(370000, "香川県"),
    EHIMEKEN(380000, "愛媛県"),
    KOCHIKEN(390000, "高知県"),
    FUKUOKAKEN(400000, "福岡県"),
    SAGAKEN(410000, "佐賀県"),
    NAGASAKIKEN(420000, "長崎県"),
    KUMAMOTOKEN(430000, "熊本県"),
    OITAKEN(440000, "大分県"),
    MIYAZAKIKEN(450000, "宮崎県"),
    KAGOSHIMAKEN(460000, "鹿児島県"),
    AMAMICHIHO(460040, "奄美地方"),
    KAGOSHIMAKEN_AMAMICHIHONOZOKU(460100, "鹿児島県(奄美地方除く)"),
    OKINAWAHONTOCHIHO(471000, "沖縄本島地方"),
    DAITOZIMACHIHO(472000, "大東島地方"),
    MIYAKOCHIHO(473000, "宮古島地方"),
    YAEYAMACHIHO(474000, "八重山地方"),
    OTHERS(500000, "その他の府県予報区");

    private int id;
    private String prefecturalForecastRegionName;
    private static HashMap<Integer, PrefecturalForecastRegion> PREFECTURAL_FORECAST_REGION_HASH_MAP;

    PrefecturalForecastRegion(int id, String region) {
        this.id = id;
        this.prefecturalForecastRegionName = region;
    }

    static {
        PREFECTURAL_FORECAST_REGION_HASH_MAP = new HashMap<Integer, PrefecturalForecastRegion>();
        Arrays.stream(PrefecturalForecastRegion.values()).forEach(value ->
                PREFECTURAL_FORECAST_REGION_HASH_MAP.put(PrefecturalForecastRegion.valueOf(value.toString()).getId(), value));
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return prefecturalForecastRegionName;
    }

    public static PrefecturalForecastRegion get(int key) {
        return PREFECTURAL_FORECAST_REGION_HASH_MAP.get(key);
    }

}