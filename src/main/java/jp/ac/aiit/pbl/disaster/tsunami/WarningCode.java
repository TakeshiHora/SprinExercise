package jp.ac.aiit.pbl.disaster.tsunami;

import java.util.Arrays;

/**
 * This enum have definitions of Prefecture of SeismicIntensity.
 * They are ID and Notification with Japanese.
 * this enum class provides methods to get a property and get a Prefecture of SeismicIntensity
 * associated with the id.
 */

public enum WarningCode {
    
    NoTsunami(1, "津波なし"),
    AlarmRelease(2, "警報解除"),
    TsunamiWarning(3, "津波警報"),
    BigTsunamiWarning(4, "大津波警報"),
    BigTsunamiWarningAnnouncement(5, "大津波警報:発表"),
    OtherAlarms(15, "その他の警報");
    
    private int code;
    private String alarmType;
    
    private WarningCode(int code, String alarmType){
        this.code = code;
        this.alarmType = alarmType;
    }
    public Integer getCode(){
        return this.code;
    }
    public static WarningCode getTsunamiAlarmType(int code){
        return Arrays.stream(WarningCode.values())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
