package jp.ac.aiit.pbl.disaster.flood;

import jp.ac.aiit.pbl.disaster.earthquakeearlywarning.ForecastRegionEarthquakeEarlyWarning;

import java.util.Arrays;
import java.util.HashMap;

/**
 * This enum have definitions of Flood Forecast Region.
 * They are ID and name of japanese region.
 * This enum class provides methods to get a property and get a Enum corresponding the id.
 */

public enum FloodForecastRegion {
    SHINKAWA("10175000100", "新川(北海道道央)"),
    HOKKAIDO_OTHER("19999999999", "北海道のその他の河川"),
    TSUTSUMIGAWA("20036000100", "堤川・駒込川(青森県)"),
    AOMORI_OTHER("29999999999", "青森県のその他の河川"),
    IWATE_OTHER("39999999999", "岩手県のその他の河川"),
    NANAKITAGAWA("40028000100", "七北田川(宮城県)"),
    MIYAGI_OTHER("49999999999", "宮城県のその他の河川"),
    AKITA_OTHER("59999999999", "秋田県のその他の河川"),
    NIKKOGAWA("60016000100", "日向川(山形県)"),
    YAMAGATA_OTHER("69999999999", "山形県のその他の河川"),
    UDAGAWA("70006000100", "宇多川(福島県)");

    private Long id;
    private String floodForecastRegionName;
    private static HashMap<Long, FloodForecastRegion> FLOOD_FORECAST_REGION_HASH_MAP;

    FloodForecastRegion(final String id, final String floodForecastRegionName) {
        this.id = Long.parseLong(id);
        this.floodForecastRegionName = floodForecastRegionName;
    }

    static {
        FLOOD_FORECAST_REGION_HASH_MAP = new HashMap<Long, FloodForecastRegion>();
        Arrays.stream(FloodForecastRegion.values()).forEach(value ->
                FLOOD_FORECAST_REGION_HASH_MAP.put(FloodForecastRegion.valueOf(value.toString()).getId(), value));
    }

    public Long getId() {
        return id;
    }

    public String getFloodForecastRegionName() {
        return floodForecastRegionName;
    }

    public static FloodForecastRegion get(Long key) {
        return FLOOD_FORECAST_REGION_HASH_MAP.get(key);
    }
}
