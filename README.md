# java--
javaExperiment
#实验内容
##（1）用类描述计算机中CPU的速度和硬盘的容量
##（2）有四个类，分别为PC、CPU、HardDisk、Test
##（3）Test是主类
#实验过程：
##先创建一个包，在里面创建四个类；
##PC类：public class PC {
	CPU cpu;
	HardDisk HD;
	/*
	 * 用setCPU(CPU c)方法将参数c的值赋值给cpu
	 */
	void setCPU(CPU c) {
		cpu = c;
	} 用setHardDisk(HardDisk h)方法将参数h的值赋值给HD
  ##CPU类；
  int speed;

	void setSpeed(int m) {
		/*
		 * 将参数m的值赋值给speed
		 */
		speed = m;

	}
  .....
  #实验结果：
  CPU的速度：1900
  硬盘的内容：150
  
 ##实验感想：
 通过本次实验是我对于Java创建新包和各类的操作更加熟练，也对于各类的定义和使用有了更深的了解，对于其中的赋值了解更直观，希望接下来的学习能更深的了解Java编程。
  
	

