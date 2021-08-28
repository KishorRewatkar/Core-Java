package AccessModifiers;

class Main
{
	int instancern;
	String inam;
	int icontactno;
	int imarks;
	public void inputData(int rn, String nam,int Contactno, int marks)
	{
	  	instancern=rn;
	  	inam=nam;
	  	icontactno=Contactno;
	  	imarks=marks;
	}
	public void displayDa()	
	{
		System.out.println(instancern+" "+inam+" "+icontactno+" "+imarks);
	}
}
public class Cw1 {

	public static void main(String[] args) {
		Main ma=new Main();
		ma.displayDa();
		ma.inputData(10, "somu", 238782, 40);
		ma.displayDa(); 
	}
}
