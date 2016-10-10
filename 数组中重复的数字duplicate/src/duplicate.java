import java.util.Scanner;

/*
 * 文件名称：《剑指Offer：名企面试官精讲典型编程题(纪念版)》面试题51：数组中重复的数字
 * 时间：2016-8-20 11:40
 * 说明：1、题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有哪几个数字重复了，也不知道每个数字重复了几次，请
 * 找出数组中任意一个重复的数字。
 * */

public class duplicate {
	public static int FindDuplicate(int []numbers){
		if(numbers==null||numbers.length<=0){
			return -1;
		}
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]<0||numbers[i]>numbers.length-1){
				return -1;
			}
		}
		
		for(int i=0;i<numbers.length;i++){
			
			while(numbers[i]!=i){
				
				int m=numbers[i];
				
				if(m==numbers[m]){
					return m;
				}
				
				numbers[i]=numbers[m];
				numbers[m]=m;				
			}
		}
		return -1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int []a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=in.nextInt();
			}
			System.out.println(FindDuplicate(a));
		}
	}

}
