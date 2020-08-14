package jp.ac.aiit.pbl.disaster.ashfall;

/**
 * Enum for WarningType of AshFall.
 */
public enum WarningType {

    AshFallForecastPreliminary(1,"Ash Fall Forecast (Preliminary)"),
    AshFallForecastDetailed(2,"Ash Fall Forecast (Detailed)");

    private int id;

    private String warningType;

    private WarningType(int id, String warningType){
        this.id  = id;
        this.warningType = warningType;
    }

    public int getId(){
        return id;
    }

    public String getMessageTypeString(){
        return warningType;
    }

    public static WarningType getById(int id){
        if(id == 1){
            return AshFallForecastPreliminary;
        }else{
            return AshFallForecastDetailed;
        }
    }
}
