import java.util.*;
class Menupro
{
public static void main(String[] args)
{
HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("a: Add Key x and Value y");
System.out.println("b: Print value of x ");
System.out.println("c: Length of hashmap ");
System.out.println("d: Remove vlaue of Key ");
System.out.println("e: Exit ");
do
{
 System.out.println("Enter your chooice ");
 String ch=sc.next();
 switch(ch)
 {
  case "a":
  System.out.println("Enter key x ");
  int x=sc.nextInt();
  System.out.println("Enter value y ");
  int y=sc.nextInt();
  hm.put(x,y);
  break;
  case "b":
  System.out.println("Enter key x ");
  int x1=sc.nextInt();
  if(hm.containsKey(x1))
  {
   System.out.println("value of key x is "+hm.get(x1));
  }
  else
  System.out.println("-1");
  break;
  case "c":
  System.out.println("Size of Hashmap is ");
  System.out.println(hm.size());
  break;
  case "d":
  System.out.println("Enter key to Remove value ");
  int x2=sc.nextInt();
  System.out.println(hm.remove(x2));
  break;
  case "e": 
  System.exit(0);
  break;
  default:
  System.out.println("INVALID");
  break;   
 }
}
while(true);
}
}

Output________________________________________________________________________________________
a: Add Key x and Value y
b: Print value of x
c: Length of hashmap
d: Remove vlaue of Key
e: Exit
Enter your chooice
a
Enter key x
1
Enter value y
2
Enter your chooice
a
Enter key x
66
Enter value y
3
Enter your chooice
b
Enter key x
66
value of key x is 3
Enter your chooice
d
Enter key to Remove value
1
Enter your chooice
c
Size of Hashmap is 
1
Enter your chooice
e
