package jp.ac.aiit.pbl.disaster.prefix;


import java.util.Arrays;

public enum Preamble {

    PatternA("01010011"),
    PatternB("10011010"),
    PatternC("11000110");

    private String id;

    public String getId(){
        return id;
    }

    private Preamble(String id){
        this.id = id;
    }

    public static Preamble getById(String id){
        return Arrays.stream(Preamble.values())
                  .filter(data -> data.getId().equals(id))
                  .findFirst()
                  .orElse(null);
    }

}
