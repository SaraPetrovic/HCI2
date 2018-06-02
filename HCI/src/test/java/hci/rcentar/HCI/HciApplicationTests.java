package hci.rcentar.HCI;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import hci.rcentar.domain.Predmet;
import hci.rcentar.service.PredmetService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HciApplicationTests {

	@Autowired
	PredmetService predmetService;

	@Test
	public void test1(){
		Predmet p1 = predmetService.getPredmet("HCI");
		assertThat(p1).isNotNull();
		assertThat(p1.getSmer().getOznaka().equals("siit")).isTrue();
		List<Predmet> predmeti = predmetService.searchPredmetsByNaziv("baze");
		for (Predmet p : predmeti){
			System.out.println(p.getOznaka());
		}

	}

}
