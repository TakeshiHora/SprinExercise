package jp.ac.aiit.pbl.disaster.marine;
import java.util.Arrays;

/**
 * Enum for Warning Code of Marine
 */

public enum WarningCode {
    SeaAlertReleased(0,"海上警報解除"),
    SeaAIcingAlert(10,"海上着氷警報"),
    SeaDenceFog(11, "海上濃霧警報"),
    SeaSurgeAlert(12,"海上うねり警報"),
    SeaWindAlert(20,"海上風警報"),
    SeaStrongWindAlert(21,"海上強風警報 "),
    SeaStormAlert(22,"海上暴風警報"),
    SeeTyhoonAlert(23,"海上台風警報"),
    OtherSeeAlert(31,"その他の警報等情報要素_海上警報");

    private Integer id;
    private String warningCode;
    private WarningCode(int id, String warningCode){
        this.id  = id;
        this.warningCode = warningCode;
    }

    public Integer getId(){
        return id;
    }

    public static WarningCode getById(int id){
        return Arrays.stream(WarningCode.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
