package jp.ac.aiit.pbl.disaster.flood;

import jp.ac.aiit.pbl.disaster.earthquakeearlywarning.SeismicIntensityLowerLimit;

import java.util.Arrays;

/**
 * This enum have definitions of Flood Warning Level.
 * They are ID and name of Japanese Warning Level.
 * This enum class provides methods to get a property and get a Enum corresponding the id.
 */

public enum WarningLevel {
    LEVEL1(1, "警報解除"),
    LEVEL2(2, "氾濫警戒情報"),
    LEVEL3(3, "氾濫危険情報"),
    LEVEL4(4, "氾濫発生情報"),
    OTHER(15, "その他の警戒レベル");

    private Integer id;
    private String warningLevelName;

    WarningLevel(int id, String warningLevelName) {
        this.id = id;
        this.warningLevelName = warningLevelName;
    }

    public Integer getId() {
        return id;
    }

    public String getWarningLevelName() {
        return warningLevelName;
    }

    public static WarningLevel getById(int id){
        return Arrays.stream(WarningLevel.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
