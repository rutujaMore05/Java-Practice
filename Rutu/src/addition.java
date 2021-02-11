import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class addition {

	public static void main(String[] args) 
	{
		/*
		 * int[]a= {20,30,50,80,90} System.out.println(a[]);
		 */

		Emp e=new Emp(1,"suyash");
		Emp e1=new Emp(2,"Suyash");
		
		List<Emp> l1=new ArrayList<>();
		l1.add(e);
		l1.add(e1);
		
		HashMap<Integer, String> hs=(HashMap<Integer, String>) l1.stream().collect(Collectors.toMap(Emp:: getId, Emp :: getName));
		System.out.println(hs);
	}

}

class Emp{
	Integer id;
	String name;
	Emp(Integer id,String name){
		this.id=id;
		this.name=name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}