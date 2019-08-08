package kaviney;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Produktai {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String pav;

    private String mat_vnt;
    
    private Integer mat_kiek;    
    
    private Double kaina;
    
    private Double kiekis_sand;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPav() {
		return pav;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}

	public String mat_vnt() {
		return mat_vnt;
	}

	public void setMat_vnt(String mat_vnt) {
		this.mat_vnt = mat_vnt;
	}

	public Integer mat_kiek() {
		return mat_kiek;
	}

	public void setMatkiek(Integer mat_kiek) {
		this.mat_kiek = mat_kiek;
	}	
	
	public Double getKaina() {
		return kaina;
	}

	public void setKaina(Double kaina) {
		this.kaina = kaina;
	}
	
	public Double getKiekis_sand() {
		return kiekis_sand;
	}

	public void setKiekis_sand(Double kiekis_sand) {
		this.kiekis_sand = kiekis_sand;
	}
	
public String toString() {
		
	    return 
	    		id 
	    		+ " / " + pav

				+ " / " + mat_vnt	    		
				
				+ " / " + mat_kiek	    		
				
				//+ " / " + busena	    		
				
				+ " / " + kiekis_sand	    		
				
				+ " / " +  kaina
			; 		
	}
	
	
	
}
