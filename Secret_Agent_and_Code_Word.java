import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(" ");
        int vc1 = 0;
        int vc2 = 0;
        int auth = 0;
        for(int i=0;i<arr.length;i++)
        {
            auth = 0;
            for(int j=0;j<arr.length;j++)
            {
                for(int k=0;k<arr[i].length();k++)
                {
                    for(int l=0; l<arr[j].length();l++)
                    {
                        if(arr[i]!=arr[j] && arr[i].charAt(k)==arr[j].charAt(l))
                        {
                            vc1=0;
                            vc2=0;
                            for(int m=0;m<arr[i].length();m++)
                            {
                                if(arr[i].charAt(m)=='A'||arr[i].charAt(m)=='E'||arr[i].charAt(m)=='I'||arr[i].charAt(m)=='O'||arr[i].charAt(m)=='U')
                                {
                                    vc1++;
                                }
                                if(arr[j].charAt(m)=='A'||arr[j].charAt(m)=='E'||arr[j].charAt(m)=='I'||arr[j].charAt(m)=='O'||arr[j].charAt(m)=='U')
                                {
                                    vc2++;
                                }
                            }
                            if(vc1==vc2)
                            {
                                auth++;
                            }
                        }
                        
                    }
                }
            }
            if(auth == arr[i].length())
            {
                System.out.println(arr[i]);
            }
        }
    }
}