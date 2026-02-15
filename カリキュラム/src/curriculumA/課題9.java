package curriculumA;

public class 課題9 {

	public static void main(String[] args) {
		//氏名
		 String a="鈴木　一郎";
		//年齢 
		 int b=24;		 
		 b=b*2;
		//身長
		  float c=168.5f; 
		  c=c*2;
		//体重  
		  float d=64.2f;
		  d=d*2;
		//好きなたべもの  
		  String e="オムライス";
		//BMI		 
		  double f=d/((c/100.0)*(c/100.0));
		  
		 System.out.println("初めまして"+a+"です");
		 System.out.println("年齢は"+b+"歳です");
		 System.out.println("身長は"+c+"cmです");
		 System.out.println("体重は"+d+"kgです");
		 System.out.println("好きな食べ物は"+e+"です");		
		 System.out.println("BMIは"+f+"です");
	
}

}