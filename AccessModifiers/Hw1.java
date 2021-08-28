package AccessModifiers;

class Main4
{
	int length;
	int width;
	int height;
	void inputData(int length, int width, int heigth)
	{
		this.length=length;
		this.width=width;
		this.height=heigth;
	}
	float whitewashArea()
	{
		float area=width*height+width*height+length*height+length*height+width*length;
		return area;
	}
	int whitewashingcost()
	{
		float area=2*(width*height)+2*(length*height)+width*length;
		int cost=(int)area*80;
		return cost;
	}
	int floringcost(int type)
	{
		int area=length*width;
		if(type==1)
			return area*200;
		else if(type==2)
			return area*100;
		else
			return -1;
		
   }
}
public  class Hw1 {
	
	public static void main(String[] args) {
		
		Main4 m4=new Main4();
		m4.inputData(10, 10, 10);
		System.out.println(m4.whitewashingcost());
		System.out.println(m4.floringcost(2));
		
	}
  }

