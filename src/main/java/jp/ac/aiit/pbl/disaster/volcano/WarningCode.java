package jp.ac.aiit.pbl.disaster.volcano;
import java.util.Arrays;

/**
 * Enum for Warning Code of Volcano
 */
public enum WarningCode {
    EruptionWarning(1,"噴火警報"),
    CraterWarning(2,"火口周辺警報"),
    EruptionWarningOcean(3, "噴火警報(周辺海域)"),
    EruptionForecastWarningRelease(4,"噴火予報：警報解除"),
    EruptionForecast(5,"噴火予報"),
    Level1(11,"レベル 1(活火山であることに留意)"),
    Level2(12,"レベル 2(火口周辺規制)"),
    Level3(13,"レベル 3(入山規制)"),
    Level4(14,"レベル 4(避難準備)"),
    Level5(15,"レベル 5(避難)"),
    ActiveVolcano(21,"活火山であることに留意"),
    CraterInDanger(22,"火口周辺危険"),
    EntryInDanger( 23,"入山危険"),
    MountainDustCaution( 24,"山麓厳重警戒"),
    ResidentialAreaCaution(25,"居住地域厳重警戒"),
    OceanWarningEruption(31,"海上警報(噴火警報)"),
    OceanWarningRelease(32,"海上警報(噴火警報解除"),
    OceanForecastEruptionForecast(33,"海上予報(噴火予報)"),
    ActiveVolcanoUnderWater(35,"活火山であることに留意(海底火山)"),
    OceanSurroundingAreaCaution(36,"周辺海域警戒"),
    EruptionWarningEvacuation(41,"噴火警報：避難等"),
    EruptionWarningEntryRestriction(  42,"噴火警報：入山規制等"),
    CraterWarningEntryRestriction(43,"火口周辺警報：入山規制等"),
    EruptionWarningSurroundingAreaOceanCaution(44,"噴火警報(周辺海域)：周辺海域警戒"),
    AttentionActiveVolcano(45,"活火山であることに留意"),
    EruptionWarningResidenceAreaStrictCaution(46,"噴火警報：当該居住地域厳重警戒"),
    EruptionWarningMountainDustStrictCaution(47," 噴火警報：当該山麓厳重警戒"),
    EruptionWarningCraterCaution(48,"噴火警報：火口周辺警戒"),
    CraterWarningCraterCaution(49,"火口周辺警報：火口周辺警戒"),
    Explosion(51,"爆発"),
    Eruption( 52,"噴火"),
    ExplosionInitiation(53,"噴火開始"),
    ContinuousEruptionOngoing(54,"連続噴火継続"),
    ContinuousEruptionPause( 55,"連続噴火停止"),
    FrequentEruption(56,"噴火多発"),
    SeemsExplosion( 61,"爆発したもよう"),
    SeemsEruption (62,"噴火したもよう"),
    SeeomsEruptionInitiation(63,"噴火開始したもよう"),
    SeemsContinuousEruptionOngoing(64,"連続噴火が継続しているもよう"),
    SeemsontinuousEruptionPause(65,	"連続噴火は停止したもよう"),
    Unknown(91,"不明"),
    OthersPhenomenon(99,"その他の現象"),
    OthersDisasterInformation(127,"その他の防災気象情報要素");

//    NNN*	防災気象情報要素(コード番号：NNN)

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
