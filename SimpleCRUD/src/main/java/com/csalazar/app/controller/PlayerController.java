package com.csalazar.app.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.csalazar.app.SimpleCrudApplication;
import com.csalazar.app.dao.InterPlayerRepo;
import com.csalazar.app.model.Player;

@Controller
public class PlayerController {
	
	private static final Logger logger = (Logger) LogManager.getLogger(PlayerController.class);
	
	@Autowired
	InterPlayerRepo playerRepo;
	
	
	//Object pt;
	
	@RequestMapping("/")
    public String home() {
		logger.info("Iniciando Controller");
        return "index";
    }
	
	@RequestMapping("/addScore")
    public String addScore(Player player) {
		logger.info("Se AGREGO 1 elemento a la base de datos: " + player.toString());
		playerRepo.save(player);
        return "index";
    }
	@RequestMapping("/viewAllScore")
    public String viewAllScore() {
		logger.info("Se hizo CONSULTA a la base de datos: " + playerRepo.findAll());
		//ModelAndView mv = new ModelAndView("Listado");
		//mv.addObject(player);
        return "index";
    }
	@RequestMapping("/viewPlayer")
    public ModelAndView viewPlayer(@RequestParam int id) {
		
		ModelAndView mv = new ModelAndView("Listado");
		logger.info("Se hizo CONSULTA a la base de datos: " + playerRepo.findBynickname("alucard"));
		Player player = playerRepo.findById((int)id).orElse(new Player());
		mv.addObject(player);
        return mv;
    }
	@RequestMapping("/updateScore")
	public String updateScore(Player player) {
		logger.info("Se hizo UPDATE a la base de datos: "+ playerRepo.save(player));
        return "index";
    }
	@RequestMapping("/deleteScore")
    public String deleteScore(int id) {
		logger.info("se ELIMINO un elemento de la base de datos:  "+ playerRepo.findById((int)id).orElse(new Player()));
		playerRepo.deleteById((int) id);
        return "index";
    }
}
