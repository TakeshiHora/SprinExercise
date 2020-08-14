package jp.ac.aiit.pbl.disaster.tsunami;

import java.util.Arrays;

/**
 * This enum have definitions of TsunamiHeight of Tsunami.
 * They are ID and Notification with Japanese.
 * this enum class provides methods to get a property and get a TsunamiHeight of Tsunami
 * associated with the id.
 */

public enum TsunamiHeight {
    
    HeightLessThan2m(1, "0.2m 未満"),
    Height1m(2, "1m"),
    Height3m(3, "3m"),
    Height5m(4, "5m"),
    Height10m(5, "10m"),
    HeightOver10m(6, "10m超"),
    HeightUnknown(14, "不明"),
    OtherTsunamiHeights(15, "その他の津波の高さ");
    
    private int code;
    private String tsunamiHeight;
    
    private TsunamiHeight(int code, String tsunamiHeight){
        this.code = code;
        this.tsunamiHeight = tsunamiHeight;
    }
    
    public Integer getCode(){
        return this.code;
    }
    
    public static TsunamiHeight getTsunamiHeight(int code){
        return Arrays.stream(TsunamiHeight.values())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
