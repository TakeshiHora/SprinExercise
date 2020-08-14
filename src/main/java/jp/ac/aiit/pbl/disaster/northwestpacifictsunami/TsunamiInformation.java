package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import java.time.LocalDateTime;

/**
 * Class for TsunamiInformation.
 *
 * Holds the next information.
 * Expected Tsunami Arrival Time, Tsunami Height and Coastal Region.
 */
public class TsunamiInformation {
    private LocalDateTime expectedTsunamiArrivalTime;
    private TsunamiHeight tsunamiHeight;
    private CoastalRegion coastalRegion;

    public TsunamiInformation(LocalDateTime expectedTsunamiArrivalTime, TsunamiHeight tsunamiHeight, CoastalRegion coastalRegion) {
        this.expectedTsunamiArrivalTime = expectedTsunamiArrivalTime;
        this.tsunamiHeight = tsunamiHeight;
        this.coastalRegion = coastalRegion;
    }

    public LocalDateTime getExpectedTsunamiArrivalTime() {
        return expectedTsunamiArrivalTime;
    }

    public void setExpectedTsunamiArrivalTime(LocalDateTime expectedTsunamiArrivalTime) {
        this.expectedTsunamiArrivalTime = expectedTsunamiArrivalTime;
    }

    public TsunamiHeight getTsunamiHeight() {
        return tsunamiHeight;
    }

    public void setTsunamiHeight(TsunamiHeight tsunamiHeight) {
        this.tsunamiHeight = tsunamiHeight;
    }

    public CoastalRegion getCoastalRegion() {
        return coastalRegion;
    }

    public void setCoastalRegion(CoastalRegion coastalRegion) {
        this.coastalRegion = coastalRegion;
    }

    @Override
    public String toString() {
        return "TsunamiInformation{" +
                "expectedTsunamiArrivalTime=" + expectedTsunamiArrivalTime +
                ", tsunamiHeight=" + tsunamiHeight +
                ", coastalRegion=" + coastalRegion +
                '}';
    }
}
