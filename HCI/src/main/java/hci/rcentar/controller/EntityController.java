package hci.rcentar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hci.rcentar.domain.Predmet;
import hci.rcentar.domain.Raspored;
import hci.rcentar.domain.Smer;
import hci.rcentar.domain.Softver;
import hci.rcentar.domain.Ucionica;
import hci.rcentar.service.PredmetService;
import hci.rcentar.service.RasporedService;
import hci.rcentar.service.SmerService;
import hci.rcentar.service.SoftverService;
import hci.rcentar.service.UcionicaService;
@RestController	
public class EntityController {
	@Autowired
	RasporedService rasporedService;
	@Autowired
	PredmetService predmetService;
	@Autowired
	SmerService smerService;
	@Autowired
	UcionicaService ucionicaService;
	@Autowired
	SoftverService softverService;
	
	@RequestMapping(
			value = "/api/predmeti",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Predmet>> getPredmets(){
		return new ResponseEntity<List<Predmet>>(predmetService.getPredmets(), HttpStatus.OK);
	}
	@RequestMapping(
			value = "/api/smerovi",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Smer>> getSmerovi(){
		return new ResponseEntity<List<Smer>>(smerService.getSmers(), HttpStatus.OK);
	}
	@RequestMapping(
			value = "/api/ucionice",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ucionica>> getUcionice(){
		return new ResponseEntity<List<Ucionica>>(ucionicaService.getUcionice(), HttpStatus.OK);
	}
	@RequestMapping(value = "/api/ucionice/{oznaka}",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<Ucionica> getUcionica(@PathVariable("oznaka") String oznaka){
			Ucionica ucionica = ucionicaService.getUcionica(oznaka);
			return new ResponseEntity<Ucionica>(ucionica, HttpStatus.OK);
	}
	@RequestMapping(
			value = "/api/softveri",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Softver>> getSoftveri(){
		return new ResponseEntity<List<Softver>>(softverService.getSoftvers(), HttpStatus.OK);
	}
	@RequestMapping(
			value = "/api/raspored",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Raspored> saveRaspored(@RequestBody Raspored raspored){
		System.out.println("Broj kartica : " + raspored.getKartice().size());
		Raspored savedRaspored = rasporedService.SaveRaspored(raspored);
		return new ResponseEntity<Raspored>(savedRaspored, HttpStatus.OK);
	}
	@RequestMapping(
			value = "/api/raspored",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Raspored>> getRaspored(){
		List<Raspored> rasporedi = rasporedService.getAll();
		if (rasporedi.isEmpty()){
			return null;
		}else{
			return new ResponseEntity<List<Raspored>>(rasporedi, HttpStatus.OK);
		}
	}
	@RequestMapping(
			value = "/api/raspored/{naziv}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Raspored> getRaspored(@PathVariable("naziv") String naziv){
		Raspored rasp = rasporedService.getRaspored(naziv);
		return new ResponseEntity<Raspored>(rasp, HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/api/dodajSmer",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public ResponseEntity<Smer> dodajSmer(@RequestBody Smer smer){


		Smer s = smerService.dodajSmer(smer);
		if(s != null) {
			return new ResponseEntity<Smer>(s, HttpStatus.OK);
		}
		return new ResponseEntity<Smer>(s, HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(
			value = "/api/dodajPredmet",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public ResponseEntity<Predmet> dodajPredmet(@RequestBody Predmet predmet){

		predmet.setSmer(smerService.findByOznaka(predmet.getSmer().getOznaka()));

		Predmet p = predmetService.dodajPredmet(predmet);
		
		if(p != null) {
			return new ResponseEntity<Predmet>(p, HttpStatus.OK);
		}
		return new ResponseEntity<Predmet>(p, HttpStatus.BAD_REQUEST);
	}
	@RequestMapping(value = "api/predmeti/{oznaka}",
					method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deletePredmet(@PathVariable("oznaka") String oznaka){
		Boolean success = predmetService.deletePredmet( oznaka);
		if (success){
			return new ResponseEntity<Boolean>(success,HttpStatus.OK);
		}
		return new ResponseEntity<Boolean>(success, HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(
			value = "/api/dodajSoftver",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public ResponseEntity<Softver> dodajSoftver(@RequestBody Softver softver){
		
		Softver s = softverService.dodajSoftver(softver);
		
		if(s != null) {
			return new ResponseEntity<Softver>(s, HttpStatus.OK);
		}
		return new ResponseEntity<Softver>(s, HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(
			value = "/api/dodajUcionicu",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public ResponseEntity<Ucionica> dodajUcionicu(@RequestBody Ucionica ucionica){

		
		Ucionica u = ucionicaService.dodajUcionicu(ucionica);
		
		if(u != null) {
			return new ResponseEntity<Ucionica>(u, HttpStatus.OK);
		}
		return new ResponseEntity<Ucionica>(u, HttpStatus.BAD_REQUEST);
	}
}
