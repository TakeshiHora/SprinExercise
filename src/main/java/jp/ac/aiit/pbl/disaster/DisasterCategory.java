package jp.ac.aiit.pbl.disaster;

import java.util.Arrays;

public enum DisasterCategory {

    EarthquakeEarlyWarning(1,"Earthquake Early Warning"),
    Hypocenter(2,"Hypocenter"),
    SeismicIntensity(3,"Seismic Intensity"),
    NankaiTroughEarthquake(4,"Nankai Trough Earthquake"),
    Tsunami(5,"Tsunami"),
    NorthwestPacificTsunami(6,"Northwest Pacific Tsunami"),
    Volcano(8,"Northwest Pacific Tsunami"),
    AshFall(9,"AshFall"),
    Weather(10,"Weather"),
    Flood(11,"Flood"),
    Typhoon(12,"Typhoon"),
    Marine(14,"Marine");

    private Integer id;

    private String disasterCategoryName;

    public Integer getId(){
        return id;
    }

    private DisasterCategory(int id, String name){
        this.id = id;
        this.disasterCategoryName = name;
    }

    public static DisasterCategory getById(int id){
        return Arrays.stream(DisasterCategory.values())
                  .filter(data -> data.getId().equals(id))
                  .findFirst()
                  .orElse(null);
    }
}
