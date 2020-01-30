package com.example.controller;
import java.util.List;
import javax.xml.ws.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Hist_ventas;
import com.example.service.Hist_ventasService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping

public class Hist_ventasController {
	@Autowired
	Hist_ventasService service;

@PostMapping("/hist_ventas")
public Hist_ventas altaHist_ventas(@RequestBody Hist_ventas h){
   return service.altaHist_ventas(h); 
}

}

