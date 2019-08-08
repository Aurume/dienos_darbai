package kaviney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Optional;

import kaviney.Uzsakymai;
import kaviney.UzsakymaiRepository;

import kaviney.Patiekalai;
import kaviney.PatiekalaiRepository;

import kavinex.*;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/restfull") // This means URL's start with /demo (after Application path)
public class MainController {
	//@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	//private UzsakymaiRepository uzsakymaiRepository;
	//@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data	
	//private PatiekalaiRepository patiekalaiRepository;
	
	
	// cia pridedu produktus
	private ProduktaiRepository produktaiRepository;
	
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String naujasProduktas (@RequestParam String pav
			, @RequestParam String mat_vnt 
			, @RequestParam Integer mat_kiek
			, @RequestParam Double kaina
			, @RequestParam Double kiekis_sand			
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		Produktai n = new Produktai();
		n.setPav(pav);
		n.setMat_vnt(mat_vnt);
		n.setMatkiek(mat_kiek);
		n.setKaina(kaina);
		n.setKiekis_sand(kiekis_sand);
		n.setBusena( "uzsakytas" );                //nezinau ar reikia busenos?
		System.out.println (n.toString() );
		produktaiRepository.save(n);
		return "Saved";
	}
	
	
	
	@GetMapping(path="/changestatus") // Map ONLY GET Requests
	public @ResponseBody String keistiBusena  @RequestParam String busena
			, @RequestParam Integer id 
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		Optional <Produktai> found = produktaiRepository.findById( id );
		
		// variantas trynimuiui
		// uzsakymaiRepository.deleteById(id);
		
		String res = "Not done";
		
		if ( found.isPresent() ) {
			
			   Produktai n = found.get();
			   n.setId(id);
			   n.setBusena(busena);
			   //java.util.Date dt = new java.util.Date();
			   //java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			   //String currentTime = sdf.format(dt);			   
			   //n.setLaikas_pateikimo(currentTime);
			   produktaiRepository.save(n);	
			   res = "Saved";
			}		
		return res;
	}	
	
	@GetMapping(path="/all")
		public @ResponseBody Iterable<Produktai> getAllProduktai() {
		// This returns a JSON or XML with the users
		 return produktaiRepository.findAll();
	}
	
	
	
	///@GetMapping(path="/lst-patiekalai")
	///public @ResponseBody Iterable<Patiekalai> getAllPatiekalai() {
		// This returns a JSON or XML with the users
		//return patiekalaiRepository.findAll();
	//}	
	
	//@GetMapping(path="/all")
	//public @ResponseBody Iterable<Uzsakymai> getAllUzsakymai() {
		// This returns a JSON or XML with the users
		//return uzsakymaiRepository.findAll();
	//}
	
	
	/*
	 
	 @GetMapping(path="/allx")
	public @ResponseBody Iterable<Patiekalas> getAllUzsakymaix() {
		// This returns a JSON or XML with the users
		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		
		UzsakymaiSpring uzsakymai = (UzsakymaiSpring) context.getBean( "uzsakymai" );
		uzsakymai.nuskaityti(); // tik ivedimas
		uzsakymai.ruostiPatiekalus();
		uzsakymai.patiekti();
		;		
		
		return uzsakymai.isnesiotix();
	}
	 */
}