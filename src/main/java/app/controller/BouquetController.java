package app.controller;

import app.entity.Bouquet;
import app.service.BouquetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@Controller
public class BouquetController {

    @RequestMapping("/getAllBouquets")
    public ModelAndView home() {
        BouquetService bouquetService = new BouquetService();
        List<Bouquet> bouquetList = bouquetService.getAll();
        ModelAndView mav = new ModelAndView("/views/bouquetList");
        mav.addObject("bouquetList", bouquetList);
        return mav;
    }


//    @RequestMapping(value = "/getAllBouquets", method = RequestMethod.GET)
//    public String getBouquets(Model model) {
//        BouquetService bouquetService = new BouquetService();
//        List<Bouquet> bouquetList = bouquetService.getAll();
//        model.addAttribute("bouquetList", bouquetList);
//        return "views/bouquetList";
//    }


    @GetMapping("/bouquet")
    public String createBouquet() {
        System.out.println(231);
        return "/views/bouquet";
    }


    @PostMapping("/bouquet")
    public String addBouquet(@ModelAttribute("bouquet") Bouquet bouquet) {
        BouquetService bouquetService = new BouquetService();
        try {
            bouquetService.add(bouquet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(2345678);
        return "redirect:/";
    }

    @GetMapping("/deleteBouquet")
    public String deleteBouquet(@RequestParam("BouquetIdParam") int bouquetId) {
        BouquetService bouquetService = new BouquetService();
        bouquetService.deleteById(bouquetId);
        return "redirect:/views/bouquetList ";
    }



    @GetMapping(value = "/bouquetUpdate")
    public ModelAndView getPersonEaditPage(@RequestParam("BouquetIdParam") String bouquetId,
                                          @RequestParam("BouquetNameParam") String bouquetName,
                                          @RequestParam("BouquetPriceParam") String bouquetPrice)
                                           {
        ModelAndView mav = new ModelAndView();

        mav.addObject("bouquetOldId", bouquetId);
        mav.addObject("bouquetOldName", bouquetName);
        mav.addObject("bouquetOldPrice", bouquetPrice);


        mav.setViewName("/views/bouquetUpdate");

        return mav;
    }

    @PostMapping(value = "/bouquetUpdate")
    public String saveEditPerson(@RequestParam("bouquetId") String bouquetUpdateId1,
                                 @RequestParam("bouquetName") String bouquetUpdateName,
                                 @RequestParam("bouquetPrice") String bouquetUpdatePrice1) {
        int bouquetUpdatedId = Integer.parseInt(bouquetUpdateId1);
        int bouquetUpdatePrice = Integer.parseInt(bouquetUpdatePrice1);
        Bouquet bouquet= new Bouquet(bouquetUpdatedId,bouquetUpdateName,bouquetUpdatePrice);
        BouquetService bouquetService= new BouquetService();
        bouquetService.update(bouquet);
        return "redirect:/";
    }

}












