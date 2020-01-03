package cn.segema.learn.springboot1.vo;

public class StackTest {

	public int depth = 0;

	public void caculateTest(int i) {
		this.depth++;
		if (i == 0)
			return;
		else
			this.caculateTest(i);
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

}
