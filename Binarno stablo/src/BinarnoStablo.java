
public class BinarnoStablo {

	public CvorStabla koren;
	
	public BinarnoStablo(){
		koren=null;
	}
	
	
	public int pronadji(CvorStabla k, CvorStabla p){
		if(k==null){
			return 0;
		}
		
		if(k==p){
			return k.getPodatak();
		}
		
		if(p.getPodatak()<k.getPodatak()){
			pronadji(k.getLevo(), p);
		}
		
		
			if(p.getPodatak()>k.getPodatak())
				pronadji(k.getDesno(),p);
			
		
		
		return 0;
	}
}
