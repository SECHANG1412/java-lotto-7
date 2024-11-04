package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoMachine {
    private static final int LOTTO_NUMBER_COUNT = 6;
    private static final int LOTTO_NUMBER_MAX = 45;

    public List<Lotto> generateLottoTickets(int count) {
        List<Lotto> tickets = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            tickets.add(new Lotto(generateUniqueNumbers()));
        }
        return tickets;
    }

    private List<Integer> generateUniqueNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        while (numbers.size() < LOTTO_NUMBER_COUNT) {
            int number = random.nextInt(LOTTO_NUMBER_MAX) + 1;
            numbers.add(number);
        }
        return new ArrayList<>(numbers);
    }
}

