package jp.ac.aiit.pbl.disaster.flood;

/**
 * This class has a WarningLevel property and a FloodForecastRegion property.
 * Flood class has this class as property without holding WarningLevel property and FloodForecastRegion property.
 */

public class FloodWarningLevelAndForecastRegion {
    private WarningLevel warningLevel;
    private FloodForecastRegion floodForecastRegion;

    FloodWarningLevelAndForecastRegion(int warningLevel, Long floodForecastRegion) {
        this.warningLevel = WarningLevel.getById(warningLevel);
        this.floodForecastRegion = FloodForecastRegion.get(floodForecastRegion);
    }

    public WarningLevel getWarningLevel() {
        return warningLevel;
    }

    public FloodForecastRegion getFloodForecastRegion() {
        return floodForecastRegion;
    }
}
