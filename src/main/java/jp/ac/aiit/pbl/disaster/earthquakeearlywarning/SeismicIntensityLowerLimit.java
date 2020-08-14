package jp.ac.aiit.pbl.disaster.earthquakeearlywarning;

import java.util.Arrays;

/**
 * This enum have definitions of Seismic Intensity Lower-Limit.
 * They are ID and Japanese name of Seismic Intensity.
 * this enum class provides methods to get a property and get a seismicIntensityName corresponding the id.
 */

public enum SeismicIntensityLowerLimit {
    ZERO(1, "震度0"),
    ONE(2, "震度1"),
    TWO(3, "震度2"),
    THREE(4, "震度3"),
    FOUR(5, "震度4"),
    FIVE_LOWER(6, "震度5弱"),
    FIVE_UPPER(7, "震度5強"),
    SIX_LOWER(8, "震度6弱"),
    SIX_UPPER(9, "震度6強"),
    SEVEN(10, "震度7"),
    NONE(14, "なし"),
    UNKNOWN(15, "不明");

    private Integer id;
    private String seismicIntensityName;

    SeismicIntensityLowerLimit(int id, String seismicIntensityName) {
        this.id = id;
        this.seismicIntensityName = seismicIntensityName;
    }

    public Integer getId() { return id; }

    public String getSeismicIntensityName() { return seismicIntensityName; }

    public static SeismicIntensityLowerLimit getById(int id){
        return Arrays.stream(SeismicIntensityLowerLimit.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
