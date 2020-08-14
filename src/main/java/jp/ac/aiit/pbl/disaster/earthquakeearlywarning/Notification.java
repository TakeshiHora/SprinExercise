package jp.ac.aiit.pbl.disaster.earthquakeearlywarning;

import java.util.Arrays;

/**
 * This enum have definitions of Notification on Disaster Prevention.
 * They are ID and Notifications with Japanese.
 * this enum class provides methods to get a property and get a Notification associated with the id.
 */

public enum Notification {
    
    Notification0(0, "なし"),
    Notification101(101, "今後若干の海面変動があるかもしれません。"),
    Notification102(102, "今後若干の海面変動があるかもしれませんが、被害の心配はありません。"),
    Notification103(103, "今後もしばらく海面変動が続くと思われます。"),
    Notification104(104, "今後もしばらく海面変動が続くと思われますので、海水浴や磯釣り等を行う際は注意してください。"),
    Notification105(105, "今後もしばらく海面変動が続くと思われますので、磯釣り等を行う際は注意してください。"),
    Notification107(107, "現在、大津波警報・津波警報・津波注意報を発表している沿岸はありません。"),
    Notification109(109, "津波と満潮が重なると、津波はより高くなりますので一層厳重な警戒が必要です。"),
    Notification110(110, "津波と満潮が重なると、津波はより高くなりますので十分な注意が必要です。"),
    Notification111(111, "場所によっては、観測した津波の高さよりさらに大きな津波が到達しているおそ れがあります。"),
    Notification112(112, "今後、津波の高さは更に高くなることも考えられます。"),
    Notification113(113, "沖合での観測値をもとに津波が推定されている沿岸では、早いところでは、既に 津波が到達していると推定されます。"),
    Notification114(114, "津波による潮位変化が観測されてから最大波が観測されるまでに数時間以上か かることがあります。"),
    Notification115(115, "沖合での観測値であり、沿岸では津波はさらに高くなります。"),
    Notification121(121, "<大津波警報>大きな津波が襲い甚大な被害が発生します。沿岸部や川沿いにいる人はただちに高台や避難ビルなど安全な場所へ避難してください。" +
                            "津波は繰り返し襲ってきます。警報が解除されるまで安全な場所から離れないでください。"),
    Notification122(122, "<津波警報>津波による被害が発生します。沿岸部や川沿いにいる人はただちに高台や避難ビルなど安全な場所へ避難してください。" +
            "津波は繰り返し襲ってきます。警報が解除されるまで安全な場所から離れないでください。"),
    Notification123(123, "＜津波注意報＞海の中や海岸付近は危険です。海の中にいる人はただちに海から上がって、海岸から離れてください。" +
            "潮の流れが速い状態が続きますので、注意報が解除されるまで海に入ったり海岸に近づいたりしないようにしてください。"),
    Notification124(124, "＜津波予報(若干の海面変動)＞若干の海面変動が予想されますが、被害の心配はありません。"),
    Notification131(131, "警報が発表された沿岸部や川沿いにいる人はただちに高台や避難ビルなど安全な場所へ避難してください。" +
            "到達予想時刻は、予報区のなかで最も早く津波が到達する時刻です。" +
            "場所によっては、この時刻よりもかなり遅れて津波が襲ってくることがあります。到達予想時刻から津波が最も高くなるまでに数時間以上かかることがありますので、" +
            "観測された津波の高さにかかわらず、警報が解除されるまで安全な場所から離れないでください。"),
    Notification132(132, "場所によっては津波の高さが「予想される津波の高さ」より高くなる可能性があります。"),
    Notification141(141, "東日本大震災クラスの津波が来襲します。"),
    Notification142(142, "沖合で高い津波を観測したため大津波警報・津波警報に切り替えました。"),
    Notification143(143, "沖合で高い津波を観測したため大津波警報・津波警報を切り替えました。"),
    Notification144(144, "沖合で高い津波を観測したため大津波警報に切り替えました。"),
    Notification145(145, "沖合で高い津波を観測したため大津波警報を切り替えました。"),
    Notification146(146, "沖合で高い津波を観測したため津波警報に切り替えました。"),
    Notification147(147, "沖合で高い津波を観測したため津波警報を切り替えました。"),
    Notification148(148, "沖合で高い津波を観測したため予想される津波の高さを切り替えました。"),
    Notification149(149, "ただちに避難してください。"),
    Notification201(201, "強い揺れに警戒してください。"),
    Notification211(211, "津波警報等(大津波警報・津波警報あるいは津波注意報)を発表中です。"),
    Notification212(212, "この地震により、日本の沿岸では若干の海面変動があるかもしれませんが、被害の心配はありません。"),
    Notification213(213, "今後もしばらく海面変動が続くと思われますので、海水浴や磯釣り等を行う際は注意してください。"),
    Notification214(214, "今後もしばらく海面変動が続くと思われますので、磯釣り等を行う際は注意してください。"),
    Notification215(215, "この地震による津波の心配はありません。"),
    Notification216(216, "震源が海底の場合、津波が発生するおそれがあります。"),
    Notification217(217, "今後の情報に注意してください。"),
    Notification221(221, "太平洋の広域に津波発生の可能性があります。"),
    Notification222(222, "太平洋で津波発生の可能性があります。"),
    Notification223(223, "北西太平洋で津波発生の可能性があります。"),
    Notification224(224, "インド洋の広域に津波発生の可能性があります。"),
    Notification225(225, "インド洋で津波発生の可能性があります。"),
    Notification226(226, "震源の近傍で津波発生の可能性があります。"),
    Notification227(227, "震源の近傍で小さな津波発生の可能性がありますが、被害をもたらす津波の心配はありません。"),
    Notification228(228, "一般的に、この規模の地震が海域の浅い領域で発生すると、津波が発生することがあります。"),
    Notification229(229, "日本への津波の有無については現在調査中です。"),
    Notification230(230, "この地震による日本への津波の影響はありません。"),
    Notification241(241, "この地震について、緊急地震速報を発表しています。"),
    Notification242(242, "この地震について、緊急地震速報を発表しています。この地震の最大震度は2でした。"),
    Notification243(243, "この地震について、緊急地震速報を発表しています。この地震の最大震度は1でした。"),
    Notification244(244, "この地震について、緊急地震速報を発表しています。この地震で震度1以上は観測されていません。"),
    Notification245(245, "この地震で緊急地震速報を発表しましたが、強い揺れは観測されませんでした。"),
    Notification256(256, "震源要素を訂正します。"),
    Notification500(500, "その他の防災上の留意事項");
    //NN*	警報(コード番号：NN)
    
    
    private int code;
    private String notificationContent;
    
    private Notification(int code, String notificationContent){
        this.code = code;
        this.notificationContent = notificationContent;
    }
    
    public Integer getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }
    
    public static Notification getNotificationContent(int code){
        return Arrays.stream(Notification.values())
                .filter(data -> data.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
