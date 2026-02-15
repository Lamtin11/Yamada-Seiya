package curriculumA;

public class 課題7 {


	public static void main(String[] args) {
		//氏名
		 String a="山田　太郎";
		//年齢 
		 int b=18;		 
		//身長
		  double c=170.5;		 
		//体重  
		  double d=62.2;
		//好きなたべもの  
		  String e="寿司";
		//BMI		 
		  double f=c/Math.pow(b/100,2);
		  double g=Math.floor(f*10)/10.0;
		  
		 System.out.println("初めまして"+a+"です");
		 System.out.println("年齢は"+b+"歳です");
		 System.out.println("身長は"+c+"cmです");
		 System.out.println("体重は"+d+"kgです");
		 System.out.println("好きな食べ物は"+e+"です");		
		 System.out.println("BMIは"+g+"です");
		 
	}
	
}