package daylog.controllers;

import daylog.models.ReportData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;

/**
 * Date: 17.09.2017
 * Time: 12:31
 *
 * @author Viktor Aleksandrov
 */
@Controller
public class ReportDataInfoController {

    // TODO создание
    // TODO просмотр
    // TODO редактирование
    @RequestMapping(value = "/reportdata/info/{id}")
    public String showInfo(@PathVariable String id) {
        ReportData reportDataTest = new ReportData.ReportDataBuilder()
                .id(Integer.parseInt(id))
                .reportDate(new Date())
                .whatProud("What proud")
                .whatThanked("What thanked")
                .mainEvents("Main events")
                .tags(Arrays.asList("Diary"))
                .build();

        return "/views/report-data-info.jsp";
//        return new ModelAndView("report-data-info");

    }

    @RequestMapping(value = "/reportdata/save")
    public String save(@ModelAttribute ReportData reportDataForm) {

        ReportData reportData = new ReportData();
        reportData.setReportDate(reportDataForm.getReportDate());
        reportData.setWhatProud(reportDataForm.getWhatProud());
        reportData.setWhatThanked(reportDataForm.getWhatThanked());
        reportData.setMainEvents(reportDataForm.getMainEvents());
        reportData.setTags(reportDataForm.getTags());

        return "/reportdata/info/" + reportData.getId();
    }




}
