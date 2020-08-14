package jp.ac.aiit.pbl.disaster.seismicIntensity;

import java.util.Arrays;

/**
 * This enum have definitions of SeismicIntensity.
 * They are ID and Notification with Japanese.
 * this enum class provides methods to get a property and get a SeismicIntensity
 * associated with the id.
 */

public enum Warning {
    
    SeismicIntensityLessThan4(1, "震度4未満"),
    SeismicIntensity4(2, "震度4"),
    SeismicIntensity5Lower(3, "震度5弱"),
    SeismicIntensityUpper5(4, "震度5強"),
    SeismicIntensity6Lower(5, "震度6弱"),
    SeismicIntensityUpper6(6, "震度6強"),
    SeismicIntensity7(7, "震度7");
    
    private int code;
    private String seismicIntensity;
    
    private Warning(int code, String seismicIntensity){
        this.code = code;
        this.seismicIntensity = seismicIntensity;
        
    }
    
    public String getSeismicIntensity() {
        return seismicIntensity;
    }
    
    public void setSeismicIntensity(String seismicIntensity) {
        this.seismicIntensity = seismicIntensity;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public Integer getCode(){
        return this.code;
    }
    
    public static Warning getSeismicIntensity(int code){
        return Arrays.stream(Warning.values())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
