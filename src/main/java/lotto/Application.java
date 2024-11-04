package lotto;

import java.util.Scanner;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("구입금액을 입력해 주세요.");
            int amount = Integer.parseInt(scanner.nextLine());
            if (amount % 1000 != 0) {
                throw new IllegalArgumentException("[ERROR] 구입 금액은 1,000원 단위여야 합니다.");
            }

            int ticketCount = amount / 1000;
            LottoMachine lottoMachine = new LottoMachine();
            List<Lotto> purchasedTickets = lottoMachine.generateLottoTickets(ticketCount);

            System.out.println(ticketCount + "개를 구매했습니다.");
            for (Lotto ticket : purchasedTickets) {
                System.out.println(ticket.getNumbers());
            }

            System.out.println("당첨 번호를 입력해 주세요.");
            String[] winningInput = scanner.nextLine().split(",");
            // 추가적인 당첨 번호 처리 로직 구현

            System.out.println("보너스 번호를 입력해 주세요.");
            int bonusNumber = Integer.parseInt(scanner.nextLine());
            // 추가적인 보너스 번호 처리 로직 구현

            // 당첨 결과 및 수익률 계산 로직 추가

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
