import java.util.*;
import java.io.*;

public class Blind{

	public static int CountInversions(int[] arr){
            int count = 0;

        for(int i = 0; i < (arr.length); i++){
        	for(int k = i; k < arr.length; k++) {
                if(arr[k] < arr[i]) {
                count++;
                }
            }


        }

        return count;
	}

	public static void main(String []args){
		
		}
}
