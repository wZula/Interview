/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bodybuilding.interview.project.web.controller;

/**
 *
 * @author zula.weynishet
 */
import com.bodybuilding.interview.project.service.NavigationService;
import com.bodybuilding.interview.project.web.json.Navigation;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NavigationController {
@Resource
private NavigationService navigationservice;

    public void setNavigationservice(NavigationService navigationservice) {
        this.navigationservice = navigationservice;
    }


 @RequestMapping("/")
 @ResponseBody
 public Navigation navigation(HttpServletRequest request, HttpSession session) {
   Navigation nav=null;
    try {
        //returns the view name
     nav= navigationservice.getnavigation();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(NavigationController.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(NavigationController.class.getName()).log(Level.SEVERE, null, ex);
    }
    session.setAttribute("navigation", nav);
     return nav;
 }

 @RequestMapping("/{ID}")
 @ResponseBody
 public Navigation navigationToId(HttpServletRequest request, HttpSession session) {
   Navigation nav=null;
    try {
        //returns the view name
     nav= navigationservice.getnavigation();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(NavigationController.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(NavigationController.class.getName()).log(Level.SEVERE, null, ex);
    }
     return nav;
 }
}