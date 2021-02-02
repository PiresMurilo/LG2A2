package o_financeiro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {
		Dados cliente1 = new Dados("Murilo Pires", LocalDateTime.now(), new BigDecimal("871.15"), new BigDecimal("216.00"), true, new BigDecimal("15.99"), new BigDecimal("160.50"), new BigDecimal("230.00"));
		Dados cliente2 = new Dados("Beyoncé Knowles", LocalDateTime.now(), new BigDecimal("1742.80"), new BigDecimal("422.00"), false, new BigDecimal("125.00"), new BigDecimal("377.35"), new BigDecimal("1500.00"));
		Dados cliente3 = new Dados("Jeff Bezos", LocalDateTime.now(), new BigDecimal("1971.95"), new BigDecimal("563.25"), true, new BigDecimal("785.90"), new BigDecimal("900.00"), new BigDecimal("2500.00"));
		
		cliente1.Extrato();
		cliente2.Extrato();
		cliente3.Extrato();

	}

}
