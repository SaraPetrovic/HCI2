package hci.rcentar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hci.rcentar.domain.Predmet;
import hci.rcentar.domain.Smer;
import hci.rcentar.domain.Softver;
import hci.rcentar.domain.Ucionica;
import hci.rcentar.service.PredmetService;
import hci.rcentar.service.SmerService;
import hci.rcentar.service.SoftverService;
import hci.rcentar.service.UcionicaService;
@RestController	
public class EntityController {
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
	@RequestMapping(
			value = "/api/softveri",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Softver>> getSoftveri(){
		return new ResponseEntity<List<Softver>>(softverService.getSoftvers(), HttpStatus.OK);
	}
	
	
}
