/*
public static void main(String[] args) 

����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm���á�

�������Ķ��壺
public�������Ÿú�������Ȩ�������ġ�
static������������������ļ��ؾ��Ѿ������ˡ�
void��������û�о���ķ���ֵ��
main�����ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
��String[] arr��:�����Ĳ���������������һ�����飬�������е�Ԫ�����ַ������ַ������͵����顣

�������ǹ̶���ʽ�ģ�jvmʶ��

jvm�ڵ���������ʱ���������new String[0];
*/
/*class MainDemo {
    public static void main(int x) {
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        // String[] args = new String[]; String[] args = null;
        System.out.println(args);
        System.out.println(args.length);
        System.out.println(args[0]);
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        // ��������ֵ
        // java MainDemo haha hiahia heihhei hehe keke
        // java ��������� jvm ִ�� MainDemo.class ��������б� haha hiahia heihhei hehe keke
    }
}*/

class MainDemo {
    public static void main(String[] args) {
        String[] arr = {"haha", "hiahia", "heihhei", "hehe", "keke"};

        MainTest.main(arr);
    }
}

class MainTest {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}