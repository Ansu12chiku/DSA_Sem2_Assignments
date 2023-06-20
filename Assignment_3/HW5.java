package Assignment_3;
public class HW5 
{
    public static void towerOfHanoi(int n, char first_rod,char last_rod, char middle_rod)
    {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, first_rod, middle_rod, last_rod);
        System.out.println("Move disk " + n + " from rod "+ first_rod + " to rod "+ last_rod);
        towerOfHanoi(n - 1, middle_rod, last_rod, first_rod);
    }
    public static void main(String args[])
    {
        int N = 4;
        towerOfHanoi(N, 'A', 'C','B');
    }
}