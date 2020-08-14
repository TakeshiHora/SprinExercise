package jp.ac.aiit.pbl.disaster.northwestpacifictsunami;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for NorthwestPacificTsunamiParser.
 * Return NorthwestPacificTsunami Class.
 */
public class NorthwestPacificTsunamiParser implements DisasterParser {


    public NorthwestPacificTsunami parse(String qzqms) {
        NorthwestPacificTsunami northwestPacificTsunami = new NorthwestPacificTsunami();
        PrefixParser prefixParser = new PrefixParser();

        northwestPacificTsunami.setPrefix(prefixParser.parse(qzqms));
        northwestPacificTsunami.setTsunamigenicPotential(TsunamigenicPotential.getById(Integer.parseInt(qzqms.substring(53, 53 + 3), 2)));
        northwestPacificTsunami.setTsunamiInformations(storeTsunamiInformationListValiddata(qzqms.substring(56, 196),prefixParser.parse(qzqms).getReportTime()));

        return northwestPacificTsunami;
    }

    private List<TsunamiInformation> storeTsunamiInformationListValiddata(String qzqmsPart, LocalDateTime reportTime) {
        List<TsunamiInformation> tsunamiInformationArrayList = new ArrayList<>();
        for (int bit = 0; bit < ((12 + 9 + 7) * 5); bit += (12 + 9 + 7)) {
            if (!qzqmsPart.startsWith("000000000000" + "000000000" + "0000000", bit)) {
                TsunamiInformation tsunamiInformation = new TsunamiInformation(
                        getTsunamiArrivalExpectedTime(
                                Integer.valueOf(qzqmsPart.substring(bit, bit + 1),2),
                                Integer.valueOf(qzqmsPart.substring(bit + 1, bit + 1 + 5),2),
                                Integer.valueOf(qzqmsPart.substring(bit + 1 + 5, bit + 1 + 5 + 6),2),
                                reportTime),
                        TsunamiHeight.getById(
                                Integer.parseInt(qzqmsPart.substring(bit + 12, bit + 12 + 9), 2)
                        ),
                        CoastalRegion.getById(
                                Integer.parseInt(qzqmsPart.substring(bit + 12 + 9, bit + 12 + 9 + 7), 2)
                        )
                );
                tsunamiInformationArrayList.add(tsunamiInformation);
            } else {
                break;
            }
        }
        return tsunamiInformationArrayList;
    }

    /**
     * Returns the Expected Tsunami Arrival Time.
     *
     * USE reportTime in Prefix CLASS.
     * if input message part "DAY" = 0 THEN same day arrival TSUNAMI. ELSE case of "1" is next day arrival.
     * if input "HOUR" = 31 THEN ariival hour is unkown. -> YEAR = 9999 and HOUR is ZERO CLEAR
     * if ipuut "MINUTE" == 63 THEN ariival minute is unkown. -> YEAR = 9999 and MINUTE is ZERO CLEAR
     * @param     day value is 0 or 1.
     * @param     hour value 0 to 23, or 31.
     * @param     minute value 0 to 59, or 63.
     * @param     reportTime the reportTime.
     * @return    LocalDateTime expectedTsunamiArrivalTime.
     */
    private LocalDateTime getTsunamiArrivalExpectedTime(int day, int hour, int minute, LocalDateTime reportTime) {
        LocalDateTime tmp;

        int year = reportTime.getYear();

        tmp = reportTime.plusDays(day);

        if (hour == 31) {
            year = 9999;
            hour = 0;
        }

        if (minute == 63) {
            year = 9999;
            minute = 0;
        }

        return LocalDateTime.of(
                year,
                tmp.getMonthValue(),
                tmp.getDayOfMonth(),
                hour,
                minute,
                0,
                0
        );
    }
}
