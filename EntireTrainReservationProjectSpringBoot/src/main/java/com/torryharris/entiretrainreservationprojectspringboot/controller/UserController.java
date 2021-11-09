package com.torryharris.entiretrainreservationprojectspringboot.controller;

import com.torryharris.entiretrainreservationprojectspringboot.model.Passenger;
import com.torryharris.entiretrainreservationprojectspringboot.model.Train;
import com.torryharris.entiretrainreservationprojectspringboot.model.User;
import com.torryharris.entiretrainreservationprojectspringboot.repository.PassengerRepository;
import com.torryharris.entiretrainreservationprojectspringboot.repository.TrainRepository;
import com.torryharris.entiretrainreservationprojectspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;
import java.util.TreeMap;

@Controller
public class UserController {
    @Autowired
    UserRepository repo;
    @Autowired
    TrainRepository repo1;
    @Autowired
    PassengerRepository repo2;
    @RequestMapping("register")
    public String register(){
        return "register.jsp";
    }
    @RequestMapping("registerdb")
    public String registerdb(User user){
        repo.save(user);
        return "login.jsp";
    }
    @RequestMapping("logindb")
    public String logindb(){
        return "index.jsp";
    }
    @RequestMapping("traindb")
    public ModelAndView traindb(@RequestParam int trainId){
        ModelAndView mv=new ModelAndView("train.jsp");
        Train train=repo1.findById(trainId).orElse(new Train());
        mv.addObject(train);
        return mv;
    }
//    @RequestMapping("passengerdb")
//    public String passengerdb(Passenger passenger){
//        repo2.save(passenger);
//        return "train.jsp";
//    }
    @RequestMapping("passengerdb")
    public ModelAndView passengerd(@RequestParam int trainId){
        ModelAndView mv=new ModelAndView("ticket.jsp");
        Train train=repo1.findById(trainId).orElse(new Train());
        mv.addObject(train);
        return mv;
    }
    @RequestMapping("ticketdb")
    public ModelAndView ticketdb(@RequestParam int id){
        ModelAndView mv=new ModelAndView("ticket.jsp");
        Passenger train=repo2.findById(id).orElse(new Passenger());
        mv.addObject(train);
        return mv;
    }
}
