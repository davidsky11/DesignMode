装饰器模式：
    创建一个新类为某一个类动态添加新功能或增强原有的功能

特点：
    装饰器持有一个被装饰的对象
    装饰器和被装饰的对象有相同的接口
    装饰器给被装饰的对象添加额外的功能或增强已有的功能
    保持接口，增强功能。表现形式上最大的特定是装饰器使用并且实现一个父类。

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