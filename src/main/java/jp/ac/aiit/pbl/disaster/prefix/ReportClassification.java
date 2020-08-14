package jp.ac.aiit.pbl.disaster.prefix;


import java.util.Arrays;

public enum ReportClassification {

    MaximumPriority(1,"Maximum priority"),
    Priority(2,"Priority"),
    Regular(3,"Regular"),
    TrainingTest(7,"Training/Test");

    private Integer id;

    private String reportClassificationName;

    public Integer getId(){
        return id;
    }

    private ReportClassification(int id, String name){
        this.id = id;
        this.reportClassificationName = name;
    }

    public static ReportClassification getById(int id){
        return Arrays.stream(ReportClassification.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
