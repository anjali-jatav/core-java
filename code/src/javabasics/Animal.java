package javabasics;

/**class Anjali{
	
};**/
 class Animal {
   String herbivores;
   String carnivores;
   String omnivores;
   int dogLegs;

  void king() {
	 System.out.println("lion");   
   }
   public static void main(String[] args) {
//	   Anjali b=new Anjali();
	   Animal a = new Animal();
	   System.out.println(a.herbivores);
       a.herbivores= "rabbit";
       System.out.println(a.herbivores);
       System.out.println(a.carnivores);
       System.out.println(a.omnivores);
       System.out.println(a.dogLegs);
       a.king();
       a.dogLegs=4;
       System.out.println(a.dogLegs);
       }
   }