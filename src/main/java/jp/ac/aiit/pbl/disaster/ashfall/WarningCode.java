package jp.ac.aiit.pbl.disaster.ashfall;
import java.util.Arrays;

/**
 * Enum for Warning Code of AshFall.
 */
public enum WarningCode {

        SmallAshFall(1,"少量の降灰"),
        MediumAshFall(2,"やや多量の降灰"),
        LargeAshFall(3, "多量の降灰"),
        SmallMeteoriteFall(4,"小さな噴石の落下"),
        Others(7,"その他の防災気象情報要素 2");

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
