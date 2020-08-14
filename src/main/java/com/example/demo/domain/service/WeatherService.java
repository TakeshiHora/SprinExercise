package com.example.demo.domain.service;

import com.example.demo.domain.repository.WeatherRepository;
import jp.ac.aiit.pbl.disaster.weather.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class WeatherService {
    
    @Autowired
    private WeatherRepository weatherRepository;
    
    public Weather findOne(int id){
        Map<String, Object> map = weatherRepository.findOne(id);
    
        int employeeId = (Integer) map.get("employee_id");
        String employeeName = (String) map.get("employee_name");
        int age = (Integer) map.get("age");
    
        Weather weather = new Weather();
        weather.setEmployeeId(employeeId);
        weather.setEmployeeName(employeeName);
        weather.setAge(age);
        
        return weather;
    }
}
