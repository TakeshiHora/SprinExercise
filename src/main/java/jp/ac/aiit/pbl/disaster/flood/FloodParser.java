package jp.ac.aiit.pbl.disaster.flood;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;

import java.util.ArrayList;
import java.util.List;

public class FloodParser implements DisasterParser {
    public enum Format {
        WARNING_LEVEL_REGION1(53, 57),
        FLOOD_FORECAST_REGION_REGION1(57, 97),
        WARNING_LEVEL_REGION2(97, 101),
        FLOOD_FORECAST_REGION_REGION2(101, 141),
        WARNING_LEVEL_REGION3(141, 145),
        FLOOD_FORECAST_REGION_REGION3(145, 185);

        private final int beginIndex;
        private final int endIndex;

        Format(final int beginIndex, final int endIndex) {
            this.beginIndex = beginIndex;
            this.endIndex = endIndex;
        }

        public int beginIndex() {
            return beginIndex;
        }

        public int endIndex() {
            return endIndex;
        }

        public String getBitValue(String qzMessage) {
            return qzMessage.substring(beginIndex, endIndex);
        }
    }

    public Flood parse(String qzMessage) {
        Flood flood = new Flood();

        PrefixParser prefixParser = new PrefixParser();
        flood.setPrefix(prefixParser.parse(qzMessage));

        List<FloodWarningLevelAndForecastRegion> floodWarningLevelAndForecastRegions = new ArrayList<>();
        Format[] formats = Format.values();
        for(int enumOrdinal = 0; enumOrdinal < formats.length; enumOrdinal+=2) {
            int warningLevel = Integer.parseInt(formats[enumOrdinal].getBitValue(qzMessage), 2);
            Long floodForecastRegion = Long.parseLong(formats[enumOrdinal+1].getBitValue(qzMessage), 2);

            if(warningLevel == 0 && floodForecastRegion == 0) {
                break;
            }

            floodWarningLevelAndForecastRegions.add(
                    new FloodWarningLevelAndForecastRegion(warningLevel, floodForecastRegion)
            );
        }
        flood.setFloodWarningLevelAndForecastRegion(floodWarningLevelAndForecastRegions);

        return flood;
    }
}
