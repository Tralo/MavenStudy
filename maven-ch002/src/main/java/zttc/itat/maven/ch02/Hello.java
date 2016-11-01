
package zttc.itat.maven.ch02;
import zttc.itat.maven.HelloMaven;

public class Hello{
	public String say(String name){
		HelloMaven hm = new HelloMaven();
		return hm.sayHello(name);
	}
}
