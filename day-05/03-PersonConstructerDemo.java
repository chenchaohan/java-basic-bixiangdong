/**
����һ�����ͻ������֮��Ӧ�Ĺ��캯��

���캯�������ã��������ڸ����캯����ʼ��

���캯����Сϸ�ڣ�
    ��һ������û�ж��幹�캯��ʱ����ôϵͳ��Ĭ�ϸ��������һ���ղ����Ĺ��캯��
    ���������Զ����˹��캯����Ĭ�ϵĹ��캯����û����

���캯����һ�㺯����д�����в�ͬ

��������Ҳ�в�ͬ��
    ���캯�����ڶ���һ���������С��������ʼ����
    ��һ�㷽���Ƕ�����ò�ִ�У��Ǹ�������Ӷ���߱��Ĺ��ܡ�

    һ�������������캯��ֻ����һ��
    ��һ�㷽�����Ա��ö�����ö�Ρ�

ʲôʱ���幹�캯���أ�
����������ʱ����������ھ;߱�һЩ���Ժ���Ϊ����ô����Щ���ݶ����ڹ��캯���С�
 */
class PersonConstructer {
    // PersonConstructer() {};
    /*PersonConstructer() {
        System.out.println("person run!");
    }*/
    private String name;
    private int age;

    {
        System.out.println("������������...");
    }
    PersonConstructer(int age) {
        this.age = age;
    }
    /**
    �������飺
        ���ã���������г�ʼ��
            ����һ������ִ�У����������ڹ��캯��ִ�С�
        �͹��캯��������
            ���������Ǹ����ж������ͳһ��ʼ��
            �����캯���Ǹ���Ӧ�Ķ����ʼ��
        ���������ж�����ǲ�ͬ�����Եĳ�ʼ�����ݡ�
     */

    /*PersonConstructer() {
        System.out.println("A:name=" + name + "age=" + age);
        // System.out.println("cry");
        cry();
    }*/
    // PersonConstructer(String n) {
    /*PersonConstructer(String name) {
        this.name = name;
        System.out.println("B:name=" + name + "age=" + age);
        // System.out.println("cry");
        cry();
    }*/
    /*PersonConstructer(String n, int a) {
        name = n;
        age = a;
        System.out.println("C:name=" + name + "age=" + age);
        // System.out.println("cry");
        cry();
    }*/

    public void cry() {
        System.out.println("cry......");
    }

    /*public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }*/

    public boolean compare(PersonConstructer p) {
        return this.age == p.age;
    }
}
class PersonConstructerDemo {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // PersonConstructer p = new PersonConstructer();
        /*PersonConstructer p1 = new PersonConstructer("lisi");
        PersonConstructer p2 = new PersonConstructer("wangwu", 18);
        p.cry();*/
        // p.setName("zhaoliu");
        // System.out.println(p.getName());

        PersonConstructer p1 = new PersonConstructer(18);
        PersonConstructer p2 = new PersonConstructer(20);
        boolean b = p1.compare(p2);
        System.out.println(b);
    }
}