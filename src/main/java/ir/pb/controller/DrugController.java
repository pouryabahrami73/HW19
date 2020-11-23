package ir.pb.controller;


import ir.pb.domains.Drug;
import ir.pb.repositories.DrugRepository;
import ir.pb.services.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
//@RequestMapping("/drug")
public class DrugController {

    /*@Autowired
    private DrugService drugService;*/
    @Autowired
    private DrugRepository repository;

    //    @RequestMapping(value = "/post", method = {RequestMethod.POST})
    /*@PostMapping("/post")
    public String post(Drug drug){
        System.out.println(drug.getName());
        return "hospital-system";
    }*/
    @PostMapping("/save")
//    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    public ModelAndView handle(@ModelAttribute(name = "drug") Drug drug, BindingResult bindingResult) {
        Map<String, Object> map = new HashMap<>();
        map.put("drug", drug);
        System.out.println(drug.getName());
        repository.save(drug);
        return new ModelAndView("drugs", map);
    }


}
