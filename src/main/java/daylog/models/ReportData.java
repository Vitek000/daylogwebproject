package daylog.models;

import java.util.Date;
import java.util.List;

/**
 * Date: 16.09.2017
 * Time: 22:01
 *
 * @author Viktor Aleksandrov
 */
public class ReportData {

    public static class ReportDataBuilder {
        ReportData reportData;
        public ReportDataBuilder() {
            this.reportData = new ReportData();
        }

        public ReportDataBuilder id(Integer id) {
            reportData.id = id;
            return this;
        }

        public ReportDataBuilder reportDate(Date reportDate) {
            reportData.reportDate = reportDate;
            return this;
        }

        public ReportDataBuilder whatProud(String whatProud) {
            reportData.whatProud = whatProud;
            return this;
        }

        public ReportDataBuilder whatThanked(String whatThanked) {
            reportData.whatThanked = whatThanked;
            return this;
        }

        public ReportDataBuilder mainEvents(String mainEvents) {
            reportData.mainEvents = mainEvents;
            return this;
        }

        public ReportDataBuilder tags(List<String> tags) {
            reportData.tags = tags;
            return this;
        }

        public ReportData build() {
            return reportData;
        }

    }

    Integer id;
    Date reportDate;
    String whatProud;
    String whatThanked;
    String mainEvents;
    List<String> tags;


    /// GETTERS / SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getWhatProud() {
        return whatProud;
    }

    public void setWhatProud(String whatProud) {
        this.whatProud = whatProud;
    }

    public String getWhatThanked() {
        return whatThanked;
    }

    public void setWhatThanked(String whatThanked) {
        this.whatThanked = whatThanked;
    }

    public String getMainEvents() {
        return mainEvents;
    }

    public void setMainEvents(String mainEvents) {
        this.mainEvents = mainEvents;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
