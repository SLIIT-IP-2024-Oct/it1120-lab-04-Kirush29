import java.util.Scanner;
public class IT24104106Lab4Q2{
 public static void main(String[]args){
  Scanner input=new Scanner(System.in);
   System.out.print("Please enter exam marks (out of 100):");
   double exammarks=input.nextDouble();
   if (exammarks<0 || exammarks>100)
   {
     System.out.println("invalid input for exam marks.Terminating program.");
                  return;
   }
     System.out.print("Please enter lab submissions marks(out of 100):");
     double labmarks=input.nextDouble();
   if (labmarks<0 || labmarks>100)
   {
     System.out.println("invalid input for lab submission marks.Terminating program.");
                   return;
   }
    System.out.print("Please enter the percentage given for the exam:");
     double examPercentage=input.nextDouble();
     System.out.print("Please enter the percentage given for labsubmission:");
     double labPercentage=input.nextDouble();
    if (examPercentage + labPercentage!=100)
   {
      System.out.println("The percenteges must add up to 100.Terminating program.");
                   return;
   }
     double finalMark=(exammarks*examPercentage/100) + (labmarks*labPercentage/100);
     System.out.println();
     System.out.println("Final Exam Mark is:"+finalMark);
 }
}
   
  
   