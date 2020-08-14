package jp.ac.aiit.pbl.disaster.earthquakeearlywarning;

import java.util.Arrays;
import java.util.HashMap;

/**
 * This enum have definitions of forecast regions of Earthquake Early Warning.
 * They are ID and name of Japanese region.
 * this enum class provides methods to get a property and get a Enum corresponding the id.
 */

public enum ForecastRegionEarthquakeEarlyWarning {
    HOKKAIDO_CENTRAL(1, "北海道道央"),
    HOKKAIDO_SOUTH(2, "北海道道南"),
    HOKKAIDO_NORTH(3, "北海道道北"),
    HOKKAIDO_EAST(4, "北海道道東"),
    AOMORI(5, "青森"),
    IWATE(6, "岩手"),
    MIYAGI(7, "宮城"),
    AKITA(8, "秋田"),
    YAMAGATA(9, "山形"),
    FUKUSHIMA(10, "福島"),
    IBARAKI(11, "茨城"),
    TOCHIGI(12, "栃木"),
    GUNMA(13, "群馬"),
    SAITAMA(14, "埼玉"),
    CHIBA(15, "千葉"),
    TOKYO(16, "東京"),
    IZU(17, "伊豆諸島"),
    OGASAWARA(18, "小笠原"),
    KANAGAWA(19, "神奈川"),
    NIIGATA(20, "新潟"),
    TOYAMA(21, "富山"),
    ISHIKAWA(22, "石川"),
    FUKUI(23, "福井"),
    YAMANASHI(24, "山梨"),
    NAGANO(25, "長野"),
    GIFU(26, "岐阜"),
    SHIZUOKA(27, "静岡"),
    AICHI(28, "愛知"),
    MIE(29, "三重"),
    SHIGA(30, "滋賀"),
    KYOTO(31, "京都"),
    OSAKA(32, "大阪"),
    HYOGO(33, "兵庫"),
    NARA(34, "奈良"),
    WAKAYAMA(35, "和歌山"),
    TOTTORI(36, "鳥取"),
    SHIMANE(37, "島根"),
    OKAYAMA(38, "岡山"),
    HIROSHIMA(39, "広島"),
    YAMAGUCHI(40, "山口"),
    TOKUSHIMA(41, "徳島"),
    KAGAWA(42, "香川"),
    EHIME(43, "愛媛"),
    KOCHI(44, "高知"),
    FUKUOKA(45, "福岡"),
    SAGA(46, "佐賀"),
    NAGASAKI(47, "長崎"),
    KUMAMOTO(48, "熊本"),
    OITA(49, "大分"),
    MIYAZAKI(50, "宮崎"),
    KAGOSHIMA(51, "鹿児島"),
    AMAMIISLANDS(52, "奄美(群島)"),
    OKINAWAISLAND(53, "沖縄本島"),
    DAITOISLAND(54, "大東島"),
    MIYAKOISLAND(55, "宮古島"),
    YAEYAMA(56, "八重山"),
    HOKKAIDO(57, "北海道"),
    TOHOKU(58, "東北"),
    KANTO(59, "関東"),
    IZUISLANDS(60, "伊豆諸島"),
    OGASAWARAISLANDS(61, "小笠原"),
    HOKURIKU(62, "北陸"),
    KOSHIN(63, "甲信"),
    TOKAI(64, "東海"),
    KINKI(65, "近畿"),
    CHUGOKU(66, "中国"),
    SHIKOKU(67, "四国"),
    KYUSHU(68, "九州"),
    AMAMI(69, "奄美(群島)"),
    OKINAWA(70, "沖縄"),
    OTHER(80, "その他の府県予報区および地方予報区_緊急地震速報(警報)");

    private Integer id;
    private String EarthquakeEarlyWarningRegionName;
    private static  HashMap<Integer, ForecastRegionEarthquakeEarlyWarning> FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_HASH_MAP;

    ForecastRegionEarthquakeEarlyWarning(Integer id, String EarthquakeEarlyWarningRegionName) {
        this.id = id;
        this.EarthquakeEarlyWarningRegionName = EarthquakeEarlyWarningRegionName;
    }

    static {
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_HASH_MAP = new HashMap<Integer, ForecastRegionEarthquakeEarlyWarning>();
        Arrays.stream(ForecastRegionEarthquakeEarlyWarning.values()).forEach(value ->
                FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_HASH_MAP.put(ForecastRegionEarthquakeEarlyWarning.valueOf(value.toString()).getId(), value));
    }

    public Integer getId() { return id; }

    public String getEarthquakeEarlyWarningRegionName() { return EarthquakeEarlyWarningRegionName; }

    public static ForecastRegionEarthquakeEarlyWarning get(int key) {
        return FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_HASH_MAP.get(key);
    }
}
