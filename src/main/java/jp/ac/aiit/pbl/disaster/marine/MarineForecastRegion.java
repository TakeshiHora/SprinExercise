package jp.ac.aiit.pbl.disaster.marine;

import java.util.Arrays;

/**
 * Enum for Marine Forecast Region
 */

public enum MarineForecastRegion {
    NorthernJapaneseSeaSouthernOhootsukuSea(1000,"日本海北部及びオホーツク海南部"),
    SaharinEastSea(1010,"サハリン東方海上"),
    SaharinWestSea(1020,"サハリン西方海上"),
    AbashiriOki(1030,"網走沖"),
    SoyaKaikyo(1040,"宗谷海峡"),
    HokkaidoWestSea(1050,"北海道西方海上"),
    HokkaidoSouthernAndEastSea(1100,"北海道南方及び東方海上"),
    HokkaidoEastSea(1110,"北海道東方海上"),
    KurioOki(1120,"釧路沖"),
    HidakaOki(1130,"日高沖"),
    TsugaruKaikyo(1140,"津軽海峡"),
    HiyamaTsugaruOki(1150,"檜山津軽沖"),
    SanrikuOki(2000,"三陸沖"),
    SanrikuOkiEast(2010,"三陸沖東部"),
    SanrikuOkiWest(2020,"三陸沖西部"),
    KantoKaiiki(3000,"関東海域"),
    KantoKaiikiNoth(3010,"関東海域北部"),
    KantoKaiikiSouth(3020,"関東海域南部"),
    NionkaiTyuubu(3100,"日本海中部"),
    EnkaiSyuuSouth(3110,"沿海州南部沖"),
    AkitaOki(3120,"秋田沖"),
    SadoOki(3130,"佐渡沖"),
    NotoOki(3140,"能登沖"),
    TokaiKaiiki(3200,"東海海域"),
    TokaikaiikiEast(3210,"東海海域東部"),
    TokaikaiikiWest(3220,"東海海域西部"),
    TokaikaiikiSouth(3230,"東海海域南部"),
    SkokuOkiSetonaiKai(4000,"四国沖及び瀬戸内海"),
    SetonaiKai(4010,"瀬戸内海"),
    ShikokuOkiNorth(4020,"四国沖北部"),
    ShikokuOkiSouth(4030,"四国沖南部"),
    NihonKaiWest(4100,"日本海西部"),
    NihonKaiNorthernWest(4110,"日本海北西部"),
    SaninOkiEastWakasaWanNearBy(4120,"山陰沖東部及び若狭湾付近"),
    SaninOkiEast(4130,"山陰沖西部"),
    TsushimaKaikyo(5000,"対馬海峡"),
    KyusyuWesternSea(5100,"九州西方海上"),
    ChejiTouWestSea(5110 ,"済州島西海上"),
    NagasakiWestSea(5120,"長崎西海上"),
    MenShimaSouthernWestSea(5130,"女島南西海上"),
    KyusyuSouthernSeaHyugaNada(5200,"九州南方海上及び日向灘"),
    HyugaNada(5210,"日向灘"),
    KagoshimaKaiiki(5220,"鹿児島海域"),
    AmaniKaiiki(5230,"奄美海域"),
    OkinawaKaiiki(6000,"沖縄海域"),
    HigashishinaKaiSouth(6010,"東シナ海南部"),
    OkinawaEastSea(6020,"沖縄東方海上"),
    OkinawaSouthernSea(6030,"沖縄南方海上"),
    Others(10000,"その他の地方海上予報区");
 //NNNN* 地方海上予報区(コード番号：NNNN

    private Integer id;
    private String marineForecastRegion;
    private MarineForecastRegion(int id, String marineForecastRegion){
        this.id  = id;
        this.marineForecastRegion = marineForecastRegion;
    }

    public Integer getId(){
        return id;
    }

    public static MarineForecastRegion getById(int id){
        return Arrays.stream(MarineForecastRegion.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
