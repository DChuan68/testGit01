package demo;

public class Quick {
	
	 public static void quickSort(int arr[],int _left,int _right){
	        int left = _left;//0
	        int right = _right;//����
	        int temp = 0;
	        
	        if(left <= right){   //�������Ԫ�����������������
	            temp = arr[left];  //������ĵ�һ��Ԫ����Ϊ��׼Ԫ��
	            while(left != right){   //���������߽���ɨ�裬ֱ��left = right

	                while(right > left && arr[right] >= temp)  
	                     right --;        //��������ɨ�裬�ҵ���һ���Ȼ�׼Ԫ��С��Ԫ��
	                  arr[left] = arr[right];  //�ҵ�����Ԫ��arr[right]����arr[left]����

	                while(left < right && arr[left] <= temp)
	                     left ++;         //��������ɨ�裬�ҵ���һ���Ȼ�׼Ԫ�ش��Ԫ��
	                  arr[right] = arr[left];  //�ҵ�����Ԫ��arr[left]����arr[right]����

	            }
	            
	            arr[right] = temp;    //��׼Ԫ�ع�λ
	            quickSort(arr,_left,left-1);  //�Ի�׼Ԫ����ߵ�Ԫ�ؽ��еݹ�����
	            quickSort(arr, right+1,_right);  //�Ի�׼Ԫ���ұߵĽ��еݹ�����
	        }        
		 
	 
		 
	    }
	    public static void main(String[] args) {
	        int array[] = {66,13,51,76,81,26,57,69,23};
	        System.out.println("����֮ǰ��");
	        for(int element : array){
	            System.out.print(element+" ");
	        }
	        
	        quickSort(array,0,array.length-1);

	        System.out.println("\n����֮��");
	        for(int element : array){
	            System.out.print(element+" ");
	        }

	    }

	
}
