
public class desktop implements hadware,software {

	@Override
	public void softwareresource() {
		// TODO Auto-generated method stub
	System.out.println("software deveploment");	
	}

	@Override
	public void hardwareresource() {
		// TODO Auto-generated method stub
		System.out.println("hardare : ram, rom, processer");		
	}
private void desktopmodel1() {
	// TODO Auto-generated method stub
System.out.println("HP 5th gen");
}
public static void main(String[] args) {
	desktop d =new desktop();
          
d.desktopmodel1();
d.softwareresource();
d.hardwareresource();
System.out.println("gopi");



}
}
