package project;

public class Test {

	/*
	 * ����CPU����cpu
	 */
	public static void main(String args[]) {

		CPU cpu = new CPU();
		/*
		 * speed����Ϊ2200
		 */
		cpu.setSpeed(1800);
		/*
		 * ����HardDisk����disk
		 */
		HardDisk disk = new HardDisk();
		/*
		 * amout����Ϊ200
		 */
		disk.setAmount(150);
		/*
		 * ����PC����pc
		 */
		PC pc = new PC();
		/*
		 * ����setCPU(CPU c)����������ʱʵ����cpu
		 */
		pc.setCPU(cpu);
		/*
		 * ����setHardDisk(HardDisk h)����������ʱʵ����disk
		 */
		pc.setHardDisk(disk);

		pc.show();

	}

}
