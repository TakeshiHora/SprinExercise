package jp.ac.aiit.pbl.disaster.prefix;

import jp.ac.aiit.pbl.disaster.DisasterCategory;

import java.time.LocalDateTime;

public class Prefix {
    private Preamble preamble;

    private MessageType messageType;

    private ReportClassification reportClassification;

    private DisasterCategory disasterCategory;

    private LocalDateTime reportTime;

    private InformationType informationType;

    private String spare1;

    public Preamble getPreamble() {
        return preamble;
    }

    public void setPreamble(Preamble preamble) {
        this.preamble = preamble;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public ReportClassification getReportClassification() {
        return reportClassification;
    }

    public void setReportClassification(ReportClassification reportClassification) {
        this.reportClassification = reportClassification;
    }

    public DisasterCategory getDisasterCategory() {
        return disasterCategory;
    }

    public LocalDateTime getReportTime() {
        return reportTime;
    }

    public void setReportTime(LocalDateTime reportTime) {
        this.reportTime = reportTime;
    }

    public void setDisasterCategory(DisasterCategory disasterCategory) {
        this.disasterCategory = disasterCategory;
    }

    public InformationType getInformationType() {
        return informationType;
    }

    public void setInformationType(InformationType informationType) {
        this.informationType = informationType;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    @Override
    public String toString() {
        return "Prefix{" +
                "preamble='" + preamble + '\'' +
                ", messageType=" + messageType +
                ", reportClassification=" + reportClassification +
                ", disasterCategory=" + disasterCategory +
                ", reportTime=" + reportTime +
                ", informationType=" + informationType +
                ", spare1='" + spare1 + '\'' +
                '}';
    }
}
