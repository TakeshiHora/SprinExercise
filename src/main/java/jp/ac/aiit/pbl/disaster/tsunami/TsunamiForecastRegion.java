package jp.ac.aiit.pbl.disaster.tsunami;

import java.util.Arrays;

/**
 * This enum have definitions of TsunamiForecastRegion of Tsunami.
 * They are ID and Notification with Japanese.
 * this enum class provides methods to get a property and get a TsunamiForecastRegion of Tsunami
 * associated with the id.
 */

public enum TsunamiForecastRegion {
    
    HokkaidoPacificCoastEast(100, "北海道太平洋沿岸東部"),
    HokkaidoPacificCoastCentral(101, "北海道太平洋沿岸中部"),
    HokkaidoPacificCoastWest(102, "北海道太平洋沿岸西部"),
    HokkaidoJapanCoastNorth(110, "北海道日本海沿岸北部"),
    HokkaidoJapanCoastSouth(111, "北海道日本海沿岸南部"),
    OkhotskCoast(120, "オホーツク海沿岸"),
    HokkaidoPacificCoast(191, "北海道太平洋沿岸"),
    HokkaidoJapanCoast(192, "北海道日本海沿岸"),
    OkhotskCoast2(193, "オホーツク海沿岸"),
    AomoriJapanCoast(200, "青森県日本海沿岸"),
    AomoriPacificCoast(201, "青森県太平洋沿岸");
    
    private int code;
    private String regionName;
    
    private TsunamiForecastRegion(int code, String regionName){
        this.code = code;
        this.regionName = regionName;
    }
    public Integer getCode(){
        return this.code;
    }
    
    public static TsunamiForecastRegion getRegionName(int code){
        return Arrays.stream(TsunamiForecastRegion.values())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
