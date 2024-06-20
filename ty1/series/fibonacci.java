/* create a package named series having three different classes to print series:
  i) fibonacci series
  ii) cube of numbers
 iii) square of numbers
write a java program to genrate 'n' terms of the above series */
package series;
public class fibonacci
{
  public void print(int n)
{
  int f=0,s=1,t,i;
System.out.println("Series="+f+"\t"+s);
  for(i=1;i<n;i++)
  {
     t=f+s;
     System.out.print("\t"+t);
     f=s;
     s=t;
  }
}
}