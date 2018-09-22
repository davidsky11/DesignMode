策略模式：
    定义了一系列的算法，并将每一个算法封装起来，而且使它们还可以相互替换。策略模式使算法独立于使用它的客户而独立变化。

特点：
    Context(应用实例或client，即使用Strategy的类)持有一个Strategy实例；
    Context可以动态灵活的设置Strategy的具体实例，即切换算法；
    Context通过调用Strategy的方法来执行具体的行为。

优点：
    把容易发生变化的算法独立出来，易于扩展

缺点：
    类增多了，使系统难度加大

经典案例：
    1. 操作系统提供多种电源管理方案，每个方案都是一种策略，操作系统可以灵活切换电源管理方案。
    2. jdk中的类File有一个方法：public String[] list(FilenameFilter filter)，列出当前目录下的所有文件，FilenameFilter就是一个策略接口,使用者可以根据自己的需求自由变换文件筛选策略
    3. jdk中工具类Arrays有一个可以对集合排序的方法: public static <T> void sort(T[] a, Comparator<? super T> c),传入一个数组和一个比较器, 这个比较器就是一个策略.(此案有争议,有人认为是template method模式)

适用场景：
    1. 多个类只区别在表现行为不同，可以使用Strategy模式，在运行时动态选择具体要执行的行为
    2. 需要在不同情况下使用不同的策略(算法)