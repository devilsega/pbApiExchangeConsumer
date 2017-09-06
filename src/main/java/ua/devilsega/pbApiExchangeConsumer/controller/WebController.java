package ua.devilsega.pbApiExchangeConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.devilsega.pbApiExchangeConsumer.service.CcyGetService;

@Controller
public class WebController {
    @Autowired
    private CcyGetService ccyGetService;

    @RequestMapping("/")
    public Object exchangeRateCurrent(Model model){
        model.addAttribute("rates",ccyGetService.getCcu());
        return "ccu-current";
    }

    @RequestMapping("/history")
    public Object exchangeRateHistory(Model model, @RequestParam(value = "date") String date){
        model.addAttribute("rates",ccyGetService.getCcuHistory(date));
        return "ccu-history";
    }
}
