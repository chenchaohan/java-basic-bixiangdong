// private: ˽�У�Ȩ�����η��������������еĳ�Ա����Ա��������Ա������
// ˽��ֻ�ڱ�������Ч
// �� age ˽���Ժ��������⼴ʹ�����������Ҳ����ֱ�ӷ���
// ������Ӧ�������䣬����Ҫ��person�����ṩ��Ӧ���� age �ķ�ʽ
// ע��:˽�н����Ƿ�װ��һ�ֱ�����ʽ
// ֮���Զ����ṩ���ʷ�ʽ,������Ϊ�����ڷ��ʷ�ʽ������߼��жϵ����
// �Է��ʵ����ݽ����߼�����,��ߴ���Ľ�׳��.
class Person {
    private int age = 20;
    public void setAge(int agee) {
        if(agee > 0 && agee < 120) {
            age = agee;
            speak();
        } else {
            System.out.println("your age is out of control!");
        }
    }
    public int getAge() {
        return age;
    }
    private void speak() {
        System.out.println("age=" + age);
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        // p.age = -20;
        // p.speak();
        p.setAge(18);
    }
}