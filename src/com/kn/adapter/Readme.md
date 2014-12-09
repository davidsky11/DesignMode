适配器模式：
    将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。

特点：
    实现了客户希望的接口
    持有被适配的对象
    不改动客户代码和被适配对象

优点：
    在拓展类的功能上比继承拥有更大的灵活性
    装饰器类可以方便自由的组合

缺点：
    使用更少的类，但是构造复杂

经典案例：
    jdk中io使用Decorator对各种流进行封装
    如：
    BufferedInputStream bi = new BufferedInputStream(new FileInputStream("1.txt"));
    BufferedInputStream对FileInputStream进行装饰；InputStream是他们共有的接口。

    BufferedReader br = new BufferedReader(new FileReader("1.txt"));
    BufferedReader对FileReader进行装饰, Reader是他们共同的接口.

适用场景：
    1. 多个类只区别在表现行为不同，可以使用Strategy模式，在运行时动态选择具体要执行的行为
    2. 需要在不同情况下使用不同的策略(算法)