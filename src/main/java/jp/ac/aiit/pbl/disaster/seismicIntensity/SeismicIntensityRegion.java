package jp.ac.aiit.pbl.disaster.seismicIntensity;

/**
 * This class aggregates Prefecture and SeismicIntensity information when an earthquake occurs.
 */

public class SeismicIntensityRegion {
    private Warning warning;
    private Prefecture prefecture;
    
    SeismicIntensityRegion(int warnigCode, int prefectureCode){
        this.warning = Warning.getSeismicIntensity(warnigCode);
        this.prefecture = Prefecture.getRegionName(prefectureCode);
    }
    
    public Prefecture getPrefecture() {
        return prefecture;
    }
    
    public Warning getWarning() {
        return warning;
    }
    
    @Override
    public String toString() {
        return "SeismicIntensityRegion{" +
                "warning=" + warning +
                ", prefecture=" + prefecture +
                '}';
    }
}
