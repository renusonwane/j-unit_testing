public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public static  int addition(int a, int b) {
        return a+b;
    }
    public static  int substracition(int a, int b) {
        return a-b;
    }
    public static  int multiplcation(int a, int b) {
        return a*b;
    }
    public static  int divition(int a, int b) {
        return a/b;
    }
     public static double square(double a){
        return Math.sqrt(a);
     }
     @Test
     public void testAdd(){
     assertEquals(message:"Addition",expected:100, addition(30, 067));
     }
     @Test
     public void testSub(){
     assertEquals(message:"substracition", expected:100, substracition(309, 067));
     }
     @Test
     public void testmulti(){
     assertEquals(message:"multiplcation", e)x;
     }
     @Test
     public void testDiv(){
        
     }  
    //   @Test
    //  public void testDiv(){
    //  assertEquals(message:"Divition", expected:100,  Divition(40,04))
    //  }    
}
