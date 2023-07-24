package com.example.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ashraf on 22-Jul-23
 * @project gateway
 */
@RestController
public class GateWayController {
   @GetMapping
   public String getHello(){
      return "hello";
   }
}
