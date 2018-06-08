
	function proveraFormeZaPredmet(forma){
		var naziv = forma.nazivPredmeta.value;
		var oznaka = forma.oznakaPredmeta.value;
		var velicinaGrupe = forma.velicinaGrupe.value;
		var brojTermina = forma.brojTermina.value;
		var duzinaTermina = forma.duzinaTermina.value;
		var os = forma.os.value;
		
		if(naziv == "" || oznaka =="" || velicinaGrupe =="" || brojTermina=="" || duzinaTermina=="" || os==""){
			alert("Niste popunili sva polja!");
			return false;
		}
		
		return true;
	}
