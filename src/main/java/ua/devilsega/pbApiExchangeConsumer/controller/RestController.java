package ua.devilsega.pbApiExchangeConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.devilsega.pbApiExchangeConsumer.service.CcyGetService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private CcyGetService ccyGetService;

    @RequestMapping(method= RequestMethod.GET, value="/api/get")
    public Object getCcu(){
        return ccyGetService.getCcu();
    }

    @RequestMapping(method= RequestMethod.GET, value="/api/get/history")
    public Object getCcuHistory(
            @RequestParam(value="date") String date
    ){
        return ccyGetService.getCcuHistory(date);
    }


}
