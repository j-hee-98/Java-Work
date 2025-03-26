package ex0226.exam;

/**
 * 모든 필드는 public static final
 * 모든 메서드는 public abstract
 * 
 * 단) jdk 8 version 이후 static, default, private 가능함
 */

public interface ElecFunction {

	void start();
	abstract void stop();
	abstract void display();
}
