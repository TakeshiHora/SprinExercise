package jp.ac.aiit.pbl.disaster.earthquakeearlywarning;

import jp.ac.aiit.pbl.disaster.DisasterParser;
import jp.ac.aiit.pbl.disaster.prefix.PrefixParser;
import jp.ac.aiit.pbl.disaster.hypocenter.SeismicEpicenter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This class parses binary number of Earthquake Early Warning signal.
 * It has definitions of every parameter's binary length on a binary line that is signal transmitted by QZSS.
 * This class provides parse method for Earthquake Early Warning signal.
 */

public class EarthquakeEarlyWarningParser implements DisasterParser {


    public EarthquakeEarlyWarningParser() {}

    public enum Format {
        NOTIFICATION_ON_DISASTER_PREVENTION_INFORMATION1(53, 62),
        NOTIFICATION_ON_DISASTER_PREVENTION_INFORMATION2(62, 71),
        NOTIFICATION_ON_DISASTER_PREVENTION_INFORMATION3(71, 80),
        OCCURRENCE_TIME_OF_EARTHQUAKE(80, 96),
        DEPTH_OF_SEISMIC_EPICENTER(96, 105),
        MAGNITUDE(105, 112),
        SEISMIC_EPICENTER(112, 122),
        SEISMIC_INTENSITY_LOWER_LIMIT(122, 126),
        SEISMIC_INTENSITY_UPPER_LIMIT(126, 130),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION1(130, 131),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION2(131, 132),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION3(132, 133),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION4(133, 134),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION5(134, 135),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION6(135, 136),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION7(136, 137),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION8(137, 138),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION9(138, 139),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION10(139, 140),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION11(140, 141),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION12(141, 142),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION13(142, 143),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION14(143, 144),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION15(144, 145),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION16(145, 146),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION17(146, 147),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION18(147, 148),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION19(148, 149),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION20(149, 150),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION21(150, 151),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION22(151, 152),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION23(152, 153),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION24(153, 154),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION25(154, 155),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION26(155, 156),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION27(156, 157),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION28(157, 158),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION29(158, 159),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION30(159, 160),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION31(160, 161),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION32(161, 162),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION33(162, 163),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION34(163, 164),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION35(164, 165),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION36(165, 166),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION37(166, 167),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION38(167, 168),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION39(168, 169),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION40(169, 170),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION41(170, 171),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION42(171, 172),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION43(172, 173),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION44(173, 174),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION45(174, 175),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION46(175, 176),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION47(176, 177),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION48(177, 178),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION49(178, 179),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION50(179, 180),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION51(180, 181),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION52(181, 182),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION53(182, 183),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION54(183, 184),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION55(184, 185),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION56(185, 186),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION57(186, 187),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION58(187, 188),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION59(188, 189),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION60(189, 190),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION61(190, 191),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION62(191, 192),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION63(192, 193),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION64(193, 194),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION65(194, 195),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION66(195, 196),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION67(196, 197),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION68(197, 198),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION69(198, 199),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION70(199, 200),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION71(200, 201),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION72(201, 202),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION73(202, 203),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION74(203, 204),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION75(204, 205),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION76(205, 206),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION77(206, 207),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION78(207, 208),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION79(208, 209),
        FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION80(209, 210);

        private final int beginIndex;
        private final int endIndex;
        Format(final int beginIndex, final int endIndex) {
            this.beginIndex = beginIndex;
            this.endIndex = endIndex;
        }

        public int beginIndex() { return beginIndex; }

        public int endIndex() { return endIndex; }

        public String getBitValue(String qzqms) {
            return qzqms.substring(beginIndex, endIndex);
        }
    }


    public EarthquakeEarlyWarning parse(String qzqms) {
        EarthquakeEarlyWarning earthquakeEarlyWarning = new EarthquakeEarlyWarning();

        PrefixParser prefixParser = new PrefixParser();
        earthquakeEarlyWarning.setPrefix(prefixParser.parse(qzqms));

        ArrayList<Notification> notifications = new ArrayList<>();
        notifications.add(Notification.getNotificationContent(
                Integer.parseInt(Format.NOTIFICATION_ON_DISASTER_PREVENTION_INFORMATION1.getBitValue(qzqms), 2))
        );
        notifications.add(Notification.getNotificationContent(
                Integer.parseInt(Format.NOTIFICATION_ON_DISASTER_PREVENTION_INFORMATION2.getBitValue(qzqms), 2))
        );
        notifications.add(Notification.getNotificationContent(
                Integer.parseInt(Format.NOTIFICATION_ON_DISASTER_PREVENTION_INFORMATION3.getBitValue(qzqms), 2))
        );
        earthquakeEarlyWarning.setNotifications(notifications);

        earthquakeEarlyWarning.setOccurrenceTimeOfEarthquake(
                toLocalDateTime(Format.OCCURRENCE_TIME_OF_EARTHQUAKE.getBitValue(qzqms))
        );

        earthquakeEarlyWarning.setDepthOfSeismicEpicenter(
                Integer.parseInt(Format.DEPTH_OF_SEISMIC_EPICENTER.getBitValue(qzqms),2)
        );

        String magnitude = String.valueOf(Integer.parseInt(Format.MAGNITUDE.getBitValue(qzqms),2));
        earthquakeEarlyWarning.setMagnitude(
                Double.parseDouble(
                magnitude.substring(0, magnitude.length() - 1)
                        + "."
                        + magnitude.substring(magnitude.length() - 1))
        );

        earthquakeEarlyWarning.setSeismicEpicenter(SeismicEpicenter.getRegionName(
                Integer.parseInt(Format.SEISMIC_EPICENTER.getBitValue(qzqms), 2))
        );

        earthquakeEarlyWarning.setSeismicIntensityLowerLimit(SeismicIntensityLowerLimit.getById(
                Integer.parseInt(Format.SEISMIC_INTENSITY_LOWER_LIMIT.getBitValue(qzqms), 2))
        );

        earthquakeEarlyWarning.setSeismicIntensityUpperLimit(SeismicIntensityUpperLimit.getById(
                Integer.parseInt(Format.SEISMIC_INTENSITY_UPPER_LIMIT.getBitValue(qzqms), 2))
        );

        List<ForecastRegionEarthquakeEarlyWarning> forecastRegionEarthquakeEarlyWarnings = new ArrayList<>();
        int index = Format.FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION1.beginIndex();
        int IndexOfEndRegion = Format.FORECAST_REGION_EARTHQUAKE_EARLY_WARNING_REGION80.endIndex();
        for(int bitNumber = 0; index < IndexOfEndRegion; bitNumber++ ) {
            if(qzqms.substring(index, index + 1).equals("1")) {
                forecastRegionEarthquakeEarlyWarnings.add(
                        ForecastRegionEarthquakeEarlyWarning.get(bitNumber + 1)
                );
            }
            index += 1;
        }
        earthquakeEarlyWarning.setForecastRegionEarthquakeEarlyWarning(forecastRegionEarthquakeEarlyWarnings);

        return earthquakeEarlyWarning;
    }


    private LocalDateTime toLocalDateTime(String message){
        int day = Integer.parseInt(message.substring(0,5),2);
        int hour = Integer.parseInt(message.substring(5,10),2);
        int minute  = Integer.parseInt(message.substring(10,16),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
}
