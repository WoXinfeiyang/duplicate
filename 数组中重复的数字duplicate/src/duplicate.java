import java.util.Scanner;

/*
 * �ļ����ƣ�����ָOffer���������Թپ������ͱ����(�����)��������51���������ظ�������
 * ʱ�䣺2016-8-20 11:40
 * ˵����1����Ŀ����һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�
 * ������ĳЩ�������ظ��ģ�����֪�����ļ��������ظ��ˣ�Ҳ��֪��ÿ�������ظ��˼��Σ���
 * �ҳ�����������һ���ظ������֡�
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
