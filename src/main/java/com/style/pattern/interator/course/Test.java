package com.style.pattern.interator.course;

/**
 * @author leon
 * @date 2021-04-15 22:52:19
 */
public class Test {
	public static void main(String[] args) {
		Course course = new Course("Java");
		Course bigData = new Course("大数据");
		Course ai = new Course("AI");

		Container<Course> container = new ContainerImpl<>();
		container.add(course);
		container.add(bigData);
		container.add(ai);
		Iterator<Course> iterator = container.iterator();
		System.out.println("=========打印=========");
		print(iterator);
		System.out.println("========删除后打印=======");
		container.remove(ai);
		print(container.iterator());


		//优点
		//1. 多态迭代 为不同的聚合结构提供统一的遍历接口 即一个迭代接口可以访问不同聚集对象
		//2. 简化集合对象接口 迭代器模式讲集合本身该提供的集合迭代接口抽取到迭代器接口中 使集合无须关心元素迭代行为
		//3. 元素迭代多样化 每个集合对象可以提供一个或者多个迭代器 是得同种元素聚合结构 可以有不同迭代行为
		//4. 解耦迭代和耦合 迭代器模式封装了迭代算法 迭代算法的变化 不会影响要集合
		//缺点
		// 对于简答的遍历  使用迭代器方式较为繁琐



	}

	private static void print(Iterator<Course> iterator) {
		while (iterator.hasNext()) {
			Course next = iterator.next();
			System.out.println("<" + next.getName() + ">");
		}
	}
}
