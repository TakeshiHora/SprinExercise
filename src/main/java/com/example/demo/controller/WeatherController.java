package com.example.demo.controller;

import com.example.demo.domain.service.WeatherService;
import jp.ac.aiit.pbl.QZQSMDecoder;
import jp.ac.aiit.pbl.disaster.weather.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WeatherController {
    
    @Autowired
    private WeatherService weatherService;
    
    @PostMapping("/api/weather")
    public String weatherPost(String str, Model model){
        QZQSMDecoder qzqsmDecoder = new QZQSMDecoder();
        qzqsmDecoder.decode("53ADF36C518002D3885A7D8B5DEA82085041AA08AD42EE2864500013B6DE7A0");
        
        Integer id = Integer.parseInt(str);
        Weather weather = weatherService.findOne(id);
        
        model.addAttribute("id", weather.getWarningState());
        
        return "weatherResponse";
        
    }
    
}

