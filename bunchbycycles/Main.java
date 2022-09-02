package bunchbycycles;

public class Main {
    
public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    for (int x : cycles){
        if(x < 400)
            counts.lowCount++;
        else if( x>400 && x<=919)
            counts.mediumCount++;
        else
            counts.highCount++;
    }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    System.out.print("Low batteries are :");
    System.out.println(counts.lowCount);
    System.out.print("Medium batteries are :");
    System.out.println(counts.mediumCount);
    System.out.print("High batteries are :");
    System.out.println(counts.highCount);
    System.out.println("Done counting :)\n");
  }

}
 class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  }
