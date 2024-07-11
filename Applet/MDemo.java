class MD
{
   public static void main(int arg)
   {
       System.out.println("ONE");
    }
   public static void main(String arg)
   {
        System.out.println("TWO");
   }
   public static void main(float arg)
   {
        System.out.println("THREE");
   }
   public static void main(String arg[])
   {
        System.out.println("Four");
        main(4.5f);
        main(4);
   }
}