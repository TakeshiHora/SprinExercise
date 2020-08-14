package jp.ac.aiit.pbl.disaster.volcano;
import java.util.Arrays;
/**
 * Enum for Volcano Name, which is called from Volcano and Ash Fall.
 */
public enum VolcanoName {
    Shiretokoiozan(101,"知床硫黄山"),
    Rausudake(102,"羅臼岳"),
    Mashuu(103,"摩周"),
    Atosanupuri(104,"アトサヌプリ"),
    Meakandake(105,"雌阿寒岳"),
    Maruyama(106,"丸山"),
    Daisetsuzan(107,"大雪山"),
    Tokachidake(108,"十勝岳"),
    Tarumaeyama(109,"樽前山"),
    Eniwadake(110,"恵庭岳"),
    Kuttara(111,"倶多楽"),
    Usuzan(112,"有珠山"),
    Hokkaidokomagadake(113,"北海道駒ヶ岳"),
    Esan(114,"恵山"),
    Oshimaohshima(115,"渡島大島"),
    Rishirizan(116,"利尻山"),
    Youteizan(117,"羊蹄山"),
    Niseko(118,"ニセコ"),
    Naruko(211,"鳴子"),
    Zaouzan(212,"蔵王山"),
    Azumayama(213,"吾妻山"),
    Adatarayama(214,"安達太良山"),
    Bandaisan(215,"磐梯山"),
    Hiuchigadake(216,"燧ヶ岳"),
    Hiziori(217,"肘折"),
    Syoutaku(218,"沼沢"),
    Nasudake(301,"那須岳"),
    Nikkoushiranesan(302,"日光白根山"),
    Akagisan(303,"赤城山"),
    Harunasan(304,"榛名山"),
    Kusatsushiranesan(305,"草津白根山"),
    Asamayama(306,"浅間山"),
    Niigatayakeyama(307,"新潟焼山"),
    Myoukouzan(308,"妙高山"),
    Midagahara(309,"弥陀ヶ原"),
    Yakedake(310,"焼岳"),
    Akandanayama(335,"アカンダナ山"),
    Toshima(336,"利島"),
    Miurazima(337,"御蔵島"),
    Soufugan(338,"孀婦岩"),
    Kaikatakaizan(339,"海形海山"),
    Minaminiyoshikaizan(340,"南日吉海山"),
    Nikkoukaizan(341,"日光海山"),
    Nantaisan(342,"男体山"),
    Kusatsushiranesanshiranesan(350,"草津白根山(白根山(湯釜付近)"),
    KusatsushiranesanHonshiranesan(351,"草津白根山(本白根山)"),
    Sanbesan(401,"三瓶山"),
    Kuzyuusan(502,"九重山"),
    Asosan(503,"阿蘇山"),
    Unzendake(504,"雲仙岳"),
    Kirishimayama(505,"霧島山"),
    Sakurazima(506,"桜島"),
    Kaimonndake(507,"開聞岳"),
    Satsumaiouzima(508,"薩摩硫黄島"),
    Kuchinoerabuzima(509,"口永良部島"),
    Nakanoshima(510,"中之島"),
    Suwanosezima(511,"諏訪之瀬島"),
    Abukazangun(512,"阿武火山群"),
    Tsurumidakegarandake(513,"鶴見岳・伽藍岳"),
    Yufudake(514,"由布岳"),
    Fukuekazangun(515,"福江火山群"),
    Yonemarusumiyoshiike(516,"米丸・住吉池"),
    Wakamiko(517,"若尊"),
    Ikedayamagawa(518,"池田・山川"),
    Kuchinoshima(519,"口之島"),
    Kirishimayamaohachi(550,"霧島山(御鉢)"),
    Kirishimayashinmoedake(551,"霧島山(新燃岳)"),
    Kirichimayamaebinokougen(552,"霧島山(えびの高原(硫黄山)周辺)"),
    Ioutorishima(601,"硫黄鳥島"),
    Iriomotezimahokuhokuroukaiteikazan(602,"西表島北北東海底火山"),
    ActivevolcanoAll(900,"全国の活火山"),
    OtherActiveVolcano(901,"その他の活火山"),
    NewActiveVolcano(902,"新たな活火山"),
    Others(4000,"その他の火山");
    //NNNN*	火山(コード番号：NNNN)

    private Integer id;
    private String volcanoName;
    private VolcanoName(int id, String volcanoName){
        this.id  = id;
        this.volcanoName = volcanoName;
    }

    public Integer getId(){
        return id;
    }

    public static VolcanoName getById(int id){
        return Arrays.stream(VolcanoName.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
