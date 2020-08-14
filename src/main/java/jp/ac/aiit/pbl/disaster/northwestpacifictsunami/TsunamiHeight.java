package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import java.util.Arrays;

/**
 * Enumeration for TsunamiHeight.
 */
public enum TsunamiHeight {
    TsunamiHeight1(1,"0.3[m]-1[m]"),
    TsunamiHeight2(2,"1[m]-3[m]"),
    TsunamiHeight3(3,"3[m]-5[m]"),
    TsunamiHeight4(4,"5[m]-10[m]"),
    TsunamiHeight508(508,"10[m]超"),
    TsunamiHeight509(509,"巨大"),
    TsunamiHeight510(510,"高い"),
    TsunamiHeight511(511,"不明");

    private Integer id;
    private String tsunamiHeight;

    public Integer getId(){
        return id;
    }

    TsunamiHeight(Integer id, String tsunamiHeight){
        this.id = id;
        this.tsunamiHeight = tsunamiHeight;
    }

    public static TsunamiHeight getById(int id){
        return Arrays.stream(TsunamiHeight.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
