/**
����һ�����Զ�������в����Ĺ����࣬�������ṩ�ˣ���ȡ��ֵ������ȹ��ܡ�
@author ����
@version V1.1
*/
public class ArrayTool {
    /**
    �ղ������캯����
    һ������Ĭ�ϻ���һ���ղ����Ĺ��캯����
    ����ղ����Ĺ��캯����Ȩ�޺���������һ�£�
    ���û�б� public �����Σ���ôĬ�ϵĹ��캯��Ҳ��public���η�
    �����û�б� public ���Σ���ôĬ�ϵĹ��캯����Ҳû��public���η���
    */
    private ArrayTool() {}
    /**
	��ȡһ�����������е����ֵ��
	@param arr ����һ��int���͵����顣
	@return �᷵��һ�������������ֵ��
	*/
    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    /**
	��ȡһ�����������е���Сֵ��
	@param arr ����һ��int���͵����顣
	@return �᷵��һ������������Сֵ��
	*/
    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }
    /**
	��int�������ѡ������
	@param arr ����һ��int���͵����顣
	*/
    public static void selectSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
    }
    /**
	��int�������ð������
	@param arr ����һ��int���͵����顣
	*/
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }
    /**
	��������Ԫ�ؽ���λ�õ��û���
	@param arr  ����һ��int���͵����顣
	@param a Ҫ�û���λ�� 
	@param b Ҫ�û���λ�� 
	*/
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    /**
	���ڴ�ӡ�����е�Ԫ�ء���ӡ��ʽ�ǣ�[elemet1, element2, ...]
	*/
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i] + "]");
        }
    }
}