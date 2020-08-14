package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import java.util.Arrays;

/**
 * Enumeration for CoastalRegion.
 */
public enum CoastalRegion {
    CoastalRegion1(1,"Ust-Kamchatsk (East Coasts of Kamchatka Peninsula)"),
    CoastalRegion2(2,"Petropavlovsk-K (East Coasts of Kamchatka Peninsula)"),
    CoastalRegion3(3,"Severo Kurilsk (Kuril Islands)"),
    CoastalRegion4(4,"Urup Islands (Kuril Islands)"),
    CoastalRegion5(5,"Busan (South Coasts of Korean Peninsula)"),
    CoastalRegion6(6,"Nohwa (South Coasts of Korean Peninsula)"),
    CoastalRegion7(7,"Seogwipo (South Coasts of Korean Peninsula)"),
    CoastalRegion8(8,"Hualien (Taiwan)"),
    CoastalRegion9(9,"Basco (East Coasts of Philippines)"),
    CoastalRegion10(10,"Palanan (East Coasts of Philippines)"),
    CoastalRegion11(11,"Legaspi (East Coasts of Philippines)"),
    CoastalRegion12(12,"Laoang (East Coasts of Philippines)"),
    CoastalRegion13(13,"Madrid (East Coasts of Philippines)"),
    CoastalRegion14(14,"Davao (East Coasts of Philippines)"),
    CoastalRegion15(15,"Berebere (North Coasts of Irian Jaya)"),
    CoastalRegion16(16,"Patani (North Coasts of Irian Jaya)"),
    CoastalRegion17(17,"Sorong (North Coasts of Irian Jaya)"),
    CoastalRegion18(18,"Manokwari (North Coasts of Irian Jaya)"),
    CoastalRegion19(19,"Warsa (North Coasts of Irian Jaya)"),
    CoastalRegion20(20,"Jayapura (North Coasts of Irian Jaya)"),
    CoastalRegion21(21,"Vanimo (North Coasts of Papua New Guinea)"),
    CoastalRegion22(22,"Wewak (North Coasts of Papua New Guinea)"),
    CoastalRegion23(23,"Madang (North Coasts of Papua New Guinea)"),
    CoastalRegion24(24,"Manus Islands (North Coasts of Papua New Guinea)"),
    CoastalRegion25(25,"Rabaul (North Coasts of Papua New Guinea)"),
    CoastalRegion26(26,"Kavieng (North Coasts of Papua New Guinea)"),
    CoastalRegion27(27,"Kimbe (North Coasts of Papua New Guinea)"),
    CoastalRegion28(28,"Kieta (North Coasts of Papua New Guinea)"),
    CoastalRegion29(29,"Guam (Mariana Islands)"),
    CoastalRegion30(30,"Saipan (Mariana Islands)"),
    CoastalRegion31(31,"Malakal (Palau)"),
    CoastalRegion32(32,"Yap Island (Micronesia)"),
    CoastalRegion33(33,"Chuuk Island (Micronesia)"),
    CoastalRegion34(34,"Pohnpei Island (Micronesia)"),
    CoastalRegion35(35,"Kosrae Island (Micronesia)"),
    CoastalRegion36(36,"Eniwetok Island (Marshall Islands)"),
    CoastalRegion37(37,"Panggoe (North Coasts of Solomon Islands)"),
    CoastalRegion38(38,"Auki (North Coasts of Solomon Islands)"),
    CoastalRegion39(39,"Kirakira (North Coasts of Solomon Islands)"),
    CoastalRegion40(40,"Munda (Solomon Sea)"),
    CoastalRegion41(41,"Honiara (Solomon Sea)"),
    CoastalRegion42(42,"Hong Kong (Coasts of South China Sea)"),
    CoastalRegion43(43,"Sanya (Coasts of South China Sea)"),
    CoastalRegion44(44,"Vinh (Coasts of Gulf of Tonkin)"),
    CoastalRegion45(45,"Qui Nhon (East Coasts of Indochina Peninsula)"),
    CoastalRegion46(46,"Bac Lieu (East Coasts of Indochina Peninsula)"),
    CoastalRegion47(47,"Prachuap Khiri Khan (Gulf of Thailand)"),
    CoastalRegion48(48,"Sihanoukville (Gulf of Thailand)"),
    CoastalRegion49(49,"Nakhon Si Thammarat (Gulf of Thailand)"),
    CoastalRegion50(50,"Muara (Northwest Coasts of Kalimanta)"),
    CoastalRegion51(51,"Bintulu (Northwest Coasts of Kalimanta)"),
    CoastalRegion52(52,"Laoag (West Coasts of Philippines)"),
    CoastalRegion53(53,"San Fernando (West Coasts of Philippines)"),
    CoastalRegion54(54,"Manila (West Coasts of Philippines)"),
    CoastalRegion55(55,"Iloilo (Sulu Sea)"),
    CoastalRegion56(56,"Puerto Princesa (Sulu Sea)"),
    CoastalRegion57(57,"Sandakan (Sulu Sea)"),
    CoastalRegion58(58,"Kuara Terengganu (East Coasts of Malay Peninsula)"),
    CoastalRegion59(59,"Singapore (East Coasts of Malay Peninsula)"),
    CoastalRegion60(60,"Zamboanga (Celebes Sea)"),
    CoastalRegion61(61,"Tarakan (Celebes Sea)"),
    CoastalRegion62(62,"Manado (Celebes Sea)"),
    CoastalRegion63(63,"Tolitoli (Celebes Sea)"),
    CoastalRegion64(64,"Singkawang (Natuna Sea)"),
    CoastalRegion65(65,"Pangkalpinang (Natuna Sea)"),
    CoastalRegion66(66,"Ostrov-Karaginskiy (East Coasts of Kamchatka Peninsula)"),
    CoastalRegion67(67,"Nikolskoya (East Coasts of Kamchatka Peninsula)"),
    CoastalRegion68(68,"Tongyeong (South Coasts of Korean Peninsula)"),
    CoastalRegion69(69,"Heuksando (South Coasts of Korean Peninsula)"),
    CoastalRegion70(70,"Cheju-Island (South Coasts of Korean Peninsula)"),
    CoastalRegion71(71,"Chilung (Taiwan)"),
    CoastalRegion72(72,"Taitung (Taiwan)"),
    CoastalRegion73(73,"Kaohsiung (Taiwan)"),
    CoastalRegion74(74,"Homel (Taiwan)"),
    CoastalRegion75(75,"Geme (North Coasts of Irian Jaya)"),
    CoastalRegion76(76,"Ulamona (North Coasts of Papua New Guinea)"),
    CoastalRegion77(77,"Ghatere (North Coasts of Solomon Islands)"),
    CoastalRegion78(78,"Amun (Solomon Sea)"),
    CoastalRegion79(79,"Falamae (Solomon Sea)"),
    CoastalRegion80(80,"Misima (Solomon Sea)"),
    CoastalRegion81(81,"Alotau (Solomon Sea)"),
    CoastalRegion82(82,"Lae (Solomon Sea)"),
    CoastalRegion83(83,"Port-Moresby (Coral Sea)"),
    CoastalRegion84(84,"Shanghai (Coasts of East China Sea)"),
    CoastalRegion85(85,"Zhoushan (Coasts of East China Sea)"),
    CoastalRegion86(86,"Wenzhou (Coasts of East China Sea)"),
    CoastalRegion87(87,"Quanzhou (Coasts of South China Sea)"),
    CoastalRegion88(88,"Hainan-Island (Coasts of South China Sea)"),
    CoastalRegion89(89,"Pattaya (Gulf of Thailand)"),
    CoastalRegion90(90,"Kota-Kinabalu (Northwest Coasts of Kalimanta)"),
    CoastalRegion91(91,"Lahad-Datu (Sulu Sea)"),
    CoastalRegion92(92,"Cotabuto-City (Celebes Sea)"),
    CoastalRegion93(93,"Maimbung (Celebes Sea)"),
    CoastalRegion94(94,"Tabukan-Tengah (Celebes Sea)"),
    CoastalRegion95(95,"Kepulauan-Riau (Natuna Sea)"),
    CoastalRegion96(96,"Kuala-Indragiri (Natuna Sea)"),
    CoastalRegion99(99,"Unknown"),
    CoastalRegion100(100,"Other region");

    private Integer id;
    private String coastalRegion;

    public Integer getId(){
        return id;
    }

    public String getCoastalRegion() {
        return coastalRegion;
    }

    CoastalRegion(Integer id, String coastalRegion){
        this.id = id;
        this.coastalRegion = coastalRegion;
    }

    public static CoastalRegion getById(int id){
        return Arrays.stream(CoastalRegion.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
