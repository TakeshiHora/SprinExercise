package jp.ac.aiit.pbl.disaster.weather;

import jp.ac.aiit.pbl.disaster.DisasterSubcategory;

public class WeatherSubcategoryAndRegion {
    private DisasterSubcategory disasterSubcategory;
    private   PrefecturalForecastRegion prefecturalForecastRegion;

    WeatherSubcategoryAndRegion(int disasterSubcategoryId, int prefecturalForecastRegionId) {
        this.disasterSubcategory = DisasterSubcategory.get(disasterSubcategoryId);
        this.prefecturalForecastRegion = PrefecturalForecastRegion.get(prefecturalForecastRegionId);
    }

    public DisasterSubcategory getDisasterSubcategory() {
        return disasterSubcategory;
    }
    public PrefecturalForecastRegion getPrefecturalForecastRegion() {
        return prefecturalForecastRegion;
    }
}
