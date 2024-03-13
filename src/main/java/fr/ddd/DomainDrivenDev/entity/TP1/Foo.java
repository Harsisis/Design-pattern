package fr.ddd.DomainDrivenDev.entity.TP1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Foo {
		private String name;
		private Printable printer;
		
		public String hello() {
			return this.printer.print(name);
		}
		
}
