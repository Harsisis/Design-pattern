package fr.ddd.DomainDrivenDev.entity.TP4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.ddd.DomainDrivenDev.entity.TP4_Command.Command;
import fr.ddd.DomainDrivenDev.entity.TP4_Command.Handler;
import fr.ddd.DomainDrivenDev.entity.TP4_Command.HelloCommand;
import fr.ddd.DomainDrivenDev.entity.TP4_Command.HelloCommandWithHandler;
import fr.ddd.DomainDrivenDev.entity.TP4_Command.HelloCustomCommand;
import fr.ddd.DomainDrivenDev.entity.TP4_Command.Human;
import fr.ddd.DomainDrivenDev.entity.TP4_Command.Robot;

@SpringBootTest
public class TestRobot {
	
	private static Robot robot;
	
	private static Handler humanHandler;

	@BeforeAll
	public static void initData() {
		robot = new Robot("Edmond");
		humanHandler = new Human("Walter");
	}
	
	@Test
	public void test_helloCommand() {
		Command command = new HelloCommand(robot);
		assertEquals("Edmond says : \"Hello World !\"", command.exec());
	}
	
	@Test
	public void test_helloCustomCommand() {
		Command command = new HelloCustomCommand(robot);
		assertEquals("**** says : \"Hello World !\"", command.exec());
	}
	
	@Test
	public void test_helloCommandWithHandler() {
		Command command = new HelloCommandWithHandler(robot, humanHandler);
		assertEquals("I'm Walter : Edmond says : \"Hello World !\"", command.exec());
	}
}
