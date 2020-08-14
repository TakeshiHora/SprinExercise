package jp.ac.aiit.pbl.disaster.prefix;

import java.util.Arrays;

public enum InformationType {

    Issue(0,"発表"),
    Correction(1,"訂正"),
    Cancellation(2,"取消");

    private Integer id;

    private String informationTypeName;

    public Integer getId(){
        return id;
    }

    private InformationType (int id,String name){
        this.id = id;
        this.informationTypeName = name;
    }

    public static InformationType getById(int id){
        return Arrays.stream(InformationType.values())
                  .filter(data -> data.getId().equals(id))
                  .findFirst()
                  .orElse(null);
    }
}
