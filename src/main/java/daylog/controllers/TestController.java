package daylog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Date: 16.09.2017
 * Time: 19:30
 *
 * @author Viktor Aleksandrov
 */
@Controller
public class TestController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "TEST!!!";
    }

    @RequestMapping("test2")
    public String test2() {
        return "test.jsp";
    }

    /*
    TODO
    Что можно сделать:
    -- Добавить Базу данных
    -- Создать структуру таблиц
    -- объект
        -- дата отчета
        -- (дата сохранения)
        -- чем гордишься (текст)
        -- чему благодарен (текст)
        -- главные события (текст)(опционально) необязательно пока



    -- рассылка писем по расписанию с напоминанием
    и можно сделать что в ответе сразу все написать, не заходя в приложение
    --
     */

    /*
    23.09.2017


    */

}
