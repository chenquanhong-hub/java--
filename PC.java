package project;

public class PC {

	CPU cpu;

	HardDisk HD;
	void setCPU(CPU c) {

		cpu = c;

	}

	/*
	 * ��setHardDisk(HardDisk h)����������h��ֵ��ֵ��HD
	 */
	void setHardDisk(HardDisk h) {

		HD = h;

	}

	/*
	 * show()������ʾcpu���ٶȺ�Ӳ�̵�����
	 */
	void show() {

		System.out.println("CPU�ٶ�:" + cpu.getSpeed());

		System.out.print("Ӳ������:" + HD.getAmount());

	}

}

